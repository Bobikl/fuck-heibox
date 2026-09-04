package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Deferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/w0;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/d2;", "p", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "", "Y", "Lkotlinx/coroutines/selects/d;", "f0", "()Lkotlinx/coroutines/selects/d;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface w0<T> extends d2 {

    /* JADX INFO: compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@dl.d w0<? extends T> w0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) d2.a.d(w0Var, r10, pVar);
        }

        @dl.e
        public static <T, E extends CoroutineContext.a> E c(@dl.d w0<? extends T> w0Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) d2.a.e(w0Var, bVar);
        }

        @dl.d
        public static <T> CoroutineContext d(@dl.d w0<? extends T> w0Var, @dl.d CoroutineContext.b<?> bVar) {
            return d2.a.g(w0Var, bVar);
        }

        @dl.d
        public static <T> CoroutineContext e(@dl.d w0<? extends T> w0Var, @dl.d CoroutineContext coroutineContext) {
            return d2.a.h(w0Var, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> d2 f(@dl.d w0<? extends T> w0Var, @dl.d d2 d2Var) {
            return d2.a.i(w0Var, d2Var);
        }
    }

    @dl.e
    @t1
    Throwable Y();

    @dl.d
    kotlinx.coroutines.selects.d<T> f0();

    @t1
    T m();

    @dl.e
    Object p(@dl.d kotlin.coroutines.c<? super T> cVar);
}
