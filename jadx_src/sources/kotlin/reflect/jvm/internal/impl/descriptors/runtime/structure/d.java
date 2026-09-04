package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends n implements mi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Annotation f125913a;

    public d(@dl.d Annotation annotation) {
        f0.p(annotation, "annotation");
        this.f125913a = annotation;
    }

    @Override // mi.a
    public boolean C() {
        return false;
    }

    @dl.d
    public final Annotation P() {
        return this.f125913a;
    }

    @Override // mi.a
    @dl.d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass M() {
        return new ReflectJavaClass(xh.a.e(xh.a.a(this.f125913a)));
    }

    @Override // mi.a
    @dl.d
    public Collection<mi.b> d() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = xh.a.e(xh.a.a(this.f125913a)).getDeclaredMethods();
        f0.o(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            e.a aVar = e.f125914b;
            Object objInvoke = method.invoke(this.f125913a, new Object[0]);
            f0.o(objInvoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(objInvoke, kotlin.reflect.jvm.internal.impl.name.f.f(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof d) && this.f125913a == ((d) obj).f125913a;
    }

    @Override // mi.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.b f() {
        return ReflectClassUtilKt.a(xh.a.e(xh.a.a(this.f125913a)));
    }

    @Override // mi.a
    public boolean g() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f125913a);
    }

    @dl.d
    public String toString() {
        return d.class.getName() + ": " + this.f125913a;
    }
}
