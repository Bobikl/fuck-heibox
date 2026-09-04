package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/g3;", androidx.exifinterface.media.a.R4, "Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "o0", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "Lkotlin/b2;", ak.aD, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface g3<S> extends CoroutineContext.a {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@dl.d g3<S> g3Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) CoroutineContext.a.C1128a.a(g3Var, r10, pVar);
        }

        @dl.e
        public static <S, E extends CoroutineContext.a> E b(@dl.d g3<S> g3Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.a.C1128a.b(g3Var, bVar);
        }

        @dl.d
        public static <S> CoroutineContext c(@dl.d g3<S> g3Var, @dl.d CoroutineContext.b<?> bVar) {
            return CoroutineContext.a.C1128a.c(g3Var, bVar);
        }

        @dl.d
        public static <S> CoroutineContext d(@dl.d g3<S> g3Var, @dl.d CoroutineContext coroutineContext) {
            return CoroutineContext.a.C1128a.d(g3Var, coroutineContext);
        }
    }

    S o0(@dl.d CoroutineContext context);

    void z(@dl.d CoroutineContext context, S oldState);
}
