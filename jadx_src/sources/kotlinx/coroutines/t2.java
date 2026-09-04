package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@z1
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/d2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface t2 extends d2 {

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@dl.d t2 t2Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) d2.a.d(t2Var, r10, pVar);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E c(@dl.d t2 t2Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) d2.a.e(t2Var, bVar);
        }

        @dl.d
        public static CoroutineContext d(@dl.d t2 t2Var, @dl.d CoroutineContext.b<?> bVar) {
            return d2.a.g(t2Var, bVar);
        }

        @dl.d
        public static CoroutineContext e(@dl.d t2 t2Var, @dl.d CoroutineContext coroutineContext) {
            return d2.a.h(t2Var, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static d2 f(@dl.d t2 t2Var, @dl.d d2 d2Var) {
            return d2.a.i(t2Var, d2Var);
        }
    }

    @dl.d
    @z1
    CancellationException e0();
}
