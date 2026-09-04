package com.google.auto.common;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.AbstractElementVisitor8;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.lang.model.util.SimpleTypeVisitor8;

/* JADX INFO: compiled from: SuperficialValidation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ElementVisitor<Boolean, Void> f56571a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TypeVisitor<Boolean, Void> f56572b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AnnotationValueVisitor<Boolean, TypeMirror> f56573c = new c();

    /* JADX INFO: compiled from: SuperficialValidation.java */
    public static final class a extends AbstractElementVisitor8<Boolean, Void> {
        a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(ExecutableElement executableElement, Void r10) {
            AnnotationValue defaultValue = executableElement.getDefaultValue();
            return Boolean.valueOf(y0.g(executableElement) && (defaultValue == null || y0.j(defaultValue, executableElement.getReturnType())) && y0.o(executableElement.getReturnType()) && y0.p(executableElement.getThrownTypes()) && y0.n(executableElement.getTypeParameters()) && y0.n(executableElement.getParameters()));
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean d(PackageElement packageElement, Void r10) {
            return Boolean.valueOf(y0.l(packageElement.getAnnotationMirrors()));
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean f(TypeElement typeElement, Void r10) {
            return Boolean.valueOf(y0.g(typeElement) && y0.n(typeElement.getTypeParameters()) && y0.p(typeElement.getInterfaces()) && y0.o(typeElement.getSuperclass()));
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean h(TypeParameterElement typeParameterElement, Void r10) {
            return Boolean.valueOf(y0.g(typeParameterElement) && y0.p(typeParameterElement.getBounds()));
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean j(Element element, Void r10) {
            return Boolean.TRUE;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean l(VariableElement variableElement, Void r10) {
            return Boolean.valueOf(y0.g(variableElement));
        }
    }

    /* JADX INFO: compiled from: SuperficialValidation.java */
    public static final class b extends SimpleTypeVisitor8<Boolean, Void> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(TypeMirror typeMirror, Void r10) {
            return Boolean.TRUE;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean d(ArrayType arrayType, Void r10) {
            return Boolean.valueOf(y0.o(arrayType.getComponentType()));
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean f(DeclaredType declaredType, Void r10) {
            return Boolean.valueOf(y0.p(declaredType.getTypeArguments()));
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean h(ErrorType errorType, Void r10) {
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean j(ExecutableType executableType, Void r10) {
            return Boolean.valueOf(y0.p(executableType.getParameterTypes()) && y0.o(executableType.getReturnType()) && y0.p(executableType.getThrownTypes()) && y0.p(executableType.getTypeVariables()));
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean l(TypeMirror typeMirror, Void r10) {
            return b(typeMirror, r10);
        }

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Boolean n(WildcardType wildcardType, Void r10) {
            TypeMirror extendsBound = wildcardType.getExtendsBound();
            TypeMirror superBound = wildcardType.getSuperBound();
            return Boolean.valueOf((extendsBound == null || y0.o(extendsBound)) && (superBound == null || y0.o(superBound)));
        }
    }

    /* JADX INFO: compiled from: SuperficialValidation.java */
    public static final class c extends SimpleAnnotationValueVisitor8<Boolean, TypeMirror> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean d(TypeMirror typeMirror, AnnotationValue annotationValue) {
            return ((Boolean) annotationValue.accept(this, typeMirror)).booleanValue();
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public Boolean B(TypeMirror typeMirror, TypeMirror typeMirror2) {
            return Boolean.valueOf(y0.o(typeMirror));
        }

        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public Boolean D(AnnotationValue annotationValue, TypeMirror typeMirror) {
            return c(annotationValue, typeMirror);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean c(Object obj, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(obj.getClass(), typeMirror));
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean f(AnnotationMirror annotationMirror, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.w().d(annotationMirror.getAnnotationType(), typeMirror) && y0.i(annotationMirror));
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean h(List<? extends AnnotationValue> list, TypeMirror typeMirror) {
            if (!typeMirror.getKind().equals(TypeKind.ARRAY)) {
                return Boolean.FALSE;
            }
            final TypeMirror componentType = o0.f(typeMirror).getComponentType();
            return Boolean.valueOf(list.stream().allMatch(new Predicate() { // from class: com.google.auto.common.z0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f56574a.d(componentType, (AnnotationValue) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean j(boolean z10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Boolean.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean l(byte b10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Byte.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Boolean n(char c10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Character.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Boolean p(double d10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Double.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Boolean r(VariableElement variableElement, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.w().d(variableElement.asType(), typeMirror) && y0.m(variableElement));
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Boolean t(float f10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Float.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Boolean v(int i10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Integer.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean x(long j10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Long.TYPE, typeMirror));
        }

        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Boolean z(short s10, TypeMirror typeMirror) {
            return Boolean.valueOf(o0.C(Short.TYPE, typeMirror));
        }
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Element element) {
        return o(element.asType()) && l(element.getAnnotationMirrors()) && n(element.getEnclosedElements());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(Map.Entry entry) {
        return j((AnnotationValue) entry.getValue(), ((ExecutableElement) entry.getKey()).getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(AnnotationMirror annotationMirror) {
        return o(annotationMirror.getAnnotationType()) && k(annotationMirror.getElementValues());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(AnnotationValue annotationValue, TypeMirror typeMirror) {
        return ((Boolean) annotationValue.accept(f56573c, typeMirror)).booleanValue();
    }

    private static boolean k(Map<? extends ExecutableElement, ? extends AnnotationValue> map) {
        return map.entrySet().stream().allMatch(new Predicate() { // from class: com.google.auto.common.w0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return y0.h((Map.Entry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(Iterable<? extends AnnotationMirror> iterable) {
        Iterator<? extends AnnotationMirror> it = iterable.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Element element) {
        return ((Boolean) element.accept(f56571a, (Object) null)).booleanValue();
    }

    public static boolean n(Iterable<? extends Element> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).allMatch(new Predicate() { // from class: com.google.auto.common.x0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return y0.m((Element) obj);
            }
        });
    }

    public static boolean o(TypeMirror typeMirror) {
        return ((Boolean) typeMirror.accept(f56572b, (Object) null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p(Iterable<? extends TypeMirror> iterable) {
        Iterator<? extends TypeMirror> it = iterable.iterator();
        while (it.hasNext()) {
            if (!o(it.next())) {
                return false;
            }
        }
        return true;
    }
}
