package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.CoroutineScope;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "m", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "g", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/b2;", "d", "", "message", "", ak.aF, "j", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "k", "(Lkotlinx/coroutines/q0;)Z", "isActive$annotations", "(Lkotlinx/coroutines/q0;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class r0 {
    @dl.d
    public static final q0 a(@dl.d CoroutineContext coroutineContext) {
        if (coroutineContext.f(d2.INSTANCE) == null) {
            coroutineContext = coroutineContext.I(i2.c(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    @dl.d
    public static final q0 b() {
        return new CoroutineScope(f3.c(null, 1, null).I(e1.e()));
    }

    public static final void c(@dl.d q0 q0Var, @dl.d String str, @dl.e Throwable th2) {
        d(q0Var, q1.a(str, th2));
    }

    public static final void d(@dl.d q0 q0Var, @dl.e CancellationException cancellationException) {
        d2 d2Var = (d2) q0Var.getCoroutineContext().f(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.e(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + q0Var).toString());
    }

    public static /* synthetic */ void e(q0 q0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(q0Var, str, th2);
    }

    public static /* synthetic */ void f(q0 q0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(q0Var, cancellationException);
    }

    @dl.e
    public static final <R> Object g(@dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.internal.k0 k0Var = new kotlinx.coroutines.internal.k0(cVar.getContext(), cVar);
        Object objF = bj.b.f(k0Var, k0Var, pVar);
        if (objF == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objF;
    }

    @dl.e
    public static final Object h(@dl.d kotlin.coroutines.c<? super CoroutineContext> cVar) {
        return cVar.getContext();
    }

    private static final Object i(kotlin.coroutines.c<? super CoroutineContext> cVar) {
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    public static final void j(@dl.d q0 q0Var) {
        g2.z(q0Var.getCoroutineContext());
    }

    public static final boolean k(@dl.d q0 q0Var) {
        d2 d2Var = (d2) q0Var.getCoroutineContext().f(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void l(q0 q0Var) {
    }

    @dl.d
    public static final q0 m(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext) {
        return new CoroutineScope(q0Var.getCoroutineContext().I(coroutineContext));
    }
}
