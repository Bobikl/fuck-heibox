package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/y;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/w0;", "value", "", androidx.exifinterface.media.a.W4, "(Ljava/lang/Object;)Z", "", "exception", "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface y<T> extends w0<T> {

    /* JADX INFO: compiled from: CompletableDeferred.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@dl.d y<T> yVar, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) w0.a.b(yVar, r10, pVar);
        }

        @dl.e
        public static <T, E extends CoroutineContext.a> E c(@dl.d y<T> yVar, @dl.d CoroutineContext.b<E> bVar) {
            return (E) w0.a.c(yVar, bVar);
        }

        @dl.d
        public static <T> CoroutineContext d(@dl.d y<T> yVar, @dl.d CoroutineContext.b<?> bVar) {
            return w0.a.d(yVar, bVar);
        }

        @dl.d
        public static <T> CoroutineContext e(@dl.d y<T> yVar, @dl.d CoroutineContext coroutineContext) {
            return w0.a.e(yVar, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> d2 f(@dl.d y<T> yVar, @dl.d d2 d2Var) {
            return w0.a.f(yVar, d2Var);
        }
    }

    boolean A(T value);

    boolean i(@dl.d Throwable exception);
}
