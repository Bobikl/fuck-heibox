package com.max.hbcustomview.Shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.core.view.j1;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Shimmer.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68849v = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float[] f68850a = new float[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f68851b = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RectF f68852c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f68853d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    int f68854e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    int f68855f = 1291845631;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f68856g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f68857h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f68858i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f68859j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f68860k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f68861l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f68862m = 0.5f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f68863n = 20.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f68864o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f68865p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f68866q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f68867r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f68868s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f68869t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f68870u;

    /* JADX INFO: renamed from: com.max.hbcustomview.Shimmer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Shimmer.java */
    public static class C0556a extends b<C0556a> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0556a() {
            this.f68871a.f68866q = true;
        }

        @Override // com.max.hbcustomview.Shimmer.a.b
        public /* bridge */ /* synthetic */ b e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ha, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : w();
        }

        public C0556a w() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Shimmer.java */
    public static abstract class b<T extends b<T>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f68871a = new a();

        private static float b(float f10, float f11, float f12) {
            Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.f32191cb, new Class[]{cls, cls, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : Math.min(f11, Math.max(f10, f12));
        }

        public a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32168bb, new Class[0], a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f68871a.c();
            this.f68871a.d();
            return this.f68871a;
        }

        public T c(Context context, AttributeSet attributeSet) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, 5000, new Class[]{Context.class, AttributeSet.class}, b.class);
            return patchProxyResultProxy.isSupported ? (T) patchProxyResultProxy.result : (T) d(context.obtainStyledAttributes(attributeSet, R.styleable.Q2, 0, 0));
        }

        T d(TypedArray typedArray) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 5001, new Class[]{TypedArray.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            int i10 = R.styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            if (typedArray.hasValue(i10)) {
                h(typedArray.getBoolean(i10, this.f68871a.f68864o));
            }
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_auto_start;
            if (typedArray.hasValue(i11)) {
                f(typedArray.getBoolean(i11, this.f68871a.f68865p));
            }
            int i12 = R.styleable.ShimmerFrameLayout_shimmer_base_alpha;
            if (typedArray.hasValue(i12)) {
                g(typedArray.getFloat(i12, 0.3f));
            }
            int i13 = R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            if (typedArray.hasValue(i13)) {
                o(typedArray.getFloat(i13, 1.0f));
            }
            int i14 = R.styleable.ShimmerFrameLayout_shimmer_duration;
            if (typedArray.hasValue(i14)) {
                k(typedArray.getInt(i14, (int) this.f68871a.f68869t));
            }
            int i15 = R.styleable.ShimmerFrameLayout_shimmer_repeat_count;
            if (typedArray.hasValue(i15)) {
                q(typedArray.getInt(i15, this.f68871a.f68867r));
            }
            int i16 = R.styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            if (typedArray.hasValue(i16)) {
                r(typedArray.getInt(i16, (int) this.f68871a.f68870u));
            }
            int i17 = R.styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            if (typedArray.hasValue(i17)) {
                s(typedArray.getInt(i17, this.f68871a.f68868s));
            }
            int i18 = R.styleable.ShimmerFrameLayout_shimmer_direction;
            if (typedArray.hasValue(i18)) {
                int i19 = typedArray.getInt(i18, this.f68871a.f68853d);
                if (i19 == 1) {
                    i(1);
                } else if (i19 == 2) {
                    i(2);
                } else if (i19 != 3) {
                    i(0);
                } else {
                    i(3);
                }
            }
            int i20 = R.styleable.ShimmerFrameLayout_shimmer_shape;
            if (typedArray.hasValue(i20)) {
                if (typedArray.getInt(i20, this.f68871a.f68856g) != 1) {
                    t(0);
                } else {
                    t(1);
                }
            }
            int i21 = R.styleable.ShimmerFrameLayout_shimmer_dropoff;
            if (typedArray.hasValue(i21)) {
                j(typedArray.getFloat(i21, this.f68871a.f68862m));
            }
            int i22 = R.styleable.ShimmerFrameLayout_shimmer_fixed_width;
            if (typedArray.hasValue(i22)) {
                m(typedArray.getDimensionPixelSize(i22, this.f68871a.f68857h));
            }
            int i23 = R.styleable.ShimmerFrameLayout_shimmer_fixed_height;
            if (typedArray.hasValue(i23)) {
                l(typedArray.getDimensionPixelSize(i23, this.f68871a.f68858i));
            }
            int i24 = R.styleable.ShimmerFrameLayout_shimmer_intensity;
            if (typedArray.hasValue(i24)) {
                p(typedArray.getFloat(i24, this.f68871a.f68861l));
            }
            int i25 = R.styleable.ShimmerFrameLayout_shimmer_width_ratio;
            if (typedArray.hasValue(i25)) {
                v(typedArray.getFloat(i25, this.f68871a.f68859j));
            }
            int i26 = R.styleable.ShimmerFrameLayout_shimmer_height_ratio;
            if (typedArray.hasValue(i26)) {
                n(typedArray.getFloat(i26, this.f68871a.f68860k));
            }
            int i27 = R.styleable.ShimmerFrameLayout_shimmer_tilt;
            if (typedArray.hasValue(i27)) {
                u(typedArray.getFloat(i27, this.f68871a.f68863n));
            }
            return (T) e();
        }

        public abstract T e();

        public T f(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Wa, new Class[]{Boolean.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68865p = z10;
            return (T) e();
        }

        public T g(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Ta, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            int iB = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            a aVar = this.f68871a;
            aVar.f68855f = (iB << 24) | (aVar.f68855f & 16777215);
            return (T) e();
        }

        public T h(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Va, new Class[]{Boolean.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68864o = z10;
            return (T) e();
        }

        public T i(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 5002, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68853d = i10;
            return (T) e();
        }

        public T j(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Ra, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (f10 >= 0.0f) {
                this.f68871a.f68862m = f10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
        }

        public T k(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.f32145ab, new Class[]{Long.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (j10 >= 0) {
                this.f68871a.f68869t = j10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j10);
        }

        public T l(@t0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Na, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (i10 >= 0) {
                this.f68871a.f68858i = i10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid height: " + i10);
        }

        public T m(@t0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 5004, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (i10 >= 0) {
                this.f68871a.f68857h = i10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid width: " + i10);
        }

        public T n(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Pa, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (f10 >= 0.0f) {
                this.f68871a.f68860k = f10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f10);
        }

        public T o(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 5012, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            int iB = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            a aVar = this.f68871a;
            aVar.f68854e = (iB << 24) | (aVar.f68854e & 16777215);
            return (T) e();
        }

        public T p(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Qa, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (f10 >= 0.0f) {
                this.f68871a.f68861l = f10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public T q(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Xa, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68867r = i10;
            return (T) e();
        }

        public T r(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.Za, new Class[]{Long.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (j10 >= 0) {
                this.f68871a.f68870u = j10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j10);
        }

        public T s(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ya, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68868s = i10;
            return (T) e();
        }

        public T t(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 5003, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68856g = i10;
            return (T) e();
        }

        public T u(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Sa, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            this.f68871a.f68863n = f10;
            return (T) e();
        }

        public T v(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Oa, new Class[]{Float.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (f10 >= 0.0f) {
                this.f68871a.f68859j = f10;
                return (T) e();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f10);
        }
    }

    /* JADX INFO: compiled from: Shimmer.java */
    public static class c extends b<c> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            this.f68871a.f68866q = false;
        }

        @Override // com.max.hbcustomview.Shimmer.a.b
        /* bridge */ /* synthetic */ b d(TypedArray typedArray) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.f.f32284gb, new Class[]{TypedArray.class}, b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : w(typedArray);
        }

        @Override // com.max.hbcustomview.Shimmer.a.b
        public /* bridge */ /* synthetic */ b e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32307hb, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : x();
        }

        c w(TypedArray typedArray) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.f.f32261fb, new Class[]{TypedArray.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            super.d(typedArray);
            int i10 = R.styleable.ShimmerFrameLayout_shimmer_base_color;
            if (typedArray.hasValue(i10)) {
                y(typedArray.getColor(i10, this.f68871a.f68855f));
            }
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_highlight_color;
            if (typedArray.hasValue(i11)) {
                z(typedArray.getColor(i11, this.f68871a.f68854e));
            }
            return x();
        }

        public c x() {
            return this;
        }

        public c y(@l int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32238eb, new Class[]{Integer.TYPE}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            a aVar = this.f68871a;
            aVar.f68855f = (i10 & 16777215) | (aVar.f68855f & j1.f21601t);
            return x();
        }

        public c z(@l int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32215db, new Class[]{Integer.TYPE}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            this.f68871a.f68854e = i10;
            return x();
        }
    }

    /* JADX INFO: compiled from: Shimmer.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f68872w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f68873x0 = 1;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f68874y0 = 2;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f68875z0 = 3;
    }

    /* JADX INFO: compiled from: Shimmer.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
        public static final int A0 = 0;
        public static final int B0 = 1;
    }

    a() {
    }

    int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ea, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = this.f68858i;
        return i11 > 0 ? i11 : Math.round(this.f68860k * i10);
    }

    void b(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ga, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        double dMax = Math.max(i10, i11);
        int iRound = Math.round(((float) ((dMax / Math.sin(1.5707963267948966d - Math.toRadians(this.f68863n % 90.0f))) - dMax)) / 2.0f) * 3;
        float f10 = -iRound;
        this.f68852c.set(f10, f10, e(i10) + iRound, a(i11) + iRound);
    }

    void c() {
        if (this.f68856g != 1) {
            int[] iArr = this.f68851b;
            int i10 = this.f68855f;
            iArr[0] = i10;
            int i11 = this.f68854e;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
            return;
        }
        int[] iArr2 = this.f68851b;
        int i12 = this.f68854e;
        iArr2[0] = i12;
        iArr2[1] = i12;
        int i13 = this.f68855f;
        iArr2[2] = i13;
        iArr2[3] = i13;
    }

    void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f68856g != 1) {
            this.f68850a[0] = Math.max(((1.0f - this.f68861l) - this.f68862m) / 2.0f, 0.0f);
            this.f68850a[1] = Math.max(((1.0f - this.f68861l) - 0.001f) / 2.0f, 0.0f);
            this.f68850a[2] = Math.min(((this.f68861l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f68850a[3] = Math.min(((this.f68861l + 1.0f) + this.f68862m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f68850a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f68861l, 1.0f);
        this.f68850a[2] = Math.min(this.f68861l + this.f68862m, 1.0f);
        this.f68850a[3] = 1.0f;
    }

    int e(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Da, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = this.f68857h;
        return i11 > 0 ? i11 : Math.round(this.f68859j * i10);
    }
}
