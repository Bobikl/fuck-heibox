package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CallableDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface a extends l, o, v0<a> {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallableDescriptor.java */
    public interface InterfaceC1142a<V> {
    }

    @dl.d
    List<r0> G0();

    @dl.e
    <V> V S(InterfaceC1142a<V> interfaceC1142a);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    a a();

    @dl.d
    Collection<? extends a> f();

    @dl.e
    kotlin.reflect.jvm.internal.impl.types.d0 getReturnType();

    @dl.d
    List<y0> getTypeParameters();

    @dl.d
    List<b1> i();

    @dl.e
    r0 i0();

    @dl.e
    r0 l0();

    boolean t0();
}
