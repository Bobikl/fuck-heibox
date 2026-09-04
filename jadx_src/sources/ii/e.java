package ii;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    @dl.e
    public static final Class<?> a(@dl.d ClassLoader classLoader, @dl.d String fqName) {
        f0.p(classLoader, "<this>");
        f0.p(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
