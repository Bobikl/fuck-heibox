package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final WeakReference<ClassLoader> f128323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ClassLoader f128325c;

    public t(@dl.d ClassLoader classLoader) {
        f0.p(classLoader, "classLoader");
        this.f128323a = new WeakReference<>(classLoader);
        this.f128324b = System.identityHashCode(classLoader);
        this.f128325c = classLoader;
    }

    public final void a(@dl.e ClassLoader classLoader) {
        this.f128325c = classLoader;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof t) && this.f128323a.get() == ((t) obj).f128323a.get();
    }

    public int hashCode() {
        return this.f128324b;
    }

    @dl.d
    public String toString() {
        String string;
        ClassLoader classLoader = this.f128323a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
