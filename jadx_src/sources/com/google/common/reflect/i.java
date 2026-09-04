package com.google.common.reflect;

import com.google.common.base.w;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.b3;
import com.google.common.collect.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Parameter.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@d
public final class i implements AnnotatedElement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f<?, ?> f59144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeToken<?> f59146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableList<Annotation> f59147e;

    i(f<?, ?> fVar, int i10, TypeToken<?> typeToken, Annotation[] annotationArr) {
        this.f59144b = fVar;
        this.f59145c = i10;
        this.f59146d = typeToken;
        this.f59147e = ImmutableList.x(annotationArr);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f59145c == iVar.f59145c && this.f59144b.equals(iVar.f59144b);
    }

    public f<?, ?> g0() {
        return this.f59144b;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        w.E(cls);
        b3<Annotation> it = this.f59147e.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        w.E(cls);
        return (A) f0.y(this.f59147e).u(cls).v().j();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f59147e.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) f0.y(this.f59147e).u(cls).L(cls));
    }

    public TypeToken<?> h0() {
        return this.f59146d;
    }

    public int hashCode() {
        return this.f59145c;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f59146d);
        int i10 = this.f59145c;
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 15);
        sb2.append(strValueOf);
        sb2.append(" arg");
        sb2.append(i10);
        return sb2.toString();
    }
}
