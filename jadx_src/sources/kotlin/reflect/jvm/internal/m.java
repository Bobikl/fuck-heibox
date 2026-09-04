package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final ConcurrentMap<t, WeakReference<ii.k>> f128313a = new ConcurrentHashMap();

    public static final void a() {
        f128313a.clear();
    }

    @dl.d
    public static final ii.k b(@dl.d Class<?> cls) {
        f0.p(cls, "<this>");
        ClassLoader classLoaderF = ReflectClassUtilKt.f(cls);
        t tVar = new t(classLoaderF);
        ConcurrentMap<t, WeakReference<ii.k>> concurrentMap = f128313a;
        WeakReference<ii.k> weakReference = concurrentMap.get(tVar);
        if (weakReference != null) {
            ii.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(tVar, weakReference);
        }
        ii.k kVarA = ii.k.f119384c.a(classLoaderF);
        while (true) {
            try {
                ConcurrentMap<t, WeakReference<ii.k>> concurrentMap2 = f128313a;
                WeakReference<ii.k> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(tVar, new WeakReference<>(kVarA));
                if (weakReferencePutIfAbsent == null) {
                    tVar.a(null);
                    return kVarA;
                }
                ii.k kVar2 = weakReferencePutIfAbsent.get();
                if (kVar2 != null) {
                    tVar.a(null);
                    return kVar2;
                }
                concurrentMap2.remove(tVar, weakReferencePutIfAbsent);
            } catch (Throwable th2) {
                tVar.a(null);
                throw th2;
            }
        }
    }
}
