package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.text.y;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final h f127876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f127877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f127878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f127879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f127880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f127881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e f127882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final TypeDeserializer f127883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final MemberDeserializer f127884i;

    public j(@dl.d h components, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar, @dl.e TypeDeserializer typeDeserializer, @dl.d List<ProtoBuf.TypeParameter> typeParameters) {
        String strA;
        f0.p(components, "components");
        f0.p(nameResolver, "nameResolver");
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(typeTable, "typeTable");
        f0.p(versionRequirementTable, "versionRequirementTable");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(typeParameters, "typeParameters");
        this.f127876a = components;
        this.f127877b = nameResolver;
        this.f127878c = containingDeclaration;
        this.f127879d = typeTable;
        this.f127880e = versionRequirementTable;
        this.f127881f = metadataVersion;
        this.f127882g = eVar;
        this.f127883h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + y.f128593b, (eVar == null || (strA = eVar.a()) == null) ? "[container not found]" : strA);
        this.f127884i = new MemberDeserializer(this);
    }

    public static /* synthetic */ j b(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, List list, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = jVar.f127877b;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = jVar.f127879d;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = jVar.f127880e;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            aVar = jVar.f127881f;
        }
        return jVar.a(kVar, list, cVar2, gVar2, hVar2, aVar);
    }

    @dl.d
    public final j a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k descriptor, @dl.d List<ProtoBuf.TypeParameter> typeParameterProtos, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion) {
        f0.p(descriptor, "descriptor");
        f0.p(typeParameterProtos, "typeParameterProtos");
        f0.p(nameResolver, "nameResolver");
        f0.p(typeTable, "typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h versionRequirementTable = hVar;
        f0.p(versionRequirementTable, "versionRequirementTable");
        f0.p(metadataVersion, "metadataVersion");
        h hVar2 = this.f127876a;
        if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b(metadataVersion)) {
            versionRequirementTable = this.f127880e;
        }
        return new j(hVar2, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f127882g, this.f127883h, typeParameterProtos);
    }

    @dl.d
    public final h c() {
        return this.f127876a;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e d() {
        return this.f127882g;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.k e() {
        return this.f127878c;
    }

    @dl.d
    public final MemberDeserializer f() {
        return this.f127884i;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g() {
        return this.f127877b;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.storage.m h() {
        return this.f127876a.u();
    }

    @dl.d
    public final TypeDeserializer i() {
        return this.f127883h;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j() {
        return this.f127879d;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h k() {
        return this.f127880e;
    }
}
