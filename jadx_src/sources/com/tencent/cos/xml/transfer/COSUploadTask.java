package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import bolts.e;
import bolts.h;
import bolts.i;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.crypto.MultipartUploadCryptoContext;
import com.tencent.cos.xml.crypto.ObjectMetadata;
import com.tencent.cos.xml.crypto.ResettableInputStream;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsRequest;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.DeleteObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult;
import com.tencent.cos.xml.model.tag.ListMultipartUploads;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class COSUploadTask extends COSTransferTask {
    public static final String TAG = "QCloudUpload";
    private static final int UPLOAD_CONCURRENT = 2;
    private static ThreadPoolExecutor uploadTaskExecutor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE), new COSTransferTask.TaskThreadFactory("QCloudUpload-", 8));
    private boolean mForceSimpleUpload;
    private long mMaxPartSize;
    private PutObjectRequest mPutObjectRequest;
    private long multipartUploadThreshold;
    private long uploadLength;
    private BaseUploadTask uploadTask;
    private boolean verifyCRC64;

    public static abstract class BaseUploadTask implements Runnable {
        protected COSDirect cosDirect;
        protected TransferTaskMetrics mTransferMetrics;
        protected e mTransferTaskCts;
        protected PutObjectRequest putObjectRequest;
        protected String taskId;
        protected i<CosXmlResult> tcs = new i<>();
        protected long totalUploadSize;

        BaseUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, e eVar, long j10) {
            this.cosDirect = cOSDirect;
            this.putObjectRequest = putObjectRequest;
            this.mTransferTaskCts = eVar;
            this.totalUploadSize = j10;
        }

        public abstract void cancel();

        public h<CosXmlResult> getTask() {
            return this.tcs.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mTransferTaskCts.g()) {
                this.tcs.b();
                return;
            }
            try {
                this.tcs.d(upload(this.putObjectRequest));
            } catch (Exception e10) {
                this.tcs.c(e10);
            }
        }

        public void setTaskId(String str) {
            this.taskId = str;
        }

        protected abstract CosXmlResult upload(PutObjectRequest putObjectRequest) throws Exception;
    }

    public static class MultipartUploadTask extends BaseUploadTask {
        private String bucket;
        private volatile CompleteMultiUploadRequest completeMultiUploadRequest;
        private CosXmlSimpleService cosService;
        private volatile InitMultipartUploadRequest initMultipartUploadRequest;
        private String key;
        private volatile ListMultiUploadsRequest listMultiUploadsRequest;
        private volatile ListPartsRequest listPartsRequest;
        private MultipartUploadCryptoContext mCryptoContext;
        private long mMaxPartSize;
        private String mUploadId;
        private String region;
        private TreeSet<UploadPart> uploadParts;
        private BaseUploadPartsTask uploadPartsTask;
        private boolean verifyCRC64;

        public MultipartUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, e eVar, long j10) {
            super(cOSDirect, putObjectRequest, eVar, j10);
            this.mMaxPartSize = 1048576L;
            this.verifyCRC64 = true;
            this.putObjectRequest = putObjectRequest;
            this.tcs = new i<>();
            this.bucket = putObjectRequest.getBucket();
            this.region = putObjectRequest.getRegion();
            this.key = putObjectRequest.getCosPath();
            this.uploadParts = new TreeSet<>(new Comparator<UploadPart>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.1
                @Override // java.util.Comparator
                public int compare(UploadPart uploadPart, UploadPart uploadPart2) {
                    int i10 = uploadPart.number;
                    int i11 = uploadPart2.number;
                    if (i10 < i11) {
                        return -1;
                    }
                    return i10 == i11 ? 0 : 1;
                }
            });
            this.cosService = this.cosDirect.getCosService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void abort() {
            if (TextUtils.isEmpty(this.mUploadId)) {
                return;
            }
            AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.key, this.mUploadId);
            abortMultiUploadRequest.setRegion(this.region);
            this.cosService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.2
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                }
            });
        }

        private void assetNotNull(Object obj) throws CosXmlClientException {
            if (obj != null) {
                return;
            }
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), Object.class.getSimpleName() + "is null");
        }

        private void checkoutManualCanceled() throws CosXmlClientException {
            if (this.mTransferTaskCts.g()) {
                throw CosXmlClientException.manualCancelException();
            }
        }

        private boolean checkoutUploadId(String str) throws CosXmlServiceException, CosXmlClientException {
            this.uploadParts.clear();
            if (this.cosDirect.isTransferSecurely()) {
                if (this.cosDirect.getCryptoModule() == null) {
                    throw CosXmlClientException.internalException("cannot client size encryption, crypto module is null");
                }
                if (!this.cosDirect.getCryptoModule().hasMultipartUploadContext(str)) {
                    return false;
                }
            }
            this.listPartsRequest = new ListPartsRequest(this.bucket, this.key, str);
            this.listPartsRequest.setRegion(this.region);
            List<ListParts.Part> list = this.cosService.listParts(this.listPartsRequest).listParts.parts;
            Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.4
                @Override // java.util.Comparator
                public int compare(ListParts.Part part, ListParts.Part part2) {
                    int i10 = Integer.parseInt(part.partNumber);
                    int i11 = Integer.parseInt(part2.partNumber);
                    if (i10 < i11) {
                        return -1;
                    }
                    return i10 == i11 ? 0 : 1;
                }
            });
            try {
                InputStream inputStreamOpenInputStream = openInputStream();
                int i10 = 0;
                int i11 = 0;
                for (ListParts.Part part : list) {
                    int i12 = Integer.parseInt(part.partNumber);
                    long j10 = Long.parseLong(part.size);
                    i10++;
                    if (i10 == i12) {
                        String cOSMd5 = DigestUtils.getCOSMd5(inputStreamOpenInputStream, 0L, j10);
                        if (cOSMd5 != null && cOSMd5.equals(part.eTag)) {
                            COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "check part %d success", Integer.valueOf(i12));
                            long j11 = i11;
                            this.uploadParts.add(new UploadPart(part.eTag, i12, j11, j10));
                            i11 = (int) (j11 + j10);
                        }
                        COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "part number %d md5 not the same, local md5=%s, part md5=%s", Integer.valueOf(i12), cOSMd5, part.eTag);
                        break;
                    }
                    COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "part number %d not continuous", Integer.valueOf(i12));
                    break;
                }
                inputStreamOpenInputStream.close();
                COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "you have uploaded %d parts of it, upload offset: %s, partNumber: %d", Integer.valueOf(list.size()), Integer.valueOf(i11), Integer.valueOf(i10));
                return true;
            } catch (IOException e10) {
                COSTransferTask.loggerWarn(COSUploadTask.TAG, this.taskId, "check parts encounter exception: %s", e10.getMessage());
                throw CosXmlClientException.internalException(e10.getMessage());
            }
        }

        private CosXmlResult completeMultipartUpload(String str) throws CosXmlServiceException, CosXmlClientException {
            HashMap map = new HashMap();
            for (UploadPart uploadPart : this.uploadParts) {
                map.put(Integer.valueOf(uploadPart.number), uploadPart.etag);
            }
            try {
                this.completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.key, str, map);
                this.completeMultiUploadRequest.setRequestHeaders(getCompleteHeaders(this.putObjectRequest));
                CompleteMultiUploadResult completeMultiUploadResultCompleteMultipartUpload = this.cosDirect.completeMultipartUpload(this.completeMultiUploadRequest);
                COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "complete upload task", this.key, str);
                return completeMultiUploadResultCompleteMultipartUpload;
            } catch (CosXmlServiceException e10) {
                if (!"NoSuchUpload".equals(e10.getErrorCode())) {
                    throw e10;
                }
                try {
                    HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.key);
                    headObjectRequest.setRegion(this.region);
                    COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "complete uploadId [%s] failed with NoSuchUpload. check if it has been uploaded by HeadObjectRequest.", str);
                    return this.cosService.headObject(headObjectRequest);
                } catch (Exception unused) {
                    throw e10;
                }
            }
        }

        private void crc64Verify(String str) throws CosXmlClientException {
            if (TextUtils.isEmpty(str)) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "unable to verify with crc64 is null");
            }
            try {
                long bigIntFromString = DigestUtils.getBigIntFromString(str);
                InputStream inputStreamOpenInputStream = openInputStream();
                long crc64 = DigestUtils.getCRC64(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
                if (bigIntFromString != crc64) {
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), String.format(Locale.ENGLISH, "crc64 verify failed, remote crc 64bit value is %d, but local crc 64bit value is %d", Long.valueOf(bigIntFromString), Long.valueOf(crc64)));
                }
                COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "verify crc64 %s success", str);
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), String.format(Locale.ENGLISH, "failed open inputStream to verify crc64: %s", e10.getMessage()));
            }
        }

        private void delete() {
            DeleteObjectRequest deleteObjectRequest = new DeleteObjectRequest(this.bucket, this.key);
            deleteObjectRequest.setRegion(this.region);
            try {
                this.cosService.deleteObject(deleteObjectRequest);
            } catch (CosXmlClientException e10) {
                e10.printStackTrace();
            } catch (CosXmlServiceException e11) {
                e11.printStackTrace();
            }
        }

        private Map<String, List<String>> getCompleteHeaders(PutObjectRequest putObjectRequest) {
            Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
            if (requestHeaders == null) {
                return new HashMap();
            }
            HashMap map = new HashMap(requestHeaders);
            map.remove("Content-Type");
            return map;
        }

        private Map<String, List<String>> getInitHeaders(PutObjectRequest putObjectRequest) {
            Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
            return requestHeaders == null ? new HashMap() : new HashMap(requestHeaders);
        }

        private String getStorageClass() {
            List<String> list = this.putObjectRequest.getRequestHeaders().get("x-cos-storage-class");
            return (list == null || list.isEmpty()) ? "STANDARD" : list.get(0);
        }

        private String initUploadId() throws Exception {
            this.initMultipartUploadRequest = new InitMultipartUploadRequest(this.bucket, this.key);
            this.initMultipartUploadRequest.setRegion(this.region);
            this.initMultipartUploadRequest.setRequestHeaders(getInitHeaders(this.putObjectRequest));
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.initMultipartUploadRequest.attachMetrics(httpTaskMetrics);
            if (this.cosDirect.isTransferSecurely()) {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                objectMetadata.setContentLength(this.totalUploadSize);
                objectMetadata.setContentMD5(DigestUtils.getCOSMd5(openUnencryptedInputStream(), 0L, this.totalUploadSize));
                this.initMultipartUploadRequest.setMetadata(objectMetadata);
            }
            InitMultipartUploadResult initMultipartUploadResultInitMultipartUpload = this.cosDirect.initMultipartUpload(this.initMultipartUploadRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            String str = initMultipartUploadResultInitMultipartUpload.initMultipartUpload.uploadId;
            if (this.cosDirect.isTransferSecurely()) {
                this.mCryptoContext = this.cosDirect.getCryptoModule().getCryptoContext(str);
            }
            COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "create a new uploadId %s", str);
            return str;
        }

        private boolean isParallelUpload() {
            return !this.cosDirect.isTransferSecurely();
        }

        private List<String> listObjectUploadIds() throws CosXmlServiceException, CosXmlClientException {
            String strSubstring = this.key.startsWith("/") ? this.key.substring(1) : this.key;
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.listMultiUploadsRequest = new ListMultiUploadsRequest(this.bucket);
            this.listMultiUploadsRequest.setPrefix(strSubstring);
            this.listMultiUploadsRequest.setRegion(this.region);
            this.listMultiUploadsRequest.attachMetrics(httpTaskMetrics);
            LinkedList linkedList = new LinkedList();
            ListMultiUploadsResult listMultiUploadsResultListMultiUploads = this.cosService.listMultiUploads(this.listMultiUploadsRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            ListMultipartUploads listMultipartUploads = listMultiUploadsResultListMultiUploads.listMultipartUploads;
            if (listMultipartUploads != null) {
                List<ListMultipartUploads.Upload> list = listMultipartUploads.uploads;
                COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "find %d uploadIds with prefix %s", Integer.valueOf(list.size()), strSubstring);
                if (!list.isEmpty()) {
                    Collections.sort(list, new Comparator<ListMultipartUploads.Upload>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.3
                        @Override // java.util.Comparator
                        public int compare(ListMultipartUploads.Upload upload, ListMultipartUploads.Upload upload2) {
                            Long lValueOf = Long.valueOf(MultipartUploadTask.this.parseInitiatedDate(upload.initiated));
                            Long lValueOf2 = Long.valueOf(MultipartUploadTask.this.parseInitiatedDate(upload2.initiated));
                            if (lValueOf2.longValue() < lValueOf.longValue()) {
                                return -1;
                            }
                            return lValueOf2 == lValueOf ? 0 : 1;
                        }
                    });
                    for (ListMultipartUploads.Upload upload : list) {
                        if (upload.key.equals(strSubstring) && upload.storageClass.equals(getStorageClass())) {
                            linkedList.add(upload.uploadID);
                        }
                    }
                }
            }
            COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "find %d plan uploadId", Integer.valueOf(linkedList.size()));
            return linkedList;
        }

        private InputStream openInputStream() throws CosXmlClientException {
            InputStream inputStreamOpenUnencryptedInputStream = openUnencryptedInputStream();
            if (this.cosDirect.isTransferSecurely()) {
                if (this.mCryptoContext == null) {
                    throw CosXmlClientException.internalException(this.mUploadId + " crypto context not found");
                }
                inputStreamOpenUnencryptedInputStream = this.cosDirect.getCryptoModule().newCOSCipherLiteInputStream(this.putObjectRequest, this.mCryptoContext.getCipherLite());
            }
            assetNotNull(inputStreamOpenUnencryptedInputStream);
            return inputStreamOpenUnencryptedInputStream;
        }

        private InputStream openUnencryptedInputStream() throws CosXmlClientException {
            InputStream inputStreamOpenInputStream;
            try {
                String srcPath = this.putObjectRequest.getSrcPath();
                Uri uri = this.putObjectRequest.getUri();
                if (srcPath != null) {
                    inputStreamOpenInputStream = new ResettableInputStream(srcPath);
                } else {
                    inputStreamOpenInputStream = (uri == null || ContextHolder.getAppContext() == null) ? null : ContextHolder.getAppContext().getContentResolver().openInputStream(uri);
                }
                assetNotNull(inputStreamOpenInputStream);
                return inputStreamOpenInputStream;
            } catch (Exception unused) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "open InputStream failed");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long parseInitiatedDate(String str) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault()).parse(str).getTime();
            } catch (ParseException e10) {
                e10.printStackTrace();
                return 0L;
            }
        }

        private UploadPartRequest transform(PutObjectRequest putObjectRequest) throws CosXmlClientException {
            UploadPartRequest uploadPartRequest;
            if (putObjectRequest.getUri() != null) {
                uploadPartRequest = new UploadPartRequest(this.bucket, this.key, 1, putObjectRequest.getUri(), this.mUploadId);
            } else {
                uploadPartRequest = putObjectRequest.getSrcPath() != null ? new UploadPartRequest(this.bucket, this.key, 1, putObjectRequest.getSrcPath(), this.mUploadId) : null;
            }
            assetNotNull(uploadPartRequest);
            uploadPartRequest.setFileOffset(0L);
            uploadPartRequest.setFileContentLength(new File(putObjectRequest.getSrcPath()).length());
            return uploadPartRequest;
        }

        private void uploadParts(String str) throws Exception {
            long j10;
            long j11;
            int i10;
            long j12 = this.totalUploadSize;
            UploadPart uploadPartLast = this.uploadParts.isEmpty() ? null : this.uploadParts.last();
            if (uploadPartLast != null) {
                long j13 = uploadPartLast.offset + uploadPartLast.size;
                j10 = j12 - j13;
                i10 = uploadPartLast.number + 1;
                j11 = j13;
            } else {
                j10 = j12;
                j11 = 0;
                i10 = 1;
            }
            this.mTransferMetrics.size = j10;
            if (j10 > 0) {
                COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "start upload parts, offset=%s, size=%d, startNumber=%d", Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(i10));
                if (isParallelUpload()) {
                    this.uploadPartsTask = new ParallelUploadPartsTask(this.cosDirect, this.putObjectRequest, j11, j10, i10, str);
                } else {
                    this.uploadPartsTask = new SerialUploadPartsTask(this.cosDirect, this.putObjectRequest, j11, j10, i10, str);
                }
                BaseUploadPartsTask baseUploadPartsTask = this.uploadPartsTask;
                baseUploadPartsTask.mMaxPartSize = this.mMaxPartSize;
                baseUploadPartsTask.setTaskId(this.taskId);
                this.uploadPartsTask.setProgressListener(this.putObjectRequest.getProgressListener());
                this.uploadParts.addAll(this.uploadPartsTask.upload());
            }
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel() {
            if (this.listMultiUploadsRequest != null) {
                this.cosDirect.cancel(this.listMultiUploadsRequest);
            }
            if (this.initMultipartUploadRequest != null) {
                this.cosDirect.cancel(this.initMultipartUploadRequest);
            }
            if (this.listPartsRequest != null) {
                this.cosDirect.cancel(this.listPartsRequest);
            }
            if (this.completeMultiUploadRequest != null) {
                this.cosDirect.cancel(this.completeMultiUploadRequest);
            }
            BaseUploadPartsTask baseUploadPartsTask = this.uploadPartsTask;
            if (baseUploadPartsTask != null) {
                baseUploadPartsTask.cancel();
            }
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void setTaskId(String str) {
            this.taskId = str;
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        protected CosXmlResult upload(PutObjectRequest putObjectRequest) throws Exception {
            if (!this.cosDirect.isTransferSecurely()) {
                checkoutManualCanceled();
                List<String> listListObjectUploadIds = listObjectUploadIds();
                checkoutManualCanceled();
                for (String str : listListObjectUploadIds) {
                    if (checkoutUploadId(str)) {
                        this.mUploadId = str;
                        break;
                    }
                }
            }
            checkoutManualCanceled();
            if (TextUtils.isEmpty(this.mUploadId)) {
                this.mUploadId = initUploadId();
            }
            checkoutManualCanceled();
            uploadParts(this.mUploadId);
            checkoutManualCanceled();
            CosXmlResult cosXmlResultCompleteMultipartUpload = completeMultipartUpload(this.mUploadId);
            if (this.verifyCRC64) {
                checkoutManualCanceled();
                crc64Verify(cosXmlResultCompleteMultipartUpload.getHeader(Headers.COS_HASH_CRC64_ECMA));
            }
            return cosXmlResultCompleteMultipartUpload;
        }
    }

    public static class SimpleUploadTask extends BaseUploadTask {
        SimpleUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, e eVar, long j10) {
            super(cOSDirect, putObjectRequest, eVar, j10);
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel() {
            this.cosDirect.cancel(this.putObjectRequest);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public PutObjectResult upload(PutObjectRequest putObjectRequest) throws Exception {
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.mTransferMetrics.size = this.totalUploadSize;
            putObjectRequest.attachMetrics(httpTaskMetrics);
            PutObjectResult putObjectResultPutObject = this.cosDirect.putObject(putObjectRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "complete upload task", new Object[0]);
            return putObjectResultPutObject;
        }
    }

    public static final class UploadPart {
        String etag;
        int number;
        long offset;
        long size;

        public UploadPart(String str, int i10, long j10, long j11) {
            this.etag = str;
            this.number = i10;
            this.offset = j10;
            this.size = j11;
        }
    }

    public COSUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest) {
        super(cOSDirect, putObjectRequest);
        this.multipartUploadThreshold = 2097152L;
        this.mMaxPartSize = 1048576L;
        this.verifyCRC64 = true;
        this.mForceSimpleUpload = false;
        this.uploadLength = -1L;
        this.mPutObjectRequest = putObjectRequest;
    }

    private PutObjectResult buildPutObjectResult(CompleteMultiUploadResult completeMultiUploadResult) {
        PutObjectResult putObjectResult = new PutObjectResult();
        putObjectResult.httpCode = completeMultiUploadResult.httpCode;
        putObjectResult.httpMessage = completeMultiUploadResult.httpMessage;
        putObjectResult.headers = completeMultiUploadResult.headers;
        putObjectResult.accessUrl = completeMultiUploadResult.accessUrl;
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultiUploadResult.completeMultipartUpload;
        putObjectResult.eTag = completeMultipartUploadResult.eTag;
        putObjectResult.picUploadResult = completeMultipartUploadResult.getPicUploadResult();
        return putObjectResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUploadLength() {
        return this.uploadLength;
    }

    private boolean isMultipartUploadLength() {
        return this.uploadLength >= this.multipartUploadThreshold;
    }

    private boolean isMultipartUploadRequest() {
        return (this.mPutObjectRequest.getSrcPath() == null && this.mPutObjectRequest.getUri() == null) ? false : true;
    }

    private boolean shouldMultipartUpload() {
        return !this.mForceSimpleUpload && isMultipartUploadRequest() && isMultipartUploadLength();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel() {
        super.cancel();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel();
        }
        BaseUploadTask baseUploadTask2 = this.uploadTask;
        if (baseUploadTask2 instanceof MultipartUploadTask) {
            ((MultipartUploadTask) baseUploadTask2).abort();
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected void checking() throws CosXmlClientException {
        super.checking();
        this.mPutObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j10, long j11) {
                COSUploadTask cOSUploadTask = COSUploadTask.this;
                cOSUploadTask.onTransferProgressChange(j10, cOSUploadTask.getUploadLength());
            }
        });
        byte[] data = this.mPutObjectRequest.getData();
        this.mPutObjectRequest.getInputStream();
        String srcPath = this.mPutObjectRequest.getSrcPath();
        Uri uri = this.mPutObjectRequest.getUri();
        this.mPutObjectRequest.getUrl();
        String strData = this.mPutObjectRequest.getStrData();
        this.mPutObjectRequest.getUrlUploadPolicy();
        if (TextUtils.isEmpty(srcPath) && uri == null && data == null && strData == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "Only support upload file path, uri, bytes array and string");
        }
        if (!TextUtils.isEmpty(srcPath)) {
            File file = new File(srcPath);
            if (!file.exists()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), srcPath + " is not exist.");
            }
            if (file.isDirectory()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), srcPath + " is directory.");
            }
            if (!file.canRead()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), " read " + srcPath + " failed, please check permission to read this file.");
            }
            this.uploadLength = file.length();
        } else if (uri != null) {
            Context appContext = ContextHolder.getAppContext();
            if (appContext != null) {
                if (!QCloudUtils.doesUriFileExist(uri, appContext.getContentResolver())) {
                    throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "uri " + uri + " is not exist");
                }
                this.uploadLength = QCloudUtils.getUriContentLength2(uri, appContext.getContentResolver());
            }
        } else if (data != null) {
            this.uploadLength = data.length;
        } else if (strData != null) {
            this.uploadLength = strData.getBytes().length;
        }
        COSTransferTask.loggerInfo(TAG, this.taskId, "checkout upload length=%d", Long.valueOf(this.uploadLength));
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected CosXmlResult execute() throws Exception {
        if (shouldMultipartUpload()) {
            COSTransferTask.loggerInfo(TAG, this.taskId, "start upload with multipart upload", new Object[0]);
            MultipartUploadTask multipartUploadTask = new MultipartUploadTask(this.cosDirect, this.mPutObjectRequest, this.mTransferTaskCts, getUploadLength());
            multipartUploadTask.mMaxPartSize = this.mMaxPartSize;
            multipartUploadTask.verifyCRC64 = this.verifyCRC64;
            this.uploadTask = multipartUploadTask;
        } else {
            COSTransferTask.loggerInfo(TAG, this.taskId, "start upload with simple upload.", this.key);
            this.uploadTask = new SimpleUploadTask(this.cosDirect, this.mPutObjectRequest, this.mTransferTaskCts, getUploadLength());
        }
        this.uploadTask.mTransferMetrics = this.transferTaskMetrics;
        this.uploadTask.taskId = this.taskId;
        CosXmlResult cosXmlResultUpload = this.uploadTask.upload(this.mPutObjectRequest);
        return cosXmlResultUpload instanceof CompleteMultiUploadResult ? buildPutObjectResult((CompleteMultiUploadResult) cosXmlResultUpload) : cosXmlResultUpload;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected Executor executor() {
        return uploadTaskExecutor;
    }

    void forceSimpleUpload(boolean z10) {
        this.mForceSimpleUpload = z10;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause() {
        super.pause();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel();
        }
    }

    void setPartSize(long j10) {
        this.mMaxPartSize = j10;
    }

    void setSliceSizeThreshold(long j10) {
        this.multipartUploadThreshold = j10;
    }

    void setVerifyCRC64(boolean z10) {
        this.verifyCRC64 = z10;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected String tag() {
        return TAG;
    }
}
