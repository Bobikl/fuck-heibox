package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: VariableDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d1 extends a1 {
    boolean G();

    boolean H0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    d1 d(@dl.d TypeSubstitutor typeSubstitutor);

    boolean isConst();

    @dl.e
    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> z0();
}
