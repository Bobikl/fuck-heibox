package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class RemuxJoiner {
    private static final String TAG = "RemuxJoiner";
    private RemuxJoinerListener mListener;
    private long mNativeHandle;

    public interface RemuxJoinerListener {
        void onRemuxJoinerComplete(int i10, String str);

        void onRemuxJoinerProgress(float f10);
    }

    public static boolean isConcatableWithoutReencode(List<String> list) {
        if (list.size() < 2) {
            return true;
        }
        String str = list.get(0);
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (!nativeIsConcatableWithoutReencode(str, list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static native long nativeCreate(RemuxJoiner remuxJoiner);

    private static native void nativeDestroy(long j10);

    private static native boolean nativeIsConcatableWithoutReencode(String str, String str2);

    private static native boolean nativeSetSourcePaths(long j10, Object[] objArr);

    private static native boolean nativeSetTargetPath(long j10, String str);

    private static native boolean nativeStart(long j10);

    private static native void nativeStop(long j10);

    private void onComplete(int i10, String str) {
        RemuxJoinerListener remuxJoinerListener = this.mListener;
        if (remuxJoinerListener != null) {
            remuxJoinerListener.onRemuxJoinerComplete(i10, str);
        }
    }

    private void onProgress(float f10) {
        RemuxJoinerListener remuxJoinerListener = this.mListener;
        if (remuxJoinerListener != null) {
            remuxJoinerListener.onRemuxJoinerProgress(f10);
        }
    }

    public void initialize() {
        LiteavLog.i(TAG, "initialize");
        if (this.mNativeHandle != 0) {
            LiteavLog.w(TAG, "RemuxJoiner is already initialize!");
        }
        this.mNativeHandle = nativeCreate(this);
    }

    public boolean setSourcePaths(List<String> list) {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            return nativeSetSourcePaths(j10, list.toArray());
        }
        LiteavLog.w(TAG, "RemuxJoiner is not initialize");
        return false;
    }

    public boolean setTargetPath(String str) {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            return nativeSetTargetPath(j10, str);
        }
        LiteavLog.w(TAG, "RemuxJoiner is not initialize");
        return false;
    }

    public void setVideoJoinerListener(RemuxJoinerListener remuxJoinerListener) {
        this.mListener = remuxJoinerListener;
    }

    public boolean start() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            LiteavLog.w(TAG, "RemuxJoiner is not initialize");
            return false;
        }
        if (nativeStart(j10)) {
            return true;
        }
        LiteavLog.e(TAG, "native RemuxJoiner start failed.");
        return false;
    }

    public void stop() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            LiteavLog.w(TAG, "RemuxJoiner is not initialize");
        } else {
            nativeStop(j10);
        }
    }

    public void uninitialize() {
        LiteavLog.i(TAG, "unInitialize");
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.mNativeHandle = 0L;
        }
    }
}
