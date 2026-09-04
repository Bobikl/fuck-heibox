package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;

/* JADX INFO: compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends e {

    @dl.d
    private final s0 I;

    @dl.e
    private final s0 J;

    @dl.d
    private final o0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d ownerDescriptor, @dl.d s0 getterMethod, @dl.e s0 s0Var, @dl.d o0 overriddenProperty) {
        super(ownerDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), getterMethod.l(), getterMethod.getVisibility(), s0Var != null, overriddenProperty.getName(), getterMethod.j(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        f0.p(ownerDescriptor, "ownerDescriptor");
        f0.p(getterMethod, "getterMethod");
        f0.p(overriddenProperty, "overriddenProperty");
        this.I = getterMethod;
        this.J = s0Var;
        this.K = overriddenProperty;
    }
}
