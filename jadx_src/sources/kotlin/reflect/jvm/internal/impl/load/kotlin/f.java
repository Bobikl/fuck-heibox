package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m f126493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final DeserializedDescriptorResolver f126494b;

    public f(@dl.d m kotlinClassFinder, @dl.d DeserializedDescriptorResolver deserializedDescriptorResolver) {
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        f0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f126493a = kotlinClassFinder;
        this.f126494b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @dl.e
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.e a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        o oVarA = n.a(this.f126493a, classId);
        if (oVarA == null) {
            return null;
        }
        f0.g(oVarA.f(), classId);
        return this.f126494b.i(oVarA);
    }
}
