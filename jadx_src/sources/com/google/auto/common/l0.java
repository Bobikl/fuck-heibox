package com.google.auto.common;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import java.util.Optional;
import java.util.function.Function;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/* JADX INFO: compiled from: GeneratedAnnotationSpecs.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {
    private l0() {
    }

    @Deprecated
    public static Optional<AnnotationSpec> f(Elements elements, Class<?> cls) {
        return j(elements, cls).map(new k0());
    }

    @Deprecated
    public static Optional<AnnotationSpec> g(Elements elements, Class<?> cls, final String str) {
        return j(elements, cls).map(new Function() { // from class: com.google.auto.common.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l0.l(str, (AnnotationSpec.Builder) obj);
            }
        });
    }

    public static Optional<AnnotationSpec> h(Elements elements, SourceVersion sourceVersion, Class<?> cls) {
        return k(elements, sourceVersion, cls).map(new k0());
    }

    public static Optional<AnnotationSpec> i(Elements elements, SourceVersion sourceVersion, Class<?> cls, final String str) {
        return k(elements, sourceVersion, cls).map(new Function() { // from class: com.google.auto.common.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l0.m(str, (AnnotationSpec.Builder) obj);
            }
        });
    }

    private static Optional<AnnotationSpec.Builder> j(Elements elements, final Class<?> cls) {
        return m0.a(elements).map(new Function() { // from class: com.google.auto.common.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l0.n(cls, (TypeElement) obj);
            }
        });
    }

    private static Optional<AnnotationSpec.Builder> k(Elements elements, SourceVersion sourceVersion, final Class<?> cls) {
        return m0.b(elements, sourceVersion).map(new Function() { // from class: com.google.auto.common.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l0.o(cls, (TypeElement) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec l(String str, AnnotationSpec.Builder builder) {
        return builder.addMember("comments", "$S", new Object[]{str}).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec m(String str, AnnotationSpec.Builder builder) {
        return builder.addMember("comments", "$S", new Object[]{str}).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec.Builder n(Class cls, TypeElement typeElement) {
        return AnnotationSpec.builder(ClassName.get(typeElement)).addMember("value", "$S", new Object[]{cls.getCanonicalName()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec.Builder o(Class cls, TypeElement typeElement) {
        return AnnotationSpec.builder(ClassName.get(typeElement)).addMember("value", "$S", new Object[]{cls.getCanonicalName()});
    }
}
