package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.n0;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: TECameraBase.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j {
    private static final String A = "TECameraBase";
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TECameraSettings f97553b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a f97555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected SurfaceTexture f97556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f97557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Context f97558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected com.ss.android.ttvecamera.provider.c f97559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f97560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f97561j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f97564m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected e f97566o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected g f97569r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f97552a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f97554c = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f97562k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f97563l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f97565n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected f f97567p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected b f97568q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AtomicBoolean f97570s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Map<String, Bundle> f97571t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Map<Integer, Bundle> f97572u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Cert f97573v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected TECameraCapabilityCollector f97574w = new TECameraCapabilityCollector();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public JSONObject f97575x = new JSONObject();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f97576y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TECameraAlgorithmInterface f97577z = null;

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface a {
        void a(int i10, int i11, int i12, String str, Object obj);

        void b(int i10, int i11, String str, Object obj);

        void c(int i10, int i11, String str, Object obj);

        void d(int i10, int i11, int i12, String str, Object obj);

        void e(int i10, int i11, String str, Object obj);

        void f(int i10, int i11, j jVar, Object obj);

        void g(int i10, int i11, int i12, String str, Object obj);

        void h(int i10, int i11, int i12, String str, Object obj);

        void i(int i10, j jVar, Object obj);
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface b {
        int[] a(List<int[]> list);
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface c {
        void onPause();

        void onResume();

        void onStart();

        void onStop();
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97578a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f97579b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f97580c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f97581d = 0.0f;

        public boolean a() {
            return this.f97578a > this.f97580c && this.f97581d > 0.001f;
        }
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface e {
        TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface f {
        TEFrameSizei getPreviewSize(List<TEFrameSizei> list);
    }

    /* JADX INFO: compiled from: TECameraBase.java */
    public interface g {
        void a(int i10, float f10);
    }

    public j(Context context, a aVar, Handler handler) {
        this.f97558g = context;
        this.f97555d = aVar;
        this.f97557f = handler;
        this.f97574w.c(new com.ss.android.ttvecamera.cameracapabilitycollector.a());
    }

    public j(Context context, a aVar, Handler handler, e eVar) {
        this.f97558g = context;
        this.f97555d = aVar;
        this.f97557f = handler;
        this.f97566o = eVar;
        this.f97574w.c(new com.ss.android.ttvecamera.cameracapabilitycollector.a());
    }

    public Bundle A(String str) {
        return this.f97571t.get(str);
    }

    public void A0() {
    }

    public Map<String, Bundle> B() {
        return this.f97571t;
    }

    public abstract void B0();

    public int C() {
        return -1;
    }

    public int C0() {
        return -1;
    }

    public abstract int D();

    public void D0() {
        this.f97565n = 0;
    }

    public int E() {
        if (this.f97570s.getAndSet(false)) {
            D();
        }
        return this.f97562k;
    }

    public abstract void E0(TECameraSettings.w wVar);

    public Handler F() {
        return this.f97557f;
    }

    public abstract void F0(int i10);

    public int G() {
        return -1;
    }

    public abstract void G0(@TECameraSettings.l int i10);

    public int[] H() {
        return new int[]{-1, -1};
    }

    public abstract void H0(int i10, int i11, TECameraSettings.r rVar);

    public float I() {
        return -1.0f;
    }

    public abstract void I0(TECameraSettings.r rVar);

    public int[] J() {
        TEFrameSizei tEFrameSizei = this.f97553b.f97108r;
        return new int[]{tEFrameSizei.f97206b, tEFrameSizei.f97207c};
    }

    public abstract void J0(boolean z10);

    public int[] K() {
        return null;
    }

    public void K0(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    public com.ss.android.ttvecamera.provider.c L() {
        return this.f97559h;
    }

    public void L0(int i10) {
    }

    public int M() {
        return this.f97565n;
    }

    public abstract void M0(float f10, TECameraSettings.w wVar);

    public long[] N() {
        return new long[]{-1, -1};
    }

    public List<TEFrameSizei> O() {
        q.e(A, "getSupportedPictureSizes error");
        return null;
    }

    public List<TEFrameSizei> P() {
        q.e(A, "getSupportedPreviewSizes error");
        return null;
    }

    public String Q() {
        return null;
    }

    public abstract boolean R();

    public boolean S() {
        return false;
    }

    public boolean T() {
        return this.f97553b.f97117v0 && !this.f97576y;
    }

    public abstract boolean U();

    public boolean V() {
        TECameraSettings.h hVar = this.f97553b.K;
        return hVar != null && hVar.a();
    }

    public abstract boolean W();

    public abstract int X(int i10, int i11, int i12, int i13, int i14, boolean z10, Cert cert);

    public int Y(TECameraSettings tECameraSettings, Cert cert) {
        this.f97565n = tECameraSettings.f97118w;
        q.k(A, "set start preview retry count: " + this.f97565n);
        return 0;
    }

    public void Z(TECameraSettings.p pVar) {
        if (pVar == null || pVar.a() != 2) {
            return;
        }
        this.f97570s.set(true);
    }

    public void a() {
    }

    public TECameraFrame a0(TECameraFrame tECameraFrame) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f97577z;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(tECameraFrame);
        }
        return null;
    }

    public void b(TECameraAlgorithmParam tECameraAlgorithmParam) {
    }

    public abstract void b0(TECameraSettings.t tVar);

    public abstract void c();

    public abstract void c0(TECameraSettings.w wVar, boolean z10);

    public void d(rg.a aVar, TECameraSettings.f fVar) {
        fVar.b(new UnsupportedOperationException("unsupport capture burst, camera type:" + v()));
    }

    public void d0(b bVar) {
        this.f97568q = bVar;
    }

    public void e(int i10, c cVar) {
    }

    public void e0(f fVar) {
        this.f97567p = fVar;
    }

    public void f(Cert cert) {
        q.b(A, "close...");
    }

    public void f0(int i10) {
    }

    protected void g() {
    }

    public void g0() {
        this.f97565n = this.f97553b.f97118w;
    }

    public Exception h(Exception exc, int i10) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i10);
    }

    public void h0() {
        int i10 = this.f97565n;
        if (i10 > 0) {
            this.f97565n = i10 - 1;
        }
    }

    public void i() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.f97577z;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
    }

    public void i0(float f10) {
    }

    public abstract void j();

    public abstract void j0(boolean z10);

    protected void k(boolean z10) {
    }

    public void k0(boolean z10) {
    }

    protected Bundle l() {
        Bundle bundle;
        if (this.f97571t.containsKey(this.f97553b.H)) {
            bundle = this.f97571t.get(this.f97553b.H);
        } else {
            bundle = new Bundle();
            this.f97571t.put(this.f97553b.H, bundle);
        }
        if (bundle != null) {
            bundle.putInt(TECameraSettings.k.f97135a, this.f97553b.f97080d);
        }
        return bundle;
    }

    public void l0(int i10) {
        this.f97563l = i10;
        this.f97570s.set(true);
    }

    public abstract void m(TEFocusSettings tEFocusSettings);

    public abstract boolean m0(int i10);

    public void n(Cert cert) {
    }

    public void n0(Bundle bundle) {
    }

    public float[] o() {
        return new float[]{-1.0f, -1.0f};
    }

    public void o0(int i10) {
    }

    public abstract TEFrameSizei p(float f10, TEFrameSizei tEFrameSizei);

    public void p0(float f10) {
    }

    public JSONObject q() {
        return null;
    }

    public void q0(int i10, int i11) {
    }

    public int[] r() {
        return null;
    }

    public void r0() {
    }

    public TECameraSettings.h s() {
        return this.f97553b.K;
    }

    public void s0(@n0 com.ss.android.ttvecamera.provider.c cVar) {
        this.f97559h = cVar;
    }

    public a t() {
        return this.f97555d;
    }

    public void t0(g gVar) {
    }

    public TECameraSettings u() {
        return this.f97553b;
    }

    public void u0(int i10) {
        q.k(A, "scene mode: " + i10);
    }

    public abstract int v();

    public void v0(long j10) {
    }

    public Context w() {
        return this.f97558g;
    }

    public abstract void w0(boolean z10, String str);

    public int x() {
        TECameraSettings.h hVar = this.f97553b.K;
        if (hVar != null) {
            return hVar.f97132b;
        }
        return 0;
    }

    public abstract void x0();

    public abstract float[] y();

    public int y0() {
        return -1;
    }

    public int z() {
        return this.f97560i;
    }

    public abstract void z0(float f10, TECameraSettings.w wVar);
}
