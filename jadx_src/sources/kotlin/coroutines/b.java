package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext.a;
import kotlin.jvm.internal.f0;
import kotlin.q;
import kotlin.u0;
import yh.l;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@q
public abstract class b<B extends CoroutineContext.a, E extends B> implements CoroutineContext.b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l<CoroutineContext.a, E> f124696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final CoroutineContext.b<?> f124697c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yh.l<? super kotlin.coroutines.CoroutineContext$a, ? extends E extends B>, yh.l<kotlin.coroutines.CoroutineContext$a, E extends B>] */
    public b(@dl.d CoroutineContext.b<B> baseKey, @dl.d l<? super CoroutineContext.a, ? extends E> safeCast) {
        f0.p(baseKey, "baseKey");
        f0.p(safeCast, "safeCast");
        this.f124696b = safeCast;
        this.f124697c = baseKey instanceof b ? (CoroutineContext.b<B>) ((b) baseKey).f124697c : baseKey;
    }

    public final boolean a(@dl.d CoroutineContext.b<?> key) {
        f0.p(key, "key");
        return key == this || this.f124697c == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$a;)TE; */
    @dl.e
    public final CoroutineContext.a b(@dl.d CoroutineContext.a element) {
        f0.p(element, "element");
        return (CoroutineContext.a) this.f124696b.invoke(element);
    }
}
