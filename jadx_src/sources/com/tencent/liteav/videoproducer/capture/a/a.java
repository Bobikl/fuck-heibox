package com.tencent.liteav.videoproducer.capture.a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.h;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CameraControllerInterface implements Camera.ErrorCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Camera f100708b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceTexture f100712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Size f100713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f100714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f100715i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CameraEventCallback f100718l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f100720n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f100707a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f100709c = l.NORMAL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f100710d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f100711e = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f100716j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f100717k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f100719m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f100721o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f100722p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Camera.AutoFocusCallback f100723q = b.a();

    private int a(int i10) {
        Camera.Parameters parametersA = a();
        if (parametersA == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = parametersA.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.isEmpty()) {
            LiteavLog.e("CameraController", "supported preview frame rates is empty");
            return 1;
        }
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        Iterator<Integer> it = supportedPreviewFrameRates.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (Math.abs(i10 - iIntValue2) < Math.abs(i10 - iIntValue)) {
                iIntValue = iIntValue2;
            }
        }
        LiteavLog.i("CameraController", "best matched frame rate: %d", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    private static int a(Camera.Parameters parameters, float f10) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            LiteavLog.i("CameraController", "camera doesn't support exposure compensation");
            return minExposureCompensation;
        }
        com.tencent.liteav.base.a.a.a();
        return h.a((int) (h.a(f10, -1.0f) * maxExposureCompensation), minExposureCompensation, maxExposureCompensation);
    }

    private static int a(boolean z10, Camera.CameraInfo cameraInfo) {
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < Camera.getNumberOfCameras(); i12++) {
            Camera.getCameraInfo(i12, cameraInfo);
            LiteavLog.i("CameraController", "get camera info, index: " + i12 + ", facing: " + cameraInfo.facing);
            if (i10 == -1 && cameraInfo.facing == 1) {
                i10 = i12;
            } else if (i11 == -1 && cameraInfo.facing == 0) {
                i11 = i12;
            }
        }
        if (!z10 ? i11 != -1 : i10 == -1) {
            i10 = i11;
        }
        Camera.getCameraInfo(i10, cameraInfo);
        return i10;
    }

    private Rect a(float f10, float f11, float f12) {
        int i10 = (int) (f12 * 200.0f);
        Size size = this.f100713g;
        int i11 = (int) (((f10 / size.width) * 2000.0f) - 1000.0f);
        int i12 = (int) (((f11 / size.height) * 2000.0f) - 1000.0f);
        int i13 = i10 / 2;
        int iA = h.a(i11 - i13, -1000, 1000);
        int iA2 = h.a(iA + i10, -1000, 1000);
        int iA3 = h.a(i12 - i13, -1000, 1000);
        return new Rect(iA, iA3, iA2, h.a(i10 + iA3, -1000, 1000));
    }

    private Camera.Parameters a() {
        try {
            Camera camera = this.f100708b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "getCameraParameters failed.", th2);
            return null;
        }
    }

    private static Size a(Camera.Parameters parameters, l lVar, int i10, int i11) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new Size(size.width, size.height));
            }
        }
        return com.tencent.liteav.videoproducer.capture.b.a(arrayList, lVar, i10, i11);
    }

    private static void a(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        if (z10 && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            LiteavLog.i("CameraController", "set focus mode to auto");
        } else if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            LiteavLog.i("CameraController", "set focus mode to continuous-video");
        }
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(List<int[]> list) {
        if (list == null || list.size() <= 0) {
            return new com.tencent.liteav.videoproducer.a.a[0];
        }
        com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int[] iArr = list.get(i10);
            if (iArr != null && iArr.length >= 2) {
                aVarArr[i10] = new com.tencent.liteav.videoproducer.a.a(iArr[0], iArr[1]);
            }
        }
        return aVarArr;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraFpsCorrectionLogic(boolean z10) {
        this.f100711e = z10;
        LiteavLog.i("CameraController", "set enable camera fps correction logic value is:".concat(String.valueOf(z10)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z10) {
        Camera.Parameters parametersA;
        this.f100716j = z10;
        if (this.f100708b == null || (parametersA = a()) == null) {
            return;
        }
        try {
            a(parametersA, z10);
            this.f100708b.setParameters(parametersA);
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "enableTapToFocus failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final l getCameraSystemRotation() {
        return this.f100709c;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f100709c.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        int i10 = this.f100717k;
        if (i10 != 0) {
            return i10;
        }
        if (this.f100708b != null) {
            Camera.Parameters parametersA = a();
            if (parametersA == null) {
                return this.f100717k;
            }
            if (parametersA.getMaxZoom() > 0 && parametersA.isZoomSupported()) {
                this.f100717k = parametersA.getMaxZoom();
            }
        }
        return this.f100717k;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f100713g;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        Camera.Parameters parametersA;
        return (this.f100708b == null || (parametersA = a()) == null || parametersA.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return this.f100714h;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[PHI: r2
  0x0044: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v2 boolean), (r2v2 boolean) binds: [B:3:0x0004, B:12:0x0018, B:16:0x0029, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i10, int i11, boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f100708b != null) {
            Camera.Parameters parametersA = a();
            if (parametersA == null) {
                return true;
            }
            l lVar = this.f100710d;
            if (lVar == null) {
                lVar = this.f100709c;
            }
            Size sizeA = a(parametersA, lVar, i10, i11);
            if (sizeA != null) {
                int i12 = sizeA.width * sizeA.height;
                Size size = this.f100713g;
                z12 = i12 <= size.height * size.width;
                z11 = (!z10 || Math.abs(sizeA.aspectRatio() - this.f100713g.aspectRatio()) <= 0.001d) ? z12 : false;
            }
        }
        LiteavLog.i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(String.valueOf(z11)));
        return z11;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        Camera.Parameters parametersA;
        List<String> supportedFlashModes;
        return (this.f100708b == null || (parametersA = a()) == null || (supportedFlashModes = parametersA.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        Camera.Parameters parametersA;
        return this.f100708b != null && (parametersA = a()) != null && parametersA.getMaxZoom() > 0 && parametersA.isZoomSupported();
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i10, Camera camera) {
        LiteavLog.e("CameraController", "onError, error:".concat(String.valueOf(i10)));
        int i11 = 1;
        if (i10 == 1 || i10 == 2 || i10 == 100) {
            if (i10 != 2) {
                i11 = i10 == 100 ? 3 : 0;
            }
            CameraEventCallback cameraEventCallback = this.f100718l;
            if (cameraEventCallback != null) {
                cameraEventCallback.onCameraError(this, i11);
            }
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i10) {
        this.f100710d = l.b(i10) ? l.a(i10) : null;
        LiteavLog.i("CameraController", "camera rotation correction is " + this.f100710d);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(float f10) {
        this.f100720n = f10;
        this.f100719m = true;
        if (this.f100708b == null) {
            return;
        }
        this.f100719m = false;
        Camera.Parameters parametersA = a();
        if (parametersA == null) {
            return;
        }
        parametersA.setExposureCompensation(a(parametersA, f10));
        try {
            this.f100708b.setParameters(parametersA);
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "set exposure compensation failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f10) {
        this.f100722p = f10;
        this.f100721o = true;
        if (this.f100708b == null) {
            return;
        }
        this.f100721o = false;
        Camera.Parameters parametersA = a();
        if (parametersA == null) {
            return;
        }
        if (parametersA.getMaxZoom() <= 0 || !parametersA.isZoomSupported()) {
            LiteavLog.i("CameraController", "camera doesn't support zoom!");
            return;
        }
        int maxZoom = parametersA.getMaxZoom();
        try {
            parametersA.setZoom(h.a(Math.round(f10 * maxZoom), 0, maxZoom));
            this.f100708b.setParameters(parametersA);
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "set zoom failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i10, int i11) {
        if (!this.f100716j || this.f100708b == null) {
            return;
        }
        if (i10 >= 0) {
            Size size = this.f100713g;
            if (i10 < size.width && i11 >= 0 && i11 < size.height) {
                LiteavLog.i("CameraController", "Start auto focus at (%d, %d)", Integer.valueOf(i10), Integer.valueOf(i11));
                try {
                    this.f100708b.cancelAutoFocus();
                    Camera.Parameters parametersA = a();
                    if (parametersA == null) {
                        return;
                    }
                    if (this.f100714h) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(a(i10, i11, 2.0f), 1000));
                        parametersA.setFocusAreas(arrayList);
                    }
                    if (this.f100715i) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(a(i10, i11, 3.0f), 1000));
                        parametersA.setMeteringAreas(arrayList2);
                    }
                    try {
                        this.f100708b.setParameters(parametersA);
                        this.f100708b.autoFocus(this.f100723q);
                        return;
                    } catch (Throwable th2) {
                        LiteavLog.e("CameraController", "auto focus failed.", th2);
                        return;
                    }
                } catch (Throwable th3) {
                    LiteavLog.e("CameraController", "cancel auto focus failed.", th3);
                    return;
                }
            }
        }
        LiteavLog.w("CameraController", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0132 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:5:0x000b, B:7:0x0010, B:8:0x0017, B:11:0x0043, B:15:0x0071, B:19:0x007c, B:21:0x0087, B:23:0x0091, B:25:0x0097, B:26:0x00aa, B:28:0x00ae, B:29:0x00b9, B:31:0x00d6, B:37:0x011f, B:38:0x0128, B:40:0x0132, B:42:0x0149, B:41:0x0140, B:32:0x00e6, B:34:0x0108, B:36:0x0117, B:43:0x0161, B:44:0x0168), top: B:48:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0140 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:5:0x000b, B:7:0x0010, B:8:0x0017, B:11:0x0043, B:15:0x0071, B:19:0x007c, B:21:0x0087, B:23:0x0091, B:25:0x0097, B:26:0x00aa, B:28:0x00ae, B:29:0x00b9, B:31:0x00d6, B:37:0x011f, B:38:0x0128, B:40:0x0132, B:42:0x0149, B:41:0x0140, B:32:0x00e6, B:34:0x0108, B:36:0x0117, B:43:0x0161, B:44:0x0168), top: B:48:0x0007 }] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback) {
        this.f100718l = cameraEventCallback;
        try {
            if (cameraCaptureParams == null || surfaceTexture == null) {
                throw new IOException("captureParams or surfaceTexture is null");
            }
            if (this.f100708b != null) {
                LiteavLog.e("CameraController", "it's capturing, you should Stop first.");
                return false;
            }
            this.f100712f = surfaceTexture;
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int iA = a(cameraCaptureParams.f100680a.booleanValue(), cameraInfo);
            this.f100707a = cameraCaptureParams.f100680a.booleanValue();
            this.f100708b = Camera.open(iA);
            l lVarA = l.a(cameraInfo.orientation);
            this.f100709c = lVarA;
            l lVar = this.f100710d;
            if (lVar != null) {
                lVarA = lVar;
            }
            LiteavLog.i("CameraController", "open camera id: %d, isFrontCamera: %b, camera rotation: %s, camera info orientation: %d", Integer.valueOf(iA), cameraCaptureParams.f100680a, lVarA, Integer.valueOf(cameraInfo.orientation));
            Camera.Parameters parameters = this.f100708b.getParameters();
            this.f100714h = parameters.getMaxNumFocusAreas() > 0;
            this.f100715i = parameters.getMaxNumMeteringAreas() > 0;
            a(parameters, this.f100716j);
            if (this.f100721o) {
                this.f100721o = false;
                int maxZoom = parameters.getMaxZoom();
                this.f100717k = maxZoom;
                if (maxZoom > 0 && parameters.isZoomSupported()) {
                    parameters.setZoom(h.a(Math.round(this.f100722p * this.f100717k), 0, this.f100717k));
                }
            }
            if (this.f100719m) {
                this.f100719m = false;
                parameters.setExposureCompensation(a(parameters, this.f100720n));
            }
            Size sizeA = a(parameters, lVarA, cameraCaptureParams.f100687c, cameraCaptureParams.f100688d);
            this.f100713g = sizeA;
            parameters.setPreviewSize(sizeA.width, sizeA.height);
            if (!LiteavSystemInfo.getModel().equalsIgnoreCase("aiv8167sm3_bsp")) {
                int i10 = cameraCaptureParams.f100686b * 1000;
                LiteavLog.i("CameraController", "preferred fps: ".concat(String.valueOf(i10)));
                com.tencent.liteav.videoproducer.a.a aVarA = com.tencent.liteav.videoproducer.capture.b.a(a(parameters.getSupportedPreviewFpsRange()), i10, this.f100711e);
                if (aVarA != null) {
                    LiteavLog.i("CameraController", "choosed fps range: ".concat(String.valueOf(aVarA)));
                }
                if (aVarA != null) {
                    parameters.setPreviewFpsRange(aVarA.f100678a, aVarA.f100679b);
                }
                parameters.setWhiteBalance("auto");
                parameters.setSceneMode("auto");
                if (cameraInfo.facing == 1) {
                    this.f100708b.setDisplayOrientation((360 - this.f100709c.mValue) % 360);
                } else {
                    this.f100708b.setDisplayOrientation(this.f100709c.mValue);
                }
                this.f100708b.setParameters(parameters);
                this.f100708b.setErrorCallback(this);
                this.f100708b.setPreviewTexture(this.f100712f);
                this.f100708b.startPreview();
                return true;
            }
            LiteavLog.i("CameraController", "Model equals dingdang, setPreviewFrameRate: %d", Integer.valueOf(cameraCaptureParams.f100686b));
            parameters.setPreviewFrameRate(a(cameraCaptureParams.f100686b));
            parameters.setWhiteBalance("auto");
            parameters.setSceneMode("auto");
            if (cameraInfo.facing == 1) {
                this.f100708b.setDisplayOrientation((360 - this.f100709c.mValue) % 360);
            } else {
                this.f100708b.setDisplayOrientation(this.f100709c.mValue);
            }
            this.f100708b.setParameters(parameters);
            this.f100708b.setErrorCallback(this);
            this.f100708b.setPreviewTexture(this.f100712f);
            this.f100708b.startPreview();
            return true;
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "open camera1 fail, Exception:".concat(String.valueOf(th2)));
            return false;
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        LiteavLog.i("CameraController", "stopCapture");
        try {
            Camera camera = this.f100708b;
            if (camera != null) {
                camera.setErrorCallback(null);
                this.f100708b.stopPreview();
                this.f100708b.release();
                this.f100708b = null;
            }
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "closeCamera fail, Exception:".concat(String.valueOf(th2)));
        }
        this.f100712f = null;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z10) {
        List<String> supportedFlashModes;
        if (this.f100708b == null) {
            return;
        }
        String str = z10 ? "torch" : s0.f130317e;
        Camera.Parameters parametersA = a();
        if (parametersA == null || (supportedFlashModes = parametersA.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        try {
            parametersA.setFlashMode(str);
            this.f100708b.setParameters(parametersA);
        } catch (Throwable th2) {
            LiteavLog.e("CameraController", "enable torch failed.", th2);
        }
    }
}
