package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f1 f128158c;

    public o(@dl.d f1 substitution) {
        kotlin.jvm.internal.f0.p(substitution, "substitution");
        this.f128158c = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean a() {
        return this.f128158c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean b() {
        return this.f128158c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations) {
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        return this.f128158c.d(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.e
    public c1 e(@dl.d d0 key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return this.f128158c.e(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean f() {
        return this.f128158c.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.d
    public d0 g(@dl.d d0 topLevelType, @dl.d Variance position) {
        kotlin.jvm.internal.f0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.f0.p(position, "position");
        return this.f128158c.g(topLevelType, position);
    }
}
