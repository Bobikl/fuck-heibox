package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: NotFoundClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f125557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f125558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.c, g0> f125559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<a, d> f125560d;

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f125561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<Integer> f125562b;

        public a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d List<Integer> typeParametersCount) {
            kotlin.jvm.internal.f0.p(classId, "classId");
            kotlin.jvm.internal.f0.p(typeParametersCount, "typeParametersCount");
            this.f125561a = classId;
            this.f125562b = typeParametersCount;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f125561a;
        }

        @dl.d
        public final List<Integer> b() {
            return this.f125562b;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f0.g(this.f125561a, aVar.f125561a) && kotlin.jvm.internal.f0.g(this.f125562b, aVar.f125562b);
        }

        public int hashCode() {
            return (this.f125561a.hashCode() * 31) + this.f125562b.hashCode();
        }

        @dl.d
        public String toString() {
            return "ClassRequest(classId=" + this.f125561a + ", typeParametersCount=" + this.f125562b + ')';
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f125563k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.d
        private final List<y0> f125564l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.types.j f125565m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d k container, @dl.d kotlin.reflect.jvm.internal.impl.name.f name, boolean z10, int i10) {
            super(storageManager, container, name, t0.f125942a, false);
            kotlin.jvm.internal.f0.p(storageManager, "storageManager");
            kotlin.jvm.internal.f0.p(container, "container");
            kotlin.jvm.internal.f0.p(name, "name");
            this.f125563k = z10;
            fi.l lVarW1 = fi.u.W1(0, i10);
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(lVarW1, 10));
            Iterator<Integer> it = lVarW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((kotlin.collections.k0) it).nextInt();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.g0.S0(this, eVarB, false, variance, kotlin.reflect.jvm.internal.impl.name.f.f(sb2.toString()), iNextInt, storageManager));
            }
            this.f125564l = arrayList;
            this.f125565m = new kotlin.reflect.jvm.internal.impl.types.j(this, TypeParameterUtilsKt.d(this), kotlin.collections.c1.f(DescriptorUtilsKt.p(this).t().i()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f, kotlin.reflect.jvm.internal.impl.descriptors.a0
        public boolean B() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.e
        public c D() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.d
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public MemberScope.b x0() {
            return MemberScope.b.f127587b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
        @dl.d
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.j r() {
            return this.f125565m;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
        @dl.d
        /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
        public MemberScope.b u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.b.f127587b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.d
        public ClassKind b() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean g() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        @dl.d
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
        @dl.d
        public s getVisibility() {
            s PUBLIC = r.f125868e;
            kotlin.jvm.internal.f0.o(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.d
        public Collection<c> h() {
            return kotlin.collections.d1.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
        @dl.d
        public Modality l() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
        public boolean m() {
            return this.f125563k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.e
        public z0<kotlin.reflect.jvm.internal.impl.types.j0> m0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
        public boolean o0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean r0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @dl.d
        public Collection<d> s() {
            return CollectionsKt__CollectionsKt.E();
        }

        @dl.d
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
        @dl.d
        public List<y0> w() {
            return this.f125564l;
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
        @dl.e
        public d y0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean z() {
            return false;
        }
    }

    public NotFoundClasses(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d d0 module) {
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        kotlin.jvm.internal.f0.p(module, "module");
        this.f125557a = storageManager;
        this.f125558b = module;
        this.f125559c = storageManager.a(new yh.l<kotlin.reflect.jvm.internal.impl.name.c, g0>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
                kotlin.jvm.internal.f0.p(fqName, "fqName");
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.l(this.f125567b.f125558b, fqName);
            }
        });
        this.f125560d = storageManager.a(new yh.l<a, d>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(@dl.d NotFoundClasses.a aVar) {
                k kVarD;
                kotlin.jvm.internal.f0.p(aVar, "<name for destructuring parameter 0>");
                kotlin.reflect.jvm.internal.impl.name.b bVarA = aVar.a();
                List<Integer> listB = aVar.b();
                if (bVarA.k()) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
                }
                kotlin.reflect.jvm.internal.impl.name.b bVarG = bVarA.g();
                if (bVarG == null || (kVarD = this.f125566b.d(bVarG, CollectionsKt___CollectionsKt.X1(listB, 1))) == null) {
                    kotlin.reflect.jvm.internal.impl.storage.f fVar = this.f125566b.f125559c;
                    kotlin.reflect.jvm.internal.impl.name.c cVarH = bVarA.h();
                    kotlin.jvm.internal.f0.o(cVarH, "classId.packageFqName");
                    kVarD = (e) fVar.invoke(cVarH);
                }
                k kVar = kVarD;
                boolean zL = bVarA.l();
                kotlin.reflect.jvm.internal.impl.storage.m mVar = this.f125566b.f125557a;
                kotlin.reflect.jvm.internal.impl.name.f fVarJ = bVarA.j();
                kotlin.jvm.internal.f0.o(fVarJ, "classId.shortClassName");
                Integer num = (Integer) CollectionsKt___CollectionsKt.B2(listB);
                return new NotFoundClasses.b(mVar, kVar, fVarJ, zL, num != null ? num.intValue() : 0);
            }
        });
    }

    @dl.d
    public final d d(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d List<Integer> typeParametersCount) {
        kotlin.jvm.internal.f0.p(classId, "classId");
        kotlin.jvm.internal.f0.p(typeParametersCount, "typeParametersCount");
        return this.f125560d.invoke(new a(classId, typeParametersCount));
    }
}
