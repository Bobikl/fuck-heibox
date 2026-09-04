package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.impl.t;
import androidx.work.n;

/* JADX INFO: compiled from: SystemAlarmScheduler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28903c = n.i("SystemAlarmScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28904b;

    public h(@n0 Context context) {
        this.f28904b = context.getApplicationContext();
    }

    private void a(@n0 u uVar) {
        n.e().a(f28903c, "Scheduling work with workSpecId " + uVar.id);
        this.f28904b.startService(b.f(this.f28904b, x.a(uVar)));
    }

    @Override // androidx.work.impl.t
    public boolean b() {
        return true;
    }

    @Override // androidx.work.impl.t
    public void c(@n0 u... uVarArr) {
        for (u uVar : uVarArr) {
            a(uVar);
        }
    }

    @Override // androidx.work.impl.t
    public void cancel(@n0 String str) {
        this.f28904b.startService(b.h(this.f28904b, str));
    }
}
