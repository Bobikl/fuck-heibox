package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeAliasConstructorDescriptorImpl extends o implements f0 {

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m F;

    @dl.d
    private final x0 G;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.i H;

    @dl.d
    private kotlin.reflect.jvm.internal.impl.descriptors.c I;
    static final /* synthetic */ kotlin.reflect.n<Object>[] K = {n0.u(new PropertyReference1Impl(n0.d(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    @dl.d
    public static final a J = new a(null);

    /* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TypeSubstitutor c(x0 x0Var) {
            if (x0Var.o() == null) {
                return null;
            }
            return TypeSubstitutor.f(x0Var.f0());
        }

        @dl.e
        public final f0 b(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d x0 typeAliasDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.c constructor) {
            kotlin.reflect.jvm.internal.impl.descriptors.c cVarD;
            List<r0> listE;
            kotlin.jvm.internal.f0.p(storageManager, "storageManager");
            kotlin.jvm.internal.f0.p(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.f0.p(constructor, "constructor");
            TypeSubstitutor typeSubstitutorC = c(typeAliasDescriptor);
            if (typeSubstitutorC == null || (cVarD = constructor.d(typeSubstitutorC)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = constructor.getAnnotations();
            CallableMemberDescriptor.Kind kindB = constructor.b();
            kotlin.jvm.internal.f0.o(kindB, "constructor.kind");
            t0 t0VarJ = typeAliasDescriptor.j();
            kotlin.jvm.internal.f0.o(t0VarJ, "typeAliasDescriptor.source");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, cVarD, null, annotations, kindB, t0VarJ, null);
            List<b1> listP0 = o.P0(typeAliasConstructorDescriptorImpl, constructor.i(), typeSubstitutorC);
            if (listP0 == null) {
                return null;
            }
            j0 j0VarC = kotlin.reflect.jvm.internal.impl.types.b0.c(cVarD.getReturnType().R0());
            j0 j0VarV = typeAliasDescriptor.v();
            kotlin.jvm.internal.f0.o(j0VarV, "typeAliasDescriptor.defaultType");
            j0 j0VarJ = kotlin.reflect.jvm.internal.impl.types.n0.j(j0VarC, j0VarV);
            r0 r0VarI0 = constructor.i0();
            r0 r0VarI = r0VarI0 != null ? kotlin.reflect.jvm.internal.impl.resolve.c.i(typeAliasConstructorDescriptorImpl, typeSubstitutorC.n(r0VarI0.getType(), Variance.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = typeAliasDescriptor.o();
            if (dVarO != null) {
                List<r0> listG0 = constructor.G0();
                kotlin.jvm.internal.f0.o(listG0, "constructor.contextReceiverParameters");
                listE = new ArrayList<>(kotlin.collections.t.Y(listG0, 10));
                for (r0 r0Var : listG0) {
                    kotlin.reflect.jvm.internal.impl.types.d0 d0VarN = typeSubstitutorC.n(r0Var.getType(), Variance.INVARIANT);
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = r0Var.getValue();
                    kotlin.jvm.internal.f0.n(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listE.add(kotlin.reflect.jvm.internal.impl.resolve.c.c(dVarO, d0VarN, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) value).a(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()));
                }
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
            typeAliasConstructorDescriptorImpl.S0(r0VarI, null, listE, typeAliasDescriptor.w(), listP0, j0VarJ, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }
    }

    private TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.m mVar, x0 x0Var, final kotlin.reflect.jvm.internal.impl.descriptors.c cVar, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, CallableMemberDescriptor.Kind kind, t0 t0Var) {
        super(x0Var, f0Var, eVar, kotlin.reflect.jvm.internal.impl.name.h.f127218j, kind, t0Var);
        this.F = mVar;
        this.G = x0Var;
        W0(p1().o0());
        this.H = mVar.b(new yh.a<TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TypeAliasConstructorDescriptorImpl invoke() {
                kotlin.reflect.jvm.internal.impl.storage.m mVarJ0 = this.f125657b.j0();
                x0 x0VarP1 = this.f125657b.p1();
                kotlin.reflect.jvm.internal.impl.descriptors.c cVar2 = cVar;
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.f125657b;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = cVar2.getAnnotations();
                CallableMemberDescriptor.Kind kindB = cVar.b();
                kotlin.jvm.internal.f0.o(kindB, "underlyingConstructorDescriptor.kind");
                t0 t0VarJ = this.f125657b.p1().j();
                kotlin.jvm.internal.f0.o(t0VarJ, "typeAliasDescriptor.source");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(mVarJ0, x0VarP1, cVar2, typeAliasConstructorDescriptorImpl, annotations, kindB, t0VarJ, null);
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.f125657b;
                kotlin.reflect.jvm.internal.impl.descriptors.c cVar3 = cVar;
                TypeSubstitutor typeSubstitutorC = TypeAliasConstructorDescriptorImpl.J.c(typeAliasConstructorDescriptorImpl3.p1());
                if (typeSubstitutorC == null) {
                    return null;
                }
                r0 r0VarI0 = cVar3.i0();
                r0 r0VarD = r0VarI0 != null ? r0VarI0.d(typeSubstitutorC) : null;
                List<r0> listG0 = cVar3.G0();
                kotlin.jvm.internal.f0.o(listG0, "underlyingConstructorDes…contextReceiverParameters");
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listG0, 10));
                Iterator<T> it = listG0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r0) it.next()).d(typeSubstitutorC));
                }
                typeAliasConstructorDescriptorImpl2.S0(null, r0VarD, arrayList, typeAliasConstructorDescriptorImpl3.p1().w(), typeAliasConstructorDescriptorImpl3.i(), typeAliasConstructorDescriptorImpl3.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl3.p1().getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.I = cVar;
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.m mVar, x0 x0Var, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, CallableMemberDescriptor.Kind kind, t0 t0Var, kotlin.jvm.internal.u uVar) {
        this(mVar, x0Var, cVar, f0Var, eVar, kind, t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.c J() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d O() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = J().O();
        kotlin.jvm.internal.f0.o(dVarO, "underlyingConstructorDescriptor.constructedClass");
        return dVarO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.d0 returnType = super.getReturnType();
        kotlin.jvm.internal.f0.m(returnType);
        return returnType;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.storage.m j0() {
        return this.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public f0 k0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k newOwner, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s visibility, @dl.d CallableMemberDescriptor.Kind kind, boolean z10) {
        kotlin.jvm.internal.f0.p(newOwner, "newOwner");
        kotlin.jvm.internal.f0.p(modality, "modality");
        kotlin.jvm.internal.f0.p(visibility, "visibility");
        kotlin.jvm.internal.f0.p(kind, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild = q().r(newOwner).q(modality).p(visibility).s(kind).j(z10).build();
        kotlin.jvm.internal.f0.n(wVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (f0) wVarBuild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptorImpl M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k newOwner, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d t0 source) {
        kotlin.jvm.internal.f0.p(newOwner, "newOwner");
        kotlin.jvm.internal.f0.p(kind, "kind");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(source, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.F, p1(), J(), this, annotations, kind2, source);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public x0 c() {
        return p1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public f0 a() {
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarA = super.a();
        kotlin.jvm.internal.f0.n(wVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (f0) wVarA;
    }

    @dl.d
    public x0 p1() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.e
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public f0 d(@dl.d TypeSubstitutor substitutor) {
        kotlin.jvm.internal.f0.p(substitutor, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarD = super.d(substitutor);
        kotlin.jvm.internal.f0.n(wVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) wVarD;
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(typeAliasConstructorDescriptorImpl.getReturnType());
        kotlin.jvm.internal.f0.o(typeSubstitutorF, "create(substitutedTypeAliasConstructor.returnType)");
        kotlin.reflect.jvm.internal.impl.descriptors.c cVarD = J().a().d(typeSubstitutorF);
        if (cVarD == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.I = cVarD;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    public boolean s0() {
        return J().s0();
    }
}
