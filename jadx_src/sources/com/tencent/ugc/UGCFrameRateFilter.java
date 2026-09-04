package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCFrameRateFilter {
    private final String TAG;
    private long mNativeHandler;

    public static class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f103229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f103230b;

        Result() {
        }
    }

    public UGCFrameRateFilter(int i10) {
        String str = "UGCFrameRateFilter_" + hashCode();
        this.TAG = str;
        LiteavLog.i(str, "set frame rate. frame rate is ".concat(String.valueOf(i10)));
        this.mNativeHandler = nativeCreate(i10);
    }

    private static Result createFilterFrameResult(boolean z10, long j10) {
        Result result = new Result();
        result.f103229a = z10;
        result.f103230b = j10;
        return result;
    }

    private static native long nativeCreate(int i10);

    private static native void nativeDestroy(long j10);

    private static native Object nativeFilterFrame(long j10, long j11);

    public void finalize() throws Throwable {
        nativeDestroy(this.mNativeHandler);
    }

    public boolean isFilterOutFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return true;
        }
        long j10 = this.mNativeHandler;
        if (j10 == 0) {
            return false;
        }
        Result result = (Result) nativeFilterFrame(j10, pixelFrame.getTimestamp());
        pixelFrame.setTimestamp(result.f103230b);
        return result.f103229a;
    }
}
