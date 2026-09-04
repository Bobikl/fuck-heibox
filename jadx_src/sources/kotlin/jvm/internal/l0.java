package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public final class l0 implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Class<?> f124934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f124935c;

    public l0(@dl.d Class<?> jClass, @dl.d String moduleName) {
        f0.p(jClass, "jClass");
        f0.p(moduleName, "moduleName");
        this.f124934b = jClass;
        this.f124935c = moduleName;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof l0) && f0.g(i(), ((l0) obj).i());
    }

    public int hashCode() {
        return i().hashCode();
    }

    @Override // kotlin.jvm.internal.r
    @dl.d
    public Class<?> i() {
        return this.f124934b;
    }

    @dl.d
    public String toString() {
        return i().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.h
    @dl.d
    public Collection<kotlin.reflect.c<?>> v() {
        throw new KotlinReflectionNotSupportedError();
    }
}
