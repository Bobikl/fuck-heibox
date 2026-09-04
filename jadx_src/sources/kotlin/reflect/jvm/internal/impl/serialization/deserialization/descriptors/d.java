package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.descriptors.impl.e implements c {

    @dl.d
    private final ProtoBuf.Constructor H;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c I;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g J;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h K;

    @dl.e
    private final e L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d containingDeclaration, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.j jVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, boolean z10, @dl.d CallableMemberDescriptor.Kind kind, @dl.d ProtoBuf.Constructor proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.e e eVar, @dl.e t0 t0Var) {
        super(containingDeclaration, jVar, annotations, z10, kind, t0Var == null ? t0.f125942a : t0Var);
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(annotations, "annotations");
        f0.p(kind, "kind");
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        f0.p(versionRequirementTable, "versionRequirementTable");
        this.H = proto;
        this.I = nameResolver;
        this.J = typeTable;
        this.K = versionRequirementTable;
        this.L = eVar;
    }

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.j jVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, e eVar2, t0 t0Var, int i10, u uVar) {
        this(dVar, jVar, eVar, z10, kind, constructor, cVar, gVar, hVar, eVar2, (i10 & 1024) != 0 ? null : t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g E() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g0() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.e
    public e h0() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @dl.d
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public d M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k newOwner, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d t0 source) {
        f0.p(newOwner, "newOwner");
        f0.p(kind, "kind");
        f0.p(annotations, "annotations");
        f0.p(source, "source");
        d dVar = new d((kotlin.reflect.jvm.internal.impl.descriptors.d) newOwner, (kotlin.reflect.jvm.internal.impl.descriptors.j) wVar, annotations, this.F, kind, P(), g0(), E(), v1(), h0(), source);
        dVar.Z0(R0());
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Constructor P() {
        return this.H;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h v1() {
        return this.K;
    }
}
