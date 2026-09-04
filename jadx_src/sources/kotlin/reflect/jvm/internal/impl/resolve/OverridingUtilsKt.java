package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: overridingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <H> Collection<H> a(@dl.d Collection<? extends H> collection, @dl.d yh.l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> descriptorByHandle) {
        f0.p(collection, "<this>");
        f0.p(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.e eVarA = kotlin.reflect.jvm.internal.impl.utils.e.f128306d.a();
        while (!linkedList.isEmpty()) {
            Object objW2 = CollectionsKt___CollectionsKt.w2(linkedList);
            final kotlin.reflect.jvm.internal.impl.utils.e eVarA2 = kotlin.reflect.jvm.internal.impl.utils.e.f128306d.a();
            Collection<a.a.a.a.d.p.d.c.C0001c.a> collectionP = OverridingUtil.p(objW2, linkedList, descriptorByHandle, new yh.l<H, b2>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                    invoke2(obj);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(H it) {
                    kotlin.reflect.jvm.internal.impl.utils.e<H> eVar = eVarA2;
                    f0.o(it, "it");
                    eVar.add(it);
                }
            });
            f0.o(collectionP, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if (collectionP.size() == 1 && eVarA2.isEmpty()) {
                Object objA5 = CollectionsKt___CollectionsKt.a5(collectionP);
                f0.o(objA5, "overridableGroup.single()");
                eVarA.add(objA5);
            } else {
                a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) OverridingUtil.L(collectionP, descriptorByHandle);
                f0.o(aVar, "selectMostSpecificMember…roup, descriptorByHandle)");
                kotlin.reflect.jvm.internal.impl.descriptors.a aVarInvoke = descriptorByHandle.invoke(aVar);
                for (a.a.a.a.d.p.d.c.C0001c.a it : collectionP) {
                    f0.o(it, "it");
                    if (!OverridingUtil.B(aVarInvoke, descriptorByHandle.invoke(it))) {
                        eVarA2.add(it);
                    }
                }
                if (!eVarA2.isEmpty()) {
                    eVarA.addAll(eVarA2);
                }
                eVarA.add(aVar);
            }
        }
        return eVarA;
    }
}
