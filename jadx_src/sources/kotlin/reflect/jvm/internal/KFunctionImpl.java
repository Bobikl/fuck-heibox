package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: KFunctionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements b0<Object>, kotlin.reflect.i<Object>, g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125166l = {n0.u(new PropertyReference1Impl(n0.d(KFunctionImpl.class), org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), n0.u(new PropertyReference1Impl(n0.d(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final KDeclarationContainerImpl f125167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f125168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final Object f125169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final n.a f125170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final n.b f125171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final n.b f125172k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        this(container, name, signature, null, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, w wVar, Object obj) {
        this.f125167f = kDeclarationContainerImpl;
        this.f125168g = str2;
        this.f125169h = obj;
        this.f125170i = n.c(wVar, new yh.a<w>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w invoke() {
                return this.f125175b.w().I(str, this.f125175b.f125168g);
            }
        });
        this.f125171j = n.b(new yh.a<kotlin.reflect.jvm.internal.calls.c<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.c<Executable> invoke() {
                Object objB;
                kotlin.reflect.jvm.internal.calls.c cVarS;
                JvmFunctionSignature jvmFunctionSignatureG = p.f128319a.g(this.f125173b.H());
                if (jvmFunctionSignatureG instanceof JvmFunctionSignature.b) {
                    if (this.f125173b.I()) {
                        Class<?> clsI = this.f125173b.w().i();
                        List<KParameter> parameters = this.f125173b.getParameters();
                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            f0.m(name);
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(clsI, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    objB = this.f125173b.w().w(((JvmFunctionSignature.b) jvmFunctionSignatureG).b());
                } else if (jvmFunctionSignatureG instanceof JvmFunctionSignature.c) {
                    JvmFunctionSignature.c cVar = (JvmFunctionSignature.c) jvmFunctionSignatureG;
                    objB = this.f125173b.w().J(cVar.c(), cVar.b());
                } else if (jvmFunctionSignatureG instanceof JvmFunctionSignature.a) {
                    objB = ((JvmFunctionSignature.a) jvmFunctionSignatureG).b();
                } else {
                    if (!(jvmFunctionSignatureG instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureG instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<Method> listB = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureG).b();
                        Class<?> clsI2 = this.f125173b.w().i();
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(listB, 10));
                        Iterator<T> it2 = listB.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(clsI2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, listB);
                    }
                    objB = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureG).b();
                }
                if (objB instanceof Constructor) {
                    KFunctionImpl kFunctionImpl = this.f125173b;
                    cVarS = kFunctionImpl.Q((Constructor) objB, kFunctionImpl.H(), false);
                } else {
                    if (!(objB instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + this.f125173b.H() + " (member = " + objB + ')');
                    }
                    Method method = (Method) objB;
                    if (Modifier.isStatic(method.getModifiers())) {
                        cVarS = this.f125173b.H().getAnnotations().k(s.j()) != null ? this.f125173b.S(method) : this.f125173b.T(method);
                    } else {
                        cVarS = this.f125173b.R(method);
                    }
                }
                return kotlin.reflect.jvm.internal.calls.g.c(cVarS, this.f125173b.H(), false, 2, null);
            }
        });
        this.f125172k = n.b(new yh.a<kotlin.reflect.jvm.internal.calls.c<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:35:0x012a  */
            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.c<Executable> invoke() {
                GenericDeclaration genericDeclarationG;
                kotlin.reflect.jvm.internal.calls.c cVarT;
                JvmFunctionSignature jvmFunctionSignatureG = p.f128319a.g(this.f125174b.H());
                if (jvmFunctionSignatureG instanceof JvmFunctionSignature.c) {
                    KDeclarationContainerImpl kDeclarationContainerImplW = this.f125174b.w();
                    JvmFunctionSignature.c cVar = (JvmFunctionSignature.c) jvmFunctionSignatureG;
                    String strC = cVar.c();
                    String strB = cVar.b();
                    Member memberD = this.f125174b.r().d();
                    f0.m(memberD);
                    genericDeclarationG = kDeclarationContainerImplW.H(strC, strB, !Modifier.isStatic(memberD.getModifiers()));
                } else if (jvmFunctionSignatureG instanceof JvmFunctionSignature.b) {
                    if (this.f125174b.I()) {
                        Class<?> clsI = this.f125174b.w().i();
                        List<KParameter> parameters = this.f125174b.getParameters();
                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            f0.m(name);
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(clsI, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    genericDeclarationG = this.f125174b.w().G(((JvmFunctionSignature.b) jvmFunctionSignatureG).b());
                } else {
                    if (jvmFunctionSignatureG instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                        List<Method> listB = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureG).b();
                        Class<?> clsI2 = this.f125174b.w().i();
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(listB, 10));
                        Iterator<T> it2 = listB.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(clsI2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, listB);
                    }
                    genericDeclarationG = null;
                }
                if (genericDeclarationG instanceof Constructor) {
                    KFunctionImpl kFunctionImpl = this.f125174b;
                    cVarT = kFunctionImpl.Q((Constructor) genericDeclarationG, kFunctionImpl.H(), true);
                } else if (!(genericDeclarationG instanceof Method)) {
                    cVarT = null;
                } else if (this.f125174b.H().getAnnotations().k(s.j()) != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = this.f125174b.H().c();
                    f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC).r0()) {
                        cVarT = this.f125174b.T((Method) genericDeclarationG);
                    } else {
                        cVarT = this.f125174b.S((Method) genericDeclarationG);
                    }
                } else {
                    cVarT = this.f125174b.T((Method) genericDeclarationG);
                }
                if (cVarT != null) {
                    return kotlin.reflect.jvm.internal.calls.g.b(cVarT, this.f125174b.H(), true);
                }
                return null;
            }
        });
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, w wVar, Object obj, int i10, u uVar) {
        this(kDeclarationContainerImpl, str, str2, wVar, (i10 & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(@dl.d KDeclarationContainerImpl container, @dl.d w descriptor) {
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        f0.o(strB, "descriptor.name.asString()");
        this(container, strB, p.f128319a.g(descriptor).a(), descriptor, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.d<Constructor<?>> Q(Constructor<?> constructor, w wVar, boolean z10) {
        if (z10 || !kotlin.reflect.jvm.internal.impl.resolve.jvm.b.f(wVar)) {
            return J() ? new kotlin.reflect.jvm.internal.calls.d.c(constructor, V()) : new kotlin.reflect.jvm.internal.calls.d.e(constructor);
        }
        return J() ? new kotlin.reflect.jvm.internal.calls.d.a(constructor, V()) : new kotlin.reflect.jvm.internal.calls.d.b(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.d.h R(Method method) {
        return J() ? new kotlin.reflect.jvm.internal.calls.d.h.a(method, V()) : new kotlin.reflect.jvm.internal.calls.d.h.C1137d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.d.h S(Method method) {
        return J() ? new kotlin.reflect.jvm.internal.calls.d.h.b(method) : new kotlin.reflect.jvm.internal.calls.d.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.d.h T(Method method) {
        return J() ? new kotlin.reflect.jvm.internal.calls.d.h.c(method, V()) : new kotlin.reflect.jvm.internal.calls.d.h.f(method);
    }

    private final Object V() {
        return kotlin.reflect.jvm.internal.calls.g.a(this.f125169h, H());
    }

    @Override // yh.d
    @dl.e
    public Object A0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12) {
        return g.a.m(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.reflect.i
    public boolean B() {
        return H().B();
    }

    @Override // yh.k
    @dl.e
    public Object B0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17, @dl.e Object obj18, @dl.e Object obj19) {
        return g.a.t(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // yh.h
    @dl.e
    public Object C0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16) {
        return g.a.q(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.e
    public kotlin.reflect.jvm.internal.calls.c<?> G() {
        return (kotlin.reflect.jvm.internal.calls.c) this.f125172k.b(this, f125166l[2]);
    }

    @Override // yh.w
    @dl.e
    public Object H1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9) {
        return g.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean J() {
        return !f0.g(this.f125169h, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.i
    public boolean K() {
        return H().K();
    }

    @Override // yh.b
    @dl.e
    public Object L1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10) {
        return g.a.k(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // yh.s
    @dl.e
    public Object N0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5) {
        return g.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // yh.n
    @dl.e
    public Object O0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17, @dl.e Object obj18, @dl.e Object obj19, @dl.e Object obj20, @dl.e Object obj21) {
        return g.a.v(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.reflect.i
    public boolean U() {
        return H().U();
    }

    @Override // yh.r
    @dl.e
    public Object U0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4) {
        return g.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // yh.v
    @dl.e
    public Object V0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8) {
        return g.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public w L() {
        T tB = this.f125170i.b(this, f125166l[0]);
        f0.o(tB, "<get-descriptor>(...)");
        return (w) tB;
    }

    @Override // yh.o
    @dl.e
    public Object X0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17, @dl.e Object obj18, @dl.e Object obj19, @dl.e Object obj20, @dl.e Object obj21, @dl.e Object obj22) {
        return g.a.w(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // yh.t
    @dl.e
    public Object Z0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6) {
        return g.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // yh.f
    @dl.e
    public Object a1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14) {
        return g.a.o(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // yh.i
    @dl.e
    public Object b1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17) {
        return g.a.r(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // yh.c
    @dl.e
    public Object d0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11) {
        return g.a.l(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public boolean equals(@dl.e Object obj) {
        KFunctionImpl kFunctionImplC = s.c(obj);
        return kFunctionImplC != null && f0.g(w(), kFunctionImplC.w()) && f0.g(getName(), kFunctionImplC.getName()) && f0.g(this.f125168g, kFunctionImplC.f125168g) && f0.g(this.f125169h, kFunctionImplC.f125169h);
    }

    @Override // kotlin.reflect.i
    public boolean g() {
        return H().g();
    }

    @Override // yh.u
    @dl.e
    public Object g1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7) {
        return g.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.internal.b0
    public int getArity() {
        return kotlin.reflect.jvm.internal.calls.e.a(r());
    }

    @Override // kotlin.reflect.c
    @dl.d
    public String getName() {
        String strB = H().getName().b();
        f0.o(strB, "descriptor.name.asString()");
        return strB;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f125168g.hashCode();
    }

    @Override // yh.a
    @dl.e
    public Object invoke() {
        return g.a.a(this);
    }

    @Override // yh.l
    @dl.e
    public Object invoke(@dl.e Object obj) {
        return g.a.b(this, obj);
    }

    @Override // yh.p
    @dl.e
    public Object invoke(@dl.e Object obj, @dl.e Object obj2) {
        return g.a.c(this, obj, obj2);
    }

    @Override // yh.q
    @dl.e
    public Object invoke(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3) {
        return g.a.d(this, obj, obj2, obj3);
    }

    @Override // kotlin.reflect.c
    public boolean isSuspend() {
        return H().isSuspend();
    }

    @Override // yh.m
    @dl.e
    public Object l0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17, @dl.e Object obj18, @dl.e Object obj19, @dl.e Object obj20) {
        return g.a.u(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // yh.g
    @dl.e
    public Object m1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15) {
        return g.a.p(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // yh.e
    @dl.e
    public Object n0(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13) {
        return g.a.n(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    public kotlin.reflect.jvm.internal.calls.c<?> r() {
        T tB = this.f125171j.b(this, f125166l[1]);
        f0.o(tB, "<get-caller>(...)");
        return (kotlin.reflect.jvm.internal.calls.c) tB;
    }

    @Override // yh.j
    @dl.e
    public Object t1(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.e Object obj4, @dl.e Object obj5, @dl.e Object obj6, @dl.e Object obj7, @dl.e Object obj8, @dl.e Object obj9, @dl.e Object obj10, @dl.e Object obj11, @dl.e Object obj12, @dl.e Object obj13, @dl.e Object obj14, @dl.e Object obj15, @dl.e Object obj16, @dl.e Object obj17, @dl.e Object obj18) {
        return g.a.s(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @dl.d
    public String toString() {
        return ReflectionObjectRenderer.f125266a.d(H());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @dl.d
    public KDeclarationContainerImpl w() {
        return this.f125167f;
    }
}
