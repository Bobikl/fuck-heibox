package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.work.WorkerParameters;
import androidx.work.impl.g0;
import androidx.work.impl.model.u;
import androidx.work.impl.model.v;
import androidx.work.impl.utils.futures.a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.m;
import androidx.work.n;
import com.google.common.util.concurrent.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import o3.c;

/* JADX INFO: compiled from: ConstraintTrackingWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001e\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00060\u0006 \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/m;", "Lo3/c;", "Lkotlin/b2;", ak.aD, "Lcom/google/common/util/concurrent/p0;", "Landroidx/work/m$a;", ak.aG, "q", "", "Landroidx/work/impl/model/u;", "workSpecs", "e", ak.av, "Landroidx/work/WorkerParameters;", "f", "Landroidx/work/WorkerParameters;", "workerParameters", "", "g", "Ljava/lang/Object;", "lock", "", RXScreenCaptureService.KEY_HEIGHT, "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/a;", "kotlin.jvm.PlatformType", "i", "Landroidx/work/impl/utils/futures/a;", "future", "<set-?>", "j", "Landroidx/work/m;", "y", "()Landroidx/work/m;", "delegate", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ConstraintTrackingWorker extends m implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean areConstraintsUnmet;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a<m.a> future;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @e
    private m delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@d Context appContext, @d WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        f0.p(appContext, "appContext");
        f0.p(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = a.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ConstraintTrackingWorker this$0, p0 innerFuture) {
        f0.p(this$0, "this$0");
        f0.p(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            if (this$0.areConstraintsUnmet) {
                a<m.a> future = this$0.future;
                f0.o(future, "future");
                q3.c.e(future);
            } else {
                this$0.future.r(innerFuture);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(ConstraintTrackingWorker this$0) {
        f0.p(this$0, "this$0");
        this$0.z();
    }

    private final void z() {
        if (this.future.isCancelled()) {
            return;
        }
        String strA = g().A(q3.c.f138583b);
        n nVarE = n.e();
        f0.o(nVarE, "get()");
        if (strA == null || strA.length() == 0) {
            nVarE.c(q3.c.f138582a, "No worker to delegate to.");
            a<m.a> future = this.future;
            f0.o(future, "future");
            q3.c.d(future);
            return;
        }
        m mVarB = n().b(b(), strA, this.workerParameters);
        this.delegate = mVarB;
        if (mVarB == null) {
            nVarE.a(q3.c.f138582a, "No worker to delegate to.");
            a<m.a> future2 = this.future;
            f0.o(future2, "future");
            q3.c.d(future2);
            return;
        }
        g0 g0VarJ = g0.J(b());
        f0.o(g0VarJ, "getInstance(applicationContext)");
        v vVarX = g0VarJ.P().X();
        String string = f().toString();
        f0.o(string, "id.toString()");
        u uVarZ = vVarX.z(string);
        if (uVarZ == null) {
            a<m.a> future3 = this.future;
            f0.o(future3, "future");
            q3.c.d(future3);
            return;
        }
        androidx.work.impl.constraints.trackers.n nVarO = g0VarJ.O();
        f0.o(nVarO, "workManagerImpl.trackers");
        o3.e eVar = new o3.e(nVarO, this);
        eVar.a(s.k(uVarZ));
        String string2 = f().toString();
        f0.o(string2, "id.toString()");
        if (!eVar.d(string2)) {
            nVarE.a(q3.c.f138582a, "Constraints not met for delegate " + strA + ". Requesting retry.");
            a<m.a> future4 = this.future;
            f0.o(future4, "future");
            q3.c.e(future4);
            return;
        }
        nVarE.a(q3.c.f138582a, "Constraints met for delegate " + strA);
        try {
            m mVar = this.delegate;
            f0.m(mVar);
            final p0<m.a> p0VarU = mVar.u();
            f0.o(p0VarU, "delegate!!.startWork()");
            p0VarU.V(new Runnable() { // from class: q3.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.A(this.f138580b, p0VarU);
                }
            }, c());
        } catch (Throwable th2) {
            nVarE.b(q3.c.f138582a, "Delegated worker " + strA + " threw exception in startWork.", th2);
            synchronized (this.lock) {
                if (!this.areConstraintsUnmet) {
                    a<m.a> future5 = this.future;
                    f0.o(future5, "future");
                    q3.c.d(future5);
                } else {
                    nVarE.a(q3.c.f138582a, "Constraints were unmet, Retrying.");
                    a<m.a> future6 = this.future;
                    f0.o(future6, "future");
                    q3.c.e(future6);
                }
            }
        }
    }

    @Override // o3.c
    public void a(@d List<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
        n.e().a(q3.c.f138582a, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            b2 b2Var = b2.f124493a;
        }
    }

    @Override // o3.c
    public void e(@d List<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
    }

    @Override // androidx.work.m
    public void q() {
        super.q();
        m mVar = this.delegate;
        if (mVar == null || mVar.o()) {
            return;
        }
        mVar.v();
    }

    @Override // androidx.work.m
    @d
    public p0<m.a> u() {
        c().execute(new Runnable() { // from class: q3.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.B(this.f138579b);
            }
        });
        a<m.a> future = this.future;
        f0.o(future, "future");
        return future;
    }

    @j1
    @e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: y, reason: from getter */
    public final m getDelegate() {
        return this.delegate;
    }
}
