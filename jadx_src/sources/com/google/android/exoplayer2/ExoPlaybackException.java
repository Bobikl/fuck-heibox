package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class ExoPlaybackException extends PlaybackException {
    private static final int G2 = 1005;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f43497a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f43498b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f43499c0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f43500p1 = 3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f43501p2 = 1002;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f43502p3 = 1006;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final i.a<ExoPlaybackException> f43503x1 = new i.a() { // from class: com.google.android.exoplayer2.q
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return ExoPlaybackException.i(bundle);
        }
    };

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f43504x2 = 1003;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f43505y1 = 1001;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f43506y2 = 1004;
    public final int T;

    @androidx.annotation.p0
    public final String U;
    public final int V;

    @androidx.annotation.p0
    public final a2 W;
    public final int X;

    @androidx.annotation.p0
    public final com.google.android.exoplayer2.source.d0 Y;
    final boolean Z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i10, @androidx.annotation.p0 Throwable th2, @androidx.annotation.p0 String str, int i11, @androidx.annotation.p0 String str2, int i12, @androidx.annotation.p0 a2 a2Var, int i13, boolean z10) {
        this(p(i10, str, str2, i12, a2Var, i13), th2, i11, i10, str2, i12, a2Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.T = bundle.getInt(PlaybackException.h(1001), 2);
        this.U = bundle.getString(PlaybackException.h(1002));
        this.V = bundle.getInt(PlaybackException.h(1003), -1);
        this.W = (a2) com.google.android.exoplayer2.util.d.e(a2.L3, bundle.getBundle(PlaybackException.h(1004)));
        this.X = bundle.getInt(PlaybackException.h(1005), 4);
        this.Z = bundle.getBoolean(PlaybackException.h(1006), false);
        this.Y = null;
    }

    private ExoPlaybackException(String str, @androidx.annotation.p0 Throwable th2, int i10, int i11, @androidx.annotation.p0 String str2, int i12, @androidx.annotation.p0 a2 a2Var, int i13, @androidx.annotation.p0 com.google.android.exoplayer2.source.d0 d0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        com.google.android.exoplayer2.util.a.a(!z10 || i11 == 1);
        com.google.android.exoplayer2.util.a.a(th2 != null || i11 == 3);
        this.T = i11;
        this.U = str2;
        this.V = i12;
        this.W = a2Var;
        this.X = i13;
        this.Y = d0Var;
        this.Z = z10;
    }

    public static /* synthetic */ ExoPlaybackException i(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException k(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException l(Throwable th2, String str, int i10, @androidx.annotation.p0 a2 a2Var, int i11, boolean z10, int i12) {
        return new ExoPlaybackException(1, th2, null, i12, str, i10, a2Var, a2Var == null ? 4 : i11, z10);
    }

    public static ExoPlaybackException m(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    @Deprecated
    public static ExoPlaybackException n(RuntimeException runtimeException) {
        return o(runtimeException, 1000);
    }

    public static ExoPlaybackException o(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String p(int i10, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, int i11, @androidx.annotation.p0 a2 a2Var, int i12) {
        String string;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 != 1) {
            string = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(a2Var);
            String strG0 = com.google.android.exoplayer2.util.u0.g0(i12);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53 + strValueOf.length() + String.valueOf(strG0).length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(strValueOf);
            sb2.append(", format_supported=");
            sb2.append(strG0);
            string = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 2 + String.valueOf(str).length());
        sb3.append(strValueOf2);
        sb3.append(": ");
        sb3.append(str);
        return sb3.toString();
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundleA = super.a();
        bundleA.putInt(PlaybackException.h(1001), this.T);
        bundleA.putString(PlaybackException.h(1002), this.U);
        bundleA.putInt(PlaybackException.h(1003), this.V);
        bundleA.putBundle(PlaybackException.h(1004), com.google.android.exoplayer2.util.d.j(this.W));
        bundleA.putInt(PlaybackException.h(1005), this.X);
        bundleA.putBoolean(PlaybackException.h(1006), this.Z);
        return bundleA;
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean d(@androidx.annotation.p0 PlaybackException playbackException) {
        if (!super.d(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) com.google.android.exoplayer2.util.u0.k(playbackException);
        return this.T == exoPlaybackException.T && com.google.android.exoplayer2.util.u0.c(this.U, exoPlaybackException.U) && this.V == exoPlaybackException.V && com.google.android.exoplayer2.util.u0.c(this.W, exoPlaybackException.W) && this.X == exoPlaybackException.X && com.google.android.exoplayer2.util.u0.c(this.Y, exoPlaybackException.Y) && this.Z == exoPlaybackException.Z;
    }

    @androidx.annotation.j
    ExoPlaybackException j(@androidx.annotation.p0 com.google.android.exoplayer2.source.d0 d0Var) {
        return new ExoPlaybackException((String) com.google.android.exoplayer2.util.u0.k(getMessage()), getCause(), this.f43540b, this.T, this.U, this.V, this.W, this.X, d0Var, this.f43541c, this.Z);
    }

    public Exception q() {
        com.google.android.exoplayer2.util.a.i(this.T == 1);
        return (Exception) com.google.android.exoplayer2.util.a.g(getCause());
    }

    public IOException r() {
        com.google.android.exoplayer2.util.a.i(this.T == 0);
        return (IOException) com.google.android.exoplayer2.util.a.g(getCause());
    }

    public RuntimeException s() {
        com.google.android.exoplayer2.util.a.i(this.T == 2);
        return (RuntimeException) com.google.android.exoplayer2.util.a.g(getCause());
    }
}
