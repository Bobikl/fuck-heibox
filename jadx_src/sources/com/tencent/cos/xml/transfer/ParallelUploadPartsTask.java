package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import android.util.SparseArray;
import bolts.h;
import bolts.i;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: UploadPartsTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class ParallelUploadPartsTask extends BaseUploadPartsTask {
    private AtomicLong mTotalProgress;
    private Set<UploadPartRequest> runningRequestSet;
    private i<Set<COSUploadTask.UploadPart>> tcs;
    private SparseArray<Long> uploadPartProgress;

    ParallelUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j10, long j11, int i10, String str) {
        super(cOSDirect, putObjectRequest, j10, j11, i10, str);
        this.runningRequestSet = Collections.synchronizedSet(new HashSet());
        this.tcs = new i<>();
        this.uploadPartProgress = new SparseArray<>();
        this.mTotalProgress = new AtomicLong(0L);
    }

    private int calculatePartNumber(long j10, long j11) {
        int i10 = (int) (j10 / j11);
        return j10 % j11 != 0 ? i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAllUploadingRequests() {
        Iterator<UploadPartRequest> it = this.runningRequestSet.iterator();
        while (it.hasNext()) {
            this.mCosDirect.cancel(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateProgress(UploadPartRequest uploadPartRequest, long j10) {
        int partNumber = uploadPartRequest.getPartNumber();
        long jLongValue = j10 - this.uploadPartProgress.get(partNumber, 0L).longValue();
        this.uploadPartProgress.put(partNumber, Long.valueOf(j10));
        notifyProgressChange(this.mOffset + this.mTotalProgress.addAndGet(jLongValue), this.mOffset + this.mSize);
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel() {
        this.tcs.e();
        cancelAllUploadingRequests();
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public Set<COSUploadTask.UploadPart> upload() throws Exception {
        ParallelUploadPartsTask parallelUploadPartsTask = this;
        h<Set<COSUploadTask.UploadPart>> hVarA = parallelUploadPartsTask.tcs.a();
        final int iCalculatePartNumber = parallelUploadPartsTask.calculatePartNumber(parallelUploadPartsTask.mSize, parallelUploadPartsTask.mMaxPartSize);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i10 = 0;
        while (i10 < iCalculatePartNumber) {
            final int i11 = parallelUploadPartsTask.mStartNumber + i10;
            long j10 = parallelUploadPartsTask.mOffset;
            long j11 = parallelUploadPartsTask.mMaxPartSize;
            final long j12 = j10 + (((long) i10) * j11);
            final long jMin = Math.min(j11, (j10 + parallelUploadPartsTask.mSize) - j12);
            final UploadPartRequest uploadRequest = getUploadRequest(i11, j12, jMin);
            uploadRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.ParallelUploadPartsTask.1
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j13, long j14) {
                    ParallelUploadPartsTask.this.updateProgress(uploadRequest, j13);
                }
            });
            parallelUploadPartsTask.runningRequestSet.add(uploadRequest);
            final AtomicInteger atomicInteger2 = atomicInteger;
            parallelUploadPartsTask.mCosDirect.uploadPartAsync(uploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.ParallelUploadPartsTask.2
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                    if (cosXmlClientException != null) {
                        ParallelUploadPartsTask.this.tcs.f(cosXmlClientException);
                    } else if (cosXmlServiceException != null) {
                        ParallelUploadPartsTask.this.tcs.f(cosXmlServiceException);
                    } else {
                        ParallelUploadPartsTask.this.tcs.f(new CosXmlClientException(ClientErrorCode.UNKNOWN));
                    }
                    ParallelUploadPartsTask.this.cancelAllUploadingRequests();
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                    ParallelUploadPartsTask.this.runningRequestSet.remove(uploadRequest);
                    UploadPartResult uploadPartResult = (UploadPartResult) cosXmlResult;
                    String str = uploadPartResult.eTag;
                    COSTransferTask.loggerInfo(COSUploadTask.TAG, ParallelUploadPartsTask.this.taskId, "upload part %d, etag=%s", Integer.valueOf(i11), str);
                    if (TextUtils.isEmpty(str)) {
                        ParallelUploadPartsTask.this.tcs.f(new CosXmlClientException(ClientErrorCode.ETAG_NOT_FOUND));
                        ParallelUploadPartsTask.this.cancelAllUploadingRequests();
                    } else {
                        ParallelUploadPartsTask.this.uploadParts.add(new COSUploadTask.UploadPart(uploadPartResult.eTag, i11, j12, jMin));
                        if (atomicInteger2.addAndGet(1) >= iCalculatePartNumber) {
                            ParallelUploadPartsTask.this.tcs.g(ParallelUploadPartsTask.this.uploadParts);
                        }
                    }
                }
            });
            i10++;
            parallelUploadPartsTask = this;
            atomicInteger = atomicInteger;
        }
        hVarA.Y();
        if (hVarA.J()) {
            throw hVarA.E();
        }
        if (hVarA.H()) {
            throw new CosXmlClientException(ClientErrorCode.USER_CANCELLED);
        }
        return hVarA.F();
    }
}
