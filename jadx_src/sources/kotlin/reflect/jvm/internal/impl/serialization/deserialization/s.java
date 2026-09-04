package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.r0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: ProtoBasedClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f127894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f127895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.jvm.internal.impl.name.b, t0> f127896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.b, ProtoBuf.Class> f127897d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@dl.d ProtoBuf.PackageFragment proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.b, ? extends t0> classSource) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(classSource, "classSource");
        this.f127894a = nameResolver;
        this.f127895b = metadataVersion;
        this.f127896c = classSource;
        List<ProtoBuf.Class> listK = proto.K();
        f0.o(listK, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kotlin.collections.t.Y(listK, 10)), 16));
        for (Object obj : listK) {
            linkedHashMap.put(r.a(this.f127894a, ((ProtoBuf.Class) obj).F0()), obj);
        }
        this.f127897d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @dl.e
    public e a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        ProtoBuf.Class r10 = this.f127897d.get(classId);
        if (r10 == null) {
            return null;
        }
        return new e(this.f127894a, r10, this.f127895b, this.f127896c.invoke(classId));
    }

    @dl.d
    public final Collection<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return this.f127897d.keySet();
    }
}
