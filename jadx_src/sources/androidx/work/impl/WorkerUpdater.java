package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.common.util.concurrent.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: WorkerUpdater.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "WorkerUpdater")
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0002¨\u0006\u001c"}, d2 = {"Landroidx/work/impl/r;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Landroidx/work/impl/t;", "schedulers", "Landroidx/work/impl/model/u;", "newWorkSpec", "", "", "tags", "Landroidx/work/WorkManager$UpdateResult;", "g", "Landroidx/work/impl/g0;", "Landroidx/work/y;", "workRequest", "Lcom/google/common/util/concurrent/p0;", RXScreenCaptureService.KEY_HEIGHT, "name", "Landroidx/work/q;", "d", "Landroidx/work/impl/o;", "message", "Lkotlin/b2;", "f", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class WorkerUpdater {
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final androidx.work.q d(@dl.d final g0 g0Var, @dl.d final String name, @dl.d final androidx.work.y workRequest) {
        kotlin.jvm.internal.f0.p(g0Var, "<this>");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(workRequest, "workRequest");
        final o oVar = new o();
        final yh.a<b2> aVar = new yh.a<b2>() { // from class: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                new androidx.work.impl.utils.e(new x(g0Var, name, ExistingWorkPolicy.KEEP, kotlin.collections.s.k(workRequest)), oVar).run();
            }
        };
        g0Var.R().c().execute(new Runnable() { // from class: androidx.work.impl.l0
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.e(g0Var, name, oVar, aVar, workRequest);
            }
        });
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g0 this_enqueueUniquelyNamedPeriodic, String name, o operation, yh.a enqueueNew, androidx.work.y workRequest) {
        kotlin.jvm.internal.f0.p(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        kotlin.jvm.internal.f0.p(name, "$name");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        kotlin.jvm.internal.f0.p(enqueueNew, "$enqueueNew");
        kotlin.jvm.internal.f0.p(workRequest, "$workRequest");
        androidx.work.impl.model.v vVarX = this_enqueueUniquelyNamedPeriodic.P().X();
        List<androidx.work.impl.model.u.IdAndState> listD = vVarX.D(name);
        if (listD.size() > 1) {
            f(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        androidx.work.impl.model.u.IdAndState idAndState = (androidx.work.impl.model.u.IdAndState) CollectionsKt___CollectionsKt.B2(listD);
        if (idAndState == null) {
            enqueueNew.invoke();
            return;
        }
        androidx.work.impl.model.u uVarZ = vVarX.z(idAndState.id);
        if (uVarZ == null) {
            operation.a(new androidx.work.q.b.a(new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!uVarZ.D()) {
            f(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (idAndState.state == WorkInfo.State.CANCELLED) {
            vVarX.a(idAndState.id);
            enqueueNew.invoke();
            return;
        }
        androidx.work.impl.model.u workSpec = workRequest.getWorkSpec();
        androidx.work.impl.model.u uVarX = workSpec.x((1048574 & 1) != 0 ? workSpec.id : idAndState.id, (1048574 & 2) != 0 ? workSpec.state : null, (1048574 & 4) != 0 ? workSpec.workerClassName : null, (1048574 & 8) != 0 ? workSpec.inputMergerClassName : null, (1048574 & 16) != 0 ? workSpec.input : null, (1048574 & 32) != 0 ? workSpec.output : null, (1048574 & 64) != 0 ? workSpec.initialDelay : 0L, (1048574 & 128) != 0 ? workSpec.intervalDuration : 0L, (1048574 & 256) != 0 ? workSpec.flexDuration : 0L, (1048574 & 512) != 0 ? workSpec.constraints : null, (1048574 & 1024) != 0 ? workSpec.runAttemptCount : 0, (1048574 & 2048) != 0 ? workSpec.backoffPolicy : null, (1048574 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? workSpec.lastEnqueueTime : 0L, (1048574 & 16384) != 0 ? workSpec.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? workSpec.expedited : false, (131072 & 1048574) != 0 ? workSpec.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? workSpec.periodCount : 0, (1048574 & 524288) != 0 ? workSpec.generation : 0);
        try {
            r processor = this_enqueueUniquelyNamedPeriodic.L();
            kotlin.jvm.internal.f0.o(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.P();
            kotlin.jvm.internal.f0.o(workDatabase, "workDatabase");
            androidx.work.a configuration = this_enqueueUniquelyNamedPeriodic.o();
            kotlin.jvm.internal.f0.o(configuration, "configuration");
            List<t> schedulers = this_enqueueUniquelyNamedPeriodic.N();
            kotlin.jvm.internal.f0.o(schedulers, "schedulers");
            g(processor, workDatabase, configuration, schedulers, uVarX, workRequest.c());
            operation.a(androidx.work.q.f29462a);
        } catch (Throwable th2) {
            operation.a(new androidx.work.q.b.a(th2));
        }
    }

    private static final void f(o oVar, String str) {
        oVar.a(new androidx.work.q.b.a(new UnsupportedOperationException(str)));
    }

    private static final WorkManager.UpdateResult g(r rVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends t> list, final androidx.work.impl.model.u uVar, final Set<String> set) {
        final String str = uVar.id;
        final androidx.work.impl.model.u uVarZ = workDatabase.X().z(str);
        if (uVarZ == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (uVarZ.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (uVarZ.D() ^ uVar.D()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = new yh.l<androidx.work.impl.model.u, String>() { // from class: androidx.work.impl.WorkerUpdater$updateWorkImpl$type$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@dl.d androidx.work.impl.model.u spec) {
                    kotlin.jvm.internal.f0.p(spec, "spec");
                    return spec.D() ? "Periodic" : "OneTime";
                }
            };
            throw new UnsupportedOperationException("Can't update " + workerUpdater$updateWorkImpl$type$1.invoke(uVarZ) + " Worker to " + workerUpdater$updateWorkImpl$type$1.invoke(uVar) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zL = rVar.l(str);
        if (!zL) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).cancel(str);
            }
        }
        workDatabase.M(new Runnable() { // from class: androidx.work.impl.j0
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.i(workDatabase, uVar, uVarZ, list, str, set, zL);
            }
        });
        if (!zL) {
            u.b(aVar, workDatabase, list);
        }
        return zL ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    @dl.d
    public static final p0<WorkManager.UpdateResult> h(@dl.d final g0 g0Var, @dl.d final androidx.work.y workRequest) {
        kotlin.jvm.internal.f0.p(g0Var, "<this>");
        kotlin.jvm.internal.f0.p(workRequest, "workRequest");
        final androidx.work.impl.utils.futures.a future = androidx.work.impl.utils.futures.a.u();
        g0Var.R().c().execute(new Runnable() { // from class: androidx.work.impl.k0
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.j(future, g0Var, workRequest);
            }
        });
        kotlin.jvm.internal.f0.o(future, "future");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WorkDatabase workDatabase, androidx.work.impl.model.u newWorkSpec, androidx.work.impl.model.u oldWorkSpec, List schedulers, String workSpecId, Set tags, boolean z10) {
        kotlin.jvm.internal.f0.p(workDatabase, "$workDatabase");
        kotlin.jvm.internal.f0.p(newWorkSpec, "$newWorkSpec");
        kotlin.jvm.internal.f0.p(oldWorkSpec, "$oldWorkSpec");
        kotlin.jvm.internal.f0.p(schedulers, "$schedulers");
        kotlin.jvm.internal.f0.p(workSpecId, "$workSpecId");
        kotlin.jvm.internal.f0.p(tags, "$tags");
        androidx.work.impl.model.v vVarX = workDatabase.X();
        androidx.work.impl.model.z zVarY = workDatabase.Y();
        vVarX.b(androidx.work.impl.utils.f.c(schedulers, newWorkSpec.x((1048574 & 1) != 0 ? newWorkSpec.id : null, (1048574 & 2) != 0 ? newWorkSpec.state : oldWorkSpec.state, (1048574 & 4) != 0 ? newWorkSpec.workerClassName : null, (1048574 & 8) != 0 ? newWorkSpec.inputMergerClassName : null, (1048574 & 16) != 0 ? newWorkSpec.input : null, (1048574 & 32) != 0 ? newWorkSpec.output : null, (1048574 & 64) != 0 ? newWorkSpec.initialDelay : 0L, (1048574 & 128) != 0 ? newWorkSpec.intervalDuration : 0L, (1048574 & 256) != 0 ? newWorkSpec.flexDuration : 0L, (1048574 & 512) != 0 ? newWorkSpec.constraints : null, (1048574 & 1024) != 0 ? newWorkSpec.runAttemptCount : oldWorkSpec.runAttemptCount, (1048574 & 2048) != 0 ? newWorkSpec.backoffPolicy : null, (1048574 & 4096) != 0 ? newWorkSpec.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? newWorkSpec.lastEnqueueTime : oldWorkSpec.lastEnqueueTime, (1048574 & 16384) != 0 ? newWorkSpec.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? newWorkSpec.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? newWorkSpec.expedited : false, (131072 & 1048574) != 0 ? newWorkSpec.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? newWorkSpec.periodCount : 0, (1048574 & 524288) != 0 ? newWorkSpec.generation : oldWorkSpec.z() + 1)));
        zVarY.a(workSpecId);
        zVarY.b(workSpecId, tags);
        if (z10) {
            return;
        }
        vVarX.C(workSpecId, -1L);
        workDatabase.W().a(workSpecId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.work.impl.utils.futures.a aVar, g0 this_updateWorkImpl, androidx.work.y workRequest) {
        kotlin.jvm.internal.f0.p(this_updateWorkImpl, "$this_updateWorkImpl");
        kotlin.jvm.internal.f0.p(workRequest, "$workRequest");
        if (aVar.isCancelled()) {
            return;
        }
        try {
            r processor = this_updateWorkImpl.L();
            kotlin.jvm.internal.f0.o(processor, "processor");
            WorkDatabase workDatabase = this_updateWorkImpl.P();
            kotlin.jvm.internal.f0.o(workDatabase, "workDatabase");
            androidx.work.a configuration = this_updateWorkImpl.o();
            kotlin.jvm.internal.f0.o(configuration, "configuration");
            List<t> schedulers = this_updateWorkImpl.N();
            kotlin.jvm.internal.f0.o(schedulers, "schedulers");
            aVar.p(g(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.c()));
        } catch (Throwable th2) {
            aVar.q(th2);
        }
    }
}
