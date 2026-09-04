package com.google.auto.common;

import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

/* JADX INFO: compiled from: SimpleTypeAnnotationValue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements AnnotationValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeMirror f56568a;

    private u0(TypeMirror typeMirror) {
        com.google.common.base.w.y(typeMirror.getKind().isPrimitive() || typeMirror.getKind().equals(TypeKind.DECLARED) || typeMirror.getKind().equals(TypeKind.ARRAY), "value must be a primitive, array, or declared type, but was %s (%s)", typeMirror.getKind(), typeMirror);
        if (typeMirror.getKind().equals(TypeKind.DECLARED)) {
            com.google.common.base.w.u(o0.g(typeMirror).getTypeArguments().isEmpty(), "value must not be a parameterized type: %s", typeMirror);
        }
        this.f56568a = typeMirror;
    }

    public static AnnotationValue d(TypeMirror typeMirror) {
        return new u0(typeMirror);
    }

    public <R, P> R a(AnnotationValueVisitor<R, P> annotationValueVisitor, P p10) {
        return (R) annotationValueVisitor.visitType(b(), p10);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TypeMirror b() {
        return this.f56568a;
    }

    public String toString() {
        return this.f56568a + ".class";
    }
}
