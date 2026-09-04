package com.ss.bytertc.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import com.alipay.sdk.m.x.d;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.NV21Buffer;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.TimestampAligner;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.k;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.provider.c;
import com.ss.android.ttvecamera.q;
import com.ss.bytertc.engine.UIDeviceOrientation;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class VECameraWrapper {
    private long mNativeObj;
    CamParam mParam;
    private EglBase.Context mSharedCtx;
    private Context mContext = null;
    private k mCamera = null;
    private Object mCameraLock = new Object();
    private TECameraSettings mVESettings = null;
    private int mLastDeviceOrientation = 0;
    private int mLastUIOrientation = 0;
    private long mLastDeviceOrientationTS = 0;
    private EventObserver mEventObserver = null;
    private FrameListener mFrameListener = null;
    private int mActWidth = 0;
    private int mActHeight = 0;
    private final int STA_STOPPED = 0;
    private final int STA_STARTING = 1;
    private final int STA_STARTED = 2;
    AtomicInteger mCamState = new AtomicInteger(0);
    private volatile LogCallback mLogger = new LogCallback();
    private final String TAG2SVR = "toSvr";
    private final int CAMERA_BLOCK_THRESHOLD_MS = 2000;
    private boolean mIsExposurePointSupported = true;
    private boolean mIsFocusPointSupported = true;
    private boolean mUseGravitySensor = false;
    private AtomicInteger mGravityOrientation = new AtomicInteger(UIDeviceOrientation.Portrait.value());
    private Camera.CameraInfo mCamInfo = null;
    private Camera.CameraInfo[] mCamInfoList = null;
    private final SensorEventListener mSensorListener = new SensorEventListener() { // from class: com.ss.bytertc.media.VECameraWrapper.2
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
            if (Math.abs(fAbs - fAbs2) < 6.0d) {
                return;
            }
            if (fAbs >= fAbs2) {
                if (f10 >= 0.0f) {
                    VECameraWrapper.this.mGravityOrientation.set(UIDeviceOrientation.LandscapeRight.value());
                    return;
                } else {
                    VECameraWrapper.this.mGravityOrientation.set(UIDeviceOrientation.LandscapeLeft.value());
                    return;
                }
            }
            if (f11 >= 0.0f) {
                VECameraWrapper.this.mGravityOrientation.set(UIDeviceOrientation.Portrait.value());
            } else {
                VECameraWrapper.this.mGravityOrientation.set(UIDeviceOrientation.PortraitUpsidedown.value());
            }
        }
    };

    public static class CamDevInfo {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f98047id;
        private String name;
        private int pos;

        public CamDevInfo(String str, String str2, int i10) {
            this.f98047id = str;
            this.name = str2;
            this.pos = i10;
        }

        @CalledByNative("CamDevInfo")
        public String getID() {
            return this.f98047id;
        }

        @CalledByNative("CamDevInfo")
        public String getName() {
            return this.name;
        }

        @CalledByNative("CamDevInfo")
        public int getPosition() {
            return this.pos;
        }
    }

    public static class CamParam {
        public boolean antiShake;
        public boolean camera2;
        public String camid;
        public boolean enable_dynamic_fps;
        public boolean faceAE;
        public int fps;
        public int height;
        public int min_dynamic_fps;
        public int pos;
        public boolean useTexture;
        public boolean wideAngle;
        public int width;

        @CalledByNative("CamParam")
        public CamParam(int i10, int i11, int i12, int i13, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i14) {
            this.width = i10;
            this.height = i11;
            this.fps = i12;
            this.pos = i13;
            this.camid = str;
            this.useTexture = z10;
            this.camera2 = z11;
            this.faceAE = z12;
            this.wideAngle = z13;
            this.antiShake = z14;
            this.enable_dynamic_fps = z15;
            this.min_dynamic_fps = i14;
        }
    }

    public class EventObserver implements k.b {
        EventObserver() {
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onCaptureStarted(int i10, int i11) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onCaptureStarted ret = " + i11);
            if (i11 == 0) {
                CamParam camParam = VECameraWrapper.this.mParam;
                TEFrameSizei tEFrameSizei = new TEFrameSizei(camParam.width, camParam.height);
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                int iC = VECameraWrapper.this.mCamera.c(vECameraWrapper.mParam.useTexture ? new c.a(tEFrameSizei, (com.ss.android.ttvecamera.provider.b.c) vECameraWrapper.mFrameListener, true, VECameraWrapper.this.mFrameListener.mSurfaceTexture, VECameraWrapper.this.mFrameListener.mTexId) : new c.a(tEFrameSizei, (com.ss.android.ttvecamera.provider.b.c) vECameraWrapper.mFrameListener, false, new SurfaceTexture(0), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21));
                VECameraWrapper.this.mLogger.Log((byte) 8, "", "addCameraProvider rst =" + String.valueOf(iC));
                VECameraWrapper.this.mCamera.C0();
                VECameraWrapper.this.mCamState.set(2);
            }
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onCaptureStopped(int i10) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onCaptureStopped");
            VECameraWrapper.this.safeNativeOnCaptureStopped();
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onError(int i10, String str) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "CameraObserver.onError, err=" + Integer.toString(i10) + " msg=" + str);
            VECameraWrapper.this.safeNativeOnCaptureError(i10, str);
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onInfo(int i10, int i11, String str) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "", "CameraObserver.onInfo, type=" + Integer.toString(i10) + " msg=" + str);
            if (i10 != 1 || VECameraWrapper.this.mCamera == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(TECameraSettings.k.f97151q, null);
            VECameraWrapper.this.mCamera.d0(bundle);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(TECameraSettings.k.f97151q);
            if (parcelableArrayList != null) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", parcelableArrayList.toString());
            }
        }
    }

    public class FrameListener implements com.ss.android.ttvecamera.provider.b.c {
        boolean mIsFirstFrame = true;
        boolean mStopped = false;
        private SurfaceTexture mSurfaceTexture = null;
        private int mTexId = -1;
        private YuvConverter mYuvConverter = null;
        EglBase mEglBase = null;
        private HandlerThread mThread = null;
        private Handler mHandler = null;
        private Matrix mTexMat = null;
        private TimestampAligner mTimestampAligner = new TimestampAligner();
        private Semaphore mFreeTexSema = null;
        private long mSendTexFrameStart = 0;
        private long frameCountReturned = 0;
        private long frameCountSent = 0;
        private final AtomicInteger mISO = new AtomicInteger(-1);
        private final int mISOPeriodMillis = 1500;
        private Runnable updateISO = new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.6
            @Override // java.lang.Runnable
            public void run() {
                synchronized (VECameraWrapper.this.mCameraLock) {
                    if (VECameraWrapper.this.mCamera != null) {
                        k kVar = VECameraWrapper.this.mCamera;
                        final AtomicInteger atomicInteger = FrameListener.this.mISO;
                        Objects.requireNonNull(atomicInteger);
                        kVar.J(new TECameraSettings.m() { // from class: com.ss.bytertc.media.b
                            @Override // com.ss.android.ttvecamera.TECameraSettings.m
                            public final void a(int i10) {
                                atomicInteger.set(i10);
                            }
                        });
                    }
                }
                FrameListener.this.mHandler.postDelayed(this, 1500L);
            }
        };

        FrameListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void doCleanup() {
            YuvConverter yuvConverter = this.mYuvConverter;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            int i10 = this.mTexId;
            if (i10 > 0) {
                GLES20.glDeleteTextures(1, new int[]{i10}, 0);
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            EglBase eglBase = this.mEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            this.mYuvConverter = null;
            this.mTexId = 0;
            this.mSurfaceTexture = null;
            this.mEglBase = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void returnRawFrame() {
            this.frameCountReturned++;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void returnTextureFrame() {
            this.frameCountReturned++;
            this.mFreeTexSema.release();
        }

        private void sendRawFrame(TECameraFrame tECameraFrame) {
            VideoFrame videoFrame = new VideoFrame((VideoFrame.Buffer) new NV21Buffer(tECameraFrame.b(), tECameraFrame.k().f97206b, tECameraFrame.k().f97207c, new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener.this.returnRawFrame();
                }
            }), VECameraWrapper.this.getFrameOrientation(), System.nanoTime(), false);
            videoFrame.setIso(this.mISO.get());
            VECameraWrapper.this.safeNativeOnFrameCaptured(videoFrame);
            this.frameCountSent++;
            videoFrame.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: sendTexFrame, reason: merged with bridge method [inline-methods] */
        public void lambda$sendTexFrame$0(final TECameraFrame tECameraFrame) {
            boolean zTryAcquire;
            if (this.mStopped) {
                return;
            }
            if (this.mSendTexFrameStart != 0 && SystemClock.elapsedRealtime() - this.mSendTexFrameStart > 2000) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "block by other node");
            }
            if (this.mSendTexFrameStart == 0) {
                this.mSendTexFrameStart = SystemClock.elapsedRealtime();
            }
            try {
                zTryAcquire = this.mFreeTexSema.tryAcquire(1, 2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "semaphore interrupted");
                e10.printStackTrace();
                zTryAcquire = false;
            }
            if (!zTryAcquire) {
                this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98048b.lambda$sendTexFrame$0(tECameraFrame);
                    }
                });
                return;
            }
            this.mSendTexFrameStart = 0L;
            synchronized (EglBase.lock) {
                try {
                    this.mSurfaceTexture.updateTexImage();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    VECameraWrapper.this.mLogger.Log((byte) 8, "", "updateTexImage failed(could be caused by fd leak)");
                }
            }
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(tECameraFrame.k().f97206b, tECameraFrame.k().f97207c, VideoFrame.TextureBuffer.Type.OES, tECameraFrame.l(), matrix, this.mHandler, this.mYuvConverter, new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.2
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener.this.returnTextureFrame();
                }
            }), VECameraWrapper.this.getFrameOrientation(), this.mTimestampAligner.translateTimestamp(this.mSurfaceTexture.getTimestamp()));
            videoFrame.setIso(this.mISO.get());
            VECameraWrapper.this.safeNativeOnFrameCaptured(videoFrame);
            this.frameCountSent++;
            videoFrame.release();
        }

        @Override // com.ss.android.ttvecamera.provider.b.c
        public void onFrameCaptured(final TECameraFrame tECameraFrame) {
            VECameraWrapper.this.mActWidth = tECameraFrame.k().f97206b;
            VECameraWrapper.this.mActHeight = tECameraFrame.k().f97207c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - VECameraWrapper.this.mLastDeviceOrientationTS) > 500) {
                VECameraWrapper.this.mLastDeviceOrientationTS = jCurrentTimeMillis;
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                vECameraWrapper.mLastDeviceOrientation = vECameraWrapper.getDeviceOrientation();
                VECameraWrapper vECameraWrapper2 = VECameraWrapper.this;
                vECameraWrapper2.mLastUIOrientation = vECameraWrapper2.updateUIOrientation();
            }
            if (this.mIsFirstFrame) {
                VECameraWrapper.this.safeNativeOnCaptureStarted();
                this.mIsFirstFrame = false;
            }
            if (VECameraWrapper.this.mParam.useTexture) {
                this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        FrameListener.this.lambda$sendTexFrame$0(tECameraFrame);
                    }
                });
            } else {
                sendRawFrame(tECameraFrame);
            }
        }

        @Override // com.ss.android.ttvecamera.provider.b.c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            VECameraWrapper.this.mLogger.Log((byte) 8, "", "IFrameListener.onNewSurfaceTexture");
        }

        public void shutdown() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mHandler.removeCallbacks(this.updateISO);
            this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.5
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener frameListener = FrameListener.this;
                    if (VECameraWrapper.this.mParam.useTexture) {
                        if (frameListener.mFreeTexSema.availablePermits() == 0) {
                            try {
                                FrameListener.this.mFreeTexSema.acquire();
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                        FrameListener.this.doCleanup();
                    }
                    countDownLatch.countDown();
                    FrameListener.this.mStopped = true;
                }
            });
            try {
                countDownLatch.await();
                this.mHandler.getLooper().quit();
                this.mThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }

        public void startup() {
            HandlerThread handlerThread = new HandlerThread("vecam_handler");
            this.mThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mThread.getLooper());
            this.mFreeTexSema = new Semaphore(1);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.media.VECameraWrapper.FrameListener.4
                @Override // java.lang.Runnable
                public void run() {
                    FrameListener frameListener = FrameListener.this;
                    VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                    if (vECameraWrapper.mParam.useTexture) {
                        try {
                            frameListener.mEglBase = com.bytedance.realx.video.a.c(vECameraWrapper.mSharedCtx, EglBase.CONFIG_PIXEL_BUFFER);
                            FrameListener.this.mEglBase.createDummyPbufferSurface();
                            FrameListener.this.mEglBase.makeCurrent();
                            FrameListener.this.mTexId = GlUtil.generateTexture(36197);
                            FrameListener.this.mSurfaceTexture = new SurfaceTexture(FrameListener.this.mTexId);
                            FrameListener.this.mYuvConverter = new YuvConverter();
                        } catch (RuntimeException unused) {
                            FrameListener.this.doCleanup();
                            VECameraWrapper.this.mParam.useTexture = false;
                        }
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            this.mHandler.postDelayed(this.updateISO, 1500L);
        }
    }

    public class LogCallback implements q.b {
        LogCallback() {
        }

        @Override // com.ss.android.ttvecamera.q.b
        public void Log(byte b10, String str, String str2) {
            byte[] bArr = {1, 2, 4, 8, 16};
            int[] iArr = {4, 3, 2, 1, 0};
            int i10 = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                if (b10 == bArr[i11]) {
                    i10 = iArr[i11];
                    break;
                }
            }
            VECameraWrapper.this.safeNativeOnCaptureLog(i10, "VECAM-" + str2, str.endsWith("toSvr"));
        }
    }

    public class ZoomCallback implements TECameraSettings.w {
        CountDownLatch mSigFinish;
        public boolean mSupportZoom = false;
        public float mMaxZoom = 1.0f;

        public ZoomCallback(CountDownLatch countDownLatch) {
            this.mSigFinish = countDownLatch;
        }

        @Override // com.ss.android.ttvecamera.TECameraSettings.w
        public boolean enableSmooth() {
            return true;
        }

        @Override // com.ss.android.ttvecamera.TECameraSettings.w
        public void onChange(int i10, float f10, boolean z10) {
        }

        @Override // com.ss.android.ttvecamera.TECameraSettings.w
        public void onZoomSupport(int i10, boolean z10, boolean z11, float f10, List<Integer> list) {
            this.mSupportZoom = z10;
            this.mMaxZoom = f10;
            CountDownLatch countDownLatch = this.mSigFinish;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @CalledByNative
    VECameraWrapper(long j10, EglBase.Context context) {
        this.mNativeObj = 0L;
        this.mSharedCtx = null;
        this.mNativeObj = j10;
        this.mSharedCtx = context;
    }

    private static boolean DeviceSupportCamera2() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return true;
        }
        return !str.equals("CVTE");
    }

    private int focusAtPointImpl(float f10, float f11, boolean z10, boolean z11) {
        int i10;
        int i11;
        if (this.mCamState.get() != 2 || (i10 = this.mActWidth) == 0 || (i11 = this.mActHeight) == 0) {
            return -1;
        }
        TEFocusSettings tEFocusSettings = new TEFocusSettings(i10, i11, (int) (i10 * f10), (int) (i11 * f11), 1.0f);
        tEFocusSettings.t(TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME);
        tEFocusSettings.x(z10);
        tEFocusSettings.y(z11);
        this.mCamera.w(tEFocusSettings);
        return 0;
    }

    @SuppressLint({"DefaultLocale"})
    private String formatParams() {
        return String.format("[w:%d h:%d fr:%d pos:%d tex:%b cam2:%b faceae:%b wideangle:%b antishake:%b vp_dyfps:%b minfps:%d]", Integer.valueOf(this.mParam.width), Integer.valueOf(this.mParam.height), Integer.valueOf(this.mParam.fps), Integer.valueOf(this.mParam.pos), Boolean.valueOf(this.mParam.useTexture), Boolean.valueOf(this.mParam.camera2), Boolean.valueOf(this.mParam.faceAE), Boolean.valueOf(this.mParam.wideAngle), Boolean.valueOf(this.mParam.antiShake), Boolean.valueOf(this.mParam.enable_dynamic_fps), Integer.valueOf(this.mParam.min_dynamic_fps));
    }

    @CalledByNative
    public static CamDevInfo[] getCameraList() {
        if (DeviceSupportCamera2()) {
            return getCameraListByCamera2();
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        CamDevInfo[] camDevInfoArr = new CamDevInfo[numberOfCameras];
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i10, cameraInfo);
                String str = d.f39542v;
                int i11 = 1;
                if (cameraInfo.facing == 1) {
                    str = "front";
                    i11 = 0;
                }
                String str2 = "Camera " + i10 + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
                camDevInfoArr[i10] = new CamDevInfo(Integer.toString(i10), str2, i11);
                RXLogging.w("CameInfo", " camera name: " + str2 + ", camera id: " + i10);
            } catch (Exception e10) {
                RXLogging.e("CameInfo", "exception: " + e10.toString());
                return null;
            }
        }
        return camDevInfoArr;
    }

    private static CamDevInfo[] getCameraListByCamera2() {
        int iIntValue;
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        CamDevInfo[] camDevInfoArr = null;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            camDevInfoArr = new CamDevInfo[cameraIdList.length];
            for (int i10 = 0; i10 < cameraIdList.length; i10++) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i10]);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                if (num == null) {
                    RXLogging.e("CameInfo", "facing is null");
                } else {
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        RXLogging.e("CameInfo", "orientation is null");
                        iIntValue = 0;
                    }
                    int iIntValue2 = num.intValue();
                    String str = "Camera " + i10 + ", Facing " + iIntValue2 + ", Orientation " + iIntValue;
                    camDevInfoArr[i10] = new CamDevInfo(cameraIdList[i10], str, iIntValue2);
                    RXLogging.w("CameInfo", " camera name: " + str + ", camera id: " + cameraIdList[i10] + ",Facing: " + num);
                }
            }
        } catch (Exception e10) {
            RXLogging.e("CameInfo", "exception: " + e10.toString());
        }
        return camDevInfoArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int i10 = this.mLastDeviceOrientation;
        if (this.mUseGravitySensor) {
            i10 = this.mGravityOrientation.get();
        }
        Camera.CameraInfo cameraInfo = this.mCamInfo;
        if (cameraInfo.facing == 1) {
            i10 = 360 - i10;
        }
        return (cameraInfo.orientation + i10) % 360;
    }

    static boolean isMTKandAndroid12() {
        return Build.HARDWARE.toLowerCase().matches("mt[0-9]*") && Build.VERSION.SDK_INT == 31;
    }

    public static native void nativeOnCaptureError(long j10, int i10, String str);

    public static native void nativeOnCaptureFormatSelected(long j10, int i10, int i11, int i12, int i13, int i14);

    public static native void nativeOnCaptureLog(long j10, int i10, String str, boolean z10);

    public static native void nativeOnCaptureStarted(long j10);

    public static native void nativeOnCaptureStopped(long j10);

    public static native void nativeOnFrameCaptured(long j10, VideoFrame videoFrame);

    private ZoomCallback queryZoomAbility() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ZoomCallback zoomCallback = new ZoomCallback(countDownLatch);
        this.mCamera.g0(zoomCallback, false);
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        return zoomCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureError(int i10, String str) {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnCaptureError(j10, i10, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureFormatSelected(int i10, int i11, int i12, int i13, int i14) {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnCaptureFormatSelected(j10, i10, i11, i12, i13, i14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureLog(int i10, String str, boolean z10) {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnCaptureLog(j10, i10, str, z10);
            } else {
                Log.d("VECAM", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureStarted() {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnCaptureStarted(j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnCaptureStopped() {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnCaptureStopped(j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeNativeOnFrameCaptured(VideoFrame videoFrame) {
        synchronized (this) {
            long j10 = this.mNativeObj;
            if (j10 != 0) {
                nativeOnFrameCaptured(j10, videoFrame);
            }
        }
    }

    private void updateCameraCharacteristics() {
        int iCamera1FaceingToCamera2 = camera1FaceingToCamera2(this.mParam.pos);
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == iCamera1FaceingToCamera2) {
                    int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
                    int iIntValue2 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                    this.mIsExposurePointSupported = iIntValue > 0;
                    this.mIsFocusPointSupported = iIntValue2 > 0;
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    int camera1FaceingToCamera2(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @CalledByNative
    public int enableCameraTorch(boolean z10) {
        if (this.mCamState.get() != 2) {
            return 0;
        }
        this.mCamera.S0(z10);
        return 0;
    }

    @CalledByNative
    public int enableGravitySensor(boolean z10) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService(ak.f104420ac);
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(9)) == null) {
            return -1;
        }
        if (z10) {
            sensorManager.registerListener(this.mSensorListener, defaultSensor, 2);
            this.mUseGravitySensor = true;
        } else {
            sensorManager.unregisterListener(this.mSensorListener);
            this.mUseGravitySensor = false;
        }
        return 0;
    }

    @CalledByNative
    public int getCameraSensorOrientation() {
        return 0;
    }

    @CalledByNative
    int getCameraSensorOrientations(boolean z10) {
        int i10 = z10 ? 270 : 90;
        Camera.CameraInfo[] cameraInfoArr = this.mCamInfoList;
        if (cameraInfoArr == null) {
            return i10;
        }
        for (Camera.CameraInfo cameraInfo : cameraInfoArr) {
            int i11 = cameraInfo.facing;
            if ((i11 == 1 && z10) || (i11 == 0 && !z10)) {
                return cameraInfo.orientation;
            }
        }
        return i10;
    }

    @CalledByNative
    public float getCameraZoomMaxRatio() {
        if (this.mCamState.get() != 2) {
            return 1.0f;
        }
        return queryZoomAbility().mMaxZoom;
    }

    @CalledByNative
    public int getDeviceOrientation() {
        return this.mUseGravitySensor ? this.mGravityOrientation.get() : getUIOrientation();
    }

    @CalledByNative
    public int getUIOrientation() {
        return this.mLastUIOrientation;
    }

    @CalledByNative
    public boolean isCameraExposurePointSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mIsExposurePointSupported;
    }

    @CalledByNative
    public boolean isCameraFocusPointSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mIsFocusPointSupported;
    }

    @CalledByNative
    public boolean isCameraTorchSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return this.mCamera.Y();
    }

    @CalledByNative
    public boolean isCameraZoomSupported() {
        if (this.mCamState.get() != 2) {
            return false;
        }
        return queryZoomAbility().mSupportZoom;
    }

    @CalledByNative
    public int setCameraZoomRatio(float f10) {
        if (this.mCamState.get() != 2) {
            return -1;
        }
        this.mCamera.F0(f10, new ZoomCallback(null));
        return 0;
    }

    @CalledByNative
    public int setExposureCompensation(float f10) {
        if (f10 < -1.0f || f10 > 1.0f || this.mCamState.get() != 2 || !this.mCamera.X()) {
            return -1;
        }
        TECameraSettings.h hVarD = this.mCamera.D();
        int iCeil = f10 < 0.0f ? (int) Math.ceil(-Math.abs(hVarD.f97133c * f10)) : 0;
        if (f10 > 0.0f) {
            iCeil = (int) Math.floor(Math.abs(f10 * hVarD.f97131a));
        }
        this.mCamera.s0(iCeil);
        return 0;
    }

    @CalledByNative
    public int setExposurePoint(float f10, float f11) {
        if (this.mCamState.get() == 2 && this.mIsExposurePointSupported) {
            return focusAtPointImpl(f10, f11, false, true);
        }
        return -1;
    }

    @CalledByNative
    public int setFocusPoint(float f10, float f11) {
        if (this.mCamState.get() == 2 && this.mIsFocusPointSupported) {
            return focusAtPointImpl(f10, f11, true, true);
        }
        return -1;
    }

    @CalledByNative
    public void startCapture(CamParam camParam) {
        if (isMTKandAndroid12()) {
            camParam.useTexture = false;
        }
        if (this.mCamState.get() != 0) {
            return;
        }
        this.mCamState.set(1);
        this.mParam = camParam;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (androidx.core.content.d.a(applicationContext, "android.permission.CAMERA") != 0) {
            safeNativeOnCaptureError(o.f97668c0, "camera disabled");
            return;
        }
        this.mLogger.Log((byte) 8, "toSvr", "startCapture - input params " + formatParams());
        this.mCamInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        this.mCamInfoList = new Camera.CameraInfo[numberOfCameras];
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                this.mCamInfoList[i10] = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, this.mCamInfoList[i10]);
                Camera.CameraInfo cameraInfo = this.mCamInfoList[i10];
                if (cameraInfo.facing == this.mParam.pos) {
                    this.mCamInfo = cameraInfo;
                }
            } catch (Exception e10) {
                Log.d("VECAM", e10.toString());
            }
        }
        updateCameraCharacteristics();
        this.mFrameListener = new FrameListener();
        this.mEventObserver = new EventObserver();
        this.mFrameListener.startup();
        CamParam camParam2 = this.mParam;
        if (!camParam2.useTexture) {
            camParam2.camera2 = false;
        }
        this.mLogger.Log((byte) 8, "toSvr", "startCapture - actual params " + formatParams());
        int i11 = this.mParam.camera2 ? 2 : 1;
        Context context = this.mContext;
        CamParam camParam3 = this.mParam;
        TECameraSettings tECameraSettings = new TECameraSettings(context, i11, camParam3.width, camParam3.height);
        this.mVESettings = tECameraSettings;
        CamParam camParam4 = this.mParam;
        tECameraSettings.f97080d = camParam4.pos;
        tECameraSettings.f97116v = 30;
        tECameraSettings.f97097l0 = true;
        int i12 = camParam4.min_dynamic_fps;
        if (i12 <= 0) {
            i12 = 7;
        }
        int iMin = camParam4.enable_dynamic_fps ? Math.min(i12, camParam4.fps) : camParam4.fps;
        TECameraSettings tECameraSettings2 = this.mVESettings;
        tECameraSettings2.J = this.mParam.camid;
        tECameraSettings2.f97078c = new TEFrameRateRange(iMin, this.mParam.fps);
        this.mLogger.Log((byte) 8, "toSvr", "enable_dynamic_fps:" + this.mParam.enable_dynamic_fps + " fpsRange min:" + iMin + " max:" + this.mParam.fps);
        TECameraSettings tECameraSettings3 = this.mVESettings;
        tECameraSettings3.f97092j = false;
        if (this.mParam.faceAE) {
            tECameraSettings3.E.putInt("useCameraFaceDetect", 3);
        }
        TECameraSettings tECameraSettings4 = this.mVESettings;
        tECameraSettings4.f97100n = true;
        tECameraSettings4.Q = true;
        this.mCamera = new k(this.mEventObserver, null);
        k.j0((byte) 31, this.mLogger);
        this.mCamera.l0(new k.e() { // from class: com.ss.bytertc.media.VECameraWrapper.1
            @Override // com.ss.android.ttvecamera.k.e
            public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
                if (list.size() == 0) {
                    return null;
                }
                VECameraWrapper.this.mLogger.Log((byte) 8, "toSvr", "supportPreviewSizes:" + list.toString());
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < list.size(); i13++) {
                    TEFrameSizei tEFrameSizei = list.get(i13);
                    if (tEFrameSizei.f97206b >= VECameraWrapper.this.mParam.width) {
                        arrayList.add(tEFrameSizei);
                    }
                }
                if (arrayList.size() != 0) {
                    list = arrayList;
                }
                TEFrameSizei tEFrameSizei2 = list.get(0);
                int iAbs = Math.abs(VECameraWrapper.this.mParam.width - tEFrameSizei2.f97206b) + Math.abs(VECameraWrapper.this.mParam.height - tEFrameSizei2.f97207c);
                for (int i14 = 1; i14 < list.size(); i14++) {
                    TEFrameSizei tEFrameSizei3 = list.get(i14);
                    int iAbs2 = Math.abs(VECameraWrapper.this.mParam.width - tEFrameSizei3.f97206b) + Math.abs(VECameraWrapper.this.mParam.height - tEFrameSizei3.f97207c);
                    if (iAbs2 < iAbs) {
                        tEFrameSizei2 = tEFrameSizei3;
                        iAbs = iAbs2;
                    }
                }
                VECameraWrapper vECameraWrapper = VECameraWrapper.this;
                vECameraWrapper.safeNativeOnCaptureFormatSelected(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c, vECameraWrapper.mVESettings.f97078c.f97203b, VECameraWrapper.this.mVESettings.f97078c.f97204c, (VECameraWrapper.this.mParam.useTexture ? RXPixelFormat.kTextureOES : RXPixelFormat.kNv21).value());
                return tEFrameSizei2;
            }
        });
        this.mCamera.i(this.mVESettings);
        this.mLastDeviceOrientationTS = System.currentTimeMillis();
        this.mLastUIOrientation = updateUIOrientation();
        this.mLastDeviceOrientation = getDeviceOrientation();
    }

    @CalledByNative
    public void stopCapture() {
        SensorManager sensorManager;
        this.mLogger.Log((byte) 8, "toSvr", "stopCapture...");
        if (this.mUseGravitySensor && (sensorManager = (SensorManager) this.mContext.getSystemService(ak.f104420ac)) != null) {
            sensorManager.unregisterListener(this.mSensorListener);
        }
        k kVar = this.mCamera;
        if (kVar != null) {
            kVar.G0();
            this.mCamera.l();
            this.mVESettings = null;
            synchronized (this.mCameraLock) {
                this.mCamera = null;
            }
        }
        FrameListener frameListener = this.mFrameListener;
        if (frameListener != null) {
            frameListener.shutdown();
            this.mFrameListener = null;
        }
        this.mEventObserver = null;
        this.mCamState.set(0);
        this.mLogger.Log((byte) 8, "toSvr", "stopCapture done.");
        synchronized (this) {
            this.mNativeObj = 0L;
        }
    }

    public int updateUIOrientation() {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return UIDeviceOrientation.LandscapeRight.value();
        }
        if (rotation != 2) {
            return rotation != 3 ? UIDeviceOrientation.Portrait.value() : UIDeviceOrientation.LandscapeLeft.value();
        }
        return UIDeviceOrientation.PortraitUpsidedown.value();
    }
}
