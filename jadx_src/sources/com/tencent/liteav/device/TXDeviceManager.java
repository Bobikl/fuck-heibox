package com.tencent.liteav.device;

/* JADX INFO: loaded from: classes4.dex */
public interface TXDeviceManager {

    public enum TXAudioRoute {
        TXAudioRouteSpeakerphone,
        TXAudioRouteEarpiece
    }

    public enum TXCameraCaptureMode {
        TXCameraResolutionStrategyAuto,
        TXCameraResolutionStrategyPerformance,
        TXCameraResolutionStrategyHighQuality,
        TXCameraCaptureManual
    }

    public static class TXCameraCaptureParam {
        public int height;
        public TXCameraCaptureMode mode;
        public int width;
    }

    public enum TXSystemVolumeType {
        TXSystemVolumeTypeAuto,
        TXSystemVolumeTypeMedia,
        TXSystemVolumeTypeVOIP
    }

    int enableCameraAutoFocus(boolean z10);

    boolean enableCameraTorch(boolean z10);

    float getCameraZoomMaxRatio();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    int setAudioRoute(TXAudioRoute tXAudioRoute);

    void setCameraCapturerParam(TXCameraCaptureParam tXCameraCaptureParam);

    int setCameraFocusPosition(int i10, int i11);

    int setCameraZoomRatio(float f10);

    int setExposureCompensation(float f10);

    int setSystemVolumeType(TXSystemVolumeType tXSystemVolumeType);

    int switchCamera(boolean z10);
}
