package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.rtmp.ui.AndroidViewEventListener;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class NativeAndroidViewEventListener implements AndroidViewEventListener {
    private long mNativeHandler;

    public NativeAndroidViewEventListener(long j10) {
        this.mNativeHandler = j10;
    }

    private static native void nativeOnTap(long j10, int i10, int i11, int i12, int i13);

    private static native void nativeOnZoom(long j10, float f10);

    private static native void nativeonSizeChanged(long j10, int i10, int i11, int i12, int i13);

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onSizeChanged(int i10, int i11, int i12, int i13) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeonSizeChanged(j10, i10, i11, i12, i13);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onTap(int i10, int i11, int i12, int i13) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnTap(j10, i10, i11, i12, i13);
        }
    }

    @Override // com.tencent.rtmp.ui.AndroidViewEventListener
    public synchronized void onZoom(float f10) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnZoom(j10, f10);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
