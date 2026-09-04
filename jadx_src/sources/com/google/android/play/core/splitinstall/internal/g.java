package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f56272o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p1 f56274b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f56279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f56280h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private ServiceConnection f56284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private IInterface f56285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.s f56286n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f56276d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    private final Set f56277e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f56278f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f56282j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.s1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            g.j(this.f56322a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    private final AtomicInteger f56283k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f56275c = "SplitInstallService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f56281i = new WeakReference(null);

    public g(Context context, p1 p1Var, String str, Intent intent, com.google.android.play.core.splitinstall.s sVar, @androidx.annotation.p0 b bVar) {
        this.f56273a = context;
        this.f56274b = p1Var;
        this.f56280h = intent;
        this.f56286n = sVar;
    }

    public static /* synthetic */ void j(g gVar) {
        gVar.f56274b.d("reportBinderDeath", new Object[0]);
        b bVar = (b) gVar.f56281i.get();
        if (bVar != null) {
            gVar.f56274b.d("calling onBinderDied", new Object[0]);
            bVar.zza();
        } else {
            gVar.f56274b.d("%s : Binder has died.", gVar.f56275c);
            Iterator it = gVar.f56276d.iterator();
            while (it.hasNext()) {
                ((q1) it.next()).b(gVar.v());
            }
            gVar.f56276d.clear();
        }
        synchronized (gVar.f56278f) {
            gVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final g gVar, final com.google.android.gms.tasks.l lVar) {
        gVar.f56277e.add(lVar);
        lVar.a().e(new com.google.android.gms.tasks.e() { // from class: com.google.android.play.core.splitinstall.internal.r1
            @Override // com.google.android.gms.tasks.e
            public final void a(com.google.android.gms.tasks.k kVar) {
                this.f56320a.t(lVar, kVar);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(g gVar, q1 q1Var) {
        if (gVar.f56285m != null || gVar.f56279g) {
            if (!gVar.f56279g) {
                q1Var.run();
                return;
            } else {
                gVar.f56274b.d("Waiting to bind to the service.", new Object[0]);
                gVar.f56276d.add(q1Var);
                return;
            }
        }
        gVar.f56274b.d("Initiate binding to the service.", new Object[0]);
        gVar.f56276d.add(q1Var);
        f fVar = new f(gVar, null);
        gVar.f56284l = fVar;
        gVar.f56279g = true;
        if (gVar.f56273a.bindService(gVar.f56280h, fVar, 1)) {
            return;
        }
        gVar.f56274b.d("Failed to bind to the service.", new Object[0]);
        gVar.f56279g = false;
        Iterator it = gVar.f56276d.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).b(new zzag());
        }
        gVar.f56276d.clear();
    }

    static /* bridge */ /* synthetic */ void q(g gVar) {
        gVar.f56274b.d("linkToDeath", new Object[0]);
        try {
            gVar.f56285m.asBinder().linkToDeath(gVar.f56282j, 0);
        } catch (RemoteException e10) {
            gVar.f56274b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(g gVar) {
        gVar.f56274b.d("unlinkToDeath", new Object[0]);
        gVar.f56285m.asBinder().unlinkToDeath(gVar.f56282j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f56275c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    public final void w() {
        Iterator it = this.f56277e.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.l) it.next()).d(v());
        }
        this.f56277e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f56272o;
        synchronized (map) {
            if (!map.containsKey(this.f56275c)) {
                HandlerThread handlerThread = new HandlerThread(this.f56275c, 10);
                handlerThread.start();
                map.put(this.f56275c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f56275c);
        }
        return handler;
    }

    @androidx.annotation.p0
    public final IInterface e() {
        return this.f56285m;
    }

    public final void s(q1 q1Var, @androidx.annotation.p0 com.google.android.gms.tasks.l lVar) {
        c().post(new t1(this, q1Var.a(), lVar, q1Var));
    }

    final /* synthetic */ void t(com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.k kVar) {
        synchronized (this.f56278f) {
            this.f56277e.remove(lVar);
        }
    }

    public final void u(com.google.android.gms.tasks.l lVar) {
        synchronized (this.f56278f) {
            this.f56277e.remove(lVar);
        }
        c().post(new u1(this));
    }
}
