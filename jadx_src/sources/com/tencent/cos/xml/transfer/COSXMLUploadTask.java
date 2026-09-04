package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.cos.xml.utils.CloseUtil;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class COSXMLUploadTask extends COSXMLTask {
    private static Executor executor = Executors.newSingleThreadExecutor();
    private AtomicLong ALREADY_SEND_DATA_LEN;
    private Object SYNC_UPLOAD_PART;
    private final String TAG;
    private AtomicInteger UPLOAD_PART_COUNT;
    private byte[] bytes;
    private CompleteMultiUploadRequest completeMultiUploadRequest;
    private long fileLength;
    boolean forceSimpleUpload;
    private HeadObjectRequest headObjectRequest;
    HttpTaskMetrics httpTaskMetrics;
    private InitMultipartUploadRequest initMultipartUploadRequest;
    private InputStream inputStream;
    private boolean isSliceUpload;
    private ListPartsRequest listPartsRequest;
    protected long multiUploadSizeDivision;
    private MultiUploadsStateListener multiUploadsStateListenerHandler;
    private Map<Integer, SlicePartStruct> partStructMap;
    boolean priorityLow;
    private PutObjectRequest putObjectRequest;
    private AtomicBoolean sendingCompleteRequest;
    private long simpleAlreadySendDataLen;
    protected long sliceSize;
    String srcPath;
    private long startTime;
    private String uploadId;
    private Map<UploadPartRequest, Long> uploadPartRequestLongMap;
    private Uri uri;
    private URL url;
    private UrlUploadPolicy urlUploadPolicy;
    private WeightStrategy weightStrategy;

    public static class COSXMLUploadTaskRequest extends PutObjectRequest {
        protected COSXMLUploadTaskRequest(String str, String str2, String str3, String str4, Map<String, List<String>> map, Map<String, String> map2) {
            super(str2, str3, str4);
            setRegion(str);
            setRequestHeaders(map);
            setQueryParameters(map2);
        }
    }

    public static class COSXMLUploadTaskResult extends CosXmlResult {
        public String eTag;
        public PicUploadResult picUploadResult;

        protected COSXMLUploadTaskResult() {
        }
    }

    public interface MultiUploadsStateListener {
        void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);

        void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

        void onInit();

        void onListParts();

        void onUploadParts();
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

    public static class WeightStrategy {
        private final long DEFAULT_WEIGHT_HIGH_SIZE;
        private final long DEFAULT_WEIGHT_NORMAL_SIZE;
        private long highSize;
        private long normalSize;

        private WeightStrategy() {
            this.DEFAULT_WEIGHT_NORMAL_SIZE = 83886080L;
            this.DEFAULT_WEIGHT_HIGH_SIZE = 157286400L;
            this.normalSize = 83886080L;
            this.highSize = 157286400L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getWeight(long j10) {
            if (j10 > this.highSize) {
                return 2;
            }
            return j10 > this.normalSize ? 1 : 0;
        }
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, PutObjectRequest putObjectRequest, String str) {
        this(cosXmlSimpleService, putObjectRequest.getRegion(), putObjectRequest.getBucket(), putObjectRequest.getPath(cosXmlSimpleService.getConfig()));
        this.uri = putObjectRequest.getUri();
        this.url = putObjectRequest.getUrl();
        this.urlUploadPolicy = putObjectRequest.getUrlUploadPolicy();
        this.srcPath = putObjectRequest.getSrcPath();
        this.bytes = putObjectRequest.getData();
        this.inputStream = putObjectRequest.getInputStream();
        this.queries = putObjectRequest.getQueryString();
        this.headers = putObjectRequest.getRequestHeaders();
        this.isNeedMd5 = putObjectRequest.isNeedMD5();
        this.uploadId = str;
        this.priorityLow = putObjectRequest.isPriorityLow();
    }

    private COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3) {
        this.TAG = "UploadTask";
        this.isSliceUpload = false;
        this.SYNC_UPLOAD_PART = new Object();
        this.startTime = 0L;
        this.simpleAlreadySendDataLen = 0L;
        this.priorityLow = false;
        this.sendingCompleteRequest = new AtomicBoolean(false);
        this.weightStrategy = new WeightStrategy();
        this.multiUploadsStateListenerHandler = new MultiUploadsStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.1
            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                COSXMLUploadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                Exception exc = cosXmlClientException == null ? cosXmlServiceException : cosXmlClientException;
                COSXMLUploadTask.this.reportException(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                COSXMLUploadTask.this.updateState(TransferState.FAILED, exc, null, false);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onInit() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.multiUploadPart(cOSXMLUploadTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onListParts() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.multiUploadPart(cOSXMLUploadTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onUploadParts() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.completeMultiUpload(cOSXMLUploadTask.cosXmlService);
            }
        };
        this.cosXmlService = cosXmlSimpleService;
        this.region = str;
        this.bucket = str2;
        this.cosPath = str3;
        this.httpTaskMetrics = new HttpTaskMetrics();
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, Uri uri, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.uri = uri;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, InputStream inputStream) {
        this(cosXmlSimpleService, str, str2, str3);
        this.inputStream = inputStream;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, String str4, String str5) {
        this(cosXmlSimpleService, str, str2, str3);
        this.srcPath = str4;
        this.uploadId = str5;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, URL url, UrlUploadPolicy urlUploadPolicy, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.url = url;
        this.urlUploadPolicy = urlUploadPolicy;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, URL url, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.url = url;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, byte[] bArr) {
        this(cosXmlSimpleService, str, str2, str3);
        this.bytes = bArr;
    }

    private void abortMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        String str = this.uploadId;
        if (str == null) {
            return;
        }
        AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.cosPath, str);
        abortMultiUploadRequest.setRegion(this.region);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            abortMultiUploadRequest.setSign(onSignatureListener.onGetSign(abortMultiUploadRequest));
        }
        getHttpMetrics(abortMultiUploadRequest, "AbortMultiUploadRequest");
        cosXmlSimpleService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.13
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
            }
        });
    }

    private void clear() {
        Map<UploadPartRequest, Long> map = this.uploadPartRequestLongMap;
        if (map != null) {
            map.clear();
        }
        Map<Integer, SlicePartStruct> map2 = this.partStructMap;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        this.sendingCompleteRequest.set(true);
        CompleteMultiUploadRequest completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.cosPath, this.uploadId, null);
        this.completeMultiUploadRequest = completeMultiUploadRequest;
        completeMultiUploadRequest.setRegion(this.region);
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        while (it.hasNext()) {
            SlicePartStruct value = it.next().getValue();
            this.completeMultiUploadRequest.setPartNumberAndETag(value.partNumber, value.eTag);
        }
        this.completeMultiUploadRequest.setNeedMD5(this.isNeedMd5);
        this.completeMultiUploadRequest.setRequestHeaders(getCustomCompleteHeaders(this.headers));
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            CompleteMultiUploadRequest completeMultiUploadRequest2 = this.completeMultiUploadRequest;
            completeMultiUploadRequest2.setSign(onSignatureListener.onGetSign(completeMultiUploadRequest2));
        }
        getHttpMetrics(this.completeMultiUploadRequest, "CompleteMultiUploadRequest");
        cosXmlSimpleService.completeMultiUploadAsync(this.completeMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.12
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(final CosXmlRequest cosXmlRequest, final CosXmlClientException cosXmlClientException, final CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest != COSXMLUploadTask.this.completeMultiUploadRequest) {
                    return;
                }
                if (cosXmlServiceException != null && "NoSuchUpload".equals(cosXmlServiceException.getErrorCode())) {
                    COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.12.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HeadObjectResult headObjectResultHeadObjectToCheckCRC64 = COSXMLUploadTask.this.headObjectToCheckCRC64();
                            if (headObjectResultHeadObjectToCheckCRC64 != null) {
                                COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, headObjectResultHeadObjectToCheckCRC64);
                            } else {
                                COSXMLUploadTask.this.encounterError(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                            }
                            COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                        }
                    });
                } else {
                    COSXMLUploadTask.this.encounterError(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                    COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest != COSXMLUploadTask.this.completeMultiUploadRequest) {
                    return;
                }
                COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, cosXmlResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchProgressChange(long j10, long j11) {
        CosXmlProgressListener cosXmlProgressListener = this.cosXmlProgressListener;
        if (cosXmlProgressListener != null) {
            cosXmlProgressListener.onProgress(j10, j11);
        }
        CosXmlProgressListener cosXmlProgressListener2 = this.internalProgressListener;
        if (cosXmlProgressListener2 != null) {
            cosXmlProgressListener2.onProgress(j10, j11);
        }
    }

    @p0
    private String getCRCValue(HeadObjectResult headObjectResult) {
        List<String> list = headObjectResult.headers.get(Headers.COS_HASH_CRC64_ECMA);
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    private Map<String, List<String>> getCustomCompleteHeaders(@p0 Map<String, List<String>> map) {
        if (map == null) {
            return new HashMap();
        }
        HashMap map2 = new HashMap(map);
        map2.remove("Content-Type");
        return map2;
    }

    private int getIndexOfParts(List<ListParts.Part> list) {
        if (Integer.valueOf(list.get(0).partNumber).intValue() != 1) {
            return -1;
        }
        int size = list.size();
        int i10 = 0;
        int iIntValue = 1;
        for (int i11 = 1; i11 < size; i11++) {
            ListParts.Part part = list.get(i11);
            if (Integer.valueOf(part.partNumber).intValue() != iIntValue + 1) {
                break;
            }
            iIntValue = Integer.valueOf(part.partNumber).intValue();
            i10 = i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public HeadObjectResult headObjectToCheckCRC64() {
        try {
            HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.cosPath);
            this.headObjectRequest = headObjectRequest;
            HeadObjectResult headObjectResultHeadObject = this.cosXmlService.headObject(headObjectRequest);
            long bigIntFromString = DigestUtils.getBigIntFromString(getCRCValue(headObjectResultHeadObject));
            InputStream inputStreamOpenUploadFileStream = openUploadFileStream();
            long crc64 = DigestUtils.getCRC64(inputStreamOpenUploadFileStream);
            inputStreamOpenUploadFileStream.close();
            if (bigIntFromString == crc64) {
                return headObjectResultHeadObject;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void initMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        InitMultipartUploadRequest initMultipartUploadRequest = new InitMultipartUploadRequest(this.bucket, this.cosPath);
        this.initMultipartUploadRequest = initMultipartUploadRequest;
        initMultipartUploadRequest.setRegion(this.region);
        this.initMultipartUploadRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            InitMultipartUploadRequest initMultipartUploadRequest2 = this.initMultipartUploadRequest;
            initMultipartUploadRequest2.setSign(onSignatureListener.onGetSign(initMultipartUploadRequest2));
        }
        this.httpTaskMetrics.setDomainName(this.initMultipartUploadRequest.getRequestHost(cosXmlSimpleService.getConfig()));
        getHttpMetrics(this.initMultipartUploadRequest, "InitMultipartUploadRequest");
        cosXmlSimpleService.initMultipartUploadAsync(this.initMultipartUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.5
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.initMultipartUploadRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.initMultipartUploadRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.onUpdateInProgress();
                    COSXMLUploadTask.this.uploadId = ((InitMultipartUploadResult) cosXmlResult).initMultipartUpload.uploadId;
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onInit();
                }
            }
        });
    }

    private void initSlicePart(long j10, long j11, int i10) {
        int i11 = (int) (j11 / this.sliceSize);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            SlicePartStruct slicePartStruct = new SlicePartStruct();
            slicePartStruct.isAlreadyUpload = false;
            int i13 = i10 + i12;
            slicePartStruct.partNumber = i13;
            long j12 = this.sliceSize;
            slicePartStruct.offset = (((long) i12) * j12) + j10;
            slicePartStruct.sliceSize = j12;
            this.partStructMap.put(Integer.valueOf(i13), slicePartStruct);
            i12++;
        }
        if (j11 % this.sliceSize != 0) {
            SlicePartStruct slicePartStruct2 = new SlicePartStruct();
            slicePartStruct2.isAlreadyUpload = false;
            int i14 = i10 + i11;
            slicePartStruct2.partNumber = i14;
            long j13 = (((long) i11) * this.sliceSize) + j10;
            slicePartStruct2.offset = j13;
            slicePartStruct2.sliceSize = (j10 + j11) - j13;
            this.partStructMap.put(Integer.valueOf(i14), slicePartStruct2);
            i11++;
        }
        this.UPLOAD_PART_COUNT.set((i10 + i11) - 1);
        this.IS_EXIT.get();
    }

    private boolean isFixSliceSize(List<ListParts.Part> list) {
        for (ListParts.Part part : list) {
            if (this.partStructMap.containsKey(Integer.valueOf(part.partNumber)) && this.partStructMap.get(Integer.valueOf(part.partNumber)).sliceSize != Long.valueOf(part.size).longValue()) {
                return false;
            }
        }
        return true;
    }

    private void listMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        ListPartsRequest listPartsRequest = new ListPartsRequest(this.bucket, this.cosPath, this.uploadId);
        this.listPartsRequest = listPartsRequest;
        listPartsRequest.setRegion(this.region);
        this.listPartsRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            ListPartsRequest listPartsRequest2 = this.listPartsRequest;
            listPartsRequest2.setSign(onSignatureListener.onGetSign(listPartsRequest2));
        }
        this.httpTaskMetrics.setDomainName(this.listPartsRequest.getRequestHost(cosXmlSimpleService.getConfig()));
        getHttpMetrics(this.listPartsRequest, "ListPartsRequest");
        this.listPartsRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.6
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i10) {
                if (COSXMLUploadTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLUploadTask.this.onUpdateInProgress();
            }
        });
        cosXmlSimpleService.listPartsAsync(this.listPartsRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.7
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(final CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.listPartsRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    if (cosXmlServiceException != null && "NoSuchUpload".equals(cosXmlServiceException.getErrorCode())) {
                        COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.7.2
                            @Override // java.lang.Runnable
                            public void run() {
                                HeadObjectResult headObjectResultHeadObjectToCheckCRC64 = COSXMLUploadTask.this.headObjectToCheckCRC64();
                                if (headObjectResultHeadObjectToCheckCRC64 != null) {
                                    COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, headObjectResultHeadObjectToCheckCRC64);
                                } else {
                                    if (COSXMLUploadTask.this.IS_EXIT.get()) {
                                        return;
                                    }
                                    COSXMLUploadTask.this.reTrans();
                                }
                            }
                        });
                    } else {
                        COSXMLUploadTask.this.IS_EXIT.set(true);
                        COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                    }
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, final CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.listPartsRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    if (COSXMLUploadTask.this.url == null) {
                        COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.7.1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v0 */
                            /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.cos.xml.exception.CosXmlClientException, java.lang.Throwable] */
                            /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
                            /* JADX WARN: Type inference failed for: r0v13 */
                            /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable, java.io.InputStream] */
                            /* JADX WARN: Type inference failed for: r0v15 */
                            /* JADX WARN: Type inference failed for: r0v16 */
                            /* JADX WARN: Type inference failed for: r0v17 */
                            /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
                            /* JADX WARN: Type inference failed for: r0v4 */
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean zVerifyUploadParts;
                                ?? e10 = 0;
                                e10 = 0;
                                try {
                                    try {
                                        try {
                                            e10 = COSXMLUploadTask.this.openUploadFileStream();
                                            zVerifyUploadParts = COSXMLUploadTask.this.verifyUploadParts(((ListPartsResult) cosXmlResult).listParts, e10);
                                            if (e10 != 0) {
                                                CloseUtil.closeQuietly(e10);
                                                e10 = e10;
                                            }
                                        } catch (Throwable th2) {
                                            if (e10 != 0) {
                                                try {
                                                    CloseUtil.closeQuietly(e10);
                                                } catch (CosXmlClientException e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                            throw th2;
                                        }
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        zVerifyUploadParts = false;
                                        if (e10 != 0) {
                                            CloseUtil.closeQuietly(e10);
                                            e10 = e10;
                                        }
                                    }
                                } catch (CosXmlClientException e13) {
                                    e10 = e13;
                                    e10.printStackTrace();
                                }
                                if (!zVerifyUploadParts) {
                                    COSXMLUploadTask.this.reTrans();
                                } else {
                                    COSXMLUploadTask.this.updateSlicePart((ListPartsResult) cosXmlResult);
                                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onListParts();
                                }
                            }
                        });
                    } else {
                        COSXMLUploadTask.this.updateSlicePart((ListPartsResult) cosXmlResult);
                        COSXMLUploadTask.this.multiUploadsStateListenerHandler.onListParts();
                    }
                }
            }
        });
    }

    private void multiUpload(CosXmlSimpleService cosXmlSimpleService) {
        initSlicePart(0L, this.fileLength, 1);
        if (TextUtils.isEmpty(this.uploadId)) {
            initMultiUpload(cosXmlSimpleService);
        } else {
            listMultiUpload(cosXmlSimpleService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void multiUploadPart(CosXmlSimpleService cosXmlSimpleService) {
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            final SlicePartStruct value = it.next().getValue();
            if (!value.isAlreadyUpload && !this.IS_EXIT.get()) {
                String str = this.srcPath;
                final UploadPartRequest uploadPartRequest = str != null ? new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, str, value.offset, value.sliceSize, this.uploadId) : null;
                Uri uri = this.uri;
                if (uri != null) {
                    uploadPartRequest = new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, uri, value.offset, value.sliceSize, this.uploadId);
                }
                URL url = this.url;
                if (url != null) {
                    uploadPartRequest = new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, url, value.offset, value.sliceSize, this.uploadId);
                }
                if (this.priorityLow) {
                    uploadPartRequest.setPriorityLow();
                }
                uploadPartRequest.setRegion(this.region);
                if (this.url == null) {
                    uploadPartRequest.setNeedMD5(this.isNeedMd5);
                } else {
                    uploadPartRequest.setNeedMD5(false);
                }
                uploadPartRequest.setRequestHeaders(this.headers);
                uploadPartRequest.setOnRequestWeightListener(new CosXmlRequest.OnRequestWeightListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.9
                    @Override // com.tencent.cos.xml.model.CosXmlRequest.OnRequestWeightListener
                    public int onWeight() {
                        return COSXMLUploadTask.this.weightStrategy.getWeight(COSXMLUploadTask.this.ALREADY_SEND_DATA_LEN.get());
                    }
                });
                COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
                if (onSignatureListener != null) {
                    uploadPartRequest.setSign(onSignatureListener.onGetSign(uploadPartRequest));
                }
                getHttpMetrics(uploadPartRequest, "UploadPartRequest");
                this.uploadPartRequestLongMap.put(uploadPartRequest, 0L);
                uploadPartRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.10
                    @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                    public void onProgress(long j10, long j11) {
                        if (COSXMLUploadTask.this.IS_EXIT.get()) {
                            return;
                        }
                        try {
                            long jAddAndGet = COSXMLUploadTask.this.ALREADY_SEND_DATA_LEN.addAndGet(j10 - ((Long) COSXMLUploadTask.this.uploadPartRequestLongMap.get(uploadPartRequest)).longValue());
                            COSXMLUploadTask.this.uploadPartRequestLongMap.put(uploadPartRequest, Long.valueOf(j10));
                            COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                            cOSXMLUploadTask.dispatchProgressChange(jAddAndGet, cOSXMLUploadTask.fileLength);
                        } catch (Exception unused) {
                        }
                    }
                });
                cosXmlSimpleService.uploadPartAsync(uploadPartRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.11
                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                        if (cosXmlRequest == uploadPartRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                            COSXMLUploadTask.this.IS_EXIT.set(true);
                            COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                        }
                    }

                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                        if (cosXmlRequest != uploadPartRequest) {
                            return;
                        }
                        COSXMLUploadTask.this.httpTaskMetrics.merge(cosXmlRequest.getMetrics());
                        if (COSXMLUploadTask.this.IS_EXIT.get()) {
                            return;
                        }
                        SlicePartStruct slicePartStruct = value;
                        slicePartStruct.eTag = ((UploadPartResult) cosXmlResult).eTag;
                        slicePartStruct.isAlreadyUpload = true;
                        synchronized (COSXMLUploadTask.this.SYNC_UPLOAD_PART) {
                            COSXMLUploadTask.this.UPLOAD_PART_COUNT.decrementAndGet();
                            if (COSXMLUploadTask.this.UPLOAD_PART_COUNT.get() == 0) {
                                COSXMLUploadTask.this.multiUploadsStateListenerHandler.onUploadParts();
                            }
                        }
                    }
                });
                z10 = false;
            }
        }
        if (!z10 || this.IS_EXIT.get()) {
            return;
        }
        long j10 = this.fileLength;
        dispatchProgressChange(j10, j10);
        this.multiUploadsStateListenerHandler.onUploadParts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTransferComplete(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
        cosXmlRequest.attachMetrics(this.httpTaskMetrics);
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        BeaconService.getInstance().reportUploadTaskSuccess(cosXmlRequest);
        this.multiUploadsStateListenerHandler.onCompleted(cosXmlRequest, cosXmlResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUpdateInProgress() {
        updateState(TransferState.IN_PROGRESS, null, null, false);
        Timer timer = this.waitTimeoutTimer;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream openUploadFileStream() throws IOException {
        if (this.srcPath != null) {
            return new FileInputStream(this.srcPath);
        }
        if (this.uri == null) {
            throw new IOException("There is no src file path or uri!");
        }
        if (ContextHolder.getAppContext() != null) {
            return ContextHolder.getAppContext().getContentResolver().openInputStream(this.uri);
        }
        throw new IOException("Open src file failed, Application context is null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reTrans() {
        this.uploadId = null;
        startUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportException(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (cosXmlRequest == null) {
            cosXmlRequest = buildCOSXMLTaskRequest();
        }
        if (cosXmlClientException != null) {
            BeaconService.getInstance().reportUploadTaskClientException(cosXmlRequest, cosXmlClientException);
        }
        if (cosXmlServiceException != null) {
            BeaconService.getInstance().reportUploadTaskServiceException(cosXmlRequest, cosXmlServiceException);
        }
    }

    private void simpleUpload(CosXmlSimpleService cosXmlSimpleService) {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, bArr);
        } else {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, inputStream);
            } else {
                Uri uri = this.uri;
                if (uri != null) {
                    this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, uri);
                } else {
                    URL url = this.url;
                    if (url != null) {
                        this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, url);
                    } else {
                        this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, this.srcPath);
                    }
                }
            }
        }
        this.putObjectRequest.setRegion(this.region);
        if (this.url != null) {
            this.putObjectRequest.setNeedMD5(false);
        } else {
            this.putObjectRequest.setNeedMD5(this.isNeedMd5);
        }
        this.putObjectRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            PutObjectRequest putObjectRequest = this.putObjectRequest;
            putObjectRequest.setSign(onSignatureListener.onGetSign(putObjectRequest));
        }
        getHttpMetrics(this.putObjectRequest, "PutObjectRequest");
        this.putObjectRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.2
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i10) {
                if (COSXMLUploadTask.this.IS_EXIT.get()) {
                    return;
                }
                if (i10 == 2 || i10 == 3) {
                    COSXMLUploadTask.this.onUpdateInProgress();
                }
            }
        });
        this.putObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.3
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j10, long j11) {
                COSXMLUploadTask.this.simpleAlreadySendDataLen = j10;
                COSXMLUploadTask.this.dispatchProgressChange(j10, j11);
            }
        });
        if (this.priorityLow) {
            this.putObjectRequest.setPriorityLow();
        }
        cosXmlSimpleService.putObjectAsync(this.putObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.4
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.putObjectRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.putObjectRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    BeaconService.getInstance().reportUploadTaskSuccess(cosXmlRequest);
                    COSXMLUploadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSlicePart(ListPartsResult listPartsResult) {
        ListParts listParts;
        List<ListParts.Part> list;
        if (listPartsResult == null || (listParts = listPartsResult.listParts) == null || (list = listParts.parts) == null || list.size() <= 0) {
            return;
        }
        if (isFixSliceSize(list)) {
            for (ListParts.Part part : list) {
                if (this.partStructMap.containsKey(Integer.valueOf(part.partNumber))) {
                    SlicePartStruct slicePartStruct = this.partStructMap.get(Integer.valueOf(part.partNumber));
                    slicePartStruct.isAlreadyUpload = true;
                    slicePartStruct.eTag = part.eTag;
                    this.UPLOAD_PART_COUNT.decrementAndGet();
                    this.ALREADY_SEND_DATA_LEN.addAndGet(Long.parseLong(part.size));
                }
            }
            return;
        }
        Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.14
            @Override // java.util.Comparator
            public int compare(ListParts.Part part2, ListParts.Part part3) {
                int iIntValue = Integer.valueOf(part2.partNumber).intValue();
                int iIntValue2 = Integer.valueOf(part3.partNumber).intValue();
                if (iIntValue > iIntValue2) {
                    return 1;
                }
                return iIntValue < iIntValue2 ? -1 : 0;
            }
        });
        int indexOfParts = getIndexOfParts(list);
        if (indexOfParts < 0) {
            return;
        }
        this.partStructMap.clear();
        long j10 = 0;
        int i10 = 0;
        while (i10 <= indexOfParts) {
            ListParts.Part part2 = list.get(i10);
            SlicePartStruct slicePartStruct2 = new SlicePartStruct();
            i10++;
            slicePartStruct2.partNumber = i10;
            slicePartStruct2.offset = j10;
            long j11 = Long.parseLong(part2.size);
            slicePartStruct2.sliceSize = j11;
            slicePartStruct2.eTag = part2.eTag;
            slicePartStruct2.isAlreadyUpload = true;
            j10 += j11;
            this.partStructMap.put(Integer.valueOf(i10), slicePartStruct2);
        }
        this.ALREADY_SEND_DATA_LEN.addAndGet(j10);
        initSlicePart(j10, this.fileLength - j10, indexOfParts + 2);
        for (int i11 = 0; i11 <= indexOfParts; i11++) {
            this.UPLOAD_PART_COUNT.decrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean verifyUploadParts(ListParts listParts, InputStream inputStream) throws IOException {
        List<ListParts.Part> list = listParts.parts;
        Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.8
            @Override // java.util.Comparator
            public int compare(ListParts.Part part, ListParts.Part part2) {
                int iIntValue = Integer.valueOf(part.partNumber).intValue();
                int iIntValue2 = Integer.valueOf(part2.partNumber).intValue();
                if (iIntValue > iIntValue2) {
                    return 1;
                }
                return iIntValue < iIntValue2 ? -1 : 0;
            }
        });
        boolean zIsFixSliceSize = isFixSliceSize(list);
        int i10 = 0;
        boolean z10 = true;
        for (ListParts.Part part : list) {
            int i11 = Integer.parseInt(part.partNumber);
            z10 = z10 && i10 + 1 == i11;
            if (!zIsFixSliceSize && !z10) {
                return true;
            }
            String cOSMd5 = DigestUtils.getCOSMd5(inputStream, ((long) ((i11 - i10) - 1)) * this.sliceSize, Long.parseLong(part.size));
            if (!part.eTag.equals(cOSMd5)) {
                QCloudLogger.i("UploadTask", "verify upload parts failed, part number " + part.partNumber + ", etag " + part.eTag + ", but local md5 is " + cOSMd5, new Object[0]);
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlRequest buildCOSXMLTaskRequest() {
        return new COSXMLUploadTaskRequest(this.region, this.bucket, this.cosPath, this.srcPath, this.headers, this.queries);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult) {
        COSXMLUploadTaskResult cOSXMLUploadTaskResult = new COSXMLUploadTaskResult();
        if (cosXmlResult != null && (cosXmlResult instanceof PutObjectResult)) {
            PutObjectResult putObjectResult = (PutObjectResult) cosXmlResult;
            cOSXMLUploadTaskResult.httpCode = putObjectResult.httpCode;
            cOSXMLUploadTaskResult.httpMessage = putObjectResult.httpMessage;
            cOSXMLUploadTaskResult.headers = putObjectResult.headers;
            cOSXMLUploadTaskResult.eTag = putObjectResult.eTag;
            cOSXMLUploadTaskResult.accessUrl = putObjectResult.accessUrl;
            cOSXMLUploadTaskResult.picUploadResult = putObjectResult.picUploadResult();
        } else if (cosXmlResult != null && (cosXmlResult instanceof CompleteMultiUploadResult)) {
            CompleteMultiUploadResult completeMultiUploadResult = (CompleteMultiUploadResult) cosXmlResult;
            cOSXMLUploadTaskResult.httpCode = completeMultiUploadResult.httpCode;
            cOSXMLUploadTaskResult.httpMessage = completeMultiUploadResult.httpMessage;
            cOSXMLUploadTaskResult.headers = completeMultiUploadResult.headers;
            cOSXMLUploadTaskResult.eTag = completeMultiUploadResult.completeMultipartUpload.eTag;
            cOSXMLUploadTaskResult.accessUrl = completeMultiUploadResult.accessUrl;
            PicUploadResult picUploadResult = new PicUploadResult();
            picUploadResult.originalInfo = completeMultiUploadResult.completeMultipartUpload.getOriginInfo();
            picUploadResult.processResults = completeMultiUploadResult.completeMultipartUpload.processResults;
            cOSXMLUploadTaskResult.picUploadResult = picUploadResult;
        }
        return cOSXMLUploadTaskResult;
    }

    void cancelAllRequest(CosXmlSimpleService cosXmlSimpleService) {
        HeadObjectRequest headObjectRequest = this.headObjectRequest;
        if (headObjectRequest != null) {
            cosXmlSimpleService.cancel(headObjectRequest);
        }
        PutObjectRequest putObjectRequest = this.putObjectRequest;
        if (putObjectRequest != null) {
            cosXmlSimpleService.cancel(putObjectRequest);
        }
        InitMultipartUploadRequest initMultipartUploadRequest = this.initMultipartUploadRequest;
        if (initMultipartUploadRequest != null) {
            cosXmlSimpleService.cancel(initMultipartUploadRequest);
        }
        ListPartsRequest listPartsRequest = this.listPartsRequest;
        if (listPartsRequest != null) {
            cosXmlSimpleService.cancel(listPartsRequest);
        }
        Map<UploadPartRequest, Long> map = this.uploadPartRequestLongMap;
        if (map != null) {
            Iterator<UploadPartRequest> it = map.keySet().iterator();
            while (it.hasNext()) {
                cosXmlSimpleService.cancel(it.next());
            }
        }
        CompleteMultiUploadRequest completeMultiUploadRequest = this.completeMultiUploadRequest;
        if (completeMultiUploadRequest != null) {
            cosXmlSimpleService.cancel(completeMultiUploadRequest);
        }
    }

    protected boolean checkParameter() {
        UrlUploadPolicy urlUploadPolicy;
        Context appContext;
        if (this.bytes == null && this.inputStream == null && this.srcPath == null && this.uri == null && this.url == null) {
            if (this.IS_EXIT.get()) {
                return false;
            }
            this.IS_EXIT.set(true);
            this.multiUploadsStateListenerHandler.onFailed(new PutObjectRequest(this.bucket, this.cosPath, ""), new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "source is is invalid: null"), null);
            return false;
        }
        if (this.srcPath != null) {
            File file = new File(this.srcPath);
            if (!file.exists() || file.isDirectory() || !file.canRead()) {
                if (this.IS_EXIT.get()) {
                    return false;
                }
                this.IS_EXIT.set(true);
                this.multiUploadsStateListenerHandler.onFailed(new PutObjectRequest(this.bucket, this.cosPath, this.srcPath), new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "srcPath is is invalid: " + this.srcPath), null);
                return false;
            }
            this.fileLength = file.length();
        }
        if (this.uri != null && (appContext = ContextHolder.getAppContext()) != null) {
            this.fileLength = QCloudUtils.getUriContentLength2(this.uri, appContext.getContentResolver());
        }
        if (this.url != null && (urlUploadPolicy = this.urlUploadPolicy) != null) {
            if (urlUploadPolicy.getDownloadType() == UrlUploadPolicy.Type.NOTSUPPORT) {
                if (this.IS_EXIT.get()) {
                    return false;
                }
                COSXMLTask.monitor.sendStateMessage(this, TransferState.FAILED, new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "url not support download"), null, 1);
                this.IS_EXIT.set(true);
                return false;
            }
            this.fileLength = this.urlUploadPolicy.getFileLength();
        }
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void encounterError(@p0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        MultiUploadsStateListener multiUploadsStateListener = this.multiUploadsStateListenerHandler;
        if (cosXmlRequest == null) {
            cosXmlRequest = buildCOSXMLTaskRequest();
        }
        multiUploadsStateListener.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
    }

    public boolean getSendingCompleteRequest() {
        return this.sendingCompleteRequest.get();
    }

    public String getUploadId() {
        return this.uploadId;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCancel() {
        cancelAllRequest(this.cosXmlService);
        if (this.isSliceUpload) {
            abortMultiUpload(this.cosXmlService);
        }
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCompleted() {
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalFailed() {
        cancelAllRequest(this.cosXmlService);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalPause() {
        CosXmlRequest cosXmlRequestBuildCOSXMLTaskRequest = buildCOSXMLTaskRequest();
        cosXmlRequestBuildCOSXMLTaskRequest.attachMetrics(this.httpTaskMetrics);
        BeaconService.getInstance().reportUploadTaskSuccess(cosXmlRequestBuildCOSXMLTaskRequest);
        cancelAllRequest(this.cosXmlService);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalResume() {
        this.taskState = TransferState.WAITING;
        this.IS_EXIT.set(false);
        upload();
    }

    public boolean pauseSafely() {
        if (this.sendingCompleteRequest.get()) {
            return false;
        }
        pause();
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    public void resume() {
        if (this.inputStream == null) {
            super.resume();
        } else {
            if (this.IS_EXIT.get()) {
                return;
            }
            this.IS_EXIT.set(true);
            this.multiUploadsStateListenerHandler.onFailed(buildCOSXMLTaskRequest(), new CosXmlClientException(ClientErrorCode.SINK_SOURCE_NOT_FOUND.getCode(), "inputStream closed"), null);
        }
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    protected void startUpload() {
        if (this.bytes != null || this.inputStream != null) {
            simpleUpload(this.cosXmlService);
            return;
        }
        if (this.fileLength < this.multiUploadSizeDivision || this.forceSimpleUpload) {
            simpleUpload(this.cosXmlService);
            return;
        }
        this.isSliceUpload = true;
        this.UPLOAD_PART_COUNT = new AtomicInteger(0);
        this.ALREADY_SEND_DATA_LEN = new AtomicLong(0L);
        this.partStructMap = new LinkedHashMap();
        this.uploadPartRequestLongMap = new LinkedHashMap();
        multiUpload(this.cosXmlService);
    }

    protected void upload() {
        if (checkParameter()) {
            this.startTime = System.nanoTime();
            startUpload();
        }
    }
}
