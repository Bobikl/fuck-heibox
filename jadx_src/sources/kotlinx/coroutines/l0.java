package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/l0;", "Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "C", "A1", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface l0 extends CoroutineContext.a {

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f130261b;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@dl.d l0 l0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) CoroutineContext.a.C1128a.a(l0Var, r10, pVar);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d l0 l0Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.a.C1128a.b(l0Var, bVar);
        }

        @dl.d
        public static CoroutineContext c(@dl.d l0 l0Var, @dl.d CoroutineContext.b<?> bVar) {
            return CoroutineContext.a.C1128a.c(l0Var, bVar);
        }

        @dl.d
        public static CoroutineContext d(@dl.d l0 l0Var, @dl.d CoroutineContext coroutineContext) {
            return CoroutineContext.a.C1128a.d(l0Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.l0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/l0$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements CoroutineContext.b<l0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f130261b = new Companion();

        private Companion() {
        }
    }

    void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2);
}
