package com.google.auto.common;

import com.google.common.base.Equivalence;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.b3;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Map;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.util.ElementFilter;

/* JADX INFO: compiled from: AnnotationMirrors.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Equivalence<AnnotationMirror> f56490a = new C0436a();

    /* JADX INFO: renamed from: com.google.auto.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnnotationMirrors.java */
    public static final class C0436a extends Equivalence<AnnotationMirror> {
        C0436a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean a(AnnotationMirror annotationMirror, AnnotationMirror annotationMirror2) {
            return o0.w().d(annotationMirror.getAnnotationType(), annotationMirror2.getAnnotationType()) && o.b().i().d(a.e(annotationMirror).values(), a.e(annotationMirror2).values());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int b(AnnotationMirror annotationMirror) {
            return Arrays.hashCode(new int[]{o0.w().f(annotationMirror.getAnnotationType()), o.b().i().f(a.e(annotationMirror).values())});
        }

        public String toString() {
            return "AnnotationMirrors.equivalence()";
        }
    }

    /* JADX INFO: compiled from: AnnotationMirrors.java */
    public static final class b implements com.google.common.base.x<AnnotationMirror> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f56491b;

        b(Class cls) {
            this.f56491b = cls;
        }

        @Override // com.google.common.base.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(AnnotationMirror annotationMirror) {
            return n0.p(annotationMirror.getAnnotationType().asElement(), this.f56491b);
        }
    }

    private a() {
    }

    public static Equivalence<AnnotationMirror> a() {
        return f56490a;
    }

    public static ImmutableSet<? extends AnnotationMirror> b(Element element, Class<? extends Annotation> cls) {
        return com.google.common.collect.f0.y(element.getAnnotationMirrors()).t(new b(cls)).S();
    }

    public static Map.Entry<ExecutableElement, AnnotationValue> c(AnnotationMirror annotationMirror, String str) {
        com.google.common.base.w.E(annotationMirror);
        com.google.common.base.w.E(str);
        b3<Map.Entry<ExecutableElement, AnnotationValue>> it = e(annotationMirror).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ExecutableElement, AnnotationValue> next = it.next();
            if (next.getKey().getSimpleName().contentEquals(str)) {
                return next;
            }
        }
        throw new IllegalArgumentException(String.format("@%s does not define an element %s()", n0.c(annotationMirror.getAnnotationType().asElement()).getQualifiedName(), str));
    }

    public static AnnotationValue d(AnnotationMirror annotationMirror, String str) {
        return c(annotationMirror, str).getValue();
    }

    public static ImmutableMap<ExecutableElement, AnnotationValue> e(AnnotationMirror annotationMirror) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        Map elementValues = annotationMirror.getElementValues();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(annotationMirror.getAnnotationType().asElement().getEnclosedElements())) {
            if (elementValues.containsKey(executableElement)) {
                bVarB.i(executableElement, elementValues.get(executableElement));
            } else {
                if (executableElement.getDefaultValue() == null) {
                    throw new IllegalStateException("Unset annotation value without default should never happen: " + n0.c(executableElement.getEnclosingElement()).getQualifiedName() + lg.a.f131414g + executableElement.getSimpleName() + "()");
                }
                bVarB.i(executableElement, executableElement.getDefaultValue());
            }
        }
        return bVarB.a();
    }
}
