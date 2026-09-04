package com.google.auto.common;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.util.ElementFilter;

/* JADX INFO: compiled from: SimpleAnnotationMirror.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements AnnotationMirror {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeElement f56565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<String, ? extends AnnotationValue> f56566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableMap<ExecutableElement, ? extends AnnotationValue> f56567c;

    private t0(TypeElement typeElement, Map<String, ? extends AnnotationValue> map) {
        com.google.common.base.w.u(typeElement.getKind().equals(ElementKind.ANNOTATION_TYPE), "annotationType must be an annotation: %s", typeElement);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        ArrayList arrayList = new ArrayList();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            String string = executableElement.getSimpleName().toString();
            if (linkedHashMap2.containsKey(string)) {
                linkedHashMap.put(string, linkedHashMap2.remove(string));
            } else if (executableElement.getDefaultValue() != null) {
                linkedHashMap.put(string, executableElement.getDefaultValue());
            } else {
                arrayList.add(string);
            }
        }
        com.google.common.base.w.y(linkedHashMap2.isEmpty(), "namedValues has entries for members that are not in %s: %s", typeElement, linkedHashMap2);
        com.google.common.base.w.u(arrayList.isEmpty(), "namedValues is missing entries for: %s", arrayList);
        this.f56565a = typeElement;
        this.f56566b = ImmutableMap.g(map);
        this.f56567c = (ImmutableMap) ElementFilter.methodsIn(typeElement.getEnclosedElements()).stream().collect(ImmutableMap.toImmutableMap(new Function() { // from class: com.google.auto.common.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t0.e((ExecutableElement) obj);
            }
        }, new Function() { // from class: com.google.auto.common.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t0.f(linkedHashMap, (ExecutableElement) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExecutableElement e(ExecutableElement executableElement) {
        return executableElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationValue f(Map map, ExecutableElement executableElement) {
        return (AnnotationValue) map.get(executableElement.getSimpleName().toString());
    }

    public static AnnotationMirror g(TypeElement typeElement) {
        return h(typeElement, ImmutableMap.v());
    }

    public static AnnotationMirror h(TypeElement typeElement, Map<String, ? extends AnnotationValue> map) {
        return new t0(typeElement, map);
    }

    public DeclaredType c() {
        return o0.g(this.f56565a.asType());
    }

    public Map<ExecutableElement, ? extends AnnotationValue> d() {
        return this.f56567c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnnotationMirror) && a.a().d(this, (AnnotationMirror) obj);
    }

    public int hashCode() {
        return a.a().f(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("@");
        sb2.append((CharSequence) this.f56565a.getQualifiedName());
        if (!this.f56566b.isEmpty()) {
            sb2.append('(');
            sb2.append(com.google.common.base.p.p(", ").u(" = ").i(this.f56566b));
            sb2.append(')');
        }
        return sb2.toString();
    }
}
