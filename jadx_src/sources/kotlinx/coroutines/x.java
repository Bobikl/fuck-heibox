package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@z1
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/t2;", "parentJob", "Lkotlin/b2;", "q", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface x extends d2 {

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@dl.d x xVar, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) d2.a.d(xVar, r10, pVar);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E c(@dl.d x xVar, @dl.d CoroutineContext.b<E> bVar) {
            return (E) d2.a.e(xVar, bVar);
        }

        @dl.d
        public static CoroutineContext d(@dl.d x xVar, @dl.d CoroutineContext.b<?> bVar) {
            return d2.a.g(xVar, bVar);
        }

        @dl.d
        public static CoroutineContext e(@dl.d x xVar, @dl.d CoroutineContext coroutineContext) {
            return d2.a.h(xVar, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static d2 f(@dl.d x xVar, @dl.d d2 d2Var) {
            return d2.a.i(xVar, d2Var);
        }
    }

    @z1
    void q(@dl.d t2 t2Var);
}
