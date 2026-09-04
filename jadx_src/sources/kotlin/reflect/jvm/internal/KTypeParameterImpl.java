package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.x0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: KTypeParameterImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KTypeParameterImpl implements kotlin.reflect.s, i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125260e = {n0.u(new PropertyReference1Impl(n0.d(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final y0 f125261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final n.a f125262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final l f125263d;

    /* JADX INFO: compiled from: KTypeParameterImpl.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125264a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125264a = iArr;
        }
    }

    public KTypeParameterImpl(@dl.e l lVar, @dl.d y0 descriptor) {
        KClassImpl<?> kClassImplD;
        Object objC0;
        f0.p(descriptor, "descriptor");
        this.f125261b = descriptor;
        this.f125262c = n.d(new yh.a<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2
            {
                super(0);
            }

            @Override // yh.a
            public final List<? extends KTypeImpl> invoke() {
                List<d0> upperBounds = this.f125265b.a().getUpperBounds();
                f0.o(upperBounds, "descriptor.upperBounds");
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(upperBounds, 10));
                Iterator<T> it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KTypeImpl((d0) it.next(), null, 2, null));
                }
                return arrayList;
            }
        });
        if (lVar == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = a().c();
            f0.o(kVarC, "descriptor.containingDeclaration");
            if (kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                objC0 = d((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC);
            } else {
                if (!(kVarC instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + kVarC);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.k kVarC2 = ((CallableMemberDescriptor) kVarC).c();
                f0.o(kVarC2, "declaration.containingDeclaration");
                if (kVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                    kClassImplD = d((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC2);
                } else {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f) kVarC : null;
                    if (fVar == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + kVarC);
                    }
                    kotlin.reflect.d dVarI = xh.a.i(b(fVar));
                    f0.n(dVarI, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImplD = (KClassImpl) dVarI;
                }
                objC0 = kVarC.c0(new e(kClassImplD), b2.f124493a);
            }
            f0.o(objC0, "when (val declaration = … $declaration\")\n        }");
            lVar = (l) objC0;
        }
        this.f125263d = lVar;
    }

    private final Class<?> b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar) {
        Class<?> clsA;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVarH0 = fVar.h0();
        if (!(eVarH0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.i)) {
            eVarH0 = null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.i iVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.i) eVarH0;
        kotlin.reflect.jvm.internal.impl.load.kotlin.o oVarG = iVar != null ? iVar.g() : null;
        ii.f fVar2 = (ii.f) (oVarG instanceof ii.f ? oVarG : null);
        if (fVar2 != null && (clsA = fVar2.a()) != null) {
            return clsA;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + fVar);
    }

    private final KClassImpl<?> d(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        Class<?> clsP = s.p(dVar);
        KClassImpl<?> kClassImpl = (KClassImpl) (clsP != null ? xh.a.i(clsP) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + dVar.c());
    }

    @Override // kotlin.reflect.jvm.internal.i
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y0 a() {
        return this.f125261b;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            if (f0.g(this.f125263d, kTypeParameterImpl.f125263d) && f0.g(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.s
    @dl.d
    public String getName() {
        String strB = a().getName().b();
        f0.o(strB, "descriptor.name.asString()");
        return strB;
    }

    @Override // kotlin.reflect.s
    @dl.d
    public List<kotlin.reflect.r> getUpperBounds() {
        T tB = this.f125262c.b(this, f125260e[0]);
        f0.o(tB, "<get-upperBounds>(...)");
        return (List) tB;
    }

    public int hashCode() {
        return (this.f125263d.hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.s
    public boolean k() {
        return a().k();
    }

    @Override // kotlin.reflect.s
    @dl.d
    public KVariance n() {
        int i10 = a.f125264a[a().n().ordinal()];
        if (i10 == 1) {
            return KVariance.INVARIANT;
        }
        if (i10 == 2) {
            return KVariance.IN;
        }
        if (i10 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public String toString() {
        return x0.f124989g.a(this);
    }
}
