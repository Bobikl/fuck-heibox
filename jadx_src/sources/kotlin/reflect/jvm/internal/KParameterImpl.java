package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: KParameterImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KParameterImpl implements KParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125204g = {n0.u(new PropertyReference1Impl(n0.d(KParameterImpl.class), org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final KCallableImpl<?> f125205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final KParameter.Kind f125207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final n.a f125208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final n.a f125209f;

    public KParameterImpl(@dl.d KCallableImpl<?> callable, int i10, @dl.d KParameter.Kind kind, @dl.d yh.a<? extends l0> computeDescriptor) {
        f0.p(callable, "callable");
        f0.p(kind, "kind");
        f0.p(computeDescriptor, "computeDescriptor");
        this.f125205b = callable;
        this.f125206c = i10;
        this.f125207d = kind;
        this.f125208e = n.d(computeDescriptor);
        this.f125209f = n.d(new yh.a<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // yh.a
            public final List<? extends Annotation> invoke() {
                return s.e(this.f125210b.j());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 j() {
        T tB = this.f125208e.b(this, f125204g[0]);
        f0.o(tB, "<get-descriptor>(...)");
        return (l0) tB;
    }

    @Override // kotlin.reflect.KParameter
    @dl.d
    public KParameter.Kind b() {
        return this.f125207d;
    }

    @Override // kotlin.reflect.KParameter
    public boolean c() {
        l0 l0VarJ = j();
        return (l0VarJ instanceof b1) && ((b1) l0VarJ).F0() != null;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (f0.g(this.f125205b, kParameterImpl.f125205b) && getIndex() == kParameterImpl.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public boolean f() {
        l0 l0VarJ = j();
        b1 b1Var = l0VarJ instanceof b1 ? (b1) l0VarJ : null;
        if (b1Var != null) {
            return DescriptorUtilsKt.c(b1Var);
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        T tB = this.f125209f.b(this, f125204g[1]);
        f0.o(tB, "<get-annotations>(...)");
        return (List) tB;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.f125206c;
    }

    @Override // kotlin.reflect.KParameter
    @dl.e
    public String getName() {
        l0 l0VarJ = j();
        b1 b1Var = l0VarJ instanceof b1 ? (b1) l0VarJ : null;
        if (b1Var == null || b1Var.c().t0()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = b1Var.getName();
        f0.o(name, "valueParameter.name");
        if (name.g()) {
            return null;
        }
        return name.b();
    }

    @Override // kotlin.reflect.KParameter
    @dl.d
    public kotlin.reflect.r getType() {
        d0 type = j().getType();
        f0.o(type, "descriptor.type");
        return new KTypeImpl(type, new yh.a<Type>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$type$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                l0 l0VarJ = this.f125211b.j();
                if (!(l0VarJ instanceof r0) || !f0.g(s.i(this.f125211b.i().L()), l0VarJ) || this.f125211b.i().L().b() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    return this.f125211b.i().r().c().get(this.f125211b.getIndex());
                }
                kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = this.f125211b.i().L().c();
                f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> clsP = s.p((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC);
                if (clsP != null) {
                    return clsP;
                }
                throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + l0VarJ);
            }
        });
    }

    public int hashCode() {
        return (this.f125205b.hashCode() * 31) + getIndex();
    }

    @dl.d
    public final KCallableImpl<?> i() {
        return this.f125205b;
    }

    @dl.d
    public String toString() {
        return ReflectionObjectRenderer.f125266a.f(this);
    }
}
