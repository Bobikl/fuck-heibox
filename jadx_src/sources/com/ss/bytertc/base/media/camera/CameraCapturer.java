package com.ss.bytertc.base.media.camera;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.CapturerObserver;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;

    @p0
    private CameraVideoCapturer.CameraStatistics cameraStatistics;

    @p0
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;

    @p0
    private CameraSession currentSession;

    @p0
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private boolean sessionOpening;

    @p0
    private SurfaceTextureHelper surfaceHelper;

    @p0
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;
    private CameraVideoCapturer.ORIENTATION_MODE mOrientationMode = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;

    @p0
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.1
        @Override // com.ss.bytertc.base.media.camera.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                RXLogging.w(CameraCapturer.TAG, "Create session done. Switch state: " + CameraCapturer.this.switchState);
                if (cameraSession != null) {
                    cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                }
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer.this.sessionOpening = false;
                CameraCapturer.this.currentSession = cameraSession;
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                CameraCapturer.this.firstFrameObserved = false;
                CameraCapturer.this.stateLock.notifyAll();
                if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    if (CameraCapturer.this.switchEventsHandler != null) {
                        CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler);
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer.access$1710(CameraCapturer.this);
                if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                    RXLogging.e(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    SwitchState switchState = CameraCapturer.this.switchState;
                    SwitchState switchState2 = SwitchState.IDLE;
                    if (switchState != switchState2) {
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = switchState2;
                    }
                    if (failureType == CameraSession.FailureType.DISCONNECTED) {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                } else {
                    RXLogging.e(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                    CameraCapturer.this.createSessionInternal(500);
                }
            }
        }
    };

    @p0
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.2
        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                    CameraCapturer.this.eventsHandler.onCameraClosed();
                } else {
                    RXLogging.e(CameraCapturer.TAG, "onCameraClosed from another session.");
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraConfig(int i10, int i11, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.eventsHandler.onCameraConfig(i10, i11, framerateRange);
                CameraCapturer.this.capturerObserver.onCapturerFormatSelected(i10, i11, framerateRange.min / 1000, framerateRange.max / 1000, RXPixelFormat.kUnknown.value());
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    RXLogging.e(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraDisconnected();
                CameraCapturer.this.capturerObserver.onCapturerError("CameraDisconnected");
                CameraCapturer.this.stopCapture();
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession == CameraCapturer.this.currentSession) {
                    CameraCapturer.this.eventsHandler.onCameraError(str);
                    CameraCapturer.this.capturerObserver.onCapturerError(str);
                    CameraCapturer.this.stopCapture();
                } else {
                    RXLogging.e(CameraCapturer.TAG, "onCameraError from another session: " + str);
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (CameraCapturer.this.currentSession != null) {
                    RXLogging.e(CameraCapturer.TAG, "onCameraOpening while session was open.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                }
            }
        }

        @Override // com.ss.bytertc.base.media.camera.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    RXLogging.e(CameraCapturer.TAG, "onFrameCaptured from another session.");
                    return;
                }
                if (!CameraCapturer.this.firstFrameObserved) {
                    CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                    CameraCapturer.this.firstFrameObserved = true;
                }
                if (CameraCapturer.this.cameraStatistics != null) {
                    CameraCapturer.this.cameraStatistics.addFrame();
                }
                CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;
    private String nativeLibraryName = "bytertc";
    protected boolean mEnableFollowGravity = false;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, @p0 CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.4
            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraClosed");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraConfig(int i10, int i11, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraClosed");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraDisconnected");
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraError: " + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
                RXLogging.e(CameraCapturer.TAG, "CameraEventsHandler onCameraFreezed: " + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onCameraOpening" + str2);
            }

            @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
                RXLogging.w(CameraCapturer.TAG, "CameraEventsHandler onFirstFrameAvailable");
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        }
        if (Arrays.asList(deviceNames).contains(this.cameraName)) {
            return;
        }
        throw new IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
    }

    static /* synthetic */ int access$1710(CameraCapturer cameraCapturer) {
        int i10 = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (this.cameraThreadHandler == null || Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            RXLogging.e(TAG, "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i10) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i10 + 10000);
        Handler handler = this.cameraThreadHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (CameraCapturer.this.stateLock) {
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
                    }
                } catch (IllegalArgumentException e10) {
                    if (CameraCapturer.this.capturerObserver != null) {
                        CameraCapturer.this.capturerObserver.onCapturerError("Create VideoCapture Session fail : " + e10.getMessage());
                    }
                }
            }
        }, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableFollowGravity$6(boolean z10, AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.enableFollowGravity(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCameraZoomMaxRatio$5(AtomicReference atomicReference) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicReference.set(Float.valueOf(cameraSession.getCameraZoomMaxRatio()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDeviceOrientation$7(AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.getDeviceOrientation());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isCameraTorchSupported$0(AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraTorchSupported());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isCameraZoomSupported$3(AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraZoomSupported());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCameraZoomRatio$4(float f10, AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.setCameraZoomRatio(f10);
            atomicInteger.set(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$turnOffFlashLight$2() {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOffFlashLight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$turnOnFlashLight$1() {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOnFlashLight();
        }
    }

    private void reportCameraSwitchError(String str, @p0 CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(@p0 CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w(TAG, "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
                return;
            }
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                return;
            }
            boolean z10 = this.sessionOpening;
            if (!z10 && this.currentSession == null) {
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                return;
            }
            this.switchEventsHandler = cameraSwitchHandler;
            if (z10) {
                this.switchState = SwitchState.PENDING;
                return;
            }
            this.switchState = SwitchState.IN_PROGRESS;
            RXLogging.w(TAG, "switchCamera: Stopping session");
            CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
            if (cameraStatistics != null) {
                cameraStatistics.release();
                this.cameraStatistics = null;
            }
            final CameraSession cameraSession = this.currentSession;
            Handler handler = this.cameraThreadHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
            }
            this.currentSession = null;
            this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
            this.sessionOpening = true;
            this.openAttemptsRemaining = 1;
            createSessionInternal(0);
            RXLogging.w(TAG, "switchCamera done");
        }
    }

    @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        n.a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void changeCaptureFormat(int i10, int i11, int i12) {
        RXLogging.w(TAG, "changeCaptureFormat: " + i10 + "x" + i11 + "@" + i12);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i10, i11, i12);
        }
    }

    protected abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12);

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void dispose() {
        RXLogging.w(TAG, "dispose");
        stopCapture();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(final boolean z10) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f97862b.lambda$enableFollowGravity$6(z10, atomicInteger);
            }
        });
        int i10 = atomicInteger.get();
        if (i10 == 0) {
            this.mEnableFollowGravity = z10;
        }
        return i10;
    }

    protected String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(1.0f));
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f97872b.lambda$getCameraZoomMaxRatio$5(atomicReference);
            }
        });
        return ((Float) atomicReference.get()).floatValue();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f97867b.lambda$getDeviceOrientation$7(atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void initialize(@p0 SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        synchronized (this.stateLock) {
            this.capturerObserver = capturerObserver;
        }
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper == null ? null : surfaceTextureHelper.getHandler();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f97865b.lambda$isCameraTorchSupported$0(atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f97869b.lambda$isCameraZoomSupported$3(atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                RXLogging.w(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    RXLogging.w(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        n.b(this, mediaRecorderHandler);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(final float f10) {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: com.ss.bytertc.base.media.camera.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f97874b.lambda$setCameraZoomRatio$4(f10, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void startCapture(int i10, int i11, int i12) {
        RXLogging.w(TAG, "startCapture: " + i10 + "x" + i11 + "@" + i12);
        if (this.applicationContext == null) {
            throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
        synchronized (this.stateLock) {
            if (!this.sessionOpening && this.currentSession == null) {
                this.width = i10;
                this.height = i11;
                this.framerate = i12;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 3;
                createSessionInternal(0);
                return;
            }
            RXLogging.w(TAG, "Session already open");
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void startCapture(int i10, int i11, int i12, int i13) {
        startCapture(i10, i11, i12);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void stopCapture() {
        RXLogging.w(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                RXLogging.w(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    RXLogging.e(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                RXLogging.w(TAG, "Stop capture: Nulling session");
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.cameraStatistics = null;
                }
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                RXLogging.w(TAG, "Stop capture: No session open");
            }
        }
        RXLogging.w(TAG, "Stop capture done");
    }

    @Override // com.ss.bytertc.base.media.camera.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w(TAG, "switchCamera");
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.CameraCapturer.7
                @Override // java.lang.Runnable
                public void run() {
                    CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
                }
            });
        }
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f97871b.lambda$turnOffFlashLight$2();
            }
        });
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.camera.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f97861b.lambda$turnOnFlashLight$1();
            }
        });
    }
}
