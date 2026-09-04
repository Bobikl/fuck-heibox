package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import mi.b0;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r extends n implements g, t, mi.q {
    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.q
    @dl.d
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass H() {
        Class<?> declaringClass = Q().getDeclaringClass();
        f0.o(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    @dl.d
    public abstract Member Q();

    @dl.d
    protected final List<b0> R(@dl.d Type[] parameterTypes, @dl.d Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        f0.p(parameterTypes, "parameterTypes");
        f0.p(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> listB = c.f125909a.b(Q());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            x xVarA = x.f125935a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) CollectionsKt___CollectionsKt.R2(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + xVarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new z(xVarA, parameterAnnotations[i10], str, z10 && i10 == ArraysKt___ArraysKt.Xe(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
    @dl.d
    public AnnotatedElement a() {
        Member memberQ = Q();
        f0.n(memberQ, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberQ;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof r) && f0.g(Q(), ((r) obj).Q());
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
        return Q().getModifiers();
    }

    @Override // mi.t
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String name = Q().getName();
        kotlin.reflect.jvm.internal.impl.name.f fVarF = name != null ? kotlin.reflect.jvm.internal.impl.name.f.f(name) : null;
        return fVarF == null ? kotlin.reflect.jvm.internal.impl.name.h.f127210b : fVarF;
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
        return Q().hashCode();
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

    @Override // mi.s
    public boolean p() {
        return Modifier.isStatic(getModifiers());
    }

    @dl.d
    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
