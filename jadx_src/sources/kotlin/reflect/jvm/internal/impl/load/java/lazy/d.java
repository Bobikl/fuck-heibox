package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.z;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final a f126109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final g f126110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z<r> f126111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f126112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final JavaTypeResolver f126113e;

    public d(@dl.d a components, @dl.d g typeParameterResolver, @dl.d z<r> delegateForDefaultTypeQualifiers) {
        f0.p(components, "components");
        f0.p(typeParameterResolver, "typeParameterResolver");
        f0.p(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f126109a = components;
        this.f126110b = typeParameterResolver;
        this.f126111c = delegateForDefaultTypeQualifiers;
        this.f126112d = delegateForDefaultTypeQualifiers;
        this.f126113e = new JavaTypeResolver(this, typeParameterResolver);
    }

    @dl.d
    public final a a() {
        return this.f126109a;
    }

    @dl.e
    public final r b() {
        return (r) this.f126112d.getValue();
    }

    @dl.d
    public final z<r> c() {
        return this.f126111c;
    }

    @dl.d
    public final d0 d() {
        return this.f126109a.m();
    }

    @dl.d
    public final m e() {
        return this.f126109a.u();
    }

    @dl.d
    public final g f() {
        return this.f126110b;
    }

    @dl.d
    public final JavaTypeResolver g() {
        return this.f126113e;
    }
}
