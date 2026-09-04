package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class NativeRenderViewListener implements RenderViewHelperInterface.RenderViewListener {
    private long mNativeHandler;

    public NativeRenderViewListener(long j10) {
        this.mNativeHandler = j10;
    }

    private static native void nativeOnRequestRedraw(long j10, Bitmap bitmap);

    private static native void nativeOnSurfaceChanged(long j10, Surface surface, boolean z10);

    private static native void nativeOnSurfaceDestroy(long j10);

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onRequestRedraw(Bitmap bitmap) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnRequestRedraw(j10, bitmap);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceChanged(Surface surface, boolean z10) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnSurfaceChanged(j10, surface, z10);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener
    public synchronized void onSurfaceDestroy() {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnSurfaceDestroy(j10);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }
}
