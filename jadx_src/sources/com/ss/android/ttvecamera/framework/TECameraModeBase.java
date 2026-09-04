package com.ss.android.ttvecamera.framework;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.hardware.g;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import com.ss.android.ttvecamera.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public abstract class TECameraModeBase implements com.ss.android.ttvecamera.framework.a, com.ss.android.ttvecamera.focusmanager.b.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f97462a0 = "TECameraModeBase";
    protected int[] A;
    protected TEFocusSettings D;
    protected int F;
    private Rect I;
    protected boolean O;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CameraCharacteristics f97463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.ss.android.ttvecamera.hardware.d f97464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected CaptureRequest.Builder f97465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected volatile CameraCaptureSession f97466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected CameraManager f97467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected j.a f97468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected h f97469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected TECameraSettings f97470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.ss.android.ttvecamera.focusmanager.e f97471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected CameraDevice f97472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Handler f97473m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CaptureRequest f97475o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f97477q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected j.e f97483w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected j.b f97485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected j.g f97486z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StreamConfigurationMap f97474n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected AtomicBoolean f97476p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f97478r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f97479s = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Range<Float> f97480t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f97481u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Rect f97482v = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected j.f f97484x = null;
    protected int B = 0;
    protected CaptureRequest.Key<?> C = null;
    protected TEFrameRateRange E = new TEFrameRateRange(7, 30);
    protected Handler G = null;
    private HandlerThread H = null;
    protected volatile boolean J = false;
    protected long K = 0;
    protected long L = 0;
    protected long M = 0;
    protected int N = 0;
    private boolean P = false;
    protected volatile boolean Q = false;
    private Map<String, Integer> R = new HashMap<String, Integer>() { // from class: com.ss.android.ttvecamera.framework.TECameraModeBase.1
        {
            put("auto", 1);
            put(TECameraSettings.Y1, 2);
            put(TECameraSettings.Z1, 3);
            put(TECameraSettings.f97039a2, 4);
            put(TECameraSettings.f97041b2, 5);
            put(TECameraSettings.f97043c2, 6);
            put(TECameraSettings.f97045d2, 7);
            put(TECameraSettings.f97047e2, 8);
        }
    };
    protected HashMap<Integer, String> S = new HashMap<>();
    protected boolean T = false;
    protected boolean U = false;
    protected List<OutputConfiguration> V = new ArrayList();
    private Runnable W = new b();
    private final com.ss.android.ttvecamera.focusmanager.a.b X = new c();
    protected CameraCaptureSession.StateCallback Y = new d();
    protected CameraCaptureSession.CaptureCallback Z = new e();

    public class a implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f97488b;

        a(Handler handler) {
            this.f97488b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f97488b;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraModeBase.this.f97471k.a();
        }
    }

    public class c implements com.ss.android.ttvecamera.focusmanager.a.b {
        c() {
        }

        @Override // com.ss.android.ttvecamera.focusmanager.a.b
        public void a() {
            h hVar;
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f97470j.f97100n && (hVar = tECameraModeBase.f97469i) != null && hVar.Z0() == 3) {
                q.k(TECameraModeBase.f97462a0, "gyro onChange set focus mode to continuous focus.");
                TECameraModeBase.this.X();
                TECameraModeBase.this.b();
                if (TECameraModeBase.this.f97469i.Y0() != null) {
                    TECameraModeBase.this.f97469i.Y0().i(TECameraModeBase.this.X);
                }
            }
        }
    }

    public class d extends CameraCaptureSession.StateCallback {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f97493b;

            a(int i10) {
                this.f97493b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraModeBase tECameraModeBase = TECameraModeBase.this;
                tECameraModeBase.f97468h.c(tECameraModeBase.f97470j.f97076b, this.f97493b, "updateCapture : something wrong.", tECameraModeBase.f97472l);
            }
        }

        d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@n0 CameraCaptureSession cameraCaptureSession) {
            q.e(TECameraModeBase.f97462a0, "onConfigureFailed...");
            TECameraModeBase.this.u0();
            n.b(n.f97653q, 0L);
            q.l(n.f97653q, 0);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@n0 CameraCaptureSession cameraCaptureSession) {
            s.a("TECameraModeBase-onConfigured");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            long j10 = jCurrentTimeMillis - tECameraModeBase.K;
            tECameraModeBase.L = j10;
            tECameraModeBase.M = jCurrentTimeMillis;
            tECameraModeBase.J = false;
            TECameraModeBase.this.f97466f = cameraCaptureSession;
            TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
            if (tECameraModeBase2.f97470j.f97103o0 && Build.VERSION.SDK_INT >= 28) {
                try {
                    if (!tECameraModeBase2.U && tECameraModeBase2.f97469i.L() != null && TECameraModeBase.this.f97469i.L().d() != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(TECameraModeBase.this.f97469i.L().d());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TECameraModeBase.this.V.get(i10).addSurface((Surface) arrayList.get(i10));
                            TECameraModeBase.this.U = true;
                        }
                    }
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    if (!tECameraModeBase3.T && tECameraModeBase3.U) {
                        tECameraModeBase3.f97466f.finalizeOutputConfigurations(TECameraModeBase.this.V);
                        TECameraModeBase.this.T = true;
                        q.b(TECameraModeBase.f97462a0, "finalizeOutputConfigurations in session onConfigured");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            TECameraModeBase tECameraModeBase4 = TECameraModeBase.this;
            if (!tECameraModeBase4.f97470j.f97103o0 || tECameraModeBase4.T) {
                try {
                    int iP = tECameraModeBase4.P();
                    if (iP != 0) {
                        TECameraModeBase.this.u0();
                        a aVar = new a(iP);
                        TECameraModeBase tECameraModeBase5 = TECameraModeBase.this;
                        if (tECameraModeBase5.f97470j.f97094k) {
                            tECameraModeBase5.f97473m.post(aVar);
                        } else {
                            aVar.run();
                        }
                    }
                } catch (Exception e11) {
                    TECameraModeBase.this.u0();
                    e11.printStackTrace();
                }
            }
            n.b(n.f97653q, 1L);
            n.b(n.f97654r, j10);
            q.l(n.f97653q, 1);
            q.l(n.f97654r, Long.valueOf(j10));
            s.b();
        }
    }

    public class e extends CameraCaptureSession.CaptureCallback {
        e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                TECameraModeBase.this.F = totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY) == null ? -1 : ((Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY)).intValue();
            }
            if (!TECameraModeBase.this.J) {
                TECameraModeBase.this.u0();
                TECameraModeBase.this.J = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - TECameraModeBase.this.M;
                q.k(TECameraModeBase.f97462a0, "first preview frame callback arrived! consume = " + jCurrentTimeMillis + ", session consume: " + TECameraModeBase.this.L);
                n.b(n.f97655s, jCurrentTimeMillis);
                q.l(n.f97655s, Long.valueOf(jCurrentTimeMillis));
            }
            if (TECameraModeBase.this.f97470j.f97101n0) {
                TECameraFrame.d dVar = new TECameraFrame.d();
                dVar.f96874c = System.currentTimeMillis();
                dVar.f96875d = totalCaptureResult;
                dVar.f96876e = TECameraModeBase.this.b0()[1];
                dVar.f96877f = TECameraModeBase.this.b0()[0];
                TECameraModeBase.this.f97469i.L().f().t(dVar);
            }
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f97477q) {
                tECameraModeBase.f97477q = p.n(totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@n0 CameraCaptureSession cameraCaptureSession, @n0 CaptureRequest captureRequest, @n0 CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            TECameraModeBase tECameraModeBase = TECameraModeBase.this;
            if (tECameraModeBase.f97470j.f97087g0 && !tECameraModeBase.J && captureFailure.getReason() == 0) {
                TECameraModeBase tECameraModeBase2 = TECameraModeBase.this;
                int i10 = tECameraModeBase2.N + 1;
                tECameraModeBase2.N = i10;
                tECameraModeBase2.f97470j.getClass();
                if (i10 >= 5) {
                    TECameraModeBase tECameraModeBase3 = TECameraModeBase.this;
                    tECameraModeBase3.f97468h.b(tECameraModeBase3.f97470j.f97076b, o.F0, "Camera previewing failed", tECameraModeBase3.f97472l);
                }
            }
            q.e(TECameraModeBase.f97462a0, "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f97496a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f97497b = "";

        protected f() {
        }

        public String a() {
            return this.f97497b;
        }

        public Exception b() {
            return new Exception(this.f97497b);
        }

        public boolean c() {
            return this.f97496a;
        }

        public String toString() {
            return "Response{isSuccess=" + this.f97496a + ", errMsg='" + this.f97497b + "'}";
        }
    }

    public TECameraModeBase(@n0 h hVar, @n0 Context context, Handler handler) {
        this.f97477q = true;
        this.O = false;
        this.f97469i = hVar;
        TECameraSettings tECameraSettingsU = hVar.u();
        this.f97470j = tECameraSettingsU;
        this.f97464d = com.ss.android.ttvecamera.hardware.d.c(context, tECameraSettingsU.f97076b);
        this.f97468h = this.f97469i.t();
        this.f97473m = handler;
        this.f97477q = this.f97470j.f97092j;
        this.O = false;
    }

    public static List<TEFrameSizei> j0(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v29 ??, new type: java.util.concurrent.atomic.AtomicBoolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: com.ss.android.ttvecamera.focusmanager.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: com.ss.android.ttvecamera.focusmanager.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: com.ss.android.ttvecamera.focusmanager.b
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private int n0(com.ss.android.ttvecamera.TEFocusSettings r19) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.framework.TECameraModeBase.n0(com.ss.android.ttvecamera.TEFocusSettings):int");
    }

    private void x0() {
        com.ss.android.ttvecamera.hardware.d dVar = this.f97464d;
        CameraCharacteristics cameraCharacteristics = this.f97463c;
        TECameraSettings tECameraSettings = this.f97470j;
        TEFrameRateRange tEFrameRateRange = tECameraSettings.f97078c;
        this.E = dVar.d(cameraCharacteristics, tEFrameRateRange.f97203b, tEFrameRateRange.f97204c, tECameraSettings.O, tECameraSettings.f97080d);
        q.k(f97462a0, "Set Fps Range: " + this.E.toString() + ", strategy: " + this.f97470j.O);
    }

    private void z0(CaptureRequest.Builder builder) {
        int[] iArr = this.A;
        if (iArr == null) {
            q.b(f97462a0, "FaceDetect is not supported!");
            return;
        }
        if (p.g(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (p.g(this.A, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
        } else if (p.g(this.A, 0)) {
            q.u(f97462a0, "FaceDetect is not supported!");
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int A() {
        return 0;
    }

    protected void A0(CaptureRequest.Builder builder) {
        if (this.A != null) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
        } else {
            q.b(f97462a0, "FaceDetect is not supported!");
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void B(j.f fVar) {
        this.f97484x = fVar;
    }

    public f B0() {
        f fVar = new f();
        if (this.f97466f == null) {
            fVar.f97497b = "Capture Session is null";
            q.e(f97462a0, "stopRepeating: " + fVar.f97497b);
            return fVar;
        }
        try {
            this.f97466f.stopRepeating();
            fVar.f97496a = true;
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            fVar.f97497b = e10.getMessage();
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            fVar.f97497b = e11.getMessage();
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f C0(CaptureRequest.Builder builder) {
        return D0(builder, this.Z);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int[] D() {
        return null;
    }

    protected f D0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return E0(builder, captureCallback, q0());
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void E(long j10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97714z0, o.f97714z0, "Capture Session is null", this.f97472l);
        }
        if (j10 > s()[1] || j10 < s()[0]) {
            this.f97468h.e(o.f97714z0, o.f97714z0, "invalid shutter time", this.f97472l);
            return;
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f97465e.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j10));
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "setShutterTime exception: " + fVarC0.f97497b);
        this.f97468h.e(o.f97714z0, o.f97714z0, fVarC0.f97497b, this.f97472l);
    }

    protected f E0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        s.a("TECameraModeBase-updatePreview");
        f fVar = new f();
        if (builder == null) {
            fVar.f97497b = "CaptureRequest.Builder is null";
            q.e(f97462a0, "updatePreview: " + fVar.f97497b);
            return fVar;
        }
        if (this.f97466f == null) {
            fVar.f97497b = "Capture Session is null";
            q.e(f97462a0, "updatePreview: " + fVar.f97497b);
            return fVar;
        }
        CaptureRequest captureRequestBuild = builder.build();
        this.f97475o = captureRequestBuild;
        try {
            this.f97466f.setRepeatingRequest(captureRequestBuild, captureCallback, handler);
            fVar.f97496a = true;
            this.Q = true;
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            fVar.f97497b = e10.getMessage();
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            fVar.f97497b = e11.getMessage();
        } catch (IllegalStateException e12) {
            e12.printStackTrace();
            fVar.f97497b = e12.getMessage();
            this.Q = false;
        } catch (SecurityException e13) {
            e13.printStackTrace();
            fVar.f97497b = e13.getMessage();
        }
        s.b();
        return fVar;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public abstract int F() throws Exception;

    public void F0(int i10) {
        if (i10 == 1) {
            if (this.f97470j.f97080d == 1) {
                z0(this.f97465e);
                q.k(f97462a0, "use faceae for front");
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (this.f97470j.f97080d == 0) {
                z0(this.f97465e);
                q.k(f97462a0, "use faceae for rear");
                return;
            }
            return;
        }
        if (i10 == 3) {
            z0(this.f97465e);
            q.k(f97462a0, "use faceae for all");
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void G(j.b bVar) {
        this.f97485y = bVar;
    }

    protected void G0() {
        h hVar = this.f97469i;
        if (hVar != null) {
            hVar.g1();
            return;
        }
        q.b(f97462a0, "waitCameraTaskDoneOrTimeout failed, " + q.j());
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int H(int i10, int i11) {
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void I(boolean z10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "setExposureCompensation : Capture Session is null", this.f97472l);
            return;
        }
        try {
            this.f97465e.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z10));
            C0(this.f97465e);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f97468h.e(o.f97706v0, o.f97706v0, e10.toString(), this.f97472l);
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void J() {
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int[] K() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void L(boolean z10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "setAutoFocusLock : Capture Session is null", this.f97472l);
            return;
        }
        try {
            this.f97465e.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            C0(this.f97465e);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f97468h.e(o.C0, o.C0, e10.toString(), this.f97472l);
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int[] M() {
        Range range;
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null || (range = (Range) builder.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void N(float f10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.A0, o.A0, "Capture Session is null", this.f97472l);
        }
        if (S().length == 1 && !Arrays.asList(S()).contains(Float.valueOf(f10))) {
            this.f97468h.e(o.A0, o.A0, "invalid aperture", this.f97472l);
            return;
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f97465e.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f10));
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "setAperture exception: " + fVarC0.f97497b);
        this.f97468h.e(o.A0, o.A0, fVarC0.f97497b, this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void O(Object obj) throws ClassCastException {
        this.f97472l = (CameraDevice) obj;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int P() throws CameraAccessException {
        s.a("TECameraModeBase-updateCapture");
        if (this.f97469i.L() == null || this.f97465e == null) {
            q.e(f97462a0, "update capture failed");
            return -100;
        }
        if (this.f97464d.t(this.f97463c) && t0()) {
            q.k(f97462a0, "Stabilization Supported, toggle = " + this.f97470j.U);
            if (this.f97464d.a(this.f97463c, this.f97465e, this.f97470j.U) == 0 && this.f97470j.U) {
                this.f97468h.e(113, 1, "enable stablization", this.f97472l);
            }
        }
        this.f97465e.set(CaptureRequest.CONTROL_MODE, 1);
        x0();
        Range<Integer> rangeI0 = i0(new Range<>(Integer.valueOf(this.E.f97203b / this.f97470j.f97078c.f97205d), Integer.valueOf(this.E.f97204c / this.f97470j.f97078c.f97205d)));
        this.f97465e.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeI0);
        this.f97468h.e(121, 0, rangeI0.toString(), null);
        this.f97465e.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f97481u));
        F0(this.B);
        if (Float.compare(this.f97470j.f97121x0, this.f97479s) != 0) {
            float fMin = Math.min(this.f97470j.f97121x0, this.f97478r);
            this.f97479s = fMin;
            Rect rectT = T(fMin);
            if (rectT == null) {
                q.u(f97462a0, "calculate default crop_region fail!");
            } else {
                this.f97465e.set(CaptureRequest.SCALER_CROP_REGION, rectT);
            }
        }
        f fVarC0 = C0(this.f97465e);
        if (!fVarC0.f97496a) {
            q.e(f97462a0, "first request failed: " + fVarC0.f97497b);
        }
        this.f97470j.f97082e = ((Integer) this.f97463c.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f97469i.f1(3);
        V();
        q.k(f97462a0, "send capture request..." + this.f97466f);
        this.f97468h.a(2, 0, 0, "TECamera2 preview", this.f97472l);
        s.b();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void Q(rg.a aVar, int i10, TECameraSettings.f fVar) {
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public String R(@TECameraSettings.c int i10) throws CameraAccessException {
        s.a("TECameraModeBase-selectCamera");
        String[] cameraIdList = this.f97467g.getCameraIdList();
        String strE = null;
        if (cameraIdList == null) {
            q.u(f97462a0, "cameraList is null");
            return null;
        }
        n.b(n.f97637a, cameraIdList.length);
        if (this.f97470j.E.getBoolean(l.f97595a)) {
            q.k(f97462a0, "Enable CameraDeviceCache");
            strE = this.S.get(Integer.valueOf(i10));
        }
        if (strE == null || strE == "") {
            if (i10 == 2) {
                if (this.f97470j.J.length() <= 0 || this.f97470j.J.equals("-1")) {
                    strE = this.f97470j.f97076b == 8 ? this.f97469i.Q() : this.f97464d.k(cameraIdList, this.f97467g);
                } else {
                    q.k(f97462a0, "Wide-angle camera id: " + this.f97470j.J);
                    if (p.h(cameraIdList, this.f97470j.J)) {
                        strE = this.f97470j.J;
                    } else {
                        q.u(f97462a0, "Maybe this is not validate camera id: " + this.f97470j.J);
                    }
                }
                this.f97468h.e(112, 0, "enable wide angle", this.f97472l);
            } else if (i10 != 3) {
                if (i10 >= cameraIdList.length || i10 < 0) {
                    i10 = 1;
                }
                TECameraSettings tECameraSettings = this.f97470j;
                tECameraSettings.f97080d = i10;
                if (tECameraSettings.f97097l0 && !TextUtils.isEmpty(tECameraSettings.J)) {
                    strE = this.f97470j.J;
                } else if (this.f97470j.f97096l && com.ss.android.ttvecamera.hardware.c.d()) {
                    strE = ((g) this.f97464d).E(this.f97467g, i10, cameraIdList);
                }
                if (strE == null) {
                    for (String str : cameraIdList) {
                        int i11 = ((Integer) this.f97467g.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
                        this.S.put(Integer.valueOf(i11), str);
                        if (i11 == i10) {
                            strE = str;
                            break;
                        }
                    }
                }
            } else if (this.f97470j.f97076b == 2) {
                strE = this.f97464d.i(cameraIdList, this.f97467g);
            }
            if (strE != null) {
                this.S.put(Integer.valueOf(i10), strE);
            }
        }
        if (strE == null) {
            q.u(f97462a0, "selectCamera: camera tag is null, set 0 for default");
            strE = "0";
        }
        q.k(f97462a0, "selectCamera size: " + cameraIdList.length + ", mFacing: " + this.f97470j.f97080d + ", cameraTag: " + strE);
        CameraCharacteristics cameraCharacteristics = this.f97467g.getCameraCharacteristics(strE);
        this.f97463c = cameraCharacteristics;
        if (Build.VERSION.SDK_INT >= 28) {
            q.b(f97462a0, "selectCamera sessionKeys: " + cameraCharacteristics.getAvailableSessionKeys());
        }
        Range range = (Range) this.f97463c.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) this.f97463c.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null) {
            this.f97470j.K.f97133c = ((Integer) range.getLower()).intValue();
            this.f97470j.K.f97131a = ((Integer) range.getUpper()).intValue();
            this.f97470j.K.f97134d = (rational.getNumerator() * 1.0f) / rational.getDenominator();
            this.f97470j.K.f97132b = 0;
        }
        s.b();
        return strE;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public float[] S() {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.A0, o.A0, "Capture Session is null", this.f97472l);
        }
        float[] fArr = (float[]) this.f97463c.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        return fArr == null ? new float[]{-1.0f, -1.0f} : fArr;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public Rect T(float f10) {
        Rect rect = this.I;
        if (rect == null) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            q.e(f97462a0, "ActiveArraySize == null");
            this.f97468h.e(o.f97692o0, o.f97692o0, "ActiveArraySize == null.", this.f97472l);
            return null;
        }
        float f11 = this.f97479s;
        if (f11 <= 0.0f || f11 > this.f97478r) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            q.e(f97462a0, "factor invalid");
            this.f97468h.e(o.f97692o0, o.f97692o0, "factor invalid.", this.f97472l);
            return null;
        }
        float f12 = 1.0f / f11;
        int iWidth = rect.width() - Math.round(this.I.width() * f12);
        int iHeight = this.I.height() - Math.round(this.I.height() * f12);
        int i10 = iWidth / 2;
        Rect rect2 = this.I;
        int iF = p.f(i10, rect2.left, rect2.right);
        int i11 = iHeight / 2;
        Rect rect3 = this.I;
        int iF2 = p.f(i11, rect3.top, rect3.bottom);
        int iWidth2 = this.I.width() - i10;
        Rect rect4 = this.I;
        int iF3 = p.f(iWidth2, rect4.left, rect4.right);
        int iHeight2 = this.I.height() - i11;
        Rect rect5 = this.I;
        Rect rect6 = new Rect(iF, iF2, iF3, p.f(iHeight2, rect5.top, rect5.bottom));
        CaptureRequest captureRequest = this.f97475o;
        if (captureRequest != null && rect6.equals((Rect) captureRequest.get(CaptureRequest.SCALER_CROP_REGION))) {
            q.k(f97462a0, "same SCALER_CROP_REGION, no need to set");
        }
        return rect6;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void U(Bundle bundle) {
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void V() {
        Bundle bundle;
        s.a("TECameraModeBase-fillFeatures");
        if (this.f97469i.B().containsKey(this.f97470j.H)) {
            bundle = this.f97469i.B().get(this.f97470j.H);
        } else {
            bundle = new Bundle();
            this.f97469i.B().put(this.f97470j.H, bundle);
        }
        bundle.putParcelable(TECameraSettings.k.f97152r, this.f97470j.f97106q);
        if (this.f97463c != null && this.f97475o != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f97185b = (Rect) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f97186c = (Rect) this.f97475o.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f97188e = ((Integer) this.f97463c.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f97187d = ((Integer) this.f97463c.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable(TECameraSettings.k.f97153s, tEFocusParameters);
        }
        bundle.putInt(TECameraSettings.k.f97155u, this.f97470j.f97082e);
        s.b();
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int W(int i10, int i11, float f10, int i12, int i13) {
        return k(new TEFocusSettings(i10, i11, i12, i13, f10));
    }

    public int X() {
        if (this.f97465e == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackMeteringSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        F0(this.B);
        this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f97470j.f97100n) {
            this.f97465e.set(CaptureRequest.CONTROL_AE_REGIONS, com.ss.android.ttvecamera.focusmanager.b.f97417b);
        }
        C0(this.f97465e);
        q.k(f97462a0, "rollbackMeteringSessionRequest");
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void Y(float f10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.E0, o.E0, "Capture Session is null", this.f97472l);
        }
        if (f10 < 0.0f) {
            this.f97468h.e(o.E0, o.E0, "invalid distance", this.f97472l);
            return;
        }
        this.f97465e.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f10));
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "setManualFocusDistance exception: " + fVarC0.f97497b);
        this.f97468h.e(o.f97712y0, o.f97712y0, fVarC0.f97497b, this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int Z(boolean z10) {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f97468h.c(this.f97470j.f97076b, -100, "toggleTorch : CaptureRequest.Builder is null", this.f97472l);
            this.f97468h.g(this.f97470j.f97076b, -100, z10 ? 1 : 0, "toggleTorch : CaptureRequest.Builder is null", this.f97472l);
            return -100;
        }
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z10 ? 2 : 0));
        this.f97468h.e(104, 0, "camera2 will change flash mode " + z10, null);
        f fVarC0 = C0(this.f97465e);
        this.f97468h.e(105, 0, "camera2 did change flash mode " + z10, null);
        if (fVarC0.f97496a) {
            this.f97468h.h(this.f97470j.f97076b, 0, z10 ? 1 : 0, "camera torch success", this.f97472l);
            return 0;
        }
        q.e(f97462a0, "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + fVarC0.a());
        this.f97468h.e(o.f97686l0, o.f97686l0, fVarC0.f97497b, this.f97472l);
        this.f97468h.g(this.f97470j.f97076b, o.f97686l0, z10 ? 1 : 0, fVarC0.f97497b, this.f97472l);
        return o.f97686l0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int a() {
        if (this.f97465e != null) {
            return this.f97471k.a();
        }
        this.f97468h.e(-100, -100, "rollbackNormalSessionRequest : param is null.", this.f97472l);
        return -100;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public float a0() {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.D0, o.D0, "Capture Session is null", this.f97472l);
        }
        float fFloatValue = this.f97463c.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) == null ? -1.0f : ((Float) this.f97463c.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
        if (fFloatValue >= 0.0f) {
            return fFloatValue;
        }
        this.f97468h.e(o.D0, o.D0, "can not get manual focus ability", this.f97472l);
        return -1.0f;
    }

    public int b() {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackNormalSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f97465e.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(r0()));
        this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 1);
        if (this.f97470j.f97100n) {
            CaptureRequest.Builder builder2 = this.f97465e;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle[] meteringRectangleArr = com.ss.android.ttvecamera.focusmanager.b.f97417b;
            builder2.set(key, meteringRectangleArr);
            this.f97465e.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        C0(this.f97465e);
        q.k(f97462a0, "rollbackNormalSessionRequest");
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int[] b0() {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97712y0, o.f97712y0, "Capture Session is null", this.f97472l);
        }
        Range range = (Range) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) ? new int[]{-1, -1} : new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int c() {
        return 0;
    }

    protected Rect c0(int i10, int i11, float f10, float f11, int i12, int i13, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int i14;
        int i15;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i16;
        if (this.f97475o == null) {
            q.e(f97462a0, "_calculateFocusRect, capture request is null, return");
            return null;
        }
        Rect rect = (Rect) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        q.b(f97462a0, "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        q.k("onAreaTouchEvent", sb2.toString());
        TECameraSettings tECameraSettings = this.f97470j;
        TEFrameSizei tEFrameSizei = tECameraSettings.f97106q;
        int i17 = tEFrameSizei.f97206b;
        int i18 = tEFrameSizei.f97207c;
        TEFocusSettings.CoordinatesMode coordinatesMode2 = TEFocusSettings.CoordinatesMode.VIEW;
        if (coordinatesMode == coordinatesMode2 && (90 == (i16 = tECameraSettings.f97082e) || 270 == i16)) {
            i15 = i18;
            i14 = i17;
        } else {
            i14 = i18;
            i15 = i17;
        }
        float f17 = 0.0f;
        if (i14 * i10 >= i15 * i11) {
            f13 = (i10 * 1.0f) / i15;
            f14 = ((i14 * f13) - i11) / 2.0f;
            f12 = 0.0f;
        } else {
            float f18 = (i11 * 1.0f) / i14;
            f12 = ((i15 * f18) - i10) / 2.0f;
            f13 = f18;
            f14 = 0.0f;
        }
        float f19 = (f10 + f12) / f13;
        float f20 = (f11 + f14) / f13;
        if (coordinatesMode == coordinatesMode2) {
            if (90 == i12) {
                float f21 = i18 - f19;
                f19 = f20;
                f20 = f21;
            } else if (270 == i12) {
                float f22 = i17 - f20;
                f20 = f19;
                f19 = f22;
            }
        }
        Rect rect2 = (Rect) this.f97475o.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            q.u(f97462a0, "can't get crop region");
        } else {
            rect = rect2;
        }
        q.b(f97462a0, "cropRegion Rect: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom);
        int iWidth = rect.width();
        int iHeight = rect.height();
        TECameraSettings tECameraSettings2 = this.f97470j;
        TEFrameSizei tEFrameSizei2 = tECameraSettings2.f97106q;
        int i19 = tEFrameSizei2.f97207c;
        int i20 = i19 * iWidth;
        int i21 = tEFrameSizei2.f97206b;
        if (i20 > i21 * iHeight) {
            f16 = (iHeight * 1.0f) / i19;
            f15 = 0.0f;
            f17 = (iWidth - (i21 * f16)) / 2.0f;
        } else {
            float f23 = (iWidth * 1.0f) / i21;
            f15 = (iHeight - (i19 * f23)) / 2.0f;
            f16 = f23;
        }
        float f24 = (f19 * f16) + f17 + rect.left;
        float fHeight = (f20 * f16) + f15 + rect.top;
        if (coordinatesMode == coordinatesMode2 && tECameraSettings2.f97080d == 1) {
            fHeight = rect.height() - fHeight;
        }
        Rect rect3 = new Rect();
        if (i13 == 0) {
            double d10 = f24;
            rect3.left = (int) (d10 - (((double) rect.width()) * 0.05d));
            rect3.right = (int) (d10 + (((double) rect.width()) * 0.05d));
            double d11 = fHeight;
            rect3.top = (int) (d11 - (((double) rect.height()) * 0.05d));
            rect3.bottom = (int) (d11 + (0.05d * ((double) rect.height())));
        } else {
            double d12 = f24;
            rect3.left = (int) (d12 - (((double) rect.width()) * 0.1d));
            rect3.right = (int) (d12 + (((double) rect.width()) * 0.1d));
            double d13 = fHeight;
            rect3.top = (int) (d13 - (((double) rect.height()) * 0.1d));
            rect3.bottom = (int) (d13 + (((double) rect.height()) * 0.1d));
        }
        int i22 = rect3.left;
        if (i22 < 0 || i22 < rect.left) {
            rect3.left = rect.left;
        }
        int i23 = rect3.top;
        if (i23 < 0 || i23 < rect.top) {
            rect3.top = rect.top;
        }
        int i24 = rect3.right;
        if (i24 < 0 || i24 > rect.right) {
            rect3.right = rect.right;
        }
        int i25 = rect3.bottom;
        if (i25 < 0 || i25 > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        q.k(f97462a0, "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "] x: " + f24 + " y: " + fHeight);
        return rect3;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void close() {
        if (this.f97470j.f97100n && this.f97469i.Y0() != null) {
            this.f97469i.Y0().i(this.X);
        }
        v0();
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int d() {
        CaptureRequest.Builder builder = this.f97465e;
        if (builder == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "rollbackNormalSessionRequest : param is null.", this.f97472l);
            return -100;
        }
        this.f97471k.b(builder);
        u(this.f97466f, this.f97465e);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void e(int i10, int i11, TECameraSettings.r rVar) {
    }

    protected f e0(CaptureRequest.Builder builder) {
        return f0(builder, this.Z, q0());
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void f() {
        if (this.f97466f == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f97466f.abortCaptures();
        } catch (Exception e10) {
            q.e(f97462a0, "abort session failed, e: " + e10.getMessage());
        }
        q.k(f97462a0, "abort session...consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f f0(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        f fVar = new f();
        if (builder == null) {
            fVar.f97497b = "CaptureRequest.Builder is null";
            q.e(f97462a0, "capture: " + fVar.f97497b);
            return fVar;
        }
        if (this.f97466f == null) {
            fVar.f97497b = "Capture Session is null";
            q.e(f97462a0, "capture: " + fVar.f97497b);
            return fVar;
        }
        try {
            this.f97466f.capture(builder.build(), captureCallback, handler);
            fVar.f97496a = true;
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            fVar.f97497b = e10.getMessage();
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            fVar.f97497b = e11.getMessage();
        }
        return fVar;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int g(float f10, TECameraSettings.w wVar) {
        CaptureRequest.Builder builder;
        Rect rectO = o(f10);
        if (this.f97464d == null || this.f97475o == null || this.f97466f == null || (builder = this.f97465e) == null) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f97468h.e(o.f97692o0, o.f97692o0, "startZoom : Env is null", this.f97472l);
            return -100;
        }
        if (rectO == null) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f97468h.e(o.f97692o0, o.f97692o0, "zoom rect is null.", this.f97472l);
            return o.f97692o0;
        }
        builder.set(CaptureRequest.SCALER_CROP_REGION, rectO);
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            if (wVar != null) {
                wVar.onChange(this.f97470j.f97076b, f10, true);
            }
            V();
            return 0;
        }
        q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + fVarC0.a());
        this.f97468h.e(o.f97692o0, o.f97692o0, fVarC0.f97497b, this.f97472l);
        return o.f97692o0;
    }

    protected f g0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        f fVar = new f();
        if (captureRequest == null) {
            fVar.f97497b = "CaptureRequest is null";
            q.e(f97462a0, "capture: " + fVar.f97497b);
            return fVar;
        }
        if (this.f97466f == null) {
            fVar.f97497b = "Capture Session is null";
            q.e(f97462a0, "capture: " + fVar.f97497b);
            return fVar;
        }
        try {
            this.f97466f.capture(captureRequest, captureCallback, handler);
            fVar.f97496a = true;
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            fVar.f97497b = e10.getMessage();
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            fVar.f97497b = e11.getMessage();
        }
        return fVar;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public boolean h(int i10) {
        this.f97481u = i10;
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.c(this.f97470j.f97076b, -100, "setExposureCompensation : Capture Session is null", this.f97472l);
            return false;
        }
        Integer num = (Integer) this.f97465e.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            q.u(f97462a0, "Can't set exposure compensation when ae mode is off.");
            return false;
        }
        if (this.f97470j.K.f97132b == i10) {
            q.k(f97462a0, "setExposureCompensation return, no need to set");
            return false;
        }
        this.f97465e.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i10));
        this.f97470j.K.f97132b = i10;
        f fVarC0 = C0(this.f97465e);
        if (!fVarC0.f97496a) {
            q.e(f97462a0, "setExposureCompensation failed: " + fVarC0.f97497b);
            this.f97468h.e(o.f97678h0, o.f97678h0, fVarC0.f97497b, this.f97472l);
        }
        return fVarC0.f97496a;
    }

    protected f h0(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        f fVar = new f();
        if (this.f97466f == null) {
            fVar.f97497b = "Capture Session is null";
            q.e(f97462a0, "capture: " + fVar.f97497b);
            return fVar;
        }
        try {
            this.f97466f.captureBurst(list, captureCallback, handler);
            fVar.f97496a = true;
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            fVar.f97497b = e10.getMessage();
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            fVar.f97497b = e11.getMessage();
        }
        return fVar;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void i(TECameraSettings.p pVar) {
    }

    protected Range<Integer> i0(Range<Integer> range) {
        return range;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void j(boolean z10, String str) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97700s0, o.f97700s0, "Capture Session is null", this.f97472l);
        }
        if (!Arrays.asList((int[]) this.f97463c.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(this.R.get(str) == null ? 1 : this.R.get(str).intValue()))) {
            this.f97468h.e(o.f97700s0, o.f97700s0, "invalid white balance", this.f97472l);
            return;
        }
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "setWhiteBalance exception: " + fVarC0.f97497b);
        this.f97468h.e(o.f97700s0, o.f97700s0, fVarC0.f97497b, this.f97472l);
    }

    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: java.util.concurrent.atomic.AtomicBoolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.ss.android.ttvecamera.framework.a
    public int k(com.ss.android.ttvecamera.TEFocusSettings r18) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.framework.TECameraModeBase.k(com.ss.android.ttvecamera.TEFocusSettings):int");
    }

    public CaptureRequest.Builder k0(int i10) {
        if (i10 > 6 || i10 < 1) {
            q.e(f97462a0, "createCaptureRequestBuilder, template invalid, must be [1, 6]");
            return null;
        }
        CameraDevice cameraDevice = this.f97472l;
        if (cameraDevice == null) {
            return null;
        }
        try {
            return cameraDevice.createCaptureRequest(i10);
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int l(String str, int i10) throws CameraAccessException {
        s.a("TECameraModeBase-openCamera");
        CameraCharacteristics cameraCharacteristics = this.f97463c;
        if (cameraCharacteristics == null) {
            q.b(f97462a0, "open failed, mCameraCharacteristics = null");
            return o.H0;
        }
        if (!this.f97464d.p(cameraCharacteristics, i10)) {
            return -403;
        }
        this.f97470j.f97082e = ((Integer) this.f97463c.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f97463c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.f97474n = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            return o.H0;
        }
        com.ss.android.ttvecamera.hardware.d dVar = this.f97464d;
        CameraCharacteristics cameraCharacteristics2 = this.f97463c;
        TECameraSettings tECameraSettings = this.f97470j;
        this.f97478r = dVar.f(cameraCharacteristics2, tECameraSettings.f97076b, tECameraSettings.f97104p);
        TECameraSettings tECameraSettings2 = this.f97470j;
        if (tECameraSettings2.f97113t0 == -1.0f || tECameraSettings2.f97115u0 == -1.0f) {
            this.f97480t = this.f97464d.l(this.f97463c);
        } else {
            this.f97480t = new Range<>(Float.valueOf(this.f97470j.f97115u0), Float.valueOf(this.f97470j.f97113t0));
        }
        this.f97479s = 1.0f;
        this.I = (Rect) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        x0();
        this.B = this.f97470j.E.getInt("useCameraFaceDetect");
        this.A = (int[]) this.f97463c.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        this.f97481u = 0;
        s.b();
        return 0;
    }

    protected void l0(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        List arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            q.k(f97462a0, "createSession by normally");
            this.f97472l.createCaptureSession(list, stateCallback, handler);
            return;
        }
        if (list != null || !this.f97470j.f97103o0 || (arrayList = this.V) == null) {
            arrayList = new ArrayList();
            Iterator<Surface> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OutputConfiguration(it.next()));
            }
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(s0(list), arrayList, new a(handler), stateCallback);
        sessionConfiguration.setSessionParameters(this.f97465e.build());
        q.k(f97462a0, "createSession by sessionConfiguration");
        this.f97472l.createCaptureSession(sessionConfiguration);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void m(TECameraSettings.r rVar, int i10) {
        if (this.O) {
            this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f97465e.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    public void m0() throws Exception {
        if (Build.VERSION.SDK_INT < 28 || this.f97472l == null) {
            return;
        }
        this.V.clear();
        TECameraSettings tECameraSettings = this.f97470j;
        if (tECameraSettings.B == 0 && tECameraSettings.f97076b == 2) {
            this.V.add(new OutputConfiguration(new Size(this.f97470j.c().f97206b, this.f97470j.c().f97207c), SurfaceTexture.class));
            Handler handlerQ0 = this.f97470j.f97094k ? q0() : this.f97473m;
            if (this.f97472l != null) {
                if (this.f97465e == null) {
                    if (this.f97470j.E.getBoolean("enablePreviewTemplate")) {
                        this.f97465e = this.f97472l.createCaptureRequest(1);
                    } else {
                        this.f97465e = this.f97472l.createCaptureRequest(3);
                    }
                }
                this.f97465e.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, i0(new Range<>(Integer.valueOf(this.E.f97203b / this.f97470j.f97078c.f97205d), Integer.valueOf(this.E.f97204c / this.f97470j.f97078c.f97205d))));
                l0(null, this.Y, handlerQ0);
            }
        }
        this.T = false;
        this.U = false;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int n() {
        s.a("TECameraModeBase-prepareProvider");
        com.ss.android.ttvecamera.provider.c cVarL = this.f97469i.L();
        if (p0() == null || cVarL == null) {
            q.e(f97462a0, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f97474n == null) {
            this.f97474n = (StreamConfigurationMap) this.f97463c.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        if (cVarL.f().n()) {
            cVarL.n(this.f97484x);
            cVarL.k(this.f97474n, null);
            this.f97470j.f97106q = cVarL.c();
            TEFrameSizei tEFrameSizei = this.f97470j.f97106q;
            if (tEFrameSizei != null) {
                this.f97468h.e(50, 0, tEFrameSizei.toString(), this.f97472l);
            }
        } else {
            cVarL.k(this.f97474n, this.f97470j.f97106q);
            this.f97470j.f97108r = cVarL.b();
        }
        q.k(f97462a0, "Camera provider type: " + cVarL.g());
        if (cVarL.g() == 1 || cVarL.g() == 16) {
            if (cVarL.h() == null) {
                q.e(f97462a0, "SurfaceTexture is null.");
                return -100;
            }
            SurfaceTexture surfaceTextureH = cVarL.h();
            TEFrameSizei tEFrameSizei2 = this.f97470j.f97106q;
            surfaceTextureH.setDefaultBufferSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
        } else if (cVarL.g() != 2) {
            if (cVarL.g() != 8) {
                q.e(f97462a0, "Unsupported camera provider type : " + cVarL.g());
                return -200;
            }
            SurfaceTexture surfaceTextureH2 = cVarL.h();
            TEFrameSizei tEFrameSizei3 = this.f97470j.f97106q;
            surfaceTextureH2.setDefaultBufferSize(tEFrameSizei3.f97206b, tEFrameSizei3.f97207c);
        }
        s.b();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public Rect o(float f10) {
        CameraCharacteristics cameraCharacteristics = this.f97463c;
        if (cameraCharacteristics == null || this.f97465e == null) {
            this.f97468h.c(this.f97470j.f97076b, o.f97692o0, "Camera info is null, may be you need reopen camera.", this.f97472l);
            return null;
        }
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int iWidth = (int) (rect.width() / fFloatValue);
        int iHeight = (int) (rect.height() / fFloatValue);
        int iWidth2 = rect.width() - iWidth;
        int iHeight2 = rect.height() - iHeight;
        int i10 = (int) ((iWidth2 / fFloatValue) * f10);
        int i11 = (int) ((iHeight2 / fFloatValue) * f10);
        int i12 = i10 - (i10 & 3);
        int i13 = i11 - (i11 & 3);
        return new Rect(i12, i13, rect.width() - i12, rect.height() - i13);
    }

    public void o0(boolean z10) {
        if (!z10 && this.f97479s != 1.0f) {
            this.f97479s = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.f97465e == null || this.f97466f == null) {
                    this.f97468h.c(this.f97470j.f97076b, -100, "enableMulticamZoom : Capture Session is null", this.f97472l);
                    return;
                }
                this.f97465e.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f97479s));
                f fVarC0 = C0(this.f97465e);
                if (!fVarC0.f97496a) {
                    q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + fVarC0.a());
                    this.f97468h.e(o.f97692o0, o.f97692o0, fVarC0.f97497b, this.f97472l);
                    return;
                }
            }
            this.f97482v = T(this.f97479s);
        }
        this.P = z10;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void p() {
        TECameraSettings tECameraSettings;
        if (this.f97469i != null && (tECameraSettings = this.f97470j) != null && tECameraSettings.f97094k) {
            q.k(f97462a0, "close session process...state = " + this.f97469i.Z0());
            if (this.f97469i.Z0() == 2) {
                this.f97469i.g1();
            }
        }
        this.Q = false;
        if (p0() == null) {
            q.e(f97462a0, "close session process...device is null");
            return;
        }
        if (this.f97466f == null) {
            q.e(f97462a0, "close session process...session is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f97466f.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f97466f = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        n.b(n.f97656t, jCurrentTimeMillis2);
        q.l(n.f97656t, Long.valueOf(jCurrentTimeMillis2));
        q.k(f97462a0, "close session...consume = " + jCurrentTimeMillis2);
    }

    protected Object p0() {
        return this.f97472l;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int q() {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97712y0, o.f97712y0, "Capture Session is null", this.f97472l);
        }
        return this.F;
    }

    public Handler q0() {
        if (this.H == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.H = handlerThread;
            handlerThread.start();
            q.k(f97462a0, "getCameraHandler, init camera thread");
        }
        if (this.G == null) {
            this.G = new Handler(this.H.getLooper());
        }
        return this.G;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void r() {
        q.k(f97462a0, "removeFocusSettings");
        com.ss.android.ttvecamera.focusmanager.e eVar = this.f97471k;
        if (eVar != null) {
            eVar.h(null);
            this.D = null;
        }
    }

    protected int r0() {
        return 3;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void reset() {
        this.f97482v = null;
        this.N = 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public long[] s() {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97714z0, o.f97714z0, "Capture Session is null", this.f97472l);
        }
        Range range = (Range) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        return range == null ? new long[]{-1, -1} : new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    protected int s0(List<Surface> list) {
        return 0;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public float[] t() {
        if (this.f97464d == null || this.f97475o == null || this.f97466f == null || this.f97465e == null) {
            q.u(f97462a0, "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f97463c.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f10 = (Float) this.f97465e.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int iAbs = StrictMath.abs(rect.right - rect.left);
        int iAbs2 = StrictMath.abs(rect.top - rect.bottom);
        TEFrameSizei tEFrameSizei = this.f97470j.f97106q;
        int i10 = tEFrameSizei.f97206b;
        int i11 = tEFrameSizei.f97207c;
        if (iAbs * i11 >= i10 / iAbs2) {
            dArr[0] = StrictMath.atan(((sizeF.getWidth() * iAbs) / size.getWidth()) / (f10.floatValue() * 2.0f)) * 2.0d;
            dArr[1] = StrictMath.atan(((((sizeF.getHeight() * iAbs2) / size.getHeight()) * (i10 / i11)) / (iAbs / iAbs2)) / (f10.floatValue() * 2.0f)) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan(((sizeF.getHeight() * iAbs2) / size.getHeight()) / (f10.floatValue() * 2.0f)) * 2.0d;
            dArr[0] = StrictMath.atan(((((sizeF.getWidth() * iAbs) / size.getWidth()) * (i11 / i10)) / (iAbs2 / iAbs)) / (f10.floatValue() * 2.0f)) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        q.b(f97462a0, "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    protected boolean t0() {
        return true;
    }

    @Override // com.ss.android.ttvecamera.focusmanager.b.a
    public void u(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder) {
        if (cameraCaptureSession != this.f97466f || builder != this.f97465e) {
            q.e(f97462a0, "updateRequestRepeating failed, session changed...");
            return;
        }
        f fVarC0 = C0(builder);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "updateRequestRepeating failed: " + fVarC0.f97497b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u0() {
        h hVar = this.f97469i;
        if (hVar != null) {
            hVar.c1();
            return;
        }
        q.b(f97462a0, "openCameraLock failed, " + q.j());
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void v(int i10) {
    }

    public void v0() {
        HandlerThread handlerThread = this.H;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.H = null;
            this.G = null;
            q.k(f97462a0, "releaseCameraThread");
        }
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void w(j.e eVar) {
        this.f97483w = eVar;
    }

    public void w0(CameraCharacteristics cameraCharacteristics) {
        this.f97463c = cameraCharacteristics;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void x(int i10) {
        if (this.f97465e == null || this.f97466f == null) {
            this.f97468h.e(o.f97712y0, o.f97712y0, "Capture Session is null", this.f97472l);
        }
        if (i10 > b0()[1] || i10 < b0()[0]) {
            this.f97468h.e(o.f97712y0, o.f97712y0, "invalid iso", this.f97472l);
            return;
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_AE_MODE, 0);
        }
        if (!((Integer) this.f97465e.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
            this.f97465e.set(CaptureRequest.CONTROL_MODE, 0);
        }
        this.f97465e.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i10));
        f fVarC0 = C0(this.f97465e);
        if (fVarC0.f97496a) {
            return;
        }
        q.e(f97462a0, "setISO exception: " + fVarC0.f97497b);
        this.f97468h.e(o.f97712y0, o.f97712y0, fVarC0.f97497b, this.f97472l);
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public void y(float f10, TECameraSettings.w wVar) {
        if (this.f97466f == null || this.f97475o == null || this.f97465e == null) {
            q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f97468h.c(this.f97470j.f97076b, o.f97692o0, "Camera info is null, may be you need reopen camera.", this.f97472l);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30 && this.P && this.f97464d.q(this.f97463c)) {
            Range<Float> range = this.f97480t;
            if (range != null) {
                Float f11 = (Float) range.getUpper();
                Float f12 = (Float) this.f97480t.getLower();
                if (this.f97479s * f10 >= f11.floatValue() && f10 > 1.0f) {
                    this.f97479s = f11.floatValue();
                } else if (this.f97479s * f10 > f12.floatValue() || f10 > 1.0f) {
                    this.f97479s *= f10;
                    q.e(f97462a0, "zoom ratio = " + this.f97479s);
                } else {
                    this.f97479s = f12.floatValue();
                }
            }
            this.f97465e.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f97479s));
            f fVarC0 = C0(this.f97465e);
            if (!fVarC0.f97496a) {
                q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + fVarC0.a());
                this.f97468h.e(o.f97692o0, o.f97692o0, fVarC0.f97497b, this.f97472l);
                return;
            }
        } else {
            if (this.f97479s < this.f97478r || f10 <= 1.0f) {
                Rect rect = this.f97482v;
                if (rect == null || !rect.equals(this.I) || f10 > 1.0f) {
                    q.b(f97462a0, "mNowZoom = " + this.f97479s);
                    this.f97479s = this.f97479s * f10;
                } else {
                    q.b(f97462a0, "mZoomSize = " + this.f97482v + ";mActiveArraySize = " + this.I + ";factor = " + f10);
                    this.f97479s = 1.0f;
                }
            } else {
                q.b(f97462a0, "mNowZoom = " + this.f97479s + ";mMaxZoom = " + this.f97478r + ";factor = " + f10);
                this.f97479s = this.f97478r;
            }
            Rect rectT = T(this.f97479s);
            if (rectT == null) {
                return;
            }
            this.f97465e.set(CaptureRequest.SCALER_CROP_REGION, rectT);
            f fVarC1 = C0(this.f97465e);
            if (!fVarC1.f97496a) {
                q.e(f97462a0, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + fVarC1.a());
                this.f97468h.e(o.f97692o0, o.f97692o0, fVarC1.f97497b, this.f97472l);
                return;
            }
            this.f97482v = rectT;
        }
        if (wVar != null) {
            wVar.onChange(this.f97470j.f97076b, this.f97479s, true);
        }
        V();
    }

    public void y0(j.g gVar) {
        this.f97486z = gVar;
    }

    @Override // com.ss.android.ttvecamera.framework.a
    public int z() {
        return -1;
    }
}
