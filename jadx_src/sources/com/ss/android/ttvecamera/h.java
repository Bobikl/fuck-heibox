package com.ss.android.ttvecamera;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import androidx.annotation.n0;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.ss.android.ttvecamera.framework.TECameraModeBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TECamera2.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class h extends j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected static final String f97509a0 = "TECamera2";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f97510b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f97511c0 = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f97512d0 = 2;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f97513e0 = 3;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f97514f0 = 4;
    protected com.ss.android.ttvecamera.hardware.d K;
    protected volatile int L;
    protected CameraCharacteristics M;
    protected CaptureRequest N;
    protected CameraManager O;
    protected volatile CameraDevice P;
    protected int Q;
    protected boolean R;
    protected TECameraModeBase S;
    private final com.ss.android.ttvecamera.focusmanager.a T;
    protected boolean U;
    protected boolean V;
    private List<TEFrameSizei> W;
    private List<TEFrameSizei> X;
    protected ConditionVariable Y;
    protected CameraDevice.StateCallback Z;

    /* JADX INFO: compiled from: TECamera2.java */
    public class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b<CameraDevice> f97515a;

        a() {
            this.f97515a = new b<>(h.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@n0 CameraDevice cameraDevice) {
            TECameraModeBase tECameraModeBase = h.this.S;
            if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
                ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).K0(cameraDevice, 4, -1);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@n0 CameraDevice cameraDevice) {
            q.k(h.f97509a0, "onDisconnected: OpenCameraCallBack");
            TECameraModeBase tECameraModeBase = h.this.S;
            if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
                ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).K0(cameraDevice, 1, -1);
            }
            h.this.c1();
            b<CameraDevice> bVar = this.f97515a;
            if (bVar != null) {
                bVar.a(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@n0 CameraDevice cameraDevice, int i10) {
            q.k(h.f97509a0, "onError: " + i10);
            TECameraModeBase tECameraModeBase = h.this.S;
            if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
                ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).K0(cameraDevice, 3, i10);
            }
            h.this.c1();
            b<CameraDevice> bVar = this.f97515a;
            if (bVar == null) {
                q.e(h.f97509a0, "had called onError");
            } else {
                bVar.b(cameraDevice, i10);
                this.f97515a = null;
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@n0 CameraDevice cameraDevice) {
            q.k(h.f97509a0, "onOpened: OpenCameraCallBack");
            h.this.f97555d.e(107, 0, "did start camera2", null);
            TECameraModeBase tECameraModeBase = h.this.S;
            if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
                ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).K0(cameraDevice, 0, -1);
            }
            h.this.P = cameraDevice;
            h.this.S.O(cameraDevice);
            h.this.c1();
            b<CameraDevice> bVar = this.f97515a;
            if (bVar == null || !bVar.c(cameraDevice)) {
                i.b(h.this.f97573v, cameraDevice);
                q.u(h.f97509a0, "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                return;
            }
            h hVar = h.this;
            if (hVar.V && hVar.U) {
                i.b(hVar.f97573v, cameraDevice);
                q.u(h.f97509a0, "onOpened: OpenCameraCallBack, but had camera close intent...");
                h.this.U = false;
            } else if (hVar.f97553b.f97103o0) {
                try {
                    hVar.S.m0();
                } catch (Exception e10) {
                    q.u(h.f97509a0, "onOpened: createSessionByDeferredSurface, some bad case occur, close camera! exception msg: " + e10.getMessage());
                    h hVar2 = h.this;
                    hVar2.f97553b.f97103o0 = false;
                    if (hVar2.L != 3) {
                        h.this.x0();
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: TECamera2.java */
    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<h> f97517a;

        /* JADX INFO: compiled from: TECamera2.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f97518b;

            a(h hVar) {
                this.f97518b = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = this.f97518b;
                j.a aVar = hVar.f97555d;
                if (aVar != null) {
                    aVar.f(hVar.f97553b.f97076b, 0, null, hVar.P);
                } else {
                    q.e(h.f97509a0, "mCameraEvents is null!");
                }
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TECamera2.java */
        public class RunnableC0929b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f97520b;

            RunnableC0929b(h hVar) {
                this.f97520b = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = this.f97520b;
                hVar.P0(hVar.f97573v);
                h hVar2 = this.f97520b;
                j.a aVar = hVar2.f97555d;
                if (aVar != null) {
                    aVar.c(hVar2.f97553b.f97076b, o.f97670d0, "Camera onDisconnected", hVar2.P);
                }
            }
        }

        /* JADX INFO: compiled from: TECamera2.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f97522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f97523c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f97524d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f97525e;

            c(h hVar, int i10, int i11, String str) {
                this.f97522b = hVar;
                this.f97523c = i10;
                this.f97524d = i11;
                this.f97525e = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i10;
                h hVar = this.f97522b;
                hVar.P0(hVar.f97573v);
                h hVar2 = this.f97522b;
                j.a aVar = hVar2.f97555d;
                if (aVar != null) {
                    if (this.f97523c == 3 && (i10 = this.f97524d) == 3) {
                        aVar.c(hVar2.f97553b.f97076b, i10, this.f97525e, hVar2.P);
                    } else {
                        aVar.f(hVar2.f97553b.f97076b, this.f97524d, null, hVar2.P);
                    }
                }
            }
        }

        public b(h hVar) {
            this.f97517a = new WeakReference<>(hVar);
        }

        public boolean a(@n0 T t10) {
            q.e(h.f97509a0, "StateCallback::onDisconnected...");
            h hVar = this.f97517a.get();
            if (hVar == null) {
                return false;
            }
            if (hVar.f97553b.f97099m0) {
                q.e(h.f97509a0, "StateCallback::onDisconnected...ignore reset...");
                hVar.f97553b.f97099m0 = false;
                return false;
            }
            RunnableC0929b runnableC0929b = new RunnableC0929b(hVar);
            if (hVar.f97553b.f97094k) {
                hVar.f97557f.post(runnableC0929b);
                return true;
            }
            runnableC0929b.run();
            return true;
        }

        public boolean b(@n0 T t10, int i10) {
            h hVar = this.f97517a.get();
            if (hVar == null) {
                q.e(h.f97509a0, "onError...no camera holder");
                return false;
            }
            int iZ0 = hVar.Z0();
            String str = "StateCallback::onError..." + i10 + ", session code: " + iZ0;
            q.k(h.f97509a0, str);
            c cVar = new c(hVar, iZ0, i10, str);
            if (hVar.f97553b.f97094k) {
                hVar.f97557f.post(cVar);
            } else {
                cVar.run();
            }
            hVar.f1(4);
            return true;
        }

        public boolean c(@n0 T t10) {
            q.k(h.f97509a0, "StateCallback::onOpened...");
            h hVar = this.f97517a.get();
            if (hVar == null) {
                return false;
            }
            hVar.f97553b.f97099m0 = false;
            hVar.f1(2);
            a aVar = new a(hVar);
            if (hVar.f97553b.f97094k) {
                hVar.f97557f.post(aVar);
            } else {
                aVar.run();
            }
            hVar.R = false;
            return true;
        }
    }

    public h(int i10, Context context, j.a aVar, Handler handler, j.e eVar) {
        super(context, aVar, handler, eVar);
        this.L = 0;
        this.Q = -1;
        this.R = true;
        this.U = false;
        this.V = false;
        this.W = null;
        this.X = null;
        this.Y = new ConditionVariable();
        this.Z = new a();
        this.f97553b = new TECameraSettings(context, i10);
        this.T = new com.ss.android.ttvecamera.focusmanager.a(context);
        this.K = com.ss.android.ttvecamera.hardware.d.c(context, i10);
    }

    private int U0(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return o.f97668c0;
        }
        if (reason == 2) {
            return o.f97670d0;
        }
        if (reason != 3) {
            return (reason == 4 || reason == 5) ? -406 : -401;
        }
        return o.f97672e0;
    }

    public static h V0(@TECameraSettings.e int i10, Context context, j.a aVar, Handler handler, j.e eVar) {
        return new h(i10, context, aVar, handler, eVar);
    }

    private void X0(int i10, CameraManager cameraManager) {
        s.a("TECamera2-fillWideCameraID");
        com.ss.android.ttvecamera.hardware.d dVar = this.K;
        if (dVar != null) {
            dVar.b(this.f97553b.f97076b, this.O);
        }
        s.b();
    }

    private List<TEFrameRateRange> a1() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f97463c) != null) {
            return p.j((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        }
        q.e(f97509a0, "getSupportedFpsRanges: camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getSupportedFpsRanges: camera is null.", this.P);
        return null;
    }

    @Override // com.ss.android.ttvecamera.j
    public void B0() {
        q.k(f97509a0, "stopCapture...");
        if (!N0()) {
            q.e(f97509a0, "Device is not ready.");
            return;
        }
        if (this.L != 3) {
            q.e(f97509a0, "Invalid state: " + this.L);
        }
        R0();
    }

    @Override // com.ss.android.ttvecamera.j
    public int C() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            return -1;
        }
        return tECameraModeBase.z();
    }

    @Override // com.ss.android.ttvecamera.j
    public int C0() {
        return this.S.c();
    }

    @Override // com.ss.android.ttvecamera.j
    public int D() {
        int iW = this.f97563l;
        if (iW < 0) {
            iW = p.w(this.f97558g);
        }
        this.f97560i = this.f97561j;
        CameraCharacteristics cameraCharacteristics = this.M;
        int iIntValue = cameraCharacteristics != null ? ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() : this.f97553b.f97082e;
        if (this.f97560i == 1) {
            int i10 = (iIntValue + iW) % 360;
            this.f97562k = i10;
            this.f97562k = ((360 - i10) + 180) % 360;
        } else {
            this.f97562k = ((iIntValue - iW) + 360) % 360;
        }
        return this.f97562k;
    }

    @Override // com.ss.android.ttvecamera.j
    public void E0(TECameraSettings.w wVar) {
    }

    @Override // com.ss.android.ttvecamera.j
    public void F0(int i10) {
        if (this.L == 3) {
            S0(i10);
            return;
        }
        q.u(f97509a0, "Invalid state: " + this.L);
    }

    @Override // com.ss.android.ttvecamera.j
    public int G() {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "getISO...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setISO operation.");
            return -1;
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.q();
        }
        q.u(f97509a0, "getISO : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getISO : camera is null.", this.P);
        return -1;
    }

    @Override // com.ss.android.ttvecamera.j
    public void G0(int i10) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "switchFlashMode: " + i10);
        if (this.L == 1) {
            TECameraModeBase tECameraModeBase2 = this.S;
            if (tECameraModeBase2 != null && (tECameraModeBase2 instanceof com.ss.android.ttvecamera.camera2.c)) {
                ((com.ss.android.ttvecamera.camera2.c) tECameraModeBase2).h2(i10);
                return;
            }
            q.e(f97509a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            q.u(f97509a0, "Camera is opening, ignore toggleTorch operation.");
            this.f97555d.g(this.f97553b.f97076b, o.H0, i10 == 0 ? 0 : 1, "Camera is opening, ignore toggleTorch operation.", this.P);
            return;
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.C(i10);
            return;
        }
        q.e(f97509a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
        q.e(f97509a0, "switch flash mode  failed, you must open camera first.");
        this.f97555d.g(this.f97553b.f97076b, o.H0, i10 == 0 ? 0 : 1, "switch flash mode  failed, you must open camera first.", this.P);
        this.f97555d.c(this.f97553b.f97076b, o.H0, "switch flash mode  failed, you must open camera first.", this.P);
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] H() {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "getISORange...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.b0();
        }
        q.u(f97509a0, "setWhileBalance : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "setWhileBalance : camera is null.", this.P);
        return new int[]{-1, -1};
    }

    @Override // com.ss.android.ttvecamera.j
    public void H0(int i10, int i11, TECameraSettings.r rVar) {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.L == 2) {
            q.b(f97509a0, "Camera is opened, ignore takePicture operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.e(i10, i11, rVar);
        } else {
            q.e(f97509a0, "takePicture : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "takePicture : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public float I() {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.a0();
        }
        q.e(f97509a0, "getManualFocusAbility : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getManualFocusAbility : camera is null.", this.P);
        return -1.0f;
    }

    @Override // com.ss.android.ttvecamera.j
    public void I0(TECameraSettings.r rVar) {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore takePicture operation.");
            return;
        }
        if (this.L == 2) {
            q.b(f97509a0, "Camera is opened, ignore takePicture operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.m(rVar, this.f97561j);
        } else {
            q.e(f97509a0, "takePicture : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "takePicture : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] J() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase != null) {
            return tECameraModeBase.K();
        }
        q.e(f97509a0, "get picture size failed, no mode...");
        return null;
    }

    @Override // com.ss.android.ttvecamera.j
    public void J0(boolean z10) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "toggleTorch: " + z10);
        if (this.L == 1) {
            q.e(f97509a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            q.b(f97509a0, "Camera is opening, ignore toggleTorch operation.");
            this.f97555d.g(this.f97553b.f97076b, o.H0, z10 ? 1 : 0, "Camera is opening, ignore toggleTorch operation.", this.P);
        } else {
            if (N0() && (tECameraModeBase = this.S) != null) {
                tECameraModeBase.Z(z10);
                return;
            }
            q.e(f97509a0, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            q.u(f97509a0, "Toggle torch failed, you must open camera first.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "Toggle torch failed, you must open camera first.", this.P);
            this.f97555d.g(this.f97553b.f97076b, o.H0, z10 ? 1 : 0, "Toggle torch failed, you must open camera first.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] K() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.M();
    }

    @Override // com.ss.android.ttvecamera.j
    public void M0(float f10, TECameraSettings.w wVar) {
        TECameraModeBase tECameraModeBase;
        if (this.L != 3) {
            q.e(f97509a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f97555d.c(this.f97553b.f97076b, o.f97692o0, "Invalid state, state = " + this.L, this.P);
            return;
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.y(f10, wVar);
        } else {
            q.e(f97509a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "zoomV2 : Camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public long[] N() {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "getShutterTimeRange...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.s();
        }
        q.u(f97509a0, "getShutterTimeRange : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getShutterTimeRange : camera is null.", this.P);
        return new long[]{-1, -1};
    }

    protected boolean N0() {
        return this.P != null;
    }

    @Override // com.ss.android.ttvecamera.j
    public List<TEFrameSizei> O() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "getSupportedPictureSizes: camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "getSupportedPictureSizes: camera is null.", this.P);
            return null;
        }
        if (this.X == null) {
            if (tECameraModeBase.f97474n == null) {
                tECameraModeBase.f97474n = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.X = p.l(this.S.f97474n.getOutputSizes(256));
        }
        return this.X;
    }

    @SuppressLint({"MissingPermission"})
    protected int O0(Cert cert) throws Exception {
        s.a("TECamera2-_open");
        if (this.O == null) {
            CameraManager cameraManager = (CameraManager) this.f97558g.getSystemService("camera");
            this.O = cameraManager;
            if (cameraManager == null) {
                return -407;
            }
        }
        int i10 = this.f97553b.B;
        if (i10 == 0) {
            W0();
        } else if (i10 == 1) {
            com.ss.android.ttvecamera.camera2.c cVar = new com.ss.android.ttvecamera.camera2.c(this, this.f97558g, this.O, this.f97557f);
            this.S = cVar;
            cVar.w(this.f97566o);
            this.S.G(this.f97568q);
        } else {
            this.S = new com.ss.android.ttvecamera.armode.b(this, this.f97558g, this.O, this.f97557f);
            this.f97555d.e(117, 0, "enable arcore", this.P);
        }
        this.S.B(this.f97567p);
        Handler handlerQ0 = this.f97553b.f97094k ? this.S.q0() : this.f97557f;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
            ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).J0(this.f97558g, handlerQ0);
        }
        TECameraSettings tECameraSettings = this.f97553b;
        tECameraSettings.H = e1(tECameraSettings.f97080d);
        TECameraSettings tECameraSettings2 = this.f97553b;
        String str = tECameraSettings2.H;
        if (str == null) {
            q.e(f97509a0, "Invalid CameraID");
            return -405;
        }
        int iL = this.S.l(str, this.R ? tECameraSettings2.D : 0);
        if (iL != 0) {
            return iL;
        }
        T0();
        l();
        X0(this.f97553b.f97076b, this.O);
        this.f97555d.e(1, 0, "TECamera2 features is ready", this.P);
        if (this.f97553b.f97094k) {
            try {
                this.P = null;
                i.c(cert, this.O, this.f97553b.H, this.Z, handlerQ0);
                if (this.P == null) {
                    g1();
                }
            } catch (CameraAccessException e10) {
                int iU0 = U0(e10);
                e10.printStackTrace();
                c1();
                return iU0;
            }
        } else {
            try {
                this.f97555d.e(106, 0, "will start camera2", null);
                i.c(cert, this.O, this.f97553b.H, this.Z, handlerQ0);
            } catch (CameraAccessException e11) {
                int iU1 = U0(e11);
                e11.printStackTrace();
                return iU1;
            }
        }
        s.b();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.j
    public List<TEFrameSizei> P() {
        CameraCharacteristics cameraCharacteristics;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "getSupportedPreviewSizes: camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "getSupportedPreviewSizes: camera is null.", this.P);
            return null;
        }
        if (this.W == null) {
            if (tECameraModeBase.f97474n == null) {
                tECameraModeBase.f97474n = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            this.W = p.l(this.S.f97474n.getOutputSizes(SurfaceTexture.class));
        }
        return this.W;
    }

    protected void P0(Cert cert) {
        try {
            this.S.reset();
            this.S.p();
            if (this.P != null) {
                this.f97555d.e(108, 0, "will close camera2", null);
                i.b(cert, this.P);
                this.f97555d.e(109, 0, "did close camera2", null);
                this.P = null;
                this.f97555d.i(2, this, this.P);
            }
        } catch (Throwable th2) {
            q.e(f97509a0, th2.getMessage());
        }
        f1(0);
        this.M = null;
        this.N = null;
        this.f97573v = null;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null || this.f97553b.B != 2) {
            return;
        }
        ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).H0();
    }

    protected int Q0() {
        s.a("TECamera2-_startCapture");
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            D0();
            this.f97555d.b(this.f97553b.f97076b, o.H0, "_startCapture : mode is null", this.P);
            return -1;
        }
        try {
            int iF = tECameraModeBase.F();
            if (iF != 0) {
                c1();
                this.f97555d.b(this.f97553b.f97076b, iF, "_startCapture : something wrong", this.P);
            }
            s.b();
            return iF;
        } catch (Exception e10) {
            int i10 = o.f97702t0;
            if (e10 instanceof CameraAccessException) {
                i10 = o.f97672e0;
            } else if (e10 instanceof IllegalArgumentException) {
                i10 = -402;
            } else if (e10 instanceof IllegalStateException) {
                i10 = o.f97670d0;
            }
            c1();
            e10.printStackTrace();
            m.a(e10);
            this.f97555d.b(this.f97553b.f97076b, i10, "_startCapture : mode is null, err msg: " + e10.getMessage(), this.P);
            return i10;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean R() {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        q.k(f97509a0, "isAutoExposureLockSupported...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        }
        if (!N0() || (tECameraModeBase = this.S) == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "isAutoExposureLockSupported : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "isAutoExposureLockSupported : camera is null.", this.P);
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected int R0() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            this.f97555d.c(this.f97553b.f97076b, o.H0, "_stopCapture : mode is null", this.P);
            return -1;
        }
        try {
            tECameraModeBase.p();
            this.f97555d.d(2, 4, 0, "TECamera2 preview stoped", this.P);
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f97555d.c(this.f97553b.f97076b, o.f97702t0, "Error:_stopCapture : mode is null", this.P);
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean S() {
        return true;
    }

    protected void S0(int i10) {
        if (this.S == null) {
            return;
        }
        R0();
        if (i10 == 0) {
            W0();
        } else if (i10 == 1) {
            com.ss.android.ttvecamera.camera2.c cVar = new com.ss.android.ttvecamera.camera2.c(this, this.f97558g, this.O, this.f97557f);
            this.S = cVar;
            cVar.w(this.f97566o);
            this.S.B(this.f97567p);
            this.S.G(this.f97568q);
        } else {
            this.S = new com.ss.android.ttvecamera.armode.b(this, this.f97558g, this.O, this.f97557f);
        }
        Handler handlerQ0 = this.f97553b.f97094k ? this.S.q0() : this.f97557f;
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase instanceof com.ss.android.ttvecamera.armode.b) {
            ((com.ss.android.ttvecamera.armode.b) tECameraModeBase).J0(this.f97558g, handlerQ0);
        }
        try {
            TECameraSettings tECameraSettings = this.f97553b;
            tECameraSettings.H = e1(tECameraSettings.f97080d);
            TECameraSettings tECameraSettings2 = this.f97553b;
            String str = tECameraSettings2.H;
            if (str == null || this.S.l(str, tECameraSettings2.D) != 0) {
                return;
            }
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
        }
        this.S.O(this.P);
        Q0();
    }

    protected void T0() {
        TECameraSettings tECameraSettings = this.f97553b;
        tECameraSettings.f97103o0 = tECameraSettings.f97103o0 && tECameraSettings.f97076b == 2 && tECameraSettings.B == 0 && this.K.p(this.S.f97463c, 1);
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean U() {
        return true;
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean V() {
        TECameraModeBase tECameraModeBase;
        q.k(f97509a0, "isSupportedExposureCompensation...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (N0() && (tECameraModeBase = this.S) != null && tECameraModeBase.f97463c != null) {
            return this.f97553b.K.a();
        }
        q.e(f97509a0, "isSupportedExposureCompensation : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "isSupportedExposureCompensation : camera is null.", this.P);
        return false;
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean W() {
        TECameraModeBase tECameraModeBase;
        if (!N0() || (tECameraModeBase = this.S) == null || tECameraModeBase.f97463c == null) {
            q.u(f97509a0, "Query torch info failed, you must open camera first.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "Query torch info failed, you must open camera first.", this.P);
            return false;
        }
        if (this.K == null) {
            q.e(f97509a0, "DeviceProxy is null!");
            this.f97555d.c(this.f97553b.f97076b, o.f97686l0, "", this.P);
            return false;
        }
        Bundle bundle = B().get(this.f97553b.H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(TECameraSettings.k.f97154t, false);
    }

    protected void W0() {
        q.b(f97509a0, "create TEVideo2Mode");
        this.S = new com.ss.android.ttvecamera.camera2.f(this, this.f97558g, this.O, this.f97557f);
    }

    @Override // com.ss.android.ttvecamera.j
    public int X(int i10, int i11, int i12, int i13, int i14, boolean z10, Cert cert) {
        q.b(f97509a0, "open...");
        TECameraSettings tECameraSettings = this.f97553b;
        tECameraSettings.f97080d = i10;
        TEFrameSizei tEFrameSizei = tECameraSettings.f97106q;
        tEFrameSizei.f97206b = i11;
        tEFrameSizei.f97207c = i12;
        tECameraSettings.f97078c.f97204c = i13;
        tECameraSettings.D = i14;
        return Y(tECameraSettings, cert);
    }

    @Override // com.ss.android.ttvecamera.j
    public int Y(TECameraSettings tECameraSettings, Cert cert) {
        s.a("TECamera2-open");
        super.Y(tECameraSettings, cert);
        this.f97573v = cert;
        this.f97553b = tECameraSettings;
        if (this.L == 4) {
            P0(cert);
        }
        try {
            f1(1);
            int iO0 = O0(cert);
            this.f97561j = tECameraSettings.f97080d;
            q.k(f97509a0, "open: camera face = " + this.f97561j + ", ret: " + iO0);
            if (iO0 == 0) {
                this.V = tECameraSettings.Q;
                s.b();
                return 0;
            }
            f1(0);
            P0(cert);
            j.a aVar = this.f97555d;
            if (aVar == null) {
                return -1;
            }
            aVar.f(tECameraSettings.f97076b, iO0, null, this.P);
            return -1;
        } catch (Throwable th2) {
            q.e(f97509a0, "open: camera face = " + this.f97561j + " failed: " + th2.getMessage());
            int iU0 = -401;
            if (th2 instanceof CameraAccessException) {
                iU0 = U0(th2);
            } else if (th2 instanceof IllegalArgumentException) {
                iU0 = -405;
            } else if (th2 instanceof SecurityException) {
                iU0 = o.f97668c0;
            }
            f1(4);
            P0(cert);
            j.a aVar2 = this.f97555d;
            if (aVar2 != null) {
                aVar2.f(tECameraSettings.f97076b, iU0, null, this.P);
            }
            return iU0;
        }
    }

    public com.ss.android.ttvecamera.focusmanager.a Y0() {
        return this.T;
    }

    public int Z0() {
        return this.L;
    }

    @Override // com.ss.android.ttvecamera.j
    public void a() {
        if (!N0()) {
            q.e(f97509a0, "Device is not ready.");
            return;
        }
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase != null) {
            tECameraModeBase.f();
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void b0(TECameraSettings.t tVar) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!N0() || (tECameraModeBase = this.S) == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "queryShaderZoomStep: camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "queryShaderZoomStep: camera is null.", this.P);
            return;
        }
        com.ss.android.ttvecamera.hardware.d dVar = this.K;
        if (dVar == null) {
            q.e(f97509a0, "DeviceProxy is null!");
            this.f97555d.c(this.f97553b.f97076b, o.f97692o0, "", this.P);
        } else {
            float fG = dVar.g(cameraCharacteristics);
            if (tVar != null) {
                tVar.a(fG);
            }
        }
    }

    protected boolean b1() {
        com.ss.android.ttvecamera.hardware.d dVar = this.K;
        return dVar != null && dVar.z();
    }

    @Override // com.ss.android.ttvecamera.j
    public void c() {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.a();
        } else {
            q.e(f97509a0, "cancelFocus : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "cancelFocus : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void c0(TECameraSettings.w wVar, boolean z10) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        if (!N0() || (tECameraModeBase = this.S) == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "queryZoomAbility: camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "queryZoomAbility: camera is null.", this.P);
            return;
        }
        com.ss.android.ttvecamera.hardware.d dVar = this.K;
        if (dVar == null) {
            q.e(f97509a0, "DeviceProxy is null!");
            this.f97555d.c(this.f97553b.f97076b, o.f97692o0, "", this.P);
            return;
        }
        TECameraSettings tECameraSettings = this.f97553b;
        float f10 = dVar.f(cameraCharacteristics, tECameraSettings.f97076b, tECameraSettings.f97104p);
        this.f97564m = f10;
        q.b(f97509a0, "zoom: " + f10 + ", factor = " + this.f97553b.f97104p);
        if (wVar != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f10)));
            wVar.onZoomSupport(this.f97553b.f97076b, f10 > 0.0f, false, f10, arrayList);
        }
    }

    public void c1() {
        if (this.f97553b.f97094k) {
            this.Y.open();
            q.k(f97509a0, "open camera-operation lock");
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void d(rg.a aVar, TECameraSettings.f fVar) {
        this.S.Q(aVar, this.f97561j, fVar);
    }

    public void d1() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase != null) {
            tECameraModeBase.r();
        }
    }

    protected String e1(@TECameraSettings.c int i10) throws CameraAccessException {
        return this.S.R(this.f97553b.f97080d);
    }

    @Override // com.ss.android.ttvecamera.j
    public void f(Cert cert) {
        q.b(f97509a0, "close...");
        if (this.L == 1) {
            if (this.V) {
                this.U = true;
            }
        } else {
            P0(cert);
            TECameraModeBase tECameraModeBase = this.S;
            if (tECameraModeBase != null) {
                tECameraModeBase.close();
            }
        }
    }

    public void f1(int i10) {
        if (this.L == i10) {
            q.u(f97509a0, "No need update state: " + i10);
            return;
        }
        q.k(f97509a0, "[updateSessionState]: " + this.L + " -> " + i10);
        this.L = i10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ad A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, LOOP:7: B:100:0x02ab->B:101:0x02ad, LOOP_END, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d5 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02df A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02f7 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0301 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, LOOP:8: B:114:0x02fb->B:116:0x0301, LOOP_END, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0332 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x033f A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0349 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x035b A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x03b2 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x03bc A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, LOOP:11: B:145:0x03b6->B:147:0x03bc, LOOP_END, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x03f7 A[LOOP:0: B:164:0x03f1->B:166:0x03f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[Catch: JSONException -> 0x03d2, CameraAccessException -> 0x03da, TryCatch #5 {CameraAccessException -> 0x03da, JSONException -> 0x03d2, blocks: (B:8:0x0022, B:16:0x0055, B:18:0x0064, B:21:0x007d, B:25:0x0096, B:53:0x014d, B:55:0x0157, B:57:0x015d, B:59:0x0160, B:62:0x0170, B:64:0x0186), top: B:171:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[Catch: JSONException -> 0x03d2, CameraAccessException -> 0x03da, TryCatch #5 {CameraAccessException -> 0x03da, JSONException -> 0x03d2, blocks: (B:8:0x0022, B:16:0x0055, B:18:0x0064, B:21:0x007d, B:25:0x0096, B:53:0x014d, B:55:0x0157, B:57:0x015d, B:59:0x0160, B:62:0x0170, B:64:0x0186), top: B:171:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TRY_ENTER, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, LOOP:2: B:28:0x00b0->B:29:0x00b2, LOOP_END, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0125 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0136 A[Catch: JSONException -> 0x0049, CameraAccessException -> 0x004f, TRY_LEAVE, TryCatch #4 {CameraAccessException -> 0x004f, JSONException -> 0x0049, blocks: (B:10:0x002f, B:27:0x00a7, B:29:0x00b2, B:30:0x00c2, B:31:0x00cc, B:33:0x00d2, B:35:0x00e2, B:37:0x00e8, B:39:0x00f5, B:41:0x0110, B:42:0x011d, B:44:0x0125, B:45:0x012e, B:47:0x0136, B:61:0x0168), top: B:173:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:55:0x0157 A[Catch: JSONException -> 0x03d2, CameraAccessException -> 0x03da, TryCatch #5 {CameraAccessException -> 0x03da, JSONException -> 0x03d2, blocks: (B:8:0x0022, B:16:0x0055, B:18:0x0064, B:21:0x007d, B:25:0x0096, B:53:0x014d, B:55:0x0157, B:57:0x015d, B:59:0x0160, B:62:0x0170, B:64:0x0186), top: B:171:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, LOOP:5: B:77:0x01ea->B:78:0x01ec, LOOP_END, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x021d  */
    /* JADX WARN: Code duplicated, block: B:83:0x022f A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0252 A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, LOOP:6: B:89:0x0250->B:90:0x0252, LOOP_END, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x028a A[Catch: JSONException -> 0x03ce, CameraAccessException -> 0x03d0, TryCatch #6 {CameraAccessException -> 0x03d0, JSONException -> 0x03ce, blocks: (B:119:0x0317, B:66:0x0195, B:67:0x01b1, B:69:0x01bb, B:71:0x01c9, B:72:0x01d1, B:74:0x01e5, B:76:0x01e8, B:78:0x01ec, B:79:0x0217, B:81:0x021f, B:83:0x022f, B:84:0x0237, B:86:0x024b, B:88:0x024e, B:90:0x0252, B:91:0x0275, B:92:0x027a, B:94:0x028a, B:95:0x0292, B:97:0x02a6, B:99:0x02a9, B:101:0x02ad, B:102:0x02b6, B:103:0x02bb, B:105:0x02c1, B:107:0x02c9, B:109:0x02d5, B:111:0x02df, B:113:0x02f7, B:114:0x02fb, B:116:0x0301, B:117:0x030f, B:118:0x0314, B:120:0x0323, B:122:0x0332, B:124:0x033f, B:125:0x0343, B:127:0x0349, B:128:0x0355, B:130:0x035b, B:133:0x036a, B:136:0x037b, B:141:0x038f, B:142:0x0393, B:144:0x03b2, B:145:0x03b6, B:147:0x03bc, B:148:0x03c6), top: B:169:0x0317 }] */
    @Override // com.ss.android.ttvecamera.j
    protected void g() {
        long j10;
        JSONException jSONException;
        CameraAccessException cameraAccessException;
        JSONArray jSONArray;
        String[] cameraIdList;
        int length;
        int i10;
        Set<Set> concurrentCameraIds;
        ArrayList arrayList;
        JSONArray jSONArray2;
        Iterator it;
        Iterator it2;
        boolean z10;
        boolean z11;
        CameraCharacteristics cameraCharacteristics;
        String str;
        JSONObject jSONObject;
        CameraCharacteristics cameraCharacteristics2;
        int i11;
        int[] iArr;
        int i12;
        StreamConfigurationMap streamConfigurationMap;
        Range[] rangeArr;
        TECameraCapabilityCollector.Capability capability;
        JSONArray jSONArray3;
        float[] fArr;
        TECameraCapabilityCollector.Capability capability2;
        JSONArray jSONArray4;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        List<Integer> supportedExtensions;
        TECameraCapabilityCollector.Capability capability3;
        JSONArray jSONArray5;
        Iterator<Integer> it3;
        int i13;
        int length2;
        int i14;
        Range<Integer>[] highSpeedVideoFpsRanges;
        Size[] outputSizes;
        TECameraCapabilityCollector.Capability capability4;
        JSONArray jSONArray6;
        int length3;
        int i15;
        ArrayList arrayList2;
        int length4;
        int i16;
        Iterator<Integer> it4;
        Integer next;
        TECameraCapabilityCollector.Capability capability5;
        int i17;
        String str2 = "camera_id";
        s.a("TECamera2-collectCameraCapabilities");
        if (!T()) {
            s.b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        if (this.O != null) {
            try {
                this.f97575x.putOpt("camera_id", this.f97553b.H);
                com.ss.android.ttvecamera.hardware.d dVar = this.K;
                if (dVar != null) {
                    try {
                        CameraCharacteristics cameraCharacteristics3 = this.S.f97463c;
                        TECameraSettings tECameraSettings = this.f97553b;
                        this.f97575x.putOpt("camera_zoom_max_ability", Float.valueOf(dVar.f(cameraCharacteristics3, tECameraSettings.f97076b, tECameraSettings.f97104p)));
                        jSONArray = new JSONArray();
                        cameraIdList = this.O.getCameraIdList();
                        length = cameraIdList.length;
                        i10 = 0;
                        while (i10 < length) {
                            str = cameraIdList[i10];
                            jSONObject = new JSONObject();
                            cameraCharacteristics2 = this.O.getCameraCharacteristics(str);
                            if (cameraCharacteristics2 == null) {
                                j10 = jCurrentTimeMillis;
                                cameraIdList = cameraIdList;
                                i12 = length;
                            } else {
                                jSONObject.putOpt(str2, str);
                                if (((Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                    i11 = 0;
                                } else {
                                    i11 = 1;
                                }
                                jSONObject.putOpt("camera_facing", Integer.valueOf(i11));
                                iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                                if (iArr != null) {
                                    arrayList2 = new ArrayList();
                                    length4 = iArr.length;
                                    i16 = 0;
                                    while (i16 < length4) {
                                        arrayList2.add(Integer.valueOf(iArr[i16]));
                                        i16++;
                                        iArr = iArr;
                                    }
                                    it4 = TECameraCapabilityCollector.f97390d.keySet().iterator();
                                    while (it4.hasNext()) {
                                        next = it4.next();
                                        capability5 = TECameraCapabilityCollector.f97390d.get(next);
                                        if (capability5 != null) {
                                            if (map.get(capability5) == null) {
                                                map.put(capability5, new HashMap());
                                            }
                                            i17 = length;
                                            ((Map) map.get(capability5)).put(str, Boolean.valueOf(arrayList2.contains(next)));
                                            if (capability5.equals(TECameraCapabilityCollector.Capability.DEPTH_OUTPUT)) {
                                                jSONObject.putOpt("depth_out_put", Boolean.valueOf(arrayList2.contains(next)));
                                            }
                                            if (capability5.equals(TECameraCapabilityCollector.Capability.MANUAL_3A)) {
                                                jSONObject.put("manual_3A", arrayList2.contains(next));
                                            }
                                            if (capability5.equals(TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA)) {
                                                jSONObject.put("logical_multi_Camera", arrayList2.contains(next));
                                            }
                                        } else {
                                            it4 = it4;
                                            i17 = length;
                                        }
                                        it4 = it4;
                                        length = i17;
                                    }
                                }
                                i12 = length;
                                streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                if (streamConfigurationMap != null) {
                                    highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                                    if (highSpeedVideoFpsRanges != null || highSpeedVideoFpsRanges.length == 0) {
                                        j10 = jCurrentTimeMillis;
                                    } else {
                                        TECameraCapabilityCollector.Capability capability6 = TECameraCapabilityCollector.Capability.HIGH_SPEED_VIDEO_FPS_RANGE;
                                        if (map.get(capability6) == null) {
                                            map.put(capability6, new HashMap());
                                        }
                                        ((Map) map.get(capability6)).put(str, Arrays.toString(highSpeedVideoFpsRanges));
                                        JSONArray jSONArray7 = new JSONArray();
                                        int length5 = highSpeedVideoFpsRanges.length;
                                        int i18 = 0;
                                        while (i18 < length5) {
                                            Range<Integer> range = highSpeedVideoFpsRanges[i18];
                                            Range<Integer>[] rangeArr2 = highSpeedVideoFpsRanges;
                                            JSONObject jSONObject2 = new JSONObject();
                                            int i19 = length5;
                                            long j11 = jCurrentTimeMillis;
                                            jSONObject2.putOpt("high_fps_min", range.getLower());
                                            jSONObject2.putOpt("high_fps_max", range.getUpper());
                                            jSONArray7.put(jSONObject2);
                                            i18++;
                                            highSpeedVideoFpsRanges = rangeArr2;
                                            length5 = i19;
                                            jCurrentTimeMillis = j11;
                                        }
                                        j10 = jCurrentTimeMillis;
                                        jSONObject.putOpt("high_speed_fps_range", jSONArray7);
                                    }
                                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                                    capability4 = TECameraCapabilityCollector.Capability.PREVIEW_SIZE;
                                    if (map.get(capability4) == null) {
                                        map.put(capability4, new HashMap());
                                    }
                                    ((Map) map.get(capability4)).put(str, Arrays.toString(outputSizes));
                                    jSONArray6 = new JSONArray();
                                    if (outputSizes != null && outputSizes.length > 0) {
                                        length3 = outputSizes.length;
                                        i15 = 0;
                                        while (i15 < length3) {
                                            Size size = outputSizes[i15];
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.putOpt("width", Integer.valueOf(size.getWidth()));
                                            jSONObject3.putOpt("height", Integer.valueOf(size.getHeight()));
                                            jSONArray6.put(jSONObject3);
                                            i15++;
                                            outputSizes = outputSizes;
                                        }
                                        jSONObject.putOpt("preview_size_list", jSONArray6);
                                    }
                                } else {
                                    j10 = jCurrentTimeMillis;
                                }
                                rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                                capability = TECameraCapabilityCollector.Capability.FPS_RANGE;
                                if (map.get(capability) == null) {
                                    map.put(capability, new HashMap());
                                }
                                ((Map) map.get(capability)).put(str, Arrays.toString(rangeArr));
                                jSONArray3 = new JSONArray();
                                if (rangeArr != null && rangeArr.length > 0) {
                                    length2 = rangeArr.length;
                                    i14 = 0;
                                    while (i14 < length2) {
                                        Range range2 = rangeArr[i14];
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.putOpt("fps_min", range2.getLower());
                                        jSONObject4.putOpt("fps_high", range2.getUpper());
                                        jSONArray3.put(jSONObject4);
                                        i14++;
                                        rangeArr = rangeArr;
                                    }
                                    jSONObject.putOpt("fps_range_List", jSONArray3);
                                }
                                fArr = (float[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                                capability2 = TECameraCapabilityCollector.Capability.SUPPORT_APERTURES;
                                if (map.get(capability2) == null) {
                                    map.put(capability2, new HashMap());
                                }
                                ((Map) map.get(capability2)).put(str, Arrays.toString(fArr));
                                jSONArray4 = new JSONArray();
                                if (fArr != null && fArr.length > 0) {
                                    for (float f10 : fArr) {
                                        jSONArray4.put(f10);
                                    }
                                    jSONObject.putOpt("support_apertures", jSONArray4);
                                }
                                if (Build.VERSION.SDK_INT >= 31 && (cameraExtensionCharacteristics = this.O.getCameraExtensionCharacteristics(str)) != null) {
                                    supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
                                    capability3 = TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS;
                                    if (map.get(capability3) == null) {
                                        map.put(capability3, new HashMap());
                                    }
                                    if (supportedExtensions != null) {
                                        ((Map) map.get(capability3)).put(str, supportedExtensions.toString());
                                        jSONArray5 = new JSONArray();
                                        if (supportedExtensions.size() > 0) {
                                            it3 = supportedExtensions.iterator();
                                            while (it3.hasNext()) {
                                                jSONArray5.put(it3.next().intValue());
                                            }
                                            jSONObject.putOpt("support_extensions", jSONArray5);
                                        }
                                    }
                                }
                                jSONArray.put(jSONObject);
                            }
                            try {
                                i10++;
                                str2 = str2;
                                cameraIdList = cameraIdList;
                                length = i12;
                                jCurrentTimeMillis = j10;
                            } catch (CameraAccessException e10) {
                                e = e10;
                                cameraAccessException = e;
                                q.u(f97509a0, "Get Camera Capbilities failed!");
                                cameraAccessException.printStackTrace();
                                for (Map.Entry entry : map.entrySet()) {
                                    TECameraCapabilityCollector.Capability capability7 = (TECameraCapabilityCollector.Capability) entry.getKey();
                                    Object value = entry.getValue();
                                    TECameraCapabilityCollector tECameraCapabilityCollector = this.f97574w;
                                    tECameraCapabilityCollector.a(new TECameraCapabilityCollector.a(capability7, tECameraCapabilityCollector.b(capability7), value.toString()));
                                }
                                this.f97574w.d();
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
                                q.k(f97509a0, "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
                                n.b(n.f97660x, jCurrentTimeMillis2);
                                this.f97576y = true;
                                s.b();
                            } catch (JSONException e11) {
                                e = e11;
                                jSONException = e;
                                jSONException.printStackTrace();
                                while (r2.hasNext()) {
                                    TECameraCapabilityCollector.Capability capability8 = (TECameraCapabilityCollector.Capability) entry.getKey();
                                    Object value2 = entry.getValue();
                                    TECameraCapabilityCollector tECameraCapabilityCollector2 = this.f97574w;
                                    tECameraCapabilityCollector2.a(new TECameraCapabilityCollector.a(capability8, tECameraCapabilityCollector2.b(capability8), value2.toString()));
                                }
                                this.f97574w.d();
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - j10;
                                q.k(f97509a0, "collectCameraCapabilities consume: " + jCurrentTimeMillis3);
                                n.b(n.f97660x, jCurrentTimeMillis3);
                                this.f97576y = true;
                                s.b();
                            }
                        }
                        j10 = jCurrentTimeMillis;
                        this.f97575x.putOpt("camera_feature", jSONArray);
                        if (Build.VERSION.SDK_INT >= 30) {
                            concurrentCameraIds = this.O.getConcurrentCameraIds();
                            arrayList = new ArrayList();
                            if (concurrentCameraIds != null) {
                                for (Set set : concurrentCameraIds) {
                                    it2 = set.iterator();
                                    z10 = false;
                                    z11 = false;
                                    while (it2.hasNext()) {
                                        cameraCharacteristics = this.O.getCameraCharacteristics((String) it2.next());
                                        if (cameraCharacteristics != null) {
                                            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                                z11 = true;
                                            } else if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    if (!z10 && z11) {
                                        arrayList.add(set);
                                    }
                                }
                                TECameraCapabilityCollector.Capability capability9 = TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS;
                                TECameraCapabilityCollector tECameraCapabilityCollector3 = this.f97574w;
                                tECameraCapabilityCollector3.a(new TECameraCapabilityCollector.a(capability9, tECameraCapabilityCollector3.b(capability9), arrayList.toString()));
                                jSONArray2 = new JSONArray();
                                if (arrayList.size() > 0) {
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((Set) it.next());
                                    }
                                    this.f97575x.putOpt("camera_front_back_multicam_combos", jSONArray2);
                                }
                            }
                        }
                    } catch (CameraAccessException e12) {
                        cameraAccessException = e12;
                        j10 = jCurrentTimeMillis;
                        q.u(f97509a0, "Get Camera Capbilities failed!");
                        cameraAccessException.printStackTrace();
                    } catch (JSONException e13) {
                        jSONException = e13;
                        j10 = jCurrentTimeMillis;
                        jSONException.printStackTrace();
                    }
                } else {
                    jSONArray = new JSONArray();
                    cameraIdList = this.O.getCameraIdList();
                    length = cameraIdList.length;
                    i10 = 0;
                    while (i10 < length) {
                        str = cameraIdList[i10];
                        jSONObject = new JSONObject();
                        cameraCharacteristics2 = this.O.getCameraCharacteristics(str);
                        if (cameraCharacteristics2 == null) {
                            j10 = jCurrentTimeMillis;
                            cameraIdList = cameraIdList;
                            i12 = length;
                        } else {
                            jSONObject.putOpt(str2, str);
                            if (((Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            jSONObject.putOpt("camera_facing", Integer.valueOf(i11));
                            iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                            if (iArr != null) {
                                arrayList2 = new ArrayList();
                                length4 = iArr.length;
                                i16 = 0;
                                while (i16 < length4) {
                                    arrayList2.add(Integer.valueOf(iArr[i16]));
                                    i16++;
                                    iArr = iArr;
                                }
                                it4 = TECameraCapabilityCollector.f97390d.keySet().iterator();
                                while (it4.hasNext()) {
                                    next = it4.next();
                                    capability5 = TECameraCapabilityCollector.f97390d.get(next);
                                    if (capability5 != null) {
                                        if (map.get(capability5) == null) {
                                            map.put(capability5, new HashMap());
                                        }
                                        i17 = length;
                                        ((Map) map.get(capability5)).put(str, Boolean.valueOf(arrayList2.contains(next)));
                                        if (capability5.equals(TECameraCapabilityCollector.Capability.DEPTH_OUTPUT)) {
                                            jSONObject.putOpt("depth_out_put", Boolean.valueOf(arrayList2.contains(next)));
                                        }
                                        if (capability5.equals(TECameraCapabilityCollector.Capability.MANUAL_3A)) {
                                            jSONObject.put("manual_3A", arrayList2.contains(next));
                                        }
                                        if (capability5.equals(TECameraCapabilityCollector.Capability.LOGICAL_MULTI_CAMERA)) {
                                            jSONObject.put("logical_multi_Camera", arrayList2.contains(next));
                                        }
                                    } else {
                                        it4 = it4;
                                        i17 = length;
                                    }
                                    it4 = it4;
                                    length = i17;
                                }
                            }
                            i12 = length;
                            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                            if (streamConfigurationMap != null) {
                                highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                                if (highSpeedVideoFpsRanges != null) {
                                    j10 = jCurrentTimeMillis;
                                } else {
                                    j10 = jCurrentTimeMillis;
                                }
                                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                                capability4 = TECameraCapabilityCollector.Capability.PREVIEW_SIZE;
                                if (map.get(capability4) == null) {
                                    map.put(capability4, new HashMap());
                                }
                                ((Map) map.get(capability4)).put(str, Arrays.toString(outputSizes));
                                jSONArray6 = new JSONArray();
                                if (outputSizes != null) {
                                    length3 = outputSizes.length;
                                    i15 = 0;
                                    while (i15 < length3) {
                                        Size size2 = outputSizes[i15];
                                        JSONObject jSONObject5 = new JSONObject();
                                        jSONObject5.putOpt("width", Integer.valueOf(size2.getWidth()));
                                        jSONObject5.putOpt("height", Integer.valueOf(size2.getHeight()));
                                        jSONArray6.put(jSONObject5);
                                        i15++;
                                        outputSizes = outputSizes;
                                    }
                                    jSONObject.putOpt("preview_size_list", jSONArray6);
                                }
                            } else {
                                j10 = jCurrentTimeMillis;
                            }
                            rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                            capability = TECameraCapabilityCollector.Capability.FPS_RANGE;
                            if (map.get(capability) == null) {
                                map.put(capability, new HashMap());
                            }
                            ((Map) map.get(capability)).put(str, Arrays.toString(rangeArr));
                            jSONArray3 = new JSONArray();
                            if (rangeArr != null) {
                                length2 = rangeArr.length;
                                i14 = 0;
                                while (i14 < length2) {
                                    Range range3 = rangeArr[i14];
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.putOpt("fps_min", range3.getLower());
                                    jSONObject6.putOpt("fps_high", range3.getUpper());
                                    jSONArray3.put(jSONObject6);
                                    i14++;
                                    rangeArr = rangeArr;
                                }
                                jSONObject.putOpt("fps_range_List", jSONArray3);
                            }
                            fArr = (float[]) cameraCharacteristics2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                            capability2 = TECameraCapabilityCollector.Capability.SUPPORT_APERTURES;
                            if (map.get(capability2) == null) {
                                map.put(capability2, new HashMap());
                            }
                            ((Map) map.get(capability2)).put(str, Arrays.toString(fArr));
                            jSONArray4 = new JSONArray();
                            if (fArr != null) {
                                while (i13 < r4) {
                                    jSONArray4.put(f10);
                                }
                                jSONObject.putOpt("support_apertures", jSONArray4);
                            }
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
                                capability3 = TECameraCapabilityCollector.Capability.SUPPORT_EXTENSIONS;
                                if (map.get(capability3) == null) {
                                    map.put(capability3, new HashMap());
                                }
                                if (supportedExtensions != null) {
                                    ((Map) map.get(capability3)).put(str, supportedExtensions.toString());
                                    jSONArray5 = new JSONArray();
                                    if (supportedExtensions.size() > 0) {
                                        it3 = supportedExtensions.iterator();
                                        while (it3.hasNext()) {
                                            jSONArray5.put(it3.next().intValue());
                                        }
                                        jSONObject.putOpt("support_extensions", jSONArray5);
                                    }
                                }
                            }
                            jSONArray.put(jSONObject);
                        }
                        i10++;
                        str2 = str2;
                        cameraIdList = cameraIdList;
                        length = i12;
                        jCurrentTimeMillis = j10;
                    }
                    j10 = jCurrentTimeMillis;
                    this.f97575x.putOpt("camera_feature", jSONArray);
                    if (Build.VERSION.SDK_INT >= 30) {
                        concurrentCameraIds = this.O.getConcurrentCameraIds();
                        arrayList = new ArrayList();
                        if (concurrentCameraIds != null) {
                            while (r2.hasNext()) {
                                it2 = set.iterator();
                                z10 = false;
                                z11 = false;
                                while (it2.hasNext()) {
                                    cameraCharacteristics = this.O.getCameraCharacteristics((String) it2.next());
                                    if (cameraCharacteristics != null) {
                                        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                            z11 = true;
                                        } else if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                                            z10 = true;
                                        }
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            TECameraCapabilityCollector.Capability capability10 = TECameraCapabilityCollector.Capability.FRONT_BACK_MULTICAM_COMBOS;
                            TECameraCapabilityCollector tECameraCapabilityCollector4 = this.f97574w;
                            tECameraCapabilityCollector4.a(new TECameraCapabilityCollector.a(capability10, tECameraCapabilityCollector4.b(capability10), arrayList.toString()));
                            jSONArray2 = new JSONArray();
                            if (arrayList.size() > 0) {
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Set) it.next());
                                }
                                this.f97575x.putOpt("camera_front_back_multicam_combos", jSONArray2);
                            }
                        }
                    }
                }
            } catch (CameraAccessException e14) {
                e = e14;
                j10 = jCurrentTimeMillis;
            } catch (JSONException e15) {
                e = e15;
                j10 = jCurrentTimeMillis;
            }
        } else {
            j10 = jCurrentTimeMillis;
        }
        while (r2.hasNext()) {
            TECameraCapabilityCollector.Capability capability11 = (TECameraCapabilityCollector.Capability) entry.getKey();
            Object value3 = entry.getValue();
            TECameraCapabilityCollector tECameraCapabilityCollector5 = this.f97574w;
            tECameraCapabilityCollector5.a(new TECameraCapabilityCollector.a(capability11, tECameraCapabilityCollector5.b(capability11), value3.toString()));
        }
        this.f97574w.d();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - j10;
        q.k(f97509a0, "collectCameraCapabilities consume: " + jCurrentTimeMillis4);
        n.b(n.f97660x, jCurrentTimeMillis4);
        this.f97576y = true;
        s.b();
    }

    public void g1() {
        if (this.f97553b.f97094k) {
            this.Y.close();
            q.k(f97509a0, "block camera-operation start...");
            q.k(f97509a0, "block camera-operation end...result = " + this.Y.block(1000L));
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void i() {
        super.i();
        d1();
        this.T.g();
    }

    @Override // com.ss.android.ttvecamera.j
    public void i0(float f10) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "setAperture : " + f10);
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setAperture operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.N(f10);
        } else {
            q.u(f97509a0, "setAperture : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setAperture : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void j() {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.d();
        } else {
            q.e(f97509a0, "enableCaf : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "enableCaf : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void j0(boolean z10) {
        TECameraModeBase tECameraModeBase;
        CameraCharacteristics cameraCharacteristics;
        q.k(f97509a0, "setAutoExposureLock...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setAutoExposureLock operation.");
            return;
        }
        if (!N0() || (tECameraModeBase = this.S) == null || (cameraCharacteristics = tECameraModeBase.f97463c) == null) {
            q.e(f97509a0, "setAutoExposureLock : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setAutoExposureLock : camera is null.", this.P);
            return;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            this.S.I(z10);
        } else {
            q.u(f97509a0, "Current camera doesn't support auto exposure lock.");
            this.f97555d.e(o.f97704u0, o.f97704u0, "Current camera doesn't support auto exposure lock.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    protected void k(boolean z10) {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            q.e(f97509a0, "enableMulticamZoom failed, mode is null...");
        } else {
            tECameraModeBase.o0(z10);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void k0(boolean z10) {
        TECameraModeBase tECameraModeBase;
        q.k(f97509a0, "setAutoFocusLock...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setAutoFocusLock operation.");
            return;
        }
        if (N0() && (tECameraModeBase = this.S) != null && tECameraModeBase.f97463c != null) {
            tECameraModeBase.L(z10);
        } else {
            q.e(f97509a0, "setAutoFocusLock : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setAutoFocusLock : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    protected Bundle l() {
        CameraCharacteristics cameraCharacteristics;
        com.ss.android.ttvecamera.hardware.d dVar;
        s.a("TECamera2-fillFeatures");
        Bundle bundleL = super.l();
        if (bundleL != null) {
            bundleL.putParcelableArrayList(TECameraSettings.k.f97149o, (ArrayList) P());
            bundleL.putParcelableArrayList(TECameraSettings.k.f97150p, (ArrayList) O());
            bundleL.putParcelableArrayList(TECameraSettings.k.f97151q, (ArrayList) a1());
            TECameraModeBase tECameraModeBase = this.S;
            if (tECameraModeBase != null && (cameraCharacteristics = tECameraModeBase.f97463c) != null && (dVar = this.K) != null) {
                bundleL.putBoolean(TECameraSettings.k.A, dVar.q(cameraCharacteristics) && Build.VERSION.SDK_INT >= 30);
                bundleL.putBoolean(TECameraSettings.k.f97154t, this.K.B(this.S.f97463c));
            }
            bundleL.putInt(TECameraSettings.k.f97157w, b1() ? 1 : 0);
        }
        s.b();
        return bundleL;
    }

    @Override // com.ss.android.ttvecamera.j
    public void m(TEFocusSettings tEFocusSettings) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "setFocusAreas...");
        if (this.L != 3) {
            q.u(f97509a0, "Camera is not previewing, ignore setFocusAreas operation.");
            tEFocusSettings.g().a(0, this.f97553b.f97080d, "Camera is not previewing, ignore setFocusAreas operation.");
            return;
        }
        if (!N0() || (tECameraModeBase = this.S) == null) {
            q.e(f97509a0, "focusAtPoint : camera is null.");
            tEFocusSettings.g().a(o.H0, this.f97553b.f97080d, "focusAtPoint : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "focusAtPoint : camera is null.", this.P);
        } else {
            int iK = tECameraModeBase.k(tEFocusSettings);
            if (iK != 0) {
                q.e(f97509a0, "focusAtPoint : something wrong.");
                this.f97555d.e(o.f97674f0, iK, "focusAtPoint : something wrong.", this.P);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public boolean m0(int i10) {
        TECameraModeBase tECameraModeBase;
        q.k(f97509a0, "setExposureCompensation... value: " + i10);
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        }
        if (!N0() || (tECameraModeBase = this.S) == null || tECameraModeBase.f97463c == null) {
            q.e(f97509a0, "setExposureCompensation : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, -401, "setExposureCompensation : camera is null.", this.P);
            return false;
        }
        if (!this.f97553b.K.a()) {
            q.u(f97509a0, "Current camera doesn't support setting exposure compensation.");
            this.f97555d.e(o.f97680i0, o.f97680i0, "Current camera doesn't support setting exposure compensation.", this.P);
            return false;
        }
        TECameraSettings.h hVar = this.f97553b.K;
        if (i10 <= hVar.f97131a && i10 >= hVar.f97133c) {
            return this.S.h(i10);
        }
        String str = "Invalid exposure compensation value: " + i10 + ", it must between [" + this.f97553b.K.f97133c + ", " + this.f97553b.K.f97131a + "].";
        q.u(f97509a0, str);
        this.f97555d.e(o.f97682j0, o.f97682j0, str, this.P);
        return false;
    }

    @Override // com.ss.android.ttvecamera.j
    public void n(Cert cert) {
        super.n(cert);
        q.k(f97509a0, "force close camera: " + this.P);
        if (this.P != null) {
            i.b(cert, this.P);
            this.P = null;
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
            if (TECameraSettings.q.a(str, bundle.get(str)) && TECameraSettings.k.f97136b.equalsIgnoreCase(str)) {
                bundle2.putBoolean(TECameraSettings.k.f97136b, bundle.getBoolean(TECameraSettings.k.f97136b));
            }
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public float[] o() {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "getApertureRange...");
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.S();
        }
        q.u(f97509a0, "getApertureRange : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getApertureRange : camera is null.", this.P);
        return new float[]{-1.0f, -1.0f};
    }

    @Override // com.ss.android.ttvecamera.j
    public void o0(int i10) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "setISO : " + i10);
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setISO operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.x(i10);
        } else {
            q.u(f97509a0, "setISO : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setISO : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public TEFrameSizei p(float f10, TEFrameSizei tEFrameSizei) {
        if (this.L == 0 || this.L == 1) {
            q.e(f97509a0, "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase.f97474n == null) {
            tECameraModeBase.f97474n = (StreamConfigurationMap) tECameraModeBase.f97463c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        StreamConfigurationMap streamConfigurationMap = this.S.f97474n;
        if (!StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            q.e(f97509a0, "Output is not supported, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        j.f fVar = this.f97567p;
        TEFrameSizei previewSize = fVar != null ? fVar.getPreviewSize(arrayList) : null;
        if (previewSize == null) {
            return tEFrameSizei != null ? p.b(arrayList, tEFrameSizei) : p.c(arrayList, f10);
        }
        return previewSize;
    }

    @Override // com.ss.android.ttvecamera.j
    public void p0(float f10) {
        TECameraModeBase tECameraModeBase;
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.Y(f10);
        } else {
            q.e(f97509a0, "setManualFocusDistance : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setManualFocusDistance : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public JSONObject q() {
        return this.f97575x;
    }

    @Override // com.ss.android.ttvecamera.j
    public void q0(int i10, int i11) {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            q.e(f97509a0, "set picture size failed, no mode...");
        } else {
            tECameraModeBase.H(i10, i11);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int[] r() {
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            return null;
        }
        return tECameraModeBase.D();
    }

    @Override // com.ss.android.ttvecamera.j
    public void u0(int i10) {
        super.u0(i10);
        TECameraModeBase tECameraModeBase = this.S;
        if (tECameraModeBase == null) {
            q.e(f97509a0, "set scene failed, no mode...");
        } else {
            tECameraModeBase.v(i10);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public int v() {
        return 2;
    }

    @Override // com.ss.android.ttvecamera.j
    public void v0(long j10) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "setShutterTime : " + j10);
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setShutterTime operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.E(j10);
        } else {
            q.u(f97509a0, "setISO : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setISO : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void w0(boolean z10, String str) {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "setWhileBalance: " + str);
        if (this.L == 1) {
            q.u(f97509a0, "Camera is opening, ignore setWhileBalance operation.");
        } else if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.j(z10, str);
        } else {
            q.u(f97509a0, "setWhileBalance : camera is null.");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "setWhileBalance : camera is null.", this.P);
        }
    }

    @Override // com.ss.android.ttvecamera.j
    public void x0() {
        s.a("TECamera2-startCapture");
        q.b(f97509a0, "startCapture...");
        if (!N0() || this.f97559h == null) {
            q.e(f97509a0, "startCapture, Device is not ready.");
            return;
        }
        if (this.L != 2 && this.L != 3) {
            q.e(f97509a0, "startCapture, Invalid state: " + this.L);
            return;
        }
        try {
            this.f97553b.f97082e = D();
            q.k(f97509a0, "Camera rotation = " + this.f97553b.f97082e);
        } catch (Exception e10) {
            m.a(e10);
            P0(this.f97573v);
            j.a aVar = this.f97555d;
            if (aVar != null) {
                aVar.f(this.f97553b.f97076b, o.f97702t0, null, this.P);
            }
        }
        Q0();
        s.b();
    }

    @Override // com.ss.android.ttvecamera.j
    public float[] y() {
        TECameraModeBase tECameraModeBase;
        q.b(f97509a0, "getVFOV...");
        if (this.L == 1) {
            q.b(f97509a0, "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            return tECameraModeBase.t();
        }
        q.e(f97509a0, "getFOV : camera is null.");
        this.f97555d.c(this.f97553b.f97076b, o.H0, "getFOV : camera is null.", this.P);
        return new float[]{-2.0f, -2.0f};
    }

    @Override // com.ss.android.ttvecamera.j
    public int y0() {
        return this.S.A();
    }

    @Override // com.ss.android.ttvecamera.j
    public void z0(float f10, TECameraSettings.w wVar) {
        TECameraModeBase tECameraModeBase;
        if (this.L != 3) {
            q.e(f97509a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f97555d.e(o.f97692o0, o.f97692o0, "Invalid state, state = " + this.L, this.P);
            return;
        }
        if (N0() && (tECameraModeBase = this.S) != null) {
            tECameraModeBase.g(f10, wVar);
        } else {
            q.e(f97509a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.f97555d.c(this.f97553b.f97076b, o.H0, "startZoom : Camera is null.", this.P);
        }
    }
}
