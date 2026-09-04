package com.google.auto.common;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.b3;
import com.google.common.collect.i2;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleElementVisitor8;
import javax.lang.model.util.Types;

/* JADX INFO: compiled from: MoreElements.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
public final class n0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: MoreElements.java */
    public static final class a<T> implements com.google.common.base.x<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f56499b;

        a(Set set) {
            this.f56499b = set;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // com.google.common.base.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Element element) {
            return element.getModifiers().containsAll(this.f56499b);
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56500a;

        static {
            int[] iArr = new int[Visibility.values().length];
            f56500a = iArr;
            try {
                iArr[Visibility.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56500a[Visibility.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static abstract class c<T> extends SimpleElementVisitor8<T, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56501a;

        c(String str) {
            this.f56501a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T a(Element element, Void r10) {
            throw new IllegalArgumentException(element + " does not represent a " + this.f56501a);
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static final class d extends c<ExecutableElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final d f56502b = new d();

        d() {
            super("executable element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ExecutableElement d(ExecutableElement executableElement, Void r10) {
            return executableElement;
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static final class e extends c<PackageElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final e f56503b = new e();

        e() {
            super("package element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PackageElement d(PackageElement packageElement, Void r10) {
            return packageElement;
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static final class f extends c<TypeElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f56504b = new f();

        f() {
            super("type element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TypeElement d(TypeElement typeElement, Void r10) {
            return typeElement;
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static final class g extends c<TypeParameterElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g f56505b = new g();

        g() {
            super("type parameter element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TypeParameterElement d(TypeParameterElement typeParameterElement, Void r10) {
            return typeParameterElement;
        }
    }

    /* JADX INFO: compiled from: MoreElements.java */
    public static final class h extends c<VariableElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final h f56506b = new h();

        h() {
            super("variable element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public VariableElement d(VariableElement variableElement, Void r10) {
            return variableElement;
        }
    }

    private n0() {
    }

    public static ExecutableElement a(Element element) {
        return (ExecutableElement) element.accept(d.f56502b, (Object) null);
    }

    public static PackageElement b(Element element) {
        return (PackageElement) element.accept(e.f56503b, (Object) null);
    }

    public static TypeElement c(Element element) {
        return (TypeElement) element.accept(f.f56504b, (Object) null);
    }

    public static TypeParameterElement d(Element element) {
        return (TypeParameterElement) element.accept(g.f56505b, (Object) null);
    }

    public static VariableElement e(Element element) {
        return (VariableElement) element.accept(h.f56506b, (Object) null);
    }

    private static ImmutableSet<ExecutableElement> f(TypeElement typeElement, q0 q0Var) {
        LinkedHashMultimap linkedHashMultimapP = LinkedHashMultimap.P();
        h(typeElement, linkedHashMultimapP);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = linkedHashMultimapP.e().values().iterator();
        while (it.hasNext()) {
            ImmutableList immutableListV = ImmutableList.v((Collection) it.next());
            int i10 = 0;
            while (i10 < immutableListV.size()) {
                ExecutableElement executableElement = (ExecutableElement) immutableListV.get(i10);
                i10++;
                for (int i11 = i10; i11 < immutableListV.size(); i11++) {
                    if (q0Var.a((ExecutableElement) immutableListV.get(i11), executableElement, typeElement)) {
                        linkedHashSet.add(executableElement);
                        break;
                    }
                }
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashMultimapP.values());
        linkedHashSet2.removeAll(linkedHashSet);
        return ImmutableSet.w(linkedHashSet2);
    }

    public static ImmutableSet<ExecutableElement> g(TypeElement typeElement, Types types, Elements elements) {
        return f(typeElement, new q0.b(types));
    }

    private static void h(TypeElement typeElement, i2<String, ExecutableElement> i2Var) {
        Iterator it = typeElement.getInterfaces().iterator();
        while (it.hasNext()) {
            h(o0.p((TypeMirror) it.next()), i2Var);
        }
        if (typeElement.getSuperclass().getKind() != TypeKind.NONE) {
            h(o0.p(typeElement.getSuperclass()), i2Var);
        }
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            i2Var.put(executableElement.getSimpleName().toString(), executableElement);
        }
    }

    public static Optional<AnnotationMirror> i(Element element, Class<? extends Annotation> cls) {
        String canonicalName = cls.getCanonicalName();
        for (AnnotationMirror annotationMirror : element.getAnnotationMirrors()) {
            if (c(annotationMirror.getAnnotationType().asElement()).getQualifiedName().contentEquals(canonicalName)) {
                return Optional.f(annotationMirror);
            }
        }
        return Optional.a();
    }

    private static ImmutableSet<ExecutableElement> j(TypeElement typeElement, q0 q0Var) {
        PackageElement packageElementM = m(typeElement);
        ImmutableSet.a aVarQ = ImmutableSet.q();
        b3<ExecutableElement> it = f(typeElement, q0Var).iterator();
        while (it.hasNext()) {
            ExecutableElement next = it.next();
            if (!next.getModifiers().contains(Modifier.STATIC) && r(next, packageElementM)) {
                aVarQ.g(next);
            }
        }
        return aVarQ.e();
    }

    @Deprecated
    public static ImmutableSet<ExecutableElement> k(TypeElement typeElement, Elements elements) {
        return j(typeElement, new q0.c(elements));
    }

    public static ImmutableSet<ExecutableElement> l(TypeElement typeElement, Types types, Elements elements) {
        return j(typeElement, new q0.b(types));
    }

    public static PackageElement m(Element element) {
        while (element.getKind() != ElementKind.PACKAGE) {
            element = element.getEnclosingElement();
        }
        return (PackageElement) element;
    }

    public static <T extends Element> com.google.common.base.x<T> n(Set<Modifier> set) {
        return new a(set);
    }

    public static <T extends Element> com.google.common.base.x<T> o(Modifier... modifierArr) {
        return n(ImmutableSet.y(modifierArr));
    }

    public static boolean p(Element element, Class<? extends Annotation> cls) {
        return i(element, cls).e();
    }

    public static boolean q(Element element) {
        return element.getKind().isClass() || element.getKind().isInterface();
    }

    static boolean r(ExecutableElement executableElement, PackageElement packageElement) {
        int i10 = b.f56500a[Visibility.ofElement(executableElement).ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return true;
        }
        return m(executableElement).equals(packageElement);
    }

    public static boolean s(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement, Types types) {
        return new q0.b(types).a(executableElement, executableElement2, typeElement);
    }
}
