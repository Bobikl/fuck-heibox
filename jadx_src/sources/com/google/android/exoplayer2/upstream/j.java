package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedRegionTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements Cache.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51135f = "CachedRegionTracker";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51136g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51137h = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f51138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e f51140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TreeSet<a> f51141d = new TreeSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f51142e = new a(0, 0);

    /* JADX INFO: compiled from: CachedRegionTracker.java */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f51143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f51144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51145d;

        public a(long j10, long j11) {
            this.f51143b = j10;
            this.f51144c = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return com.google.android.exoplayer2.util.u0.q(this.f51143b, aVar.f51143b);
        }
    }

    public j(Cache cache, String str, com.google.android.exoplayer2.extractor.e eVar) {
        this.f51138a = cache;
        this.f51139b = str;
        this.f51140c = eVar;
        synchronized (this) {
            Iterator<com.google.android.exoplayer2.upstream.cache.h> itDescendingIterator = cache.t(str, this).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                h(itDescendingIterator.next());
            }
        }
    }

    private void h(com.google.android.exoplayer2.upstream.cache.h hVar) {
        long j10 = hVar.f51002c;
        a aVar = new a(j10, hVar.f51003d + j10);
        a aVarFloor = this.f51141d.floor(aVar);
        a aVarCeiling = this.f51141d.ceiling(aVar);
        boolean zI = i(aVarFloor, aVar);
        if (i(aVar, aVarCeiling)) {
            if (zI) {
                aVarFloor.f51144c = aVarCeiling.f51144c;
                aVarFloor.f51145d = aVarCeiling.f51145d;
            } else {
                aVar.f51144c = aVarCeiling.f51144c;
                aVar.f51145d = aVarCeiling.f51145d;
                this.f51141d.add(aVar);
            }
            this.f51141d.remove(aVarCeiling);
            return;
        }
        if (!zI) {
            int iBinarySearch = Arrays.binarySearch(this.f51140c.f44866f, aVar.f51144c);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar.f51145d = iBinarySearch;
            this.f51141d.add(aVar);
            return;
        }
        aVarFloor.f51144c = aVar.f51144c;
        int i10 = aVarFloor.f51145d;
        while (true) {
            com.google.android.exoplayer2.extractor.e eVar = this.f51140c;
            if (i10 >= eVar.f44864d - 1) {
                break;
            }
            int i11 = i10 + 1;
            if (eVar.f44866f[i11] > aVarFloor.f51144c) {
                break;
            } else {
                i10 = i11;
            }
        }
        aVarFloor.f51145d = i10;
    }

    private boolean i(@androidx.annotation.p0 a aVar, @androidx.annotation.p0 a aVar2) {
        return (aVar == null || aVar2 == null || aVar.f51144c != aVar2.f51143b) ? false : true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public synchronized void a(Cache cache, com.google.android.exoplayer2.upstream.cache.h hVar) {
        h(hVar);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public synchronized void e(Cache cache, com.google.android.exoplayer2.upstream.cache.h hVar) {
        long j10 = hVar.f51002c;
        a aVar = new a(j10, hVar.f51003d + j10);
        a aVarFloor = this.f51141d.floor(aVar);
        if (aVarFloor == null) {
            com.google.android.exoplayer2.util.u.d(f51135f, "Removed a span we were not aware of");
            return;
        }
        this.f51141d.remove(aVarFloor);
        long j11 = aVarFloor.f51143b;
        long j12 = aVar.f51143b;
        if (j11 < j12) {
            a aVar2 = new a(j11, j12);
            int iBinarySearch = Arrays.binarySearch(this.f51140c.f44866f, aVar2.f51144c);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar2.f51145d = iBinarySearch;
            this.f51141d.add(aVar2);
        }
        long j13 = aVarFloor.f51144c;
        long j14 = aVar.f51144c;
        if (j13 > j14) {
            a aVar3 = new a(j14 + 1, j13);
            aVar3.f51145d = aVarFloor.f51145d;
            this.f51141d.add(aVar3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void f(Cache cache, com.google.android.exoplayer2.upstream.cache.h hVar, com.google.android.exoplayer2.upstream.cache.h hVar2) {
    }

    public synchronized int g(long j10) {
        int i10;
        a aVar = this.f51142e;
        aVar.f51143b = j10;
        a aVarFloor = this.f51141d.floor(aVar);
        if (aVarFloor != null) {
            long j11 = aVarFloor.f51144c;
            if (j10 <= j11 && (i10 = aVarFloor.f51145d) != -1) {
                com.google.android.exoplayer2.extractor.e eVar = this.f51140c;
                if (i10 == eVar.f44864d - 1) {
                    if (j11 == eVar.f44866f[i10] + ((long) eVar.f44865e[i10])) {
                        return -2;
                    }
                }
                return (int) ((eVar.f44868h[i10] + ((eVar.f44867g[i10] * (j11 - eVar.f44866f[i10])) / ((long) eVar.f44865e[i10]))) / 1000);
            }
        }
        return -1;
    }

    public void j() {
        this.f51138a.u(this.f51139b, this);
    }
}
