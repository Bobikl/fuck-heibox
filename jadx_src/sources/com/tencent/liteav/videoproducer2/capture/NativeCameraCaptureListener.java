package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class NativeCameraCaptureListener implements SurfaceTexture.OnFrameAvailableListener, CameraEventCallback {
    private final CustomHandler mCallbackHandler = new CustomHandler(Looper.myLooper());
    private long mNativeHandle;

    public NativeCameraCaptureListener(long j10) {
        this.mNativeHandle = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraError(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFrameAvailable(long j10, SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void runInNative(Runnable runnable) {
        if (this.mNativeHandle != 0) {
            runnable.run();
        }
    }

    public Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraEventCallback
    public void onCameraError(CameraControllerInterface cameraControllerInterface, int i10) {
        this.mCallbackHandler.runOrPost(a.a(this, i10));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(b.a(this, surfaceTexture));
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }
}
