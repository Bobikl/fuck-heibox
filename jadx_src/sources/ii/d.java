package ii;

import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.text.u;
import kotlin.text.y;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.load.java.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ClassLoader f119376a;

    public d(@dl.d ClassLoader classLoader) {
        f0.p(classLoader, "classLoader");
        this.f119376a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.j
    @dl.e
    public Set<String> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
        f0.p(packageFqName, "packageFqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.j
    @dl.e
    public mi.g b(@dl.d kotlin.reflect.jvm.internal.impl.load.java.j.a request) {
        f0.p(request, "request");
        kotlin.reflect.jvm.internal.impl.name.b bVarA = request.a();
        kotlin.reflect.jvm.internal.impl.name.c cVarH = bVarA.h();
        f0.o(cVarH, "classId.packageFqName");
        String strB = bVarA.i().b();
        f0.o(strB, "classId.relativeClassName.asString()");
        String strK2 = u.k2(strB, lg.a.f131414g, y.f128594c, false, 4, null);
        if (!cVarH.d()) {
            strK2 = cVarH.b() + lg.a.f131414g + strK2;
        }
        Class<?> clsA = e.a(this.f119376a, strK2);
        if (clsA != null) {
            return new ReflectJavaClass(clsA);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.j
    @dl.e
    public mi.u c(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, boolean z10) {
        f0.p(fqName, "fqName");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u(fqName);
    }
}
