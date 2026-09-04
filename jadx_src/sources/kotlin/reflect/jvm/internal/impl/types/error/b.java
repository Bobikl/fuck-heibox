package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.o;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.f1;

/* JADX INFO: compiled from: ErrorFunctionDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends d0 {

    /* JADX INFO: compiled from: ErrorFunctionDescriptor.kt */
    public static final class a implements w.a<s0> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> a(@dl.e r0 r0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> b(@dl.e r0 r0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> c(@dl.d f1 substitution) {
            f0.p(substitution, "substitution");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public <V> w.a<s0> d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> userDataKey, V v10) {
            f0.p(userDataKey, "userDataKey");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> e() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> f(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> g() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> h(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 type) {
            f0.p(type, "type");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> i(@dl.e CallableMemberDescriptor callableMemberDescriptor) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> j(boolean z10) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> k(@dl.d List<? extends y0> parameters) {
            f0.p(parameters, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e additionalAnnotations) {
            f0.p(additionalAnnotations, "additionalAnnotations");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> m() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> n(@dl.d List<? extends b1> parameters) {
            f0.p(parameters, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> o() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> p(@dl.d s visibility) {
            f0.p(visibility, "visibility");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> q(@dl.d Modality modality) {
            f0.p(modality, "modality");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> r(@dl.d k owner) {
            f0.p(owner, "owner");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> s(@dl.d CallableMemberDescriptor.Kind kind) {
            f0.p(kind, "kind");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        public w.a<s0> t() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w.a
        @dl.d
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public s0 build() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d containingDeclaration) {
        super(containingDeclaration, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), kotlin.reflect.jvm.internal.impl.name.f.i(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, t0.f125942a);
        f0.p(containingDeclaration, "containingDeclaration");
        S0(null, null, CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), h.d(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, r.f125868e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    protected o M0(@dl.d k newOwner, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d t0 source) {
        f0.p(newOwner, "newOwner");
        f0.p(kind, "kind");
        f0.p(annotations, "annotations");
        f0.p(source, "source");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> key) {
        f0.p(key, "key");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        f0.p(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public s0 k0(@dl.d k newOwner, @dl.d Modality modality, @dl.d s visibility, @dl.d CallableMemberDescriptor.Kind kind, boolean z10) {
        f0.p(newOwner, "newOwner");
        f0.p(modality, "modality");
        f0.p(visibility, "visibility");
        f0.p(kind, "kind");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.s0
    @dl.d
    public w.a<s0> q() {
        return new a();
    }
}
