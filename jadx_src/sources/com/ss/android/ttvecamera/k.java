package com.ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import androidx.annotation.n0;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: TECameraCapture.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97582g = "TECameraCapture";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f97583h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f97584i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f97585j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f97586k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f97587l = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected TECameraSettings f97588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b f97589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected d f97590c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f97592e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f97591d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Map<String, Bundle> f97593f = new HashMap();

    /* JADX INFO: compiled from: TECameraCapture.java */
    public interface a {
        int[] a(List<int[]> list);
    }

    /* JADX INFO: compiled from: TECameraCapture.java */
    public interface b {
        void onCaptureStarted(int i10, int i11);

        void onCaptureStopped(int i10);

        void onError(int i10, String str);

        void onInfo(int i10, int i11, String str);
    }

    /* JADX INFO: compiled from: TECameraCapture.java */
    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile c f97594a;

        protected c() {
        }

        public static c a() {
            c cVar;
            synchronized (c.class) {
                if (f97594a == null) {
                    synchronized (c.class) {
                        f97594a = new c();
                    }
                }
                cVar = f97594a;
            }
            return cVar;
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onCaptureStarted(int i10, int i11) {
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onCaptureStopped(int i10) {
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onError(int i10, String str) {
        }

        @Override // com.ss.android.ttvecamera.k.b
        public void onInfo(int i10, int i11, String str) {
        }
    }

    /* JADX INFO: compiled from: TECameraCapture.java */
    public interface d {
        TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* JADX INFO: compiled from: TECameraCapture.java */
    public interface e {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    public k(@n0 b bVar) {
        this.f97589b = c.a();
        this.f97589b = bVar;
    }

    public k(@n0 b bVar, d dVar) {
        this.f97589b = c.a();
        this.f97589b = bVar;
        this.f97590c = dVar;
        s.c(false);
    }

    private List<TEFrameSizei> P() {
        return TECameraServer.INSTANCE.getSupportedPictureSizes(this);
    }

    private List<TEFrameSizei> Q() {
        return TECameraServer.INSTANCE.getSupportedPreviewSizes(this);
    }

    private static boolean U(Context context, int i10) {
        return true;
    }

    private void U0(int i10, Bundle bundle) {
        q.k(f97582g, "updateAllCameraFeatures with camera type: " + i10);
        Bundle bundle2 = new Bundle();
        String str = this.f97588a.H;
        boolean z10 = false;
        if (11 == i10) {
            bundle2.putInt(TECameraSettings.k.f97159y, 0);
            str = this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d;
        } else if (10 == i10) {
            bundle2.putBoolean(TECameraSettings.k.f97160z, false);
            str = this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d;
        } else if (2 == i10) {
            bundle2.putBoolean(TECameraSettings.k.A, false);
            str = this.f97588a.H;
        }
        bundle2.putInt(TECameraSettings.k.f97157w, 0);
        e0(str, bundle2);
        if (11 == i10) {
            bundle.putInt(TECameraSettings.k.f97159y, (bundle2.getInt(TECameraSettings.k.f97159y) <= 0 || bundle.getInt(TECameraSettings.k.f97159y) <= 0) ? 0 : 1);
        }
        bundle.putInt(TECameraSettings.k.f97157w, (bundle2.getInt(TECameraSettings.k.f97157w) <= 0 || bundle.getInt(TECameraSettings.k.f97157w) <= 0) ? 0 : 1);
        if (10 == i10) {
            bundle.putBoolean(TECameraSettings.k.f97160z, bundle2.getBoolean(TECameraSettings.k.f97160z));
        }
        if (2 == i10) {
            boolean z11 = bundle2.getBoolean(TECameraSettings.k.A);
            boolean z12 = bundle.getBoolean(TECameraSettings.k.A);
            if (z11 && z12) {
                z10 = true;
            }
            bundle.putBoolean(TECameraSettings.k.A, z10);
        }
        List<TEFrameSizei> listQ = Q();
        List<TEFrameSizei> listP = P();
        if (listQ != null) {
            bundle.putParcelableArrayList(TECameraSettings.k.f97149o, (ArrayList) listQ);
        }
        if (listP != null) {
            bundle.putParcelableArrayList(TECameraSettings.k.f97150p, (ArrayList) listP);
        }
        q.k(f97582g, "updateAllCameraFeatures, feature bundle = " + bundle);
    }

    public static void c0(Context context, int i10, Bundle bundle) {
        if (U(context, i10) && u(context, i10, bundle)) {
            s(context, i10, bundle);
        }
    }

    public static void h0(m.a aVar) {
        m.b(aVar);
    }

    public static void j0(byte b10, q.b bVar) {
        q.n(bVar);
        q.o("VESDK", b10);
    }

    private static int k(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    public static void k0(n.a aVar) {
        n.e(aVar);
    }

    private static void s(Context context, int i10, Bundle bundle) {
        if (i10 != 4) {
            return;
        }
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            HashMap map = null;
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        if (TECameraSettings.k.f97145k.equals(it.next()) && i10 == 4) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(Integer.valueOf(k(num.intValue())), Boolean.TRUE);
                            bundle.putSerializable(TECameraSettings.k.f97145k, map);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void t(Context context, int i10, Bundle bundle) {
        if (i10 != 4) {
            return;
        }
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            HashMap map = null;
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        if (TECameraSettings.k.f97138d.equals(it.next()) && i10 == 4) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(Integer.valueOf(k(num.intValue())), Boolean.TRUE);
                            bundle.putSerializable(TECameraSettings.k.f97138d, map);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean u(Context context, int i10, Bundle bundle) {
        boolean z10 = false;
        for (String str : bundle.keySet()) {
            if (TECameraSettings.k.f97139e.equals(str)) {
                bundle.putBoolean(TECameraSettings.k.f97139e, U(context, i10));
            } else if (!TECameraSettings.k.f97137c.equals(str) || i10 == 1) {
                z10 = true;
            } else {
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                bundle.putBoolean(TECameraSettings.k.f97137c, com.ss.android.ttvecamera.hardware.d.c(context, i10).z());
                q.b(f97582g, "Get wide angle info cost " + (System.currentTimeMillis() - lValueOf.longValue()) + "ms");
            }
        }
        return z10;
    }

    private void z(Context context, int i10, Bundle bundle) {
        q.k(f97582g, "getCameraAllFeatures with camera type: " + i10);
        if (i10 == 1) {
            bundle.putBoolean(TECameraSettings.k.f97137c, false);
        } else if (11 != i10) {
            String strE = com.ss.android.ttvecamera.hardware.d.c(context, i10).e();
            q.k(f97582g, "getCameraAllFeatures, filledWideCameraId: " + strE);
            if ("-1".equals(strE)) {
                boolean z10 = com.ss.android.ttvecamera.hardware.d.c(context, i10).z();
                bundle.putBoolean(TECameraSettings.k.f97137c, z10);
                if (z10) {
                    bundle.putString(TECameraSettings.k.f97140f, com.ss.android.ttvecamera.hardware.d.c(context, i10).j());
                }
            } else if (strE.equals("0")) {
                bundle.putBoolean(TECameraSettings.k.f97137c, false);
            } else {
                bundle.putBoolean(TECameraSettings.k.f97137c, true);
                bundle.putString(TECameraSettings.k.f97140f, strE);
            }
        }
        if (10 == i10) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(TECameraSettings.k.f97160z, false);
            e0(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d, bundle2);
            bundle.putBoolean(TECameraSettings.k.f97160z, bundle2.getBoolean(TECameraSettings.k.f97160z));
            q.k(f97582g, "getCameraAllFeatures, vendor rdhw type, feature bundle = " + bundle);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable(TECameraSettings.k.f97138d, null);
        t(context, i10, bundle3);
        if (bundle3.size() > 0) {
            bundle.putAll(bundle3);
        }
        q.k(f97582g, "getCameraAllFeatures, features = " + bundle);
    }

    public synchronized void A(Context context, Bundle bundle) {
        if (this.f97588a != null) {
            if (this.f97593f.containsKey(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d)) {
                Bundle bundle2 = this.f97593f.get(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d);
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
            } else {
                z(context, this.f97588a.f97076b, bundle);
                this.f97593f.put(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d, bundle);
            }
        }
    }

    public void A0(long j10) {
        TECameraServer.INSTANCE.setShutterTime(this, j10);
    }

    public JSONObject B(TECameraSettings.b bVar) {
        return TECameraServer.INSTANCE.getCameraCapbilitiesForBytebench(this, bVar);
    }

    public void B0(boolean z10, @TECameraSettings.v String str) {
        TECameraServer.INSTANCE.setWhileBalance(this, z10, str);
    }

    public int[] C() {
        return TECameraServer.INSTANCE.getCameraCaptureSize();
    }

    public int C0() {
        return TECameraServer.INSTANCE.start(this);
    }

    public TECameraSettings.h D() {
        return TECameraServer.INSTANCE.getCameraECInfo(this);
    }

    @Deprecated
    public int D0(SurfaceTexture surfaceTexture, int i10) {
        q.e(f97582g, "Do not use this interface!!");
        return C0();
    }

    public int E() {
        return TECameraServer.INSTANCE.getCameraState();
    }

    public int E0() {
        return TECameraServer.INSTANCE.startRecording();
    }

    public int F(boolean z10) {
        return TECameraServer.INSTANCE.getCameraState(z10);
    }

    public int F0(float f10, TECameraSettings.w wVar) {
        return TECameraServer.INSTANCE.startZoom(this, f10, wVar);
    }

    public int G() {
        return TECameraServer.INSTANCE.getExposureCompensation(this);
    }

    public int G0() {
        return H0(false);
    }

    public float[] H(TECameraSettings.i iVar) {
        return TECameraServer.INSTANCE.getFOV(this, iVar);
    }

    public int H0(boolean z10) {
        return TECameraServer.INSTANCE.stop(this, z10);
    }

    public int I() {
        return TECameraServer.INSTANCE.getFlashMode(this);
    }

    public int I0() {
        return TECameraServer.INSTANCE.stopRecording();
    }

    public int J(TECameraSettings.m mVar) {
        return TECameraServer.INSTANCE.getISO(this, mVar);
    }

    public int J0(TECameraSettings.w wVar) {
        return TECameraServer.INSTANCE.stopZoom(this, wVar);
    }

    public int[] K(TECameraSettings.n nVar) {
        return TECameraServer.INSTANCE.getISORange(this, nVar);
    }

    public int K0(int i10) {
        return L0(i10, null);
    }

    public float L(TECameraSettings.o oVar) {
        return TECameraServer.INSTANCE.getManualFocusAbility(this, oVar);
    }

    public int L0(int i10, Cert cert) {
        return TECameraServer.INSTANCE.switchCamera(this, i10, cert);
    }

    public int[] M() {
        return TECameraServer.INSTANCE.getPictureSize(this);
    }

    public int M0(TECameraSettings tECameraSettings) {
        return N0(tECameraSettings, null);
    }

    public int[] N() {
        return TECameraServer.INSTANCE.getPreviewFps();
    }

    public int N0(TECameraSettings tECameraSettings, Cert cert) {
        this.f97588a = tECameraSettings;
        return TECameraServer.INSTANCE.switchCamera(this, tECameraSettings, cert);
    }

    public long[] O(TECameraSettings.u uVar) {
        return TECameraServer.INSTANCE.getShutterTimeRange(this, uVar);
    }

    public int O0(int i10, TECameraSettings tECameraSettings) {
        if (tECameraSettings != null) {
            this.f97588a = tECameraSettings;
        }
        return TECameraServer.INSTANCE.switchCameraMode(this, i10);
    }

    public int P0(@TECameraSettings.l int i10) {
        return TECameraServer.INSTANCE.switchFlashMode(this, i10);
    }

    public int Q0(int i10, int i11, TECameraSettings.r rVar) {
        return TECameraServer.INSTANCE.takePicture(this, i10, i11, rVar);
    }

    public boolean R(Context context) {
        return com.ss.android.ttvecamera.hardware.d.c(context, 2).m();
    }

    public int R0(TECameraSettings.r rVar) {
        return TECameraServer.INSTANCE.takePicture(this, rVar);
    }

    public boolean S() {
        return TECameraServer.INSTANCE.isAutoExposureLockSupported(this);
    }

    public int S0(boolean z10) {
        return TECameraServer.INSTANCE.toggleTorch(this, z10);
    }

    public boolean T() {
        return TECameraServer.INSTANCE.isAutoFocusLockSupported(this);
    }

    public void T0() {
        TECameraServer.INSTANCE.upExposureCompensation(this);
    }

    public boolean V() {
        return TECameraServer.INSTANCE.isCameraSwitchState();
    }

    public void V0(Bundle bundle) {
        TECameraSettings tECameraSettings = this.f97588a;
        if (tECameraSettings != null) {
            U0(tECameraSettings.f97076b, bundle);
            if (!this.f97593f.containsKey(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d)) {
                this.f97593f.put(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d, bundle);
                return;
            }
            Bundle bundle2 = this.f97593f.get(this.f97588a.f97076b + lg.a.f131412e + this.f97588a.f97080d);
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
    }

    public boolean W() {
        return TECameraServer.INSTANCE.isSupportWhileBalance(this);
    }

    public void W0(TECameraAlgorithmParam tECameraAlgorithmParam) {
        TECameraServer.INSTANCE.updateCameraAlgorithmParam(tECameraAlgorithmParam);
    }

    public boolean X() {
        return TECameraServer.INSTANCE.isSupportedExposureCompensation(this);
    }

    public int X0(float f10, TECameraSettings.w wVar) {
        return TECameraServer.INSTANCE.zoomV2(this, f10, wVar);
    }

    public boolean Y() {
        return TECameraServer.INSTANCE.isTorchSupported(this);
    }

    public void Z(boolean z10) {
        TECameraServer.INSTANCE.notifyHostForegroundVisible(this, z10);
    }

    public int a() {
        return TECameraServer.INSTANCE.abortSession(this);
    }

    public void a0(TECameraSettings.p pVar) {
        TECameraServer.INSTANCE.process(this, pVar);
    }

    public void b(TECameraAlgorithmParam tECameraAlgorithmParam) {
        TECameraServer.INSTANCE.addCameraAlgorithm(tECameraAlgorithmParam);
    }

    public TECameraFrame b0(TECameraFrame tECameraFrame) {
        return TECameraServer.INSTANCE.processAlgorithm(tECameraFrame);
    }

    public int c(com.ss.android.ttvecamera.provider.c.a aVar) {
        return TECameraServer.INSTANCE.addCameraProvider(this, aVar);
    }

    public int d() {
        return TECameraServer.INSTANCE.cancelFocus(this);
    }

    public void d0(Bundle bundle) {
        TECameraSettings tECameraSettings = this.f97588a;
        if (tECameraSettings == null) {
            q.e(f97582g, "query features failed, maybe not connet");
        } else {
            e0(tECameraSettings.H, bundle);
        }
    }

    public int e(TECameraSettings.f fVar, rg.a aVar) {
        return TECameraServer.INSTANCE.captureBurst(this, fVar, aVar);
    }

    public void e0(String str, Bundle bundle) {
        TECameraServer.INSTANCE.queryFeatures(str, bundle);
    }

    public void f(boolean z10) {
        TECameraServer.INSTANCE.appLifeCycleChanged(z10);
    }

    public float f0(TECameraSettings.t tVar) {
        return TECameraServer.INSTANCE.queryShaderZoomStep(this, tVar);
    }

    public void g() {
    }

    public int g0(TECameraSettings.w wVar, boolean z10) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, wVar, z10);
    }

    public void h(int i10, j.c cVar) {
        TECameraServer.INSTANCE.changeRecorderState(this, i10, cVar);
    }

    public int i(TECameraSettings tECameraSettings) {
        return j(tECameraSettings, null);
    }

    public void i0(a aVar) {
        this.f97592e = aVar;
    }

    public int j(TECameraSettings tECameraSettings, Cert cert) {
        this.f97588a = tECameraSettings;
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(this.f97592e);
        tECameraServer.registerPreviewSizeListener(this.f97591d);
        return tECameraServer.connect(this, this.f97589b, this.f97588a, this.f97590c, cert);
    }

    public int l() {
        return m(null);
    }

    public void l0(e eVar) {
        this.f97591d = eVar;
    }

    public int m(Cert cert) {
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        return tECameraServer.disConnect(this, cert);
    }

    public void m0(int i10) {
        TECameraServer.INSTANCE.removeCameraAlgorithm(i10);
    }

    public int n(boolean z10) {
        return o(z10, null);
    }

    public int n0() {
        return TECameraServer.INSTANCE.removeCameraProvider(this);
    }

    public int o(boolean z10, Cert cert) {
        TECameraServer tECameraServer = TECameraServer.INSTANCE;
        tECameraServer.registerFpsConfigListener(null);
        return tECameraServer.disConnect(this, z10, cert);
    }

    public void o0(float f10) {
        TECameraServer.INSTANCE.setAperture(this, f10);
    }

    public void p() {
        TECameraServer.INSTANCE.downExposureCompensation(this);
    }

    public void p0(boolean z10) {
        TECameraServer.INSTANCE.setAutoExposureLock(this, z10);
    }

    public int q() {
        return TECameraServer.INSTANCE.enableCaf(this);
    }

    public void q0(boolean z10) {
        TECameraServer.INSTANCE.setAutoFocusLock(this, z10);
    }

    public void r(boolean z10) {
        TECameraServer.INSTANCE.enableMulticamZoom(this, z10);
    }

    public void r0(int i10) {
        TECameraServer.INSTANCE.setDeviceRotation(i10);
    }

    public void s0(int i10) {
        TECameraServer.INSTANCE.setExposureCompensation(this, i10);
    }

    public void t0(Bundle bundle) {
        TECameraServer.INSTANCE.setFeatureParameters(this, bundle);
    }

    public void u0(int i10) {
        TECameraServer.INSTANCE.setISO(this, i10);
    }

    public int v(int i10, int i11, float f10, int i12, int i13) {
        return w(new TEFocusSettings(i10, i11, i12, i13, f10));
    }

    public void v0(float f10) {
        TECameraServer.INSTANCE.setManualFocusDistance(this, f10);
    }

    public int w(TEFocusSettings tEFocusSettings) {
        tEFocusSettings.q();
        return TECameraServer.INSTANCE.focusAtPoint(this, tEFocusSettings);
    }

    public void w0(int i10, int i11) {
        TECameraServer.INSTANCE.setPictureSize(this, i10, i11);
    }

    public float[] x(TECameraSettings.a aVar) {
        return TECameraServer.INSTANCE.getApertureRange(this, aVar);
    }

    public void x0(TEFrameRateRange tEFrameRateRange) {
        TECameraServer.INSTANCE.setPreviewFpsRange(tEFrameRateRange);
    }

    public TEFrameSizei y(float f10, TEFrameSizei tEFrameSizei) {
        return TECameraServer.INSTANCE.getBestPreviewSize(this, f10, tEFrameSizei);
    }

    public void y0(TECameraSettings.s sVar) {
        TECameraServer.INSTANCE.setSATZoomCallback(sVar);
    }

    public void z0(int i10) {
        TECameraServer.INSTANCE.setSceneMode(this, i10);
    }
}
