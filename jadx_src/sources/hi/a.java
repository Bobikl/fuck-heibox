package hi;

import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;

/* JADX INFO: compiled from: JavaVisibilities.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f119180a = new a();

    /* JADX INFO: renamed from: hi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class C1084a extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final C1084a f119181c = new C1084a();

        private C1084a() {
            super("package", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @e
        public Integer a(@d g1 visibility) {
            f0.p(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return f1.f125614a.b(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public String b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public g1 d() {
            return f1.g.f125623c;
        }
    }

    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class b extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final b f119182c = new b();

        private b() {
            super("protected_and_package", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @e
        public Integer a(@d g1 visibility) {
            f0.p(visibility, "visibility");
            if (f0.g(this, visibility)) {
                return 0;
            }
            if (visibility == f1.b.f125618c) {
                return null;
            }
            return Integer.valueOf(f1.f125614a.b(visibility) ? 1 : -1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public String b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public g1 d() {
            return f1.g.f125623c;
        }
    }

    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class c extends g1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final c f119183c = new c();

        private c() {
            super("protected_static", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public String b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
        @d
        public g1 d() {
            return f1.g.f125623c;
        }
    }

    private a() {
    }
}
