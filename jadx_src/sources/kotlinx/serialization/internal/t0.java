package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 implements kotlin.reflect.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.r f130764b;

    public t0(@dl.d kotlin.reflect.r origin) {
        kotlin.jvm.internal.f0.p(origin, "origin");
        this.f130764b = origin;
    }

    @Override // kotlin.reflect.r
    @dl.d
    public List<kotlin.reflect.t> d() {
        return this.f130764b.d();
    }

    public boolean equals(@dl.e Object obj) {
        if (obj == null) {
            return false;
        }
        kotlin.reflect.r rVar = this.f130764b;
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        if (!kotlin.jvm.internal.f0.g(rVar, t0Var != null ? t0Var.f130764b : null)) {
            return false;
        }
        kotlin.reflect.g gVarO = o();
        if (gVarO instanceof kotlin.reflect.d) {
            kotlin.reflect.r rVar2 = obj instanceof kotlin.reflect.r ? (kotlin.reflect.r) obj : null;
            kotlin.reflect.g gVarO2 = rVar2 != null ? rVar2.o() : null;
            if (gVarO2 != null && (gVarO2 instanceof kotlin.reflect.d)) {
                return kotlin.jvm.internal.f0.g(xh.a.e((kotlin.reflect.d) gVarO), xh.a.e((kotlin.reflect.d) gVarO2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f130764b.getAnnotations();
    }

    public int hashCode() {
        return this.f130764b.hashCode();
    }

    @Override // kotlin.reflect.r
    @dl.e
    public kotlin.reflect.g o() {
        return this.f130764b.o();
    }

    @Override // kotlin.reflect.r
    public boolean p() {
        return this.f130764b.p();
    }

    @dl.d
    public String toString() {
        return "KTypeWrapper: " + this.f130764b;
    }
}
