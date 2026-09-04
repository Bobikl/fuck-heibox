package com.max.hbarchcomponents;

import androidx.lifecycle.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ObservableManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f65900a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final Map<String, WeakReference<ObservableRepository<?>>> f65901b = new LinkedHashMap();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ObservableManager.kt */
    public interface a<T> {
        void a(T t10);

        @d
        String getKey();
    }

    private b() {
    }

    @d
    public final synchronized <T> ObservableRepository<T> a(@d y lifecycleOwner, @d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lifecycleOwner, key}, this, changeQuickRedirect, false, bb.c.b.co, new Class[]{y.class, String.class}, ObservableRepository.class);
        if (patchProxyResultProxy.isSupported) {
            return (ObservableRepository) patchProxyResultProxy.result;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(key, "key");
        ObservableRepository<T> observableRepositoryB = b(key);
        if (observableRepositoryB == null) {
            observableRepositoryB = new ObservableRepository<>(lifecycleOwner);
            f65901b.put(key, new WeakReference<>(observableRepositoryB));
        }
        return observableRepositoryB;
    }

    @e
    public final synchronized <T> ObservableRepository<T> b(@d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, bb.c.b.bo, new Class[]{String.class}, ObservableRepository.class);
        if (patchProxyResultProxy.isSupported) {
            return (ObservableRepository) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        WeakReference<ObservableRepository<?>> weakReference = f65901b.get(key);
        ObservableRepository<T> observableRepository = null;
        ObservableRepository<?> observableRepository2 = weakReference != null ? weakReference.get() : null;
        if (observableRepository2 instanceof ObservableRepository) {
            observableRepository = (ObservableRepository<T>) observableRepository2;
        }
        return observableRepository;
    }

    public final synchronized <T> void c(@d String key, @d a<T> observer) {
        if (PatchProxy.proxy(new Object[]{key, observer}, this, changeQuickRedirect, false, bb.c.b.eo, new Class[]{String.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        f0.p(observer, "observer");
        ObservableRepository<T> observableRepositoryB = b(key);
        if (observableRepositoryB != null) {
            observableRepositoryB.e(observer);
        }
    }

    public final synchronized void d(@d String key) {
        ObservableRepository<?> observableRepository;
        if (PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, bb.c.b.f0do, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        WeakReference<ObservableRepository<?>> weakReferenceRemove = f65901b.remove(key);
        if (weakReferenceRemove != null && (observableRepository = weakReferenceRemove.get()) != null) {
            observableRepository.b();
        }
    }
}
