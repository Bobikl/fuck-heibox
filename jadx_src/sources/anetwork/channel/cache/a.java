package anetwork.channel.cache;

import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<C0253a> f30155a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f30156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock.ReadLock f30157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ReentrantReadWriteLock.WriteLock f30158d;

    /* JADX INFO: renamed from: anetwork.channel.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static class C0253a implements Comparable<C0253a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Cache f30159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f30160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f30161d;

        C0253a(Cache cache, b bVar, int i10) {
            this.f30159b = cache;
            this.f30160c = bVar;
            this.f30161d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0253a c0253a) {
            return this.f30161d - c0253a.f30161d;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f30156b = reentrantReadWriteLock;
        f30157c = reentrantReadWriteLock.readLock();
        f30158d = reentrantReadWriteLock.writeLock();
    }

    public static void a(Cache cache, b bVar, int i10) {
        try {
            if (cache == null) {
                throw new IllegalArgumentException("cache is null");
            }
            if (bVar == null) {
                throw new IllegalArgumentException("prediction is null");
            }
            ReentrantReadWriteLock.WriteLock writeLock = f30158d;
            writeLock.lock();
            f30155a.add(new C0253a(cache, bVar, i10));
            Collections.sort(f30155a);
            writeLock.unlock();
        } catch (Throwable th2) {
            f30158d.unlock();
            throw th2;
        }
    }

    public static void b() {
        ALog.w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        Iterator<C0253a> it = f30155a.iterator();
        while (it.hasNext()) {
            try {
                it.next().f30159b.clear();
            } catch (Exception unused) {
            }
        }
    }

    public static Cache c(String str, Map<String, String> map) {
        Cache cache;
        try {
            f30157c.lock();
            for (C0253a c0253a : f30155a) {
                if (c0253a.f30160c.handleCache(str, map)) {
                    cache = c0253a.f30159b;
                    return cache;
                }
            }
            cache = null;
            return cache;
        } finally {
            f30157c.unlock();
        }
    }

    public static void d(Cache cache) {
        try {
            f30158d.lock();
            ListIterator<C0253a> listIterator = f30155a.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().f30159b == cache) {
                    listIterator.remove();
                    break;
                }
            }
        } finally {
            f30158d.unlock();
        }
    }
}
