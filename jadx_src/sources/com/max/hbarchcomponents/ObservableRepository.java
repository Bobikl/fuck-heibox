package com.max.hbarchcomponents;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ObservableRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nObservableRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObservableRepository.kt\ncom/max/hbarchcomponents/ObservableRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1#2:46\n1855#3,2:47\n*S KotlinDebug\n*F\n+ 1 ObservableRepository.kt\ncom/max/hbarchcomponents/ObservableRepository\n*L\n37#1:47,2\n*E\n"})
public final class ObservableRepository<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final List<b.a<T>> f65815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private T f65816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final WeakReference<y> f65817c;

    public ObservableRepository(@d y lifecycleOwner) {
        Lifecycle lifecycle;
        f0.p(lifecycleOwner, "lifecycleOwner");
        this.f65815a = new ArrayList();
        WeakReference<y> weakReference = new WeakReference<>(lifecycleOwner);
        this.f65817c = weakReference;
        y yVar = weakReference.get();
        if (yVar == null || (lifecycle = yVar.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new j(this) { // from class: com.max.hbarchcomponents.ObservableRepository.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ObservableRepository<T> f65818b;

            {
                this.f65818b = this;
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void j(y yVar2) {
                i.d(this, yVar2);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void l(y yVar2) {
                i.c(this, yVar2);
            }

            @Override // androidx.lifecycle.j
            public void onDestroy(@d y owner) {
                if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, bb.c.b.oo, new Class[]{y.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(owner, "owner");
                this.f65818b.b();
                owner.getLifecycle().d(this);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStart(y yVar2) {
                i.e(this, yVar2);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStop(y yVar2) {
                i.f(this, yVar2);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void q(y yVar2) {
                i.a(this, yVar2);
            }
        });
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.mo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<T> it = this.f65815a.iterator();
        while (it.hasNext()) {
            b.a aVar = (b.a) it.next();
            T t10 = this.f65816b;
            if (t10 != null) {
                aVar.a(t10);
            }
        }
    }

    public final void a(@d b.a<T> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.b.jo, new Class[]{b.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        this.f65815a.add(observer);
        T t10 = this.f65816b;
        if (t10 != null) {
            observer.a(t10);
        }
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.no, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f65815a.clear();
    }

    @e
    public final T c() {
        return this.f65816b;
    }

    public final void e(@d b.a<T> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.b.ko, new Class[]{b.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        this.f65815a.remove(observer);
    }

    public final void f(T t10) {
        if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.lo, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f65816b = t10;
        d();
    }
}
