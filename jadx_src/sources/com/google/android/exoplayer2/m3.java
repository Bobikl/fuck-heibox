package com.google.android.exoplayer2;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes7.dex */
public interface m3 extends h3.b {
    public static final int C0 = 1;
    public static final int D0 = 2;
    public static final int E0 = 3;
    public static final int F0 = 4;
    public static final int G0 = 5;
    public static final int H0 = 6;
    public static final int I0 = 7;
    public static final int J0 = 8;
    public static final int K0 = 9;
    public static final int L0 = 10;
    public static final int M0 = 11;
    public static final int N0 = 10000;
    public static final int O0 = 0;
    public static final int P0 = 1;
    public static final int Q0 = 2;

    /* JADX INFO: compiled from: Renderer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: Renderer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: Renderer.java */
    public interface c {
        void a();

        void b(long j10);
    }

    boolean b();

    void c();

    int d();

    boolean f();

    String getName();

    int getState();

    boolean i();

    boolean isReady();

    void j(long j10, long j11) throws ExoPlaybackException;

    @androidx.annotation.p0
    com.google.android.exoplayer2.source.d1 k();

    long l();

    void m(long j10) throws ExoPlaybackException;

    @androidx.annotation.p0
    com.google.android.exoplayer2.util.w n();

    void o();

    void p() throws IOException;

    void q(a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, long j11) throws ExoPlaybackException;

    o3 r();

    void reset();

    void setIndex(int i10);

    void start() throws ExoPlaybackException;

    void stop();

    void t(float f10, float f11) throws ExoPlaybackException;

    void u(p3 p3Var, a2[] a2VarArr, com.google.android.exoplayer2.source.d1 d1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException;
}
