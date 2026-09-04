package kotlin.coroutines;

import kotlin.jvm.internal.f0;
import kotlin.q;
import kotlin.u0;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @dl.e
    @q
    public static final <E extends CoroutineContext.a> E a(@dl.d CoroutineContext.a aVar, @dl.d CoroutineContext.b<E> key) {
        f0.p(aVar, "<this>");
        f0.p(key, "key");
        if (!(key instanceof b)) {
            if (aVar.getKey() == key) {
                return aVar;
            }
            return null;
        }
        b bVar = (b) key;
        if (!bVar.a(aVar.getKey())) {
            return null;
        }
        E e10 = (E) bVar.b(aVar);
        if (e10 instanceof CoroutineContext.a) {
            return e10;
        }
        return null;
    }

    @u0(version = "1.3")
    @dl.d
    @q
    public static final CoroutineContext b(@dl.d CoroutineContext.a aVar, @dl.d CoroutineContext.b<?> key) {
        f0.p(aVar, "<this>");
        f0.p(key, "key");
        if (!(key instanceof b)) {
            return aVar.getKey() == key ? EmptyCoroutineContext.f124694b : aVar;
        }
        b bVar = (b) key;
        return (!bVar.a(aVar.getKey()) || bVar.b(aVar) == null) ? aVar : EmptyCoroutineContext.f124694b;
    }
}
