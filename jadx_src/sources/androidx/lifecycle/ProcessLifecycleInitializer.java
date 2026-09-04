package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: ProcessLifecycleInitializer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b<y> {
    @Override // androidx.startup.b
    @dl.d
    public List<Class<? extends androidx.startup.b<?>>> b() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // androidx.startup.b
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        kotlin.jvm.internal.f0.o(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        u.a(context);
        o0.b bVar = o0.f24222j;
        bVar.c(context);
        return bVar.a();
    }
}
