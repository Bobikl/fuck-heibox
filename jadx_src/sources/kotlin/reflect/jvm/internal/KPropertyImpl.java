package kotlin.reflect.jvm.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.y;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements kotlin.reflect.n<V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final b f125227l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final Object f125228m = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final KDeclarationContainerImpl f125229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f125230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final String f125231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private final Object f125232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final n.b<Field> f125233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final n.a<o0> f125234k;

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static abstract class Getter<V> extends a<V, V> implements kotlin.reflect.n.c<V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.n<Object>[] f125235h = {n0.u(new PropertyReference1Impl(n0.d(Getter.class), org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final n.a f125236f = n.d(new yh.a<p0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl.Getter<V> f125239b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125239b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p0 invoke() {
                p0 getter = this.f125239b.M().L().getGetter();
                return getter == null ? kotlin.reflect.jvm.internal.impl.resolve.c.d(this.f125239b.M().L(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()) : getter;
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final n.b f125237g = n.b(new yh.a<kotlin.reflect.jvm.internal.calls.c<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl.Getter<V> f125238b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125238b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.c<?> invoke() {
                return k.b(this.f125238b, true);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        @dl.d
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public p0 L() {
            T tB = this.f125236f.b(this, f125235h[0]);
            f0.o(tB, "<get-descriptor>(...)");
            return (p0) tB;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof Getter) && f0.g(M(), ((Getter) obj).M());
        }

        @Override // kotlin.reflect.c
        @dl.d
        public String getName() {
            return "<get-" + M().getName() + y.f128597f;
        }

        public int hashCode() {
            return M().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @dl.d
        public kotlin.reflect.jvm.internal.calls.c<?> r() {
            T tB = this.f125237g.b(this, f125235h[1]);
            f0.o(tB, "<get-caller>(...)");
            return (kotlin.reflect.jvm.internal.calls.c) tB;
        }

        @dl.d
        public String toString() {
            return "getter of " + M();
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static abstract class Setter<V> extends a<V, b2> implements kotlin.reflect.j.a<V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.n<Object>[] f125240h = {n0.u(new PropertyReference1Impl(n0.d(Setter.class), org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final n.a f125241f = n.d(new yh.a<q0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl.Setter<V> f125244b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125244b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q0 invoke() {
                q0 setter = this.f125244b.M().L().getSetter();
                if (setter != null) {
                    return setter;
                }
                o0 o0VarL = this.f125244b.M().L();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1;
                return kotlin.reflect.jvm.internal.impl.resolve.c.e(o0VarL, aVar.b(), aVar.b());
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final n.b f125242g = n.b(new yh.a<kotlin.reflect.jvm.internal.calls.c<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl.Setter<V> f125243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125243b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.c<?> invoke() {
                return k.b(this.f125243b, false);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        @dl.d
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public q0 L() {
            T tB = this.f125241f.b(this, f125240h[0]);
            f0.o(tB, "<get-descriptor>(...)");
            return (q0) tB;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof Setter) && f0.g(M(), ((Setter) obj).M());
        }

        @Override // kotlin.reflect.c
        @dl.d
        public String getName() {
            return "<set-" + M().getName() + y.f128597f;
        }

        public int hashCode() {
            return M().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @dl.d
        public kotlin.reflect.jvm.internal.calls.c<?> r() {
            T tB = this.f125242g.b(this, f125240h[1]);
            f0.o(tB, "<get-caller>(...)");
            return (kotlin.reflect.jvm.internal.calls.c) tB;
        }

        @dl.d
        public String toString() {
            return "setter of " + M();
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static abstract class a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements kotlin.reflect.i<ReturnType>, kotlin.reflect.n.a<PropertyType> {
        @Override // kotlin.reflect.i
        public boolean B() {
            return L().B();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @dl.e
        public kotlin.reflect.jvm.internal.calls.c<?> G() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public boolean J() {
            return M().J();
        }

        @Override // kotlin.reflect.i
        public boolean K() {
            return L().K();
        }

        @dl.d
        public abstract kotlin.reflect.jvm.internal.impl.descriptors.n0 L();

        @dl.d
        public abstract KPropertyImpl<PropertyType> M();

        @Override // kotlin.reflect.i
        public boolean U() {
            return L().U();
        }

        @Override // kotlin.reflect.i
        public boolean g() {
            return L().g();
        }

        @Override // kotlin.reflect.c
        public boolean isSuspend() {
            return L().isSuspend();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @dl.d
        public KDeclarationContainerImpl w() {
            return M().w();
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        public final Object a() {
            return KPropertyImpl.f125228m;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        this(container, name, signature, null, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, o0 o0Var, Object obj) {
        this.f125229f = kDeclarationContainerImpl;
        this.f125230g = str;
        this.f125231h = str2;
        this.f125232i = obj;
        n.b<Field> bVarB = n.b(new yh.a<Field>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl<V> f125246b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125246b = this;
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Field invoke() {
                Class<?> enclosingClass;
                h hVarF = p.f128319a.f(this.f125246b.L());
                if (!(hVarF instanceof h.c)) {
                    if (hVarF instanceof h.a) {
                        return ((h.a) hVarF).b();
                    }
                    if ((hVarF instanceof h.b) || (hVarF instanceof h.d)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                h.c cVar = (h.c) hVarF;
                o0 o0VarB = cVar.b();
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a aVarD = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
                if (aVarD == null) {
                    return null;
                }
                KCallableImpl kCallableImpl = this.f125246b;
                if (kotlin.reflect.jvm.internal.impl.load.java.f.e(o0VarB) || kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(cVar.e())) {
                    enclosingClass = kCallableImpl.w().i().getEnclosingClass();
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = o0VarB.c();
                    enclosingClass = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? s.p((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC) : kCallableImpl.w().i();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(aVarD.c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            }
        });
        f0.o(bVarB, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f125233j = bVarB;
        n.a<o0> aVarC = n.c(o0Var, new yh.a<o0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KPropertyImpl<V> f125245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125245b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o0 invoke() {
                return this.f125245b.w().L(this.f125245b.getName(), this.f125245b.S());
            }
        });
        f0.o(aVarC, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f125234k = aVarC;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        f0.o(strB, "descriptor.name.asString()");
        this(container, strB, p.f128319a.f(descriptor).a(), descriptor, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.e
    public kotlin.reflect.jvm.internal.calls.c<?> G() {
        return Q().G();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean J() {
        return !f0.g(this.f125232i, CallableReference.NO_RECEIVER);
    }

    @dl.e
    protected final Member M() {
        if (!L().d0()) {
            return null;
        }
        h hVarF = p.f128319a.f(L());
        if (hVarF instanceof h.c) {
            h.c cVar = (h.c) hVarF;
            if (cVar.f().F()) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignatureA = cVar.f().A();
                if (!jvmMethodSignatureA.A() || !jvmMethodSignatureA.z()) {
                    return null;
                }
                return w().J(cVar.d().getString(jvmMethodSignatureA.y()), cVar.d().getString(jvmMethodSignatureA.x()));
            }
        }
        return R();
    }

    @dl.e
    public final Object N() {
        return kotlin.reflect.jvm.internal.calls.g.a(this.f125232i, L());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    protected final Object O(@dl.e Member member, @dl.e Object obj, @dl.e Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj3 = f125228m;
            if ((obj == obj3 || obj2 == obj3) && L().l0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objN = J() ? N() : obj;
            if (!(objN != obj3)) {
                objN = null;
            }
            if (!J()) {
                obj = obj2;
            }
            if (!(obj != obj3)) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(kotlin.reflect.jvm.b.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objN);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                Object[] objArr = new Object[1];
                if (objN == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    f0.o(cls, "fieldOrMethod.parameterTypes[0]");
                    objN = s.g(cls);
                }
                objArr[0] = objN;
                return method.invoke(null, objArr);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            Object[] objArr2 = new Object[2];
            objArr2[0] = objN;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                f0.o(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = s.g(cls2);
            }
            objArr2[1] = obj;
            return method2.invoke(null, objArr2);
        } catch (IllegalAccessException e10) {
            throw new IllegalPropertyDelegateAccessException(e10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public o0 L() {
        o0 o0VarInvoke = this.f125234k.invoke();
        f0.o(o0VarInvoke, "_descriptor()");
        return o0VarInvoke;
    }

    @dl.d
    public abstract Getter<V> Q();

    @dl.e
    public final Field R() {
        return this.f125233j.invoke();
    }

    @dl.d
    public final String S() {
        return this.f125231h;
    }

    public boolean equals(@dl.e Object obj) {
        KPropertyImpl<?> kPropertyImplD = s.d(obj);
        return kPropertyImplD != null && f0.g(w(), kPropertyImplD.w()) && f0.g(getName(), kPropertyImplD.getName()) && f0.g(this.f125231h, kPropertyImplD.f125231h) && f0.g(this.f125232i, kPropertyImplD.f125232i);
    }

    @Override // kotlin.reflect.c
    @dl.d
    public String getName() {
        return this.f125230g;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f125231h.hashCode();
    }

    @Override // kotlin.reflect.n
    public boolean isConst() {
        return L().isConst();
    }

    @Override // kotlin.reflect.n
    public boolean isLateinit() {
        return L().H0();
    }

    @Override // kotlin.reflect.c
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    public kotlin.reflect.jvm.internal.calls.c<?> r() {
        return Q().r();
    }

    @dl.d
    public String toString() {
        return ReflectionObjectRenderer.f125266a.g(L());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    public KDeclarationContainerImpl w() {
        return this.f125229f;
    }
}
