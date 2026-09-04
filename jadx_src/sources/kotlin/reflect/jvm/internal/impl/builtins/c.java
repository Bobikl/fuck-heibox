package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: CompanionObjectMappingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final boolean a(@dl.d b bVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(bVar, "<this>");
        f0.p(classDescriptor, "classDescriptor");
        if (kotlin.reflect.jvm.internal.impl.resolve.d.x(classDescriptor)) {
            Set<kotlin.reflect.jvm.internal.impl.name.b> setB = bVar.b();
            kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(classDescriptor);
            if (CollectionsKt___CollectionsKt.R1(setB, bVarK != null ? bVarK.g() : null)) {
                return true;
            }
        }
        return false;
    }
}
