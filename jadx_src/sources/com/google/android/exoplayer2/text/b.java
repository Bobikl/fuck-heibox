package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.common.base.s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.google.android.exoplayer2.i {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 1;
    public static final int E = 2;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int J = 4;
    private static final int K = 5;
    private static final int L = 6;
    private static final int M = 7;
    private static final int N = 8;
    private static final int O = 9;
    private static final int P = 10;
    private static final int Q = 11;
    private static final int R = 12;
    private static final int S = 13;
    private static final int T = 14;
    private static final int U = 15;
    private static final int V = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f49366t = -3.4028235E38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f49367u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f49368v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f49369w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f49370x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f49371y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f49372z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final CharSequence f49373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Layout.Alignment f49374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Layout.Alignment f49375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Bitmap f49376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f49377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f49380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f49381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f49382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f49383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f49384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f49385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f49386o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f49387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f49388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f49389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f49365s = new c().A("").a();
    public static final com.google.android.exoplayer2.i.a<b> W = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.text.a
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return b.d(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0390b {
    }

    /* JADX INFO: compiled from: Cue.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private CharSequence f49390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Bitmap f49391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Layout.Alignment f49392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Layout.Alignment f49393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f49394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f49395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f49397h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49398i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f49399j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f49400k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f49401l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f49402m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f49403n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @androidx.annotation.l
        private int f49404o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f49405p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f49406q;

        public c() {
            this.f49390a = null;
            this.f49391b = null;
            this.f49392c = null;
            this.f49393d = null;
            this.f49394e = -3.4028235E38f;
            this.f49395f = Integer.MIN_VALUE;
            this.f49396g = Integer.MIN_VALUE;
            this.f49397h = -3.4028235E38f;
            this.f49398i = Integer.MIN_VALUE;
            this.f49399j = Integer.MIN_VALUE;
            this.f49400k = -3.4028235E38f;
            this.f49401l = -3.4028235E38f;
            this.f49402m = -3.4028235E38f;
            this.f49403n = false;
            this.f49404o = j1.f21601t;
            this.f49405p = Integer.MIN_VALUE;
        }

        private c(b bVar) {
            this.f49390a = bVar.f49373b;
            this.f49391b = bVar.f49376e;
            this.f49392c = bVar.f49374c;
            this.f49393d = bVar.f49375d;
            this.f49394e = bVar.f49377f;
            this.f49395f = bVar.f49378g;
            this.f49396g = bVar.f49379h;
            this.f49397h = bVar.f49380i;
            this.f49398i = bVar.f49381j;
            this.f49399j = bVar.f49386o;
            this.f49400k = bVar.f49387p;
            this.f49401l = bVar.f49382k;
            this.f49402m = bVar.f49383l;
            this.f49403n = bVar.f49384m;
            this.f49404o = bVar.f49385n;
            this.f49405p = bVar.f49388q;
            this.f49406q = bVar.f49389r;
        }

        public c A(CharSequence charSequence) {
            this.f49390a = charSequence;
            return this;
        }

        public c B(@p0 Layout.Alignment alignment) {
            this.f49392c = alignment;
            return this;
        }

        public c C(float f10, int i10) {
            this.f49400k = f10;
            this.f49399j = i10;
            return this;
        }

        public c D(int i10) {
            this.f49405p = i10;
            return this;
        }

        public c E(@androidx.annotation.l int i10) {
            this.f49404o = i10;
            this.f49403n = true;
            return this;
        }

        public b a() {
            return new b(this.f49390a, this.f49392c, this.f49393d, this.f49391b, this.f49394e, this.f49395f, this.f49396g, this.f49397h, this.f49398i, this.f49399j, this.f49400k, this.f49401l, this.f49402m, this.f49403n, this.f49404o, this.f49405p, this.f49406q);
        }

        public c b() {
            this.f49403n = false;
            return this;
        }

        @p0
        @Pure
        public Bitmap c() {
            return this.f49391b;
        }

        @Pure
        public float d() {
            return this.f49402m;
        }

        @Pure
        public float e() {
            return this.f49394e;
        }

        @Pure
        public int f() {
            return this.f49396g;
        }

        @Pure
        public int g() {
            return this.f49395f;
        }

        @Pure
        public float h() {
            return this.f49397h;
        }

        @Pure
        public int i() {
            return this.f49398i;
        }

        @Pure
        public float j() {
            return this.f49401l;
        }

        @p0
        @Pure
        public CharSequence k() {
            return this.f49390a;
        }

        @p0
        @Pure
        public Layout.Alignment l() {
            return this.f49392c;
        }

        @Pure
        public float m() {
            return this.f49400k;
        }

        @Pure
        public int n() {
            return this.f49399j;
        }

        @Pure
        public int o() {
            return this.f49405p;
        }

        @androidx.annotation.l
        @Pure
        public int p() {
            return this.f49404o;
        }

        public boolean q() {
            return this.f49403n;
        }

        public c r(Bitmap bitmap) {
            this.f49391b = bitmap;
            return this;
        }

        public c s(float f10) {
            this.f49402m = f10;
            return this;
        }

        public c t(float f10, int i10) {
            this.f49394e = f10;
            this.f49395f = i10;
            return this;
        }

        public c u(int i10) {
            this.f49396g = i10;
            return this;
        }

        public c v(@p0 Layout.Alignment alignment) {
            this.f49393d = alignment;
            return this;
        }

        public c w(float f10) {
            this.f49397h = f10;
            return this;
        }

        public c x(int i10) {
            this.f49398i = i10;
            return this;
        }

        public c y(float f10) {
            this.f49406q = f10;
            return this;
        }

        public c z(float f10) {
            this.f49401l = f10;
            return this;
        }
    }

    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Deprecated
    public b(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @Deprecated
    public b(CharSequence charSequence, @p0 Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, j1.f21601t);
    }

    @Deprecated
    public b(CharSequence charSequence, @p0 Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, null, f10, i10, i11, f11, i12, i13, f13, f12, -3.4028235E38f, false, j1.f21601t, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public b(CharSequence charSequence, @p0 Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, f12, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
    }

    private b(@p0 CharSequence charSequence, @p0 Layout.Alignment alignment, @p0 Layout.Alignment alignment2, @p0 Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            com.google.android.exoplayer2.util.a.g(bitmap);
        } else {
            com.google.android.exoplayer2.util.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f49373b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f49373b = charSequence.toString();
        } else {
            this.f49373b = null;
        }
        this.f49374c = alignment;
        this.f49375d = alignment2;
        this.f49376e = bitmap;
        this.f49377f = f10;
        this.f49378g = i10;
        this.f49379h = i11;
        this.f49380i = f11;
        this.f49381j = i12;
        this.f49382k = f13;
        this.f49383l = f14;
        this.f49384m = z10;
        this.f49385n = i14;
        this.f49386o = i13;
        this.f49387p = f12;
        this.f49388q = i15;
        this.f49389r = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(Bundle bundle) {
        c cVar = new c();
        CharSequence charSequence = bundle.getCharSequence(e(0));
        if (charSequence != null) {
            cVar.A(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(e(1));
        if (alignment != null) {
            cVar.B(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(e(2));
        if (alignment2 != null) {
            cVar.v(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(e(3));
        if (bitmap != null) {
            cVar.r(bitmap);
        }
        if (bundle.containsKey(e(4)) && bundle.containsKey(e(5))) {
            cVar.t(bundle.getFloat(e(4)), bundle.getInt(e(5)));
        }
        if (bundle.containsKey(e(6))) {
            cVar.u(bundle.getInt(e(6)));
        }
        if (bundle.containsKey(e(7))) {
            cVar.w(bundle.getFloat(e(7)));
        }
        if (bundle.containsKey(e(8))) {
            cVar.x(bundle.getInt(e(8)));
        }
        if (bundle.containsKey(e(10)) && bundle.containsKey(e(9))) {
            cVar.C(bundle.getFloat(e(10)), bundle.getInt(e(9)));
        }
        if (bundle.containsKey(e(11))) {
            cVar.z(bundle.getFloat(e(11)));
        }
        if (bundle.containsKey(e(12))) {
            cVar.s(bundle.getFloat(e(12)));
        }
        if (bundle.containsKey(e(13))) {
            cVar.E(bundle.getInt(e(13)));
        }
        if (!bundle.getBoolean(e(14), false)) {
            cVar.b();
        }
        if (bundle.containsKey(e(15))) {
            cVar.D(bundle.getInt(e(15)));
        }
        if (bundle.containsKey(e(16))) {
            cVar.y(bundle.getFloat(e(16)));
        }
        return cVar.a();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(e(0), this.f49373b);
        bundle.putSerializable(e(1), this.f49374c);
        bundle.putSerializable(e(2), this.f49375d);
        bundle.putParcelable(e(3), this.f49376e);
        bundle.putFloat(e(4), this.f49377f);
        bundle.putInt(e(5), this.f49378g);
        bundle.putInt(e(6), this.f49379h);
        bundle.putFloat(e(7), this.f49380i);
        bundle.putInt(e(8), this.f49381j);
        bundle.putInt(e(9), this.f49386o);
        bundle.putFloat(e(10), this.f49387p);
        bundle.putFloat(e(11), this.f49382k);
        bundle.putFloat(e(12), this.f49383l);
        bundle.putBoolean(e(14), this.f49384m);
        bundle.putInt(e(13), this.f49385n);
        bundle.putInt(e(15), this.f49388q);
        bundle.putFloat(e(16), this.f49389r);
        return bundle;
    }

    public c c() {
        return new c();
    }

    public boolean equals(@p0 Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f49373b, bVar.f49373b) && this.f49374c == bVar.f49374c && this.f49375d == bVar.f49375d && ((bitmap = this.f49376e) != null ? !((bitmap2 = bVar.f49376e) == null || !bitmap.sameAs(bitmap2)) : bVar.f49376e == null) && this.f49377f == bVar.f49377f && this.f49378g == bVar.f49378g && this.f49379h == bVar.f49379h && this.f49380i == bVar.f49380i && this.f49381j == bVar.f49381j && this.f49382k == bVar.f49382k && this.f49383l == bVar.f49383l && this.f49384m == bVar.f49384m && this.f49385n == bVar.f49385n && this.f49386o == bVar.f49386o && this.f49387p == bVar.f49387p && this.f49388q == bVar.f49388q && this.f49389r == bVar.f49389r;
    }

    public int hashCode() {
        return s.b(this.f49373b, this.f49374c, this.f49375d, this.f49376e, Float.valueOf(this.f49377f), Integer.valueOf(this.f49378g), Integer.valueOf(this.f49379h), Float.valueOf(this.f49380i), Integer.valueOf(this.f49381j), Float.valueOf(this.f49382k), Float.valueOf(this.f49383l), Boolean.valueOf(this.f49384m), Integer.valueOf(this.f49385n), Integer.valueOf(this.f49386o), Float.valueOf(this.f49387p), Integer.valueOf(this.f49388q), Float.valueOf(this.f49389r));
    }
}
