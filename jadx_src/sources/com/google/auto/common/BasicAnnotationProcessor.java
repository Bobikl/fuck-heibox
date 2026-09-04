package com.google.auto.common;

import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.common.collect.b3;
import com.google.common.collect.i2;
import com.google.common.collect.l1;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleElementVisitor8;
import javax.tools.Diagnostic;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasicAnnotationProcessor extends AbstractProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ElementName> f56481a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2<d, ElementName> f56482b = LinkedHashMultimap.P();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Elements f56483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Messager f56484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImmutableList<? extends d> f56485e;

    public static final class ElementName {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Kind f56486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f56487b;

        public enum Kind {
            PACKAGE_NAME,
            TYPE_NAME
        }

        private ElementName(Kind kind, Name name) {
            this.f56486a = (Kind) com.google.common.base.w.E(kind);
            this.f56487b = name.toString();
        }

        static ElementName a(Element element) {
            return element.getKind() == ElementKind.PACKAGE ? new ElementName(Kind.PACKAGE_NAME, n0.b(element).getQualifiedName()) : new ElementName(Kind.TYPE_NAME, BasicAnnotationProcessor.h(element).getQualifiedName());
        }

        Optional<? extends Element> b(Elements elements) {
            return Optional.c(this.f56486a == Kind.PACKAGE_NAME ? elements.getPackageElement(this.f56487b) : elements.getTypeElement(this.f56487b));
        }

        String c() {
            return this.f56487b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ElementName)) {
                return false;
            }
            ElementName elementName = (ElementName) obj;
            return this.f56486a == elementName.f56486a && this.f56487b.equals(elementName.f56487b);
        }

        public int hashCode() {
            return Objects.hash(this.f56486a, this.f56487b);
        }
    }

    public static final class a extends SimpleElementVisitor8<TypeElement, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TypeElement a(Element element, Void r10) {
            return (TypeElement) element.getEnclosingElement().accept(this, r10);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public TypeElement c(PackageElement packageElement, Void r10) {
            throw new IllegalArgumentException();
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public TypeElement e(TypeElement typeElement, Void r10) {
            return typeElement;
        }
    }

    @Deprecated
    public interface b {
        Set<? extends Class<? extends Annotation>> a();

        Set<? extends Element> b(i2<Class<? extends Annotation>, Element> i2Var);
    }

    public static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f56488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap<String, Class<? extends Annotation>> f56489b;

        c(b bVar) {
            this.f56488a = bVar;
            this.f56489b = (ImmutableMap) bVar.a().stream().collect(Collectors.collectingAndThen(Collectors.toMap(new Function() { // from class: com.google.auto.common.c0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Class) obj).getCanonicalName();
                }
            }, new Function() { // from class: com.google.auto.common.d0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BasicAnnotationProcessor.c.e((Class) obj);
                }
            }), new Function() { // from class: com.google.auto.common.e0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ImmutableMap.g((Map) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Class e(Class cls) {
            return cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(ImmutableSetMultimap.a aVar, String str, Collection collection) {
            aVar.j(this.f56489b.get(str), collection);
        }

        private ImmutableSetMultimap<Class<? extends Annotation>, Element> g(i2<String, Element> i2Var) {
            final ImmutableSetMultimap.a aVarM = ImmutableSetMultimap.M();
            i2Var.e().forEach(new BiConsumer() { // from class: com.google.auto.common.f0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f56493a.f(aVarM, (String) obj, (Collection) obj2);
                }
            });
            return aVarM.a();
        }

        @Override // com.google.auto.common.BasicAnnotationProcessor.d
        public Set<String> a() {
            return this.f56489b.keySet();
        }

        @Override // com.google.auto.common.BasicAnnotationProcessor.d
        public Set<? extends Element> b(ImmutableSetMultimap<String, Element> immutableSetMultimap) {
            return this.f56488a.b(g(immutableSetMultimap));
        }
    }

    public interface d {
        Set<String> a();

        Set<? extends Element> b(ImmutableSetMultimap<String, Element> immutableSetMultimap);
    }

    private static ImmutableSetMultimap<String, Element> B(i2<TypeElement, Element> i2Var) {
        final ImmutableSetMultimap.a aVarM = ImmutableSetMultimap.M();
        i2Var.e().forEach(new BiConsumer() { // from class: com.google.auto.common.y
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                BasicAnnotationProcessor.t(aVarM, (TypeElement) obj, (Collection) obj2);
            }
        });
        return aVarM.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<TypeElement, Element> C(RoundEnvironment roundEnvironment) {
        boolean z10;
        ImmutableSet immutableSetW = ImmutableSet.w(this.f56481a);
        this.f56481a.clear();
        ImmutableSetMultimap.a aVarM = ImmutableSetMultimap.M();
        b3 it = immutableSetW.iterator();
        while (it.hasNext()) {
            ElementName elementName = (ElementName) it.next();
            Optional<? extends Element> optionalB = elementName.b(this.f56483c);
            if (optionalB.e()) {
                g(optionalB.d(), i(), aVarM);
            } else {
                this.f56481a.add(elementName);
            }
        }
        ImmutableSetMultimap immutableSetMultimapA = aVarM.a();
        ImmutableSetMultimap.a aVarM2 = ImmutableSetMultimap.M();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b3<TypeElement> it2 = i().iterator();
        while (it2.hasNext()) {
            TypeElement next = it2.next();
            b3 it3 = Sets.N(next == null ? ImmutableSet.D() : roundEnvironment.getElementsAnnotatedWith(next), immutableSetMultimapA.v(next)).iterator();
            while (it3.hasNext()) {
                Element element = (Element) it3.next();
                ElementName elementNameA = ElementName.a(element);
                if (!linkedHashSet.contains(elementNameA)) {
                    if (!this.f56481a.contains(elementNameA)) {
                        z10 = y0.m(element.getKind().equals(ElementKind.PACKAGE) ? element : h(element));
                    }
                }
                if (z10) {
                    aVarM2.f(next, element);
                    linkedHashSet.add(elementNameA);
                } else {
                    this.f56481a.add(elementNameA);
                }
            }
        }
        return aVarM2.a();
    }

    protected static d f(b bVar) {
        return new c(bVar);
    }

    private static void g(Element element, ImmutableSet<TypeElement> immutableSet, ImmutableSetMultimap.a<TypeElement, Element> aVar) {
        for (Element element2 : element.getEnclosedElements()) {
            if (!element2.getKind().isClass() && !element2.getKind().isInterface()) {
                g(element2, immutableSet, aVar);
            }
        }
        if (element instanceof ExecutableElement) {
            Iterator it = n0.a(element).getParameters().iterator();
            while (it.hasNext()) {
                g((Element) it.next(), immutableSet, aVar);
            }
        }
        b3<TypeElement> it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            TypeElement next = it2.next();
            if (p(element, next)) {
                aVar.f(next, element);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeElement h(Element element) {
        return (TypeElement) element.accept(new a(), (Object) null);
    }

    private ImmutableSet<TypeElement> i() {
        com.google.common.base.w.g0(this.f56485e != null);
        return (ImmutableSet) this.f56485e.stream().flatMap(new Function() { // from class: com.google.auto.common.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f56492a.q((BasicAnnotationProcessor.d) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new x()));
    }

    private ImmutableSet<TypeElement> j(d dVar) {
        Stream stream = dVar.a().stream();
        final Elements elements = this.f56483c;
        elements.getClass();
        return (ImmutableSet) stream.map(new Function() { // from class: com.google.auto.common.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return elements.getTypeElement((String) obj);
            }
        }).filter(new Predicate() { // from class: com.google.auto.common.w
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return s.a((TypeElement) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new x()));
    }

    private ImmutableSetMultimap<TypeElement, Element> m(Set<ElementName> set, ImmutableSet<TypeElement> immutableSet) {
        ImmutableSetMultimap.a aVarM = ImmutableSetMultimap.M();
        Iterator<ElementName> it = set.iterator();
        while (it.hasNext()) {
            Optional<? extends Element> optionalB = it.next().b(this.f56483c);
            if (optionalB.e()) {
                g(optionalB.d(), immutableSet, aVarM);
            }
        }
        return aVarM.a();
    }

    private static boolean p(Element element, final TypeElement typeElement) {
        return element.getAnnotationMirrors().stream().anyMatch(new Predicate() { // from class: com.google.auto.common.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BasicAnnotationProcessor.s(typeElement, (AnnotationMirror) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Stream q(d dVar) {
        return j(dVar).stream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream r(d dVar) {
        return dVar.a().stream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(TypeElement typeElement, AnnotationMirror annotationMirror) {
        return o0.p(annotationMirror.getAnnotationType()).equals(typeElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(ImmutableSetMultimap.a aVar, TypeElement typeElement, Collection collection) {
        aVar.j(typeElement.getQualifiedName().toString(), collection);
    }

    private void w(ImmutableSetMultimap<TypeElement, Element> immutableSetMultimap) {
        b3<? extends d> it = this.f56485e.iterator();
        while (it.hasNext()) {
            d next = it.next();
            ImmutableSet<TypeElement> immutableSetJ = j(next);
            ImmutableSetMultimap immutableSetMultimapA = new ImmutableSetMultimap.a().h(m(this.f56482b.v(next), immutableSetJ)).h(Multimaps.n(immutableSetMultimap, Predicates.n(immutableSetJ))).a();
            if (immutableSetMultimapA.isEmpty()) {
                this.f56482b.a((Object) next);
            } else {
                this.f56482b.b(next, l1.U(next.b(B(immutableSetMultimapA)), new com.google.common.base.n() { // from class: com.google.auto.common.z
                    @Override // com.google.common.base.n
                    public final Object apply(Object obj) {
                        return BasicAnnotationProcessor.ElementName.a((Element) obj);
                    }
                }));
            }
        }
    }

    private String y(String str) {
        return String.format("[%s:MiscError] %s was unable to process %s because not all of its dependencies could be resolved. Check for compilation errors or a circular dependency with generated code.", getClass().getSimpleName(), getClass().getCanonicalName(), str);
    }

    private void z(Set<ElementName> set) {
        for (ElementName elementName : set) {
            Optional<? extends Element> optionalB = elementName.b(this.f56483c);
            if (optionalB.e()) {
                this.f56484d.printMessage(Diagnostic.Kind.ERROR, y("this " + com.google.common.base.a.g(optionalB.d().getKind().name())), optionalB.d());
            } else {
                this.f56484d.printMessage(Diagnostic.Kind.ERROR, y(elementName.c()));
            }
        }
    }

    protected Iterable<? extends d> A() {
        return l1.U(o(), new com.google.common.base.n() { // from class: com.google.auto.common.b0
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return BasicAnnotationProcessor.f((BasicAnnotationProcessor.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<String> l() {
        com.google.common.base.w.g0(this.f56485e != null);
        return (ImmutableSet) this.f56485e.stream().flatMap(new Function() { // from class: com.google.auto.common.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BasicAnnotationProcessor.r((BasicAnnotationProcessor.d) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new x()));
    }

    public final synchronized void n(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        this.f56483c = processingEnvironment.getElementUtils();
        this.f56484d = processingEnvironment.getMessager();
        this.f56485e = ImmutableList.u(A());
    }

    @Deprecated
    protected Iterable<? extends b> o() {
        throw new AssertionError("If steps() is not implemented, initSteps() must be.");
    }

    @Deprecated
    protected void u() {
    }

    protected void v(RoundEnvironment roundEnvironment) {
        if (roundEnvironment.processingOver()) {
            return;
        }
        u();
    }

    public final boolean x(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        com.google.common.base.w.g0(this.f56483c != null);
        com.google.common.base.w.g0(this.f56484d != null);
        com.google.common.base.w.g0(this.f56485e != null);
        if (!roundEnvironment.processingOver()) {
            w(C(roundEnvironment));
            v(roundEnvironment);
            return false;
        }
        v(roundEnvironment);
        if (!roundEnvironment.errorRaised()) {
            z(ImmutableSet.q().c(this.f56481a).c(this.f56482b.values()).e());
        }
        return false;
    }
}
