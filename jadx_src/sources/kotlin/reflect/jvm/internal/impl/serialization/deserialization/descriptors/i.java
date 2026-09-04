package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.o;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends d0 implements c {

    @dl.d
    private final ProtoBuf.Function F;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c G;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g H;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h I;

    @dl.e
    private final e J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration, @dl.e s0 s0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d CallableMemberDescriptor.Kind kind, @dl.d ProtoBuf.Function proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.e e eVar, @dl.e t0 t0Var) {
        super(containingDeclaration, s0Var, annotations, name, kind, t0Var == null ? t0.f125942a : t0Var);
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(annotations, "annotations");
        f0.p(name, "name");
        f0.p(kind, "kind");
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        f0.p(versionRequirementTable, "versionRequirementTable");
        this.F = proto;
        this.G = nameResolver;
        this.H = typeTable;
        this.I = versionRequirementTable;
        this.J = eVar;
    }

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, kotlin.reflect.jvm.internal.impl.name.f fVar, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, e eVar2, t0 t0Var, int i10, u uVar) {
        this(kVar, s0Var, eVar, fVar, kind, function, cVar, gVar, hVar, eVar2, (i10 & 1024) != 0 ? null : t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g E() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    protected o M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k newOwner, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d t0 source) {
        kotlin.reflect.jvm.internal.impl.name.f fVar2;
        f0.p(newOwner, "newOwner");
        f0.p(kind, "kind");
        f0.p(annotations, "annotations");
        f0.p(source, "source");
        s0 s0Var = (s0) wVar;
        if (fVar == null) {
            kotlin.reflect.jvm.internal.impl.name.f name = getName();
            f0.o(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        i iVar = new i(newOwner, s0Var, annotations, fVar2, kind, P(), g0(), E(), r1(), h0(), source);
        iVar.Z0(R0());
        return iVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g0() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.e
    public e h0() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Function P() {
        return this.F;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1() {
        return this.I;
    }
}
