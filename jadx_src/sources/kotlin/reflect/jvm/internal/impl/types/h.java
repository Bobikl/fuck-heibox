package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends u0<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f128133a;

    public h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations) {
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        this.f128133a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u0
    @dl.d
    public kotlin.reflect.d<? extends h> b() {
        return kotlin.jvm.internal.n0.d(h.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u0
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h a(@dl.e h hVar) {
        return hVar == null ? this : new h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.a(this.f128133a, hVar.f128133a));
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e e() {
        return this.f128133a;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.f0.g(((h) obj).f128133a, this.f128133a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u0
    @dl.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h c(@dl.e h hVar) {
        if (kotlin.jvm.internal.f0.g(hVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f128133a.hashCode();
    }
}
