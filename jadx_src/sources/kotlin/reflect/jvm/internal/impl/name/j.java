package kotlin.reflect.jvm.internal.impl.name;

import fi.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final c f127279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final c f127280b;

    static {
        c cVar = new c("java.lang");
        f127279a = cVar;
        c cVarC = cVar.c(f.f("annotation"));
        f0.o(cVarC, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f127280b = cVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        return new b(i.f127227a.b(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        return new b(i.f127227a.f(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        return new b(i.f127227a.c(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        return new b(i.f127227a.d(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        return new b(i.f127227a.e(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(t.Y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = c1.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f127227a;
        return new b(iVar.a().h(), f.f(fVar.d() + iVar.a().j().d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        return new b(i.f127227a.g(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        return new b(i.f127227a.h(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        return new b(i.f127227a.f(), f.f('U' + bVar.j().d()));
    }
}
