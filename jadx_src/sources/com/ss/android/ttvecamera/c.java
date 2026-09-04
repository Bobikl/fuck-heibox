package com.ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.annotation.w0;
import com.bytedance.bpea.basics.Cert;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.s0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: TECamera1.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f97328a0 = "TECamera1";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f97329b0 = 200;
    SurfaceHolder K;
    Camera L;
    private Camera.Parameters M;
    private com.ss.android.ttvecamera.focusmanager.d N;
    private String O;
    private int P;
    private List<TEFrameSizei> Q;
    private List<TEFrameSizei> R;
    private List<TEFrameSizei> S;
    private List<Integer> T;
    private float U;
    private int V;
    private AtomicBoolean W;
    private long X;
    private int Y;
    private boolean Z;

    /* JADX INFO: compiled from: TECamera1.java */
    public class a implements Camera.ErrorCallback {
        a() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i10, Camera camera) {
            String str;
            int i11;
            n.b(n.f97651o, i10);
            if (i10 == 100) {
                i11 = -407;
                str = "Camera server died!";
            } else if (i10 == 2) {
                str = "Camera disconnected: " + i10;
                i11 = o.f97670d0;
            } else {
                if (i10 != 1) {
                    q.u(c.f97328a0, "Ignore camera error here: " + i10);
                    return;
                }
                str = "Camera unknown error: " + i10;
                i11 = o.f97672e0;
            }
            q.e(c.f97328a0, str);
            c cVar = c.this;
            cVar.f(cVar.f97573v);
            c.this.D0();
            c cVar2 = c.this;
            j.a aVar = cVar2.f97555d;
            if (aVar != null) {
                aVar.b(1, i11, str, cVar2.L);
            }
        }
    }

    /* JADX INFO: compiled from: TECamera1.java */
    public class b implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.r f97331a;

        b(TECameraSettings.r rVar) {
            this.f97331a = rVar;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.f97331a != null) {
                int pictureFormat = c.this.M.getPictureFormat();
                Camera.Size pictureSize = c.this.M.getPictureSize();
                int i10 = pictureSize.width;
                int i11 = pictureSize.height;
                q.k(c.f97328a0, "take picture format: " + pictureFormat + ", w: " + i10 + ", h: " + i11);
                this.f97331a.b(new TECameraFrame(bArr, pictureFormat == 17 ? TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21 : TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG, i10, i11, c.this.f97561j == 1 ? 270 : 90), c.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TECamera1.java */
    public class C0925c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f97333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.r f97334b;

        C0925c(long j10, TECameraSettings.r rVar) {
            this.f97333a = j10;
            this.f97334b = rVar;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            q.k(c.f97328a0, "capture data arrive consume: " + (System.currentTimeMillis() - this.f97333a));
            Camera camera2 = c.this.L;
            if (camera2 != null) {
                camera2.stopPreview();
            }
            if (this.f97334b != null) {
                int pictureFormat = c.this.M.getPictureFormat();
                Camera.Size pictureSize = c.this.M.getPictureSize();
                int i10 = pictureSize.width;
                int i11 = pictureSize.height;
                q.k(c.f97328a0, "take picture format: " + pictureFormat + ", w: " + i10 + ", h: " + i11);
                this.f97334b.b(new TECameraFrame(bArr, pictureFormat == 17 ? TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21 : TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG, i10, i11, c.this.f97561j == 1 ? 270 : 90), c.this);
            }
        }
    }

    /* JADX INFO: compiled from: TECamera1.java */
    public class d implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TEFocusSettings f97336a;

        d(TEFocusSettings tEFocusSettings) {
            this.f97336a = tEFocusSettings;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            String str;
            if (z10) {
                str = "Camera Focus Succeed!";
                this.f97336a.g().a(this.f97336a.h(), c.this.f97553b.f97080d, "Camera Focus Succeed!");
            } else {
                str = "Camera Focus Failed!";
                this.f97336a.g().a(-1, c.this.f97553b.f97080d, "Camera Focus Failed!");
            }
            q.k(c.f97328a0, str);
            if (this.f97336a.n() && z10) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-video");
                camera.setParameters(parameters);
                c cVar = c.this;
                cVar.L0(cVar.Y);
            } catch (Exception e10) {
                String str2 = "Error: focusAtPoint failed: " + e10.toString();
                q.e(c.f97328a0, str2);
                c cVar2 = c.this;
                cVar2.f97555d.c(1, o.f97674f0, str2, cVar2.L);
            }
        }
    }

    /* JADX INFO: compiled from: TECamera1.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f97338b;

        e(int i10) {
            this.f97338b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.G0(this.f97338b);
        }
    }

    /* JADX INFO: compiled from: TECamera1.java */
    public class f implements Camera.OnZoomChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.w f97340a;

        f(TECameraSettings.w wVar) {
            this.f97340a = wVar;
        }

        @Override // android.hardware.Camera.OnZoomChangeListener
        public void onZoomChange(int i10, boolean z10, Camera camera) {
            TECameraSettings.w wVar = this.f97340a;
            if (wVar != null) {
                wVar.onChange(1, i10, z10);
            }
        }
    }

    private c(Context context, j.a aVar, Handler handler, j.e eVar) {
        super(context, aVar, handler, eVar);
        this.O = "";
        this.P = 0;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = null;
        this.U = 100.0f;
        this.V = 0;
        this.W = new AtomicBoolean(false);
        this.X = 0L;
        this.Y = 0;
        this.Z = false;
        this.f97553b = new TECameraSettings(context, 1);
        this.N = new com.ss.android.ttvecamera.focusmanager.d(1);
        this.f97573v = null;
    }

    private void P0() {
        if (this.f97553b.Z) {
            try {
                this.M.setRecordingHint(false);
                this.L.setParameters(this.M);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void Q0() {
        if (this.f97553b.Z) {
            try {
                this.M.setRecordingHint(true);
                this.L.setParameters(this.M);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static List<TEFrameRateRange> R0(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<TEFrameSizei> S0(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    public static c T0(Context context, j.a aVar, Handler handler, j.e eVar) {
        return new c(context, aVar, handler, eVar);
    }

    private int U0(int i10) {
        int size = this.T.size() - 1;
        int i11 = 0;
        while (size - i11 > 1) {
            int i12 = (i11 + size) / 2;
            if (i10 > this.T.get(i12).intValue()) {
                i11 = i12;
            } else {
                size = i12;
            }
        }
        return Math.abs(i10 - this.T.get(i11).intValue()) > Math.abs(i10 - this.T.get(size).intValue()) ? size : i11;
    }

    private List<TEFrameRateRange> V0() {
        Camera.Parameters parameters = this.M;
        if (parameters == null) {
            return null;
        }
        return R0(parameters.getSupportedPreviewFpsRange());
    }

    private List<TEFrameSizei> W0() {
        Camera.Parameters parameters = this.M;
        if (parameters == null || parameters.getSupportedVideoSizes() == null) {
            this.S.clear();
            return this.S;
        }
        List<TEFrameSizei> listS0 = S0(this.M.getSupportedVideoSizes());
        this.S = listS0;
        return listS0;
    }

    private int X0() {
        int[] iArrY;
        TEFrameSizei tEFrameSizeiA;
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "initCamera: Camera is not opened!");
            this.f97555d.c(1, -401, "initCamera: Camera is not opened!", this.L);
            return -401;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.M = parameters;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (this.f97568q != null) {
            int size = supportedPreviewFpsRange.size();
            ArrayList arrayList = new ArrayList(size);
            boolean z10 = true;
            int i10 = 0;
            while (i10 < size) {
                int[] iArr = supportedPreviewFpsRange.get(i10);
                int i11 = iArr[0];
                boolean z11 = i11 >= 1000;
                int[] iArr2 = new int[2];
                if (i11 >= 1000) {
                    i11 /= 1000;
                }
                iArr2[0] = i11;
                int i12 = iArr[1];
                if (i12 >= 1000) {
                    i12 /= 1000;
                }
                iArr2[1] = i12;
                arrayList.add(iArr2);
                i10++;
                z10 = z11;
            }
            iArrY = this.f97568q.a(arrayList);
            if (z10 && iArrY != null) {
                iArrY[0] = iArrY[0] * 1000;
                iArrY[1] = iArrY[1] * 1000;
            }
        } else {
            iArrY = null;
        }
        if (iArrY == null) {
            int iA = TEFrameRateRange.a(supportedPreviewFpsRange);
            TECameraSettings tECameraSettings = this.f97553b;
            iArrY = p.y(tECameraSettings.O, tECameraSettings.f97080d, tECameraSettings.f97078c.f(iA), supportedPreviewFpsRange);
            if (iArrY == null && supportedPreviewFpsRange.size() > 0) {
                iArrY = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
            }
        }
        if (iArrY == null) {
            throw new IllegalStateException("fps config failed");
        }
        q.k(f97328a0, "Selected FPS Range: " + iArrY[0] + Constants.ACCEPT_TIME_SEPARATOR_SP + iArrY[1]);
        this.f97555d.e(121, 0, new TEFrameRateRange(iArrY[0], iArrY[1]).toString(), null);
        j.f fVar = this.f97567p;
        if (fVar != null) {
            TEFrameSizei previewSize = fVar.getPreviewSize(P());
            if (previewSize != null) {
                this.f97553b.f97106q = previewSize;
            } else {
                this.f97553b.f97106q = p.b(P(), this.f97553b.f97106q);
            }
        } else {
            this.f97553b.f97106q = p.b(P(), this.f97553b.f97106q);
        }
        q.k(f97328a0, "Preview Size:" + this.f97553b.f97106q);
        List<Integer> supportedPictureFormats = this.M.getSupportedPictureFormats();
        int i13 = (this.f97553b.f97107q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) ? 17 : 256;
        this.M.setPictureFormat(i13);
        if (i13 == 256) {
            this.M.setJpegQuality(100);
        }
        TECameraSettings tECameraSettings2 = this.f97553b;
        if (tECameraSettings2.f97124z) {
            List<TEFrameSizei> listS0 = S0(this.M.getSupportedPictureSizes());
            TEFrameSizei tEFrameSizeiC = this.f97553b.c();
            TECameraSettings tECameraSettings3 = this.f97553b;
            tECameraSettings2.f97108r = p.u(listS0, tEFrameSizeiC, tECameraSettings3.f97114u, tECameraSettings3.f97122y);
        } else {
            if (this.f97566o != null) {
                List<TEFrameSizei> listS1 = S0(this.M.getSupportedPictureSizes());
                ArrayList arrayList2 = new ArrayList();
                if (i13 == 17 && listS1 != null) {
                    for (TEFrameSizei tEFrameSizei : listS1) {
                        if (tEFrameSizei.f97206b % 16 == 0 && tEFrameSizei.f97207c % 16 == 0) {
                            arrayList2.add(tEFrameSizei);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        q.e(f97328a0, "final pic sizes is empty...");
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(listS1);
                }
                tEFrameSizeiA = this.f97566o.a(arrayList2, S0(this.M.getSupportedPreviewSizes()));
            } else {
                tEFrameSizeiA = null;
            }
            if (tEFrameSizeiA != null) {
                this.f97553b.f97108r = tEFrameSizeiA;
            } else {
                TECameraSettings tECameraSettings4 = this.f97553b;
                List<TEFrameSizei> listO = O();
                TECameraSettings tECameraSettings5 = this.f97553b;
                tECameraSettings4.f97108r = p.v(listO, tECameraSettings5.f97106q, tECameraSettings5.f97108r);
            }
        }
        TEFrameSizei tEFrameSizei2 = this.f97553b.f97108r;
        if (tEFrameSizei2 != null) {
            this.M.setPictureSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
            q.k(f97328a0, "Picture Size:" + this.f97553b.f97108r);
        } else {
            q.e(f97328a0, "No closest supported picture size");
        }
        Camera.Parameters parameters2 = this.M;
        TEFrameSizei tEFrameSizei3 = this.f97553b.f97106q;
        parameters2.setPreviewSize(tEFrameSizei3.f97206b, tEFrameSizei3.f97207c);
        Bundle bundle = this.f97553b.E;
        if (bundle == null || !bundle.getBoolean(TECameraSettings.q.f97169f) || iArrY[0] <= iArrY[1]) {
            this.M.setPreviewFpsRange(iArrY[0], iArrY[1]);
            if (this.f97553b.P) {
                q.b(f97328a0, "use setRecordingHint");
                this.M.setRecordingHint(true);
            }
        }
        this.M.setWhiteBalance("auto");
        this.M.setSceneMode("auto");
        this.M.setPreviewFormat(this.f97553b.f97086g);
        this.M.setExposureCompensation(this.V);
        if (this.f97553b.U) {
            if (this.M.isVideoStabilizationSupported()) {
                this.M.setVideoStabilization(true);
                n.b(n.f97640d, 1L);
                this.f97555d.e(113, 1, "", this.L);
            } else {
                n.b(n.f97640d, 0L);
            }
        }
        com.ss.android.ttvecamera.focusmanager.d dVar = this.N;
        TECameraSettings tECameraSettings6 = this.f97553b;
        String strG = dVar.g(tECameraSettings6.f97080d, this.M, tECameraSettings6.E.getBoolean("enableFrontFacingVideoContinueFocus"));
        this.O = strG;
        if (strG != "") {
            this.M.setFocusMode(strG);
        } else {
            q.u(f97328a0, "No Supported Focus Mode for Facing" + this.f97553b.f97080d);
        }
        this.f97553b.K.f97131a = this.M.getMaxExposureCompensation();
        this.f97553b.K.f97133c = this.M.getMinExposureCompensation();
        this.f97553b.K.f97134d = this.M.getExposureCompensationStep();
        this.f97553b.K.f97132b = this.M.getExposureCompensation();
        if (this.f97553b.f97090i) {
            String str = this.M.get("zsl-values");
            if (s0.f130317e.equals(this.M.get(com.ss.android.ttvecamera.framework.b.f97501b)) && str != null && str.contains("on")) {
                this.M.set(com.ss.android.ttvecamera.framework.b.f97501b, "on");
            }
            boolean zEquals = "on".equals(this.M.get(com.ss.android.ttvecamera.framework.b.f97501b));
            this.f97552a = zEquals;
            if (!zEquals && this.f97553b.f97090i && TextUtils.isEmpty(str) && com.ss.android.ttvecamera.d.a() && com.ss.android.ttvecamera.d.b()) {
                String str2 = this.M.get("zsd-mode-values");
                if (s0.f130317e.equals(this.M.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                    this.M.set("zsd-mode", "on");
                }
                this.f97552a = "on".equals(this.M.get("zsd-mode"));
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.f97552a ? "Enable" : "Disable";
        q.k(f97328a0, String.format("%s zsl", objArr));
        this.T = null;
        if (this.M.isZoomSupported()) {
            this.T = this.M.getZoomRatios();
            this.f97564m = this.M.getMaxZoom();
            Collections.sort(this.T);
            this.U = 100.0f;
        } else {
            q.e(f97328a0, "camera don't support zoom");
        }
        if (this.f97553b.E.containsKey("enableShutterSound")) {
            try {
                this.L.enableShutterSound(this.f97553b.E.getBoolean("enableShutterSound"));
            } catch (Exception e10) {
                q.e(f97328a0, "unsupport enableShutterSound, " + e10.getMessage());
            }
        }
        this.L.setParameters(this.M);
        try {
            this.L.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        this.Z = false;
        return 0;
    }

    private int Y0(Cert cert) {
        Exception e10;
        int iX0;
        s.a("TECamera1-innerOpen");
        this.V = 0;
        this.f97573v = cert;
        int i10 = -401;
        try {
            TECameraSettings tECameraSettings = this.f97553b;
            if (!tECameraSettings.f97097l0 || TextUtils.isEmpty(tECameraSettings.J)) {
                int numberOfCameras = Camera.getNumberOfCameras();
                this.P = numberOfCameras;
                n.b(n.f97637a, numberOfCameras);
                q.k(f97328a0, "innerOpen mNumberOfCameras: " + this.P + ", current mDefaultCameraID:" + this.f97553b.f97084f);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i11 = 0; i11 < this.P; i11++) {
                    Camera.getCameraInfo(i11, cameraInfo);
                    q.k(f97328a0, "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f97553b.f97080d);
                    int i12 = cameraInfo.facing;
                    TECameraSettings tECameraSettings2 = this.f97553b;
                    if (i12 == tECameraSettings2.f97080d) {
                        tECameraSettings2.f97084f = i11;
                        break;
                    }
                }
            } else {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i13 = Integer.parseInt(this.f97553b.J);
                Camera.getCameraInfo(i13, cameraInfo2);
                TECameraSettings tECameraSettings3 = this.f97553b;
                tECameraSettings3.f97084f = i13;
                this.f97561j = tECameraSettings3.f97080d;
            }
            TECameraSettings tECameraSettings4 = this.f97553b;
            int i14 = tECameraSettings4.f97084f;
            if (i14 == -1 && this.P > 0 && tECameraSettings4.f97093j0) {
                q.u(f97328a0, "innerOpen: camera info check error");
                throw new RuntimeException("CameraIDError");
            }
            if (i14 == -1 && this.P > 0 && tECameraSettings4.f97091i0) {
                q.u(f97328a0, "innerOpen: camera info check, set CameraID to 0");
                this.f97553b.f97084f = 0;
            }
            q.k(f97328a0, "innerOpen: " + this.f97553b.f97084f);
            this.f97555d.e(106, 0, "will start camera1", null);
            s.a("TECamera1-innerOpen-openCamera");
            int i15 = this.f97553b.f97084f;
            if (i15 >= 0) {
                this.L = com.ss.android.ttvecamera.e.c(cert, i15);
            } else {
                this.L = com.ss.android.ttvecamera.e.c(cert, i15);
                this.f97553b.f97080d = 0;
                this.f97561j = 0;
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                for (int i16 = 0; i16 < this.P; i16++) {
                    Camera.getCameraInfo(i16, cameraInfo3);
                    if (cameraInfo3.facing == this.f97561j) {
                        this.f97553b.f97084f = i16;
                        break;
                    }
                }
            }
            s.b();
            q.k(f97328a0, "innerOpen mNewFacing: " + this.f97561j);
            q.k(f97328a0, "innerOpen mCameraSettings.mDefaultCameraID: " + this.f97553b.f97084f);
            this.f97555d.e(107, 0, "did start camera1", null);
            if (this.L == null) {
                q.e(f97328a0, "Open Camera Failed with ID:" + this.f97553b.f97084f);
                i10 = this.f97553b.f97084f == -1 ? -405 : -401;
                this.f97555d.f(1, i10, null, this.L);
                return i10;
            }
            try {
                s.a("TECamera1-initCamera");
                iX0 = X0();
                try {
                    s.b();
                    s.a("TECamera1-fillFeatures");
                    l();
                    s.b();
                    this.f97555d.e(1, 0, "TECamera1 features is ready", this.L);
                } catch (Exception e11) {
                    e10 = e11;
                    q.e(f97328a0, "Open init Camera Failed!: " + Log.getStackTraceString(e10));
                    m.a(e10);
                }
            } catch (Exception e12) {
                e10 = e12;
                iX0 = 0;
            }
            this.f97555d.f(1, iX0, this, this.L);
            s.b();
            return iX0;
        } catch (RuntimeException e13) {
            q.e(f97328a0, "Open Camera Failed!: " + Log.getStackTraceString(e13));
            if (e13.getMessage() != null) {
                if (e13.getMessage().equals("Fail to connect to camera service")) {
                    i10 = o.f97672e0;
                } else if (e13.getMessage().equals("Camera initialization failed")) {
                    i10 = -407;
                }
            }
            m.a(e13);
            this.f97555d.f(1, i10, null, this.L);
            this.L = null;
            return i10;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void A0() {
        Camera camera;
        if (!this.f97554c || (camera = this.L) == null) {
            return;
        }
        try {
            camera.stopFaceDetection();
        } catch (Exception unused) {
            q.e(f97328a0, "camera stop face detect failed");
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void B0() {
        q.b(f97328a0, "Camera stopPreview...");
        if (!this.f97554c || this.L == null) {
            return;
        }
        this.f97554c = false;
        this.W.set(false);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.L.stopPreview();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            n.b(n.f97659w, jCurrentTimeMillis2);
            q.l(n.f97659w, Long.valueOf(jCurrentTimeMillis2));
        } catch (Exception e10) {
            q.e(f97328a0, "camera stopcapture failed: " + e10.getMessage());
        }
        this.X = 0L;
        q.k(f97328a0, "Camera preview stopped!");
        this.f97555d.d(1, 4, 0, "TECamera1 preview stoped", this.L);
    }

    @Override // com.ss.android.ttvecamera.j
    public int C() {
        Camera camera = this.L;
        if (camera != null) {
            String flashMode = null;
            try {
                flashMode = camera.getParameters().getFlashMode();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if ("on".equals(flashMode)) {
                return 1;
            }
            if ("auto".equals(flashMode)) {
                return 3;
            }
            if (s0.f130317e.equals(flashMode)) {
                return 0;
            }
            if ("torch".equals(flashMode)) {
                return 2;
            }
            if ("red-eye".equals(flashMode)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ttvecamera.j
    public int D() {
        int iW = this.f97563l;
        if (iW < 0) {
            iW = p.w(this.f97558g);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f97560i = this.f97561j;
        try {
            Camera.getCameraInfo(this.f97553b.f97084f, cameraInfo);
            if (this.f97560i == 1) {
                int i10 = (cameraInfo.orientation + iW) % 360;
                this.f97562k = i10;
                this.f97562k = ((360 - i10) + 180) % 360;
            } else {
                this.f97562k = ((cameraInfo.orientation - iW) + 360) % 360;
            }
            return this.f97562k;
        } catch (Exception e10) {
            this.f97555d.c(1, -405, "getFrameOrientation :" + e10.getMessage(), this.L);
            return 0;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void E0(TECameraSettings.w wVar) {
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            q.e(f97328a0, "stopZoom : Camera is null!");
            this.f97555d.c(1, o.H0, "stopZoom : Camera is null!", this.L);
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && wVar != null && wVar.enableSmooth()) {
                this.L.stopSmoothZoom();
            }
        } catch (Exception e10) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: " + e10);
            String str = "Stop zoom failed : " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97692o0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void F0(int i10) {
        q.u(f97328a0, "Does not support switch mode for camera1");
        this.f97555d.e(-200, -200, "Does not support switch mode for camera1", this.L);
    }

    @Override // com.ss.android.ttvecamera.j
    public void G0(@TECameraSettings.l int i10) {
        String str;
        String str2;
        Handler handler;
        if (this.L == null) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            q.e(f97328a0, "switchFlashMode failed: Camera is not ready!");
            this.f97555d.c(1, o.H0, "switchFlashMode failed: Camera is not ready!", this.L);
            this.f97555d.g(1, o.H0, i10 == 0 ? 0 : 1, "switchFlashMode failed: Camera is not ready!", this.L);
            return;
        }
        if (this.X != 0 && System.currentTimeMillis() - this.X < 200 && (handler = this.f97557f) != null) {
            handler.postDelayed(new e(i10), 200L);
            return;
        }
        this.Z = false;
        try {
            Camera.Parameters parameters = this.L.getParameters();
            this.M = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i10 == 0) {
                    str2 = s0.f130317e;
                } else if (i10 == 1) {
                    str2 = "on";
                    this.Z = true;
                } else if (i10 == 2) {
                    str2 = "torch";
                } else if (i10 != 3) {
                    str2 = i10 != 4 ? null : "red-eye";
                } else {
                    str2 = "auto";
                }
                if (str2 != null && supportedFlashModes.contains(str2)) {
                    this.f97555d.e(104, 0, "camera1 will change flash mode " + str2, null);
                    this.M.setFlashMode(str2);
                    this.L.setParameters(this.M);
                    if (s0.f130317e.equalsIgnoreCase(str2) && this.f97553b.E.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                    this.f97555d.e(105, 0, "camera1 did change flash mode " + str2, null);
                    this.f97555d.h(1, 0, i10 == 0 ? 0 : 1, "torch success", this.L);
                    return;
                }
            }
            if (supportedFlashModes != null) {
                str = "Camera does not support flash mode: " + i10 + "support list: " + supportedFlashModes.toString();
            } else {
                str = "Camera does not support flash mode: " + i10;
            }
            String str3 = str;
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode " + i10);
            q.e(f97328a0, str3);
            this.f97555d.c(1, o.f97690n0, str3, this.L);
            this.f97555d.g(1, o.f97690n0, i10 == 0 ? 0 : 1, str3, this.L);
        } catch (Exception e11) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: " + e11);
            String str4 = "Switch flash mode failed: " + e11.toString();
            q.e(f97328a0, str4);
            this.f97555d.c(1, o.f97688m0, str4, this.L);
            this.f97555d.g(1, o.f97688m0, i10 == 0 ? 0 : 1, str4, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void H0(int i10, int i11, TECameraSettings.r rVar) {
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "takePicture : camera is null");
            this.f97555d.c(1, o.H0, "takePicture : camera is null", this.L);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.M = parameters;
            if (parameters.getPictureSize().width != i10 || this.M.getPictureSize().height != i11) {
                TEFrameSizei tEFrameSizeiV = p.v(S0(this.M.getSupportedPictureSizes()), this.f97553b.c(), new TEFrameSizei(i10, i11));
                this.M.setPictureSize(tEFrameSizeiV.f97206b, tEFrameSizeiV.f97207c);
                List<Integer> supportedPictureFormats = this.M.getSupportedPictureFormats();
                if (this.f97553b.f97107q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.M.setPictureFormat(17);
                } else {
                    this.M.setPictureFormat(256);
                    this.M.setJpegQuality(100);
                }
                this.L.setParameters(this.M);
            }
            this.f97554c = false;
            this.L.takePicture(null, null, new b(rVar));
        } catch (Exception e10) {
            m.a(e10);
            if (rVar != null) {
                rVar.a(h(e10, -1000));
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void I0(TECameraSettings.r rVar) {
        if (this.L == null) {
            q.e(f97328a0, "takePicture: camera is null.");
            this.f97555d.c(1, o.H0, "takePicture: camera is null.", this.L);
            return;
        }
        try {
            this.f97554c = false;
            q.k(f97328a0, "takePicture size: " + this.f97553b.f97108r.toString());
            this.L.takePicture(null, null, new C0925c(System.currentTimeMillis(), rVar));
        } catch (Exception e10) {
            m.a(e10);
            if (rVar != null) {
                rVar.a(h(e10, -1000));
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] J() {
        Camera.Size pictureSize;
        Camera camera = this.L;
        if (camera != null) {
            try {
                pictureSize = camera.getParameters().getPictureSize();
            } catch (Exception e10) {
                e10.printStackTrace();
                pictureSize = null;
            }
        } else {
            pictureSize = null;
        }
        if (pictureSize == null) {
            return null;
        }
        return new int[]{pictureSize.width, pictureSize.height};
    }

    @Override // com.ss.android.ttvecamera.j
    public void J0(boolean z10) {
        this.Z = false;
        if (this.L == null) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            q.e(f97328a0, "toggleTorch : Camera is not ready!");
            this.f97555d.c(1, o.H0, "toggleTorch : Camera is not ready!", this.L);
            this.f97555d.g(1, o.H0, z10 ? 1 : 0, "toggleTorch : Camera is not ready!", this.L);
            return;
        }
        if (this.f97553b.f97080d == 1) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            q.u(f97328a0, "Front camera does not support torch!");
            this.f97555d.e(o.f97684k0, o.f97684k0, "Front camera does not support torch!", this.L);
            this.f97555d.g(1, o.f97684k0, z10 ? 1 : 0, "Front camera does not support torch!", this.L);
            return;
        }
        try {
            this.f97555d.e(104, 0, "camera1 will change flash mode " + z10, null);
            Camera.Parameters parameters = this.L.getParameters();
            this.M = parameters;
            parameters.setFlashMode(z10 ? "torch" : s0.f130317e);
            this.L.setParameters(this.M);
            this.f97555d.e(105, 0, "camera1 did change flash mode " + z10, null);
            this.f97555d.h(1, 0, z10 ? 1 : 0, "toggleTorch " + z10, this.L);
        } catch (Exception e10) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: " + e10);
            String str = "Toggle torch failed: " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97686l0, str, this.L);
            this.f97555d.g(1, o.f97686l0, z10 ? 1 : 0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] K() {
        Camera camera = this.L;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void L0(int i10) {
        q.b(f97328a0, "Camera start face detect");
        if (!this.f97554c || this.L == null || this.M.getMaxNumDetectedFaces() <= 0) {
            return;
        }
        try {
            if (i10 == 1) {
                if (this.f97560i == 1) {
                    this.L.startFaceDetection();
                    q.k(f97328a0, "use faceae for front");
                }
            } else if (i10 == 2) {
                if (this.f97560i == 0) {
                    this.L.startFaceDetection();
                    q.k(f97328a0, "use faceae for rear");
                }
            } else {
                if (i10 != 3) {
                    return;
                }
                this.L.startFaceDetection();
                q.k(f97328a0, "use faceae for all");
            }
        } catch (Exception unused) {
            q.e(f97328a0, "camera start face detect failed");
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void M0(float f10, TECameraSettings.w wVar) {
        List<Integer> list = this.T;
        if (list == null || this.L == null) {
            return;
        }
        float f11 = this.U * f10;
        this.U = f11;
        try {
            if (f11 < list.get(0).intValue()) {
                this.U = this.T.get(0).intValue();
            }
            float f12 = this.U;
            List<Integer> list2 = this.T;
            if (f12 > list2.get(list2.size() - 1).intValue()) {
                List<Integer> list3 = this.T;
                this.U = list3.get(list3.size() - 1).intValue();
            }
            Camera.Parameters parameters = this.L.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                q.e(f97328a0, "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                q.e(f97328a0, "setZoom failed for getParameters null");
                return;
            }
            int iU0 = U0((int) this.U);
            if (parameters.getZoom() != iU0) {
                parameters.setZoom(iU0);
                this.L.setParameters(parameters);
                if (wVar != null) {
                    wVar.onChange(1, this.T.get(iU0).intValue() / 100.0f, true);
                }
            }
        } catch (Exception e10) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: " + e10);
            q.e(f97328a0, "setZoom failed, " + e10.getMessage());
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public List<TEFrameSizei> O() {
        Camera.Parameters parameters = this.M;
        if (parameters == null) {
            this.R.clear();
            return this.R;
        }
        List<TEFrameSizei> listS0 = S0(parameters.getSupportedPictureSizes());
        this.R = listS0;
        return listS0;
    }

    @Override // com.ss.android.ttvecamera.j
    public List<TEFrameSizei> P() {
        Camera.Parameters parameters = this.M;
        if (parameters == null) {
            this.Q.clear();
            return this.Q;
        }
        List<TEFrameSizei> listS0 = S0(parameters.getSupportedPreviewSizes());
        this.Q = listS0;
        return listS0;
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean R() {
        Camera.Parameters parameters;
        q.k(f97328a0, "isAutoExposureLockSupported...");
        if (this.L == null || (parameters = this.M) == null || !this.f97554c) {
            return false;
        }
        return parameters.isAutoExposureLockSupported();
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean S() {
        Camera.Parameters parameters;
        q.k(f97328a0, "isAutoFocusLockSupported...");
        Camera camera = this.L;
        if (camera == null || (parameters = this.M) == null || !this.f97554c) {
            this.f97555d.c(1, o.H0, "setAutoFocusLock failed. ： Camera is null.", camera);
            return false;
        }
        try {
            return parameters.getSupportedFocusModes().contains("fixed");
        } catch (Exception unused) {
            this.f97555d.e(o.B0, o.B0, "isAutoFocusLockSupported failed", this.L);
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean U() {
        Camera.Parameters parameters;
        try {
            return (this.L == null || (parameters = this.M) == null || parameters.getSupportedWhiteBalance() == null || !this.M.isAutoWhiteBalanceLockSupported()) ? false : true;
        } catch (Exception e10) {
            q.e(f97328a0, "Unsupported whileBalance!: " + e10.toString());
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean V() {
        q.k(f97328a0, "isSupportedExposureCompensation...");
        if (this.L == null || this.M == null || !this.f97554c) {
            return false;
        }
        return this.f97553b.K.a();
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean W() {
        Bundle bundle = B().get(this.f97553b.H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(TECameraSettings.k.f97154t, false);
    }

    @Override // com.ss.android.ttvecamera.j
    public int X(int i10, int i11, int i12, int i13, int i14, boolean z10, Cert cert) {
        q.b(f97328a0, "Open camera facing = " + i10);
        TECameraSettings tECameraSettings = this.f97553b;
        tECameraSettings.f97080d = i10;
        TEFrameSizei tEFrameSizei = tECameraSettings.f97106q;
        tEFrameSizei.f97206b = i11;
        tEFrameSizei.f97207c = i12;
        tECameraSettings.f97078c.f97204c = i13;
        tECameraSettings.D = i14;
        return Y0(cert);
    }

    @Override // com.ss.android.ttvecamera.j
    public int Y(TECameraSettings tECameraSettings, Cert cert) {
        super.Y(tECameraSettings, cert);
        this.f97553b = tECameraSettings;
        this.f97561j = tECameraSettings.f97080d;
        return Y0(cert);
    }

    public void Z0(SurfaceHolder surfaceHolder) {
        this.K = surfaceHolder;
    }

    @Override // com.ss.android.ttvecamera.j
    public void b0(TECameraSettings.t tVar) {
        if (tVar == null) {
            q.e(f97328a0, "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "queryShaderZoomStep : Camera is null!");
            this.f97555d.c(1, o.H0, "queryShaderZoomStep : Camera is null!", this.L);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom <= 0) {
                    tVar.a(0.0f);
                } else {
                    tVar.a(((float) Math.pow(((zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue()) / 100.0f) + 1.0f, 0.5d)) - 1.0f);
                }
            }
        } catch (Exception e10) {
            String str = "Query shader zoom step failed : " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97692o0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void c() {
        q.b(f97328a0, "cancelFocus...");
        Camera camera = this.L;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void c0(TECameraSettings.w wVar, boolean z10) {
        if (wVar == null) {
            q.e(f97328a0, "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "queryZoomAbility : Camera is null!");
            this.f97555d.c(1, o.H0, "queryZoomAbility : Camera is null!", this.L);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            float maxZoom = parameters.getMaxZoom();
            this.f97564m = maxZoom;
            if (z10) {
                wVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), this.T.get((int) maxZoom).intValue() / 100.0f, parameters.getZoomRatios());
            } else {
                wVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            }
        } catch (Exception e10) {
            String str = "Query zoom ability failed : " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97692o0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void f(Cert cert) {
        this.Z = false;
        q.k(f97328a0, "Camera close start...");
        if (this.L != null) {
            if (this.f97554c) {
                try {
                    q.k(f97328a0, "Camera close torch...");
                    Camera.Parameters parameters = this.L.getParameters();
                    this.M = parameters;
                    parameters.setFlashMode(s0.f130317e);
                    this.L.setParameters(this.M);
                    q.k(f97328a0, "Camera stopPreview...");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.L.stopPreview();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    q.k(f97328a0, "Camera stopPreview end...");
                    n.b(n.f97659w, jCurrentTimeMillis2);
                    q.l(n.f97659w, Long.valueOf(jCurrentTimeMillis2));
                    if (this.f97559h.g() == 1) {
                        this.f97559h.h().setOnFrameAvailableListener(null, null);
                    } else if (this.f97559h.g() == 4) {
                        this.L.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e10) {
                    q.e(f97328a0, "Close camera failed: " + e10.getMessage());
                }
                this.f97554c = false;
            }
            try {
                this.L.setErrorCallback(null);
                this.f97555d.e(108, 0, "will close camera1", null);
                com.ss.android.ttvecamera.e.b(cert, this.L);
                this.f97555d.e(109, 0, "did close camera1", null);
            } catch (Exception e11) {
                q.e(f97328a0, "Camera release failed: " + e11.getMessage());
            }
            this.W.set(false);
            this.L = null;
            q.k(f97328a0, "Camera closed end!");
            this.f97555d.i(1, this, this.L);
        }
        this.f97573v = null;
    }

    @Override // com.ss.android.ttvecamera.j
    protected void g() {
        s.a("TECamera1-collectCameraCapabilities");
        if (!T()) {
            s.b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.M != null) {
                this.f97575x.putOpt("camera_id", Integer.valueOf(this.f97553b.f97084f));
                if (this.M.isZoomSupported()) {
                    this.f97575x.putOpt("camera_zoom_max_ability", Integer.valueOf(this.M.getMaxZoom()));
                }
                List<TEFrameSizei> listP = P();
                if (listP != null) {
                    this.f97574w.a(new TECameraCapabilityCollector.a(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, TECameraCapabilityCollector.DataType.STRING, this.f97553b.H + ContainerUtils.KEY_VALUE_DELIMITER + listP.toString()));
                    JSONArray jSONArray = new JSONArray();
                    for (TEFrameSizei tEFrameSizei : listP) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.f97206b));
                        jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.f97207c));
                        jSONArray.put(jSONObject);
                    }
                    this.f97575x.putOpt("preview_size_lit", jSONArray);
                }
            }
        } catch (Exception unused) {
        }
        List<int[]> supportedPreviewFpsRange = this.M.getSupportedPreviewFpsRange();
        StringBuilder sb2 = new StringBuilder(this.f97553b.H + ContainerUtils.KEY_VALUE_DELIMITER);
        try {
            JSONArray jSONArray2 = new JSONArray();
            if (supportedPreviewFpsRange != null) {
                for (int[] iArr : supportedPreviewFpsRange) {
                    sb2.append(com.meituan.robust.Constants.ARRAY_TYPE);
                    sb2.append(iArr[0] / 1000);
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb2.append(iArr[1] / 1000);
                    sb2.append("]");
                    if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                        sb2.append(", ");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("fps_min", Integer.valueOf(iArr[0] / 1000));
                    jSONObject2.putOpt("fps_max", Integer.valueOf(iArr[1] / 1000));
                    jSONArray2.put(jSONObject2);
                }
                this.f97574w.a(new TECameraCapabilityCollector.a(TECameraCapabilityCollector.Capability.FPS_RANGE, TECameraCapabilityCollector.DataType.STRING, sb2.toString()));
                this.f97575x.putOpt("fps_range_list", jSONArray2);
            }
        } catch (Exception unused2) {
        }
        this.f97574w.d();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        q.k(f97328a0, "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
        n.b(n.f97660x, jCurrentTimeMillis2);
        this.f97576y = true;
        s.b();
    }

    @Override // com.ss.android.ttvecamera.j
    public void j() {
        if (this.L == null || this.M == null) {
            return;
        }
        q.b(f97328a0, "enableCaf...");
        try {
            if (this.M.getSupportedFocusModes().contains("continuous-video")) {
                this.L.cancelAutoFocus();
                this.M.setFocusMode("continuous-video");
                this.L.setParameters(this.M);
            }
        } catch (Throwable th2) {
            String str = "Error: focusAtPoint failed: " + th2.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97674f0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void j0(boolean z10) {
        Camera.Parameters parameters;
        q.k(f97328a0, "setAutoExposureLock...");
        Camera camera = this.L;
        if (camera == null || (parameters = this.M) == null || !this.f97554c) {
            this.f97555d.c(1, o.H0, "setAutoExposureLock failed. ： Camera is null.", camera);
            return;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            q.u(f97328a0, "Current camera doesn't support ae lock.");
            this.f97555d.e(o.f97704u0, o.f97704u0, "Current camera doesn't support ae lock.", this.L);
            return;
        }
        try {
            this.M.setAutoExposureLock(z10);
            this.L.setParameters(this.M);
        } catch (Exception e10) {
            String str = "Error: setAutoExposureLock failed: " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.e(o.f97706v0, o.f97706v0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void k0(boolean z10) {
        q.k(f97328a0, "setAutoFocusLock...");
        Camera camera = this.L;
        if (camera == null || this.M == null || !this.f97554c) {
            this.f97555d.c(1, o.H0, "setAutoFocusLock failed. ： Camera is null.", camera);
            return;
        }
        if (!S()) {
            q.u(f97328a0, "Current camera doesn't support af lock.");
            this.f97555d.e(o.B0, o.B0, "Current camera doesn't support af lock.", this.L);
            return;
        }
        try {
            if (z10) {
                this.M.setFocusMode("fixed");
            } else {
                this.M.setFocusMode("continuous-video");
            }
            this.L.setParameters(this.M);
        } catch (Exception e10) {
            String str = "Error: setAutoFocusLock failed: " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.e(o.f97706v0, o.f97706v0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    @w0(api = 21)
    protected Bundle l() {
        Camera.Parameters parameters;
        this.f97553b.H = this.f97553b.f97080d + "";
        Bundle bundleL = super.l();
        if (bundleL != null) {
            bundleL.putParcelableArrayList(TECameraSettings.k.f97149o, (ArrayList) P());
            bundleL.putParcelableArrayList(TECameraSettings.k.f97150p, (ArrayList) O());
            bundleL.putParcelableArrayList(TECameraSettings.k.f97156v, (ArrayList) W0());
            bundleL.putParcelableArrayList(TECameraSettings.k.f97151q, (ArrayList) V0());
            bundleL.putParcelable(TECameraSettings.k.f97152r, this.f97553b.f97106q);
            try {
                bundleL.putBoolean(TECameraSettings.k.f97154t, (this.L == null || (parameters = this.M) == null || parameters.getSupportedFlashModes() == null) ? false : true);
            } catch (Exception e10) {
                q.e(f97328a0, "Get camera torch information failed: " + e10.toString());
                bundleL.putBoolean(TECameraSettings.k.f97154t, false);
            }
        }
        return bundleL;
    }

    @Override // com.ss.android.ttvecamera.j
    public void m(TEFocusSettings tEFocusSettings) {
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "focusAtPoint: camera is null.");
            tEFocusSettings.g().a(o.H0, this.f97553b.f97080d, "focusAtPoint: camera is null.");
            this.f97555d.c(1, o.H0, "focusAtPoint: camera is null.", this.L);
            return;
        }
        boolean z10 = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.M = parameters;
            if (!this.N.e(parameters, this.O)) {
                q.e(f97328a0, "Error: not support focus.");
                this.f97555d.e(o.f97676g0, o.f97676g0, "Error: not support focus.", this.L);
                if (!this.N.f(this.f97553b.f97080d, this.M) || !tEFocusSettings.p()) {
                    tEFocusSettings.g().a(o.f97676g0, this.f97553b.f97080d, "Error: not support focus.");
                    return;
                }
                if (tEFocusSettings.d() != null) {
                    Camera.Parameters parameters2 = this.M;
                    com.ss.android.ttvecamera.b.InterfaceC0924b interfaceC0924bD = tEFocusSettings.d();
                    int iJ = tEFocusSettings.j();
                    int i10 = tEFocusSettings.i();
                    int iK = tEFocusSettings.k();
                    int iL = tEFocusSettings.l();
                    TECameraSettings tECameraSettings = this.f97553b;
                    parameters2.setMeteringAreas(interfaceC0924bD.a(iJ, i10, iK, iL, tECameraSettings.f97082e, tECameraSettings.f97080d == 1));
                } else {
                    this.M.setMeteringAreas(this.N.b(tEFocusSettings.j(), tEFocusSettings.i(), tEFocusSettings.f(), tEFocusSettings.k(), tEFocusSettings.l(), this.f97553b.f97082e, tEFocusSettings.e()));
                }
                this.L.setParameters(this.M);
                return;
            }
            if (tEFocusSettings.p() && this.N.f(this.f97553b.f97080d, this.M)) {
                if (tEFocusSettings.d() != null) {
                    Camera.Parameters parameters3 = this.M;
                    com.ss.android.ttvecamera.b.InterfaceC0924b interfaceC0924bD2 = tEFocusSettings.d();
                    int iJ2 = tEFocusSettings.j();
                    int i11 = tEFocusSettings.i();
                    int iK2 = tEFocusSettings.k();
                    int iL2 = tEFocusSettings.l();
                    TECameraSettings tECameraSettings2 = this.f97553b;
                    parameters3.setMeteringAreas(interfaceC0924bD2.a(iJ2, i11, iK2, iL2, tECameraSettings2.f97082e, tECameraSettings2.f97080d == 1));
                } else {
                    this.M.setMeteringAreas(this.N.b(tEFocusSettings.j(), tEFocusSettings.i(), tEFocusSettings.f(), tEFocusSettings.k(), tEFocusSettings.l(), this.f97553b.f97082e, tEFocusSettings.e()));
                }
            }
            if (!tEFocusSettings.o()) {
                this.L.setParameters(this.M);
                q.k(f97328a0, "focus is not enable!");
                return;
            }
            if (tEFocusSettings.c() != null) {
                Camera.Parameters parameters4 = this.M;
                com.ss.android.ttvecamera.b.a aVarC = tEFocusSettings.c();
                int iJ3 = tEFocusSettings.j();
                int i12 = tEFocusSettings.i();
                int iK3 = tEFocusSettings.k();
                int iL3 = tEFocusSettings.l();
                TECameraSettings tECameraSettings3 = this.f97553b;
                parameters4.setFocusAreas(aVarC.a(iJ3, i12, iK3, iL3, tECameraSettings3.f97082e, tECameraSettings3.f97080d == 1));
            } else {
                this.M.setFocusAreas(this.N.a(tEFocusSettings.j(), tEFocusSettings.i(), tEFocusSettings.f(), tEFocusSettings.k(), tEFocusSettings.l(), this.f97553b.f97082e, tEFocusSettings.e()));
            }
            this.L.cancelAutoFocus();
            this.M.setFocusMode("auto");
            if (this.Z && !tEFocusSettings.m()) {
                this.M.setFlashMode(s0.f130317e);
                z10 = true;
            }
            this.L.setParameters(this.M);
            this.L.autoFocus(new d(tEFocusSettings));
            if (z10) {
                try {
                    this.M.setFlashMode("on");
                    this.L.setParameters(this.M);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            String str = "Error: focusAtPoint failed: " + e10.toString();
            q.e(f97328a0, str);
            tEFocusSettings.g().a(o.f97674f0, this.f97553b.f97080d, str);
            this.f97555d.c(1, o.f97674f0, str, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean m0(int i10) {
        String str;
        int i11;
        this.V = i10;
        q.k(f97328a0, "setExposureCompensation... value: " + i10);
        Camera camera = this.L;
        int i12 = o.f97678h0;
        if (camera == null || this.M == null || !this.f97554c || !this.f97553b.K.a()) {
            Camera camera2 = this.L;
            if (camera2 == null || this.M == null || !this.f97554c) {
                this.f97555d.c(1, o.H0, "setExposureCompensation ： Camera is null.", camera2);
                str = "setExposureCompensation ： Camera is null.";
            } else {
                i12 = o.f97680i0;
                str = "Unsupported exposure compensation!";
            }
            this.f97555d.c(1, i12, str, this.L);
            i11 = i12;
        } else {
            TECameraSettings.h hVar = this.f97553b.K;
            if (i10 > hVar.f97131a || i10 < hVar.f97133c) {
                this.f97555d.c(1, o.f97682j0, "Invalid exposure: " + i10, this.L);
                return false;
            }
            try {
                this.M.setExposureCompensation(i10);
                this.L.setParameters(this.M);
                this.f97553b.K.f97132b = this.M.getExposureCompensation();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("EC = ");
                sb2.append(this.f97553b.K.f97132b);
                sb2.append(", EV = ");
                TECameraSettings.h hVar2 = this.f97553b.K;
                sb2.append(hVar2.f97132b * hVar2.f97134d);
                q.b(f97328a0, sb2.toString());
                str = null;
                i11 = 0;
            } catch (Exception e10) {
                str = "Error: setExposureCompensation failed: " + e10.toString();
                i11 = -1;
                this.f97555d.c(1, o.f97678h0, str, this.L);
            }
        }
        boolean z10 = i11 == 0;
        if (!z10) {
            q.e(f97328a0, "setExposureCompensation failed: " + str);
        }
        return z10;
    }

    @Override // com.ss.android.ttvecamera.j
    public void n(Cert cert) {
        super.n(cert);
        q.k(f97328a0, "force close camera: " + this.L);
        try {
            Camera camera = this.L;
            if (camera != null) {
                com.ss.android.ttvecamera.e.b(cert, camera);
                this.L = null;
            }
        } catch (Exception unused) {
            q.e(f97328a0, "force close camera failed");
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f97571t.get(this.f97553b.H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.q.a(str, bundle.get(str)) && TextUtils.equals(str, TECameraSettings.k.f97136b)) {
                bundle2.putBoolean(TECameraSettings.k.f97136b, bundle.getBoolean(TECameraSettings.k.f97136b));
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public TEFrameSizei p(float f10, TEFrameSizei tEFrameSizei) {
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.M == null) {
            this.M = camera.getParameters();
        }
        return tEFrameSizei != null ? p.b(P(), tEFrameSizei) : p.c(P(), f10);
    }

    @Override // com.ss.android.ttvecamera.j
    public JSONObject q() {
        return this.f97575x;
    }

    @Override // com.ss.android.ttvecamera.j
    public void q0(int i10, int i11) {
        TECameraSettings tECameraSettings = this.f97553b;
        tECameraSettings.A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f97108r;
        tEFrameSizei.f97206b = i10;
        tEFrameSizei.f97207c = i11;
        B0();
        x0();
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] r() {
        Camera camera = this.L;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void r0() {
        Camera.Parameters parameters = this.M;
        if (parameters == null) {
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int iA = TEFrameRateRange.a(supportedPreviewFpsRange);
        TECameraSettings tECameraSettings = this.f97553b;
        int[] iArrY = p.y(tECameraSettings.O, tECameraSettings.f97080d, tECameraSettings.f97078c.f(iA), supportedPreviewFpsRange);
        this.M.setPreviewFpsRange(iArrY[0], iArrY[1]);
        this.f97555d.e(121, 0, new TEFrameRateRange(iArrY[0], iArrY[1]).toString(), null);
        this.L.setParameters(this.M);
    }

    @Override // com.ss.android.ttvecamera.j
    public void u0(int i10) {
        super.u0(i10);
        if (i10 == 0) {
            P0();
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("un support scene");
            }
            Q0();
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int v() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.j
    public void w0(boolean z10, String str) {
        Camera camera = this.L;
        if (camera == null || !this.f97554c) {
            q.e(f97328a0, "setWhileBalance : Camera is null!");
            this.f97555d.c(1, o.H0, "setWhileBalance : Camera is null!", this.L);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.M = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                String str2 = "SupportWBList has no value: " + str;
                q.e(f97328a0, str2);
                this.f97555d.c(1, o.f97700s0, str2, this.L);
            } else {
                this.M.setWhiteBalance(str);
                this.L.setParameters(this.M);
            }
        } catch (Exception e10) {
            String str3 = "Set WhileBalance failed: " + e10.toString();
            q.e(f97328a0, str3);
            this.f97555d.c(1, o.f97700s0, str3, this.L);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void x0() {
        s.a("TECamera1-startCapture");
        q.k(f97328a0, "Camera startPreview...");
        if (this.f97554c) {
            q.u(f97328a0, "Camera is previewing...");
            return;
        }
        if (this.L != null) {
            try {
                com.ss.android.ttvecamera.provider.c cVar = this.f97559h;
                if (cVar == null) {
                    throw new AndroidRuntimeException("ProviderManager is null");
                }
                j.f fVar = this.f97567p;
                if (fVar != null) {
                    cVar.n(fVar);
                }
                if (this.M == null) {
                    this.M = this.L.getParameters();
                }
                int iL = this.f97559h.l(S0(this.M.getSupportedPreviewSizes()), this.f97553b.f97106q);
                if (iL != 0) {
                    q.e(f97328a0, "Init provider failed, ret = " + iL);
                    return;
                }
                if (this.f97559h.g() == 1) {
                    if (this.f97559h.h() == null) {
                        q.e(f97328a0, "SurfaceTexture is null");
                        throw new AndroidRuntimeException("SurfaceTexture is null");
                    }
                    this.L.setPreviewTexture(this.f97559h.h());
                } else {
                    if (this.f97559h.g() != 4) {
                        q.e(f97328a0, "Unsupported camera provider type : " + this.f97559h.g());
                        return;
                    }
                    com.ss.android.ttvecamera.provider.a aVar = (com.ss.android.ttvecamera.provider.a) this.f97559h.f();
                    if (aVar == null) {
                        throw new AndroidRuntimeException("Provider is null");
                    }
                    if (this.W.compareAndSet(false, true)) {
                        for (byte[] bArr : aVar.A(3)) {
                            this.L.addCallbackBuffer(bArr);
                        }
                    }
                    this.L.setPreviewCallbackWithBuffer(aVar.B());
                    if (this.f97559h.h() != null) {
                        this.L.setPreviewTexture(this.f97559h.h());
                    }
                }
                if (this.T != null && Float.compare(this.f97553b.f97121x0, 1.0f) != 0) {
                    float f10 = this.U * this.f97553b.f97121x0;
                    this.U = f10;
                    if (f10 < this.T.get(0).intValue()) {
                        this.U = this.T.get(0).intValue();
                    } else {
                        float f11 = this.U;
                        List<Integer> list = this.T;
                        if (f11 > list.get(list.size() - 1).intValue()) {
                            List<Integer> list2 = this.T;
                            this.U = list2.get(list2.size() - 1).intValue();
                        }
                    }
                    this.M.setZoom(U0((int) this.U));
                    this.L.setParameters(this.M);
                }
                TEFrameSizei tEFrameSizeiC = this.f97559h.c();
                if (tEFrameSizeiC != null) {
                    if (this.M.getPreviewSize().width != tEFrameSizeiC.f97206b || this.M.getPreviewSize().height != tEFrameSizeiC.f97207c) {
                        this.M.setPreviewSize(tEFrameSizeiC.f97206b, tEFrameSizeiC.f97207c);
                        TECameraSettings tECameraSettings = this.f97553b;
                        if (tECameraSettings.f97124z) {
                            if (tECameraSettings.A) {
                                tECameraSettings.A = false;
                            } else {
                                List<TEFrameSizei> listS0 = S0(this.M.getSupportedPictureSizes());
                                TECameraSettings tECameraSettings2 = this.f97553b;
                                tECameraSettings.f97108r = p.u(listS0, tEFrameSizeiC, tECameraSettings2.f97114u, tECameraSettings2.f97122y);
                            }
                            Camera.Parameters parameters = this.M;
                            TEFrameSizei tEFrameSizei = this.f97553b.f97108r;
                            parameters.setPictureSize(tEFrameSizei.f97206b, tEFrameSizei.f97207c);
                        }
                        this.L.setParameters(this.M);
                    }
                    this.f97555d.e(50, 0, tEFrameSizeiC.toString(), this.L);
                }
                TECameraSettings tECameraSettings3 = this.f97553b;
                if (tECameraSettings3.A) {
                    tECameraSettings3.A = false;
                    Camera.Parameters parameters2 = this.M;
                    TEFrameSizei tEFrameSizei2 = tECameraSettings3.f97108r;
                    parameters2.setPictureSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
                    this.L.setParameters(this.M);
                    q.k(f97328a0, "force set picture size: " + this.f97553b.f97108r.f97206b + "x" + this.f97553b.f97108r.f97207c);
                }
                this.L.setErrorCallback(new a());
                this.f97553b.f97082e = D();
                q.b(f97328a0, "Camera rotation = " + this.f97553b.f97082e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                q.k(f97328a0, "Camera startPreview start");
                this.L.startPreview();
                q.k(f97328a0, "Camera startPreview end");
                int i10 = this.f97553b.E.getInt("useCameraFaceDetect");
                this.Y = i10;
                L0(i10);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.X = jCurrentTimeMillis2;
                long j10 = jCurrentTimeMillis2 - jCurrentTimeMillis;
                n.b(n.f97658v, j10);
                q.l(n.f97658v, Long.valueOf(j10));
                this.f97554c = true;
                this.f97555d.a(1, 0, 0, "TECamera1 preview", this.L);
            } catch (Exception e10) {
                q.e(f97328a0, "startPreview: Error " + e10.getMessage());
                int i11 = o.f97702t0;
                if (e10.getMessage() != null) {
                    if (e10.getMessage().equals("setParameters failed")) {
                        i11 = -402;
                    } else if (e10.getMessage().equals("startPreview failed")) {
                        i11 = o.f97672e0;
                    }
                }
                m.a(e10);
                this.f97554c = false;
                try {
                    if (this.f97565n == 0) {
                        this.f97555d.e(108, 0, "preview error will close camera1", null);
                        com.ss.android.ttvecamera.e.b(this.f97573v, this.L);
                        this.f97555d.e(109, 0, "preview error did close camera1", null);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (this.f97565n == 0) {
                    this.L = null;
                }
                this.f97555d.b(1, i11, e10.getMessage(), this.L);
            }
        }
        s.b();
    }

    @Override // com.ss.android.ttvecamera.j
    public float[] y() {
        float[] fArr = new float[2];
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "getFOV: camera device is null.");
            this.f97555d.c(1, o.H0, "getFOV: camera device is null.", this.L);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.M = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.M.getHorizontalViewAngle();
            q.b(f97328a0, "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void z0(float f10, TECameraSettings.w wVar) {
        Camera camera = this.L;
        if (camera == null) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            q.e(f97328a0, "startZoom : Camera is null!");
            this.f97555d.c(1, o.H0, "startZoom : Camera is null!", this.L);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.M = parameters;
            if (!parameters.isZoomSupported() && !this.M.isSmoothZoomSupported()) {
                q.e(f97328a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                q.e(f97328a0, "Camera is not support zoom!");
                this.f97555d.c(1, o.f97694p0, "Camera is not support zoom!", this.L);
                return;
            }
            int iMin = (int) Math.min(this.M.getMaxZoom(), f10);
            if (this.M.isSmoothZoomSupported() && wVar != null && wVar.enableSmooth()) {
                this.L.startSmoothZoom(iMin);
                this.L.setZoomChangeListener(new f(wVar));
                return;
            }
            this.M.setZoom(iMin);
            this.L.setParameters(this.M);
            if (wVar != null) {
                wVar.onChange(1, iMin, true);
            }
        } catch (Exception e10) {
            q.e(f97328a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + e10);
            String str = "Start zoom failed : " + e10.toString();
            q.e(f97328a0, str);
            this.f97555d.c(1, o.f97692o0, str, this.L);
        }
    }
}
