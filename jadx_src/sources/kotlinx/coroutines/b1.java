package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/b1;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/scheduling/j;", "Lkotlinx/coroutines/SchedulerTask;", "", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/b2;", ak.aF, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "g", "", "d", "I", "resumeMode", "Lkotlin/coroutines/c;", "()Lkotlin/coroutines/c;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class b1<T> extends kotlinx.coroutines.scheduling.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public int resumeMode;

    public b1(int i10) {
        this.resumeMode = i10;
    }

    public void c(@dl.e Object takenState, @dl.d Throwable cause) {
    }

    @dl.d
    public abstract kotlin.coroutines.c<T> d();

    @dl.e
    public Throwable e(@dl.e Object state) {
        d0 d0Var = state instanceof d0 ? (d0) state : null;
        if (d0Var != null) {
            return d0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(@dl.e Object state) {
        return state;
    }

    public final void g(@dl.e Throwable th2, @dl.e Throwable th3) throws IllegalAccessException, InvocationTargetException {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            kotlin.o.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.f0.m(th2);
        n0.b(d().getCom.umeng.analytics.pro.d.R java.lang.String(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @dl.e
    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objB;
        Object objB2;
        kotlinx.coroutines.scheduling.k kVar = this.taskContext;
        try {
            kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) d();
            kotlin.coroutines.c<T> cVar = lVar.continuation;
            Object obj = lVar.countOrElement;
            CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
            Object objC = ThreadContextKt.c(context, obj);
            o3<?> o3VarG = objC != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar, context, objC) : null;
            try {
                CoroutineContext context2 = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
                Object objH = h();
                Throwable thE = e(objH);
                d2 d2Var = (thE == null && c1.c(this.resumeMode)) ? (d2) context2.f(d2.INSTANCE) : null;
                if (d2Var != null && !d2Var.isActive()) {
                    CancellationException cancellationExceptionZ = d2Var.Z();
                    c(objH, cancellationExceptionZ);
                    Result.a aVar = Result.f124476c;
                    cVar.resumeWith(Result.b(kotlin.t0.a(cancellationExceptionZ)));
                } else if (thE != null) {
                    Result.a aVar2 = Result.f124476c;
                    cVar.resumeWith(Result.b(kotlin.t0.a(thE)));
                } else {
                    Result.a aVar3 = Result.f124476c;
                    cVar.resumeWith(Result.b(f(objH)));
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
                if (o3VarG == null || o3VarG.L1()) {
                    ThreadContextKt.a(context, objC);
                }
                try {
                    Result.a aVar4 = Result.f124476c;
                    kVar.c();
                    objB2 = Result.b(b2Var);
                } catch (Throwable th2) {
                    Result.a aVar5 = Result.f124476c;
                    objB2 = Result.b(kotlin.t0.a(th2));
                }
                g(null, Result.e(objB2));
            } catch (Throwable th3) {
                if (o3VarG == null || o3VarG.L1()) {
                    ThreadContextKt.a(context, objC);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                Result.a aVar6 = Result.f124476c;
                kVar.c();
                objB = Result.b(kotlin.b2.f124493a);
            } catch (Throwable th5) {
                Result.a aVar7 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th5));
            }
            g(th4, Result.e(objB));
        }
    }
}
