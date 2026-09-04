package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/l1;", "Lkotlin/b2;", "J0", "", "now", "Lkotlinx/coroutines/m1$c;", "delayedTask", "I0", "Ljava/lang/Thread;", "H0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class n1 extends l1 {
    @dl.d
    /* JADX INFO: renamed from: H0 */
    protected abstract Thread getThread();

    protected void I0(long j10, @dl.d m1.c cVar) {
        u0.f130491i.a1(j10, cVar);
    }

    protected final void J0() {
        kotlin.b2 b2Var;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
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
}
