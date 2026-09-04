package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.u;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CommandHandler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements androidx.work.impl.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28846f = n.i("CommandHandler");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f28847g = "ACTION_SCHEDULE_WORK";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f28848h = "ACTION_DELAY_MET";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f28849i = "ACTION_STOP_WORK";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f28850j = "ACTION_CONSTRAINTS_CHANGED";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f28851k = "ACTION_RESCHEDULE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f28852l = "ACTION_EXECUTION_COMPLETED";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f28853m = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28854n = "KEY_WORKSPEC_GENERATION";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f28855o = "KEY_NEEDS_RESCHEDULE";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final long f28856p = 600000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<WorkGenerationalId, f> f28858c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f28859d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f28860e;

    b(@n0 Context context, @n0 w wVar) {
        this.f28857b = context;
        this.f28860e = wVar;
    }

    static Intent a(@n0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28850j);
        return intent;
    }

    static Intent b(@n0 Context context, @n0 WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28848h);
        return s(intent, workGenerationalId);
    }

    static Intent c(@n0 Context context, @n0 WorkGenerationalId workGenerationalId, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28852l);
        intent.putExtra(f28855o, z10);
        return s(intent, workGenerationalId);
    }

    static Intent e(@n0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28851k);
        return intent;
    }

    static Intent f(@n0 Context context, @n0 WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28847g);
        return s(intent, workGenerationalId);
    }

    static Intent g(@n0 Context context, @n0 WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28849i);
        return s(intent, workGenerationalId);
    }

    static Intent h(@n0 Context context, @n0 String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f28849i);
        intent.putExtra(f28853m, str);
        return intent;
    }

    private void i(@n0 Intent intent, int i10, @n0 g gVar) {
        n.e().a(f28846f, "Handling constraints changed " + intent);
        new c(this.f28857b, i10, gVar).a();
    }

    private void j(@n0 Intent intent, int i10, @n0 g gVar) {
        synchronized (this.f28859d) {
            WorkGenerationalId workGenerationalIdR = r(intent);
            n nVarE = n.e();
            String str = f28846f;
            nVarE.a(str, "Handing delay met for " + workGenerationalIdR);
            if (this.f28858c.containsKey(workGenerationalIdR)) {
                n.e().a(str, "WorkSpec " + workGenerationalIdR + " is is already being handled for ACTION_DELAY_MET");
            } else {
                f fVar = new f(this.f28857b, i10, gVar, this.f28860e.e(workGenerationalIdR));
                this.f28858c.put(workGenerationalIdR, fVar);
                fVar.g();
            }
        }
    }

    private void k(@n0 Intent intent, int i10) {
        WorkGenerationalId workGenerationalIdR = r(intent);
        boolean z10 = intent.getExtras().getBoolean(f28855o);
        n.e().a(f28846f, "Handling onExecutionCompleted " + intent + ", " + i10);
        m(workGenerationalIdR, z10);
    }

    private void l(@n0 Intent intent, int i10, @n0 g gVar) {
        n.e().a(f28846f, "Handling reschedule " + intent + ", " + i10);
        gVar.g().U();
    }

    private void m(@n0 Intent intent, int i10, @n0 g gVar) {
        WorkGenerationalId workGenerationalIdR = r(intent);
        n nVarE = n.e();
        String str = f28846f;
        nVarE.a(str, "Handling schedule work for " + workGenerationalIdR);
        WorkDatabase workDatabaseP = gVar.g().P();
        workDatabaseP.e();
        try {
            u uVarZ = workDatabaseP.X().z(workGenerationalIdR.f());
            if (uVarZ == null) {
                n.e().l(str, "Skipping scheduling " + workGenerationalIdR + " because it's no longer in the DB");
                return;
            }
            if (uVarZ.state.isFinished()) {
                n.e().l(str, "Skipping scheduling " + workGenerationalIdR + "because it is finished.");
                return;
            }
            long jC = uVarZ.c();
            if (uVarZ.B()) {
                n.e().a(str, "Opportunistically setting an alarm for " + workGenerationalIdR + "at " + jC);
                a.c(this.f28857b, workDatabaseP, workGenerationalIdR, jC);
                gVar.f().b().execute(new g.b(gVar, a(this.f28857b), i10));
            } else {
                n.e().a(str, "Setting up Alarms for " + workGenerationalIdR + "at " + jC);
                a.c(this.f28857b, workDatabaseP, workGenerationalIdR, jC);
            }
            workDatabaseP.O();
        } finally {
            workDatabaseP.k();
        }
    }

    private void n(@n0 Intent intent, @n0 g gVar) {
        List<v> listD;
        Bundle extras = intent.getExtras();
        String string = extras.getString(f28853m);
        if (extras.containsKey(f28854n)) {
            int i10 = extras.getInt(f28854n);
            listD = new ArrayList<>(1);
            v vVarB = this.f28860e.b(new WorkGenerationalId(string, i10));
            if (vVarB != null) {
                listD.add(vVarB);
            }
        } else {
            listD = this.f28860e.d(string);
        }
        for (v vVar : listD) {
            n.e().a(f28846f, "Handing stopWork work for " + string);
            gVar.g().a0(vVar);
            a.a(this.f28857b, gVar.g().P(), vVar.getId());
            gVar.m(vVar.getId(), false);
        }
    }

    private static boolean o(@p0 Bundle bundle, @n0 String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static WorkGenerationalId r(@n0 Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra(f28853m), intent.getIntExtra(f28854n, 0));
    }

    private static Intent s(@n0 Intent intent, @n0 WorkGenerationalId workGenerationalId) {
        intent.putExtra(f28853m, workGenerationalId.f());
        intent.putExtra(f28854n, workGenerationalId.e());
        return intent;
    }

    @Override // androidx.work.impl.e
    /* JADX INFO: renamed from: d */
    public void m(@n0 WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (this.f28859d) {
            f fVarRemove = this.f28858c.remove(workGenerationalId);
            this.f28860e.b(workGenerationalId);
            if (fVarRemove != null) {
                fVarRemove.h(z10);
            }
        }
    }

    boolean p() {
        boolean z10;
        synchronized (this.f28859d) {
            z10 = !this.f28858c.isEmpty();
        }
        return z10;
    }

    @k1
    void q(@n0 Intent intent, int i10, @n0 g gVar) {
        String action = intent.getAction();
        if (f28850j.equals(action)) {
            i(intent, i10, gVar);
            return;
        }
        if (f28851k.equals(action)) {
            l(intent, i10, gVar);
            return;
        }
        if (!o(intent.getExtras(), f28853m)) {
            n.e().c(f28846f, "Invalid request for " + action + " , requires " + f28853m + " .");
            return;
        }
        if (f28847g.equals(action)) {
            m(intent, i10, gVar);
            return;
        }
        if (f28848h.equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (f28849i.equals(action)) {
            n(intent, gVar);
            return;
        }
        if (f28852l.equals(action)) {
            k(intent, i10);
            return;
        }
        n.e().l(f28846f, "Ignoring intent " + intent);
    }
}
