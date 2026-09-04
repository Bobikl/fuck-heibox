package com.tencent.cos.xml.transfer;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import bolts.c;
import bolts.e;
import bolts.g;
import bolts.h;
import bolts.i;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.task.TaskExecutors;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class ParallelUploadTask {
    private volatile HttpTaskMetrics httpTaskMetrics;
    private e mCancellationTokenSource;
    private CosXmlSimpleService mCosXmlSimpleService;
    private long mOffset;
    private long mOffsetPointer;
    private final int mPartNumber;
    private CosXmlProgressListener mProgressListener;
    private PutObjectRequest mPutObjectRequest;
    private List<UploadPartRequest> mRequests;
    private long mSize;
    private h<?> mTask;
    private i<?> mTaskCompletionSource;
    private Map<UploadPartRequest, Long> mUploadCompleteMap;
    private final String mUploadId;
    private List<UploadPartTask> mUploadPartTasks;
    private SlidingWindow slidingWindow;
    private String taskId;
    private final Object mCheckingLock = new Object();
    private long mTotalComplete = 0;
    private long mNormalNetworkSliceSize = 1048576;
    private long mPoolNetworkSliceSize = 1048576;
    private volatile boolean isPoolNetwork = true;
    private final long normalNetworkSpeed = 102400;
    private Set<COSUploadTask.UploadPart> uploadParts = Collections.synchronizedSet(new HashSet());

    public static class SlidingWindow {
        private boolean[] completes;
        private int mNext;
        private int mStart;
        private int mWidth;

        SlidingWindow(int i10, int i11) {
            this.mStart = i10;
            this.mNext = i10;
            this.mWidth = i11;
            this.completes = new boolean[i11];
        }

        synchronized void complete(int i10) {
            boolean[] zArr;
            int i11;
            this.completes[i10 - this.mStart] = true;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zArr = this.completes;
                if (i12 >= zArr.length || !zArr[i12]) {
                    break;
                    break;
                } else {
                    i13++;
                    i12++;
                }
            }
            if (i13 > 0) {
                this.mStart += i13;
                int length = zArr.length;
                int i14 = 0;
                while (true) {
                    i11 = length - i13;
                    if (i14 >= i11) {
                        break;
                    }
                    boolean[] zArr2 = this.completes;
                    zArr2[i14] = zArr2[i14 + i13];
                    i14++;
                }
                while (i11 < length) {
                    this.completes[i11] = false;
                    i11++;
                }
                notifyAll();
            }
        }

        synchronized int getNextNumber() {
            int i10;
            while (true) {
                i10 = this.mNext;
                if (i10 >= this.mStart + this.mWidth) {
                    try {
                        wait();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    this.mNext = i10 + 1;
                }
                throw th;
            }
            return i10;
        }
    }

    public static class UploadPartTask implements Runnable, Comparable<UploadPartTask> {
        private CosXmlSimpleService cosXmlSimpleService;
        private c mCancellationToken;
        private i<UploadPartResult> tcs = new i<>();
        private UploadPartRequest uploadPartRequest;

        public UploadPartTask(CosXmlSimpleService cosXmlSimpleService, UploadPartRequest uploadPartRequest, c cVar) {
            this.cosXmlSimpleService = cosXmlSimpleService;
            this.uploadPartRequest = uploadPartRequest;
            this.mCancellationToken = cVar;
        }

        public void cancel() {
            this.cosXmlSimpleService.cancel(this.uploadPartRequest);
        }

        @Override // java.lang.Comparable
        public int compareTo(UploadPartTask uploadPartTask) {
            return 0;
        }

        public h<UploadPartResult> getTask() {
            return this.tcs.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mCancellationToken.a()) {
                return;
            }
            try {
                this.tcs.d(this.cosXmlSimpleService.uploadPart(this.uploadPartRequest));
            } catch (CancellationException unused) {
                this.tcs.b();
            } catch (Exception e10) {
                this.tcs.c(e10);
            }
        }
    }

    public ParallelUploadTask(CosXmlSimpleService cosXmlSimpleService, PutObjectRequest putObjectRequest, long j10, long j11, int i10, String str) {
        this.mPartNumber = i10;
        this.mUploadId = str;
        this.mOffset = j10;
        this.mSize = j11;
        this.slidingWindow = new SlidingWindow(i10, 3);
        this.mOffsetPointer = this.mOffset;
        this.mPutObjectRequest = putObjectRequest;
        i<?> iVar = new i<>();
        this.mTaskCompletionSource = iVar;
        this.mTask = iVar.a();
        this.mCosXmlSimpleService = cosXmlSimpleService;
        this.mCancellationTokenSource = new e();
        this.mUploadPartTasks = new LinkedList();
        this.mUploadCompleteMap = new HashMap();
    }

    private void cancelAllUploadTask() {
        LinkedList linkedList = new LinkedList(this.mUploadPartTasks);
        synchronized (this.mCheckingLock) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((UploadPartTask) it.next()).cancel();
            }
        }
    }

    private void checkoutException(Exception exc) throws CosXmlServiceException, CosXmlClientException {
        if (exc instanceof CosXmlClientException) {
            throw ((CosXmlClientException) exc);
        }
        if (!(exc instanceof CosXmlServiceException)) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), exc.getMessage());
        }
        throw ((CosXmlServiceException) exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mergeTaskMetrics(HttpTaskMetrics httpTaskMetrics) {
        if (httpTaskMetrics != null) {
            if (this.httpTaskMetrics != null) {
                this.httpTaskMetrics.merge(httpTaskMetrics);
            }
        }
    }

    @p0
    private UploadPartRequest nextUploadPartRequest(int i10) throws CosXmlClientException {
        UploadPartRequest uploadPartRequest;
        long j10 = this.mOffsetPointer;
        UploadPartRequest uploadPartRequest2 = null;
        if (j10 >= this.mOffset + this.mSize) {
            return null;
        }
        long jMin = Math.min(this.isPoolNetwork ? this.mPoolNetworkSliceSize : this.mNormalNetworkSliceSize, (this.mOffset + this.mSize) - this.mOffsetPointer);
        this.mOffsetPointer += jMin;
        String srcPath = this.mPutObjectRequest.getSrcPath();
        Uri uri = this.mPutObjectRequest.getUri();
        String bucket = this.mPutObjectRequest.getBucket();
        String cosPath = this.mPutObjectRequest.getCosPath();
        String region = this.mPutObjectRequest.getRegion();
        if (srcPath == null) {
            if (uri != null) {
                uploadPartRequest = new UploadPartRequest(bucket, cosPath, i10, uri, j10, jMin, this.mUploadId);
            }
            if (uploadPartRequest2 != null && !TextUtils.isEmpty(region)) {
                uploadPartRequest2.setRegion(region);
            }
            return uploadPartRequest2;
        }
        uploadPartRequest = new UploadPartRequest(bucket, cosPath, i10, srcPath, j10, jMin, this.mUploadId);
        uploadPartRequest2 = uploadPartRequest;
        if (uploadPartRequest2 != null) {
            uploadPartRequest2.setRegion(region);
        }
        return uploadPartRequest2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updatePartProgress(UploadPartRequest uploadPartRequest, long j10) {
        long jLongValue = j10 - (this.mUploadCompleteMap.containsKey(uploadPartRequest) ? this.mUploadCompleteMap.get(uploadPartRequest).longValue() : 0L);
        this.mUploadCompleteMap.put(uploadPartRequest, Long.valueOf(j10));
        long j11 = this.mTotalComplete + jLongValue;
        this.mTotalComplete = j11;
        CosXmlProgressListener cosXmlProgressListener = this.mProgressListener;
        if (cosXmlProgressListener != null) {
            cosXmlProgressListener.onProgress(j11 + this.mOffset, -1L);
        }
    }

    public void cancel() {
        this.mCancellationTokenSource.cancel();
        this.mTaskCompletionSource.b();
        cancelAllUploadTask();
    }

    public void setHttpTaskMetrics(HttpTaskMetrics httpTaskMetrics) {
        this.httpTaskMetrics = httpTaskMetrics;
    }

    public void setNormalNetworkSliceSize(long j10) {
        this.mNormalNetworkSliceSize = j10;
    }

    public void setPoolNetworkSliceSize(long j10) {
        this.mPoolNetworkSliceSize = j10;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.mProgressListener = cosXmlProgressListener;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public Set<COSUploadTask.UploadPart> waitForComplete() throws CosXmlServiceException, CosXmlClientException {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        while (!this.mTask.I()) {
            final int nextNumber = this.slidingWindow.getNextNumber();
            final UploadPartRequest uploadPartRequestNextUploadPartRequest = nextUploadPartRequest(nextNumber);
            if (uploadPartRequestNextUploadPartRequest == null) {
                atomicBoolean.set(true);
                break;
            }
            uploadPartRequestNextUploadPartRequest.attachMetrics(new HttpTaskMetrics());
            atomicInteger.addAndGet(1);
            UploadPartTask uploadPartTask = new UploadPartTask(this.mCosXmlSimpleService, uploadPartRequestNextUploadPartRequest, this.mCancellationTokenSource.f());
            this.mUploadPartTasks.add(uploadPartTask);
            uploadPartTask.getTask().q(new g<UploadPartResult, Void>() { // from class: com.tencent.cos.xml.transfer.ParallelUploadTask.1
                @Override // bolts.g
                public Void then(h<UploadPartResult> hVar) throws Exception {
                    ParallelUploadTask.this.slidingWindow.complete(nextNumber);
                    if (hVar.J()) {
                        ParallelUploadTask.this.mTaskCompletionSource.f(hVar.E());
                    }
                    if (hVar.I()) {
                        ParallelUploadTask.this.uploadParts.add(new COSUploadTask.UploadPart(hVar.F().eTag, uploadPartRequestNextUploadPartRequest.getPartNumber(), uploadPartRequestNextUploadPartRequest.getFileOffset(), uploadPartRequestNextUploadPartRequest.getFileContentLength()));
                        ParallelUploadTask.this.mergeTaskMetrics(uploadPartRequestNextUploadPartRequest.getMetrics());
                    }
                    if (atomicInteger.get() == atomicInteger2.addAndGet(1) && atomicBoolean.get()) {
                        ParallelUploadTask.this.mTaskCompletionSource.g(null);
                    }
                    return null;
                }
            });
            uploadPartRequestNextUploadPartRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.ParallelUploadTask.2
                @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                public void onProgress(long j10, long j11) {
                    ParallelUploadTask.this.updatePartProgress(uploadPartRequestNextUploadPartRequest, j10);
                }
            });
            TaskExecutors.UPLOAD_EXECUTOR.execute(uploadPartTask);
        }
        try {
            this.mTask.Y();
            if (this.mTask.J()) {
                checkoutException(this.mTask.E());
                cancelAllUploadTask();
            } else if (this.mTask.H()) {
                throw CosXmlClientException.manualCancelException();
            }
            return this.uploadParts;
        } catch (InterruptedException e10) {
            ClientErrorCode clientErrorCode = ClientErrorCode.INTERNAL_ERROR;
            throw new CosXmlClientException(clientErrorCode.getCode(), clientErrorCode.getErrorMsg() + ": " + e10.getMessage());
        }
    }
}
