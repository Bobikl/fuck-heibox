package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: loaded from: classes5.dex */
public class b implements kotlin.reflect.jvm.internal.impl.types.checker.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f127507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f127508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f127509c;

    public b(boolean z10, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        this.f127507a = z10;
        this.f127508b = aVar;
        this.f127509c = aVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
    public boolean a(z0 z0Var, z0 z0Var2) {
        return DescriptorEquivalenceForOverrides.d(this.f127507a, this.f127508b, this.f127509c, z0Var, z0Var2);
    }
}
