package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CompanionObjectMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f125355a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f125356b;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(t.Y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(h.c((PrimitiveType) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarL = h.a.f125432h.l();
        f0.o(cVarL, "string.toSafe()");
        List listZ4 = CollectionsKt___CollectionsKt.z4(arrayList, cVarL);
        kotlin.reflect.jvm.internal.impl.name.c cVarL2 = h.a.f125436j.l();
        f0.o(cVarL2, "_boolean.toSafe()");
        List listZ5 = CollectionsKt___CollectionsKt.z4(listZ4, cVarL2);
        kotlin.reflect.jvm.internal.impl.name.c cVarL3 = h.a.f125454s.l();
        f0.o(cVarL3, "_enum.toSafe()");
        List listZ6 = CollectionsKt___CollectionsKt.z4(listZ5, cVarL3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = listZ6.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.b.m((kotlin.reflect.jvm.internal.impl.name.c) it2.next()));
        }
        f125356b = linkedHashSet;
    }

    private b() {
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
        return f125356b;
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return f125356b;
    }
}
