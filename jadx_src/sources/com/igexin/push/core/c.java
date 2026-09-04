package com.igexin.push.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.igexin.assist.sdk.AssistPushManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.igexin.a.a.d.a.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static c f63638l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f63639a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f63641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f63642d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.igexin.push.core.a.e f63644f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.igexin.a.a.b.b f63646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.igexin.push.e.a f63647i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.igexin.push.b.b f63649k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f63648j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentLinkedQueue<Message> f63643e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f63640b = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.igexin.a.a.b.c f63645g = com.igexin.a.a.b.c.b();

    private c() {
        this.f63645g.a((com.igexin.a.a.d.a.a<String, Integer, com.igexin.a.a.b.b, com.igexin.a.a.b.d>) new com.igexin.push.d.a(this.f63639a));
        this.f63645g.a((com.igexin.a.a.d.a.b) this);
        this.f63647i = new com.igexin.push.e.a();
    }

    public static c a() {
        if (f63638l == null) {
            f63638l = new c();
        }
        return f63638l;
    }

    private void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction(CoreConsts.f63452b);
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT > 33) {
            this.f63639a.registerReceiver(l.a(), intentFilter, d.az, null, 4);
        } else {
            this.f63639a.registerReceiver(l.a(), intentFilter, d.az, null);
        }
    }

    public boolean a(Context context) {
        this.f63639a = context.getApplicationContext();
        f fVar = this.f63640b;
        if (fVar != null && fVar.isAlive()) {
            com.igexin.a.a.c.b.a("CoreLogic|coreThread is alive +++++", new Object[0]);
            return true;
        }
        if (!this.f63648j.getAndSet(true)) {
            com.igexin.a.a.c.b.a("CoreLogic|start coreThread +++++", new Object[0]);
            this.f63640b.start();
            this.f63641c = new b(this.f63640b.getLooper());
            this.f63642d = new com.igexin.a.a.b.a.a.d(this.f63640b.getLooper());
        }
        return true;
    }

    public boolean a(Message message) {
        if (d.f63672f.get()) {
            this.f63641c.sendMessage(message);
            return true;
        }
        this.f63643e.add(message);
        return true;
    }

    @Override // com.igexin.a.a.d.a.b
    public boolean a(com.igexin.a.a.d.a.e eVar, com.igexin.a.a.d.f fVar) {
        com.igexin.push.core.a.e eVar2 = this.f63644f;
        return eVar2 != null && eVar2.a(eVar);
    }

    @Override // com.igexin.a.a.d.a.b
    public boolean a(com.igexin.a.a.d.e eVar, com.igexin.a.a.d.f fVar) {
        com.igexin.push.core.a.e eVar2 = this.f63644f;
        return eVar2 != null && eVar2.a(eVar);
    }

    public boolean a(com.igexin.push.f.b.g gVar) {
        return gVar != null && com.igexin.a.a.b.c.b().a(gVar, false, true);
    }

    public boolean a(boolean z10) {
        com.igexin.a.a.c.b.a("CoreLogic|start sdkSwitch isSlave = " + z10, new Object[0]);
        Context context = d.f63671e;
        if (context == null) {
            return false;
        }
        if (!new com.igexin.sdk.a.c(context).b()) {
            new com.igexin.sdk.a.d(d.f63671e).a();
            d.f63675i = true;
            new com.igexin.sdk.a.c(d.f63671e).a();
        }
        if (z10) {
            new com.igexin.sdk.a.d(d.f63671e).a();
            d.f63675i = true;
        }
        a().i().b();
        return true;
    }

    public Handler b() {
        return this.f63642d;
    }

    public void c() {
        Handler handler;
        try {
            this.f63649k = new com.igexin.push.b.b(this.f63639a);
            d.a(this.f63639a);
            com.igexin.push.config.j.a().b();
            n();
            com.igexin.push.b.a aVar = new com.igexin.push.b.a();
            aVar.a(com.igexin.push.core.b.i.a());
            aVar.a(com.igexin.push.core.b.e.a());
            aVar.a(com.igexin.push.core.b.c.a());
            aVar.a(com.igexin.push.config.a.a());
            this.f63645g.a(aVar, true, false);
            this.f63645g.a(this.f63639a);
            com.igexin.a.a.b.c.b().a(com.igexin.a.b.a.a(d.B.getBytes()));
            d.Z = this.f63645g.a(com.igexin.push.f.b.b.i(), false, true);
            d.f63656aa = this.f63645g.a(com.igexin.push.f.b.f.i(), true, true);
            com.igexin.push.c.i.a().b();
            d();
            this.f63644f = com.igexin.push.core.a.e.a();
            this.f63647i.b();
            com.igexin.push.a.a.c.c().d();
            d.f63672f.set(true);
            r.a().a(Process.myPid());
            com.igexin.push.extension.a.a().a(this.f63639a);
            while (!this.f63643e.isEmpty()) {
                Message messagePoll = this.f63643e.poll();
                if (messagePoll != null && (handler = this.f63641c) != null) {
                    handler.sendMessage(messagePoll);
                }
            }
            w.a().f();
            try {
                AssistPushManager.getInstance().initialize(d.f63671e);
                AssistPushManager.getInstance().register(d.f63671e);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("CoreLogic|init|failed|" + th2.toString(), new Object[0]);
            com.igexin.a.a.c.a.f.a().a("CoreLogic init failed = " + th2.toString());
        }
    }

    public void d() {
        com.igexin.push.f.b.a aVarI = com.igexin.push.f.b.a.i();
        com.igexin.push.a.a.b bVar = new com.igexin.push.a.a.b();
        aVarI.a(bVar);
        aVarI.a(new com.igexin.push.a.a.a());
        aVarI.a(com.igexin.push.a.a.c.c());
        try {
            bVar.a();
            bVar.a(System.currentTimeMillis());
        } catch (Throwable unused) {
        }
        d.f63657ab = this.f63645g.a(aVarI, false, true);
    }

    public long e() {
        Handler handler = this.f63641c;
        if (handler == null) {
            return -2L;
        }
        return handler.getLooper().getThread().getId();
    }

    public String f() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) d.f63671e.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return "mobile";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    void g() {
        Context context = d.f63671e;
        if (context != null) {
            new com.igexin.sdk.a.d(context).b();
            d.f63675i = false;
            d.f63679m = false;
            this.f63647i.c();
        }
    }

    public com.igexin.a.a.b.b h() {
        if (this.f63646h == null) {
            this.f63646h = com.igexin.push.d.a.b.a();
        }
        return this.f63646h;
    }

    public com.igexin.push.e.a i() {
        return this.f63647i;
    }

    public com.igexin.push.core.a.e j() {
        return this.f63644f;
    }

    public com.igexin.push.b.b k() {
        return this.f63649k;
    }

    @Override // com.igexin.a.a.d.a.b
    public boolean l() {
        return true;
    }

    @Override // com.igexin.a.a.d.a.b
    public long m() {
        return 94808L;
    }
}
