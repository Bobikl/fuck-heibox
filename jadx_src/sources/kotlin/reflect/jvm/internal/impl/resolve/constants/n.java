package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: IntegerValueTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f127538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f127539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ArrayList<kotlin.reflect.jvm.internal.impl.types.d0> f127540c;

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f d() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.f) f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    @dl.e
    public Void f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.d0> l() {
        return this.f127540c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        return this.f127539b.t();
    }

    @dl.d
    public String toString() {
        return "IntegerValueType(" + this.f127538a + ')';
    }
}
