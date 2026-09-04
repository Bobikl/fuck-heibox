package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: FunctionDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface w extends CallableMemberDescriptor {

    /* JADX INFO: compiled from: FunctionDescriptor.java */
    public interface a<D extends w> {
        @dl.d
        a<D> a(@dl.e r0 r0Var);

        @dl.d
        a<D> b(@dl.e r0 r0Var);

        @dl.e
        D build();

        @dl.d
        a<D> c(@dl.d kotlin.reflect.jvm.internal.impl.types.f1 f1Var);

        @dl.d
        <V> a<D> d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a, V v10);

        @dl.d
        a<D> e();

        @dl.d
        a<D> f(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

        @dl.d
        a<D> g();

        @dl.d
        a<D> h(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var);

        @dl.d
        a<D> i(@dl.e CallableMemberDescriptor callableMemberDescriptor);

        @dl.d
        a<D> j(boolean z10);

        @dl.d
        a<D> k(@dl.d List<y0> list);

        @dl.d
        a<D> l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar);

        @dl.d
        a<D> m();

        @dl.d
        a<D> n(@dl.d List<b1> list);

        @dl.d
        a<D> o();

        @dl.d
        a<D> p(@dl.d s sVar);

        @dl.d
        a<D> q(@dl.d Modality modality);

        @dl.d
        a<D> r(@dl.d k kVar);

        @dl.d
        a<D> s(@dl.d CallableMemberDescriptor.Kind kind);

        @dl.d
        a<D> t();
    }

    boolean C();

    @dl.e
    w D0();

    boolean J0();

    boolean K();

    boolean U();

    boolean Y();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    w a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    k c();

    @dl.e
    w d(@dl.d TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    Collection<? extends w> f();

    boolean g();

    boolean isSuspend();

    @dl.d
    a<? extends w> q();
}
