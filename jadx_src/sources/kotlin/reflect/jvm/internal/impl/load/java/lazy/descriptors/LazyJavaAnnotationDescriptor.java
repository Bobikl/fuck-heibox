package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.f;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.n;
import mi.g;
import mi.m;
import mi.o;
import mi.x;

/* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126127i = {n0.u(new PropertyReference1Impl(n0.d(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), n0.u(new PropertyReference1Impl(n0.d(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), n0.u(new PropertyReference1Impl(n0.d(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final mi.a f126129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i f126130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final h f126131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final li.a f126132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final h f126133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f126134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f126135h;

    public LazyJavaAnnotationDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d mi.a javaAnnotation, boolean z10) {
        f0.p(c10, "c");
        f0.p(javaAnnotation, "javaAnnotation");
        this.f126128a = c10;
        this.f126129b = javaAnnotation;
        this.f126130c = c10.e().b(new yh.a<kotlin.reflect.jvm.internal.impl.name.c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
                kotlin.reflect.jvm.internal.impl.name.b bVarF = this.f126137b.f126129b.f();
                if (bVarF != null) {
                    return bVarF.b();
                }
                return null;
            }
        });
        this.f126131d = c10.e().c(new yh.a<j0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke() {
                kotlin.reflect.jvm.internal.impl.name.c cVarE = this.f126138b.e();
                if (cVarE == null) {
                    return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, this.f126138b.f126129b.toString());
                }
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f125544a, cVarE, this.f126138b.f126128a.d().t(), null, 4, null);
                if (dVarF == null) {
                    g gVarM = this.f126138b.f126129b.M();
                    dVarF = gVarM != null ? this.f126138b.f126128a.a().n().a(gVarM) : null;
                    if (dVarF == null) {
                        dVarF = this.f126138b.h(cVarE);
                    }
                }
                return dVarF.v();
            }
        });
        this.f126132e = c10.a().t().a(javaAnnotation);
        this.f126133f = c10.e().c(new yh.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
                Collection<mi.b> collectionD = this.f126136b.f126129b.d();
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f126136b;
                ArrayList arrayList = new ArrayList();
                for (mi.b bVar : collectionD) {
                    kotlin.reflect.jvm.internal.impl.name.f name = bVar.getName();
                    if (name == null) {
                        name = t.f126311c;
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g gVarM = lazyJavaAnnotationDescriptor.m(bVar);
                    Pair pairA = gVarM != null ? c1.a(name, gVarM) : null;
                    if (pairA != null) {
                        arrayList.add(pairA);
                    }
                }
                return s0.B0(arrayList);
            }
        });
        this.f126134g = javaAnnotation.g();
        this.f126135h = javaAnnotation.C() || z10;
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, mi.a aVar, boolean z10, int i10, u uVar) {
        this(dVar, aVar, (i10 & 4) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d h(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        d0 d0VarD = this.f126128a.d();
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        f0.o(bVarM, "topLevel(fqName)");
        return FindClassInModuleKt.c(d0VarD, bVarM, this.f126128a.a().b().d().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> m(mi.b bVar) {
        if (bVar instanceof o) {
            return ConstantValueFactory.f127518a.c(((o) bVar).getValue());
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            return p(mVar.b(), mVar.d());
        }
        if (!(bVar instanceof mi.e)) {
            if (bVar instanceof mi.c) {
                return n(((mi.c) bVar).c());
            }
            if (bVar instanceof mi.h) {
                return q(((mi.h) bVar).a());
            }
            return null;
        }
        mi.e eVar = (mi.e) bVar;
        kotlin.reflect.jvm.internal.impl.name.f name = eVar.getName();
        if (name == null) {
            name = t.f126311c;
        }
        f0.o(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
        return o(name, eVar.getElements());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n(mi.a aVar) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.a(new LazyJavaAnnotationDescriptor(this.f126128a, aVar, false, 4, null));
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(kotlin.reflect.jvm.internal.impl.name.f fVar, List<? extends mi.b> list) {
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarL;
        j0 type = getType();
        f0.o(type, "type");
        if (e0.a(type)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = DescriptorUtilsKt.i(this);
        f0.m(dVarI);
        b1 b1VarB = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, dVarI);
        if (b1VarB == null || (d0VarL = b1VarB.getType()) == null) {
            d0VarL = this.f126128a.a().m().t().l(Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        f0.o(d0VarL, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarM = m((mi.b) it.next());
            if (gVarM == null) {
                gVarM = new q();
            }
            arrayList.add(gVarM);
        }
        return ConstantValueFactory.f127518a.b(arrayList, d0VarL);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.i(bVar, fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q(x xVar) {
        return kotlin.reflect.jvm.internal.impl.resolve.constants.o.f127541b.a(this.f126128a.g().o(xVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) l.a(this.f126133f, this, f126127i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return (kotlin.reflect.jvm.internal.impl.name.c) l.b(this.f126130c, this, f126127i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
    public boolean g() {
        return this.f126134g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public li.a j() {
        return this.f126132e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public j0 getType() {
        return (j0) l.a(this.f126131d, this, f126127i[1]);
    }

    public final boolean l() {
        return this.f126135h;
    }

    @dl.d
    public String toString() {
        return DescriptorRenderer.u(DescriptorRenderer.f127417g, this, null, 2, null);
    }
}
