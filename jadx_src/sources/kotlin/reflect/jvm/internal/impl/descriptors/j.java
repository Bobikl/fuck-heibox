package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ConstructorDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface j extends w {
    @dl.d
    d O();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    g c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.e
    j d(@dl.d TypeSubstitutor typeSubstitutor);

    @dl.d
    kotlin.reflect.jvm.internal.impl.types.d0 getReturnType();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    List<y0> getTypeParameters();

    boolean s0();
}
