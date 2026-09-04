package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KTypeImpl implements g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125247f = {n0.u(new PropertyReference1Impl(n0.d(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), n0.u(new PropertyReference1Impl(n0.d(KTypeImpl.class), com.tekartik.sqflite.b.f98603v, "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f125248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final n.a<Type> f125249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final n.a f125250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final n.a f125251e;

    public KTypeImpl(@dl.d d0 type, @dl.e yh.a<? extends Type> aVar) {
        f0.p(type, "type");
        this.f125248b = type;
        n.a<Type> aVarD = null;
        n.a<Type> aVar2 = aVar instanceof n.a ? (n.a) aVar : null;
        if (aVar2 != null) {
            aVarD = aVar2;
        } else if (aVar != null) {
            aVarD = n.d(aVar);
        }
        this.f125249c = aVarD;
        this.f125250d = n.d(new yh.a<kotlin.reflect.g>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.g invoke() {
                KTypeImpl kTypeImpl = this.f125259b;
                return kTypeImpl.i(kTypeImpl.j());
            }
        });
        this.f125251e = n.d(new KTypeImpl$arguments$2(this, aVar));
    }

    public /* synthetic */ KTypeImpl(d0 d0Var, yh.a aVar, int i10, u uVar) {
        this(d0Var, (i10 & 2) != 0 ? null : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.g i(d0 d0Var) {
        d0 type;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (!(fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            if (fVarD instanceof y0) {
                return new KTypeParameterImpl(null, (y0) fVarD);
            }
            if (!(fVarD instanceof x0)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> clsP = s.p((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
        if (clsP == null) {
            return null;
        }
        if (!clsP.isArray()) {
            if (i1.l(d0Var)) {
                return new KClassImpl(clsP);
            }
            Class<?> clsE = ReflectClassUtilKt.e(clsP);
            if (clsE != null) {
                clsP = clsE;
            }
            return new KClassImpl(clsP);
        }
        c1 c1Var = (c1) CollectionsKt___CollectionsKt.f5(d0Var.M0());
        if (c1Var == null || (type = c1Var.getType()) == null) {
            return new KClassImpl(clsP);
        }
        kotlin.reflect.g gVarI = i(type);
        if (gVarI != null) {
            return new KClassImpl(s.f(xh.a.e(kotlin.reflect.jvm.d.a(gVarI))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.reflect.r
    @dl.d
    public List<kotlin.reflect.t> d() {
        T tB = this.f125251e.b(this, f125247f[1]);
        f0.o(tB, "<get-arguments>(...)");
        return (List) tB;
    }

    @Override // kotlin.jvm.internal.g0
    @dl.e
    public Type e() {
        n.a<Type> aVar = this.f125249c;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof KTypeImpl) {
            KTypeImpl kTypeImpl = (KTypeImpl) obj;
            if (f0.g(this.f125248b, kTypeImpl.f125248b) && f0.g(o(), kTypeImpl.o()) && f0.g(d(), kTypeImpl.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        return s.e(this.f125248b);
    }

    public int hashCode() {
        int iHashCode = this.f125248b.hashCode() * 31;
        kotlin.reflect.g gVarO = o();
        return ((iHashCode + (gVarO != null ? gVarO.hashCode() : 0)) * 31) + d().hashCode();
    }

    @dl.d
    public final d0 j() {
        return this.f125248b;
    }

    @dl.d
    public final KTypeImpl k(boolean z10) {
        if (!b0.b(this.f125248b) && p() == z10) {
            return this;
        }
        d0 d0VarP = i1.p(this.f125248b, z10);
        f0.o(d0VarP, "makeNullableAsSpecified(type, nullable)");
        return new KTypeImpl(d0VarP, this.f125249c);
    }

    @Override // kotlin.reflect.r
    @dl.e
    public kotlin.reflect.g o() {
        return (kotlin.reflect.g) this.f125250d.b(this, f125247f[0]);
    }

    @Override // kotlin.reflect.r
    public boolean p() {
        return this.f125248b.P0();
    }

    @dl.d
    public String toString() {
        return ReflectionObjectRenderer.f125266a.h(this.f125248b);
    }
}
