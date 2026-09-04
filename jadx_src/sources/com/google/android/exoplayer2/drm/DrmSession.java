package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public interface DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44660b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44661c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44662d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44663e = 4;

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44664b;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.f44664b = i10;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int getState();

    @androidx.annotation.p0
    DrmSessionException q();

    void r(@androidx.annotation.p0 s.a aVar);

    boolean s();

    @androidx.annotation.p0
    com.google.android.exoplayer2.decoder.c t();

    @androidx.annotation.p0
    Map<String, String> u();

    void v(@androidx.annotation.p0 s.a aVar);

    UUID w();

    @androidx.annotation.p0
    byte[] x();

    boolean y(String str);
}
