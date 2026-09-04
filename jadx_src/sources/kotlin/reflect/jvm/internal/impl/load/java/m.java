package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s f126286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s f126287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s f126288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<g1, kotlin.reflect.jvm.internal.impl.descriptors.s> f126289d;

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static final class a extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        a(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return m.d(oVar, kVar);
        }
    }

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        b(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return m.e(hVar, oVar, kVar);
        }
    }

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static final class c extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        c(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return m.e(hVar, oVar, kVar);
        }
    }

    static {
        a aVar = new a(hi.a.C1084a.f119181c);
        f126286a = aVar;
        b bVar = new b(hi.a.c.f119183c);
        f126287b = bVar;
        c cVar = new c(hi.a.b.f119182c);
        f126288c = cVar;
        f126289d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = p7.a.f135567e;
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
        if (kVar == null) {
            a(2);
        }
        if (kVar2 == null) {
            a(3);
        }
        g0 g0Var = (g0) kotlin.reflect.jvm.internal.impl.resolve.d.r(kVar, g0.class, false);
        g0 g0Var2 = (g0) kotlin.reflect.jvm.internal.impl.resolve.d.r(kVar2, g0.class, false);
        return (g0Var2 == null || g0Var == null || !g0Var.e().equals(g0Var2.e())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (oVar == null) {
            a(0);
        }
        if (kVar == null) {
            a(1);
        }
        if (d(kotlin.reflect.jvm.internal.impl.resolve.d.M(oVar), kVar)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.r.f125866c.e(hVar, oVar, kVar, false);
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        f126289d.put(sVar.b(), sVar);
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.s g(@dl.d g1 g1Var) {
        if (g1Var == null) {
            a(4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = f126289d.get(g1Var);
        if (sVar != null) {
            return sVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.s sVarJ = kotlin.reflect.jvm.internal.impl.descriptors.r.j(g1Var);
        if (sVarJ == null) {
            a(5);
        }
        return sVarJ;
    }
}
