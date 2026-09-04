package com.tencent.liteav.videoproducer.capture.b;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.h;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.w;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CameraControllerInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f100726c;
    private CameraEventCallback A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f100731g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CaptureRequest f100736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CaptureRequest.Builder f100737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Size f100738n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SurfaceTexture f100742r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CountDownLatch f100749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CountDownLatch f100750z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, CameraCharacteristics> f100725b = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f100727d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f100728e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f100730f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f100732h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<CameraDevice> f100733i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f100734j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference<CameraCaptureSession> f100735k = new AtomicReference<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f100739o = l.NORMAL;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l f100740p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f100741q = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f100743s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f100744t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f100745u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f100746v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private EnumC0967a f100747w = EnumC0967a.IDLE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f100748x = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f100729a = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private final CameraDevice.StateCallback D = new CameraDevice.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.1
        private static String a(CameraDevice cameraDevice) {
            if (cameraDevice == null) {
                return "null";
            }
            return "CameraDevice[id:" + cameraDevice.getId() + "]";
        }

        private void a(CameraDevice cameraDevice, int i10) {
            if (a.this.f100732h.get()) {
                a.b(a.this, i10);
            } else {
                a.this.a(false, cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            LiteavLog.i("Camera2Controller", "CameraDevice onClosed!" + a(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            LiteavLog.e("Camera2Controller", "CameraDevice onDisconnected!" + a(cameraDevice));
            a(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i10) {
            LiteavLog.e("Camera2Controller", "CameraDevice onError!" + a(cameraDevice) + ", error:" + i10);
            int i11 = 4;
            if (i10 == 3) {
                i11 = 2;
            } else if (i10 == 1) {
                i11 = 1;
            } else if (i10 == 5) {
                i11 = 3;
            } else if (i10 != 4) {
                i11 = 0;
            }
            a(cameraDevice, i11);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            LiteavLog.i("Camera2Controller", "CameraDevice onOpen!" + a(cameraDevice));
            a.this.a(true, cameraDevice);
        }
    };
    private final CameraCaptureSession.StateCallback E = new CameraCaptureSession.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.2
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.e("Camera2Controller", "CameraCaptureSession onConfigureFailed!");
            a.this.a(false, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.i("Camera2Controller", "CameraCaptureSession onConfigured!");
            a.this.a(true, cameraCaptureSession);
        }
    };
    private final CameraManager.AvailabilityCallback F = new CameraManager.AvailabilityCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.3
        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            LiteavLog.i("Camera2Controller", "onCameraAvailable: ".concat(String.valueOf(str)));
            if (!a.this.f() && a.b(a.this.f100743s).equals(str) && a.this.f100732h.get()) {
                LiteavLog.w("Camera2Controller", "Current camera is available, it could be interrupted by system app.");
                a aVar = a.this;
                aVar.a(false, (CameraDevice) aVar.f100733i.get());
                a.b(a.this, 1);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            LiteavLog.i("Camera2Controller", "onCameraUnavailable: ".concat(String.valueOf(str)));
        }
    };
    private final CameraCaptureSession.CaptureCallback G = new AnonymousClass4();

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.a$4, reason: invalid class name */
    public final class AnonymousClass4 extends CameraCaptureSession.CaptureCallback {
        AnonymousClass4() {
        }

        private void a(CaptureRequest captureRequest, boolean z10) {
            if (a.this.f()) {
                return;
            }
            a.e(a.this);
            try {
                a.this.f100737m.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                a.this.f100737m.set(CaptureRequest.CONTROL_AE_MODE, 1);
                a.this.f100737m.set(CaptureRequest.CONTROL_AF_MODE, 3);
                a.this.d();
                if (captureRequest.getTag() instanceof a) {
                    a.a((a) captureRequest.getTag(), z10);
                }
            } catch (Throwable th2) {
                LiteavLog.e("Camera2Controller", "mAfCaptureCallback exception:".concat(String.valueOf(th2)));
            }
        }

        static /* synthetic */ void a(AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
            if (a(captureRequest)) {
                anonymousClass4.a(captureRequest, false);
            } else {
                a.e(a.this);
            }
        }

        static /* synthetic */ void a(AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                a.e(a.this);
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                LiteavLog.e("Camera2Controller", "handleCaptureCompleted get afState fail");
                anonymousClass4.a(captureRequest, false);
            } else if (4 == num.intValue() || 5 == num.intValue()) {
                anonymousClass4.a(captureRequest, true);
            }
        }

        private static boolean a(CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof a) && !((a) captureRequest.getTag()).f100729a;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a.this.f100731g.a(c.a(this, totalCaptureResult, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            LiteavLog.e("Camera2Controller", "onCaptureFailed failure reason:" + captureFailure.getReason());
            a.this.f100731g.a(d.a(this, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.a$a, reason: collision with other inner class name */
    public enum EnumC0967a {
        IDLE,
        PREVIEWING
    }

    public a(w wVar) {
        this.f100731g = wVar;
    }

    private CameraCharacteristics a() {
        String strB = b(this.f100743s);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return f100725b.get(strB);
    }

    private void a(float f10) {
        if (this.f100737m != null && a() != null) {
            this.f100737m.set(CaptureRequest.SCALER_CROP_REGION, c(f10));
            return;
        }
        LiteavLog.e("Camera2Controller", "setZoom fail, scale:" + f10 + " mPreviewBuilder is null.");
    }

    static /* synthetic */ void a(a aVar, int i10) {
        if (aVar.f()) {
            LiteavLog.e("Camera2Controller", "onCameraError, but camera is invalid, do not send camera error.");
            return;
        }
        CameraEventCallback cameraEventCallback = aVar.A;
        if (cameraEventCallback != null) {
            cameraEventCallback.onCameraError(aVar, i10);
        }
    }

    static /* synthetic */ void a(a aVar, boolean z10) {
        LiteavLog.i("Camera2Controller", "onFocusCallback success:".concat(String.valueOf(z10)));
        aVar.f100729a = true;
        boolean z11 = aVar.f100744t;
        if (z11) {
            return;
        }
        aVar.c(z11);
        aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, CameraCaptureSession cameraCaptureSession) {
        CountDownLatch countDownLatch = this.f100750z;
        this.f100734j.set(z10);
        this.f100735k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, CameraDevice cameraDevice) {
        CountDownLatch countDownLatch = this.f100749y;
        this.f100732h.set(z10);
        this.f100733i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private boolean a(int i10, int i11) {
        String strB = b(this.f100743s);
        if (a() == null) {
            LiteavLog.e("Camera2Controller", "openCamera fail getCameraCharacteristics null");
            return false;
        }
        l lVarA = l.a(((Integer) a().get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f100739o = lVarA;
        l lVar = this.f100740p;
        if (lVar != null) {
            lVarA = lVar;
        }
        this.f100738n = com.tencent.liteav.videoproducer.capture.b.a(e(), lVarA, i10, i11);
        StringBuilder sb2 = new StringBuilder("openCamera ,id:");
        sb2.append(strB);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(this.f100743s ? "front camera" : "back camera");
        sb2.append(" mPreviewSize ");
        sb2.append(this.f100738n);
        sb2.append(" cameraRotation ");
        sb2.append(lVarA);
        sb2.append(" mIsCameraSupportAutoFocus ");
        sb2.append(this.f100745u);
        LiteavLog.i("Camera2Controller", sb2.toString());
        try {
            this.f100749y = new CountDownLatch(1);
            ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).openCamera(strB, this.D, this.f100730f);
            this.f100749y.await();
        } catch (Throwable th2) {
            LiteavLog.e("Camera2Controller", "openCamera exception:".concat(String.valueOf(th2)));
            a(false, (CameraDevice) null);
        }
        return this.f100732h.get();
    }

    private boolean a(SurfaceTexture surfaceTexture) {
        try {
            CameraDevice cameraDevice = this.f100733i.get();
            if (cameraDevice == null || surfaceTexture == null) {
                throw new IOException("startPreview cameraDevice null!");
            }
            b();
            SurfaceTexture surfaceTexture2 = this.f100742r;
            Size size = this.f100738n;
            surfaceTexture2.setDefaultBufferSize(size.width, size.height);
            Surface surface = new Surface(this.f100742r);
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
            this.f100737m = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            List<Surface> listSingletonList = Collections.singletonList(surface);
            this.f100750z = new CountDownLatch(1);
            cameraDevice.createCaptureSession(listSingletonList, this.E, this.f100730f);
            this.f100750z.await();
            return this.f100734j.get();
        } catch (Throwable th2) {
            LiteavLog.e("Camera2Controller", "startPreview exception", th2);
            a(false, (CameraCaptureSession) null);
        }
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(Range<Integer>[] rangeArr) {
        if (rangeArr == null || rangeArr.length <= 0) {
            return new com.tencent.liteav.videoproducer.a.a[0];
        }
        com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[rangeArr.length];
        for (int i10 = 0; i10 < rangeArr.length; i10++) {
            aVarArr[i10] = new com.tencent.liteav.videoproducer.a.a(((Integer) rangeArr[i10].getLower()).intValue(), ((Integer) rangeArr[i10].getUpper()).intValue());
        }
        return aVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(boolean z10) {
        if (z10) {
            return !TextUtils.isEmpty(f100728e) ? f100728e : f100727d;
        }
        return !TextUtils.isEmpty(f100727d) ? f100727d : f100728e;
    }

    private void b() {
        CameraCaptureSession andSet = this.f100735k.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th2) {
                LiteavLog.e("Camera2Controller", "closePreviewSession fail, Exception:".concat(String.valueOf(th2)));
            }
        }
    }

    private void b(float f10) {
        float f11;
        int i10;
        if (this.f100737m == null || a() == null) {
            LiteavLog.e("Camera2Controller", "setExposureCompensation fail, value:" + f10 + " mCameraStatus:" + this.f100747w);
            return;
        }
        Range range = (Range) a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int iIntValue = ((Integer) range.getLower()).intValue();
        int iIntValue2 = ((Integer) range.getUpper()).intValue();
        if (iIntValue == 0 && iIntValue2 == 0) {
            LiteavLog.i("Camera2Controller", "camera doesn't support exposure compensation");
            return;
        }
        float fA = h.a(f10, -1.0f);
        if (fA == 0.0f) {
            i10 = 0;
        } else {
            if (fA > 0.0f) {
                f11 = iIntValue2;
            } else {
                fA = Math.abs(fA);
                f11 = iIntValue;
            }
            i10 = (int) (fA * f11);
        }
        this.f100737m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(h.a(i10, iIntValue, iIntValue2)));
    }

    static /* synthetic */ void b(a aVar, int i10) {
        aVar.f100731g.a(b.a(aVar, i10));
    }

    private Rect c(float f10) {
        Rect rect = (Rect) a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        float fFloatValue = ((Float) a().get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        float f11 = fFloatValue - 1.0f;
        float fA = (h.a(f10, 0.0f) * f11) + 1.0f;
        int iWidth = (int) (rect.width() / fFloatValue);
        int iHeight = (int) (rect.height() / fFloatValue);
        int iWidth2 = rect.width() - iWidth;
        int iHeight2 = rect.height() - iHeight;
        float f12 = fA - 1.0f;
        int i10 = (int) (((iWidth2 * f12) / f11) / 2.0f);
        int i11 = (int) (((iHeight2 * f12) / f11) / 2.0f);
        Rect rect2 = new Rect(i10, i11, rect.width() - i10, rect.height() - i11);
        LiteavLog.i("Camera2Controller", "calculateZoomRect calculatedZoomLevel:" + fA + " rect:" + rect + " newRect2:" + rect2);
        return rect2;
    }

    private void c() {
        CameraDevice andSet = this.f100733i.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th2) {
                LiteavLog.e("Camera2Controller", "closeCamera fail, Exception:".concat(String.valueOf(th2)));
            }
        }
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).unregisterAvailabilityCallback(this.F);
    }

    private void c(boolean z10) {
        CaptureRequest.Builder builder = this.f100737m;
        if (builder == null) {
            return;
        }
        int i10 = z10 ? 1 : 3;
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i10));
        LiteavLog.i("Camera2Controller", "setFocusModeWithoutUpdatePreview to ".concat(String.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CaptureRequest.Builder builder;
        CameraCaptureSession cameraCaptureSession = this.f100735k.get();
        if (cameraCaptureSession == null || (builder = this.f100737m) == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, null);
        } catch (Throwable th2) {
            LiteavLog.e("Camera2Controller", "updatePreview exception:".concat(String.valueOf(th2)));
        }
    }

    private List<Size> e() {
        if (a() == null) {
            LiteavLog.e("Camera2Controller", "getPreviewSizes error, Characteristics is null");
            return null;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a().get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            LiteavLog.e("Camera2Controller", "getPreviewSizes map null");
            return null;
        }
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            LiteavLog.e("Camera2Controller", "getPreviewSizes choices is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : outputSizes) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    static /* synthetic */ boolean e(a aVar) {
        aVar.f100748x = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return a() == null || this.f100737m == null || this.f100747w != EnumC0967a.PREVIEWING;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraFpsCorrectionLogic(boolean z10) {
        this.f100741q = z10;
        LiteavLog.i("Camera2Controller", "set enable camera fps correction logic value is: ".concat(String.valueOf(z10)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z10) {
        this.f100744t = z10;
        if (this.f100748x) {
            return;
        }
        c(z10);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final l getCameraSystemRotation() {
        return this.f100739o;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f100739o.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        return 100;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f100738n;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        return a() != null && ((Integer) a().get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return a() != null && ((Integer) a().get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i10, int i11, boolean z10) {
        l lVar = this.f100740p;
        if (lVar == null) {
            lVar = this.f100739o;
        }
        Size sizeA = com.tencent.liteav.videoproducer.capture.b.a(e(), lVar, i10, i11);
        boolean z11 = (!z10 || Math.abs(sizeA.aspectRatio() - this.f100738n.aspectRatio()) <= 0.001d) ? sizeA.getArea() <= this.f100738n.getArea() : false;
        LiteavLog.i("Camera2Controller", "isCurrentPreviewSizeAspectRatioMatch:".concat(String.valueOf(z11)));
        return z11;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        return a() != null && ((Boolean) a().get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        return a() != null && ((Float) a().get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 0.0f;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i10) {
        this.f100740p = l.b(i10) ? l.a(i10) : null;
        LiteavLog.i("Camera2Controller", "camera rotation correction is " + this.f100740p);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(float f10) {
        this.B = f10;
        b(f10);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f10) {
        this.C = f10;
        a(f10);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i10, int i11) {
        double d10;
        double d11;
        if (this.f100744t && this.f100745u) {
            if (f() || this.f100748x) {
                LiteavLog.e("Camera2Controller", "autoFocus not preview, mCameraStatus:" + this.f100747w + " mIsAutoFocusing:" + this.f100748x);
                return;
            }
            CameraCaptureSession cameraCaptureSession = this.f100735k.get();
            if (cameraCaptureSession == null) {
                LiteavLog.e("Camera2Controller", "CameraCaptureSession get fail");
                return;
            }
            if (i10 >= 0) {
                Size size = this.f100738n;
                if (i10 < size.width && i11 >= 0 && i11 < size.height) {
                    LiteavLog.i("Camera2Controller", "Start auto focus at (%d, %d)", Integer.valueOf(i10), Integer.valueOf(i11));
                    double d12 = i10;
                    double d13 = i11;
                    Rect rect = (Rect) this.f100736l.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        LiteavLog.e("Camera2Controller", "getMeteringRect can't get crop region");
                        rect = (Rect) a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    }
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    Size size2 = this.f100738n;
                    int i12 = size2.height;
                    int i13 = i12 * iWidth;
                    int i14 = size2.width;
                    double d14 = 0.0d;
                    if (i13 > i14 * iHeight) {
                        d10 = (((double) iHeight) * 1.0d) / ((double) i12);
                        d11 = 0.0d;
                        d14 = (((double) iWidth) - (((double) i14) * d10)) / 2.0d;
                    } else {
                        d10 = (((double) iWidth) * 1.0d) / ((double) i14);
                        d11 = (((double) iHeight) - (((double) i12) * d10)) / 2.0d;
                    }
                    double d15 = (d12 * d10) + d14 + ((double) rect.left);
                    double d16 = (d13 * d10) + d11 + ((double) rect.top);
                    Rect rect2 = new Rect();
                    rect2.left = h.a((int) (d15 - (((double) rect.width()) * 0.05d)), 0, rect.width());
                    rect2.right = h.a((int) (d15 + (((double) rect.width()) * 0.05d)), 0, rect.width());
                    rect2.top = h.a((int) (d16 - (((double) rect.height()) * 0.05d)), 0, rect.height());
                    rect2.bottom = h.a((int) (d16 + (((double) rect.height()) * 0.05d)), 0, rect.height());
                    try {
                        this.f100737m.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                        this.f100737m.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                        this.f100737m.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f100737m.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f100737m.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                        this.f100748x = true;
                        this.f100729a = false;
                        this.f100737m.setTag(this);
                        cameraCaptureSession.setRepeatingRequest(this.f100737m.build(), this.G, this.f100730f);
                        return;
                    } catch (Throwable th2) {
                        LiteavLog.e("Camera2Controller", "startAutoFocusAtPosition exception:".concat(String.valueOf(th2)));
                        return;
                    }
                }
            }
            LiteavLog.w("Camera2Controller", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback) {
        boolean z10;
        this.A = cameraEventCallback;
        if (!f100726c) {
            try {
                CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null && num.intValue() == 0 && "1".equals(str)) {
                        f100725b.put(str, cameraCharacteristics);
                        f100728e = str;
                    } else if (num != null && num.intValue() == 1 && "0".equals(str)) {
                        f100725b.put(str, cameraCharacteristics);
                        f100727d = str;
                    }
                }
                LiteavLog.i("Camera2Controller", "initCamera2Ability front:" + f100728e + ", back:" + f100727d);
            } catch (Throwable th2) {
                f100728e = "1";
                LiteavLog.e("Camera2Controller", "initCamera2Ability exception!".concat(String.valueOf(th2)));
            }
            f100726c = true;
        }
        if (cameraCaptureParams == null || surfaceTexture == null) {
            LiteavLog.e("Camera2Controller", "captureParams or surfaceTexture is null");
            return false;
        }
        EnumC0967a enumC0967a = this.f100747w;
        EnumC0967a enumC0967a2 = EnumC0967a.IDLE;
        if (enumC0967a != enumC0967a2) {
            LiteavLog.e("Camera2Controller", "it's capturing, you should Stop first.");
            return false;
        }
        this.f100742r = surfaceTexture;
        this.f100743s = cameraCaptureParams.f100680a.booleanValue();
        if (a() == null) {
            z10 = false;
        } else {
            int[] iArr = (int[]) a().get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                StringBuilder sb2 = new StringBuilder("Current ");
                sb2.append(this.f100743s ? "front camera " : "back camera ");
                sb2.append(" is not support auto focus.");
                LiteavLog.w("Camera2Controller", sb2.toString());
                z10 = false;
            } else {
                z10 = true;
            }
        }
        this.f100745u = z10;
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).registerAvailabilityCallback(this.F, this.f100730f);
        if (!a(cameraCaptureParams.f100687c, cameraCaptureParams.f100688d)) {
            LiteavLog.e("Camera2Controller", "openCamera failed.");
            c();
            this.f100747w = enumC0967a2;
            return false;
        }
        if (!a(surfaceTexture)) {
            LiteavLog.e("Camera2Controller", "startPreview failed.");
            b();
            this.f100747w = enumC0967a2;
            return false;
        }
        this.f100737m.set(CaptureRequest.CONTROL_AE_MODE, 1);
        int i10 = cameraCaptureParams.f100686b;
        LiteavLog.i("Camera2Controller", "preferred fps: ".concat(String.valueOf(i10)));
        Range range = new Range(Integer.valueOf(i10), Integer.valueOf(i10));
        CameraCharacteristics cameraCharacteristicsA = a();
        if (cameraCharacteristicsA == null) {
            LiteavLog.e("Camera2Controller", "camera characteristics is null");
        } else {
            com.tencent.liteav.videoproducer.a.a aVarA = com.tencent.liteav.videoproducer.capture.b.a(a((Range<Integer>[]) cameraCharacteristicsA.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)), i10, this.f100741q);
            if (aVarA != null) {
                range = new Range(Integer.valueOf(aVarA.f100678a), Integer.valueOf(aVarA.f100679b));
            }
        }
        LiteavLog.i("Camera2Controller", "get best matched fps range result is ".concat(String.valueOf(range)));
        this.f100737m.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        c(this.f100744t);
        a(this.C);
        b(this.B);
        this.f100736l = this.f100737m.build();
        d();
        this.f100747w = EnumC0967a.PREVIEWING;
        LiteavLog.i("Camera2Controller", "startCaptureInternal ok.");
        return true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        CountDownLatch countDownLatch = this.f100749y;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f100749y = null;
        CountDownLatch countDownLatch2 = this.f100750z;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.f100750z = null;
        b();
        c();
        this.f100736l = null;
        this.f100729a = false;
        this.f100732h.set(false);
        this.f100742r = null;
        this.f100746v = -1;
        this.f100747w = EnumC0967a.IDLE;
        LiteavLog.i("Camera2Controller", "stopCapture success");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z10) {
        if (f()) {
            LiteavLog.e("Camera2Controller", "turnOnTorch error mCameraStatus:" + this.f100747w);
            return;
        }
        boolean z11 = true;
        if (z10 && this.f100746v != 2) {
            this.f100746v = 2;
        } else if (z10) {
            z11 = false;
        } else {
            this.f100746v = 0;
        }
        LiteavLog.i("Camera2Controller", "turnOnTorch:" + z10 + ", mode:" + this.f100746v + ", updateView:" + z11);
        if (z11) {
            this.f100737m.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.f100746v));
            d();
        }
    }
}
