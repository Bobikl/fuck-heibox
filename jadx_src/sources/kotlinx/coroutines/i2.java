package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/d2;", "parent", "Lkotlinx/coroutines/b0;", ak.av, "b", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/h1;", "handle", RXScreenCaptureService.KEY_WIDTH, "Lkotlin/b2;", "l", "(Lkotlinx/coroutines/d2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", "p", "", "q", "Lkotlin/coroutines/CoroutineContext;", "f", "e", "y", "x", "", "message", "g", "", RXScreenCaptureService.KEY_HEIGHT, "o", "m", "n", "job", "B", "(Ljava/lang/Throwable;Lkotlinx/coroutines/d2;)Ljava/lang/Throwable;", androidx.exifinterface.media.a.W4, "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", ak.aD, "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/d2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class i2 {
    public static final boolean A(@dl.d CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        return d2Var != null && d2Var.isActive();
    }

    private static final Throwable B(Throwable th2, d2 d2Var) {
        return th2 == null ? new JobCancellationException("Job was cancelled", null, d2Var) : th2;
    }

    @dl.d
    public static final b0 a(@dl.e d2 d2Var) {
        return new f2(d2Var);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @xh.h(name = "Job")
    public static final /* synthetic */ d2 b(d2 d2Var) {
        return g2.a(d2Var);
    }

    public static /* synthetic */ b0 c(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return g2.a(d2Var);
    }

    public static /* synthetic */ d2 d(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return b(d2Var);
    }

    public static final void f(@dl.d CoroutineContext coroutineContext, @dl.e CancellationException cancellationException) {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.e(cancellationException);
        }
    }

    public static final void g(@dl.d d2 d2Var, @dl.d String str, @dl.e Throwable th2) {
        d2Var.e(q1.a(str, th2));
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        CoroutineContext.a aVarF = coroutineContext.f(d2.INSTANCE);
        JobSupport jobSupport = aVarF instanceof JobSupport ? (JobSupport) aVarF : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.w0(B(th2, jobSupport));
        return true;
    }

    public static /* synthetic */ void i(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.f(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void j(d2 d2Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        g2.g(d2Var, str, th2);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return h(coroutineContext, th2);
    }

    @dl.e
    public static final Object l(@dl.d d2 d2Var, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        d2.a.b(d2Var, null, 1, null);
        Object objG0 = d2Var.g0(cVar);
        return objG0 == kotlin.coroutines.intrinsics.b.h() ? objG0 : kotlin.b2.f124493a;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var == null) {
            return;
        }
        for (d2 d2Var2 : d2Var.S()) {
            JobSupport jobSupport = d2Var2 instanceof JobSupport ? (JobSupport) d2Var2 : null;
            if (jobSupport != null) {
                jobSupport.w0(B(th2, d2Var));
            }
        }
    }

    public static final void o(@dl.d CoroutineContext coroutineContext, @dl.e CancellationException cancellationException) {
        kotlin.sequences.m<d2> mVarS;
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var == null || (mVarS = d2Var.S()) == null) {
            return;
        }
        Iterator<d2> it = mVarS.iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(d2 d2Var, Throwable th2) throws Throwable {
        for (d2 d2Var2 : d2Var.S()) {
            JobSupport jobSupport = d2Var2 instanceof JobSupport ? (JobSupport) d2Var2 : null;
            if (jobSupport != null) {
                jobSupport.w0(B(th2, d2Var));
            }
        }
    }

    public static final void r(@dl.d d2 d2Var, @dl.e CancellationException cancellationException) {
        Iterator<d2> it = d2Var.S().iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    public static /* synthetic */ void s(CoroutineContext coroutineContext, Throwable th2, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        n(coroutineContext, th2);
    }

    public static /* synthetic */ void t(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.o(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void u(d2 d2Var, Throwable th2, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        q(d2Var, th2);
    }

    public static /* synthetic */ void v(d2 d2Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.r(d2Var, cancellationException);
    }

    @dl.d
    public static final h1 w(@dl.d d2 d2Var, @dl.d h1 h1Var) {
        return d2Var.K(new j1(h1Var));
    }

    public static final void x(@dl.d CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var != null) {
            g2.A(d2Var);
        }
    }

    public static final void y(@dl.d d2 d2Var) {
        if (!d2Var.isActive()) {
            throw d2Var.Z();
        }
    }

    @dl.d
    public static final d2 z(@dl.d CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}
