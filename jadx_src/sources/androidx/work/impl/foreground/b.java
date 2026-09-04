package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.h;
import androidx.work.impl.e;
import androidx.work.impl.g0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o3.d;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements o3.c, e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f28984l = n.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f28985m = "KEY_NOTIFICATION";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28986n = "KEY_NOTIFICATION_ID";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f28987o = "KEY_FOREGROUND_SERVICE_TYPE";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f28988p = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f28989q = "KEY_GENERATION";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f28990r = "ACTION_START_FOREGROUND";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f28991s = "ACTION_NOTIFY";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f28992t = "ACTION_CANCEL_WORK";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f28993u = "ACTION_STOP_FOREGROUND";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g0 f28995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.c f28996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f28997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    WorkGenerationalId f28998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<WorkGenerationalId, h> f28999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<WorkGenerationalId, u> f29000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Set<u> f29001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final d f29002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private InterfaceC0232b f29003k;

    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29004b;

        a(String str) {
            this.f29004b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVarH = b.this.f28995c.L().h(this.f29004b);
            if (uVarH == null || !uVarH.B()) {
                return;
            }
            synchronized (b.this.f28997e) {
                b.this.f29000h.put(x.a(uVarH), uVarH);
                b.this.f29001i.add(uVarH);
                b bVar = b.this;
                bVar.f29002j.a(bVar.f29001i);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    public interface InterfaceC0232b {
        void a(int i10, @n0 Notification notification);

        void c(int i10, int i11, @n0 Notification notification);

        void d(int i10);

        void stop();
    }

    b(@n0 Context context) {
        this.f28994b = context;
        this.f28997e = new Object();
        g0 g0VarJ = g0.J(context);
        this.f28995c = g0VarJ;
        this.f28996d = g0VarJ.R();
        this.f28998f = null;
        this.f28999g = new LinkedHashMap();
        this.f29001i = new HashSet();
        this.f29000h = new HashMap();
        this.f29002j = new o3.e(this.f28995c.O(), this);
        this.f28995c.L().g(this);
    }

    @j1
    b(@n0 Context context, @n0 g0 g0Var, @n0 d dVar) {
        this.f28994b = context;
        this.f28997e = new Object();
        this.f28995c = g0Var;
        this.f28996d = g0Var.R();
        this.f28998f = null;
        this.f28999g = new LinkedHashMap();
        this.f29001i = new HashSet();
        this.f29000h = new HashMap();
        this.f29002j = dVar;
        this.f28995c.L().g(this);
    }

    @n0
    public static Intent c(@n0 Context context, @n0 String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f28992t);
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra(f28988p, str);
        return intent;
    }

    @n0
    public static Intent f(@n0 Context context, @n0 WorkGenerationalId workGenerationalId, @n0 h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f28991s);
        intent.putExtra(f28986n, hVar.c());
        intent.putExtra(f28987o, hVar.a());
        intent.putExtra(f28985m, hVar.b());
        intent.putExtra(f28988p, workGenerationalId.f());
        intent.putExtra(f28989q, workGenerationalId.e());
        return intent;
    }

    @n0
    public static Intent g(@n0 Context context, @n0 WorkGenerationalId workGenerationalId, @n0 h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f28990r);
        intent.putExtra(f28988p, workGenerationalId.f());
        intent.putExtra(f28989q, workGenerationalId.e());
        intent.putExtra(f28986n, hVar.c());
        intent.putExtra(f28987o, hVar.a());
        intent.putExtra(f28985m, hVar.b());
        return intent;
    }

    @n0
    public static Intent h(@n0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f28993u);
        return intent;
    }

    @k0
    private void i(@n0 Intent intent) {
        n.e().f(f28984l, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra(f28988p);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f28995c.h(UUID.fromString(stringExtra));
    }

    @k0
    private void j(@n0 Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra(f28986n, 0);
        int intExtra2 = intent.getIntExtra(f28987o, 0);
        String stringExtra = intent.getStringExtra(f28988p);
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra(f28989q, 0));
        Notification notification = (Notification) intent.getParcelableExtra(f28985m);
        n.e().a(f28984l, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f29003k == null) {
            return;
        }
        this.f28999g.put(workGenerationalId, new h(intExtra, notification, intExtra2));
        if (this.f28998f == null) {
            this.f28998f = workGenerationalId;
            this.f29003k.c(intExtra, intExtra2, notification);
            return;
        }
        this.f29003k.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<WorkGenerationalId, h>> it = this.f28999g.entrySet().iterator();
        while (it.hasNext()) {
            iA |= it.next().getValue().a();
        }
        h hVar = this.f28999g.get(this.f28998f);
        if (hVar != null) {
            this.f29003k.c(hVar.c(), iA, hVar.b());
        }
    }

    @k0
    private void k(@n0 Intent intent) {
        n.e().f(f28984l, "Started foreground service " + intent);
        this.f28996d.a(new a(intent.getStringExtra(f28988p)));
    }

    @Override // o3.c
    public void a(@n0 List<u> list) {
        if (list.isEmpty()) {
            return;
        }
        for (u uVar : list) {
            String str = uVar.id;
            n.e().a(f28984l, "Constraints unmet for WorkSpec " + str);
            this.f28995c.Z(x.a(uVar));
        }
    }

    @Override // androidx.work.impl.e
    @k0
    /* JADX INFO: renamed from: d */
    public void m(@n0 WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, h> entry;
        synchronized (this.f28997e) {
            u uVarRemove = this.f29000h.remove(workGenerationalId);
            if (uVarRemove != null ? this.f29001i.remove(uVarRemove) : false) {
                this.f29002j.a(this.f29001i);
            }
        }
        h hVarRemove = this.f28999g.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f28998f) && this.f28999g.size() > 0) {
            Iterator<Map.Entry<WorkGenerationalId, h>> it = this.f28999g.entrySet().iterator();
            Map.Entry<WorkGenerationalId, h> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f28998f = entry.getKey();
            if (this.f29003k != null) {
                h value = entry.getValue();
                this.f29003k.c(value.c(), value.a(), value.b());
                this.f29003k.d(value.c());
            }
        }
        InterfaceC0232b interfaceC0232b = this.f29003k;
        if (hVarRemove == null || interfaceC0232b == null) {
            return;
        }
        n.e().a(f28984l, "Removing Notification (id: " + hVarRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + hVarRemove.a());
        interfaceC0232b.d(hVarRemove.c());
    }

    @Override // o3.c
    public void e(@n0 List<u> list) {
    }

    @k0
    void l(@n0 Intent intent) {
        n.e().f(f28984l, "Stopping foreground service");
        InterfaceC0232b interfaceC0232b = this.f29003k;
        if (interfaceC0232b != null) {
            interfaceC0232b.stop();
        }
    }

    @k0
    void m() {
        this.f29003k = null;
        synchronized (this.f28997e) {
            this.f29002j.reset();
        }
        this.f28995c.L().o(this);
    }

    void n(@n0 Intent intent) {
        String action = intent.getAction();
        if (f28990r.equals(action)) {
            k(intent);
            j(intent);
        } else if (f28991s.equals(action)) {
            j(intent);
        } else if (f28992t.equals(action)) {
            i(intent);
        } else if (f28993u.equals(action)) {
            l(intent);
        }
    }

    @k0
    void o(@n0 InterfaceC0232b interfaceC0232b) {
        if (this.f29003k != null) {
            n.e().c(f28984l, "A callback already exists.");
        } else {
            this.f29003k = interfaceC0232b;
        }
    }
}
