package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final LazyJavaPackageFragment f126553b;

    public p(@dl.d LazyJavaPackageFragment packageFragment) {
        f0.p(packageFragment, "packageFragment");
        this.f126553b = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
    @dl.d
    public u0 b() {
        u0 NO_SOURCE_FILE = u0.f125943a;
        f0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @dl.d
    public String toString() {
        return this.f126553b + ": " + this.f126553b.N0().keySet();
    }
}
