package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* JADX INFO: compiled from: AbstractTimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", ak.av, ak.aF, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lkotlin/b2;", "g", RXScreenCaptureService.KEY_HEIGHT, "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lkotlinx/coroutines/b;", "Lkotlinx/coroutines/b;", "b", "()Lkotlinx/coroutines/b;", "f", "(Lkotlinx/coroutines/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private static b f128741a;

    @sh.f
    private static final long a() {
        b bVarB = b();
        return bVarB != null ? bVarB.a() : System.currentTimeMillis();
    }

    @dl.e
    public static final b b() {
        return f128741a;
    }

    @sh.f
    private static final long c() {
        b bVarB = b();
        return bVarB != null ? bVarB.b() : System.nanoTime();
    }

    @sh.f
    private static final void d(Object obj, long j10) {
        kotlin.b2 b2Var;
        b bVarB = b();
        if (bVarB != null) {
            bVarB.c(obj, j10);
            b2Var = kotlin.b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            LockSupport.parkNanos(obj, j10);
        }
    }

    @sh.f
    private static final void e() {
        b bVarB = b();
        if (bVarB != null) {
            bVarB.d();
        }
    }

    public static final void f(@dl.e b bVar) {
        f128741a = bVar;
    }

    @sh.f
    private static final void g() {
        b bVarB = b();
        if (bVarB != null) {
            bVarB.e();
        }
    }

    @sh.f
    private static final void h() {
        b bVarB = b();
        if (bVarB != null) {
            bVarB.f();
        }
    }

    @sh.f
    private static final void i(Thread thread) {
        kotlin.b2 b2Var;
        b bVarB = b();
        if (bVarB != null) {
            bVarB.g(thread);
            b2Var = kotlin.b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            LockSupport.unpark(thread);
        }
    }

    @sh.f
    private static final void j() {
        b bVarB = b();
        if (bVarB != null) {
            bVarB.h();
        }
    }

    @sh.f
    private static final Runnable k(Runnable runnable) {
        Runnable runnableI;
        b bVarB = b();
        return (bVarB == null || (runnableI = bVarB.i(runnable)) == null) ? runnable : runnableI;
    }
}
