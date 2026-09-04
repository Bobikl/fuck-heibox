package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import mi.n;

/* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f126043a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c
        @dl.e
        public g<?> a(@dl.d n field, @dl.d o0 descriptor) {
            f0.p(field, "field");
            f0.p(descriptor, "descriptor");
            return null;
        }
    }

    @dl.e
    g<?> a(@dl.d n nVar, @dl.d o0 o0Var);
}
