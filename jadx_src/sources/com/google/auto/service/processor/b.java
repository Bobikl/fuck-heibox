package com.google.auto.service.processor;

import com.google.auto.common.n0;
import com.google.auto.common.o0;
import com.google.common.base.d0;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.r1;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedOptions;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import o9.d;

/* JADX INFO: compiled from: AutoServiceProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
@SupportedOptions({"debug", AliVerifyDialogActivity.f77461k})
public class b extends AbstractProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    static final String f56577b = "No service interfaces provided for element!";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1<String, String> f56578a = HashMultimap.K();

    /* JADX INFO: compiled from: AutoServiceProcessor.java */
    public class a extends SimpleAnnotationValueVisitor8<ImmutableSet<DeclaredType>, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Stream b(AnnotationValue annotationValue) {
            return ((ImmutableSet) annotationValue.accept(this, (Object) null)).stream();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<DeclaredType> d(List<? extends AnnotationValue> list, Void r10) {
            return (ImmutableSet) list.stream().flatMap(new Function() { // from class: com.google.auto.service.processor.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f56576a.b((AnnotationValue) obj);
                }
            }).collect(ImmutableSet.toImmutableSet());
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<DeclaredType> f(TypeMirror typeMirror, Void r10) {
            return ImmutableSet.E(o0.g(typeMirror));
        }
    }

    private boolean a(TypeElement typeElement, TypeElement typeElement2, AnnotationMirror annotationMirror) {
        String str = (String) this.processingEnv.getOptions().get(AliVerifyDialogActivity.f77461k);
        if (str == null || !Boolean.parseBoolean(str)) {
            return true;
        }
        Types typeUtils = this.processingEnv.getTypeUtils();
        if (typeUtils.isSubtype(typeElement.asType(), typeElement2.asType())) {
            return true;
        }
        if (!typeUtils.isSubtype(typeElement.asType(), typeUtils.erasure(typeElement2.asType()))) {
            return false;
        }
        if (!o(typeElement)) {
            p("Service provider " + typeElement2 + " is generic, so it can't be named exactly by @AutoService. If this is OK, add @SuppressWarnings(\"rawtypes\").", typeElement, annotationMirror);
        }
        return true;
    }

    private void b(String str, Element element, AnnotationMirror annotationMirror) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, str, element, annotationMirror);
    }

    private void c(String str) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "FATAL ERROR: " + str);
    }

    private void d() throws Throwable {
        Filer filer = this.processingEnv.getFiler();
        for (String str : this.f56578a.keySet()) {
            String str2 = "META-INF/services/" + str;
            k("Working on resource file: " + str2);
            try {
                TreeSet treeSetE = Sets.E();
                try {
                    FileObject resource = filer.getResource(StandardLocation.CLASS_OUTPUT, "", str2);
                    k("Looking for existing resource file at " + resource.toUri());
                    Set<String> setB = c.b(resource.openInputStream());
                    k("Existing service entries: " + setB);
                    treeSetE.addAll(setB);
                } catch (IOException unused) {
                    k("Resource file did not already exist.");
                }
                HashSet hashSet = new HashSet(this.f56578a.v(str));
                if (treeSetE.containsAll(hashSet)) {
                    k("No new service entries being added.");
                    return;
                }
                treeSetE.addAll(hashSet);
                k("New service file contents: " + treeSetE);
                FileObject fileObjectCreateResource = filer.createResource(StandardLocation.CLASS_OUTPUT, "", str2, new Element[0]);
                OutputStream outputStreamOpenOutputStream = fileObjectCreateResource.openOutputStream();
                try {
                    c.c(treeSetE, outputStreamOpenOutputStream);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    k("Wrote to: " + fileObjectCreateResource.toUri());
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                c("Unable to create " + str2 + ", " + e10);
                return;
            }
        }
    }

    private String e(TypeElement typeElement) {
        return f(typeElement, typeElement.getSimpleName().toString());
    }

    private String f(TypeElement typeElement, String str) {
        Element enclosingElement = typeElement.getEnclosingElement();
        if (!(enclosingElement instanceof PackageElement)) {
            TypeElement typeElementC = n0.c(enclosingElement);
            return f(typeElementC, typeElementC.getSimpleName() + "$" + str);
        }
        PackageElement packageElementB = n0.b(enclosingElement);
        if (packageElementB.isUnnamed()) {
            return str;
        }
        return packageElementB.getQualifiedName() + "." + str;
    }

    private ImmutableSet<DeclaredType> j(AnnotationMirror annotationMirror) {
        return (ImmutableSet) com.google.auto.common.a.d(annotationMirror, "value").accept(new a(), (Object) null);
    }

    private void k(String str) {
        if (this.processingEnv.getOptions().containsKey("debug")) {
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, str);
        }
    }

    private void m(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Set<Element> elementsAnnotatedWith = roundEnvironment.getElementsAnnotatedWith(n9.a.class);
        k(set.toString());
        k(elementsAnnotatedWith.toString());
        for (Element element : elementsAnnotatedWith) {
            TypeElement typeElementC = n0.c(element);
            AnnotationMirror annotationMirrorD = n0.i(element, n9.a.class).d();
            ImmutableSet<DeclaredType> immutableSetJ = j(annotationMirrorD);
            if (immutableSetJ.isEmpty()) {
                b(f56577b, element, annotationMirrorD);
            } else {
                Iterator<DeclaredType> it = immutableSetJ.iterator();
                while (it.hasNext()) {
                    TypeElement typeElementP = o0.p(it.next());
                    k("provider interface: " + typeElementP.getQualifiedName());
                    k("provider implementer: " + typeElementC.getQualifiedName());
                    if (a(typeElementC, typeElementP, annotationMirrorD)) {
                        this.f56578a.put(e(typeElementP), e(typeElementC));
                    } else {
                        b("ServiceProviders must implement their service provider interface. " + typeElementC.getQualifiedName() + " does not implement " + typeElementP.getQualifiedName(), element, annotationMirrorD);
                    }
                }
            }
        }
    }

    private void n(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) throws Throwable {
        if (roundEnvironment.processingOver()) {
            d();
        } else {
            m(set, roundEnvironment);
        }
    }

    private static boolean o(Element element) {
        while (element != null) {
            SuppressWarnings suppressWarnings = (SuppressWarnings) element.getAnnotation(SuppressWarnings.class);
            if (suppressWarnings != null && Arrays.asList(suppressWarnings.value()).contains("rawtypes")) {
                return true;
            }
            element = element.getEnclosingElement();
        }
        return false;
    }

    private void p(String str, Element element, AnnotationMirror annotationMirror) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, str, element, annotationMirror);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<String> h() {
        return ImmutableSet.E(n9.a.class.getName());
    }

    public SourceVersion i() {
        return SourceVersion.latestSupported();
    }

    public boolean l(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) throws Throwable {
        try {
            n(set, roundEnvironment);
            return false;
        } catch (RuntimeException e10) {
            c(d0.l(e10));
            return false;
        }
    }
}
