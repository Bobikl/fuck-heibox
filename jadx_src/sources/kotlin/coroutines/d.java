package kotlin.coroutines;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import yh.p;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public interface d extends CoroutineContext.a {

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @dl.d
    public static final b f124698w1 = b.f124699b;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <R> R a(@dl.d d dVar, R r10, @dl.d p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) CoroutineContext.a.C1128a.a(dVar, r10, operation);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d d dVar, @dl.d CoroutineContext.b<E> key) {
            f0.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (d.f124698w1 != key) {
                    return null;
                }
                f0.n(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(dVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(dVar);
            if (e10 instanceof CoroutineContext.a) {
                return e10;
            }
            return null;
        }

        @dl.d
        public static CoroutineContext c(@dl.d d dVar, @dl.d CoroutineContext.b<?> key) {
            f0.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return d.f124698w1 == key ? EmptyCoroutineContext.f124694b : dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : EmptyCoroutineContext.f124694b;
        }

        @dl.d
        public static CoroutineContext d(@dl.d d dVar, @dl.d CoroutineContext context) {
            f0.p(context, "context");
            return CoroutineContext.a.C1128a.d(dVar, context);
        }

        public static void e(@dl.d d dVar, @dl.d c<?> continuation) {
            f0.p(continuation, "continuation");
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class b implements CoroutineContext.b<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f124699b = new b();

        private b() {
        }
    }

    @dl.d
    <T> c<T> Q(@dl.d c<? super T> cVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    CoroutineContext d(@dl.d CoroutineContext.b<?> bVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar);

    void k(@dl.d c<?> cVar);
}
