package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@z0
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/j0;", androidx.exifinterface.media.a.R4, "Lkotlinx/coroutines/g3;", "t", "Lkotlin/coroutines/CoroutineContext$a;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "n", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@t1
public interface j0<S> extends g3<S> {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@dl.d j0<S> j0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) g3.a.a(j0Var, r10, pVar);
        }

        @dl.e
        public static <S, E extends CoroutineContext.a> E b(@dl.d j0<S> j0Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) g3.a.b(j0Var, bVar);
        }

        @dl.d
        public static <S> CoroutineContext c(@dl.d j0<S> j0Var, @dl.d CoroutineContext.b<?> bVar) {
            return g3.a.c(j0Var, bVar);
        }

        @dl.d
        public static <S> CoroutineContext d(@dl.d j0<S> j0Var, @dl.d CoroutineContext coroutineContext) {
            return g3.a.d(j0Var, coroutineContext);
        }
    }

    @dl.d
    CoroutineContext n(@dl.d CoroutineContext.a overwritingElement);

    @dl.d
    j0<S> t();
}
