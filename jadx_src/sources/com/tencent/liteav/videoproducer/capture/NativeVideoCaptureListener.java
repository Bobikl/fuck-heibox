package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class NativeVideoCaptureListener implements com.tencent.liteav.videobase.videobase.c, CaptureSourceInterface.CaptureSourceListener {
    private static final String TAG = "NativeVideoCaptureListener";
    private long mNativeHandler;

    public NativeVideoCaptureListener(long j10) {
        this.mNativeHandler = j10;
    }

    private static native void nativeOnAutoFocusEnabled(long j10, boolean z10);

    private static native void nativeOnCaptureError(long j10, int i10, String str);

    private static native void nativeOnCaptureFirstFrame(long j10);

    private static native void nativeOnCapturePaused(long j10);

    private static native void nativeOnCaptureResumed(long j10);

    private static native void nativeOnCaptureStopped(long j10);

    private static native void nativeOnFrameAvailable(long j10, PixelFrame pixelFrame);

    private static native void nativeOnScreenDisplayOrientationChanged(long j10, int i10);

    private static native void nativeOnStartFinish(long j10, boolean z10);

    private static native void nativeOnZoomEnabled(long j10, boolean z10);

    public synchronized void notifyError(com.tencent.liteav.videobase.videobase.e.a aVar, String str) {
        if (this.mNativeHandler == 0) {
            return;
        }
        int iA = com.tencent.liteav.videobase.videobase.e.a(aVar);
        if (iA != 0) {
            nativeOnCaptureError(this.mNativeHandler, iA, str);
            return;
        }
        LiteavLog.i(TAG, "notifyError error code:" + aVar + ", do not need transfer to LiteAvCode:" + iA);
    }

    public void notifyEvent(com.tencent.liteav.videobase.videobase.e.b bVar, int i10, String str) {
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void notifyEvent(com.tencent.liteav.videobase.videobase.e.b bVar, Object obj, String str) {
        long j10 = this.mNativeHandler;
        if (j10 == 0) {
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_FIRST_FRAME) {
            nativeOnCaptureFirstFrame(j10);
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED) {
            nativeOnCapturePaused(j10);
        } else if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME) {
            nativeOnCaptureResumed(j10);
        } else {
            if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS) {
                nativeOnCaptureStopped(j10);
            }
        }
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void notifyWarning(com.tencent.liteav.videobase.videobase.e.c cVar, String str) {
    }

    public synchronized void onCameraTouchEnable(boolean z10) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnAutoFocusEnabled(j10, !z10);
        }
    }

    public synchronized void onCameraZoomEnable(boolean z10) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnZoomEnabled(j10, z10);
        }
    }

    public synchronized void onCaptureError() {
    }

    public synchronized void onCaptureFirstFrame() {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnCaptureFirstFrame(j10);
        }
    }

    public synchronized void onFrameAvailable(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnFrameAvailable(j10, pixelFrame);
        }
    }

    public synchronized void onScreenDisplayOrientationChanged(l lVar) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnScreenDisplayOrientationChanged(j10, l.a(lVar));
        }
    }

    public synchronized void onStartFinish(boolean z10) {
        long j10 = this.mNativeHandler;
        if (j10 != 0) {
            nativeOnStartFinish(j10, z10);
        }
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandler = 0L;
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, int i10, Object obj) {
    }

    @Override // com.tencent.liteav.videobase.videobase.c
    public synchronized void updateStatus(com.tencent.liteav.videobase.videobase.f fVar, Object obj) {
    }
}
