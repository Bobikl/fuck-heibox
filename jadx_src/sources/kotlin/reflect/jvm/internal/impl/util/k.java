package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface k {

    /* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f128243a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.k
        public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k what, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k from) {
            f0.p(what, "what");
            f0.p(from, "from");
            return true;
        }
    }

    boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar2);
}
