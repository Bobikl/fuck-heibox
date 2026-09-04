package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.k1;
import androidx.annotation.p0;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface Cache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f50932a = -1;

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }
    }

    public interface a {
        void a(Cache cache, h hVar);

        void e(Cache cache, h hVar);

        void f(Cache cache, h hVar, h hVar2);
    }

    void A(h hVar);

    @k1
    void B(File file, long j10) throws CacheException;

    NavigableSet<h> C(String str);

    long getUid();

    Set<String> m();

    m n(String str);

    @k1
    void o(String str, n nVar) throws CacheException;

    @k1
    void p(h hVar);

    @k1
    h q(String str, long j10, long j11) throws InterruptedException, CacheException;

    @k1
    void r(String str);

    @k1
    void release();

    boolean s(String str, long j10, long j11);

    NavigableSet<h> t(String str, a aVar);

    void u(String str, a aVar);

    @k1
    File v(String str, long j10, long j11) throws CacheException;

    long w(String str, long j10, long j11);

    @k1
    @p0
    h x(String str, long j10, long j11) throws CacheException;

    long y(String str, long j10, long j11);

    long z();
}
