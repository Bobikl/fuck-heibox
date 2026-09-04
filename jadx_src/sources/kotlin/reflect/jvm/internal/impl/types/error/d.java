package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: ErrorPropertyDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ z f128110b;

    public d() {
        h hVar = h.f128123a;
        z zVarQ0 = z.Q0(hVar.h(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), Modality.OPEN, r.f125868e, true, kotlin.reflect.jvm.internal.impl.name.f.i(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, t0.f125942a, false, false, false, false, false, false);
        zVarQ0.d1(hVar.k(), CollectionsKt__CollectionsKt.E(), null, null, CollectionsKt__CollectionsKt.E());
        this.f128110b = zVarQ0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.d
    public List<n0> A() {
        return this.f128110b.A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return this.f128110b.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean G() {
        return this.f128110b.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<r0> G0() {
        return this.f128110b.G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public v H() {
        return this.f128110b.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean H0() {
        return this.f128110b.H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        return (V) this.f128110b.S(interfaceC1142a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public v T() {
        return this.f128110b.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        f0.p(overriddenDescriptors, "overriddenDescriptors");
        this.f128110b.X(overriddenDescriptors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public o0 a() {
        return this.f128110b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    public CallableMemberDescriptor.Kind b() {
        return this.f128110b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public k c() {
        return this.f128110b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(m<R, D> mVar, D d10) {
        return (R) this.f128110b.c0(mVar, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    public o0 d(@dl.d TypeSubstitutor substitutor) {
        f0.p(substitutor, "substitutor");
        return this.f128110b.d(substitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    public boolean d0() {
        return this.f128110b.d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends o0> f() {
        return this.f128110b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = this.f128110b.getAnnotations();
        f0.o(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public p0 getGetter() {
        return this.f128110b.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f128110b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.e
    public d0 getReturnType() {
        return this.f128110b.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o0
    @dl.e
    public q0 getSetter() {
        return this.f128110b.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @dl.d
    public d0 getType() {
        return this.f128110b.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        return this.f128110b.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public s getVisibility() {
        return this.f128110b.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        return this.f128110b.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 i0() {
        return this.f128110b.i0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean isConst() {
        return this.f128110b.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        return this.f128110b.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    public CallableMemberDescriptor k0(k kVar, Modality modality, s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        return this.f128110b.k0(kVar, modality, sVar, kind, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        return this.f128110b.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 l0() {
        return this.f128110b.l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return this.f128110b.o0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return this.f128110b.t0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return this.f128110b.w0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    @dl.e
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> z0() {
        return this.f128110b.z0();
    }
}
