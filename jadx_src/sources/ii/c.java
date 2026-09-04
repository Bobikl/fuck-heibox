package ii;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f119375a = new c();

    private c() {
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.f a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            f0.o(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            kotlin.reflect.jvm.internal.impl.name.b bVarA = ReflectClassUtilKt.a(cls);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
            kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarA.b();
            f0.o(cVarB, "javaClassId.asSingleFqName()");
            kotlin.reflect.jvm.internal.impl.name.b bVarM = cVar.m(cVarB);
            if (bVarM != null) {
                bVarA = bVarM;
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(bVarA, i10);
        }
        if (f0.g(cls, Void.TYPE)) {
            kotlin.reflect.jvm.internal.impl.name.b bVarM2 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.f125428f.l());
            f0.o(bVarM2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(bVarM2, i10);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        f0.o(primitiveType, "get(currentClass.name).primitiveType");
        if (i10 > 0) {
            kotlin.reflect.jvm.internal.impl.name.b bVarM3 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getArrayTypeFqName());
            f0.o(bVarM3, "topLevel(primitiveType.arrayTypeFqName)");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(bVarM3, i10 - 1);
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarM4 = kotlin.reflect.jvm.internal.impl.name.b.m(primitiveType.getTypeFqName());
        f0.o(bVarM4, "topLevel(primitiveType.typeFqName)");
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(bVarM4, i10);
    }

    private final void c(Class<?> cls, o.d dVar) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i10;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        f0.o(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length) {
            Constructor<?> constructor = declaredConstructors[i11];
            kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.name.h.f127218j;
            m mVar = m.f119389a;
            f0.o(constructor, "constructor");
            o.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA == null) {
                constructorArr = declaredConstructors;
                i10 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                f0.o(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    f0.o(annotation, "annotation");
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                f0.o(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        Annotation[] annotations = parameterAnnotations[i12];
                        f0.o(annotations, "annotations");
                        int length4 = annotations.length;
                        int i13 = 0;
                        while (i13 < length4) {
                            Annotation annotation2 = annotations[i13];
                            Class<?> clsE = xh.a.e(xh.a.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i14 = length;
                            kotlin.reflect.jvm.internal.impl.name.b bVarA = ReflectClassUtilKt.a(clsE);
                            int i15 = length2;
                            f0.o(annotation2, "annotation");
                            o.a aVarA = eVarA.a(i12 + length2, bVarA, new b(annotation2));
                            if (aVarA != null) {
                                f119375a.h(aVarA, annotation2, clsE);
                            }
                            i13++;
                            declaredConstructors = constructorArr2;
                            length = i14;
                            length2 = i15;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                eVarA.visitEnd();
            }
            i11++;
            declaredConstructors = constructorArr;
            length = i10;
        }
    }

    private final void d(Class<?> cls, o.d dVar) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        f0.o(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(field.getName());
            f0.o(fVarF, "identifier(field.name)");
            m mVar = m.f119389a;
            f0.o(field, "field");
            o.c cVarB = dVar.b(fVarF, mVar.b(field), null);
            if (cVarB != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                f0.o(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    f0.o(annotation, "annotation");
                    f(cVarB, annotation);
                }
                cVarB.visitEnd();
            }
        }
    }

    private final void e(Class<?> cls, o.d dVar) throws InvocationTargetException {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        f0.o(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(method.getName());
            f0.o(fVarF, "identifier(method.name)");
            m mVar = m.f119389a;
            f0.o(method, "method");
            o.e eVarA = dVar.a(fVarF, mVar.c(method));
            if (eVarA == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                f0.o(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    f0.o(annotation, "annotation");
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                f0.o(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    Annotation[] annotations = annotationArr[i11];
                    f0.o(annotations, "annotations");
                    int length3 = annotations.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        Annotation annotation2 = annotations[i12];
                        Class<?> clsE = xh.a.e(xh.a.a(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.b bVarA = ReflectClassUtilKt.a(clsE);
                        Method[] methodArr2 = declaredMethods;
                        f0.o(annotation2, "annotation");
                        o.a aVarA = eVarA.a(i11, bVarA, new b(annotation2));
                        if (aVarA != null) {
                            f119375a.h(aVarA, annotation2, clsE);
                        }
                        i12++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                eVarA.visitEnd();
            }
            i10++;
            declaredMethods = methodArr;
        }
    }

    private final void f(o.c cVar, Annotation annotation) throws InvocationTargetException {
        Class<?> clsE = xh.a.e(xh.a.a(annotation));
        o.a aVarB = cVar.b(ReflectClassUtilKt.a(clsE), new b(annotation));
        if (aVarB != null) {
            f119375a.h(aVarB, annotation, clsE);
        }
    }

    private final void g(o.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (f0.g(enclosingClass, Class.class)) {
            f0.n(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.c(fVar, a((Class) obj));
            return;
        }
        if (i.f119382a.contains(enclosingClass)) {
            aVar.d(fVar, obj);
            return;
        }
        if (ReflectClassUtilKt.h(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            f0.o(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            kotlin.reflect.jvm.internal.impl.name.b bVarA = ReflectClassUtilKt.a(enclosingClass);
            f0.n(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(((Enum) obj).name());
            f0.o(fVarF, "identifier((value as Enum<*>).name)");
            aVar.a(fVar, bVarA, fVarF);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            f0.o(interfaces, "clazz.interfaces");
            Class<?> annotationClass = (Class) ArraysKt___ArraysKt.Ht(interfaces);
            f0.o(annotationClass, "annotationClass");
            o.a aVarB = aVar.b(fVar, ReflectClassUtilKt.a(annotationClass));
            if (aVarB == null) {
                return;
            }
            f0.n(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarB, (Annotation) obj, annotationClass);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        o.b bVarE = aVar.e(fVar);
        if (bVarE == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            f0.o(componentType, "componentType");
            kotlin.reflect.jvm.internal.impl.name.b bVarA2 = ReflectClassUtilKt.a(componentType);
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                f0.n(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                kotlin.reflect.jvm.internal.impl.name.f fVarF2 = kotlin.reflect.jvm.internal.impl.name.f.f(((Enum) obj2).name());
                f0.o(fVarF2, "identifier((element as Enum<*>).name)");
                bVarE.c(bVarA2, fVarF2);
                i10++;
            }
        } else if (f0.g(componentType, Class.class)) {
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                f0.n(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarE.d(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                f0.o(componentType, "componentType");
                o.a aVarB2 = bVarE.b(ReflectClassUtilKt.a(componentType));
                if (aVarB2 != null) {
                    f0.n(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarB2, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarE.a(objArr4[i10]);
                i10++;
            }
        }
        bVarE.visitEnd();
    }

    private final void h(o.a aVar, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        f0.o(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                f0.m(objInvoke);
                kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(method.getName());
                f0.o(fVarF, "identifier(method.name)");
                g(aVar, fVarF, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.visitEnd();
    }

    public final void b(@dl.d Class<?> klass, @dl.d o.c visitor) throws InvocationTargetException {
        f0.p(klass, "klass");
        f0.p(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        f0.o(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            f0.o(annotation, "annotation");
            f(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void i(@dl.d Class<?> klass, @dl.d o.d memberVisitor) throws InvocationTargetException {
        f0.p(klass, "klass");
        f0.p(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
