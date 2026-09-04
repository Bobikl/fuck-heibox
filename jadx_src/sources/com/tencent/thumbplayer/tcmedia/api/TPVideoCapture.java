package com.tencent.thumbplayer.tcmedia.api;

import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.thumbplayer.tcmedia.a.a;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGenerator;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPVideoCapture implements ITPImageGeneratorCallback {
    private static final String TAG = "TPThumbPlayer[TPVideoCapture.java]";
    private TPImageGenerator mTpImageGenerator;
    private int mWidth = 0;
    private int mHeight = 0;
    private long mRequestedTimeMsToleranceBefore = 0;
    private long mRequestedTimeMsToleranceAfter = 0;
    private long mOpaque = 0;
    private Map<String, TPVideoCaptureCallBack> mCallBackMap = new HashMap();

    public interface TPVideoCaptureCallBack {
        void onCaptureError(int i10);

        void onCaptureSuccess(Bitmap[] bitmapArr);
    }

    public TPVideoCapture(String str) {
        this.mTpImageGenerator = new TPImageGenerator(str, this);
        try {
            this.mTpImageGenerator.init();
        } catch (Exception e10) {
            TPLogUtil.e(TAG, "init: " + Log.getStackTraceString(e10));
        }
    }

    private String generateOpaqueKey(long j10, long j11) {
        return "opaque_" + j10 + "time_" + j11;
    }

    private TPImageGeneratorParams getParameters() {
        TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
        tPImageGeneratorParams.format = 37;
        tPImageGeneratorParams.width = this.mWidth;
        tPImageGeneratorParams.height = this.mHeight;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = this.mRequestedTimeMsToleranceAfter;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = this.mRequestedTimeMsToleranceBefore;
        return tPImageGeneratorParams;
    }

    public void generateImageAsyncAtTime(long j10, TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        long j11 = this.mOpaque + 1;
        this.mOpaque = j11;
        this.mCallBackMap.put(generateOpaqueKey(j11, j10), tPVideoCaptureCallBack);
        try {
            this.mTpImageGenerator.generateImageAsyncAtTime(j10, this.mOpaque, getParameters());
        } catch (Exception e10) {
            TPLogUtil.e(TAG, "generateImageAsyncAtTime: " + Log.getStackTraceString(e10));
        }
    }

    public void generateImagesAsyncForTimes(long[] jArr, TPVideoCaptureCallBack tPVideoCaptureCallBack) {
        this.mOpaque++;
        for (long j10 : jArr) {
            this.mCallBackMap.put(generateOpaqueKey(this.mOpaque, j10), tPVideoCaptureCallBack);
        }
        try {
            this.mTpImageGenerator.generateImagesAsyncForTimes(jArr, this.mOpaque, getParameters());
        } catch (Exception e10) {
            TPLogUtil.e(TAG, "generateImagesAsyncForTimes: " + Log.getStackTraceString(e10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i10, long j10, long j11, long j12, TPVideoFrame tPVideoFrame) {
        TPVideoCaptureCallBack tPVideoCaptureCallBack = this.mCallBackMap.get(generateOpaqueKey(j12, j10));
        if (tPVideoCaptureCallBack != null) {
            if (i10 != 0 || tPVideoFrame == null) {
                tPVideoCaptureCallBack.onCaptureError(i10);
            } else {
                tPVideoCaptureCallBack.onCaptureSuccess(a.b(tPVideoFrame));
            }
        }
        this.mCallBackMap.remove(generateOpaqueKey(j12, j10));
    }

    public void release() {
        try {
            this.mTpImageGenerator.cancelAllImageGenerations();
            this.mTpImageGenerator.unInit();
        } catch (Exception e10) {
            TPLogUtil.e(TAG, "release: " + Log.getStackTraceString(e10));
        }
        this.mCallBackMap.clear();
        this.mTpImageGenerator = null;
    }

    public void setSize(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Size is illegal");
        }
        this.mWidth = i10;
        this.mHeight = i11;
    }

    public void setTimeMsTolerance(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Tolerance is illegal");
        }
        this.mRequestedTimeMsToleranceBefore = j10;
        this.mRequestedTimeMsToleranceAfter = j11;
    }
}
