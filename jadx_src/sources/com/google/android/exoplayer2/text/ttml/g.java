package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.p0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = 0;
    private static final int D = 1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f49845t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f49846u = Float.MAX_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f49847v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f49848w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f49849x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f49850y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f49851z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private String f49852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49856e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f49862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private String f49863l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Layout.Alignment f49866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Layout.Alignment f49867p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.text.ttml.b f49869r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49857f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49858g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49859h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49860i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49861j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49864m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f49865n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f49868q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f49870s = Float.MAX_VALUE;

    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: TtmlStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private g s(@p0 g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f49854c && gVar.f49854c) {
                x(gVar.f49853b);
            }
            if (this.f49859h == -1) {
                this.f49859h = gVar.f49859h;
            }
            if (this.f49860i == -1) {
                this.f49860i = gVar.f49860i;
            }
            if (this.f49852a == null && (str = gVar.f49852a) != null) {
                this.f49852a = str;
            }
            if (this.f49857f == -1) {
                this.f49857f = gVar.f49857f;
            }
            if (this.f49858g == -1) {
                this.f49858g = gVar.f49858g;
            }
            if (this.f49865n == -1) {
                this.f49865n = gVar.f49865n;
            }
            if (this.f49866o == null && (alignment2 = gVar.f49866o) != null) {
                this.f49866o = alignment2;
            }
            if (this.f49867p == null && (alignment = gVar.f49867p) != null) {
                this.f49867p = alignment;
            }
            if (this.f49868q == -1) {
                this.f49868q = gVar.f49868q;
            }
            if (this.f49861j == -1) {
                this.f49861j = gVar.f49861j;
                this.f49862k = gVar.f49862k;
            }
            if (this.f49869r == null) {
                this.f49869r = gVar.f49869r;
            }
            if (this.f49870s == Float.MAX_VALUE) {
                this.f49870s = gVar.f49870s;
            }
            if (z10 && !this.f49856e && gVar.f49856e) {
                v(gVar.f49855d);
            }
            if (z10 && this.f49864m == -1 && (i10 = gVar.f49864m) != -1) {
                this.f49864m = i10;
            }
        }
        return this;
    }

    public g A(int i10) {
        this.f49861j = i10;
        return this;
    }

    public g B(@p0 String str) {
        this.f49863l = str;
        return this;
    }

    public g C(boolean z10) {
        this.f49860i = z10 ? 1 : 0;
        return this;
    }

    public g D(boolean z10) {
        this.f49857f = z10 ? 1 : 0;
        return this;
    }

    public g E(@p0 Layout.Alignment alignment) {
        this.f49867p = alignment;
        return this;
    }

    public g F(int i10) {
        this.f49865n = i10;
        return this;
    }

    public g G(int i10) {
        this.f49864m = i10;
        return this;
    }

    public g H(float f10) {
        this.f49870s = f10;
        return this;
    }

    public g I(@p0 Layout.Alignment alignment) {
        this.f49866o = alignment;
        return this;
    }

    public g J(boolean z10) {
        this.f49868q = z10 ? 1 : 0;
        return this;
    }

    public g K(@p0 com.google.android.exoplayer2.text.ttml.b bVar) {
        this.f49869r = bVar;
        return this;
    }

    public g L(boolean z10) {
        this.f49858g = z10 ? 1 : 0;
        return this;
    }

    public g a(@p0 g gVar) {
        return s(gVar, true);
    }

    public int b() {
        if (this.f49856e) {
            return this.f49855d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f49854c) {
            return this.f49853b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @p0
    public String d() {
        return this.f49852a;
    }

    public float e() {
        return this.f49862k;
    }

    public int f() {
        return this.f49861j;
    }

    @p0
    public String g() {
        return this.f49863l;
    }

    @p0
    public Layout.Alignment h() {
        return this.f49867p;
    }

    public int i() {
        return this.f49865n;
    }

    public int j() {
        return this.f49864m;
    }

    public float k() {
        return this.f49870s;
    }

    public int l() {
        int i10 = this.f49859h;
        if (i10 == -1 && this.f49860i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f49860i == 1 ? 2 : 0);
    }

    @p0
    public Layout.Alignment m() {
        return this.f49866o;
    }

    public boolean n() {
        return this.f49868q == 1;
    }

    @p0
    public com.google.android.exoplayer2.text.ttml.b o() {
        return this.f49869r;
    }

    public boolean p() {
        return this.f49856e;
    }

    public boolean q() {
        return this.f49854c;
    }

    public g r(@p0 g gVar) {
        return s(gVar, false);
    }

    public boolean t() {
        return this.f49857f == 1;
    }

    public boolean u() {
        return this.f49858g == 1;
    }

    public g v(int i10) {
        this.f49855d = i10;
        this.f49856e = true;
        return this;
    }

    public g w(boolean z10) {
        this.f49859h = z10 ? 1 : 0;
        return this;
    }

    public g x(int i10) {
        this.f49853b = i10;
        this.f49854c = true;
        return this;
    }

    public g y(@p0 String str) {
        this.f49852a = str;
        return this;
    }

    public g z(float f10) {
        this.f49862k = f10;
        return this;
    }
}
