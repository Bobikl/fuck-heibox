package com.ss.bytertc.base.media.camera;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes10.dex */
public interface CameraSession {

    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraConfig(int i10, int i11, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    public enum UIDeviceOrientation {
        Portrait(0),
        LandscapeLeft(90),
        PortraitUpsideDown(180),
        LandscapeRight(270);

        private int value;

        UIDeviceOrientation(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    int enableFollowGravity(boolean z10);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    int setCameraZoomRatio(float f10);

    void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode);

    void stop();

    void turnOffFlashLight();

    void turnOnFlashLight();
}
