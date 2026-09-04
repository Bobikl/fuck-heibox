package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectJavaClass extends n implements g, t, mi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Class<?> f125887a;

    public ReflectJavaClass(@dl.d Class<?> klass) {
        f0.p(klass, "klass");
        this.f125887a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W(Method method) {
        String name = method.getName();
        if (f0.g(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            f0.o(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (f0.g(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.g
    @dl.e
    public LightClassOriginKind E() {
        return null;
    }

    @Override // mi.g
    @dl.d
    public Collection<mi.w> I() {
        Object[] objArrD = b.f125903a.d(this.f125887a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new w(obj));
        }
        return arrayList;
    }

    @Override // mi.g
    public boolean J() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = b.f125903a.e(this.f125887a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // mi.g
    public boolean K() {
        return false;
    }

    @Override // mi.g
    @dl.d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List<m> h() {
        Constructor<?>[] declaredConstructors = this.f125887a.getDeclaredConstructors();
        f0.o(declaredConstructors, "klass.declaredConstructors");
        return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(SequencesKt___SequencesKt.u0(ArraysKt___ArraysKt.l6(declaredConstructors), ReflectJavaClass$constructors$1.f125888d), ReflectJavaClass$constructors$2.f125889d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
    @dl.d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Class<?> a() {
        return this.f125887a;
    }

    @Override // mi.g
    @dl.d
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<p> j() {
        Field[] declaredFields = this.f125887a.getDeclaredFields();
        f0.o(declaredFields, "klass.declaredFields");
        return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(SequencesKt___SequencesKt.u0(ArraysKt___ArraysKt.l6(declaredFields), ReflectJavaClass$fields$1.f125890d), ReflectJavaClass$fields$2.f125891d));
    }

    @Override // mi.g
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.f> y() {
        Class<?>[] declaredClasses = this.f125887a.getDeclaredClasses();
        f0.o(declaredClasses, "klass.declaredClasses");
        return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.p1(SequencesKt___SequencesKt.u0(ArraysKt___ArraysKt.l6(declaredClasses), new yh.l<Class<?>, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Class<?> cls) {
                String simpleName = cls.getSimpleName();
                f0.o(simpleName, "it.simpleName");
                return Boolean.valueOf(simpleName.length() == 0);
            }
        }), new yh.l<Class<?>, kotlin.reflect.jvm.internal.impl.name.f>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.name.f invoke(Class<?> cls) {
                String simpleName = cls.getSimpleName();
                if (!kotlin.reflect.jvm.internal.impl.name.f.h(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return kotlin.reflect.jvm.internal.impl.name.f.f(simpleName);
                }
                return null;
            }
        }));
    }

    @Override // mi.g
    @dl.d
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<s> b() {
        Method[] declaredMethods = this.f125887a.getDeclaredMethods();
        f0.o(declaredMethods, "klass.declaredMethods");
        return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(SequencesKt___SequencesKt.p0(ArraysKt___ArraysKt.l6(declaredMethods), new yh.l<Method, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:4:0x0008  */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Method method) {
                boolean z10 = true;
                if (method.isSynthetic()) {
                    z10 = false;
                } else if (this.f125894b.m()) {
                    ReflectJavaClass reflectJavaClass = this.f125894b;
                    f0.o(method, "method");
                    if (reflectJavaClass.W(method)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            }
        }), ReflectJavaClass$methods$2.f125895d));
    }

    @Override // mi.g
    @dl.e
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass q() {
        Class<?> declaringClass = this.f125887a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // mi.g
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        kotlin.reflect.jvm.internal.impl.name.c cVarB = ReflectClassUtilKt.a(this.f125887a).b();
        f0.o(cVarB, "klass.classId.asSingleFqName()");
        return cVarB;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof ReflectJavaClass) && f0.g(this.f125887a, ((ReflectJavaClass) obj).f125887a);
    }

    @Override // mi.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g, mi.d
    @dl.d
    public List<d> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<d> listB;
        AnnotatedElement annotatedElementA = a();
        return (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null || (listB = h.b(declaredAnnotations)) == null) ? CollectionsKt__CollectionsKt.E() : listB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public int getModifiers() {
        return this.f125887a.getModifiers();
    }

    @Override // mi.t
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(this.f125887a.getSimpleName());
        f0.o(fVarF, "identifier(klass.simpleName)");
        return fVarF;
    }

    @Override // mi.z
    @dl.d
    public List<y> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f125887a.getTypeParameters();
        f0.o(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new y(typeVariable));
        }
        return arrayList;
    }

    @Override // mi.s
    @dl.d
    public g1 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return f1.h.f125624c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return f1.e.f125621c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? hi.a.c.f119183c : hi.a.b.f119182c;
        }
        return hi.a.C1084a.f119181c;
    }

    public int hashCode() {
        return this.f125887a.hashCode();
    }

    @Override // mi.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // mi.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g, mi.d
    @dl.e
    public d k(kotlin.reflect.jvm.internal.impl.name.c fqName) {
        Annotation[] declaredAnnotations;
        f0.p(fqName, "fqName");
        AnnotatedElement annotatedElementA = a();
        if (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null) {
            return null;
        }
        return h.a(declaredAnnotations, fqName);
    }

    @Override // mi.d
    public /* bridge */ /* synthetic */ mi.a k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return k(cVar);
    }

    @Override // mi.g
    @dl.d
    public Collection<mi.j> l() {
        if (f0.g(this.f125887a, Object.class)) {
            return CollectionsKt__CollectionsKt.E();
        }
        u0 u0Var = new u0(2);
        Type genericSuperclass = this.f125887a.getGenericSuperclass();
        u0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f125887a.getGenericInterfaces();
        f0.o(genericInterfaces, "klass.genericInterfaces");
        u0Var.b(genericInterfaces);
        List listL = CollectionsKt__CollectionsKt.L(u0Var.d(new Type[u0Var.c()]));
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(new l((Type) it.next()));
        }
        return arrayList;
    }

    @Override // mi.g
    public boolean m() {
        return this.f125887a.isEnum();
    }

    @Override // mi.g
    public boolean n() {
        return this.f125887a.isInterface();
    }

    @Override // mi.s
    public boolean p() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // mi.g
    public boolean s() {
        return this.f125887a.isAnnotation();
    }

    @Override // mi.g
    public boolean t() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = b.f125903a.f(this.f125887a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @dl.d
    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f125887a;
    }

    @Override // mi.g
    @dl.d
    public Collection<mi.j> z() throws IllegalAccessException, InvocationTargetException {
        Class<?>[] clsArrC = b.f125903a.c(this.f125887a);
        if (clsArrC == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(clsArrC.length);
        for (Class<?> cls : clsArrC) {
            arrayList.add(new l(cls));
        }
        return arrayList;
    }
}
