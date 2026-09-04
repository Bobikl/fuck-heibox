package com.igexin.a.a.d;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import androidx.core.app.o0;
import com.igexin.push.d.c.m;
import com.igexin.push.util.n;
import com.max.hbutils.utils.w;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class f extends BroadcastReceiver implements Comparator<e> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f63248g = f.class.getName();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f63249u = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    PowerManager f63256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AlarmManager f63257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Intent f63258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    PendingIntent f63259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Intent f63260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    PendingIntent f63261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f63262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    volatile boolean f63263t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ReentrantLock f63255l = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63250a = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final HashMap<Long, com.igexin.a.a.d.a.b> f63252i = new HashMap<>(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final d<e> f63254k = new d<>(this, this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final c f63253j = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final k f63251h = new k(this);

    protected f() {
        e.D = this;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(e eVar, e eVar2) {
        if (eVar.f63241t < eVar2.f63241t) {
            return -1;
        }
        if (eVar.f63241t > eVar2.f63241t) {
            return 1;
        }
        int i10 = eVar.f63247z;
        int i11 = eVar2.f63247z;
        if (i10 > i11) {
            return -1;
        }
        if (i10 < i11) {
            return 1;
        }
        if (eVar.f63242u < eVar2.f63242u) {
            return -1;
        }
        if (eVar.f63242u > eVar2.f63242u) {
            return 1;
        }
        return eVar.hashCode() - eVar2.hashCode();
    }

    @TargetApi(19)
    public final void a(long j10) {
        if (this.f63263t) {
            com.igexin.a.a.c.b.a("setalarm|" + new SimpleDateFormat(w.f73604k, Locale.getDefault()).format(new Date(j10)), new Object[0]);
            if (j10 < 0) {
                j10 = System.currentTimeMillis() + f63249u;
            }
            try {
                PendingIntent pendingIntent = this.f63259p;
                if (pendingIntent != null) {
                    try {
                        if (Build.VERSION.SDK_INT > 23) {
                            this.f63257n.setAndAllowWhileIdle(0, j10, pendingIntent);
                        } else {
                            this.f63257n.set(0, j10, pendingIntent);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a("TaskService" + th2.toString(), new Object[0]);
            }
        }
    }

    public final void a(Context context) {
        if (this.f63250a) {
            return;
        }
        if (!n.b()) {
            this.f63256m = (PowerManager) context.getSystemService("power");
            this.f63263t = true;
            this.f63257n = (AlarmManager) context.getSystemService(o0.K0);
            g gVar = new g(this, context);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 33) {
                context.registerReceiver(this, gVar, com.igexin.push.core.d.az, null, 4);
            } else {
                context.registerReceiver(this, gVar, com.igexin.push.core.d.az, null);
            }
            this.f63262s = "AlarmNioTaskSchedule." + context.getPackageName();
            if (i10 > 33) {
                context.registerReceiver(this, new IntentFilter(this.f63262s), com.igexin.push.core.d.az, null, 4);
            } else {
                context.registerReceiver(this, new IntentFilter(this.f63262s), com.igexin.push.core.d.az, null);
            }
            int i11 = 134217728;
            if (n.a(context) >= 31 && i10 >= 30) {
                i11 = 201326592;
            }
            this.f63258o = new Intent("AlarmTaskSchedule." + context.getPackageName());
            this.f63259p = PendingIntent.getBroadcast(context, hashCode(), this.f63258o, i11);
            this.f63260q = new Intent(this.f63262s);
            this.f63261r = PendingIntent.getBroadcast(context, hashCode() + 2, this.f63260q, i11);
        }
        this.f63251h.start();
        try {
            Thread.yield();
        } catch (Throwable unused) {
        }
        this.f63250a = true;
    }

    public final boolean a(com.igexin.a.a.d.a.b bVar) {
        bVar.getClass();
        ReentrantLock reentrantLock = this.f63255l;
        if (reentrantLock.tryLock()) {
            try {
                if (this.f63252i.keySet().contains(Long.valueOf(bVar.m()))) {
                    reentrantLock.unlock();
                    return false;
                }
                this.f63252i.put(Long.valueOf(bVar.m()), bVar);
                reentrantLock.unlock();
                return true;
            } catch (Throwable th2) {
                try {
                    com.igexin.a.a.c.b.a("TaskService|" + th2.toString(), new Object[0]);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        return false;
    }

    final boolean a(com.igexin.a.a.d.a.e eVar, com.igexin.a.a.d.a.b bVar) {
        int iB_ = eVar.b_();
        if (iB_ <= Integer.MIN_VALUE || iB_ >= 0) {
            if (iB_ < 0 || iB_ >= Integer.MAX_VALUE) {
                return false;
            }
            return bVar.a(eVar, this);
        }
        e eVar2 = (e) eVar;
        boolean zA = eVar2.f63240s ? bVar.a(eVar2, this) : bVar.a(eVar, this);
        if (zA) {
            eVar2.c();
        }
        return zA;
    }

    public final boolean a(e eVar, boolean z10) {
        eVar.getClass();
        int iIncrementAndGet = 0;
        if (eVar.f63236o || eVar.f63232j) {
            return false;
        }
        d<e> dVar = this.f63254k;
        if ((eVar instanceof com.igexin.a.a.b.d) && (((com.igexin.a.a.b.d) eVar).f63193c instanceof com.igexin.push.d.c.n)) {
            if (z10) {
                iIncrementAndGet = Integer.MAX_VALUE;
            }
        } else if (z10) {
            iIncrementAndGet = dVar.f63227e.incrementAndGet();
        }
        eVar.f63247z = iIncrementAndGet;
        return dVar.a(eVar);
    }

    public final boolean a(e eVar, boolean z10, boolean z11) {
        eVar.getClass();
        boolean z12 = false;
        if (eVar.f63233k) {
            return false;
        }
        if (!z10 || z11) {
            if (z11 && z10) {
                z12 = true;
            }
            return a(eVar, z12);
        }
        eVar.d();
        try {
            eVar.b();
            eVar.g();
            eVar.e_();
            return true;
        } catch (Exception e10) {
            eVar.f63240s = true;
            eVar.A = e10;
            eVar.p();
            eVar.t();
            a(eVar);
            f();
            return false;
        } finally {
            if (!eVar.f63240s) {
                eVar.c();
            }
        }
    }

    public final boolean a(Class cls) {
        d<e> dVar = this.f63254k;
        return dVar != null && dVar.a(cls);
    }

    public final boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof m) {
            }
        } catch (Exception unused) {
        }
        com.igexin.a.a.c.b.a("TaskService|responseQueue ++ task = " + obj.getClass().getName() + "@" + obj.hashCode(), new Object[0]);
        if (!(obj instanceof com.igexin.a.a.d.a.e)) {
            throw new ClassCastException("response Obj is not a TaskResult ");
        }
        com.igexin.a.a.d.a.e eVar = (com.igexin.a.a.d.a.e) obj;
        if (eVar.l()) {
            return false;
        }
        eVar.a(false);
        if ((obj instanceof com.igexin.push.d.b.a) || (obj instanceof com.igexin.push.d.b.b)) {
            this.f63253j.a();
            com.igexin.a.a.c.b.a("TaskService|change to primaryQueue", new Object[0]);
        }
        this.f63253j.a(eVar);
        return true;
    }

    @TargetApi(19)
    public final void b(long j10) {
        if (n.b()) {
            return;
        }
        com.igexin.a.a.c.b.a("setnioalarm|" + new SimpleDateFormat(w.f73604k, Locale.getDefault()).format(new Date(j10)), new Object[0]);
        if (j10 < 0) {
            j10 = System.currentTimeMillis() + f63249u;
        }
        try {
            if (Build.VERSION.SDK_INT > 23) {
                this.f63257n.setAndAllowWhileIdle(0, j10, this.f63259p);
            } else {
                this.f63257n.set(0, j10, this.f63261r);
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        try {
            PendingIntent pendingIntent = this.f63261r;
            if (pendingIntent != null) {
                this.f63257n.cancel(pendingIntent);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void f() {
        k kVar = this.f63251h;
        if (kVar == null || kVar.isInterrupted()) {
            return;
        }
        this.f63251h.interrupt();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0000 A[SYNTHETIC] */
    final void g() {
        com.igexin.a.a.d.a.e eVarD;
        boolean zA;
        int iB_;
        int iB_2;
        boolean zA2;
        int iB_3;
        while (!this.f63253j.c() && (eVarD = this.f63253j.d()) != null) {
            com.igexin.a.a.c.b.a("TaskService|notifyObserver responseQueue -- task = " + eVarD, new Object[0]);
            eVarD.a(true);
            ReentrantLock reentrantLock = this.f63255l;
            reentrantLock.lock();
            try {
                if (this.f63252i.isEmpty()) {
                    zA2 = false;
                } else {
                    long jM = eVarD.m();
                    if (jM != 0) {
                        com.igexin.a.a.d.a.b bVar = this.f63252i.get(Long.valueOf(jM));
                        if (bVar == null || !bVar.l()) {
                            zA2 = false;
                        } else {
                            zA2 = a(eVarD, bVar);
                        }
                    } else {
                        zA = false;
                        for (com.igexin.a.a.d.a.b bVar2 : this.f63252i.values()) {
                            try {
                                if (bVar2.l() && (zA = a(eVarD, bVar2))) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    com.igexin.a.a.c.b.a("TaskService|" + th.toString(), new Object[0]);
                                    if (!zA && (iB_2 = eVarD.b_()) > Integer.MIN_VALUE && iB_2 < 0) {
                                    }
                                    reentrantLock.unlock();
                                    if (eVarD instanceof com.igexin.push.d.c.k) {
                                        this.f63253j.b();
                                        com.igexin.a.a.c.b.a("TaskService|queue -> secondRespQueue", new Object[0]);
                                    }
                                } catch (Throwable th3) {
                                    if (!zA && (iB_ = eVarD.b_()) > Integer.MIN_VALUE && iB_ < 0) {
                                        ((e) eVarD).c();
                                    }
                                    reentrantLock.unlock();
                                    throw th3;
                                }
                            }
                        }
                        zA2 = zA;
                    }
                }
                if (!zA2 && (iB_3 = eVarD.b_()) > Integer.MIN_VALUE && iB_3 < 0) {
                    ((e) eVarD).c();
                }
            } catch (Throwable th4) {
                th = th4;
                zA = false;
            }
            reentrantLock.unlock();
            if (eVarD instanceof com.igexin.push.d.c.k) {
                this.f63253j.b();
                com.igexin.a.a.c.b.a("TaskService|queue -> secondRespQueue", new Object[0]);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f63263t = true;
            com.igexin.a.a.c.b.a("screenoff", new Object[0]);
            if (this.f63254k.f63230h.get() > 0) {
                a(this.f63254k.f63230h.get());
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f63263t = false;
            com.igexin.a.a.c.b.a("screenon", new Object[0]);
            return;
        }
        if (intent.getAction().startsWith("AlarmTaskSchedule.") || intent.getAction().startsWith("AlarmTaskScheduleBak.")) {
            com.igexin.a.a.c.b.a("receivealarm|" + this.f63263t, new Object[0]);
            f();
            return;
        }
        if (this.f63262s.equals(intent.getAction())) {
            com.igexin.a.a.c.b.a("receive nioalarm", new Object[0]);
            try {
                com.igexin.a.a.c.b.a("TaskService|alarm time out #######", new Object[0]);
                com.igexin.a.a.b.a.a.f.a().e();
            } catch (Exception unused) {
            }
        }
    }
}
