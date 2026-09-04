package vb;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: BannerOptions.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f140839w = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f140841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f140842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f140843d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f140845f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f140851l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f140853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f140854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f140855p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f140858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f140859t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f140840a = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f140844e = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f140849j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f140850k = 0.85f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f140852m = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f140856q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f140857r = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f140860u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ch.b f140861v = new ch.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f140846g = xb.a.a(20.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f140847h = -1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f140848i = -1000;

    /* JADX INFO: compiled from: BannerOptions.java */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f140862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f140863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f140864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f140865d;

        public a(int i10, int i11, int i12, int i13) {
            this.f140862a = i10;
            this.f140863b = i12;
            this.f140864c = i11;
            this.f140865d = i13;
        }

        public int a() {
            return this.f140865d;
        }

        public int b() {
            return this.f140862a;
        }

        public int c() {
            return this.f140863b;
        }

        public int d() {
            return this.f140864c;
        }
    }

    public boolean A() {
        return this.f140859t;
    }

    public boolean B() {
        return this.f140858s;
    }

    public boolean C() {
        return this.f140860u;
    }

    public boolean D() {
        return this.f140856q;
    }

    public void E() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32474oh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.q(0);
        this.f140861v.y(0.0f);
    }

    public void F(boolean z10) {
        this.f140844e = z10;
    }

    public void G(boolean z10) {
        this.f140843d = z10;
    }

    public void H(boolean z10) {
        this.f140859t = z10;
    }

    public void I(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32359jh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.A(f10);
    }

    public void J(int i10) {
        this.f140845f = i10;
    }

    public void K(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32405lh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.B(i10);
    }

    public void L(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32428mh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f140851l = new a(i10, i11, i12, i13);
    }

    public void M(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32313hh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.x(i10);
    }

    public void N(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32151ah, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.z(i10, i11);
    }

    public void O(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32174bh, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.D(i10, i11);
    }

    public void P(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32267fh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.r(i10);
    }

    public void Q(int i10) {
        this.f140852m = i10;
    }

    public void R(int i10) {
        this.f140841b = i10;
    }

    public void S(List<Integer> list) {
        this.f140842c = list;
    }

    public void T(int i10) {
        this.f140848i = i10;
    }

    public void U(int i10) {
        this.f140840a = i10;
    }

    public void V(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32451nh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140857r = i10;
        this.f140861v.u(i10);
    }

    public void W(int i10) {
        this.f140846g = i10;
    }

    public void X(float f10) {
        this.f140850k = f10;
    }

    public void Y(int i10) {
        this.f140849j = i10;
    }

    public void Z(int i10) {
        this.f140847h = i10;
    }

    public int a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32221dh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) this.f140861v.getF35657j();
    }

    public void a0(int i10) {
        this.f140855p = i10;
    }

    public int b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Yg, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f140861v.getF35653f();
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.f140854o = new float[]{f, f, f, f, f, f, f, f};
        float f10 = i10;
        float f11 = i11;
        float f12 = i13;
        float f13 = i12;
    }

    public float c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32335ih, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f140861v.getF35654g();
    }

    public void c0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32497ph, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140858s = z10;
        this.f140861v.u(z10 ? 3 : 0);
    }

    public int d() {
        return this.f140845f;
    }

    public void d0(int i10) {
        this.f140853n = i10;
    }

    public float e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32382kh, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f140861v.m();
    }

    public void e0(boolean z10) {
        this.f140860u = z10;
    }

    public a f() {
        return this.f140851l;
    }

    public void f0(boolean z10) {
        this.f140856q = z10;
    }

    public int g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Xg, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f140861v.getF35652e();
    }

    public void g0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32197ch, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f140861v.w(z10);
    }

    public ch.b h() {
        return this.f140861v;
    }

    public int i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32290gh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f140861v.getF35650c();
    }

    public int j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32244eh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f140861v.getF35649b();
    }

    public int k() {
        return this.f140852m;
    }

    public int l() {
        return this.f140841b;
    }

    public List<Integer> m() {
        return this.f140842c;
    }

    public int n() {
        return this.f140848i;
    }

    public int o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Zg, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) this.f140861v.getF35656i();
    }

    public int p() {
        return this.f140840a;
    }

    public int q() {
        return this.f140857r;
    }

    public int r() {
        return this.f140846g;
    }

    public float s() {
        return this.f140850k;
    }

    public int t() {
        return this.f140849j;
    }

    public int u() {
        return this.f140847h;
    }

    public int v() {
        return this.f140855p;
    }

    public float[] w() {
        return this.f140854o;
    }

    public int x() {
        return this.f140853n;
    }

    public boolean y() {
        return this.f140844e;
    }

    public boolean z() {
        return this.f140843d;
    }
}
