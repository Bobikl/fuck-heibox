package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: compiled from: FieldOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Result b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(superDescriptor, "superDescriptor");
        f0.p(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof o0) || !(superDescriptor instanceof o0)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        o0 o0Var = (o0) subDescriptor;
        o0 o0Var2 = (o0) superDescriptor;
        if (!f0.g(o0Var.getName(), o0Var2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a(o0Var) && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a(o0Var2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a(o0Var) || kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a(o0Var2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
