package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: methodSignatureBuildingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    @dl.d
    public static final String a(@dl.d SignatureBuildingComponents signatureBuildingComponents, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.d String jvmDescriptor) {
        f0.p(signatureBuildingComponents, "<this>");
        f0.p(classDescriptor, "classDescriptor");
        f0.p(jvmDescriptor, "jvmDescriptor");
        return signatureBuildingComponents.k(t.f(classDescriptor), jvmDescriptor);
    }
}
