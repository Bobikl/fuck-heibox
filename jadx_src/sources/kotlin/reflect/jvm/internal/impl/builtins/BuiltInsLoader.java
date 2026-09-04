package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.z;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface BuiltInsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Companion f125335a = Companion.f125336a;

    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f125336a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final z<BuiltInsLoader> f125337b = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<BuiltInsLoader>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$Instance$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BuiltInsLoader invoke() {
                ServiceLoader implementations = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                f0.o(implementations, "implementations");
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt___CollectionsKt.z2(implementations);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        });

        private Companion() {
        }

        @dl.d
        public final BuiltInsLoader a() {
            return f125337b.getValue();
        }
    }

    @dl.d
    h0 a(@dl.d m mVar, @dl.d d0 d0Var, @dl.d Iterable<? extends gi.b> iterable, @dl.d gi.c cVar, @dl.d gi.a aVar, boolean z10);
}
