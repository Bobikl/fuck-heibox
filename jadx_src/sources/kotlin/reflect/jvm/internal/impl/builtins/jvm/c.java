package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;

/* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f125524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f125525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f125526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f125527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f125528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f125530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f125533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f125534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f125535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f125536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f125537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f125538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f125539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final List<a> f125540q;

    /* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f125541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f125542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f125543c;

        public a(@dl.d kotlin.reflect.jvm.internal.impl.name.b javaClass, @dl.d kotlin.reflect.jvm.internal.impl.name.b kotlinReadOnly, @dl.d kotlin.reflect.jvm.internal.impl.name.b kotlinMutable) {
            f0.p(javaClass, "javaClass");
            f0.p(kotlinReadOnly, "kotlinReadOnly");
            f0.p(kotlinMutable, "kotlinMutable");
            this.f125541a = javaClass;
            this.f125542b = kotlinReadOnly;
            this.f125543c = kotlinMutable;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f125541a;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f125542b;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b c() {
            return this.f125543c;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b d() {
            return this.f125541a;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f0.g(this.f125541a, aVar.f125541a) && f0.g(this.f125542b, aVar.f125542b) && f0.g(this.f125543c, aVar.f125543c);
        }

        public int hashCode() {
            return (((this.f125541a.hashCode() * 31) + this.f125542b.hashCode()) * 31) + this.f125543c.hashCode();
        }

        @dl.d
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f125541a + ", kotlinReadOnly=" + this.f125542b + ", kotlinMutable=" + this.f125543c + ')';
        }
    }

    static {
        c cVar = new c();
        f125524a = cVar;
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb2.append(functionClassKind.getPackageFqName().toString());
        sb2.append(lg.a.f131414g);
        sb2.append(functionClassKind.getClassNamePrefix());
        f125525b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb3.append(functionClassKind2.getPackageFqName().toString());
        sb3.append(lg.a.f131414g);
        sb3.append(functionClassKind2.getClassNamePrefix());
        f125526c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb4.append(functionClassKind3.getPackageFqName().toString());
        sb4.append(lg.a.f131414g);
        sb4.append(functionClassKind3.getClassNamePrefix());
        f125527d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb5.append(functionClassKind4.getPackageFqName().toString());
        sb5.append(lg.a.f131414g);
        sb5.append(functionClassKind4.getClassNamePrefix());
        f125528e = sb5.toString();
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.functions.FunctionN"));
        f0.o(bVarM, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f125529f = bVarM;
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarM.b();
        f0.o(cVarB, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f125530g = cVarB;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f127227a;
        f125531h = iVar.k();
        f125532i = iVar.j();
        f125533j = cVar.g(Class.class);
        f125534k = new HashMap<>();
        f125535l = new HashMap<>();
        f125536m = new HashMap<>();
        f125537n = new HashMap<>();
        f125538o = new HashMap<>();
        f125539p = new HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.b bVarM2 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.T);
        f0.o(bVarM2, "topLevel(FqNames.iterable)");
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125421b0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH = bVarM2.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH2 = bVarM2.h();
        f0.o(cVarH2, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.c cVarG = kotlin.reflect.jvm.internal.impl.name.e.g(cVar2, cVarH2);
        kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(cVarH, cVarG, false);
        kotlin.reflect.jvm.internal.impl.name.b bVarM3 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.S);
        f0.o(bVarM3, "topLevel(FqNames.iterator)");
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125419a0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH3 = bVarM3.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH4 = bVarM3.h();
        f0.o(cVarH4, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar2 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH3, kotlin.reflect.jvm.internal.impl.name.e.g(cVar3, cVarH4), false);
        kotlin.reflect.jvm.internal.impl.name.b bVarM4 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.U);
        f0.o(bVarM4, "topLevel(FqNames.collection)");
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125423c0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH5 = bVarM4.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH6 = bVarM4.h();
        f0.o(cVarH6, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar3 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH5, kotlin.reflect.jvm.internal.impl.name.e.g(cVar4, cVarH6), false);
        kotlin.reflect.jvm.internal.impl.name.b bVarM5 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.V);
        f0.o(bVarM5, "topLevel(FqNames.list)");
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125425d0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH7 = bVarM5.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH8 = bVarM5.h();
        f0.o(cVarH8, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar4 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH7, kotlin.reflect.jvm.internal.impl.name.e.g(cVar5, cVarH8), false);
        kotlin.reflect.jvm.internal.impl.name.b bVarM6 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.X);
        f0.o(bVarM6, "topLevel(FqNames.set)");
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125429f0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH9 = bVarM6.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH10 = bVarM6.h();
        f0.o(cVarH10, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar5 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH9, kotlin.reflect.jvm.internal.impl.name.e.g(cVar6, cVarH10), false);
        kotlin.reflect.jvm.internal.impl.name.b bVarM7 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.W);
        f0.o(bVarM7, "topLevel(FqNames.listIterator)");
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125427e0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH11 = bVarM7.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH12 = bVarM7.h();
        f0.o(cVarH12, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar6 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH11, kotlin.reflect.jvm.internal.impl.name.e.g(cVar7, cVarH12), false);
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = kotlin.reflect.jvm.internal.impl.builtins.h.a.Y;
        kotlin.reflect.jvm.internal.impl.name.b bVarM8 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar8);
        f0.o(bVarM8, "topLevel(FqNames.map)");
        kotlin.reflect.jvm.internal.impl.name.c cVar9 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125431g0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH13 = bVarM8.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH14 = bVarM8.h();
        f0.o(cVarH14, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.b bVar7 = new kotlin.reflect.jvm.internal.impl.name.b(cVarH13, kotlin.reflect.jvm.internal.impl.name.e.g(cVar9, cVarH14), false);
        kotlin.reflect.jvm.internal.impl.name.b bVarD = kotlin.reflect.jvm.internal.impl.name.b.m(cVar8).d(kotlin.reflect.jvm.internal.impl.builtins.h.a.Z.g());
        f0.o(bVarD, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        kotlin.reflect.jvm.internal.impl.name.c cVar10 = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125433h0;
        kotlin.reflect.jvm.internal.impl.name.c cVarH15 = bVarD.h();
        kotlin.reflect.jvm.internal.impl.name.c cVarH16 = bVarD.h();
        f0.o(cVarH16, "kotlinReadOnly.packageFqName");
        List<a> listL = CollectionsKt__CollectionsKt.L(new a(cVar.g(Iterable.class), bVarM2, bVar), new a(cVar.g(Iterator.class), bVarM3, bVar2), new a(cVar.g(Collection.class), bVarM4, bVar3), new a(cVar.g(List.class), bVarM5, bVar4), new a(cVar.g(Set.class), bVarM6, bVar5), new a(cVar.g(ListIterator.class), bVarM7, bVar6), new a(cVar.g(Map.class), bVarM8, bVar7), new a(cVar.g(Map.Entry.class), bVarD, new kotlin.reflect.jvm.internal.impl.name.b(cVarH15, kotlin.reflect.jvm.internal.impl.name.e.g(cVar10, cVarH16), false)));
        f125540q = listL;
        cVar.f(Object.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125420b);
        cVar.f(String.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125432h);
        cVar.f(CharSequence.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125430g);
        cVar.e(Throwable.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125458u);
        cVar.f(Cloneable.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125424d);
        cVar.f(Number.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125452r);
        cVar.e(Comparable.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125460v);
        cVar.f(Enum.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125454s);
        cVar.e(Annotation.class, kotlin.reflect.jvm.internal.impl.builtins.h.a.G);
        Iterator<a> it = listL.iterator();
        while (it.hasNext()) {
            f125524a.d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            c cVar11 = f125524a;
            kotlin.reflect.jvm.internal.impl.name.b bVarM9 = kotlin.reflect.jvm.internal.impl.name.b.m(jvmPrimitiveType.getWrapperFqName());
            f0.o(bVarM9, "topLevel(jvmType.wrapperFqName)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            f0.o(primitiveType, "jvmType.primitiveType");
            kotlin.reflect.jvm.internal.impl.name.b bVarM10 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.c(primitiveType));
            f0.o(bVarM10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar11.a(bVarM9, bVarM10);
        }
        for (kotlin.reflect.jvm.internal.impl.name.b bVar8 : kotlin.reflect.jvm.internal.impl.builtins.b.f125355a.a()) {
            c cVar12 = f125524a;
            kotlin.reflect.jvm.internal.impl.name.b bVarM11 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal." + bVar8.j().b() + "CompanionObject"));
            f0.o(bVarM11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            kotlin.reflect.jvm.internal.impl.name.b bVarD2 = bVar8.d(kotlin.reflect.jvm.internal.impl.name.h.f127212d);
            f0.o(bVarD2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar12.a(bVarM11, bVarD2);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar13 = f125524a;
            kotlin.reflect.jvm.internal.impl.name.b bVarM12 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.functions.Function" + i10));
            f0.o(bVarM12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar13.a(bVarM12, kotlin.reflect.jvm.internal.impl.builtins.h.a(i10));
            cVar13.c(new kotlin.reflect.jvm.internal.impl.name.c(f125526c + i10), f125531h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            f125524a.c(new kotlin.reflect.jvm.internal.impl.name.c((functionClassKind5.getPackageFqName().toString() + lg.a.f131414g + functionClassKind5.getClassNamePrefix()) + i11), f125531h);
        }
        c cVar14 = f125524a;
        kotlin.reflect.jvm.internal.impl.name.c cVarL = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125422c.l();
        f0.o(cVarL, "nothing.toSafe()");
        cVar14.c(cVarL, cVar14.g(Void.class));
    }

    private c() {
    }

    private final void a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        b(bVar, bVar2);
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVar2.b();
        f0.o(cVarB, "kotlinClassId.asSingleFqName()");
        c(cVarB, bVar);
    }

    private final void b(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> map = f125534k;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = bVar.b().j();
        f0.o(dVarJ, "javaClassId.asSingleFqName().toUnsafe()");
        map.put(dVarJ, bVar2);
    }

    private final void c(kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> map = f125535l;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = cVar.j();
        f0.o(dVarJ, "kotlinFqNameUnsafe.toUnsafe()");
        map.put(dVarJ, bVar);
    }

    private final void d(a aVar) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA = aVar.a();
        kotlin.reflect.jvm.internal.impl.name.b bVarB = aVar.b();
        kotlin.reflect.jvm.internal.impl.name.b bVarC = aVar.c();
        a(bVarA, bVarB);
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarC.b();
        f0.o(cVarB, "mutableClassId.asSingleFqName()");
        c(cVarB, bVarA);
        f125538o.put(bVarC, bVarB);
        f125539p.put(bVarB, bVarC);
        kotlin.reflect.jvm.internal.impl.name.c cVarB2 = bVarB.b();
        f0.o(cVarB2, "readOnlyClassId.asSingleFqName()");
        kotlin.reflect.jvm.internal.impl.name.c cVarB3 = bVarC.b();
        f0.o(cVarB3, "mutableClassId.asSingleFqName()");
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> map = f125536m;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = bVarC.b().j();
        f0.o(dVarJ, "mutableClassId.asSingleFqName().toUnsafe()");
        map.put(dVarJ, cVarB2);
        HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> map2 = f125537n;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ2 = cVarB2.j();
        f0.o(dVarJ2, "readOnlyFqName.toUnsafe()");
        map2.put(dVarJ2, cVarB3);
    }

    private final void e(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.b bVarG = g(cls);
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        f0.o(bVarM, "topLevel(kotlinFqName)");
        a(bVarG, bVarM);
    }

    private final void f(Class<?> cls, kotlin.reflect.jvm.internal.impl.name.d dVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVarL = dVar.l();
        f0.o(cVarL, "kotlinFqName.toSafe()");
        e(cls, cVarL);
    }

    private final kotlin.reflect.jvm.internal.impl.name.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(cls.getCanonicalName()));
            f0.o(bVarM, "topLevel(FqName(clazz.canonicalName))");
            return bVarM;
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarD = g(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.f.f(cls.getSimpleName()));
        f0.o(bVarD, "classId(outer).createNes…tifier(clazz.simpleName))");
        return bVarD;
    }

    private final boolean j(kotlin.reflect.jvm.internal.impl.name.d dVar, String str) {
        String strB = dVar.b();
        f0.o(strB, "kotlinFqName.asString()");
        String strO5 = StringsKt__StringsKt.o5(strB, str, "");
        if (!(strO5.length() > 0) || StringsKt__StringsKt.e5(strO5, '0', false, 2, null)) {
            return false;
        }
        Integer numY0 = t.Y0(strO5);
        return numY0 != null && numY0.intValue() >= 23;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.c h() {
        return f125530g;
    }

    @dl.d
    public final List<a> i() {
        return f125540q;
    }

    public final boolean k(@dl.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f125536m.containsKey(dVar);
    }

    public final boolean l(@dl.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f125537n.containsKey(dVar);
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.b m(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return f125534k.get(fqName.j());
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.b n(@dl.d kotlin.reflect.jvm.internal.impl.name.d kotlinFqName) {
        f0.p(kotlinFqName, "kotlinFqName");
        if (!j(kotlinFqName, f125525b) && !j(kotlinFqName, f125527d)) {
            if (!j(kotlinFqName, f125526c) && !j(kotlinFqName, f125528e)) {
                return f125535l.get(kotlinFqName);
            }
            return f125531h;
        }
        return f125529f;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.c o(@dl.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f125536m.get(dVar);
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.c p(@dl.e kotlin.reflect.jvm.internal.impl.name.d dVar) {
        return f125537n.get(dVar);
    }
}
