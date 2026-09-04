package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: ClassData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f127847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.Class f127848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f127849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final t0 f127850d;

    public e(@dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d ProtoBuf.Class classProto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.d t0 sourceElement) {
        f0.p(nameResolver, "nameResolver");
        f0.p(classProto, "classProto");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(sourceElement, "sourceElement");
        this.f127847a = nameResolver;
        this.f127848b = classProto;
        this.f127849c = metadataVersion;
        this.f127850d = sourceElement;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c a() {
        return this.f127847a;
    }

    @dl.d
    public final ProtoBuf.Class b() {
        return this.f127848b;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
        return this.f127849c;
    }

    @dl.d
    public final t0 d() {
        return this.f127850d;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f0.g(this.f127847a, eVar.f127847a) && f0.g(this.f127848b, eVar.f127848b) && f0.g(this.f127849c, eVar.f127849c) && f0.g(this.f127850d, eVar.f127850d);
    }

    public int hashCode() {
        return (((((this.f127847a.hashCode() * 31) + this.f127848b.hashCode()) * 31) + this.f127849c.hashCode()) * 31) + this.f127850d.hashCode();
    }

    @dl.d
    public String toString() {
        return "ClassData(nameResolver=" + this.f127847a + ", classProto=" + this.f127848b + ", metadataVersion=" + this.f127849c + ", sourceElement=" + this.f127850d + ')';
    }
}
