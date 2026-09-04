package com.ss.bytertc.base.media.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.annotation.p0;
import com.ss.bytertc.base.media.CapturerObserver;
import com.ss.bytertc.base.media.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(21)
public class Camera2Capturer extends CameraCapturer {

    @p0
    private final CameraManager cameraManager;
    private final Context context;

    public Camera2Capturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i10, int i11, int i12) {
        super.changeCaptureFormat(i10, i11, i12);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer
    protected void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i10, i11, i12);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int enableFollowGravity(boolean z10) {
        return super.enableFollowGravity(z10);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ float getCameraZoomMaxRatio() {
        return super.getCameraZoomMaxRatio();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int getDeviceOrientation() {
        return super.getDeviceOrientation();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(@p0 SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraTorchSupported() {
        return super.isCameraTorchSupported();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraZoomSupported() {
        return super.isCameraZoomSupported();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ int setCameraZoomRatio(float f10) {
        return super.setCameraZoomRatio(f10);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i10, int i11, int i12) {
        super.startCapture(i10, i11, i12);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i10, int i11, int i12, int i13) {
        super.startCapture(i10, i11, i12, i13);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOffFlashLight() {
        super.turnOffFlashLight();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraCapturer, com.ss.bytertc.base.media.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOnFlashLight() {
        super.turnOnFlashLight();
    }
}
