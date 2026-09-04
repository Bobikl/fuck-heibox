package com.tencent.cos.xml.transfer;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: UploadPartsTask.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseUploadPartsTask {
    protected COSDirect mCosDirect;
    protected long mOffset;
    protected PutObjectRequest mPutObjectRequest;
    protected long mSize;
    protected int mStartNumber;
    protected String mUploadId;
    private CosXmlProgressListener progressListener;
    protected String taskId;
    protected Set<COSUploadTask.UploadPart> uploadParts = Collections.synchronizedSet(new HashSet());
    protected long mMaxPartSize = 1048576;
    protected final String TAG = COSUploadTask.TAG;

    BaseUploadPartsTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, long j10, long j11, int i10, String str) {
        this.mCosDirect = cOSDirect;
        this.mPutObjectRequest = putObjectRequest;
        this.mOffset = j10;
        this.mSize = j11;
        this.mStartNumber = i10;
        this.mUploadId = str;
    }

    private Map<String, List<String>> getUploadPartHeaders(PutObjectRequest putObjectRequest) {
        Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
        if (requestHeaders == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (String str : requestHeaders.keySet()) {
            if (str.startsWith(Headers.SERVER_SIDE_ENCRYPTION) || str.equals(Headers.COS_TRAFFIC_LIMIT)) {
                map.put(str, requestHeaders.get(str));
            }
        }
        return map;
    }

    public abstract void cancel();

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    UploadPartRequest getUploadRequest(int i10, long j10, long j11) {
        UploadPartRequest uploadPartRequest;
        boolean z10;
        UploadPartRequest uploadPartRequest2 = null;
        if (j10 >= this.mOffset + this.mSize) {
            return null;
        }
        String srcPath = this.mPutObjectRequest.getSrcPath();
        Uri uri = this.mPutObjectRequest.getUri();
        String bucket = this.mPutObjectRequest.getBucket();
        String cosPath = this.mPutObjectRequest.getCosPath();
        String region = this.mPutObjectRequest.getRegion();
        if (srcPath == null) {
            if (uri != null) {
                uploadPartRequest = new UploadPartRequest(bucket, cosPath, i10, uri, j10, j11, this.mUploadId);
            }
            if (uploadPartRequest2 != null) {
                if (!TextUtils.isEmpty(region)) {
                    uploadPartRequest2.setRegion(region);
                }
                uploadPartRequest2.setRequestHeaders(getUploadPartHeaders(this.mPutObjectRequest));
                if (j10 + j11 >= this.mOffset + this.mSize) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uploadPartRequest2.setLastPart(z10);
            }
            return uploadPartRequest2;
        }
        uploadPartRequest = new UploadPartRequest(bucket, cosPath, i10, srcPath, j10, j11, this.mUploadId);
        uploadPartRequest2 = uploadPartRequest;
        if (uploadPartRequest2 != null) {
            if (!TextUtils.isEmpty(region)) {
                uploadPartRequest2.setRegion(region);
            }
            uploadPartRequest2.setRequestHeaders(getUploadPartHeaders(this.mPutObjectRequest));
            if (j10 + j11 >= this.mOffset + this.mSize) {
                z10 = true;
            } else {
                z10 = false;
            }
            uploadPartRequest2.setLastPart(z10);
        }
        return uploadPartRequest2;
    }

    void notifyProgressChange(long j10, long j11) {
        CosXmlProgressListener cosXmlProgressListener = this.progressListener;
        if (cosXmlProgressListener != null) {
            cosXmlProgressListener.onProgress(j10, j11);
        }
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public abstract Set<COSUploadTask.UploadPart> upload() throws Exception;
}
