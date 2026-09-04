package com.tencent.cos.xml.transfer;

import android.content.Context;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.utils.SharePreferenceUtils;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.logger.QCloudLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class UploadService {
    private static final long SIZE_LIMIT = 2097152;
    private static String TAG = "UploadService";
    private AtomicLong ALREADY_SEND_DATA_LEN;
    private volatile int ERROR_EXIT_FLAG;
    private AtomicInteger UPLOAD_PART_COUNT;
    private String bucket;
    private CompleteMultiUploadRequest completeMultiUploadRequest;
    private String cosPath;
    private CosXmlProgressListener cosXmlProgressListener;
    private CosXmlSimpleService cosXmlService;
    private EncryptionType encryptionType;
    private long endTime;
    private long fileLength;
    private List<String> headers;
    private InitMultipartUploadRequest initMultipartUploadRequest;
    private boolean isNeedMd5;
    private boolean isSupportAccelerate;
    private ListPartsRequest listPartsRequest;
    private Exception mException;
    private byte[] objectSync;
    private OnGetHttpTaskMetrics onGetHttpTaskMetrics;
    private OnSignatureListener onSignatureListener;
    private OnUploadInfoListener onUploadInfoListener;
    private Map<Integer, SlicePartStruct> partStructMap;
    private PutObjectRequest putObjectRequest;
    ResumeData resumeData;
    private SharePreferenceUtils sharePreferenceUtils;
    private long sliceSize;
    private String srcPath;
    private long startTime;
    private String uploadId;
    private Map<UploadPartRequest, Long> uploadPartRequestLongMap;
    private UploadServiceResult uploadServiceResult;

    /* JADX INFO: renamed from: com.tencent.cos.xml.transfer.UploadService$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType;

        static {
            int[] iArr = new int[EncryptionType.values().length];
            $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType = iArr;
            try {
                iArr[EncryptionType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[EncryptionType.SSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[EncryptionType.SSEC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[EncryptionType.SSEKMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum EncryptionType {
        SSE,
        SSEC,
        SSEKMS,
        NONE
    }

    public interface OnGetHttpTaskMetrics {
        void onGetHttpMetrics(String str, HttpTaskMetrics httpTaskMetrics);
    }

    public interface OnSignatureListener {
        String onGetSign(CosXmlRequest cosXmlRequest);
    }

    public interface OnUploadInfoListener {
        void onInfo(ResumeData resumeData);
    }

    public static class ResumeData {
        public String bucket;
        public String cosPath;
        public String customerKeyForSSEC;
        public String customerKeyIdForSSEKMS;
        public String jsonContentForSSEKMS;
        public long sliceSize;
        public String srcPath;
        public String uploadId;
    }

    public static class SlicePartStruct {
        public String eTag;
        public boolean isAlreadyUpload;
        public long offset;
        public int partNumber;
        public long sliceSize;

        private SlicePartStruct() {
        }
    }

    public static class UploadServiceResult extends CosXmlResult {
        public String eTag;

        @Override // com.tencent.cos.xml.model.CosXmlResult
        public String printResult() {
            return super.printResult() + "\neTag:" + this.eTag + "\naccessUrl:" + this.accessUrl;
        }
    }

    public UploadService(CosXmlSimpleService cosXmlSimpleService, ResumeData resumeData) {
        this.sliceSize = 1048576L;
        this.objectSync = new byte[0];
        this.startTime = -1L;
        this.endTime = -1L;
        this.headers = new ArrayList();
        this.isNeedMd5 = false;
        this.encryptionType = EncryptionType.NONE;
        this.isSupportAccelerate = false;
        this.cosXmlService = cosXmlSimpleService;
        init(resumeData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    public UploadService(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, long j10, Context context) {
        String value;
        this.sliceSize = 1048576L;
        this.objectSync = new byte[0];
        this.startTime = -1L;
        this.endTime = -1L;
        this.headers = new ArrayList();
        this.isNeedMd5 = false;
        this.encryptionType = EncryptionType.NONE;
        this.isSupportAccelerate = false;
        if (context != null) {
            this.sharePreferenceUtils = SharePreferenceUtils.instance(context.getApplicationContext());
            String key = getKey(cosXmlSimpleService, str, str2, str3, j10);
            if (key != null) {
                value = this.sharePreferenceUtils.getValue(key);
            } else {
                value = null;
            }
        } else {
            value = null;
        }
        ResumeData resumeData = new ResumeData();
        resumeData.bucket = str;
        resumeData.cosPath = str2;
        resumeData.sliceSize = j10;
        resumeData.srcPath = str3;
        resumeData.uploadId = value;
        this.cosXmlService = cosXmlSimpleService;
        init(resumeData);
    }

    private void abortMultiUpload(final CosXmlResultListener cosXmlResultListener) {
        String str = this.uploadId;
        if (str == null) {
            return;
        }
        AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.cosPath, str);
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            abortMultiUploadRequest.setSign(onSignatureListener.onGetSign(abortMultiUploadRequest));
        } else {
            setSignTime(abortMultiUploadRequest);
        }
        getHttpMetrics(abortMultiUploadRequest, "AbortMultiUploadRequest");
        try {
            setRequestHeaders(abortMultiUploadRequest);
            setSupportAccelerate(abortMultiUploadRequest);
            this.cosXmlService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.UploadService.5
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                    cosXmlResultListener.onFail(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                    UploadService.this.realCancel();
                    UploadService.this.clear();
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                    cosXmlResultListener.onSuccess(cosXmlRequest, cosXmlResult);
                    UploadService.this.realCancel();
                    UploadService.this.clear();
                }
            });
        } catch (CosXmlClientException e10) {
            cosXmlResultListener.onFail(abortMultiUploadRequest, e10, null);
        }
    }

    private void checkParameter() throws CosXmlClientException {
        if (this.srcPath != null) {
            File file = new File(this.srcPath);
            if (file.exists()) {
                this.fileLength = file.length();
                return;
            }
        }
        throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "srcPath :" + this.srcPath + " is invalid or is not exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        this.putObjectRequest = null;
        this.initMultipartUploadRequest = null;
        this.listPartsRequest = null;
        this.completeMultiUploadRequest = null;
        this.partStructMap.clear();
        this.uploadPartRequestLongMap.clear();
    }

    private CompleteMultiUploadResult completeMultiUpload() throws CosXmlServiceException, CosXmlClientException {
        this.completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.cosPath, this.uploadId, null);
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        while (it.hasNext()) {
            SlicePartStruct value = it.next().getValue();
            this.completeMultiUploadRequest.setPartNumberAndETag(value.partNumber, value.eTag);
        }
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            CompleteMultiUploadRequest completeMultiUploadRequest = this.completeMultiUploadRequest;
            completeMultiUploadRequest.setSign(onSignatureListener.onGetSign(completeMultiUploadRequest));
        } else {
            setSignTime(this.completeMultiUploadRequest);
        }
        getHttpMetrics(this.completeMultiUploadRequest, "CompleteMultiUploadResult");
        setRequestHeaders(this.completeMultiUploadRequest);
        setSupportAccelerate(this.completeMultiUploadRequest);
        this.completeMultiUploadRequest.setNeedMD5(this.isNeedMd5);
        return this.cosXmlService.completeMultiUpload(this.completeMultiUploadRequest);
    }

    private void getHttpMetrics(CosXmlRequest cosXmlRequest, final String str) {
        if (this.onGetHttpTaskMetrics != null) {
            cosXmlRequest.attachMetrics(new HttpTaskMetrics() { // from class: com.tencent.cos.xml.transfer.UploadService.1
                @Override // com.tencent.qcloud.core.http.HttpTaskMetrics
                public void onDataReady() {
                    super.onDataReady();
                    UploadService.this.onGetHttpTaskMetrics.onGetHttpMetrics(str, this);
                }
            });
        }
    }

    private InitMultipartUploadResult initMultiUpload() throws CosXmlServiceException, CosXmlClientException {
        InitMultipartUploadRequest initMultipartUploadRequest = new InitMultipartUploadRequest(this.bucket, this.cosPath);
        this.initMultipartUploadRequest = initMultipartUploadRequest;
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            initMultipartUploadRequest.setSign(onSignatureListener.onGetSign(initMultipartUploadRequest));
        } else {
            setSignTime(initMultipartUploadRequest);
        }
        getHttpMetrics(this.initMultipartUploadRequest, "InitMultipartUploadRequest");
        setRequestHeaders(this.initMultipartUploadRequest);
        setSupportAccelerate(this.initMultipartUploadRequest);
        setEncryption(this.initMultipartUploadRequest);
        return this.cosXmlService.initMultipartUpload(this.initMultipartUploadRequest);
    }

    private void initSlicePart() throws CosXmlClientException {
        if (this.srcPath != null) {
            File file = new File(this.srcPath);
            if (!file.exists()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "upload file does not exist");
            }
            this.fileLength = file.length();
        }
        long j10 = this.fileLength;
        if (j10 > 0) {
            long j11 = this.sliceSize;
            if (j11 > 0) {
                int i10 = (int) (j10 / j11);
                int i11 = 1;
                while (true) {
                    if (i11 >= i10) {
                        SlicePartStruct slicePartStruct = new SlicePartStruct();
                        slicePartStruct.isAlreadyUpload = false;
                        slicePartStruct.partNumber = i11;
                        long j12 = ((long) (i11 - 1)) * this.sliceSize;
                        slicePartStruct.offset = j12;
                        slicePartStruct.sliceSize = this.fileLength - j12;
                        this.partStructMap.put(Integer.valueOf(i11), slicePartStruct);
                        this.UPLOAD_PART_COUNT.set(i11);
                        return;
                    }
                    SlicePartStruct slicePartStruct2 = new SlicePartStruct();
                    slicePartStruct2.isAlreadyUpload = false;
                    slicePartStruct2.partNumber = i11;
                    long j13 = this.sliceSize;
                    slicePartStruct2.offset = ((long) (i11 - 1)) * j13;
                    slicePartStruct2.sliceSize = j13;
                    this.partStructMap.put(Integer.valueOf(i11), slicePartStruct2);
                    i11++;
                }
            }
        }
        throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "file size or slice size less than 0");
    }

    private ListPartsResult listPart() throws CosXmlServiceException, CosXmlClientException {
        ListPartsRequest listPartsRequest = new ListPartsRequest(this.bucket, this.cosPath, this.uploadId);
        this.listPartsRequest = listPartsRequest;
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            listPartsRequest.setSign(onSignatureListener.onGetSign(listPartsRequest));
        } else {
            setSignTime(listPartsRequest);
        }
        getHttpMetrics(this.listPartsRequest, "ListPartsRequest");
        setRequestHeaders(this.listPartsRequest);
        setSupportAccelerate(this.listPartsRequest);
        return this.cosXmlService.listParts(this.listPartsRequest);
    }

    private UploadServiceResult multiUploadParts() throws CosXmlServiceException, CosXmlClientException {
        initSlicePart();
        if (this.uploadId != null) {
            updateSlicePart(listPart());
        } else {
            this.uploadId = initMultiUpload().initMultipartUpload.uploadId;
        }
        if (this.onUploadInfoListener != null) {
            ResumeData resumeData = new ResumeData();
            resumeData.bucket = this.bucket;
            resumeData.cosPath = this.cosPath;
            resumeData.sliceSize = this.sliceSize;
            resumeData.srcPath = this.srcPath;
            resumeData.uploadId = this.uploadId;
            ResumeData resumeData2 = this.resumeData;
            resumeData.customerKeyForSSEC = resumeData2.customerKeyForSSEC;
            resumeData.customerKeyIdForSSEKMS = resumeData2.customerKeyIdForSSEKMS;
            resumeData.jsonContentForSSEKMS = resumeData2.jsonContentForSSEKMS;
            this.onUploadInfoListener.onInfo(resumeData);
        }
        updateSharePreference(this.uploadId);
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        while (it.hasNext()) {
            final SlicePartStruct value = it.next().getValue();
            if (!value.isAlreadyUpload) {
                uploadPart(value.partNumber, value.offset, value.sliceSize, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.UploadService.3
                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                        synchronized (UploadService.this.objectSync) {
                            try {
                                if (cosXmlClientException != null) {
                                    UploadService.this.mException = cosXmlClientException;
                                } else {
                                    UploadService.this.mException = cosXmlServiceException;
                                }
                                UploadService.this.ERROR_EXIT_FLAG = 1;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }

                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                        synchronized (UploadService.this.objectSync) {
                            SlicePartStruct slicePartStruct = value;
                            slicePartStruct.eTag = ((UploadPartResult) cosXmlResult).eTag;
                            slicePartStruct.isAlreadyUpload = true;
                        }
                        UploadService.this.UPLOAD_PART_COUNT.decrementAndGet();
                    }
                });
            }
        }
        while (this.UPLOAD_PART_COUNT.get() > 0 && this.ERROR_EXIT_FLAG == 0) {
        }
        clearSharePreference();
        if (this.ERROR_EXIT_FLAG > 0) {
            int i10 = this.ERROR_EXIT_FLAG;
            if (i10 == 1) {
                realCancel();
                Exception exc = this.mException;
                if (exc == null) {
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "unknown exception");
                }
                if (exc instanceof CosXmlClientException) {
                    throw ((CosXmlClientException) exc);
                }
                if (exc instanceof CosXmlServiceException) {
                    throw ((CosXmlServiceException) exc);
                }
            } else {
                if (i10 == 2) {
                    realCancel();
                    clear();
                    throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), "request is cancelled by manual pause");
                }
                if (i10 == 3) {
                    throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), "request is cancelled by abort request");
                }
            }
        }
        CompleteMultiUploadResult completeMultiUploadResultCompleteMultiUpload = completeMultiUpload();
        if (this.uploadServiceResult == null) {
            this.uploadServiceResult = new UploadServiceResult();
        }
        UploadServiceResult uploadServiceResult = this.uploadServiceResult;
        uploadServiceResult.httpCode = completeMultiUploadResultCompleteMultiUpload.httpCode;
        uploadServiceResult.httpMessage = completeMultiUploadResultCompleteMultiUpload.httpMessage;
        uploadServiceResult.headers = completeMultiUploadResultCompleteMultiUpload.headers;
        uploadServiceResult.eTag = completeMultiUploadResultCompleteMultiUpload.completeMultipartUpload.eTag;
        uploadServiceResult.accessUrl = this.cosXmlService.getAccessUrl(this.completeMultiUploadRequest);
        return this.uploadServiceResult;
    }

    private UploadServiceResult putObject(String str, String str2, String str3) throws CosXmlServiceException, CosXmlClientException {
        this.UPLOAD_PART_COUNT.set(1);
        PutObjectRequest putObjectRequest = new PutObjectRequest(str, str2, str3);
        this.putObjectRequest = putObjectRequest;
        putObjectRequest.setProgressListener(this.cosXmlProgressListener);
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            PutObjectRequest putObjectRequest2 = this.putObjectRequest;
            putObjectRequest2.setSign(onSignatureListener.onGetSign(putObjectRequest2));
        } else {
            setSignTime(this.putObjectRequest);
        }
        getHttpMetrics(this.putObjectRequest, "PutObjectRequest");
        setRequestHeaders(this.putObjectRequest);
        setSupportAccelerate(this.putObjectRequest);
        setEncryption(this.putObjectRequest);
        this.putObjectRequest.setNeedMD5(this.isNeedMd5);
        this.cosXmlService.putObjectAsync(this.putObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.UploadService.2
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                synchronized (UploadService.this.objectSync) {
                    try {
                        if (cosXmlClientException != null) {
                            UploadService.this.mException = cosXmlClientException;
                        } else {
                            UploadService.this.mException = cosXmlServiceException;
                        }
                        UploadService.this.ERROR_EXIT_FLAG = 1;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                synchronized (UploadService.this.objectSync) {
                    PutObjectResult putObjectResult = (PutObjectResult) cosXmlResult;
                    if (UploadService.this.uploadServiceResult == null) {
                        UploadService.this.uploadServiceResult = new UploadServiceResult();
                    }
                    UploadService.this.uploadServiceResult.httpCode = putObjectResult.httpCode;
                    UploadService.this.uploadServiceResult.httpMessage = putObjectResult.httpMessage;
                    UploadService.this.uploadServiceResult.headers = putObjectResult.headers;
                    UploadService.this.uploadServiceResult.eTag = putObjectResult.eTag;
                }
                UploadService.this.UPLOAD_PART_COUNT.decrementAndGet();
            }
        });
        while (this.UPLOAD_PART_COUNT.get() > 0 && this.ERROR_EXIT_FLAG == 0) {
        }
        if (this.ERROR_EXIT_FLAG > 0) {
            int i10 = this.ERROR_EXIT_FLAG;
            if (i10 == 1) {
                realCancel();
                Exception exc = this.mException;
                if (exc == null) {
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "unknown exception");
                }
                if (exc instanceof CosXmlClientException) {
                    throw ((CosXmlClientException) exc);
                }
                if (exc instanceof CosXmlServiceException) {
                    throw ((CosXmlServiceException) exc);
                }
            } else {
                if (i10 == 2) {
                    realCancel();
                    clear();
                    throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), "request is cancelled by manual pause");
                }
                if (i10 == 3) {
                    throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED.getCode(), "request is cancelled by abort request");
                }
            }
        }
        this.uploadServiceResult.accessUrl = this.cosXmlService.getAccessUrl(this.putObjectRequest);
        return this.uploadServiceResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realCancel() {
        this.cosXmlService.cancel(this.putObjectRequest);
        this.cosXmlService.cancel(this.initMultipartUploadRequest);
        this.cosXmlService.cancel(this.listPartsRequest);
        this.cosXmlService.cancel(this.completeMultiUploadRequest);
        Map<UploadPartRequest, Long> map = this.uploadPartRequestLongMap;
        if (map != null) {
            Iterator<UploadPartRequest> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.cosXmlService.cancel(it.next());
            }
        }
    }

    private void setEncryption(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (cosXmlRequest == null) {
            return;
        }
        int i10 = AnonymousClass6.$SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[this.encryptionType.ordinal()];
        if (i10 == 2) {
            ((ObjectRequest) cosXmlRequest).setCOSServerSideEncryption();
            return;
        }
        if (i10 == 3) {
            ((ObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithCustomerKey(this.resumeData.customerKeyForSSEC);
        } else {
            if (i10 != 4) {
                return;
            }
            ResumeData resumeData = this.resumeData;
            ((ObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithKMS(resumeData.customerKeyIdForSSEKMS, resumeData.jsonContentForSSEKMS);
        }
    }

    private void setRequestHeaders(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (cosXmlRequest != null) {
            int size = this.headers.size();
            for (int i10 = 0; i10 < size - 2; i10 += 2) {
                cosXmlRequest.setRequestHeaders(this.headers.get(i10), this.headers.get(i10 + 1), false);
            }
        }
    }

    private void setSignTime(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest != null) {
            long j10 = this.startTime;
            if (j10 > 0) {
                long j11 = this.endTime;
                if (j11 >= j10) {
                    cosXmlRequest.setSign(j10, j11);
                }
            }
        }
    }

    private void setSupportAccelerate(CosXmlRequest cosXmlRequest) {
        boolean z10;
        if (cosXmlRequest == null || !(z10 = this.isSupportAccelerate)) {
            return;
        }
        cosXmlRequest.isSupportAccelerate(z10);
    }

    private void updateSlicePart(ListPartsResult listPartsResult) {
        ListParts listParts;
        List<ListParts.Part> list;
        if (listPartsResult == null || (listParts = listPartsResult.listParts) == null || (list = listParts.parts) == null) {
            return;
        }
        for (ListParts.Part part : list) {
            if (this.partStructMap.containsKey(Integer.valueOf(part.partNumber))) {
                SlicePartStruct slicePartStruct = this.partStructMap.get(Integer.valueOf(part.partNumber));
                slicePartStruct.isAlreadyUpload = true;
                slicePartStruct.eTag = part.eTag;
                this.UPLOAD_PART_COUNT.decrementAndGet();
                this.ALREADY_SEND_DATA_LEN.addAndGet(Long.parseLong(part.size));
            }
        }
    }

    private void uploadPart(int i10, long j10, long j11, CosXmlResultListener cosXmlResultListener) {
        final UploadPartRequest uploadPartRequest = new UploadPartRequest(this.bucket, this.cosPath, i10, this.srcPath, j10, j11, this.uploadId);
        this.uploadPartRequestLongMap.put(uploadPartRequest, 0L);
        uploadPartRequest.setNeedMD5(this.isNeedMd5);
        OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            uploadPartRequest.setSign(onSignatureListener.onGetSign(uploadPartRequest));
        } else {
            setSignTime(uploadPartRequest);
        }
        getHttpMetrics(uploadPartRequest, "UploadPartRequest");
        try {
            setRequestHeaders(uploadPartRequest);
            setSupportAccelerate(uploadPartRequest);
            setEncryption(uploadPartRequest);
            uploadPartRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.UploadService.4
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j12, long j13) {
                    synchronized (UploadService.this.objectSync) {
                        try {
                            long jAddAndGet = UploadService.this.ALREADY_SEND_DATA_LEN.addAndGet(j12 - ((Long) UploadService.this.uploadPartRequestLongMap.get(uploadPartRequest)).longValue());
                            UploadService.this.uploadPartRequestLongMap.put(uploadPartRequest, Long.valueOf(j12));
                            if (UploadService.this.cosXmlProgressListener != null) {
                                UploadService.this.cosXmlProgressListener.onProgress(jAddAndGet, UploadService.this.fileLength);
                            }
                        } catch (Exception unused) {
                            if (UploadService.this.ERROR_EXIT_FLAG > 0) {
                                QCloudLogger.d(UploadService.TAG, "upload file has been abort", new Object[0]);
                            }
                        }
                    }
                }
            });
            this.cosXmlService.uploadPartAsync(uploadPartRequest, cosXmlResultListener);
        } catch (CosXmlClientException e10) {
            cosXmlResultListener.onFail(this.putObjectRequest, e10, null);
        }
    }

    public void abort(CosXmlResultListener cosXmlResultListener) {
        this.ERROR_EXIT_FLAG = 3;
        abortMultiUpload(cosXmlResultListener);
    }

    void clearSharePreference() {
        SharePreferenceUtils sharePreferenceUtils = this.sharePreferenceUtils;
        if (sharePreferenceUtils != null) {
            sharePreferenceUtils.clear(getKey(this.cosXmlService, this.bucket, this.cosPath, this.srcPath, this.sliceSize));
        }
    }

    String getKey(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, long j10) {
        File file = new File(str3);
        if (!file.exists()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cosXmlSimpleService != null ? cosXmlSimpleService.getAppid() : null);
        stringBuffer.append(";");
        stringBuffer.append(str);
        stringBuffer.append(";");
        stringBuffer.append(str2);
        stringBuffer.append(";");
        stringBuffer.append(str3);
        stringBuffer.append(";");
        stringBuffer.append(file.length());
        stringBuffer.append(";");
        stringBuffer.append(file.lastModified());
        stringBuffer.append(";");
        stringBuffer.append(j10);
        return stringBuffer.toString();
    }

    void init(ResumeData resumeData) {
        this.bucket = resumeData.bucket;
        this.cosPath = resumeData.cosPath;
        this.srcPath = resumeData.srcPath;
        this.sliceSize = resumeData.sliceSize;
        this.uploadId = resumeData.uploadId;
        this.UPLOAD_PART_COUNT = new AtomicInteger(0);
        this.ALREADY_SEND_DATA_LEN = new AtomicLong(0L);
        this.ERROR_EXIT_FLAG = 0;
        this.partStructMap = new LinkedHashMap();
        this.uploadPartRequestLongMap = new LinkedHashMap();
        this.resumeData = resumeData;
    }

    public void isSupportAccelerate(boolean z10) {
        this.isSupportAccelerate = z10;
    }

    public ResumeData pause() {
        this.ERROR_EXIT_FLAG = 2;
        ResumeData resumeData = new ResumeData();
        resumeData.bucket = this.bucket;
        resumeData.cosPath = this.cosPath;
        resumeData.sliceSize = this.sliceSize;
        resumeData.srcPath = this.srcPath;
        resumeData.uploadId = this.uploadId;
        ResumeData resumeData2 = this.resumeData;
        resumeData.customerKeyForSSEC = resumeData2.customerKeyForSSEC;
        resumeData.customerKeyIdForSSEKMS = resumeData2.customerKeyIdForSSEKMS;
        resumeData.jsonContentForSSEKMS = resumeData2.jsonContentForSSEKMS;
        return resumeData;
    }

    public CosXmlResult resume(ResumeData resumeData) throws CosXmlServiceException, CosXmlClientException {
        init(resumeData);
        return upload();
    }

    public void setCOSServerSideEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }

    public void setNeedMd5(boolean z10) {
        this.isNeedMd5 = z10;
    }

    public void setOnGetHttpTaskMetrics(OnGetHttpTaskMetrics onGetHttpTaskMetrics) {
        this.onGetHttpTaskMetrics = onGetHttpTaskMetrics;
    }

    public void setOnSignatureListener(OnSignatureListener onSignatureListener) {
        this.onSignatureListener = onSignatureListener;
    }

    public void setOnUploadInfoListener(OnUploadInfoListener onUploadInfoListener) {
        this.onUploadInfoListener = onUploadInfoListener;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.cosXmlProgressListener = cosXmlProgressListener;
    }

    public void setRequestHeaders(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.headers.add(str);
        this.headers.add(str2);
    }

    public void setSign(long j10, long j11) {
        this.startTime = j10;
        this.endTime = j11;
    }

    void setUploadId(String str) {
        this.uploadId = str;
    }

    boolean updateSharePreference(String str) {
        SharePreferenceUtils sharePreferenceUtils = this.sharePreferenceUtils;
        if (sharePreferenceUtils != null) {
            return sharePreferenceUtils.updateValue(getKey(this.cosXmlService, this.bucket, this.cosPath, this.srcPath, this.sliceSize), str);
        }
        return false;
    }

    public UploadServiceResult upload() throws CosXmlServiceException, CosXmlClientException {
        checkParameter();
        return this.fileLength < 2097152 ? putObject(this.bucket, this.cosPath, this.srcPath) : multiUploadParts();
    }
}
