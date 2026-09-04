package com.ss.bytertc.base.media.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.Size;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import com.ss.bytertc.base.media.VideoSink;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(21)
public class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;

    @p0
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;

    @p0
    private CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private SessionState state = SessionState.RUNNING;

    @p0
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            RXLogging.i(Camera2Session.TAG, "Capture failed: " + captureFailure);
        }
    }

    public class CameraStateCallback extends CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private String getErrorDescription(int i10) {
            if (i10 == 1) {
                return "Camera device is in use already.";
            }
            if (i10 == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i10 == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i10 == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i10 == 5) {
                return "Camera service has encountered a fatal error.";
            }
            return "Unknown camera error: " + i10;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z10 = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z10) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i10));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i(Camera2Session.TAG, "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e10) {
                Camera2Session.this.reportError("Failed to create capture session. " + e10);
            }
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i10 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i10 == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    RXLogging.i(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            RXLogging.i(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        RXLogging.i(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            for (int i11 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i11 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    RXLogging.i(Camera2Session.TAG, "Using video stabilization.");
                    return;
                }
            }
            RXLogging.i(Camera2Session.TAG, "Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                RXLogging.i(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(m.a((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i(Camera2Session.TAG, "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder builderCreateCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(builderCreateCaptureRequest);
                chooseFocusMode(builderCreateCaptureRequest);
                Camera2Session.this.events.onCameraConfig(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height, Camera2Session.this.captureFormat.framerate);
                builderCreateCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new VideoSink() { // from class: com.ss.bytertc.base.media.camera.d
                    @Override // com.ss.bytertc.base.media.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        this.f97860b.lambda$onConfigured$0(videoFrame);
                    }
                });
                RXLogging.i(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e10) {
                Camera2Session.this.reportError("Failed to start capture request. " + e10);
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        RXLogging.i(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i10;
        this.height = i11;
        this.framerate = i12;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i10, i11, i12);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        RXLogging.i(TAG, "Available preview sizes: " + supportedSizes);
        RXLogging.i(TAG, "Available fps ranges: " + listConvertFramerates);
        if (listConvertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        RXLogging.i(TAG, "Using capture format: " + this.captureFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int iB = m.b(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            iB = 360 - iB;
        }
        return (this.cameraOrientation + iB) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        RXLogging.i(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e10) {
            reportError("Failed to open camera: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportError(String str) {
        checkIsOnCameraThread();
        RXLogging.e(TAG, "Error: " + str);
        boolean z10 = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z10) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        checkIsOnCameraThread();
        RXLogging.i(TAG, com.google.android.exoplayer2.text.ttml.d.f49798o0);
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e10) {
            reportError("getCameraCharacteristics(): " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        RXLogging.i(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        RXLogging.i(TAG, "Stop done");
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int enableFollowGravity(boolean z10) {
        return z10 ? -1 : 0;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int getDeviceOrientation() {
        return m.b(ContextUtils.getApplicationContext());
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int setCameraZoomRatio(float f10) {
        return 0;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void stop() {
        RXLogging.i(TAG, "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long jNanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
        }
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void turnOffFlashLight() {
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void turnOnFlashLight() {
    }
}
