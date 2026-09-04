package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes7.dex */
public interface o3 {
    public static final int R0 = 7;

    @Deprecated
    public static final int S0 = 4;

    @Deprecated
    public static final int T0 = 3;

    @Deprecated
    public static final int U0 = 2;

    @Deprecated
    public static final int V0 = 1;

    @Deprecated
    public static final int W0 = 0;
    public static final int X0 = 24;
    public static final int Y0 = 16;
    public static final int Z0 = 8;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f47057a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f47058b1 = 32;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f47059c1 = 32;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f47060d1 = 0;

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    int a(a2 a2Var) throws ExoPlaybackException;

    int d();

    String getName();

    int v() throws ExoPlaybackException;
}
