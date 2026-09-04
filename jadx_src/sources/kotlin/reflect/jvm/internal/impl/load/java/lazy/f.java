package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModuleClassResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.c f126257a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.e
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d a(@dl.d mi.g javaClass) {
        f0.p(javaClass, "javaClass");
        return b().b(javaClass);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.c b() {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = this.f126257a;
        if (cVar != null) {
            return cVar;
        }
        f0.S("resolver");
        return null;
    }

    public final void c(@dl.d kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar) {
        f0.p(cVar, "<set-?>");
        this.f126257a = cVar;
    }
}
