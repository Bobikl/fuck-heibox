package kotlin.coroutines;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import yh.p;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public interface CoroutineContext {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public static final class DefaultImpls {
        @dl.d
        public static CoroutineContext a(@dl.d CoroutineContext coroutineContext, @dl.d CoroutineContext context) {
            f0.p(context, "context");
            return context == EmptyCoroutineContext.f124694b ? coroutineContext : (CoroutineContext) context.g(coroutineContext, new p<CoroutineContext, a, CoroutineContext>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineContext invoke(@dl.d CoroutineContext acc, @dl.d CoroutineContext.a element) {
                    CombinedContext combinedContext;
                    f0.p(acc, "acc");
                    f0.p(element, "element");
                    CoroutineContext coroutineContextD = acc.d(element.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f124694b;
                    if (coroutineContextD == emptyCoroutineContext) {
                        return element;
                    }
                    d.b bVar = d.f124698w1;
                    d dVar = (d) coroutineContextD.f(bVar);
                    if (dVar == null) {
                        combinedContext = new CombinedContext(coroutineContextD, element);
                    } else {
                        CoroutineContext coroutineContextD2 = coroutineContextD.d(bVar);
                        if (coroutineContextD2 == emptyCoroutineContext) {
                            return new CombinedContext(element, dVar);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(coroutineContextD2, element), dVar);
                    }
                    return combinedContext;
                }
            });
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface a extends CoroutineContext {

        /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class C1128a {
            public static <R> R a(@dl.d a aVar, R r10, @dl.d p<? super R, ? super a, ? extends R> operation) {
                f0.p(operation, "operation");
                return operation.invoke(r10, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @dl.e
            public static <E extends a> E b(@dl.d a aVar, @dl.d b<E> key) {
                f0.p(key, "key");
                if (!f0.g(aVar.getKey(), key)) {
                    return null;
                }
                f0.n(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            @dl.d
            public static CoroutineContext c(@dl.d a aVar, @dl.d b<?> key) {
                f0.p(key, "key");
                return f0.g(aVar.getKey(), key) ? EmptyCoroutineContext.f124694b : aVar;
            }

            @dl.d
            public static CoroutineContext d(@dl.d a aVar, @dl.d CoroutineContext context) {
                f0.p(context, "context");
                return DefaultImpls.a(aVar, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        @dl.d
        CoroutineContext d(@dl.d b<?> bVar);

        @Override // kotlin.coroutines.CoroutineContext
        @dl.e
        <E extends a> E f(@dl.d b<E> bVar);

        @Override // kotlin.coroutines.CoroutineContext
        <R> R g(R r10, @dl.d p<? super R, ? super a, ? extends R> pVar);

        @dl.d
        b<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    @dl.d
    CoroutineContext I(@dl.d CoroutineContext coroutineContext);

    @dl.d
    CoroutineContext d(@dl.d b<?> bVar);

    @dl.e
    <E extends a> E f(@dl.d b<E> bVar);

    <R> R g(R r10, @dl.d p<? super R, ? super a, ? extends R> pVar);
}
