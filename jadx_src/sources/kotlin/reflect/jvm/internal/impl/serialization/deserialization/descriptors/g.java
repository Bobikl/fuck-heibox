package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import yh.l;

/* JADX INFO: compiled from: DeserializedPackageMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g extends DeserializedMemberScope {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final g0 f127833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final String f127834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f127835i;

    public g(@dl.d g0 packageDescriptor, @dl.d ProtoBuf.Package proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.e e eVar, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.h components, @dl.d String debugName, @dl.d yh.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> classNames) {
        f0.p(packageDescriptor, "packageDescriptor");
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(components, "components");
        f0.p(debugName, "debugName");
        f0.p(classNames, "classNames");
        ProtoBuf.TypeTable typeTableW = proto.W();
        f0.o(typeTableW, "proto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(typeTableW);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.a aVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f127067b;
        ProtoBuf.VersionRequirementTable versionRequirementTableX = proto.X();
        f0.o(versionRequirementTableX, "proto.versionRequirementTable");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVarA = components.a(packageDescriptor, nameResolver, gVar, aVar.a(versionRequirementTableX), metadataVersion, eVar);
        List<ProtoBuf.Function> listP = proto.P();
        f0.o(listP, "proto.functionList");
        List<ProtoBuf.Property> listS = proto.S();
        f0.o(listS, "proto.propertyList");
        List<ProtoBuf.TypeAlias> listV = proto.V();
        f0.o(listV, "proto.typeAliasList");
        super(jVarA, listP, listS, listV, classNames);
        this.f127833g = packageDescriptor;
        this.f127834h = debugName;
        this.f127835i = packageDescriptor.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        ji.a.b(q().c().o(), location, this.f127833g, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        return super.h(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected void j(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> result, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(result, "result");
        f0.p(nameFilter, "nameFilter");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @dl.d
    protected kotlin.reflect.jvm.internal.impl.name.b n(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return new kotlin.reflect.jvm.internal.impl.name.b(this.f127835i, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @dl.e
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> t() {
        return d1.k();
    }

    @dl.d
    public String toString() {
        return this.f127834h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @dl.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @dl.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected boolean x(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        boolean z10;
        f0.p(name, "name");
        if (super.x(name)) {
            return true;
        }
        Iterable<gi.b> iterableK = q().c().k();
        if ((iterableK instanceof Collection) && ((Collection) iterableK).isEmpty()) {
            z10 = false;
        } else {
            Iterator<gi.b> it = iterableK.iterator();
            while (it.hasNext()) {
                if (it.next().a(this.f127835i, name)) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collectionK = k(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<gi.b> iterableK = q().c().k();
        ArrayList arrayList = new ArrayList();
        Iterator<gi.b> it = iterableK.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, it.next().c(this.f127835i));
        }
        return CollectionsKt___CollectionsKt.y4(collectionK, arrayList);
    }
}
