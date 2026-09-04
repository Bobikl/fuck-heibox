package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FakePureImplementationsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f126053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f126054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f126055c;

    static {
        g gVar = new g();
        f126053a = gVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f126054b = linkedHashMap;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f127227a;
        gVar.c(iVar.l(), gVar.a("java.util.ArrayList", "java.util.LinkedList"));
        gVar.c(iVar.n(), gVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        gVar.c(iVar.m(), gVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("java.util.function.Function"));
        f0.o(bVarM, "topLevel(FqName(\"java.util.function.Function\"))");
        gVar.c(bVarM, gVar.a("java.util.function.UnaryOperator"));
        kotlin.reflect.jvm.internal.impl.name.b bVarM2 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("java.util.function.BiFunction"));
        f0.o(bVarM2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        gVar.c(bVarM2, gVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(c1.a(((kotlin.reflect.jvm.internal.impl.name.b) entry.getKey()).b(), ((kotlin.reflect.jvm.internal.impl.name.b) entry.getValue()).b()));
        }
        f126055c = s0.B0(arrayList);
    }

    private g() {
    }

    private final List<kotlin.reflect.jvm.internal.impl.name.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(str)));
        }
        return arrayList;
    }

    private final void c(kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.name.b> list) {
        Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> map = f126054b;
        for (Object obj : list) {
            map.put((kotlin.reflect.jvm.internal.impl.name.b) obj, bVar);
        }
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.c b(@dl.d kotlin.reflect.jvm.internal.impl.name.c classFqName) {
        f0.p(classFqName, "classFqName");
        return f126055c.get(classFqName);
    }
}
