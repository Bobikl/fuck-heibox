package gi;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f119064a = new a();

        private a() {
        }

        @Override // gi.c
        public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.d s0 functionDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            f0.p(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f119065a = new b();

        private b() {
        }

        @Override // gi.c
        public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.d s0 functionDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            f0.p(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().J1(d.a());
        }
    }

    boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d s0 s0Var);
}
