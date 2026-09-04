package com.igexin.a.a.b.a.a;

import android.os.Handler;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f63145l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lock f63146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Condition f63147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ConcurrentLinkedQueue<m> f63148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.igexin.a.a.b.b f63149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f63150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f63151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n f63152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f63153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f63154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<m> f63156k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f63157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f63158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Comparator<m> f63159o;

    private f() {
        this.f63154i = new AtomicBoolean(false);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f63146a = reentrantLock;
        this.f63147b = reentrantLock.newCondition();
        this.f63156k = new ArrayList();
        this.f63148c = new ConcurrentLinkedQueue<>();
        this.f63159o = new j(this);
        this.f63157m = com.igexin.push.core.c.a().b();
    }

    /* synthetic */ f(g gVar) {
        this();
    }

    public static f a() {
        return k.f63164a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(m mVar) {
        if (mVar.f63245x <= 0 || mVar.C == null) {
            mVar.p();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        mVar.c(jCurrentTimeMillis);
        synchronized (f63145l) {
            this.f63156k.add(mVar);
            Collections.sort(this.f63156k, this.f63159o);
            long millis = TimeUnit.SECONDS.toMillis(this.f63156k.get(0).f63245x);
            this.f63158n = millis;
            if (millis > 0 && this.f63156k.size() == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GS-M|add : ");
                sb2.append(mVar.toString());
                sb2.append(" --- ");
                sb2.append(mVar.f63193c.getClass().getName());
                sb2.append(" set alarm ");
                sb2.append("delay = ");
                long j10 = this.f63158n;
                long j11 = com.igexin.a.a.d.f.f63249u;
                sb2.append(j10 + j11);
                com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                com.igexin.a.a.b.c.b().b(jCurrentTimeMillis + this.f63158n + j11);
            }
        }
    }

    private void b(Socket socket) throws Exception {
        l lVar = new l(new o(socket.getInputStream()), this.f63149d);
        this.f63151f = lVar;
        lVar.a(new h(this));
        com.igexin.a.a.b.c.b().a((com.igexin.a.a.d.e) this.f63151f, true);
    }

    private void c(Socket socket) throws Exception {
        n nVar = new n(new p(socket.getOutputStream()), this.f63149d);
        this.f63152g = nVar;
        nVar.a(new i(this));
        com.igexin.a.a.b.c.b().a((com.igexin.a.a.d.e) this.f63152g, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f63154i.getAndSet(true)) {
            return;
        }
        this.f63157m.sendEmptyMessage(q.TCP_IO_EXCEPTION.ordinal());
    }

    private void j() {
        this.f63154i.set(false);
        com.igexin.push.core.c.a().i().a(q.TCP_DISCONNECT_SUCCESS);
    }

    private void k() {
        com.igexin.a.a.c.b.a("GS-M|disconnect", new Object[0]);
        c cVar = this.f63153h;
        if (cVar != null) {
            cVar.j();
        }
        n nVar = this.f63152g;
        if (nVar != null) {
            nVar.j();
        }
        l lVar = this.f63151f;
        if (lVar != null) {
            lVar.j();
        }
        Socket socket = this.f63150e;
        if (socket != null) {
            try {
                if (socket.isClosed()) {
                    return;
                }
                this.f63150e.close();
            } catch (Exception unused) {
            }
        }
    }

    private void l() {
        n nVar = this.f63152g;
        if (nVar != null) {
            nVar.f63168i = null;
            this.f63152g = null;
        }
        l lVar = this.f63151f;
        if (lVar != null) {
            lVar.f63165h = null;
            this.f63151f = null;
        }
        this.f63153h = null;
        this.f63150e = null;
    }

    private boolean m() {
        c cVar = this.f63153h;
        if (cVar != null && !((a) cVar).f63134d) {
            return false;
        }
        l lVar = this.f63151f;
        if (lVar != null && !((a) lVar).f63134d) {
            return false;
        }
        n nVar = this.f63152g;
        if (nVar != null && !((a) nVar).f63134d) {
            return false;
        }
        l();
        return true;
    }

    private boolean n() {
        Socket socket = this.f63150e;
        return (socket == null || socket.isClosed()) ? false : true;
    }

    private void o() {
        if (!com.igexin.push.util.n.b()) {
            com.igexin.a.a.b.c.b().e();
            com.igexin.a.a.c.b.a("GS-M|cancel alrm", new Object[0]);
            synchronized (f63145l) {
                if (!this.f63156k.isEmpty()) {
                    Iterator<m> it = this.f63156k.iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                    this.f63156k.clear();
                }
            }
        }
        if (this.f63148c.isEmpty()) {
            return;
        }
        Iterator<m> it2 = this.f63148c.iterator();
        while (it2.hasNext()) {
            it2.next().p();
        }
        this.f63148c.clear();
    }

    void a(m mVar) {
        try {
            this.f63146a.lock();
            this.f63148c.offer(mVar);
            this.f63147b.signalAll();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                this.f63146a.unlock();
            } catch (Exception unused2) {
            }
            throw th2;
        }
        try {
            this.f63146a.unlock();
        } catch (Exception unused3) {
        }
    }

    public void a(com.igexin.a.a.b.b bVar) {
        this.f63149d = bVar;
        l lVar = this.f63151f;
        if (lVar != null) {
            lVar.f63166i = bVar;
        }
        n nVar = this.f63152g;
        if (nVar != null) {
            nVar.f63167h = bVar;
        }
    }

    public void a(String str) {
        boolean z10;
        if (com.igexin.push.util.n.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f63145l) {
            com.igexin.a.a.c.b.a("GS-M|receive: " + str + " -- resp -----", new Object[0]);
            Iterator<m> it = this.f63156k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                m next = it.next();
                if (next.C.a(jCurrentTimeMillis, next)) {
                    next.p();
                    next.C.a(next);
                    z10 = true;
                    it.remove();
                    break;
                }
                long jB = next.C.b(jCurrentTimeMillis, next);
                long j10 = this.f63158n;
                if (j10 < 0 || j10 > jB) {
                    this.f63158n = jB;
                }
            }
            com.igexin.a.a.b.c.b().e();
            if (z10) {
                com.igexin.a.a.c.b.a("GS-M|time out", new Object[0]);
                e();
                return;
            }
            if (this.f63156k.size() > 0) {
                m mVar = this.f63156k.get(0);
                mVar.p();
                com.igexin.a.a.b.c.b().a(mVar);
                this.f63156k.remove(mVar);
            }
            if (this.f63156k.size() > 0 && this.f63158n > 0) {
                com.igexin.a.a.c.b.a("GS-M|set alarm = " + this.f63158n, new Object[0]);
                com.igexin.a.a.b.c.b().b(jCurrentTimeMillis + this.f63158n + com.igexin.a.a.d.f.f63249u);
            }
        }
    }

    void a(Socket socket) {
        try {
            c cVar = this.f63153h;
            if (cVar == null || !cVar.i()) {
                this.f63150e = socket;
                b(socket);
                c(socket);
            }
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("GS-M|" + e10.toString(), new Object[0]);
            i();
        }
    }

    void b() {
        com.igexin.push.core.c.a().i().a(q.TCP_IO_EXCEPTION);
    }

    public synchronized void c() {
        this.f63157m.sendEmptyMessage(q.TCP_DISCONNECT.ordinal());
    }

    void d() {
        this.f63157m.sendEmptyMessage(q.TCP_START_CONNECT.ordinal());
        this.f63155j = false;
    }

    public void e() {
        com.igexin.a.a.c.b.a("GS-M|alarm timeout~~", new Object[0]);
        i();
    }

    public void f() {
        o();
        if ((this.f63153h == null && this.f63152g == null && this.f63151f == null) || m()) {
            j();
        } else {
            k();
        }
    }

    void g() {
        boolean zN = n();
        if (!zN && this.f63153h == null) {
            com.igexin.a.a.c.b.a("GS-M|disconnect = true, reconnect", new Object[0]);
            this.f63153h = new c(new g(this));
            com.igexin.a.a.b.c.b().a((com.igexin.a.a.d.e) this.f63153h, true);
        } else {
            com.igexin.a.a.c.b.a("GS-Mstart connect, isConnected = " + zN + ", ctask = " + this.f63153h, new Object[0]);
        }
    }

    void h() {
        if (!m() || this.f63155j) {
            return;
        }
        j();
        this.f63155j = true;
    }
}
