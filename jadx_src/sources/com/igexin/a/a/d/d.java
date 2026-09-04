package com.igexin.a.a.d;

import com.igexin.a.a.d.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class d<E extends e> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f63222i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63223a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient ReentrantLock f63224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Condition f63225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TreeSet<E> f63226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicInteger f63227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f63228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f f63229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f63230h;

    public d(Comparator<? super E> comparator, f fVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f63224b = reentrantLock;
        this.f63225c = reentrantLock.newCondition();
        this.f63227e = new AtomicInteger(0);
        this.f63230h = new AtomicLong(-1L);
        this.f63226d = new TreeSet<>(comparator);
        this.f63229g = fVar;
    }

    private E e() {
        E e10 = (E) a();
        if (e10 != null && this.f63226d.remove(e10)) {
            return e10;
        }
        return null;
    }

    public final int a(E e10, long j10, TimeUnit timeUnit) {
        ReentrantLock reentrantLock = this.f63224b;
        reentrantLock.lock();
        try {
            if (!this.f63226d.contains(e10)) {
                return -1;
            }
            this.f63226d.remove(e10);
            e10.f63241t = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
            return a(e10) ? 1 : -2;
        } finally {
            reentrantLock.unlock();
        }
    }

    E a() {
        try {
            return this.f63226d.first();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public final boolean a(E e10) {
        if (e10 == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f63224b;
        reentrantLock.lock();
        try {
            e eVarA = a();
            int i10 = this.f63228f + 1;
            this.f63228f = i10;
            e10.f63242u = i10;
            if (!this.f63226d.add(e10)) {
                e10.f63242u--;
                return false;
            }
            e10.n();
            if (eVarA == null || this.f63226d.comparator().compare(e10, eVarA) < 0) {
                this.f63225c.signalAll();
            }
            return true;
        } catch (Exception unused) {
            com.igexin.a.a.c.b.a("ScheduleQueue|offer|error", new Object[0]);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(Class cls) {
        if (cls == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f63224b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (E e10 : this.f63226d) {
                if (e10.getClass() == cls) {
                    arrayList.add(e10);
                }
            }
            this.f63226d.removeAll(arrayList);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    final boolean b() {
        ReentrantLock reentrantLock = this.f63224b;
        reentrantLock.lock();
        try {
            return this.f63226d.isEmpty();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E c() throws InterruptedException {
        ReentrantLock reentrantLock = this.f63224b;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                e eVarA = a();
                boolean z10 = true;
                if (eVarA != null) {
                    long jA = eVarA.a(TimeUnit.NANOSECONDS);
                    if (!eVarA.f63232j && !eVarA.f63233k) {
                        z10 = false;
                    }
                    if (jA <= 0 || z10) {
                        break;
                        break;
                    }
                    this.f63230h.set(eVarA.f63241t);
                    com.igexin.a.a.c.b.a("schedule take|needAlarm = " + this.f63229g.f63263t + "|" + eVarA.getClass().getName() + "@" + eVarA.hashCode(), new Object[0]);
                    if (this.f63229g.f63263t) {
                        this.f63229g.a(eVarA.f63241t);
                    }
                    this.f63225c.awaitNanos(jA);
                } else {
                    this.f63227e.set(1);
                    this.f63228f = 0;
                    this.f63225c.await();
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E e10 = (E) e();
        if (!f63222i && e10 == null) {
            throw new AssertionError();
        }
        if (!b()) {
            this.f63225c.signalAll();
        }
        this.f63230h.set(-1L);
        reentrantLock.unlock();
        return e10;
    }

    public final void d() {
        this.f63226d.clear();
    }
}
