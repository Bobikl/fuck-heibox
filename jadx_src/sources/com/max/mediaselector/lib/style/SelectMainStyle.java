package com.max.mediaselector.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class SelectMainStyle implements Parcelable {
    public static final Parcelable.Creator<SelectMainStyle> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int[] E;
    private int F;
    private int G;
    private int H;
    private int[] I;
    private int J;
    private int K;
    private int L;
    private String M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int[] S;
    private int T;
    private int[] U;
    private int V;
    private int W;
    private int X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f75426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f75429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f75430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f75432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f75434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f75435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f75436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f75437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f75438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f75439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f75441u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f75442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f75443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f75444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f75445y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f75446z;

    public class a implements Parcelable.Creator<SelectMainStyle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public SelectMainStyle a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34948p5, new Class[]{Parcel.class}, SelectMainStyle.class);
            return patchProxyResultProxy.isSupported ? (SelectMainStyle) patchProxyResultProxy.result : new SelectMainStyle(parcel);
        }

        public SelectMainStyle[] b(int i10) {
            return new SelectMainStyle[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.style.SelectMainStyle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SelectMainStyle createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34993r5, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.style.SelectMainStyle[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SelectMainStyle[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34971q5, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public SelectMainStyle() {
        this.f75424d = false;
    }

    public SelectMainStyle(Parcel parcel) {
        this.f75424d = false;
        this.f75422b = parcel.readInt();
        this.f75423c = parcel.readInt();
        this.f75424d = parcel.readByte() != 0;
        this.f75425e = parcel.readByte() != 0;
        this.f75426f = parcel.readByte() != 0;
        this.f75427g = parcel.readByte() != 0;
        this.f75428h = parcel.readInt();
        this.f75429i = parcel.readInt();
        this.f75430j = parcel.readString();
        this.f75431k = parcel.readInt();
        this.f75432l = parcel.readInt();
        this.f75433m = parcel.readInt();
        this.f75434n = parcel.readInt();
        this.f75435o = parcel.readByte() != 0;
        this.f75436p = parcel.readByte() != 0;
        this.f75437q = parcel.readInt();
        this.f75438r = parcel.readString();
        this.f75439s = parcel.readInt();
        this.f75440t = parcel.readInt();
        this.f75441u = parcel.readInt();
        this.f75442v = parcel.readString();
        this.f75443w = parcel.readInt();
        this.f75444x = parcel.readInt();
        this.f75445y = parcel.readInt();
        this.f75446z = parcel.readInt();
        this.A = parcel.readByte() != 0;
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.createIntArray();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.createIntArray();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.createIntArray();
        this.T = parcel.readInt();
        this.U = parcel.createIntArray();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
    }

    public int A() {
        return this.D;
    }

    public void A0(int i10) {
        this.F = i10;
    }

    public int B() {
        return this.B;
    }

    public void B1(boolean z10) {
        this.f75435o = z10;
    }

    public int C() {
        return this.P;
    }

    public void C0(int[] iArr) {
        this.I = iArr;
    }

    public void C1(String str) {
        this.f75442v = str;
    }

    public int[] D() {
        return this.S;
    }

    public void D0(int i10) {
        this.H = i10;
    }

    public void D1(int i10) {
        this.f75444x = i10;
    }

    public int E() {
        return this.R;
    }

    public void E1(int i10) {
        this.f75443w = i10;
    }

    public int F() {
        return this.Q;
    }

    public void F0(int i10) {
        this.G = i10;
    }

    public void F1(int i10) {
        this.f75422b = i10;
    }

    public int G() {
        return this.f75437q;
    }

    public void G0(int[] iArr) {
        this.U = iArr;
    }

    public int H() {
        return this.f75423c;
    }

    public int I() {
        return this.f75429i;
    }

    public void I0(int i10) {
        this.T = i10;
    }

    public int K() {
        return this.f75434n;
    }

    public void K0(boolean z10) {
        this.A = z10;
    }

    public int L() {
        return this.f75428h;
    }

    public void L0(int i10) {
        this.f75446z = i10;
    }

    public String M() {
        return this.f75430j;
    }

    public void M0(int i10) {
        this.W = i10;
    }

    public int N() {
        return this.f75432l;
    }

    public void N0(int i10) {
        this.V = i10;
    }

    public int O() {
        return this.f75431k;
    }

    public void O0(int i10) {
        this.X = i10;
    }

    public int P() {
        return this.f75433m;
    }

    public void P0(int i10) {
        this.C = i10;
    }

    public void Q0(int[] iArr) {
        this.E = iArr;
    }

    public void S0(int i10) {
        this.D = i10;
    }

    public int T() {
        return this.f75445y;
    }

    public void T0(int i10) {
        this.B = i10;
    }

    public int U() {
        return this.f75441u;
    }

    public void U0(int i10) {
        this.P = i10;
    }

    public void V0(int[] iArr) {
        this.S = iArr;
    }

    public String W() {
        return this.f75438r;
    }

    public int X() {
        return this.f75440t;
    }

    public void Y0(int i10) {
        this.R = i10;
    }

    public int a() {
        return this.K;
    }

    public int a0() {
        return this.f75439s;
    }

    public void a1(int i10) {
        this.Q = i10;
    }

    public int b() {
        return this.L;
    }

    public String b0() {
        return this.f75442v;
    }

    public void b1(boolean z10) {
        this.f75425e = z10;
    }

    public String c() {
        return this.M;
    }

    public int c0() {
        return this.f75444x;
    }

    public void c1(boolean z10) {
        this.f75424d = z10;
    }

    public int d() {
        return this.N;
    }

    public int d0() {
        return this.f75443w;
    }

    public void d1(int i10) {
        this.f75437q = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e0() {
        return this.f75422b;
    }

    public int f() {
        return this.O;
    }

    public boolean f0() {
        return this.A;
    }

    public void f1(int i10) {
        this.f75423c = i10;
    }

    public boolean g0() {
        return this.f75425e;
    }

    public void g1(int i10) {
        this.f75429i = i10;
    }

    public int h() {
        return this.J;
    }

    public void h1(boolean z10) {
        this.f75427g = z10;
    }

    public void i1(int i10) {
        this.f75434n = i10;
    }

    public int j() {
        return this.F;
    }

    public boolean j0() {
        return this.f75424d;
    }

    public void j1(int i10) {
        this.f75428h = i10;
    }

    public int[] k() {
        return this.I;
    }

    public boolean k0() {
        return this.f75427g;
    }

    public void k1(boolean z10) {
        this.f75436p = z10;
    }

    public int l() {
        return this.H;
    }

    public boolean l0() {
        return this.f75436p;
    }

    public void l1(boolean z10) {
        this.f75426f = z10;
    }

    public boolean m0() {
        return this.f75426f;
    }

    public int n() {
        return this.G;
    }

    public boolean n0() {
        return this.f75435o;
    }

    public void n1(String str) {
        this.f75430j = str;
    }

    public int[] o() {
        return this.U;
    }

    public void o0(int i10) {
        this.K = i10;
    }

    public void o1(int i10) {
        this.f75432l = i10;
    }

    public int p() {
        return this.T;
    }

    public void p0(int i10) {
        this.L = i10;
    }

    public void p1(int i10) {
        this.f75431k = i10;
    }

    public int r() {
        return this.f75446z;
    }

    public void r0(String str) {
        this.M = str;
    }

    public void s1(int i10) {
        this.f75433m = i10;
    }

    public void t1(int i10) {
        this.f75445y = i10;
    }

    public int u() {
        return this.W;
    }

    public void u1(int i10) {
        this.f75441u = i10;
    }

    public int v() {
        return this.V;
    }

    public void v1(String str) {
        this.f75438r = str;
    }

    public int w() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34925o5, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75422b);
        parcel.writeInt(this.f75423c);
        parcel.writeByte(this.f75424d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75425e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75426f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75427g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75428h);
        parcel.writeInt(this.f75429i);
        parcel.writeString(this.f75430j);
        parcel.writeInt(this.f75431k);
        parcel.writeInt(this.f75432l);
        parcel.writeInt(this.f75433m);
        parcel.writeInt(this.f75434n);
        parcel.writeByte(this.f75435o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75436p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75437q);
        parcel.writeString(this.f75438r);
        parcel.writeInt(this.f75439s);
        parcel.writeInt(this.f75440t);
        parcel.writeInt(this.f75441u);
        parcel.writeString(this.f75442v);
        parcel.writeInt(this.f75443w);
        parcel.writeInt(this.f75444x);
        parcel.writeInt(this.f75445y);
        parcel.writeInt(this.f75446z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeIntArray(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeIntArray(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeIntArray(this.S);
        parcel.writeInt(this.T);
        parcel.writeIntArray(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
    }

    public void x0(int i10) {
        this.N = i10;
    }

    public void x1(int i10) {
        this.f75440t = i10;
    }

    public int y() {
        return this.C;
    }

    public void y0(int i10) {
        this.O = i10;
    }

    public void y1(int i10) {
        this.f75439s = i10;
    }

    public int[] z() {
        return this.E;
    }

    public void z0(int i10) {
        this.J = i10;
    }
}
