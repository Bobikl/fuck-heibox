package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.w;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.load.kotlin.p;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.n;
import mi.g;
import mi.u;

/* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageFragment extends w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126183o = {n0.u(new PropertyReference1Impl(n0.d(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), n0.u(new PropertyReference1Impl(n0.d(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final u f126184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final h f126186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final JvmPackageScope f126187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final h<List<kotlin.reflect.jvm.internal.impl.name.c>> f126188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f126189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final h f126190n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d outerContext, @dl.d u jPackage) {
        super(outerContext.d(), jPackage.e());
        f0.p(outerContext, "outerContext");
        f0.p(jPackage, "jPackage");
        this.f126184h = jPackage;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarD = ContextKt.d(outerContext, this, null, 0, 6, null);
        this.f126185i = dVarD;
        this.f126186j = dVarD.e().c(new yh.a<Map<String, ? extends o>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, o> invoke() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.u uVarO = this.f126191b.f126185i.a().o();
                String strB = this.f126191b.e().b();
                f0.o(strB, "fqName.asString()");
                List<String> listA = uVarO.a(strB);
                LazyJavaPackageFragment lazyJavaPackageFragment = this.f126191b;
                ArrayList arrayList = new ArrayList();
                for (String str : listA) {
                    kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(str).e());
                    f0.o(bVarM, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    o oVarA = kotlin.reflect.jvm.internal.impl.load.kotlin.n.a(lazyJavaPackageFragment.f126185i.a().j(), bVarM);
                    Pair pairA = oVarA != null ? c1.a(str, oVarA) : null;
                    if (pairA != null) {
                        arrayList.add(pairA);
                    }
                }
                return s0.B0(arrayList);
            }
        });
        this.f126187k = new JvmPackageScope(dVarD, jPackage, this);
        this.f126188l = dVarD.e().i(new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.name.c>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.name.c> invoke() {
                Collection<u> collectionV = this.f126194b.f126184h.v();
                ArrayList arrayList = new ArrayList(t.Y(collectionV, 10));
                Iterator<T> it = collectionV.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u) it.next()).e());
                }
                return arrayList;
            }
        }, CollectionsKt__CollectionsKt.E());
        this.f126189m = dVarD.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b() : kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(dVarD, jPackage);
        this.f126190n = dVarD.e().c(new yh.a<HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            /* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f126193a;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f126193a = iArr;
                }
            }

            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> invoke() {
                HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> map = new HashMap<>();
                for (Map.Entry<String, o> entry : this.f126192b.N0().entrySet()) {
                    String key = entry.getKey();
                    o value = entry.getValue();
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVarD2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(key);
                    f0.o(dVarD2, "byInternalName(partInternalName)");
                    KotlinClassHeader kotlinClassHeaderH = value.h();
                    int i10 = a.f126193a[kotlinClassHeaderH.c().ordinal()];
                    if (i10 == 1) {
                        String strE = kotlinClassHeaderH.e();
                        if (strE != null) {
                            kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVarD3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(strE);
                            f0.o(dVarD3, "byInternalName(header.mu…: continue@kotlinClasses)");
                            map.put(dVarD2, dVarD3);
                        }
                    } else if (i10 == 2) {
                        map.put(dVarD2, dVarD2);
                    }
                }
                return map;
            }
        });
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d M0(@dl.d g jClass) {
        f0.p(jClass, "jClass");
        return this.f126187k.k().P(jClass);
    }

    @dl.d
    public final Map<String, o> N0() {
        return (Map) l.a(this.f126186j, this, f126183o[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @dl.d
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public JvmPackageScope u() {
        return this.f126187k;
    }

    @dl.d
    public final List<kotlin.reflect.jvm.internal.impl.name.c> P0() {
        return this.f126188l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return this.f126189m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        return new p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w, kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    @dl.d
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f126185i.a().m();
    }
}
