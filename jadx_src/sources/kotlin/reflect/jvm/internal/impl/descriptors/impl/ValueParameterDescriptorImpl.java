package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ValueParameterDescriptorImpl extends h0 implements b1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f125659n = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f125660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f125661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f125662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f125663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.types.d0 f125664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final b1 f125665m;

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.d
        private final kotlin.z f125666o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @dl.e b1 b1Var, int i10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 outType, boolean z10, boolean z11, boolean z12, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d t0 source, @dl.d yh.a<? extends List<? extends d1>> destructuringVariables) {
            super(containingDeclaration, b1Var, i10, annotations, name, outType, z10, z11, z12, d0Var, source);
            kotlin.jvm.internal.f0.p(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.f0.p(annotations, "annotations");
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(outType, "outType");
            kotlin.jvm.internal.f0.p(source, "source");
            kotlin.jvm.internal.f0.p(destructuringVariables, "destructuringVariables");
            this.f125666o = kotlin.b0.c(destructuringVariables);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.b1
        @dl.d
        public b1 N(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, @dl.d kotlin.reflect.jvm.internal.impl.name.f newName, int i10) {
            kotlin.jvm.internal.f0.p(newOwner, "newOwner");
            kotlin.jvm.internal.f0.p(newName, "newName");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = getAnnotations();
            kotlin.jvm.internal.f0.o(annotations, "annotations");
            kotlin.reflect.jvm.internal.impl.types.d0 type = getType();
            kotlin.jvm.internal.f0.o(type, "type");
            boolean zW = W();
            boolean zC0 = C0();
            boolean zA0 = A0();
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarF0 = F0();
            t0 NO_SOURCE = t0.f125942a;
            kotlin.jvm.internal.f0.o(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i10, annotations, newName, type, zW, zC0, zA0, d0VarF0, NO_SOURCE, new yh.a<List<? extends d1>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends d1> invoke() {
                    return this.f125667b.P0();
                }
            });
        }

        @dl.d
        public final List<d1> P0() {
            return (List) this.f125666o.getValue();
        }
    }

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final ValueParameterDescriptorImpl a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @dl.e b1 b1Var, int i10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 outType, boolean z10, boolean z11, boolean z12, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d t0 source, @dl.e yh.a<? extends List<? extends d1>> aVar) {
            kotlin.jvm.internal.f0.p(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.f0.p(annotations, "annotations");
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(outType, "outType");
            kotlin.jvm.internal.f0.p(source, "source");
            return aVar == null ? new ValueParameterDescriptorImpl(containingDeclaration, b1Var, i10, annotations, name, outType, z10, z11, z12, d0Var, source) : new WithDestructuringDeclaration(containingDeclaration, b1Var, i10, annotations, name, outType, z10, z11, z12, d0Var, source, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a containingDeclaration, @dl.e b1 b1Var, int i10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 outType, boolean z10, boolean z11, boolean z12, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d t0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.f0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(outType, "outType");
        kotlin.jvm.internal.f0.p(source, "source");
        this.f125660h = i10;
        this.f125661i = z10;
        this.f125662j = z11;
        this.f125663k = z12;
        this.f125664l = d0Var;
        this.f125665m = b1Var == null ? this : b1Var;
    }

    @dl.d
    @xh.m
    public static final ValueParameterDescriptorImpl M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.e b1 b1Var, int i10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var, boolean z10, boolean z11, boolean z12, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var2, @dl.d t0 t0Var, @dl.e yh.a<? extends List<? extends d1>> aVar2) {
        return f125659n.a(aVar, b1Var, i10, eVar, fVar, d0Var, z10, z11, z12, d0Var2, t0Var, aVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    public boolean A0() {
        return this.f125663k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    public boolean C0() {
        return this.f125662j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    @dl.e
    public kotlin.reflect.jvm.internal.impl.types.d0 F0() {
        return this.f125664l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean H0() {
        return b1.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    @dl.d
    public b1 N(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a newOwner, @dl.d kotlin.reflect.jvm.internal.impl.name.f newName, int i10) {
        kotlin.jvm.internal.f0.p(newOwner, "newOwner");
        kotlin.jvm.internal.f0.p(newName, "newName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = getAnnotations();
        kotlin.jvm.internal.f0.o(annotations, "annotations");
        kotlin.reflect.jvm.internal.impl.types.d0 type = getType();
        kotlin.jvm.internal.f0.o(type, "type");
        boolean zW = W();
        boolean zC0 = C0();
        boolean zA0 = A0();
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarF0 = F0();
        t0 NO_SOURCE = t0.f125942a;
        kotlin.jvm.internal.f0.o(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i10, annotations, newName, type, zW, zC0, zA0, d0VarF0, NO_SOURCE);
    }

    @dl.e
    public Void N0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.d1, kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public b1 d(@dl.d TypeSubstitutor substitutor) {
        kotlin.jvm.internal.f0.p(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    public boolean W() {
        if (this.f125661i) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVarC = c();
            kotlin.jvm.internal.f0.n(aVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((CallableMemberDescriptor) aVarC).b().isReal()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    public b1 a() {
        b1 b1Var = this.f125665m;
        return b1Var == this ? this : b1Var.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.a c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = super.c();
        kotlin.jvm.internal.f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) kVarC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> visitor, D d10) {
        kotlin.jvm.internal.f0.p(visitor, "visitor");
        return visitor.e(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<b1> f() {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> collectionF = c().f();
        kotlin.jvm.internal.f0.o(collectionF, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionF, 10));
        Iterator<T> it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b1
    public int getIndex() {
        return this.f125660h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s LOCAL = kotlin.reflect.jvm.internal.impl.descriptors.r.f125869f;
        kotlin.jvm.internal.f0.o(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g z0() {
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.g) N0();
    }
}
