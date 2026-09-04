package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45080a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45081b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45082c = -1;

    /* JADX INFO: compiled from: Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(long j10, long j11);

    void b(m mVar);

    boolean f(l lVar) throws IOException;

    int g(l lVar, z zVar) throws IOException;

    void release();
}
