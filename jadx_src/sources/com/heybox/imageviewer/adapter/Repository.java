package com.heybox.imageviewer.adapter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.paging.Pager;
import androidx.paging.n0;
import androidx.paging.o0;
import androidx.paging.p0;
import androidx.paging.q0;
import com.heybox.imageviewer.core.Components;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Repository.kt\ncom/heybox/imageviewer/adapter/Repository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class Repository {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final z f59704a = b0.c(new yh.a<com.heybox.imageviewer.core.a>() { // from class: com.heybox.imageviewer.adapter.Repository$dataProvider$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public final com.heybox.imageviewer.core.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 107, new Class[0], com.heybox.imageviewer.core.a.class);
            return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.a) patchProxyResultProxy.result : Components.f59730a.e();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.core.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.heybox.imageviewer.core.a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 108, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final i0<List<com.heybox.imageviewer.core.d>> f59705b = new i0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final LiveData<o0<com.heybox.imageviewer.core.d>> f59706c = p0.d(new Pager(new n0(1, 0, false, 0, 0, 0, 62, null), null, new yh.a<q0<Long, com.heybox.imageviewer.core.d>>() { // from class: com.heybox.imageviewer.adapter.Repository$pagingData$1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @d
        public final q0<Long, com.heybox.imageviewer.core.d> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 117, new Class[0], q0.class);
            return patchProxyResultProxy.isSupported ? (q0) patchProxyResultProxy.result : Repository.a(this.f59717b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.paging.q0<java.lang.Long, com.heybox.imageviewer.core.d>, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ q0<Long, com.heybox.imageviewer.core.d> invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 118, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    }));

    public static final /* synthetic */ Repository$dataSource$1 a(Repository repository) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{repository}, null, changeQuickRedirect, true, 106, new Class[]{Repository.class}, Repository$dataSource$1.class);
        return patchProxyResultProxy.isSupported ? (Repository$dataSource$1) patchProxyResultProxy.result : repository.d();
    }

    public static final /* synthetic */ com.heybox.imageviewer.core.a c(Repository repository) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{repository}, null, changeQuickRedirect, true, 105, new Class[]{Repository.class}, com.heybox.imageviewer.core.a.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.a) patchProxyResultProxy.result : repository.e();
    }

    private final Repository$dataSource$1 d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 103, new Class[0], Repository$dataSource$1.class);
        return patchProxyResultProxy.isSupported ? (Repository$dataSource$1) patchProxyResultProxy.result : new Repository$dataSource$1(this);
    }

    private final com.heybox.imageviewer.core.a e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 101, new Class[0], com.heybox.imageviewer.core.a.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.a) patchProxyResultProxy.result : (com.heybox.imageviewer.core.a) this.f59704a.getValue();
    }

    @d
    public final LiveData<o0<com.heybox.imageviewer.core.d>> f() {
        return this.f59706c;
    }

    @d
    public final List<com.heybox.imageviewer.core.d> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 102, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<com.heybox.imageviewer.core.d> listF = this.f59705b.f();
        return listF == null ? CollectionsKt__CollectionsKt.E() : listF;
    }

    public final void h(@d a adapter, @d List<? extends com.heybox.imageviewer.core.d> exclude, @d yh.a<b2> emptyCallback) {
        Object obj;
        com.heybox.imageviewer.core.d dVarPrevious;
        if (PatchProxy.proxy(new Object[]{adapter, exclude, emptyCallback}, this, changeQuickRedirect, false, 104, new Class[]{a.class, List.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(adapter, "adapter");
        f0.p(exclude, "exclude");
        f0.p(emptyCallback, "emptyCallback");
        Iterator<T> it = exclude.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long jId = ((com.heybox.imageviewer.core.d) it.next()).id();
        while (it.hasNext()) {
            long jId2 = ((com.heybox.imageviewer.core.d) it.next()).id();
            if (jId < jId2) {
                jId = jId2;
            }
        }
        List<com.heybox.imageviewer.core.d> listG = g();
        ListIterator<com.heybox.imageviewer.core.d> listIterator = listG.listIterator(listG.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                dVarPrevious = null;
                break;
            }
            dVarPrevious = listIterator.previous();
        } while (!(dVarPrevious.id() < jId));
        com.heybox.imageviewer.core.d dVar = dVarPrevious;
        if (dVar == null) {
            for (Object obj2 : listG) {
                if (((com.heybox.imageviewer.core.d) obj2).id() > jId) {
                    obj = obj2;
                    break;
                }
            }
            dVar = (com.heybox.imageviewer.core.d) obj;
            if (dVar == null) {
                b2 b2Var = b2.f124493a;
                emptyCallback.invoke();
                return;
            }
        }
        this.f59705b.r(s.k(dVar));
        e().a(exclude, dVar);
        adapter.r();
    }
}
