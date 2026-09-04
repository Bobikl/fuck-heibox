package com.ss.bytertc.base.media.camera;

import android.content.Intent;
import android.hardware.Camera;
import android.media.projection.MediaProjection;
import android.view.WindowManager;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.CapturerObserver;
import com.ss.bytertc.base.media.RXNativeFunctions;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import com.ss.bytertc.base.media.VideoCapturer;
import com.ss.bytertc.base.media.screen.ScreenCapturerAndroid;
import com.ss.bytertc.engine.type.ErrorCode;

/* JADX INFO: loaded from: classes10.dex */
public class RXVideoCaptureAndroid {
    private static final String TAG = "RXVideoCaptureAndroid";
    private int mCaptureBufferType;
    private boolean mIsCaptureScreen;
    private long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private EglBase.Context sharedEglGroup;
    private VideoCapturer mVideoCapturer = null;
    private CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler = null;
    private boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited = false;
    private boolean mIsVideoCaptureWorking = false;
    private int mWidth = 0;
    private int mHeight = 0;
    private EglBase cameraEglBase = null;
    private Intent mCaptureScreenIntent = null;
    private final int UIDeviceOrientationPortrait = 0;
    private final int UIDeviceOrientationLandscapeLeft = 90;
    private final int UIDeviceOrientationPortraitUpsidedown = 180;
    private final int UIDeviceOrientationLandscapeRight = 270;
    private CapturerObserver localCapturerObserver = new CapturerObserver() { // from class: com.ss.bytertc.base.media.camera.RXVideoCaptureAndroid.1
        @Override // com.ss.bytertc.base.media.CapturerObserver
        public void onCapturerError(String str) {
            RXLogging.e(RXVideoCaptureAndroid.TAG, "onCapturerError: " + str);
            if (str.equals("CAMERA_ERROR_SERVER_DIED")) {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, ErrorCode.ERROR_CODE_APP_ID_NULL);
            } else if (str.equals("CAMERA_ERROR_EVICTED") || str.equals("CAMERA_ERROR_UNKNOWN")) {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, -1004);
            } else {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, ErrorCode.ERROR_CODE_APP_ID_NULL);
            }
        }

        @Override // com.ss.bytertc.base.media.CapturerObserver
        public void onCapturerFormatSelected(int i10, int i11, int i12, int i13, int i14) {
            RXLogging.w(RXVideoCaptureAndroid.TAG, "onCapturerFormatSelected...");
            RXNativeFunctions.nativeOnCapturerFormatSelected(RXVideoCaptureAndroid.this.mNativeCaptureObserver, i10, i11, i12, i13, i14);
        }

        @Override // com.ss.bytertc.base.media.CapturerObserver
        public void onCapturerStarted(boolean z10) {
            if (!z10) {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            } else {
                RXLogging.w(RXVideoCaptureAndroid.TAG, "onCapturerStarted...");
                RXNativeFunctions.nativeOnCapturerStarted(RXVideoCaptureAndroid.this.mNativeCaptureObserver, z10);
            }
        }

        @Override // com.ss.bytertc.base.media.CapturerObserver
        public void onCapturerStopped() {
            RXLogging.w(RXVideoCaptureAndroid.TAG, "onCapturerStopped...");
            RXNativeFunctions.nativeOnCapturerStopped(RXVideoCaptureAndroid.this.mNativeCaptureObserver);
        }

        @Override // com.ss.bytertc.base.media.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }
    };

    public class BufferType {
        public static final int BYTE_BUFFER = 1;
        public static final int TEXTURE_BUFFER = 0;

        public BufferType() {
        }
    }

    @CalledByNative
    RXVideoCaptureAndroid(boolean z10, long j10, EglBase.Context context) {
        this.mIsCaptureScreen = false;
        this.sharedEglGroup = null;
        RXLogging.w(TAG, "RXVideoCaptureAndroid Created, CaptureScreen=" + z10);
        this.mIsCaptureScreen = z10;
        this.mNativeCaptureObserver = j10;
        this.sharedEglGroup = context;
    }

    private VideoCapturer createVideoCapturer(boolean z10, Intent intent, int i10) {
        CameraVideoCapturer cameraVideoCapturerCreateCapturer;
        try {
            if (z10) {
                return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() { // from class: com.ss.bytertc.base.media.camera.RXVideoCaptureAndroid.3
                    @Override // android.media.projection.MediaProjection.Callback
                    public void onStop() {
                        RXLogging.e(RXVideoCaptureAndroid.TAG, "User revoked permission to capture the screen.");
                    }
                });
            }
            boolean z11 = true;
            if (this.mCaptureBufferType == 1 || !isCaptureToTextureSupported()) {
                z11 = false;
            }
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(z11, false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            if (deviceNames.length > i10 && i10 >= 0 && (cameraVideoCapturerCreateCapturer = camera1Enumerator.createCapturer(deviceNames[i10], this.mCameraEventsHandler)) != null) {
                RXLogging.i(TAG, "createVideoCapturer, deviceUniqueId: " + i10);
                return cameraVideoCapturerCreateCapturer;
            }
            RXLogging.w(TAG, "enumerator camera but cannot find a match one, use default. deviceUniqueId: " + i10 + ", deviceNames: " + deviceNames.length);
            if (deviceNames.length > 0) {
                String str = deviceNames[0];
                CameraVideoCapturer cameraVideoCapturerCreateCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                if (cameraVideoCapturerCreateCapturer2 != null) {
                    return cameraVideoCapturerCreateCapturer2;
                }
                RXLogging.e(TAG, "VideoCapturer first camera create null, name:" + str);
            } else {
                RXLogging.e(TAG, "num of camera in device is zero");
            }
            RXLogging.e(TAG, "cannot init VideoCapture: ");
            return null;
        } catch (IllegalArgumentException e10) {
            RXLogging.e(TAG, "Create VideoCapture fail : " + e10.getMessage());
            return null;
        }
    }

    @CalledByNative
    static int[] getCameraSensorOrientations() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras <= 0) {
            RXLogging.w(TAG, "getNumberOfCameras failed on count " + numberOfCameras);
            return null;
        }
        int[] iArr = new int[numberOfCameras];
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                Camera.getCameraInfo(i10, cameraInfo);
                iArr[i10] = cameraInfo.orientation;
            } catch (Exception e10) {
                RXLogging.w(TAG, "getCameraInfo failed on index " + i10 + ',' + e10.getMessage());
                return null;
            }
        }
        return iArr;
    }

    private boolean isCaptureToTextureSupported() {
        return true;
    }

    @CalledByNative
    static boolean isFrontCamera(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i10, cameraInfo);
            return cameraInfo.facing == 1;
        } catch (Exception e10) {
            RXLogging.w(TAG, "getCameraInfo failed on index " + i10 + ',' + e10.getMessage());
            return false;
        }
    }

    private void startVideoCapture(int i10, int i11, int i12) {
        RXLogging.w(TAG, String.format("startVideoCapture: width: %d, height: &d, fps: &d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i10, i11, i12);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e10) {
                RXLogging.e(TAG, "VideoCapture startCapture fail : " + e10.getMessage());
            }
        }
    }

    @CalledByNative
    public int enableFollowGravity(boolean z10) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.enableFollowGravity(z10);
        }
        return 0;
    }

    public int getCameraFace() {
        return this.mIsFrontCamera ? 1 : 0;
    }

    @CalledByNative
    public float getCameraZoomMaxRatio() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.getCameraZoomMaxRatio();
        }
        return -1.0f;
    }

    @CalledByNative
    int getDeviceOrientation() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        return (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) ? videoCapturer.getDeviceOrientation() : getUIOrientation();
    }

    @CalledByNative
    int getUIOrientation() {
        int rotation = ((WindowManager) ContextUtils.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 270;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 90;
        }
        return 180;
    }

    @CalledByNative
    public boolean isCameraTorchSupported() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.isCameraTorchSupported();
        }
        return false;
    }

    @CalledByNative
    public boolean isCameraZoomSupported() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.isCameraZoomSupported();
        }
        return false;
    }

    @CalledByNative
    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    @CalledByNative
    public int setCameraZoomRatio(float f10) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.setCameraZoomRatio(f10);
        }
        return -1;
    }

    @CalledByNative
    public void startCapture(int i10, int i11, int i12, int i13, Intent intent, boolean z10, int i14) {
        SurfaceTextureHelper surfaceTextureHelper;
        RXLogging.w(TAG, "startCapture...");
        this.mWidth = i10;
        this.mHeight = i11;
        this.mCaptureScreenIntent = intent;
        this.mCaptureBufferType = i13;
        if (androidx.core.content.d.a(ContextUtils.getApplicationContext(), "android.permission.CAMERA") != 0) {
            RXNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, -100);
            return;
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(this.mIsCaptureScreen, this.mCaptureScreenIntent, i14);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = com.bytedance.realx.video.a.b(this.sharedEglGroup);
        }
        if (this.mVideoCapturer == null) {
            RXLogging.e(TAG, "mVideoCapturer is null...");
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("RXLocalCapturer", this.cameraEglBase.getEglBaseContext());
        this.mSurfaceTextureHelper = surfaceTextureHelperCreate;
        surfaceTextureHelperCreate.setUsedByCamera(true);
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 == null || (surfaceTextureHelper = this.mSurfaceTextureHelper) == null) {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
            return;
        }
        videoCapturer2.initialize(surfaceTextureHelper, ContextUtils.getApplicationContext(), this.localCapturerObserver);
        this.mIsVideoCaptureInited = true;
        VideoCapturer videoCapturer3 = this.mVideoCapturer;
        if (videoCapturer3 instanceof Camera1Capturer) {
            ((Camera1Capturer) videoCapturer3).enableFaceAE(z10);
        }
        startVideoCapture(i10, i11, i12);
    }

    @CalledByNative
    public void stopCapture() {
        RXLogging.w(TAG, "stopCapture...");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    @CalledByNative
    public void switchCamera() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && (videoCapturer instanceof CameraVideoCapturer)) {
            this.mIsFrontCamera = !this.mIsFrontCamera;
            ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: com.ss.bytertc.base.media.camera.RXVideoCaptureAndroid.2
                @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchDone(boolean z10) {
                    RXVideoCaptureAndroid.this.mIsFrontCamera = z10;
                }

                @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchError(String str) {
                }
            });
        }
    }

    @CalledByNative
    public void turnOffFlashLight() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.turnOffFlashLight();
        }
    }

    @CalledByNative
    public void turnOnFlashLight() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.turnOnFlashLight();
        }
    }
}
