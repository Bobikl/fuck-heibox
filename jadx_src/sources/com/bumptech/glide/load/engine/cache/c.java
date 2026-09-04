package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f41036a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f41037b = new b();

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f41038a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41039b;

        a() {
        }
    }

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f41040b = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<a> f41041a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f41041a) {
                aVarPoll = this.f41041a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f41041a) {
                if (this.f41041a.size() < 10) {
                    this.f41041a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            aVarA = this.f41036a.get(str);
            if (aVarA == null) {
                aVarA = this.f41037b.a();
                this.f41036a.put(str, aVarA);
            }
            aVarA.f41039b++;
        }
        aVarA.f41038a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) com.bumptech.glide.util.m.e(this.f41036a.get(str));
            int i10 = aVar.f41039b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f41039b);
            }
            int i11 = i10 - 1;
            aVar.f41039b = i11;
            if (i11 == 0) {
                a aVarRemove = this.f41036a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                this.f41037b.b(aVarRemove);
            }
        }
        aVar.f41038a.unlock();
    }
}
