package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010&\u001a\u00020\u001f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/m;", "Lcom/google/common/util/concurrent/p0;", "Landroidx/work/m$a;", ak.aG, "y", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/work/h;", "B", "Landroidx/work/e;", "data", "Lkotlin/b2;", "G", "(Landroidx/work/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "foregroundInfo", "F", "(Landroidx/work/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "d", "q", "Lkotlinx/coroutines/b0;", "f", "Lkotlinx/coroutines/b0;", androidx.exifinterface.media.a.S4, "()Lkotlinx/coroutines/b0;", "job", "Landroidx/work/impl/utils/futures/a;", "g", "Landroidx/work/impl/utils/futures/a;", "D", "()Landroidx/work/impl/utils/futures/a;", "future", "Lkotlinx/coroutines/CoroutineDispatcher;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/CoroutineDispatcher;", ak.aD, "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoroutineWorker extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 job;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.work.impl.utils.futures.a<m.a> future;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineDispatcher coroutineContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@dl.d Context appContext, @dl.d WorkerParameters params) {
        super(appContext, params);
        f0.p(appContext, "appContext");
        f0.p(params, "params");
        this.job = i2.c(null, 1, null);
        androidx.work.impl.utils.futures.a<m.a> aVarU = androidx.work.impl.utils.futures.a.u();
        f0.o(aVarU, "create()");
        this.future = aVarU;
        aVarU.V(new Runnable() { // from class: androidx.work.d
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.x(this.f28773b);
            }
        }, k().c());
        this.coroutineContext = e1.a();
    }

    @kotlin.k(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void A() {
    }

    static /* synthetic */ Object C(CoroutineWorker coroutineWorker, kotlin.coroutines.c<? super h> cVar) {
        throw new IllegalStateException("Not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(CoroutineWorker this$0) {
        f0.p(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            d2.a.b(this$0.job, null, 1, null);
        }
    }

    @dl.e
    public Object B(@dl.d kotlin.coroutines.c<? super h> cVar) {
        return C(this, cVar);
    }

    @dl.d
    public final androidx.work.impl.utils.futures.a<m.a> D() {
        return this.future;
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final b0 getJob() {
        return this.job;
    }

    @dl.e
    public final Object F(@dl.d h hVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        p0<Void> p0VarR = r(hVar);
        f0.o(p0VarR, "setForegroundAsync(foregroundInfo)");
        if (p0VarR.isDone()) {
            try {
                p0VarR.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            p0VarR.V(new ListenableFutureKt.a(qVar, p0VarR), DirectExecutor.INSTANCE);
            qVar.L(new ListenableFutureKt$await$2$2(p0VarR));
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                return objT;
            }
        }
        return b2.f124493a;
    }

    @dl.e
    public final Object G(@dl.d e eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        p0<Void> p0VarS = s(eVar);
        f0.o(p0VarS, "setProgressAsync(data)");
        if (p0VarS.isDone()) {
            try {
                p0VarS.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            p0VarS.V(new ListenableFutureKt.a(qVar, p0VarS), DirectExecutor.INSTANCE);
            qVar.L(new ListenableFutureKt$await$2$2(p0VarS));
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                return objT;
            }
        }
        return b2.f124493a;
    }

    @Override // androidx.work.m
    @dl.d
    public final p0<h> d() {
        b0 b0VarC = i2.c(null, 1, null);
        q0 q0VarA = r0.a(getCoroutineContext().I(b0VarC));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b0VarC, null, 2, null);
        kotlinx.coroutines.k.f(q0VarA, null, null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    @Override // androidx.work.m
    public final void q() {
        super.q();
        this.future.cancel(false);
    }

    @Override // androidx.work.m
    @dl.d
    public final p0<m.a> u() {
        kotlinx.coroutines.k.f(r0.a(getCoroutineContext().I(this.job)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
        return this.future;
    }

    @dl.e
    public abstract Object y(@dl.d kotlin.coroutines.c<? super m.a> cVar);

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }
}
