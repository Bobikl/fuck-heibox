package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: PropertyDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface o0 extends CallableMemberDescriptor, e1 {
    @dl.d
    List<n0> A();

    @dl.e
    v H();

    @dl.e
    v T();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    o0 a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    o0 d(@dl.d TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    Collection<? extends o0> f();

    @dl.e
    p0 getGetter();

    @dl.e
    q0 getSetter();
}
