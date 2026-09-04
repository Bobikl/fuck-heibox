package com.ss.bytertc.base.media.screen;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.p0;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.CapturerObserver;
import com.ss.bytertc.base.media.SurfaceTextureHelper;
import com.ss.bytertc.base.media.VideoCapturer;
import com.ss.bytertc.base.media.VideoSink;
import com.ss.bytertc.base.media.camera.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public class ScreenCaptureAndroidManager implements VideoCapturer, VideoSink {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_MIN_FRAME_RATE = 4;
    private static final int DISPLAY_FLAGS = 11;
    private static final String TAG = "ScreenCapture";
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private static final String VIRTUAL_DISPLAY_NAME = "RTCScreenCapture";

    @p0
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private boolean isSurfaceDispose;
    private Context mContext;
    private DeviceOrientation mCurrentOrientation;
    private Display mDisplay;
    private int mFrameIndex;
    private Map<Integer, CountDownLatch> mLocks;
    private boolean mPicoCapture2DTexture;
    private boolean mPicoCreateMediaProjection;
    private boolean mPicoNotCheckOrientation;
    private int mPicoVirtualDisplayDpi;
    private int mPicoVirtualDisplayFlag;
    private String mPicoVirtualDisplayName;
    private Map<Integer, VideoFrame> mVideoFrames;

    @p0
    private MediaProjection mediaProjection;
    private MediaProjection.Callback mediaProjectionCallback;

    @p0
    private MediaProjectionManager mediaProjectionManager;
    private Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;

    @p0
    private SurfaceTextureHelper surfaceTextureHelper;

    @p0
    private VirtualDisplay virtualDisplay;
    private int width;

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    public static final class HOLDER {
        private static final ScreenCaptureAndroidManager INSTANCE = new ScreenCaptureAndroidManager();

        private HOLDER() {
        }
    }

    private ScreenCaptureAndroidManager() {
        this.mFrameIndex = 0;
        this.mPicoNotCheckOrientation = false;
        this.mPicoCreateMediaProjection = false;
        this.mPicoVirtualDisplayName = VIRTUAL_DISPLAY_NAME;
        this.mPicoVirtualDisplayDpi = 400;
        this.mPicoVirtualDisplayFlag = 11;
        this.mPicoCapture2DTexture = false;
        this.mVideoFrames = new HashMap();
        this.mLocks = new HashMap();
    }

    public static ScreenCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        CapturerObserver capturerObserver;
        if (updateVirtualDisplayConfig()) {
            RXLogging.w(TAG, String.format("[ScreenCapture] call updateVirtualDisplayConfig success, width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
            return;
        }
        if (this.mediaProjection == null) {
            RXLogging.e(TAG, "createVirtualDisplay failed, mediaProjection is null");
            return;
        }
        if (this.virtualDisplay != null) {
            RXLogging.e(TAG, "[ScreenCapture] release current virtualdisplay");
            this.virtualDisplay.release();
            this.virtualDisplay = null;
        }
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        try {
            RXLogging.w(TAG, String.format("[ScreenCapture] call |createVirtualDisplay|,  width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
            String str = this.mPicoVirtualDisplayName;
            if (str != null) {
                this.virtualDisplay = this.mediaProjection.createVirtualDisplay(str, this.width, this.height, this.mPicoVirtualDisplayDpi, this.mPicoVirtualDisplayFlag, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
            } else {
                this.virtualDisplay = this.mediaProjection.createVirtualDisplay(VIRTUAL_DISPLAY_NAME, this.width, this.height, 400, 11, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
            }
            if (this.virtualDisplay != null || (capturerObserver = this.capturerObserver) == null) {
                return;
            }
            capturerObserver.onCapturerError("create virtual display failed.");
        } catch (SecurityException unused) {
            this.virtualDisplay = null;
            Log.i("ScreenCaptureAndroid", "Invalid media projection, no permission");
            CapturerObserver capturerObserver2 = this.capturerObserver;
            if (capturerObserver2 != null) {
                capturerObserver2.onCapturerError("create virtual display failed.");
            }
        }
    }

    private DeviceOrientation getDeviceOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 90) {
                if (i10 != 180) {
                    if (i10 != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private int getDeviceRotation() {
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private DeviceOrientation getDisplayOrientation() {
        return this.mContext.getResources().getConfiguration().orientation == 1 ? DeviceOrientation.PORTRAIT : DeviceOrientation.LANDSCAPE;
    }

    private boolean maybeDoRotation() {
        int deviceRotation = getDeviceRotation();
        DeviceOrientation deviceOrientation = getDeviceOrientation(deviceRotation);
        DeviceOrientation displayOrientation = getDisplayOrientation();
        if (displayOrientation == this.mCurrentOrientation) {
            return false;
        }
        RXLogging.w(TAG, String.format("[ScreenCapture] call |maybeDoRotation| and orientation != mCurrentOrientation, rotation:%d, orientation:%s, orientation1:%s", Integer.valueOf(deviceRotation), displayOrientation.toString(), deviceOrientation.toString()));
        this.mCurrentOrientation = displayOrientation;
        rotateCaptureOrientation(displayOrientation);
        return true;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if ((deviceOrientation != DeviceOrientation.LANDSCAPE || this.width >= this.height) && (deviceOrientation != DeviceOrientation.PORTRAIT || this.height >= this.width)) {
            return;
        }
        RXLogging.w(TAG, String.format("[ScreenCapture] call |rotateCaptureOrientation| before(orientation:%s, width:%d, height:%d)", deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)));
        int i10 = this.width;
        int i11 = this.height;
        this.height = i10;
        this.width = i10 + (i11 - i10);
        RXLogging.w(TAG, String.format("[ScreenCapture] call |rotateCaptureOrientation| after(orientation:%s, width:%d, height:%d)", deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)));
    }

    private boolean updateVirtualDisplayConfig() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        RXLogging.w(TAG, String.format("[ScreenCapture] updateVirtualDisplayConfig width=%d, height=%d", Integer.valueOf(this.width), Integer.valueOf(this.height)));
        if (this.mediaProjection == null) {
            RXLogging.e(TAG, "updateVirtualDisplayConfig failed, mediaProjection is null");
            return false;
        }
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay == null) {
            RXLogging.e(TAG, "updateVirtualDisplayConfig failed, virtualDisplay is null");
            return false;
        }
        int i10 = this.mPicoVirtualDisplayName != null ? this.mPicoVirtualDisplayDpi : 400;
        virtualDisplay.setSurface(null);
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay.resize(this.width, this.height, i10);
        this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
        return true;
    }

    public int addFrame(VideoFrame videoFrame) {
        int i10 = this.mFrameIndex;
        this.mVideoFrames.put(Integer.valueOf(i10), videoFrame);
        this.mFrameIndex++;
        return i10;
    }

    public void addLock(int i10, CountDownLatch countDownLatch) {
        this.mLocks.put(Integer.valueOf(i10), countDownLatch);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void changeCaptureFormat(int i10, int i11, int i12) {
        checkNotDisposed();
        if (i10 == this.width && i11 == this.height) {
            RXLogging.w(TAG, "[ScreenCapture] call |changeCaptureFormat|, width & height are same as previous, ignore the request");
            return;
        }
        if (i10 <= 0 || i11 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i10;
            this.height = i11;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.bytertc.base.media.screen.ScreenCaptureAndroidManager.2
            @Override // java.lang.Runnable
            public void run() {
                ScreenCaptureAndroidManager.this.mCurrentOrientation = null;
                ScreenCaptureAndroidManager.this.createVirtualDisplay();
            }
        });
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void dispose() {
        SurfaceTextureHelper surfaceTextureHelper;
        this.isDisposed = true;
        if (this.isSurfaceDispose && (surfaceTextureHelper = this.surfaceTextureHelper) != null) {
            surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
    }

    public synchronized void dispose(int i10) {
        CountDownLatch countDownLatchRemove = this.mLocks.remove(Integer.valueOf(i10));
        if (countDownLatchRemove != null) {
            countDownLatchRemove.countDown();
            Log.i("ScreenCaptureAndroid", "stopCapture countDown finish");
        }
        dispose();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int enableFollowGravity(boolean z10) {
        return -1;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int getDeviceOrientation() {
        return m.b(ContextUtils.getApplicationContext());
    }

    @p0
    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("RXLocalCapturer", context, false, this.mPicoCapture2DTexture);
        this.surfaceTextureHelper = surfaceTextureHelperCreate;
        this.isSurfaceDispose = true;
        this.mCurrentOrientation = null;
        if (surfaceTextureHelperCreate == null) {
            capturerObserver.onCapturerError("surfaceTextureHelper is null.");
            throw new RuntimeException("surfaceTextureHelper is null.");
        }
        this.mContext = context2;
        this.mediaProjectionManager = (MediaProjectionManager) context2.getSystemService("media_projection");
        this.mDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            capturerObserver.onCapturerError("surfaceTextureHelper not set.");
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.isSurfaceDispose = false;
        this.mCurrentOrientation = null;
        this.mContext = context;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
        this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.mPicoNotCheckOrientation && maybeDoRotation()) {
            createVirtualDisplay();
        } else {
            this.numCapturedFrames++;
            this.capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public VideoFrame removeFrame(int i10) {
        if (this.mVideoFrames.containsKey(Integer.valueOf(i10))) {
            return this.mVideoFrames.remove(Integer.valueOf(i10));
        }
        return null;
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public int setCameraZoomRatio(float f10) {
        return 0;
    }

    public void setData(Intent intent, MediaProjection.Callback callback) {
        this.isDisposed = false;
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
        this.mPicoNotCheckOrientation = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_NOT_CHECK_ORIENTATION, false);
        this.mPicoCreateMediaProjection = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_CREATE_MEDIA_PROJECTION, false);
        this.mPicoVirtualDisplayName = intent.getStringExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_NAME);
        this.mPicoVirtualDisplayDpi = intent.getIntExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_DPI, 400);
        this.mPicoVirtualDisplayFlag = intent.getIntExtra(RXScreenCaptureService.KEY_PICO_VIRTUAL_DISPLAY_FLAG, 11);
        this.mPicoCapture2DTexture = intent.getBooleanExtra(RXScreenCaptureService.KEY_PICO_NEED_CAPTURE_2D_TEXTURE, false);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i10, int i11, int i12) {
        startCapture(i10, i11, i12, 4);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void startCapture(int i10, int i11, int i12, int i13) {
        checkNotDisposed();
        RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture|,  width=%d, height=%d", Integer.valueOf(i10), Integer.valueOf(i11)));
        if (i10 <= 0 || i11 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i10;
            this.height = i11;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        maybeDoRotation();
        try {
            this.mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        } catch (Exception e10) {
            Log.w("startCapture", "mediaProjectionManager.getMediaProjection failed", e10);
            this.mediaProjection = null;
        }
        if (this.mediaProjection == null && this.mPicoCreateMediaProjection) {
            Log.i("startCapture", "mediaProjection is null, try to use pico private interface on pico os platform");
            try {
                this.mediaProjection = (MediaProjection) MediaProjectionManager.class.getMethod(RXScreenCaptureService.METHOD_PICO_CREATE_MEDIA_PROJECTION, new Class[0]).invoke(this.mediaProjectionManager, new Object[0]);
            } catch (Exception e11) {
                Log.w("startCapture", "mediaProjection is null, use pico private interface failed", e11);
                this.mediaProjection = null;
            }
        }
        MediaProjection mediaProjection = this.mediaProjection;
        if (mediaProjection == null) {
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onCapturerError("no permission to capture the screen video.");
            }
            return;
        }
        mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (i13 <= 0) {
            i13 = 4;
        }
        surfaceTextureHelper.setMinFps(i13);
        this.surfaceTextureHelper.startListening(this);
    }

    public synchronized void startCapture(int i10, int i11, int i12, int i13, MediaProjection mediaProjection) {
        checkNotDisposed();
        RXLogging.w(TAG, String.format("[ScreenCapture] call |startCapture|,  width=%d, height=%d", Integer.valueOf(i10), Integer.valueOf(i11)));
        if (i10 <= 0 || i11 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i10;
            this.height = i11;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        maybeDoRotation();
        this.mediaProjection = mediaProjection;
        if (mediaProjection == null) {
            CapturerObserver capturerObserver = this.capturerObserver;
            if (capturerObserver != null) {
                capturerObserver.onCapturerError("no permission to capture the screen video.");
            }
            return;
        }
        mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (i13 <= 0) {
            i13 = 4;
        }
        surfaceTextureHelper.setMinFps(i13);
        this.surfaceTextureHelper.startListening(this);
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.bytertc.base.media.screen.ScreenCaptureAndroidManager.1
            @Override // java.lang.Runnable
            public void run() {
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
                if (ScreenCaptureAndroidManager.this.virtualDisplay != null) {
                    ScreenCaptureAndroidManager.this.virtualDisplay.release();
                    ScreenCaptureAndroidManager.this.virtualDisplay = null;
                }
                if (ScreenCaptureAndroidManager.this.mediaProjection != null) {
                    ScreenCaptureAndroidManager.this.mediaProjection.unregisterCallback(ScreenCaptureAndroidManager.this.mediaProjectionCallback);
                    ScreenCaptureAndroidManager.this.mediaProjection = null;
                }
                ScreenCaptureAndroidManager.this.mCurrentOrientation = null;
            }
        });
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.ss.bytertc.base.media.VideoCapturer
    public void turnOnFlashLight() {
    }
}
