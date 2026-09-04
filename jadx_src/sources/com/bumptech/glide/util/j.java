package com.bumptech.glide.util;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class j<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f41999a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42002d;

    /* JADX INFO: compiled from: LruCache.java */
    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Y f42003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f42004b;

        a(Y y10, int i10) {
            this.f42003a = y10;
            this.f42004b = i10;
        }
    }

    public j(long j10) {
        this.f42000b = j10;
        this.f42001c = j10;
    }

    private void i() {
        p(this.f42001c);
    }

    public void b() {
        p(0L);
    }

    public synchronized void c(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.f42001c = Math.round(this.f42000b * f10);
            i();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        return this.f42002d;
    }

    public synchronized long getMaxSize() {
        return this.f42001c;
    }

    public synchronized boolean h(@n0 T t10) {
        return this.f41999a.containsKey(t10);
    }

    @p0
    public synchronized Y j(@n0 T t10) {
        a<Y> aVar;
        aVar = this.f41999a.get(t10);
        return aVar != null ? aVar.f42003a : null;
    }

    protected synchronized int k() {
        return this.f41999a.size();
    }

    protected int l(@p0 Y y10) {
        return 1;
    }

    protected void m(@n0 T t10, @p0 Y y10) {
    }

    @p0
    public synchronized Y n(@n0 T t10, @p0 Y y10) {
        int iL = l(y10);
        long j10 = iL;
        if (j10 >= this.f42001c) {
            m(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f42002d += j10;
        }
        a<Y> aVarPut = this.f41999a.put(t10, y10 == null ? null : new a<>(y10, iL));
        if (aVarPut != null) {
            this.f42002d -= (long) aVarPut.f42004b;
            if (!aVarPut.f42003a.equals(y10)) {
                m(t10, aVarPut.f42003a);
            }
        }
        i();
        return aVarPut != null ? aVarPut.f42003a : null;
    }

    @p0
    public synchronized Y o(@n0 T t10) {
        a<Y> aVarRemove = this.f41999a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f42002d -= (long) aVarRemove.f42004b;
        return aVarRemove.f42003a;
    }

    protected synchronized void p(long j10) {
        while (this.f42002d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f41999a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f42002d -= (long) value.f42004b;
            T key = next.getKey();
            it.remove();
            m(key, value.f42003a);
        }
    }
}
