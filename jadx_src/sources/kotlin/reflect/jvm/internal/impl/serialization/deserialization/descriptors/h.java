package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends z implements c {

    @dl.d
    private final ProtoBuf.Property F;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c G;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g H;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h I;

    @dl.e
    private final e J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration, @dl.e o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.d Modality modality, @dl.d s visibility, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d CallableMemberDescriptor.Kind kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @dl.d ProtoBuf.Property proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.e e eVar) {
        super(containingDeclaration, o0Var, annotations, modality, visibility, z10, name, kind, t0.f125942a, z11, z12, z15, false, z13, z14);
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(annotations, "annotations");
        f0.p(modality, "modality");
        f0.p(visibility, "visibility");
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D.d(P().b0());
        f0.o(boolD, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g E() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @dl.d
    protected z R0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k newOwner, @dl.d Modality newModality, @dl.d s newVisibility, @dl.e o0 o0Var, @dl.d CallableMemberDescriptor.Kind kind, @dl.d kotlin.reflect.jvm.internal.impl.name.f newName, @dl.d t0 source) {
        f0.p(newOwner, "newOwner");
        f0.p(newModality, "newModality");
        f0.p(newVisibility, "newVisibility");
        f0.p(kind, "kind");
        f0.p(newName, "newName");
        f0.p(source, "source");
        return new h(newOwner, o0Var, getAnnotations(), newModality, newVisibility, G(), newName, kind, H0(), isConst(), B(), d0(), w0(), P(), g0(), E(), i1(), h0());
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
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property P() {
        return this.F;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h i1() {
        return this.I;
    }
}
