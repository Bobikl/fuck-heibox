package ii;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements li.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f119387a = new l();

    /* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements li.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final n f119388b;

        public a(@dl.d n javaElement) {
            f0.p(javaElement, "javaElement");
            this.f119388b = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
        @dl.d
        public u0 b() {
            u0 NO_SOURCE_FILE = u0.f125943a;
            f0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // li.a
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n c() {
            return this.f119388b;
        }

        @dl.d
        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private l() {
    }

    @Override // li.b
    @dl.d
    public li.a a(@dl.d mi.l javaElement) {
        f0.p(javaElement, "javaElement");
        return new a((n) javaElement);
    }
}
