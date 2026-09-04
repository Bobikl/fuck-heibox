package com.ss.bytertc.base.media.camera;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.NV21Buffer;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.Size;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import com.ss.bytertc.base.media.VideoSink;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes10.dex */
public class Camera1Session implements CameraSession, Camera.FaceDetectionListener {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private static int sMinFramerate;
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Sensor gravitySensor;
    private final Camera.CameraInfo info;
    private boolean isDesktopMode;
    private int mDisplayRotationCheckCounter;
    private boolean mEnableFaceAE;
    private boolean mEnableFollowGravity;
    private boolean mFaceDetectStarted;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private final int scaleHeight;
    private final int scaleWidth;
    private final SensorManager sensorManager;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private int gravityOrientation = 0;
    private final SensorEventListener gravityEventListener = new SensorEventListener() { // from class: com.ss.bytertc.base.media.camera.Camera1Session.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float fAbs = Math.abs(f10);
            float fAbs2 = Math.abs(f11);
            if (Math.abs(fAbs - fAbs2) < 4.0d) {
                return;
            }
            if (fAbs >= fAbs2) {
                if (f10 >= 0.0f) {
                    Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeRight.value();
                    return;
                } else {
                    Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeLeft.value();
                    return;
                }
            }
            if (f11 >= 0.0f) {
                Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.Portrait.value();
            } else {
                Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.PortraitUpsideDown.value();
            }
        }
    };
    private CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;

    /* JADX INFO: renamed from: com.ss.bytertc.base.media.camera.Camera1Session$3, reason: invalid class name */
    public class AnonymousClass3 implements Camera.PreviewCallback {
        AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$1(final byte[] bArr) {
            Camera1Session.this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97858b.lambda$onPreviewFrame$0(bArr);
                }
            });
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            int frameOrientation;
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                RXLogging.e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (Camera1Session.this.state != SessionState.RUNNING) {
                RXLogging.w(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs);
                Camera1Session.this.firstFrameReported = true;
            }
            NV21Buffer nV21Buffer = new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Runnable() { // from class: com.ss.bytertc.base.media.camera.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97856b.lambda$onPreviewFrame$1(bArr);
                }
            });
            if (Camera1Session.this.mEnableFollowGravity) {
                frameOrientation = Camera1Session.this.getGravityOrientation();
            } else {
                frameOrientation = Camera1Session.this.getFrameOrientation();
                Camera1Session camera1Session = Camera1Session.this;
                camera1Session.gravityOrientation = m.b(camera1Session.applicationContext);
            }
            VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, Camera1Session.this.info.facing == 1);
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z10, boolean z11, Context context, SurfaceTextureHelper surfaceTextureHelper, int i10, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j10, int i11, int i12, boolean z12, boolean z13) {
        this.mEnableFollowGravity = false;
        RXLogging.w(TAG, "Create new camera1 session on camera " + i10);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z10;
        this.isDesktopMode = z11;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i10;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j10;
        this.scaleWidth = i11;
        this.scaleHeight = i12;
        this.mEnableFaceAE = z12;
        SensorManager sensorManager = (SensorManager) context.getSystemService(ak.f104420ac);
        this.sensorManager = sensorManager;
        this.gravitySensor = sensorManager.getDefaultSensor(9);
        this.mEnableFollowGravity = z13;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z10, boolean z11, Context context, SurfaceTextureHelper surfaceTextureHelper, int i10, int i11, int i12, int i13, boolean z12, boolean z13) {
        long jNanoTime = System.nanoTime();
        RXLogging.w(TAG, "Open camera " + i10 + " brand:" + Build.BRAND + ", modle:" + Build.MODEL + ", width:" + i11 + ", height:" + i12 + ", framerate:" + i13 + ", faceae:" + z12 + ", followGravity:" + z13 + ", captureToTexture:" + z10);
        events.onCameraOpening();
        try {
            Camera cameraOpen = Camera.open(i10);
            if (cameraOpen == null) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "android.hardware.Camera.open returned null for camera id = " + i10);
                return;
            }
            try {
                cameraOpen.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                try {
                    Camera.Parameters parameters = cameraOpen.getParameters();
                    CameraEnumerationAndroid.CaptureFormat captureFormatFindClosestCaptureFormat = findClosestCaptureFormat(parameters, i11, i12, i13);
                    Size sizeFindClosestPictureSize = findClosestPictureSize(parameters, i11, i12);
                    events.onCameraConfig(sizeFindClosestPictureSize.width, sizeFindClosestPictureSize.height, captureFormatFindClosestCaptureFormat.framerate);
                    sMinFramerate = captureFormatFindClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(cameraOpen, parameters, captureFormatFindClosestCaptureFormat, sizeFindClosestPictureSize, z10);
                    if (!z10) {
                        int iFrameSize = captureFormatFindClosestCaptureFormat.frameSize();
                        for (int i14 = 0; i14 < 3; i14++) {
                            cameraOpen.addCallbackBuffer(ByteBuffer.allocateDirect(iFrameSize).array());
                        }
                    }
                    try {
                        cameraOpen.setDisplayOrientation(0);
                    } catch (RuntimeException unused) {
                        Log.w(TAG, "setDisplayOrientation failed");
                    }
                    createSessionCallback.onDone(new Camera1Session(events, z10, z11, context, surfaceTextureHelper, i10, cameraOpen, cameraInfo, captureFormatFindClosestCaptureFormat, jNanoTime, i11, i12, z12, z13));
                } catch (RuntimeException e10) {
                    cameraOpen.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e10.getMessage());
                }
            } catch (IOException | RuntimeException e11) {
                cameraOpen.release();
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e11.getMessage());
            }
        } catch (RuntimeException e12) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e12.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i10, int i11, int i12) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange;
        if (parameters.getSupportedPreviewFpsRange() == null) {
            RXLogging.e(TAG, "camera parameters is null!");
            return null;
        }
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        RXLogging.w(TAG, "Available fps ranges: " + listConvertFramerates);
        if (Build.MODEL.equalsIgnoreCase("PEGM00") && i12 == 15) {
            closestSupportedFramerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(15000, 20000);
            RXLogging.w(TAG, "unsupported framerate for special device found, hardcode framerange to:" + closestSupportedFramerateRange.toString());
        } else {
            closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, i12);
        }
        RXLogging.w(TAG, "selected fps range :" + closestSupportedFramerateRange.toString());
        List<Size> listConvertSizes = Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes());
        RXLogging.w(TAG, "Available supportedPreviewSizes : " + listConvertSizes.toString());
        Size upClosestSupportedSize = CameraEnumerationAndroid.getUpClosestSupportedSize(listConvertSizes, i10, i11);
        RXLogging.w(TAG, "selected preview size" + upClosestSupportedSize.toString());
        return new CameraEnumerationAndroid.CaptureFormat(upClosestSupportedSize.width, upClosestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i10, int i11) {
        if (parameters != null && parameters.getSupportedPictureSizes() != null) {
            return CameraEnumerationAndroid.getUpClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i10, i11);
        }
        RXLogging.e(TAG, "camera parameters is null!");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int iB = m.b(this.applicationContext);
        int i10 = this.mLastValidDisplayRotation;
        int i11 = this.mDisplayRotationCheckCounter;
        if (i11 > 0) {
            this.mDisplayRotationCheckCounter = i11 - 1;
        } else if (i11 == 0) {
            i10 = !isInForeground(this.applicationContext) ? this.mLastValidDisplayRotation : iB;
            this.mDisplayRotationCheckCounter = -1;
        } else if (iB != this.mLastDisplayRotation) {
            int i12 = sMinFramerate;
            if (i12 > 0) {
                this.mDisplayRotationCheckCounter = i12;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = iB;
        this.mLastValidDisplayRotation = i10;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing != 0) {
            i10 = 360 - i10;
        }
        return (cameraInfo.orientation + i10) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getGravityOrientation() {
        int i10 = this.gravityOrientation;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 1) {
            i10 = 360 - i10;
        }
        return (cameraInfo.orientation + i10) % 360;
    }

    private static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if ((runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) || runningAppProcessInfo.importance == 125) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        VideoFrame.Buffer bufferCropAndScale;
        int frameOrientation;
        int i10;
        CameraEnumerationAndroid.CaptureFormat captureFormat;
        int i11;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            RXLogging.w(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.firstFrameReported) {
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs);
            this.firstFrameReported = true;
        }
        int i12 = this.scaleWidth;
        if (i12 == 0 || (i10 = this.scaleHeight) == 0 || ((i11 = (captureFormat = this.captureFormat).width) == i12 && captureFormat.height == i10)) {
            if (this.scaleHeight == 0) {
                RXLogging.e(TAG, "scaleHeight is 0");
                return;
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int i13 = this.scaleWidth;
            int i14 = this.scaleHeight;
            int i15 = this.captureFormat.height;
            bufferCropAndScale = buffer.cropAndScale(0, 0, (int) ((i13 / i14) * i15), i15, i13, i14);
        } else if (i11 / captureFormat.height > i12 / i10) {
            VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.captureFormat;
            float f10 = captureFormat2.width;
            int i16 = this.scaleWidth;
            int i17 = this.scaleHeight;
            int i18 = captureFormat2.height;
            bufferCropAndScale = buffer2.cropAndScale(((int) (f10 - ((i16 / i17) * i18))) / 2, 0, (int) ((i16 / i17) * i18), i18, i16, i17);
        } else {
            VideoFrame.Buffer buffer3 = videoFrame.getBuffer();
            CameraEnumerationAndroid.CaptureFormat captureFormat3 = this.captureFormat;
            float f11 = captureFormat3.height;
            int i19 = this.scaleHeight;
            int i20 = this.scaleWidth;
            int i21 = captureFormat3.width;
            bufferCropAndScale = buffer3.cropAndScale(0, ((int) (f11 - ((i19 / i20) * i21))) / 2, i21, (int) ((i19 / i20) * i21), i20, i19);
        }
        if (bufferCropAndScale == null) {
            RXLogging.e(TAG, "cropandscale return null buffer");
            return;
        }
        if (this.mEnableFollowGravity) {
            frameOrientation = getGravityOrientation();
        } else {
            frameOrientation = getFrameOrientation();
            this.gravityOrientation = m.b(this.applicationContext);
        }
        VideoFrame videoFrame2 = new VideoFrame((VideoFrame.Buffer) m.a((TextureBufferImpl) bufferCropAndScale, false, 0), frameOrientation, videoFrame.getTimestampNs(), false);
        bufferCropAndScale.release();
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new AnonymousClass3());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() { // from class: com.ss.bytertc.base.media.camera.a
            @Override // com.ss.bytertc.base.media.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                this.f97855b.lambda$listenForTextureFrames$0(videoFrame);
            }
        });
    }

    private void startCapturing() {
        RXLogging.w(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: com.ss.bytertc.base.media.camera.Camera1Session.2
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i10, Camera camera) {
                String str;
                if (i10 == 100) {
                    str = "CAMERA_ERROR_SERVER_DIED";
                } else if (i10 == 2) {
                    str = "CAMERA_ERROR_EVICTED";
                } else if (i10 == 1) {
                    str = "CAMERA_ERROR_UNKNOWN";
                } else {
                    str = "Camera error: " + i10;
                }
                RXLogging.e(Camera1Session.TAG, str);
                Camera1Session.this.stopInternal();
                Camera1Session.this.events.onCameraError(Camera1Session.this, str);
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
            int maxNumDetectedFaces = this.camera.getParameters().getMaxNumDetectedFaces();
            RXLogging.i(TAG, "supportedFaces is " + maxNumDetectedFaces);
            boolean z10 = maxNumDetectedFaces > 0;
            if (this.mEnableFaceAE && z10) {
                this.camera.setFaceDetectionListener(this);
                this.camera.startFaceDetection();
                this.mFaceDetectStarted = true;
            }
            if (this.mEnableFaceAE && !z10) {
                RXLogging.w(TAG, "mEnableFaceAE is ture but camera not support faceae");
            }
            if (this.mEnableFollowGravity) {
                enableFollowGravity(true);
            }
        } catch (RuntimeException e10) {
            stopInternal();
            this.events.onCameraError(this, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        RXLogging.w(TAG, "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            RXLogging.w(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        try {
            if (this.mFaceDetectStarted) {
                this.camera.stopFaceDetection();
            }
            this.camera.stopPreview();
            if (this.mEnableFollowGravity) {
                enableFollowGravity(false);
            }
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            this.camera.release();
            this.events.onCameraClosed(this);
        } catch (Error e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RXLogging.w(TAG, "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        String str = Build.MODEL;
        if (str.equalsIgnoreCase("PEGM00") || str.equalsIgnoreCase("PEGT00")) {
            Log.d(TAG, "updateCameraParameters: ignore pic size for model:" + str);
        } else {
            parameters.setPictureSize(size.width, size.height);
        }
        if (!z10) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int enableFollowGravity(boolean z10) {
        SensorManager sensorManager;
        Sensor sensor = this.gravitySensor;
        if (sensor == null || (sensorManager = this.sensorManager) == null) {
            return -1;
        }
        try {
            if (z10) {
                sensorManager.registerListener(this.gravityEventListener, sensor, 2);
                this.mEnableFollowGravity = true;
            } else {
                sensorManager.registerListener((SensorEventListener) null, sensor, 2);
                this.mEnableFollowGravity = false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public float getCameraZoomMaxRatio() {
        RXLogging.w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED || !isCameraZoomSupported()) {
            return 1.0f;
        }
        return this.camera.getParameters().getMaxZoom();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int getDeviceOrientation() {
        return !this.mEnableFollowGravity ? m.b(ContextUtils.getApplicationContext()) : this.gravityOrientation;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraTorchSupported() {
        checkIsOnCameraThread();
        Context context = this.applicationContext;
        if (context != null) {
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
        return false;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public boolean isCameraZoomSupported() {
        RXLogging.w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            return false;
        }
        Camera.Parameters parameters = this.camera.getParameters();
        return parameters.isZoomSupported() || parameters.isSmoothZoomSupported();
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        Log.d(TAG, "onFaceDetection: face count=" + faceArr.length);
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public int setCameraZoomRatio(float f10) {
        RXLogging.w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            if (isCameraZoomSupported()) {
                int iMin = (int) Math.min(parameters.getMaxZoom(), f10);
                if (parameters.isSmoothZoomSupported()) {
                    this.camera.startSmoothZoom(iMin);
                    return 0;
                }
                parameters.setZoom(iMin);
                this.camera.setParameters(parameters);
                return 0;
            }
        }
        return -1;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void stop() {
        RXLogging.w(TAG, "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long jNanoTime = System.nanoTime();
            stopInternal();
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        }
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void turnOffFlashLight() {
        RXLogging.w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.w(TAG, "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode(s0.f130317e);
            this.camera.setParameters(parameters);
        }
    }

    @Override // com.ss.bytertc.base.media.camera.CameraSession
    public void turnOnFlashLight() {
        RXLogging.w(TAG, "turn on flash light camera1, cameraId:" + this.cameraId);
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.w(TAG, "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode("torch");
            this.camera.setParameters(parameters);
        }
    }
}
