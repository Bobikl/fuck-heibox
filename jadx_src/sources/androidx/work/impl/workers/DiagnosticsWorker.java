package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.g0;
import androidx.work.impl.model.j;
import androidx.work.impl.model.o;
import androidx.work.impl.model.u;
import androidx.work.impl.model.v;
import androidx.work.impl.model.z;
import androidx.work.m;
import androidx.work.n;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroidx/work/m$a;", RXScreenCaptureService.KEY_WIDTH, "Landroid/content/Context;", d.R, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@dl.d Context context, @dl.d WorkerParameters parameters) {
        super(context, parameters);
        f0.p(context, "context");
        f0.p(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @dl.d
    public m.a w() {
        g0 g0VarJ = g0.J(b());
        f0.o(g0VarJ, "getInstance(applicationContext)");
        WorkDatabase workDatabaseP = g0VarJ.P();
        f0.o(workDatabaseP, "workManager.workDatabase");
        v vVarX = workDatabaseP.X();
        o oVarV = workDatabaseP.V();
        z zVarY = workDatabaseP.Y();
        j jVarU = workDatabaseP.U();
        List<u> listW = vVarX.w(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<u> listG = vVarX.G();
        List<u> listL = vVarX.l(200);
        if (!listW.isEmpty()) {
            n.e().f(q3.d.f138584a, "Recently completed work:\n\n");
            n.e().f(q3.d.f138584a, q3.d.d(oVarV, zVarY, jVarU, listW));
        }
        if (!listG.isEmpty()) {
            n.e().f(q3.d.f138584a, "Running work:\n\n");
            n.e().f(q3.d.f138584a, q3.d.d(oVarV, zVarY, jVarU, listG));
        }
        if (!listL.isEmpty()) {
            n.e().f(q3.d.f138584a, "Enqueued work:\n\n");
            n.e().f(q3.d.f138584a, q3.d.d(oVarV, zVarY, jVarU, listL));
        }
        m.a aVarE = m.a.e();
        f0.o(aVarE, "success()");
        return aVarE;
    }
}
