package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.internal.b2;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1549#3:113\n1620#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
public final class b {
    @dl.e
    public static final kotlin.reflect.d<?> a(@dl.d f fVar) {
        f0.p(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f130570b;
        }
        if (fVar instanceof b2) {
            return a(((b2) fVar).l());
        }
        return null;
    }

    @kotlinx.serialization.d
    public static /* synthetic */ void b(f fVar) {
    }

    @dl.e
    @kotlinx.serialization.d
    public static final f c(@dl.d kotlinx.serialization.modules.e eVar, @dl.d f descriptor) {
        kotlinx.serialization.g gVarD;
        f0.p(eVar, "<this>");
        f0.p(descriptor, "descriptor");
        kotlin.reflect.d<?> dVarA = a(descriptor);
        if (dVarA == null || (gVarD = kotlinx.serialization.modules.e.d(eVar, dVarA, null, 2, null)) == null) {
            return null;
        }
        return gVarD.a();
    }

    @dl.d
    @kotlinx.serialization.d
    public static final List<f> d(@dl.d kotlinx.serialization.modules.e eVar, @dl.d f descriptor) {
        f0.p(eVar, "<this>");
        f0.p(descriptor, "descriptor");
        kotlin.reflect.d<?> dVarA = a(descriptor);
        if (dVarA == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        Map<kotlin.reflect.d<?>, kotlinx.serialization.g<?>> map = ((kotlinx.serialization.modules.d) eVar).f130805b.get(dVarA);
        Collection<kotlinx.serialization.g<?>> collectionValues = map != null ? map.values() : null;
        if (collectionValues == null) {
            collectionValues = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(t.Y(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlinx.serialization.g) it.next()).a());
        }
        return arrayList;
    }

    @dl.d
    public static final f e(@dl.d f fVar, @dl.d kotlin.reflect.d<?> context) {
        f0.p(fVar, "<this>");
        f0.p(context, "context");
        return new c(fVar, context);
    }
}
