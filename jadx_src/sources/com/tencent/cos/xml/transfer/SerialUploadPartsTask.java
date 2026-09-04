package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import java.util.Set;

/* JADX INFO: compiled from: UploadPartsTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class SerialUploadPartsTask extends BaseUploadPartsTask {
    private UploadPartRequest currentUploadPartRequest;
    private volatile HttpTaskMetrics httpTaskMetrics;
    private int mPartNumber;
    private long mStartPointer;

    public SerialUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j10, long j11, int i10, String str) {
        super(cOSDirect, putObjectRequest, j10, j11, i10, str);
    }

    private synchronized void mergeTaskMetrics(HttpTaskMetrics httpTaskMetrics) {
        if (httpTaskMetrics != null) {
            if (this.httpTaskMetrics != null) {
                this.httpTaskMetrics.merge(httpTaskMetrics);
            }
        }
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public void cancel() {
        UploadPartRequest uploadPartRequest = this.currentUploadPartRequest;
        if (uploadPartRequest != null) {
            this.mCosDirect.cancel(uploadPartRequest);
        }
    }

    public void setHttpTaskMetrics(HttpTaskMetrics httpTaskMetrics) {
        this.httpTaskMetrics = httpTaskMetrics;
    }

    @Override // com.tencent.cos.xml.transfer.BaseUploadPartsTask
    public Set<COSUploadTask.UploadPart> upload() throws CosXmlServiceException, CosXmlClientException {
        this.mStartPointer = this.mOffset;
        this.mPartNumber = this.mStartNumber;
        while (true) {
            long j10 = this.mStartPointer;
            long j11 = this.mOffset;
            long j12 = this.mSize;
            if (j10 >= j11 + j12) {
                return this.uploadParts;
            }
            long jMin = Math.min(this.mMaxPartSize, (j11 + j12) - j10);
            UploadPartRequest uploadRequest = getUploadRequest(this.mPartNumber, this.mStartPointer, jMin);
            this.currentUploadPartRequest = uploadRequest;
            uploadRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.SerialUploadPartsTask.1
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j13, long j14) {
                    SerialUploadPartsTask serialUploadPartsTask = SerialUploadPartsTask.this;
                    long j15 = serialUploadPartsTask.mStartPointer + j13;
                    SerialUploadPartsTask serialUploadPartsTask2 = SerialUploadPartsTask.this;
                    serialUploadPartsTask.notifyProgressChange(j15, serialUploadPartsTask2.mOffset + serialUploadPartsTask2.mSize);
                }
            });
            String str = this.mCosDirect.uploadPart(this.currentUploadPartRequest).eTag;
            COSTransferTask.loggerInfo(COSUploadTask.TAG, this.taskId, "upload part %d, etag=%s", Integer.valueOf(this.mPartNumber), str);
            if (TextUtils.isEmpty(str)) {
                throw new CosXmlClientException(ClientErrorCode.ETAG_NOT_FOUND);
            }
            COSUploadTask.UploadPart uploadPart = new COSUploadTask.UploadPart(str, this.mPartNumber, this.mStartPointer, jMin);
            this.mStartPointer += jMin;
            this.mPartNumber++;
            this.uploadParts.add(uploadPart);
        }
    }
}
