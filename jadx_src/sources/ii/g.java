package ii;

import java.io.InputStream;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.load.kotlin.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ClassLoader f119380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c f119381b;

    public g(@dl.d ClassLoader classLoader) {
        f0.p(classLoader, "classLoader");
        this.f119380a = classLoader;
        this.f119381b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c();
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.m.a d(String str) {
        f fVarA;
        Class<?> clsA = e.a(this.f119380a, str);
        if (clsA == null || (fVarA = f.f119377c.a(clsA)) == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.m.a.b(fVarA, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.m
    @dl.e
    public kotlin.reflect.jvm.internal.impl.load.kotlin.m.a a(@dl.d mi.g javaClass) {
        String strB;
        f0.p(javaClass, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.c cVarE = javaClass.e();
        if (cVarE == null || (strB = cVarE.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.p
    @dl.e
    public InputStream b(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
        f0.p(packageFqName, "packageFqName");
        if (packageFqName.i(kotlin.reflect.jvm.internal.impl.builtins.h.f125411t)) {
            return this.f119381b.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f127722n.n(packageFqName));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.m
    @dl.e
    public kotlin.reflect.jvm.internal.impl.load.kotlin.m.a c(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(classId, "classId");
        return d(h.b(classId));
    }
}
