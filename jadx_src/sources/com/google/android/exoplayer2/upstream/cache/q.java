package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet<h> f51068b = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.upstream.cache.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q.h((h) obj, (h) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f51069c;

    public q(long j10) {
        this.f51067a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(h hVar, h hVar2) {
        long j10 = hVar.f51006g;
        long j11 = hVar2.f51006g;
        if (j10 - j11 == 0) {
            return hVar.compareTo(hVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    private void i(Cache cache, long j10) {
        while (this.f51069c + j10 > this.f51067a && !this.f51068b.isEmpty()) {
            cache.p(this.f51068b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void a(Cache cache, h hVar) {
        this.f51068b.add(hVar);
        this.f51069c += hVar.f51003d;
        i(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public boolean b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void c(Cache cache, String str, long j10, long j11) {
        if (j11 != -1) {
            i(cache, j11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void d() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void e(Cache cache, h hVar) {
        this.f51068b.remove(hVar);
        this.f51069c -= hVar.f51003d;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void f(Cache cache, h hVar, h hVar2) {
        e(cache, hVar);
        a(cache, hVar2);
    }
}
