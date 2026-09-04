package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.m;
import java.util.Map;

/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int B = -1;
    private static final int C = 2;
    private static final int D = 4;
    private static final int E = 8;
    private static final int F = 16;
    private static final int G = 32;
    private static final int H = 64;
    private static final int I = 128;
    private static final int J = 256;
    private static final int K = 512;
    private static final int L = 1024;
    private static final int M = 2048;
    private static final int N = 4096;
    private static final int O = 8192;
    private static final int P = 16384;
    private static final int Q = 32768;
    private static final int R = 65536;
    private static final int S = 131072;
    private static final int T = 262144;
    private static final int U = 524288;
    private static final int V = 1048576;
    private boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41833b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Drawable f41837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private Drawable f41839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41840i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41845n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Drawable f41847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41848q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f41852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private Resources.Theme f41853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f41854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f41855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f41856y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f41834c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private com.bumptech.glide.load.engine.h f41835d = com.bumptech.glide.load.engine.h.f41156e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private Priority f41836e = Priority.NORMAL;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41841j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41842k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41843l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    private com.bumptech.glide.load.c f41844m = com.bumptech.glide.signature.c.c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41846o = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    private com.bumptech.glide.load.f f41849r = new com.bumptech.glide.load.f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    private Map<Class<?>, com.bumptech.glide.load.i<?>> f41850s = new com.bumptech.glide.util.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    private Class<?> f41851t = Object.class;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f41857z = true;

    @n0
    private T J0(@n0 DownsampleStrategy downsampleStrategy, @n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        return (T) K0(downsampleStrategy, iVar, true);
    }

    @n0
    private T K0(@n0 DownsampleStrategy downsampleStrategy, @n0 com.bumptech.glide.load.i<Bitmap> iVar, boolean z10) {
        T t10 = z10 ? (T) V0(downsampleStrategy, iVar) : (T) y0(downsampleStrategy, iVar);
        t10.f41857z = true;
        return t10;
    }

    private T L0() {
        return this;
    }

    private boolean j0(int i10) {
        return k0(this.f41833b, i10);
    }

    private static boolean k0(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @n0
    private T w0(@n0 DownsampleStrategy downsampleStrategy, @n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        return (T) K0(downsampleStrategy, iVar, false);
    }

    @n0
    @androidx.annotation.j
    public T A0(int i10) {
        return (T) B0(i10, i10);
    }

    @n0
    @androidx.annotation.j
    public T B() {
        return (T) J0(DownsampleStrategy.f41496c, new s());
    }

    @n0
    @androidx.annotation.j
    public T B0(int i10, int i11) {
        if (this.f41854w) {
            return (T) clone().B0(i10, i11);
        }
        this.f41843l = i10;
        this.f41842k = i11;
        this.f41833b |= 512;
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public T C(@n0 DecodeFormat decodeFormat) {
        m.e(decodeFormat);
        return (T) N0(o.f41572g, decodeFormat).N0(com.bumptech.glide.load.resource.gif.i.f41714a, decodeFormat);
    }

    @n0
    @androidx.annotation.j
    public T D(@f0(from = 0) long j10) {
        return (T) N0(VideoDecoder.f41512g, Long.valueOf(j10));
    }

    @n0
    public final com.bumptech.glide.load.engine.h E() {
        return this.f41835d;
    }

    @n0
    @androidx.annotation.j
    public T E0(@v int i10) {
        if (this.f41854w) {
            return (T) clone().E0(i10);
        }
        this.f41840i = i10;
        int i11 = this.f41833b | 128;
        this.f41839h = null;
        this.f41833b = i11 & (-65);
        return (T) M0();
    }

    public final int F() {
        return this.f41838g;
    }

    @n0
    @androidx.annotation.j
    public T F0(@p0 Drawable drawable) {
        if (this.f41854w) {
            return (T) clone().F0(drawable);
        }
        this.f41839h = drawable;
        int i10 = this.f41833b | 64;
        this.f41840i = 0;
        this.f41833b = i10 & (-129);
        return (T) M0();
    }

    @p0
    public final Drawable G() {
        return this.f41837f;
    }

    @p0
    public final Drawable H() {
        return this.f41847p;
    }

    @n0
    @androidx.annotation.j
    public T H0(@n0 Priority priority) {
        if (this.f41854w) {
            return (T) clone().H0(priority);
        }
        this.f41836e = (Priority) m.e(priority);
        this.f41833b |= 8;
        return (T) M0();
    }

    T I0(@n0 com.bumptech.glide.load.e<?> eVar) {
        if (this.f41854w) {
            return (T) clone().I0(eVar);
        }
        this.f41849r.e(eVar);
        return (T) M0();
    }

    public final int J() {
        return this.f41848q;
    }

    public final boolean K() {
        return this.f41856y;
    }

    @n0
    public final com.bumptech.glide.load.f M() {
        return this.f41849r;
    }

    @n0
    protected final T M0() {
        if (this.f41852u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) L0();
    }

    @n0
    @androidx.annotation.j
    public <Y> T N0(@n0 com.bumptech.glide.load.e<Y> eVar, @n0 Y y10) {
        if (this.f41854w) {
            return (T) clone().N0(eVar, y10);
        }
        m.e(eVar);
        m.e(y10);
        this.f41849r.f(eVar, y10);
        return (T) M0();
    }

    public final int O() {
        return this.f41842k;
    }

    @n0
    @androidx.annotation.j
    public T O0(@n0 com.bumptech.glide.load.c cVar) {
        if (this.f41854w) {
            return (T) clone().O0(cVar);
        }
        this.f41844m = (com.bumptech.glide.load.c) m.e(cVar);
        this.f41833b |= 1024;
        return (T) M0();
    }

    public final int P() {
        return this.f41843l;
    }

    @n0
    @androidx.annotation.j
    public T P0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f41854w) {
            return (T) clone().P0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f41834c = f10;
        this.f41833b |= 2;
        return (T) M0();
    }

    @p0
    public final Drawable Q() {
        return this.f41839h;
    }

    @n0
    @androidx.annotation.j
    public T Q0(boolean z10) {
        if (this.f41854w) {
            return (T) clone().Q0(true);
        }
        this.f41841j = !z10;
        this.f41833b |= 256;
        return (T) M0();
    }

    public final int R() {
        return this.f41840i;
    }

    @n0
    @androidx.annotation.j
    public T R0(@p0 Resources.Theme theme) {
        if (this.f41854w) {
            return (T) clone().R0(theme);
        }
        this.f41853v = theme;
        if (theme != null) {
            this.f41833b |= 32768;
            return (T) N0(com.bumptech.glide.load.resource.drawable.g.f41650b, theme);
        }
        this.f41833b &= -32769;
        return (T) I0(com.bumptech.glide.load.resource.drawable.g.f41650b);
    }

    @n0
    public final Priority S() {
        return this.f41836e;
    }

    @n0
    @androidx.annotation.j
    public T S0(@f0(from = 0) int i10) {
        return (T) N0(com.bumptech.glide.load.model.stream.b.f41405b, Integer.valueOf(i10));
    }

    @n0
    public final Class<?> T() {
        return this.f41851t;
    }

    @n0
    @androidx.annotation.j
    public T T0(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        return (T) U0(iVar, true);
    }

    @n0
    public final com.bumptech.glide.load.c U() {
        return this.f41844m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    T U0(@n0 com.bumptech.glide.load.i<Bitmap> iVar, boolean z10) {
        if (this.f41854w) {
            return (T) clone().U0(iVar, z10);
        }
        q qVar = new q(iVar, z10);
        X0(Bitmap.class, iVar, z10);
        X0(Drawable.class, qVar, z10);
        X0(BitmapDrawable.class, qVar.c(), z10);
        X0(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(iVar), z10);
        return (T) M0();
    }

    public final float V() {
        return this.f41834c;
    }

    @n0
    @androidx.annotation.j
    final T V0(@n0 DownsampleStrategy downsampleStrategy, @n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        if (this.f41854w) {
            return (T) clone().V0(downsampleStrategy, iVar);
        }
        t(downsampleStrategy);
        return (T) T0(iVar);
    }

    @n0
    @androidx.annotation.j
    public <Y> T W0(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        return (T) X0(cls, iVar, true);
    }

    @p0
    public final Resources.Theme X() {
        return this.f41853v;
    }

    @n0
    <Y> T X0(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar, boolean z10) {
        if (this.f41854w) {
            return (T) clone().X0(cls, iVar, z10);
        }
        m.e(cls);
        m.e(iVar);
        this.f41850s.put(cls, iVar);
        int i10 = this.f41833b | 2048;
        this.f41846o = true;
        int i11 = i10 | 65536;
        this.f41833b = i11;
        this.f41857z = false;
        if (z10) {
            this.f41833b = i11 | 131072;
            this.f41845n = true;
        }
        return (T) M0();
    }

    @n0
    public final Map<Class<?>, com.bumptech.glide.load.i<?>> Y() {
        return this.f41850s;
    }

    @n0
    @androidx.annotation.j
    public T Y0(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        if (iVarArr.length > 1) {
            return (T) U0(new com.bumptech.glide.load.d(iVarArr), true);
        }
        return iVarArr.length == 1 ? (T) T0(iVarArr[0]) : (T) M0();
    }

    public final boolean Z() {
        return this.A;
    }

    @n0
    @androidx.annotation.j
    @Deprecated
    public T Z0(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        return (T) U0(new com.bumptech.glide.load.d(iVarArr), true);
    }

    public final boolean b0() {
        return this.f41855x;
    }

    protected final boolean c0() {
        return this.f41854w;
    }

    @n0
    @androidx.annotation.j
    public T c1(boolean z10) {
        if (this.f41854w) {
            return (T) clone().c1(z10);
        }
        this.A = z10;
        this.f41833b |= 1048576;
        return (T) M0();
    }

    public final boolean d0() {
        return j0(4);
    }

    @n0
    @androidx.annotation.j
    public T d1(boolean z10) {
        if (this.f41854w) {
            return (T) clone().d1(z10);
        }
        this.f41855x = z10;
        this.f41833b |= 262144;
        return (T) M0();
    }

    public final boolean e0(a<?> aVar) {
        return Float.compare(aVar.f41834c, this.f41834c) == 0 && this.f41838g == aVar.f41838g && com.bumptech.glide.util.o.e(this.f41837f, aVar.f41837f) && this.f41840i == aVar.f41840i && com.bumptech.glide.util.o.e(this.f41839h, aVar.f41839h) && this.f41848q == aVar.f41848q && com.bumptech.glide.util.o.e(this.f41847p, aVar.f41847p) && this.f41841j == aVar.f41841j && this.f41842k == aVar.f41842k && this.f41843l == aVar.f41843l && this.f41845n == aVar.f41845n && this.f41846o == aVar.f41846o && this.f41855x == aVar.f41855x && this.f41856y == aVar.f41856y && this.f41835d.equals(aVar.f41835d) && this.f41836e == aVar.f41836e && this.f41849r.equals(aVar.f41849r) && this.f41850s.equals(aVar.f41850s) && this.f41851t.equals(aVar.f41851t) && com.bumptech.glide.util.o.e(this.f41844m, aVar.f41844m) && com.bumptech.glide.util.o.e(this.f41853v, aVar.f41853v);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return e0((a) obj);
        }
        return false;
    }

    public final boolean f0() {
        return this.f41852u;
    }

    public final boolean g0() {
        return this.f41841j;
    }

    public final boolean h0() {
        return j0(8);
    }

    public int hashCode() {
        return com.bumptech.glide.util.o.r(this.f41853v, com.bumptech.glide.util.o.r(this.f41844m, com.bumptech.glide.util.o.r(this.f41851t, com.bumptech.glide.util.o.r(this.f41850s, com.bumptech.glide.util.o.r(this.f41849r, com.bumptech.glide.util.o.r(this.f41836e, com.bumptech.glide.util.o.r(this.f41835d, com.bumptech.glide.util.o.t(this.f41856y, com.bumptech.glide.util.o.t(this.f41855x, com.bumptech.glide.util.o.t(this.f41846o, com.bumptech.glide.util.o.t(this.f41845n, com.bumptech.glide.util.o.q(this.f41843l, com.bumptech.glide.util.o.q(this.f41842k, com.bumptech.glide.util.o.t(this.f41841j, com.bumptech.glide.util.o.r(this.f41847p, com.bumptech.glide.util.o.q(this.f41848q, com.bumptech.glide.util.o.r(this.f41839h, com.bumptech.glide.util.o.q(this.f41840i, com.bumptech.glide.util.o.r(this.f41837f, com.bumptech.glide.util.o.q(this.f41838g, com.bumptech.glide.util.o.n(this.f41834c)))))))))))))))))))));
    }

    @n0
    @androidx.annotation.j
    public T i(@n0 a<?> aVar) {
        if (this.f41854w) {
            return (T) clone().i(aVar);
        }
        if (k0(aVar.f41833b, 2)) {
            this.f41834c = aVar.f41834c;
        }
        if (k0(aVar.f41833b, 262144)) {
            this.f41855x = aVar.f41855x;
        }
        if (k0(aVar.f41833b, 1048576)) {
            this.A = aVar.A;
        }
        if (k0(aVar.f41833b, 4)) {
            this.f41835d = aVar.f41835d;
        }
        if (k0(aVar.f41833b, 8)) {
            this.f41836e = aVar.f41836e;
        }
        if (k0(aVar.f41833b, 16)) {
            this.f41837f = aVar.f41837f;
            this.f41838g = 0;
            this.f41833b &= -33;
        }
        if (k0(aVar.f41833b, 32)) {
            this.f41838g = aVar.f41838g;
            this.f41837f = null;
            this.f41833b &= -17;
        }
        if (k0(aVar.f41833b, 64)) {
            this.f41839h = aVar.f41839h;
            this.f41840i = 0;
            this.f41833b &= -129;
        }
        if (k0(aVar.f41833b, 128)) {
            this.f41840i = aVar.f41840i;
            this.f41839h = null;
            this.f41833b &= -65;
        }
        if (k0(aVar.f41833b, 256)) {
            this.f41841j = aVar.f41841j;
        }
        if (k0(aVar.f41833b, 512)) {
            this.f41843l = aVar.f41843l;
            this.f41842k = aVar.f41842k;
        }
        if (k0(aVar.f41833b, 1024)) {
            this.f41844m = aVar.f41844m;
        }
        if (k0(aVar.f41833b, 4096)) {
            this.f41851t = aVar.f41851t;
        }
        if (k0(aVar.f41833b, 8192)) {
            this.f41847p = aVar.f41847p;
            this.f41848q = 0;
            this.f41833b &= -16385;
        }
        if (k0(aVar.f41833b, 16384)) {
            this.f41848q = aVar.f41848q;
            this.f41847p = null;
            this.f41833b &= -8193;
        }
        if (k0(aVar.f41833b, 32768)) {
            this.f41853v = aVar.f41853v;
        }
        if (k0(aVar.f41833b, 65536)) {
            this.f41846o = aVar.f41846o;
        }
        if (k0(aVar.f41833b, 131072)) {
            this.f41845n = aVar.f41845n;
        }
        if (k0(aVar.f41833b, 2048)) {
            this.f41850s.putAll(aVar.f41850s);
            this.f41857z = aVar.f41857z;
        }
        if (k0(aVar.f41833b, 524288)) {
            this.f41856y = aVar.f41856y;
        }
        if (!this.f41846o) {
            this.f41850s.clear();
            int i10 = this.f41833b & (-2049);
            this.f41845n = false;
            this.f41833b = i10 & (-131073);
            this.f41857z = true;
        }
        this.f41833b |= aVar.f41833b;
        this.f41849r.d(aVar.f41849r);
        return (T) M0();
    }

    boolean i0() {
        return this.f41857z;
    }

    @n0
    public T j() {
        if (this.f41852u && !this.f41854w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f41854w = true;
        return (T) q0();
    }

    @n0
    @androidx.annotation.j
    public T k() {
        return (T) V0(DownsampleStrategy.f41498e, new l());
    }

    @n0
    @androidx.annotation.j
    public T l() {
        return (T) J0(DownsampleStrategy.f41497d, new com.bumptech.glide.load.resource.bitmap.m());
    }

    public final boolean l0() {
        return j0(256);
    }

    @n0
    @androidx.annotation.j
    public T m() {
        return (T) V0(DownsampleStrategy.f41497d, new n());
    }

    public final boolean m0() {
        return this.f41846o;
    }

    @Override // 
    @androidx.annotation.j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            com.bumptech.glide.load.f fVar = new com.bumptech.glide.load.f();
            t10.f41849r = fVar;
            fVar.d(this.f41849r);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t10.f41850s = bVar;
            bVar.putAll(this.f41850s);
            t10.f41852u = false;
            t10.f41854w = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean n0() {
        return this.f41845n;
    }

    @n0
    @androidx.annotation.j
    public T o(@n0 Class<?> cls) {
        if (this.f41854w) {
            return (T) clone().o(cls);
        }
        this.f41851t = (Class) m.e(cls);
        this.f41833b |= 4096;
        return (T) M0();
    }

    public final boolean o0() {
        return j0(2048);
    }

    @n0
    @androidx.annotation.j
    public T p() {
        return (T) N0(o.f41576k, Boolean.FALSE);
    }

    public final boolean p0() {
        return com.bumptech.glide.util.o.x(this.f41843l, this.f41842k);
    }

    @n0
    @androidx.annotation.j
    public T q(@n0 com.bumptech.glide.load.engine.h hVar) {
        if (this.f41854w) {
            return (T) clone().q(hVar);
        }
        this.f41835d = (com.bumptech.glide.load.engine.h) m.e(hVar);
        this.f41833b |= 4;
        return (T) M0();
    }

    @n0
    public T q0() {
        this.f41852u = true;
        return (T) L0();
    }

    @n0
    @androidx.annotation.j
    public T r() {
        return (T) N0(com.bumptech.glide.load.resource.gif.i.f41715b, Boolean.TRUE);
    }

    @n0
    @androidx.annotation.j
    public T r0(boolean z10) {
        if (this.f41854w) {
            return (T) clone().r0(z10);
        }
        this.f41856y = z10;
        this.f41833b |= 524288;
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public T s() {
        if (this.f41854w) {
            return (T) clone().s();
        }
        this.f41850s.clear();
        int i10 = this.f41833b & (-2049);
        this.f41845n = false;
        this.f41846o = false;
        this.f41833b = (i10 & (-131073)) | 65536;
        this.f41857z = true;
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public T s0() {
        return (T) y0(DownsampleStrategy.f41498e, new l());
    }

    @n0
    @androidx.annotation.j
    public T t(@n0 DownsampleStrategy downsampleStrategy) {
        return (T) N0(DownsampleStrategy.f41501h, m.e(downsampleStrategy));
    }

    @n0
    @androidx.annotation.j
    public T t0() {
        return (T) w0(DownsampleStrategy.f41497d, new com.bumptech.glide.load.resource.bitmap.m());
    }

    @n0
    @androidx.annotation.j
    public T u(@n0 Bitmap.CompressFormat compressFormat) {
        return (T) N0(com.bumptech.glide.load.resource.bitmap.e.f41554c, m.e(compressFormat));
    }

    @n0
    @androidx.annotation.j
    public T u0() {
        return (T) y0(DownsampleStrategy.f41498e, new n());
    }

    @n0
    @androidx.annotation.j
    public T v(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        return (T) N0(com.bumptech.glide.load.resource.bitmap.e.f41553b, Integer.valueOf(i10));
    }

    @n0
    @androidx.annotation.j
    public T v0() {
        return (T) w0(DownsampleStrategy.f41496c, new s());
    }

    @n0
    @androidx.annotation.j
    public T w(@v int i10) {
        if (this.f41854w) {
            return (T) clone().w(i10);
        }
        this.f41838g = i10;
        int i11 = this.f41833b | 32;
        this.f41837f = null;
        this.f41833b = i11 & (-17);
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public T x(@p0 Drawable drawable) {
        if (this.f41854w) {
            return (T) clone().x(drawable);
        }
        this.f41837f = drawable;
        int i10 = this.f41833b | 16;
        this.f41838g = 0;
        this.f41833b = i10 & (-33);
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public T x0(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        return (T) U0(iVar, false);
    }

    @n0
    @androidx.annotation.j
    public T y(@v int i10) {
        if (this.f41854w) {
            return (T) clone().y(i10);
        }
        this.f41848q = i10;
        int i11 = this.f41833b | 16384;
        this.f41847p = null;
        this.f41833b = i11 & (-8193);
        return (T) M0();
    }

    @n0
    final T y0(@n0 DownsampleStrategy downsampleStrategy, @n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        if (this.f41854w) {
            return (T) clone().y0(downsampleStrategy, iVar);
        }
        t(downsampleStrategy);
        return (T) U0(iVar, false);
    }

    @n0
    @androidx.annotation.j
    public T z(@p0 Drawable drawable) {
        if (this.f41854w) {
            return (T) clone().z(drawable);
        }
        this.f41847p = drawable;
        int i10 = this.f41833b | 8192;
        this.f41848q = 0;
        this.f41833b = i10 & (-16385);
        return (T) M0();
    }

    @n0
    @androidx.annotation.j
    public <Y> T z0(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        return (T) X0(cls, iVar, false);
    }
}
