package com.max.hbarchcomponents;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ObservableManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ObservableManager.kt */
    public static final class a<T> implements b.a<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final String f65902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T, b2> f65903b;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, l<? super T, b2> lVar) {
            this.f65903b = lVar;
            this.f65902a = str;
        }

        @Override // com.max.hbarchcomponents.b.a
        public void a(T t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.f30711io, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f65903b.invoke(t10);
        }

        @Override // com.max.hbarchcomponents.b.a
        @d
        public String getKey() {
            return this.f65902a;
        }
    }

    public static final <T> void a(@d b.a<T> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, null, changeQuickRedirect, true, bb.c.b.fo, new Class[]{b.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        ObservableRepository<T> observableRepositoryB = b.f65900a.b(observer.getKey());
        if (observableRepositoryB != null) {
            observableRepositoryB.a(observer);
        }
    }

    @d
    public static final <T> b.a<T> b(@d String key, @d l<? super T, b2> onChange) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key, onChange}, null, changeQuickRedirect, true, bb.c.b.ho, new Class[]{String.class, l.class}, b.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (b.a) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        f0.p(onChange, "onChange");
        return new a(key, onChange);
    }

    public static final <T> void c(@d b.a<T> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, null, changeQuickRedirect, true, bb.c.b.go, new Class[]{b.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        ObservableRepository<T> observableRepositoryB = b.f65900a.b(observer.getKey());
        if (observableRepositoryB != null) {
            observableRepositoryB.e(observer);
        }
    }
}
