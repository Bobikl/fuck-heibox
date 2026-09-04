package gi;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: gi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdditionalClassPartsProvider.kt */
    public static final class C1078a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final C1078a f119063a = new C1078a();

        private C1078a() {
        }

        @Override // gi.a
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // gi.a
        @dl.d
        public Collection<d0> c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // gi.a
        @dl.d
        public Collection<s0> d(@dl.d f name, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
            f0.p(name, "name");
            f0.p(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.E();
        }

        @Override // gi.a
        @dl.d
        public Collection<f> e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.E();
        }
    }

    @dl.d
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    @dl.d
    Collection<d0> c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    @dl.d
    Collection<s0> d(@dl.d f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    @dl.d
    Collection<f> e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);
}
