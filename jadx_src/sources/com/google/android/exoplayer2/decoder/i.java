package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44525f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44526g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44527h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44528i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44529j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44530k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44531l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44532m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f44533n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f44534o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44535p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44536q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f44537r = 256;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44538s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44539t = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f44540u = 2048;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f44541v = 4096;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f44542w = 8192;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f44543x = 16384;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f44545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f44546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44548e;

    /* JADX INFO: compiled from: DecoderReuseEvaluation.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: DecoderReuseEvaluation.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public i(String str, a2 a2Var, a2 a2Var2, int i10, int i11) {
        com.google.android.exoplayer2.util.a.a(i10 == 0 || i11 == 0);
        this.f44544a = com.google.android.exoplayer2.util.a.e(str);
        this.f44545b = (a2) com.google.android.exoplayer2.util.a.g(a2Var);
        this.f44546c = (a2) com.google.android.exoplayer2.util.a.g(a2Var2);
        this.f44547d = i10;
        this.f44548e = i11;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f44547d == iVar.f44547d && this.f44548e == iVar.f44548e && this.f44544a.equals(iVar.f44544a) && this.f44545b.equals(iVar.f44545b) && this.f44546c.equals(iVar.f44546c);
    }

    public int hashCode() {
        return ((((((((bb.c.b.f30674h7 + this.f44547d) * 31) + this.f44548e) * 31) + this.f44544a.hashCode()) * 31) + this.f44545b.hashCode()) * 31) + this.f44546c.hashCode();
    }
}
