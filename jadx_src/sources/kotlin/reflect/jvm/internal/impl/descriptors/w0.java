package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.b2;

/* JADX INFO: compiled from: SupertypeLoopChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface w0 {

    /* JADX INFO: compiled from: SupertypeLoopChecker.kt */
    public static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f125944a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.d0> a(@dl.d kotlin.reflect.jvm.internal.impl.types.z0 currentTypeConstructor, @dl.d Collection<? extends kotlin.reflect.jvm.internal.impl.types.d0> superTypes, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.z0, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.d0>> neighbors, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.d0, b2> reportLoop) {
            kotlin.jvm.internal.f0.p(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.f0.p(superTypes, "superTypes");
            kotlin.jvm.internal.f0.p(neighbors, "neighbors");
            kotlin.jvm.internal.f0.p(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @dl.d
    Collection<kotlin.reflect.jvm.internal.impl.types.d0> a(@dl.d kotlin.reflect.jvm.internal.impl.types.z0 z0Var, @dl.d Collection<? extends kotlin.reflect.jvm.internal.impl.types.d0> collection, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.z0, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.d0>> lVar, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.d0, b2> lVar2);
}
