package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends AbstractTypeAliasDescriptor implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final m f127836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.TypeAlias f127837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f127838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f127839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f127840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private final e f127841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Collection<? extends f0> f127842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j0 f127843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j0 f127844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<? extends y0> f127845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j0 f127846s;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(@dl.d m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d s visibility, @dl.d ProtoBuf.TypeAlias proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.e e eVar) {
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        kotlin.jvm.internal.f0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(visibility, "visibility");
        kotlin.jvm.internal.f0.p(proto, "proto");
        kotlin.jvm.internal.f0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.f0.p(typeTable, "typeTable");
        kotlin.jvm.internal.f0.p(versionRequirementTable, "versionRequirementTable");
        t0 NO_SOURCE = t0.f125942a;
        kotlin.jvm.internal.f0.o(NO_SOURCE, "NO_SOURCE");
        super(containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f127836i = storageManager;
        this.f127837j = proto;
        this.f127838k = nameResolver;
        this.f127839l = typeTable;
        this.f127840m = versionRequirementTable;
        this.f127841n = eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g E() {
        return this.f127839l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @dl.d
    public j0 E0() {
        j0 j0Var = this.f127843p;
        if (j0Var != null) {
            return j0Var;
        }
        kotlin.jvm.internal.f0.S("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @dl.d
    protected List<y0> N0() {
        List list = this.f127845r;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.f0.S("typeConstructorParameters");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias P() {
        return this.f127837j;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h Q0() {
        return this.f127840m;
    }

    public final void R0(@dl.d List<? extends y0> declaredTypeParameters, @dl.d j0 underlyingType, @dl.d j0 expandedType) {
        kotlin.jvm.internal.f0.p(declaredTypeParameters, "declaredTypeParameters");
        kotlin.jvm.internal.f0.p(underlyingType, "underlyingType");
        kotlin.jvm.internal.f0.p(expandedType, "expandedType");
        O0(declaredTypeParameters);
        this.f127843p = underlyingType;
        this.f127844q = expandedType;
        this.f127845r = TypeParameterUtilsKt.d(this);
        this.f127846s = K0();
        this.f127842o = M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public x0 d(@dl.d TypeSubstitutor substitutor) {
        kotlin.jvm.internal.f0.p(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        m mVarJ0 = j0();
        kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration = c();
        kotlin.jvm.internal.f0.o(containingDeclaration, "containingDeclaration");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = getAnnotations();
        kotlin.jvm.internal.f0.o(annotations, "annotations");
        kotlin.reflect.jvm.internal.impl.name.f name = getName();
        kotlin.jvm.internal.f0.o(name, "name");
        j jVar = new j(mVarJ0, containingDeclaration, annotations, name, getVisibility(), P(), g0(), E(), Q0(), h0());
        List<y0> listW = w();
        j0 j0VarE0 = E0();
        Variance variance = Variance.INVARIANT;
        d0 d0VarN = substitutor.n(j0VarE0, variance);
        kotlin.jvm.internal.f0.o(d0VarN, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        j0 j0VarA = g1.a(d0VarN);
        d0 d0VarN2 = substitutor.n(f0(), variance);
        kotlin.jvm.internal.f0.o(d0VarN2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        jVar.R0(listW, j0VarA, g1.a(d0VarN2));
        return jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @dl.d
    public j0 f0() {
        j0 j0Var = this.f127844q;
        if (j0Var != null) {
            return j0Var;
        }
        kotlin.jvm.internal.f0.S("expandedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g0() {
        return this.f127838k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.e
    public e h0() {
        return this.f127841n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @dl.d
    protected m j0() {
        return this.f127836i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d o() {
        if (e0.a(f0())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = f0().O0().d();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public j0 v() {
        j0 j0Var = this.f127846s;
        if (j0Var != null) {
            return j0Var;
        }
        kotlin.jvm.internal.f0.S("defaultTypeImpl");
        return null;
    }
}
