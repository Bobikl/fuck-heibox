package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* JADX INFO: compiled from: KotlinJvmBinarySourceElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final o f126554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f126555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f126556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final DeserializedContainerAbiStability f126557e;

    public q(@dl.d o binaryClass, @dl.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.o<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> oVar, boolean z10, @dl.d DeserializedContainerAbiStability abiStability) {
        f0.p(binaryClass, "binaryClass");
        f0.p(abiStability, "abiStability");
        this.f126554b = binaryClass;
        this.f126555c = oVar;
        this.f126556d = z10;
        this.f126557e = abiStability;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e
    @dl.d
    public String a() {
        return "Class '" + this.f126554b.f().b().b() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @dl.d
    public u0 b() {
        u0 NO_SOURCE_FILE = u0.f125943a;
        f0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @dl.d
    public final o d() {
        return this.f126554b;
    }

    @dl.d
    public String toString() {
        return q.class.getSimpleName() + ": " + this.f126554b;
    }
}
