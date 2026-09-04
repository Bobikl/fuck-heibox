package com.tencent.cos.xml.transfer;

import androidx.annotation.p0;
import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.CopyObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.UploadPartCopyRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyResult;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class COSXMLCopyTask extends COSXMLTask {
    private AtomicBoolean IS_EXIT;
    private Object SYNC_UPLOAD_PART;
    private AtomicInteger UPLOAD_PART_COUNT;
    private CompleteMultiUploadRequest completeMultiUploadRequest;
    private CopyObjectRequest copyObjectRequest;
    private Map<Integer, CopyPartStruct> copyPartStructMap;
    private CopyObjectRequest.CopySourceStruct copySourceStruct;
    private long fileLength;
    private HeadObjectRequest headObjectRequest;
    private HttpTaskMetrics httpTaskMetrics;
    private InitMultipartUploadRequest initMultipartUploadRequest;
    private boolean isLargeCopy;
    private LargeCopyStateListener largeCopyStateListenerHandler;
    private ListPartsRequest listPartsRequest;
    protected long multiCopySizeDivision;
    protected long sliceSize;
    private String uploadId;
    private List<UploadPartCopyRequest> uploadPartCopyRequestList;

    public static class COSXMLCopyTaskRequest extends CopyObjectRequest {
        protected COSXMLCopyTaskRequest(String str, String str2, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct, Map<String, List<String>> map, Map<String, String> map2) {
            super(str2, str3, copySourceStruct);
            setRegion(str);
            setRequestHeaders(map);
            setQueryParameters(map2);
        }
    }

    public static class COSXMLCopyTaskResult extends CosXmlResult {
        public String eTag;

        protected COSXMLCopyTaskResult() {
        }
    }

    public static class CopyPartStruct {
        public String eTag;
        public long end;
        public boolean isAlreadyUpload;
        public int partNumber;
        public long start;

        private CopyPartStruct() {
        }
    }

    public interface LargeCopyStateListener {
        void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);

        void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

        void onInit();

        void onListParts();

        void onUploadPartCopy();
    }

    COSXMLCopyTask(CosXmlSimpleService cosXmlSimpleService, CopyObjectRequest copyObjectRequest) {
        this(cosXmlSimpleService, copyObjectRequest.getRegion(), copyObjectRequest.getBucket(), copyObjectRequest.getPath(cosXmlSimpleService.getConfig()), copyObjectRequest.getCopySource());
        this.queries = copyObjectRequest.getQueryString();
        this.headers = copyObjectRequest.getRequestHeaders();
        this.isNeedMd5 = copyObjectRequest.isNeedMD5();
    }

    COSXMLCopyTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct) {
        this.isLargeCopy = false;
        this.IS_EXIT = new AtomicBoolean(false);
        this.SYNC_UPLOAD_PART = new Object();
        this.httpTaskMetrics = new HttpTaskMetrics();
        this.largeCopyStateListenerHandler = new LargeCopyStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.1
            @Override // com.tencent.cos.xml.transfer.COSXMLCopyTask.LargeCopyStateListener
            public void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                COSXMLCopyTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLCopyTask.LargeCopyStateListener
            public void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                Exception exc = cosXmlClientException != null ? cosXmlClientException : cosXmlServiceException;
                COSXMLCopyTask.this.reportException(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                COSXMLCopyTask.this.updateState(TransferState.FAILED, exc, null, false);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLCopyTask.LargeCopyStateListener
            public void onInit() {
                COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                cOSXMLCopyTask.uploadPartCopy(cOSXMLCopyTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLCopyTask.LargeCopyStateListener
            public void onListParts() {
                COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                cOSXMLCopyTask.uploadPartCopy(cOSXMLCopyTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLCopyTask.LargeCopyStateListener
            public void onUploadPartCopy() {
                COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                cOSXMLCopyTask.completeMultiUpload(cOSXMLCopyTask.cosXmlService);
            }
        };
        this.cosXmlService = cosXmlSimpleService;
        this.region = str;
        this.bucket = str2;
        this.cosPath = str3;
        this.copySourceStruct = copySourceStruct;
    }

    private void abortMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        String str = this.uploadId;
        if (str == null) {
            return;
        }
        AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.cosPath, str);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            abortMultiUploadRequest.setSign(onSignatureListener.onGetSign(abortMultiUploadRequest));
        }
        getHttpMetrics(abortMultiUploadRequest, "AbortMultiUploadRequest");
        cosXmlSimpleService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.7
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
            }
        });
    }

    private void cancelAllRequest(CosXmlSimpleService cosXmlSimpleService) {
        HeadObjectRequest headObjectRequest = this.headObjectRequest;
        if (headObjectRequest != null) {
            cosXmlSimpleService.cancel(headObjectRequest);
        }
        CopyObjectRequest copyObjectRequest = this.copyObjectRequest;
        if (copyObjectRequest != null) {
            cosXmlSimpleService.cancel(copyObjectRequest);
        }
        InitMultipartUploadRequest initMultipartUploadRequest = this.initMultipartUploadRequest;
        if (initMultipartUploadRequest != null) {
            cosXmlSimpleService.cancel(initMultipartUploadRequest);
        }
        ListPartsRequest listPartsRequest = this.listPartsRequest;
        if (listPartsRequest != null) {
            cosXmlSimpleService.cancel(listPartsRequest);
        }
        List<UploadPartCopyRequest> list = this.uploadPartCopyRequestList;
        if (list != null) {
            Iterator<UploadPartCopyRequest> it = list.iterator();
            while (it.hasNext()) {
                cosXmlSimpleService.cancel(it.next());
            }
        }
        CompleteMultiUploadRequest completeMultiUploadRequest = this.completeMultiUploadRequest;
        if (completeMultiUploadRequest != null) {
            cosXmlSimpleService.cancel(completeMultiUploadRequest);
        }
    }

    private void clear() {
        List<UploadPartCopyRequest> list = this.uploadPartCopyRequestList;
        if (list != null) {
            list.clear();
        }
        Map<Integer, CopyPartStruct> map = this.copyPartStructMap;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        this.completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.cosPath, this.uploadId, null);
        Iterator<Map.Entry<Integer, CopyPartStruct>> it = this.copyPartStructMap.entrySet().iterator();
        while (it.hasNext()) {
            CopyPartStruct value = it.next().getValue();
            this.completeMultiUploadRequest.setPartNumberAndETag(value.partNumber, value.eTag);
        }
        this.completeMultiUploadRequest.setNeedMD5(this.isNeedMd5);
        this.completeMultiUploadRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            CompleteMultiUploadRequest completeMultiUploadRequest = this.completeMultiUploadRequest;
            completeMultiUploadRequest.setSign(onSignatureListener.onGetSign(completeMultiUploadRequest));
        }
        getHttpMetrics(this.completeMultiUploadRequest, "CompleteMultiUploadRequest");
        cosXmlSimpleService.completeMultiUploadAsync(this.completeMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.6
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLCopyTask.this.completeMultiUploadRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLCopyTask.this.completeMultiUploadRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    cosXmlRequest.attachMetrics(COSXMLCopyTask.this.httpTaskMetrics.merge(cosXmlRequest.getMetrics()));
                    BeaconService.getInstance().reportCopyTaskSuccess(cosXmlRequest);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onCompleted(cosXmlRequest, cosXmlResult);
                }
            }
        });
    }

    private synchronized void initCopyPart() {
        int i10 = (int) (this.fileLength / this.sliceSize);
        int i11 = 1;
        while (true) {
            if (i11 < i10) {
                CopyPartStruct copyPartStruct = new CopyPartStruct();
                copyPartStruct.isAlreadyUpload = false;
                copyPartStruct.partNumber = i11;
                long j10 = this.sliceSize;
                copyPartStruct.start = ((long) (i11 - 1)) * j10;
                long j11 = i11;
                Long.signum(j11);
                copyPartStruct.end = (j11 * j10) - 1;
                this.copyPartStructMap.put(Integer.valueOf(i11), copyPartStruct);
                i11++;
            } else {
                CopyPartStruct copyPartStruct2 = new CopyPartStruct();
                copyPartStruct2.isAlreadyUpload = false;
                copyPartStruct2.partNumber = i11;
                copyPartStruct2.start = ((long) (i11 - 1)) * this.sliceSize;
                copyPartStruct2.end = this.fileLength - 1;
                this.copyPartStructMap.put(Integer.valueOf(i11), copyPartStruct2);
                this.UPLOAD_PART_COUNT.set(i11);
            }
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
        getHttpMetrics(this.initMultipartUploadRequest, "InitMultipartUploadRequest");
        cosXmlSimpleService.initMultipartUploadAsync(this.initMultipartUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.3
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLCopyTask.this.initMultipartUploadRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLCopyTask.this.initMultipartUploadRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                    cOSXMLCopyTask.httpTaskMetrics = cOSXMLCopyTask.httpTaskMetrics.merge(cosXmlRequest.getMetrics());
                    COSXMLCopyTask.this.uploadId = ((InitMultipartUploadResult) cosXmlResult).initMultipartUpload.uploadId;
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onInit();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void largeFileCopy(CosXmlSimpleService cosXmlSimpleService) {
        initCopyPart();
        if (this.uploadId == null) {
            initMultiUpload(cosXmlSimpleService);
        } else {
            listMultiUpload(cosXmlSimpleService);
        }
    }

    private void listMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        ListPartsRequest listPartsRequest = new ListPartsRequest(this.bucket, this.cosPath, this.uploadId);
        this.listPartsRequest = listPartsRequest;
        listPartsRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            ListPartsRequest listPartsRequest2 = this.listPartsRequest;
            listPartsRequest2.setSign(onSignatureListener.onGetSign(listPartsRequest2));
        }
        getHttpMetrics(this.listPartsRequest, "ListPartsRequest");
        cosXmlSimpleService.listPartsAsync(this.listPartsRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.4
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLCopyTask.this.listPartsRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLCopyTask.this.listPartsRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                    cOSXMLCopyTask.httpTaskMetrics = cOSXMLCopyTask.httpTaskMetrics.merge(cosXmlRequest.getMetrics());
                    COSXMLCopyTask.this.updateSlicePart((ListPartsResult) cosXmlResult);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onListParts();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportException(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (cosXmlClientException != null) {
            BeaconService.getInstance().reportCopyTaskClientException(cosXmlRequest, cosXmlClientException);
        }
        if (cosXmlServiceException != null) {
            BeaconService.getInstance().reportCopyTaskServiceException(cosXmlRequest, cosXmlServiceException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void smallFileCopy() {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(this.bucket, this.cosPath, this.copySourceStruct);
        this.copyObjectRequest = copyObjectRequest;
        copyObjectRequest.setRegion(this.region);
        this.copyObjectRequest.setRequestHeaders(this.headers);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            CopyObjectRequest copyObjectRequest2 = this.copyObjectRequest;
            copyObjectRequest2.setSign(onSignatureListener.onGetSign(copyObjectRequest2));
        }
        getHttpMetrics(this.copyObjectRequest, "CopyObjectRequest");
        this.cosXmlService.copyObjectAsync(this.copyObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.2
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLCopyTask.this.copyObjectRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLCopyTask.this.copyObjectRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                    COSXMLCopyTask.this.IS_EXIT.set(true);
                    BeaconService.getInstance().reportCopyTaskSuccess(cosXmlRequest);
                    COSXMLCopyTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSlicePart(ListPartsResult listPartsResult) {
        ListParts listParts;
        List<ListParts.Part> list;
        if (listPartsResult == null || (listParts = listPartsResult.listParts) == null || (list = listParts.parts) == null) {
            return;
        }
        for (ListParts.Part part : list) {
            if (this.copyPartStructMap.containsKey(Integer.valueOf(part.partNumber))) {
                CopyPartStruct copyPartStruct = this.copyPartStructMap.get(Integer.valueOf(part.partNumber));
                copyPartStruct.isAlreadyUpload = true;
                copyPartStruct.eTag = part.eTag;
                this.UPLOAD_PART_COUNT.decrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadPartCopy(CosXmlSimpleService cosXmlSimpleService) {
        Iterator<Map.Entry<Integer, CopyPartStruct>> it = this.copyPartStructMap.entrySet().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            final CopyPartStruct value = it.next().getValue();
            if (!value.isAlreadyUpload && !this.IS_EXIT.get()) {
                z10 = false;
                final UploadPartCopyRequest uploadPartCopyRequest = new UploadPartCopyRequest(this.bucket, this.cosPath, value.partNumber, this.uploadId, this.copySourceStruct, value.start, value.end);
                uploadPartCopyRequest.setRegion(this.region);
                uploadPartCopyRequest.setRequestHeaders(this.headers);
                COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
                if (onSignatureListener != null) {
                    uploadPartCopyRequest.setSign(onSignatureListener.onGetSign(uploadPartCopyRequest));
                }
                getHttpMetrics(uploadPartCopyRequest, "UploadPartCopyRequest");
                this.uploadPartCopyRequestList.add(uploadPartCopyRequest);
                cosXmlSimpleService.copyObjectAsync(uploadPartCopyRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.5
                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                        if (cosXmlRequest == uploadPartCopyRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                            COSXMLCopyTask.this.IS_EXIT.set(true);
                            COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                        }
                    }

                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                        if (cosXmlRequest == uploadPartCopyRequest && !COSXMLCopyTask.this.IS_EXIT.get()) {
                            COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                            cOSXMLCopyTask.httpTaskMetrics = cOSXMLCopyTask.httpTaskMetrics.merge(cosXmlRequest.getMetrics());
                            CopyPartStruct copyPartStruct = value;
                            copyPartStruct.eTag = ((UploadPartCopyResult) cosXmlResult).copyObject.eTag;
                            copyPartStruct.isAlreadyUpload = true;
                            synchronized (COSXMLCopyTask.this.SYNC_UPLOAD_PART) {
                                COSXMLCopyTask.this.UPLOAD_PART_COUNT.decrementAndGet();
                                if (COSXMLCopyTask.this.UPLOAD_PART_COUNT.get() == 0) {
                                    COSXMLCopyTask.this.largeCopyStateListenerHandler.onUploadPartCopy();
                                }
                            }
                        }
                    }
                });
            }
        }
        if (!z10 || this.IS_EXIT.get()) {
            return;
        }
        this.largeCopyStateListenerHandler.onUploadPartCopy();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlRequest buildCOSXMLTaskRequest() {
        return new COSXMLCopyTaskRequest(this.region, this.bucket, this.cosPath, this.copySourceStruct, this.headers, this.queries);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult) {
        COSXMLCopyTaskResult cOSXMLCopyTaskResult = new COSXMLCopyTaskResult();
        if (cosXmlResult != null && (cosXmlResult instanceof CopyObjectResult)) {
            CopyObjectResult copyObjectResult = (CopyObjectResult) cosXmlResult;
            cOSXMLCopyTaskResult.httpCode = copyObjectResult.httpCode;
            cOSXMLCopyTaskResult.httpMessage = copyObjectResult.httpMessage;
            cOSXMLCopyTaskResult.headers = copyObjectResult.headers;
            cOSXMLCopyTaskResult.eTag = copyObjectResult.copyObject.eTag;
            cOSXMLCopyTaskResult.accessUrl = copyObjectResult.accessUrl;
        } else if (cosXmlResult != null && (cosXmlResult instanceof CompleteMultiUploadResult)) {
            CompleteMultiUploadResult completeMultiUploadResult = (CompleteMultiUploadResult) cosXmlResult;
            cOSXMLCopyTaskResult.httpCode = completeMultiUploadResult.httpCode;
            cOSXMLCopyTaskResult.httpMessage = completeMultiUploadResult.httpMessage;
            cOSXMLCopyTaskResult.headers = completeMultiUploadResult.headers;
            cOSXMLCopyTaskResult.eTag = completeMultiUploadResult.completeMultipartUpload.eTag;
            cOSXMLCopyTaskResult.accessUrl = completeMultiUploadResult.accessUrl;
        }
        return cOSXMLCopyTaskResult;
    }

    protected void copy() {
        run();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void encounterError(@p0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        this.largeCopyStateListenerHandler.onFailed(this.copyObjectRequest, cosXmlClientException, cosXmlServiceException);
    }

    public String getUploadId() {
        return this.uploadId;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCancel() {
        cancelAllRequest(this.cosXmlService);
        if (this.isLargeCopy) {
            abortMultiUpload(this.cosXmlService);
        }
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
        copy();
    }

    protected void run() {
        CopyObjectRequest.CopySourceStruct copySourceStruct = this.copySourceStruct;
        HeadObjectRequest headObjectRequest = new HeadObjectRequest(copySourceStruct.bucket, copySourceStruct.cosPath);
        this.headObjectRequest = headObjectRequest;
        headObjectRequest.setRegion(this.copySourceStruct.region);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            HeadObjectRequest headObjectRequest2 = this.headObjectRequest;
            headObjectRequest2.setSign(onSignatureListener.onGetSign(headObjectRequest2));
        }
        getHttpMetrics(this.headObjectRequest, BeaconService.EVENT_PARAMS_NODE_HEAD);
        this.headObjectRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.8
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i10) {
                if (COSXMLCopyTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLCopyTask.this.updateState(TransferState.IN_PROGRESS, null, null, false);
            }
        });
        this.cosXmlService.headObjectAsync(this.headObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLCopyTask.9
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (COSXMLCopyTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLCopyTask.this.IS_EXIT.set(true);
                COSXMLCopyTask.this.largeCopyStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (COSXMLCopyTask.this.IS_EXIT.get()) {
                    return;
                }
                List<String> list = cosXmlResult.headers.get("Content-Length");
                if (list != null && list.size() > 0) {
                    COSXMLCopyTask.this.fileLength = Long.parseLong(list.get(0));
                }
                long j10 = COSXMLCopyTask.this.fileLength;
                COSXMLCopyTask cOSXMLCopyTask = COSXMLCopyTask.this;
                if (j10 <= cOSXMLCopyTask.multiCopySizeDivision) {
                    cOSXMLCopyTask.smallFileCopy();
                    return;
                }
                cOSXMLCopyTask.isLargeCopy = true;
                if (COSXMLCopyTask.this.copyPartStructMap != null) {
                    COSXMLCopyTask.this.copyPartStructMap.clear();
                } else {
                    COSXMLCopyTask.this.copyPartStructMap = new LinkedHashMap();
                }
                if (COSXMLCopyTask.this.uploadPartCopyRequestList != null) {
                    COSXMLCopyTask.this.uploadPartCopyRequestList.clear();
                } else {
                    COSXMLCopyTask.this.uploadPartCopyRequestList = new ArrayList();
                }
                if (COSXMLCopyTask.this.UPLOAD_PART_COUNT != null) {
                    COSXMLCopyTask.this.UPLOAD_PART_COUNT.set(0);
                } else {
                    COSXMLCopyTask.this.UPLOAD_PART_COUNT = new AtomicInteger(0);
                }
                COSXMLCopyTask cOSXMLCopyTask2 = COSXMLCopyTask.this;
                cOSXMLCopyTask2.largeFileCopy(cOSXMLCopyTask2.cosXmlService);
            }
        });
    }
}
