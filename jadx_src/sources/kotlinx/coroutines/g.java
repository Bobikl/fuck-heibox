package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/g;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/a;", "", "state", "Lkotlin/b2;", "q0", "K1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "d", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/l1;", "e", "Lkotlinx/coroutines/l1;", "eventLoop", "", "Z0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/l1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final l1 eventLoop;

    public g(@dl.d CoroutineContext coroutineContext, @dl.d Thread thread, @dl.e l1 l1Var) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T K1() throws Throwable {
        kotlin.b2 b2Var;
        b bVarB = c.b();
        if (bVarB != null) {
            bVarB.d();
        }
        try {
            l1 l1Var = this.eventLoop;
            if (l1Var != null) {
                l1.x0(l1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    l1 l1Var2 = this.eventLoop;
                    long jD0 = l1Var2 != null ? l1Var2.D0() : Long.MAX_VALUE;
                    if (x()) {
                        l1 l1Var3 = this.eventLoop;
                        if (l1Var3 != null) {
                            l1.s0(l1Var3, false, 1, null);
                        }
                        b bVarB2 = c.b();
                        if (bVarB2 != null) {
                            bVarB2.h();
                        }
                        T t10 = (T) k2.o(T0());
                        d0 d0Var = t10 instanceof d0 ? (d0) t10 : null;
                        if (d0Var == null) {
                            return t10;
                        }
                        throw d0Var.cause;
                    }
                    b bVarB3 = c.b();
                    if (bVarB3 != null) {
                        bVarB3.c(this, jD0);
                        b2Var = kotlin.b2.f124493a;
                    } else {
                        b2Var = null;
                    }
                    if (b2Var == null) {
                        LockSupport.parkNanos(this, jD0);
                    }
                } catch (Throwable th2) {
                    l1 l1Var4 = this.eventLoop;
                    if (l1Var4 != null) {
                        l1.s0(l1Var4, false, 1, null);
                    }
                    throw th2;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            u0(interruptedException);
            throw interruptedException;
        } catch (Throwable th3) {
            b bVarB4 = c.b();
            if (bVarB4 != null) {
                bVarB4.h();
            }
            throw th3;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean Z0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void q0(@dl.e Object obj) {
        kotlin.b2 b2Var;
        if (kotlin.jvm.internal.f0.g(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        b bVarB = c.b();
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
}
