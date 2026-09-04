package kotlin.reflect.jvm.internal.impl.builtins.functions;

import fi.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: FunctionClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f125363o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125364p = new kotlin.reflect.jvm.internal.impl.name.b(h.f125412u, f.f("Function"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125365q = new kotlin.reflect.jvm.internal.impl.name.b(h.f125409r, f.f("KFunction"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final m f125366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final g0 f125367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final FunctionClassKind f125368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f125369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final C1140b f125370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final c f125371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final List<y0> f125372n;

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public final class C1140b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b$a */
        /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f125374a;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                try {
                    iArr[FunctionClassKind.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f125374a = iArr;
            }
        }

        public C1140b() {
            super(b.this.f125366h);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<y0> getParameters() {
            return b.this.f125372n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected Collection<d0> k() {
            List<kotlin.reflect.jvm.internal.impl.name.b> listK;
            int i10 = a.f125374a[b.this.V0().ordinal()];
            if (i10 == 1) {
                listK = s.k(b.f125364p);
            } else if (i10 == 2) {
                listK = CollectionsKt__CollectionsKt.L(b.f125365q, new kotlin.reflect.jvm.internal.impl.name.b(h.f125412u, FunctionClassKind.Function.numberedClassName(b.this.R0())));
            } else if (i10 == 3) {
                listK = s.k(b.f125364p);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                listK = CollectionsKt__CollectionsKt.L(b.f125365q, new kotlin.reflect.jvm.internal.impl.name.b(h.f125404m, FunctionClassKind.SuspendFunction.numberedClassName(b.this.R0())));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d0 d0VarC = b.this.f125367i.c();
            ArrayList arrayList = new ArrayList(t.Y(listK, 10));
            for (kotlin.reflect.jvm.internal.impl.name.b bVar : listK) {
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(d0VarC, bVar);
                if (dVarA == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listF5 = CollectionsKt___CollectionsKt.F5(getParameters(), dVarA.r().getParameters().size());
                ArrayList arrayList2 = new ArrayList(t.Y(listF5, 10));
                Iterator it = listF5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new e1(((y0) it.next()).v()));
                }
                arrayList.add(KotlinTypeFactory.g(w0.f128193c.h(), dVarA, arrayList2));
            }
            return CollectionsKt___CollectionsKt.Q5(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.w0 p() {
            return kotlin.reflect.jvm.internal.impl.descriptors.w0.a.f125944a;
        }

        @dl.d
        public String toString() {
            return d().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        @dl.d
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b d() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d m storageManager, @dl.d g0 containingDeclaration, @dl.d FunctionClassKind functionKind, int i10) {
        super(storageManager, functionKind.numberedClassName(i10));
        f0.p(storageManager, "storageManager");
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(functionKind, "functionKind");
        this.f125366h = storageManager;
        this.f125367i = containingDeclaration;
        this.f125368j = functionKind;
        this.f125369k = i10;
        this.f125370l = new C1140b();
        this.f125371m = new c(storageManager, this);
        ArrayList arrayList = new ArrayList();
        l lVar = new l(1, i10);
        ArrayList arrayList2 = new ArrayList(t.Y(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            L0(arrayList, this, variance, sb2.toString());
            arrayList2.add(b2.f124493a);
        }
        L0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f125372n = CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    private static final void L0(ArrayList<y0> arrayList, b bVar, Variance variance, String str) {
        arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.g0.S0(bVar, e.f125601z1.b(), false, variance, f.f(str), arrayList.size(), bVar.f125366h));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.c) Z0();
    }

    public final int R0() {
        return this.f125369k;
    }

    @dl.e
    public Void S0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public g0 c() {
        return this.f125367i;
    }

    @dl.d
    public final FunctionClassKind V0() {
        return this.f125368j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> s() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public MemberScope.b x0() {
        return MemberScope.b.f127587b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public c u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f125371m;
    }

    @dl.e
    public Void Z0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public e getAnnotations() {
        return e.f125601z1.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s PUBLIC = r.f125868e;
        f0.o(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 NO_SOURCE = t0.f125942a;
        f0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public z0<j0> m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.z0 r() {
        return this.f125370l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean r0() {
        return false;
    }

    @dl.d
    public String toString() {
        String strB = getName().b();
        f0.o(strB, "name.asString()");
        return strB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        return this.f125372n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d y0() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean z() {
        return false;
    }
}
