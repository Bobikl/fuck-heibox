package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractTypeAliasDescriptor extends j implements x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.s f125629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends y0> f125630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final a f125631h;

    /* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class a implements z0 {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public x0 d() {
            return AbstractTypeAliasDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<y0> getParameters() {
            return AbstractTypeAliasDescriptor.this.N0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.d0> l() {
            Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionL = d().E0().O0().l();
            kotlin.jvm.internal.f0.o(collectionL, "declarationDescriptor.un…pe.constructor.supertypes");
            return collectionL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public kotlin.reflect.jvm.internal.impl.builtins.g t() {
            return DescriptorUtilsKt.j(d());
        }

        @dl.d
        public String toString() {
            return "[typealias " + d().getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d t0 sourceElement, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        kotlin.jvm.internal.f0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(sourceElement, "sourceElement");
        kotlin.jvm.internal.f0.p(visibilityImpl, "visibilityImpl");
        this.f125629f = visibilityImpl;
        this.f125631h = new a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return false;
    }

    @dl.d
    protected final j0 K0() {
        MemberScope memberScopeM;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = o();
        if (dVarO == null || (memberScopeM = dVarO.M()) == null) {
            memberScopeM = MemberScope.b.f127587b;
        }
        j0 j0VarU = i1.u(this, memberScopeM, new yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$computeDefaultType$1
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarF = fVar.f(this.f125633b);
                if (fVarF != null) {
                    return fVarF.v();
                }
                return null;
            }
        });
        kotlin.jvm.internal.f0.o(j0VarU, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return j0VarU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public x0 a() {
        kotlin.reflect.jvm.internal.impl.descriptors.n nVarA = super.a();
        kotlin.jvm.internal.f0.n(nVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (x0) nVarA;
    }

    @dl.d
    public final Collection<f0> M0() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = o();
        if (dVarO == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = dVarO.h();
        kotlin.jvm.internal.f0.o(collectionH, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.c it : collectionH) {
            TypeAliasConstructorDescriptorImpl.a aVar = TypeAliasConstructorDescriptorImpl.J;
            kotlin.reflect.jvm.internal.impl.storage.m mVarJ0 = j0();
            kotlin.jvm.internal.f0.o(it, "it");
            f0 f0VarB = aVar.b(mVarJ0, this, it);
            if (f0VarB != null) {
                arrayList.add(f0VarB);
            }
        }
        return arrayList;
    }

    @dl.d
    protected abstract List<y0> N0();

    public final void O0(@dl.d List<? extends y0> declaredTypeParameters) {
        kotlin.jvm.internal.f0.p(declaredTypeParameters, "declaredTypeParameters");
        this.f125630g = declaredTypeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> visitor, D d10) {
        kotlin.jvm.internal.f0.p(visitor, "visitor");
        return visitor.i(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        return this.f125629f;
    }

    @dl.d
    protected abstract kotlin.reflect.jvm.internal.impl.storage.m j0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        return Modality.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return i1.c(E0(), new yh.l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x002d  */
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1 type) {
                boolean z10;
                kotlin.jvm.internal.f0.o(type, "type");
                if (!kotlin.reflect.jvm.internal.impl.types.e0.a(type)) {
                    AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.f125634b;
                    kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = type.O0().d();
                    z10 = (fVarD instanceof y0) && !kotlin.jvm.internal.f0.g(((y0) fVarD).c(), abstractTypeAliasDescriptor);
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public z0 r() {
        return this.f125631h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    @dl.d
    public String toString() {
        return "typealias " + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        List list = this.f125630g;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.f0.S("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return false;
    }
}
