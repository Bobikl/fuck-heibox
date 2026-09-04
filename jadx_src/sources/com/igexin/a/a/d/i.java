package com.igexin.a.a.d;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue<e> f63275a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f63276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f63277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile int f63278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f63279e;

    public i(h hVar, e eVar) {
        this.f63279e = hVar;
        this.f63276b = eVar;
    }

    public final void a() {
        this.f63275a.clear();
        this.f63277c = null;
    }

    public final void a(e eVar) {
        if (this.f63278d == 0) {
            this.f63278d = eVar.f63246y;
        }
        boolean z10 = true;
        while (z10) {
            try {
                try {
                    eVar.b();
                    eVar.g();
                    eVar.e_();
                    if (!eVar.f63240s) {
                        eVar.c();
                    }
                    if (eVar.f63232j || !eVar.f63235n || eVar.f63241t == 0) {
                        eVar = null;
                        z10 = false;
                    }
                } catch (Exception e10) {
                    com.igexin.a.a.c.b.a("TaskService" + e10.toString(), new Object[0]);
                    eVar.f63240s = true;
                    eVar.A = e10;
                    eVar.t();
                    eVar.p();
                    this.f63279e.f63274i.a(eVar);
                    this.f63279e.f63274i.f();
                    if (!eVar.f63240s) {
                        eVar.c();
                    }
                    if (eVar.f63232j || !eVar.f63235n || eVar.f63241t == 0) {
                    }
                }
            } catch (Throwable th2) {
                if (!eVar.f63240s) {
                    eVar.c();
                }
                if (eVar.f63232j || !eVar.f63235n || eVar.f63241t == 0) {
                    throw th2;
                }
            }
        }
    }

    final e b() {
        while (this.f63278d != 0) {
            try {
                e eVarPoll = this.f63275a.poll(this.f63279e.f63270e, TimeUnit.NANOSECONDS);
                if (eVarPoll != null) {
                    return eVarPoll;
                }
                if (this.f63275a.isEmpty()) {
                    ReentrantLock reentrantLock = this.f63279e.f63268c;
                    reentrantLock.lock();
                    try {
                        if (this.f63275a.isEmpty()) {
                            this.f63279e.f63267b.remove(Integer.valueOf(this.f63278d));
                            this.f63277c.e();
                            this.f63278d = 0;
                            reentrantLock.unlock();
                            return null;
                        }
                        reentrantLock.unlock();
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                } else {
                    continue;
                }
            } catch (InterruptedException unused) {
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA = true;
        while (zA) {
            try {
                try {
                    e eVarB = this.f63276b;
                    this.f63276b = null;
                    while (true) {
                        if (eVarB == null) {
                            eVarB = b();
                            if (eVarB == null && (eVarB = this.f63279e.a()) == null) {
                                break;
                            }
                        }
                        this.f63277c = null;
                        a(eVarB);
                        this.f63277c = eVarB;
                        eVarB = null;
                    }
                    zA = this.f63279e.a(this);
                    if (!zA) {
                        a();
                    }
                } catch (Exception e10) {
                    com.igexin.a.a.c.b.a("TaskService|Worker|run()|error" + e10.toString(), new Object[0]);
                    zA = this.f63279e.a(this);
                    if (!zA) {
                    }
                }
            } catch (Throwable th2) {
                if (!this.f63279e.a(this)) {
                    a();
                }
                throw th2;
            }
        }
    }
}
