package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29259a = "androidx.work.impl.background.gcm.GcmScheduler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29260b = androidx.work.n.i("Schedulers");

    private u() {
    }

    @androidx.annotation.n0
    static t a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 g0 g0Var) {
        androidx.work.impl.background.systemjob.j jVar = new androidx.work.impl.background.systemjob.j(context, g0Var);
        androidx.work.impl.utils.q.c(context, SystemJobService.class, true);
        androidx.work.n.e().a(f29260b, "Created SystemJobScheduler and enabled SystemJobService");
        return jVar;
    }

    public static void b(@androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 WorkDatabase workDatabase, @p0 List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.v vVarX = workDatabase.X();
        workDatabase.e();
        try {
            List<androidx.work.impl.model.u> listE = vVarX.E(aVar.h());
            List<androidx.work.impl.model.u> listL = vVarX.l(200);
            if (listE != null && listE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<androidx.work.impl.model.u> it = listE.iterator();
                while (it.hasNext()) {
                    vVarX.C(it.next().id, jCurrentTimeMillis);
                }
            }
            workDatabase.O();
            workDatabase.k();
            if (listE != null && listE.size() > 0) {
                androidx.work.impl.model.u[] uVarArr = (androidx.work.impl.model.u[]) listE.toArray(new androidx.work.impl.model.u[listE.size()]);
                for (t tVar : list) {
                    if (tVar.b()) {
                        tVar.c(uVarArr);
                    }
                }
            }
            if (listL == null || listL.size() <= 0) {
                return;
            }
            androidx.work.impl.model.u[] uVarArr2 = (androidx.work.impl.model.u[]) listL.toArray(new androidx.work.impl.model.u[listL.size()]);
            for (t tVar2 : list) {
                if (!tVar2.b()) {
                    tVar2.c(uVarArr2);
                }
            }
        } catch (Throwable th2) {
            workDatabase.k();
            throw th2;
        }
    }

    @p0
    private static t c(@androidx.annotation.n0 Context context) {
        try {
            t tVar = (t) Class.forName(f29259a).getConstructor(Context.class).newInstance(context);
            androidx.work.n.e().a(f29260b, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return tVar;
        } catch (Throwable th2) {
            androidx.work.n.e().b(f29260b, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
