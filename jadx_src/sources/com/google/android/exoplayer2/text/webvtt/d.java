package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final int A = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f49919r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f49920s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f49921t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f49922u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f49923v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f49924w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f49925x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f49926y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f49927z = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.l
    private int f49933f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49935h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f49942o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49928a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49929b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f49930c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49931d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private String f49932e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49934g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49936i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49937j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49938k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f49939l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49940m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f49941n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49943p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f49944q = false;

    /* JADX INFO: compiled from: WebvttCssStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: WebvttCssStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private static int C(int i10, String str, @p0 String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public void A(String str) {
        this.f49931d = str;
    }

    public d B(boolean z10) {
        this.f49938k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f49936i) {
            return this.f49935h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f49944q;
    }

    public int c() {
        if (this.f49934g) {
            return this.f49933f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @p0
    public String d() {
        return this.f49932e;
    }

    public float e() {
        return this.f49942o;
    }

    public int f() {
        return this.f49941n;
    }

    public int g() {
        return this.f49943p;
    }

    public int h(@p0 String str, @p0 String str2, Set<String> set, @p0 String str3) {
        if (this.f49928a.isEmpty() && this.f49929b.isEmpty() && this.f49930c.isEmpty() && this.f49931d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iC = C(C(C(0, this.f49928a, str, 1073741824), this.f49929b, str2, 2), this.f49931d, str3, 4);
        if (iC == -1 || !set.containsAll(this.f49930c)) {
            return 0;
        }
        return iC + (this.f49930c.size() * 4);
    }

    public int i() {
        int i10 = this.f49939l;
        if (i10 == -1 && this.f49940m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f49940m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f49936i;
    }

    public boolean k() {
        return this.f49934g;
    }

    public boolean l() {
        return this.f49937j == 1;
    }

    public boolean m() {
        return this.f49938k == 1;
    }

    public d n(int i10) {
        this.f49935h = i10;
        this.f49936i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f49939l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f49944q = z10;
        return this;
    }

    public d q(int i10) {
        this.f49933f = i10;
        this.f49934g = true;
        return this;
    }

    public d r(@p0 String str) {
        this.f49932e = str == null ? null : com.google.common.base.a.g(str);
        return this;
    }

    public d s(float f10) {
        this.f49942o = f10;
        return this;
    }

    public d t(int i10) {
        this.f49941n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f49940m = z10 ? 1 : 0;
        return this;
    }

    public d v(boolean z10) {
        this.f49937j = z10 ? 1 : 0;
        return this;
    }

    public d w(int i10) {
        this.f49943p = i10;
        return this;
    }

    public void x(String[] strArr) {
        this.f49930c = new HashSet(Arrays.asList(strArr));
    }

    public void y(String str) {
        this.f49928a = str;
    }

    public void z(String str) {
        this.f49929b = str;
    }
}
