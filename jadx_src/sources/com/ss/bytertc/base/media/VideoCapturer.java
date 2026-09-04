package com.ss.bytertc.base.media;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i10, int i11, int i12);

    void dispose();

    int enableFollowGravity(boolean z10);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    boolean isScreencast();

    int setCameraZoomRatio(float f10);

    void startCapture(int i10, int i11, int i12);

    void startCapture(int i10, int i11, int i12, int i13);

    void stopCapture() throws InterruptedException;

    void turnOffFlashLight();

    void turnOnFlashLight();
}
