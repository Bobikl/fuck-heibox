package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: ClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d extends e, g {
    @dl.d
    MemberScope B0(@dl.d kotlin.reflect.jvm.internal.impl.types.f1 f1Var);

    @dl.e
    c D();

    @dl.d
    MemberScope L();

    @dl.d
    MemberScope M();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    d a();

    @dl.d
    ClassKind b();

    @dl.d
    r0 b0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    k c();

    boolean g();

    @dl.d
    s getVisibility();

    @dl.d
    Collection<c> h();

    @dl.d
    Modality l();

    @dl.e
    z0<kotlin.reflect.jvm.internal.impl.types.j0> m0();

    @dl.d
    List<r0> p0();

    boolean r0();

    @dl.d
    Collection<d> s();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    kotlin.reflect.jvm.internal.impl.types.j0 v();

    @dl.d
    List<y0> w();

    boolean x();

    @dl.d
    MemberScope x0();

    boolean y();

    @dl.e
    d y0();

    boolean z();
}
