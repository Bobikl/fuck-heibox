package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final g f125860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<kotlin.reflect.jvm.internal.impl.types.c1> f125861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final m0 f125862c;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@dl.d g classifierDescriptor, @dl.d List<? extends kotlin.reflect.jvm.internal.impl.types.c1> arguments, @dl.e m0 m0Var) {
        kotlin.jvm.internal.f0.p(classifierDescriptor, "classifierDescriptor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        this.f125860a = classifierDescriptor;
        this.f125861b = arguments;
        this.f125862c = m0Var;
    }

    @dl.d
    public final List<kotlin.reflect.jvm.internal.impl.types.c1> a() {
        return this.f125861b;
    }

    @dl.d
    public final g b() {
        return this.f125860a;
    }

    @dl.e
    public final m0 c() {
        return this.f125862c;
    }
}
