package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.collections.y;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;

/* JADX INFO: compiled from: ClassifierNamePolicy.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class C1174a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final C1174a f127476a = new C1174a();

        private C1174a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @dl.d
        public String a(@dl.d f classifier, @dl.d DescriptorRenderer renderer) {
            f0.p(classifier, "classifier");
            f0.p(renderer, "renderer");
            if (classifier instanceof y0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((y0) classifier).getName();
                f0.o(name, "classifier.name");
                return renderer.x(name, false);
            }
            kotlin.reflect.jvm.internal.impl.name.d dVarM = kotlin.reflect.jvm.internal.impl.resolve.d.m(classifier);
            f0.o(dVarM, "getFqName(classifier)");
            return renderer.w(dVarM);
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f127477a = new b();

        private b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.f] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.f0, kotlin.reflect.jvm.internal.impl.descriptors.k] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.k] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @dl.d
        public String a(@dl.d f classifier, @dl.d DescriptorRenderer renderer) {
            f0.p(classifier, "classifier");
            f0.p(renderer, "renderer");
            if (classifier instanceof y0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((y0) classifier).getName();
                f0.o(name, "classifier.name");
                return renderer.x(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.c();
            } while (classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.d);
            return e.c(y.X0(arrayList));
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final c f127478a = new c();

        private c() {
        }

        private final String b(f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f name = fVar.getName();
            f0.o(name, "descriptor.name");
            String strB = e.b(name);
            if (fVar instanceof y0) {
                return strB;
            }
            k kVarC = fVar.c();
            f0.o(kVarC, "descriptor.containingDeclaration");
            String strC = c(kVarC);
            if (strC == null || f0.g(strC, "")) {
                return strB;
            }
            return strC + lg.a.f131414g + strB;
        }

        private final String c(k kVar) {
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                return b((f) kVar);
            }
            if (!(kVar instanceof g0)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.d dVarJ = ((g0) kVar).e().j();
            f0.o(dVarJ, "descriptor.fqName.toUnsafe()");
            return e.a(dVarJ);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @dl.d
        public String a(@dl.d f classifier, @dl.d DescriptorRenderer renderer) {
            f0.p(classifier, "classifier");
            f0.p(renderer, "renderer");
            return b(classifier);
        }
    }

    @dl.d
    String a(@dl.d f fVar, @dl.d DescriptorRenderer descriptorRenderer);
}
