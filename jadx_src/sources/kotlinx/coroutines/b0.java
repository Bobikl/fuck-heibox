package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CompletableJob.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/d2;", "", ak.av, "", "exception", "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface b0 extends d2 {

    /* JADX INFO: compiled from: CompletableJob.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@dl.d b0 b0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) d2.a.d(b0Var, r10, pVar);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E c(@dl.d b0 b0Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) d2.a.e(b0Var, bVar);
        }

        @dl.d
        public static CoroutineContext d(@dl.d b0 b0Var, @dl.d CoroutineContext.b<?> bVar) {
            return d2.a.g(b0Var, bVar);
        }

        @dl.d
        public static CoroutineContext e(@dl.d b0 b0Var, @dl.d CoroutineContext coroutineContext) {
            return d2.a.h(b0Var, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static d2 f(@dl.d b0 b0Var, @dl.d d2 d2Var) {
            return d2.a.i(b0Var, d2Var);
        }
    }

    boolean a();

    boolean i(@dl.d Throwable exception);
}
