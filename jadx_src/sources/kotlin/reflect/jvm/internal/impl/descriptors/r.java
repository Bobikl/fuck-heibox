package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: DescriptorVisibilities.java */
/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s f125864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final s f125865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final s f125866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final s f125867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final s f125868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final s f125869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final s f125870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final s f125871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final s f125872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<s> f125873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<s, Integer> f125874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f125875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f125876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f125877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f125878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.util.k f125879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final Map<g1, s> f125880q;

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @dl.d
        public kotlin.reflect.jvm.internal.impl.types.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class b implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @dl.d
        public kotlin.reflect.jvm.internal.impl.types.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class c implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @dl.d
        public kotlin.reflect.jvm.internal.impl.types.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class d extends p {
        d(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
            if (kVar == null) {
                g(0);
            }
            return kotlin.reflect.jvm.internal.impl.resolve.d.j(kVar) != u0.f125943a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == 0) {
                g(1);
            }
            if (kVar == null) {
                g(2);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.d.J(oVar) && h(kVar)) {
                return r.f(oVar, kVar);
            }
            if (oVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) {
                kotlin.reflect.jvm.internal.impl.descriptors.g gVarC = ((kotlin.reflect.jvm.internal.impl.descriptors.j) oVar).c();
                if (z10 && kotlin.reflect.jvm.internal.impl.resolve.d.G(gVarC) && kotlin.reflect.jvm.internal.impl.resolve.d.J(gVarC) && (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) && kotlin.reflect.jvm.internal.impl.resolve.d.J(kVar.c()) && r.f(oVar, kVar)) {
                    return true;
                }
            }
            while (oVar != 0) {
                oVar = oVar.c();
                if (((oVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && !kotlin.reflect.jvm.internal.impl.resolve.d.x(oVar)) || (oVar instanceof g0)) {
                    break;
                }
            }
            if (oVar == 0) {
                return false;
            }
            while (kVar != null) {
                if (oVar == kVar) {
                    return true;
                }
                if (kVar instanceof g0) {
                    return (oVar instanceof g0) && ((g0) oVar).e().equals(((g0) kVar).e()) && kotlin.reflect.jvm.internal.impl.resolve.d.b(kVar, oVar);
                }
                kVar = kVar.c();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class e extends p {
        e(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarQ;
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            if (r.f125864a.e(hVar, oVar, kVar, z10)) {
                if (hVar == r.f125877n) {
                    return true;
                }
                if (hVar != r.f125876m && (kVarQ = kotlin.reflect.jvm.internal.impl.resolve.d.q(oVar, kotlin.reflect.jvm.internal.impl.descriptors.d.class)) != null && (hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j)) {
                    return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j) hVar).o().a().equals(kVarQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class f extends p {
        f(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            if (oVar == null) {
                g(2);
            }
            if (dVar == null) {
                g(3);
            }
            if (hVar == r.f125878o) {
                return false;
            }
            if (!(oVar instanceof CallableMemberDescriptor) || (oVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) || hVar == r.f125877n) {
                return true;
            }
            if (hVar == r.f125876m || hVar == null) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.d0 d0VarB = hVar instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i) hVar).b() : hVar.getType();
            return kotlin.reflect.jvm.internal.impl.resolve.d.I(d0VarB, dVar) || kotlin.reflect.jvm.internal.impl.types.u.a(d0VarB);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar;
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) kotlin.reflect.jvm.internal.impl.resolve.d.q(oVar, kotlin.reflect.jvm.internal.impl.descriptors.d.class);
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) kotlin.reflect.jvm.internal.impl.resolve.d.r(kVar, kotlin.reflect.jvm.internal.impl.descriptors.d.class, false);
            if (dVar3 == null) {
                return false;
            }
            if (dVar2 != null && kotlin.reflect.jvm.internal.impl.resolve.d.x(dVar2) && (dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kotlin.reflect.jvm.internal.impl.resolve.d.q(dVar2, kotlin.reflect.jvm.internal.impl.descriptors.d.class)) != null && kotlin.reflect.jvm.internal.impl.resolve.d.H(dVar3, dVar)) {
                return true;
            }
            o oVarM = kotlin.reflect.jvm.internal.impl.resolve.d.M(oVar);
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) kotlin.reflect.jvm.internal.impl.resolve.d.q(oVarM, kotlin.reflect.jvm.internal.impl.descriptors.d.class);
            if (dVar4 == null) {
                return false;
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.d.H(dVar3, dVar4) && h(hVar, oVarM, dVar3)) {
                return true;
            }
            return e(hVar, oVar, dVar3.c(), z10);
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class g extends p {
        g(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            if (kotlin.reflect.jvm.internal.impl.resolve.d.g(kVar).F(kotlin.reflect.jvm.internal.impl.resolve.d.g(oVar))) {
                return r.f125879p.a(oVar, kVar);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class h extends p {
        h(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class i extends p {
        i(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class j extends p {
        j(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class k extends p {
        k(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static final class l extends p {
        l(g1 g1Var) {
            super(g1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
            if (oVar == null) {
                g(0);
            }
            if (kVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(f1.e.f125621c);
        f125864a = dVar;
        e eVar = new e(f1.f.f125622c);
        f125865b = eVar;
        f fVar = new f(f1.g.f125623c);
        f125866c = fVar;
        g gVar = new g(f1.b.f125618c);
        f125867d = gVar;
        h hVar = new h(f1.h.f125624c);
        f125868e = hVar;
        i iVar = new i(f1.d.f125620c);
        f125869f = iVar;
        j jVar = new j(f1.a.f125617c);
        f125870g = jVar;
        k kVar = new k(f1.c.f125619c);
        f125871h = kVar;
        l lVar = new l(f1.i.f125625c);
        f125872i = lVar;
        f125873j = Collections.unmodifiableSet(kotlin.collections.d1.u(dVar, eVar, gVar, iVar));
        HashMap mapE = kotlin.reflect.jvm.internal.impl.utils.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f125874k = Collections.unmodifiableMap(mapE);
        f125875l = hVar;
        f125876m = new a();
        f125877n = new b();
        f125878o = new c();
        Iterator it = ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.k.class, kotlin.reflect.jvm.internal.impl.util.k.class.getClassLoader()).iterator();
        f125879p = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.k) it.next() : kotlin.reflect.jvm.internal.impl.util.k.a.f128243a;
        f125880q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = p7.a.f135567e;
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    @dl.e
    public static Integer d(@dl.d s sVar, @dl.d s sVar2) {
        if (sVar == null) {
            a(12);
        }
        if (sVar2 == null) {
            a(13);
        }
        Integer numA = sVar.a(sVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = sVar2.a(sVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    @dl.e
    public static o e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
        o oVarE;
        if (oVar == null) {
            a(8);
        }
        if (kVar == null) {
            a(9);
        }
        for (o oVar2 = (o) oVar.a(); oVar2 != null && oVar2.getVisibility() != f125869f; oVar2 = (o) kotlin.reflect.jvm.internal.impl.resolve.d.q(oVar2, o.class)) {
            if (!oVar2.getVisibility().e(hVar, oVar2, kVar, z10)) {
                return oVar2;
            }
        }
        if (!(oVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.f0) || (oVarE = e(hVar, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.f0) oVar).J(), kVar, z10)) == null) {
            return null;
        }
        return oVarE;
    }

    public static boolean f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
        if (kVar == null) {
            a(6);
        }
        if (kVar2 == null) {
            a(7);
        }
        u0 u0VarJ = kotlin.reflect.jvm.internal.impl.resolve.d.j(kVar2);
        if (u0VarJ != u0.f125943a) {
            return u0VarJ.equals(kotlin.reflect.jvm.internal.impl.resolve.d.j(kVar));
        }
        return false;
    }

    public static boolean g(@dl.d s sVar) {
        if (sVar == null) {
            a(14);
        }
        return sVar == f125864a || sVar == f125865b;
    }

    public static boolean h(@dl.d o oVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, boolean z10) {
        if (oVar == null) {
            a(2);
        }
        if (kVar == null) {
            a(3);
        }
        return e(f125877n, oVar, kVar, z10) == null;
    }

    private static void i(s sVar) {
        f125880q.put(sVar.b(), sVar);
    }

    @dl.d
    public static s j(@dl.d g1 g1Var) {
        if (g1Var == null) {
            a(15);
        }
        s sVar = f125880q.get(g1Var);
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + g1Var);
    }
}
