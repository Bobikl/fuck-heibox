package com.igexin.push.core;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.igexin.push.util.EncryptUtils;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.IPushCore;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f63788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pair<Integer, String> f63789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IPushCore f63790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f63791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f63792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ServiceConnection f63794g;

    private x() {
        this.f63791d = new AtomicBoolean(false);
        this.f63794g = new z(this);
        this.f63792e = Executors.newSingleThreadExecutor();
    }

    /* synthetic */ x(y yVar) {
        this();
    }

    private int a(Service service) {
        com.igexin.a.a.c.b.a("ServiceManager|start by system ####", new Object[0]);
        if (!a((Context) service, false)) {
            service.stopSelf();
            return 2;
        }
        com.igexin.a.a.c.b.a("ServiceManager|intent = null", new Object[0]);
        if (!this.f63791d.getAndSet(true)) {
            a(service, (Intent) null);
        }
        return 2;
    }

    private int a(Intent intent, int i10, int i11) {
        if (this.f63790c == null) {
            return 2;
        }
        com.igexin.a.a.c.b.a("ServiceManager|inInit = true, call onServiceStartCommand...", new Object[0]);
        return this.f63790c.onServiceStartCommand(intent, i10, i11);
    }

    public static x a() {
        return aa.f63503a;
    }

    private void a(Service service, Intent intent) {
        com.igexin.a.a.c.b.a("ServiceManager|startPushCore ++++", new Object[0]);
        if (!EncryptUtils.isLoadSuccess()) {
            Log.e("ServiceManager", "load so error ####");
            service.stopSelf();
            return;
        }
        com.igexin.sdk.a.a.a().b();
        IPushCore iPushCoreC = com.igexin.sdk.a.a.a().c();
        this.f63790c = iPushCoreC;
        if (iPushCoreC != null) {
            iPushCoreC.start(service);
        }
    }

    private boolean a(Context context, boolean z10) {
        if (com.igexin.push.util.d.a(context)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        com.igexin.push.config.m.a(context);
        return com.igexin.push.config.l.f63433k;
    }

    private int b(Service service, Intent intent, int i10, int i11) {
        com.igexin.a.a.c.b.a("ServiceManager|start from initialize...", new Object[0]);
        com.igexin.a.a.c.a.f.a().a("ServiceManager start from initialize...");
        a(service, intent);
        IPushCore iPushCore = this.f63790c;
        if (iPushCore != null) {
            return iPushCore.onServiceStartCommand(intent, i10, i11);
        }
        return 2;
    }

    private boolean b(Context context, Intent intent) {
        this.f63792e.execute(new y(this, context, intent));
        return true;
    }

    private int c(Service service, Intent intent, int i10, int i11) {
        if (!a((Context) service, true)) {
            this.f63791d.set(false);
            service.stopSelf();
            return 2;
        }
        a(service, intent);
        IPushCore iPushCore = this.f63790c;
        if (iPushCore != null) {
            return iPushCore.onServiceStartCommand(intent, i10, i11);
        }
        return 2;
    }

    public int a(Service service, Intent intent, int i10, int i11) {
        try {
            if (intent == null) {
                this.f63789b = Pair.create(1, null);
                return a(service);
            }
            com.igexin.push.util.o.a(service, intent);
            String stringExtra = intent.getStringExtra("action");
            if (PushConsts.ACTION_SERVICE_INITIALIZE.equals(stringExtra)) {
                com.igexin.push.util.d.b(service);
            }
            if (this.f63791d.getAndSet(true)) {
                return a(intent, i10, i11);
            }
            if (PushConsts.ACTION_SERVICE_INITIALIZE.equals(stringExtra)) {
                this.f63789b = Pair.create(0, null);
                return b(service, intent, i10, i11);
            }
            this.f63789b = Pair.create(1, intent.getStringExtra("pkg"));
            return c(service, intent, i10, i11);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("ServiceManager|" + th2.toString(), new Object[0]);
            return 2;
        }
    }

    public IBinder a(Intent intent) {
        com.igexin.a.a.c.b.a("ServiceManager|onBind...", new Object[0]);
        IPushCore iPushCore = this.f63790c;
        if (iPushCore != null) {
            return iPushCore.onServiceBind(intent);
        }
        return null;
    }

    public void a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                intent = new Intent(activity, (Class<?>) com.igexin.push.core.a.e.a().a((Context) activity));
            } else {
                intent.setComponent(new ComponentName(activity, (Class<?>) com.igexin.push.core.a.e.a().a((Context) activity)));
            }
            a(activity, intent);
            com.igexin.a.a.c.b.a("ServiceManager|start PushService from da", new Object[0]);
        } catch (Throwable th2) {
            try {
                com.igexin.a.a.c.b.a("ServiceManager" + th2.toString(), new Object[0]);
            } finally {
                activity.finish();
            }
        }
    }

    public void a(Context context) {
        f63788a = context.getApplicationContext();
    }

    public boolean a(Context context, Intent intent) {
        return b(context, intent);
    }

    public Class b(Context context) {
        try {
            String str = (String) com.igexin.push.util.o.c(context, "us", "", new String[0]);
            if (!TextUtils.isEmpty(str)) {
                return Class.forName(str);
            }
            Class cls = (Class) com.igexin.push.util.b.a(context, PushService.class).second;
            return cls != null ? cls : PushService.class;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("ServiceManager|" + th2.toString(), new Object[0]);
            return PushService.class;
        }
    }

    public void b() {
        com.igexin.a.a.c.b.a("ServiceManager|onLowMemory...", new Object[0]);
    }

    public Class c(Context context) {
        try {
            String str = (String) com.igexin.push.util.o.c(context, "uis", "", new String[0]);
            return !TextUtils.isEmpty(str) ? Class.forName(str) : (Class) com.igexin.push.util.b.a(context, GTIntentService.class).second;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("ServiceManager|" + th2.toString(), new Object[0]);
            return null;
        }
    }

    public void c() {
        com.igexin.a.a.c.b.a("ServiceManager|onDestroy...", new Object[0]);
        IPushCore iPushCore = this.f63790c;
        if (iPushCore != null) {
            iPushCore.onServiceDestroy();
        }
    }

    public String d(Context context) {
        return (String) com.igexin.push.util.o.c(context, "ua", "", new String[0]);
    }
}
