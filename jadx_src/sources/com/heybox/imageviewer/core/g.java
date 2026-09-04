package com.heybox.imageviewer.core;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: SimpleDataProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nSimpleDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDataProvider.kt\ncom/heybox/imageviewer/core/SimpleDataProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n350#2,7:41\n350#2,7:48\n766#2:55\n857#2,2:56\n*S KotlinDebug\n*F\n+ 1 SimpleDataProvider.kt\ncom/heybox/imageviewer/core/SimpleDataProvider\n*L\n17#1:41,7\n28#1:48,7\n38#1:55\n38#1:56,2\n*E\n"})
public final class g implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private d f59744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<? extends d> f59745b;

    public g(@dl.d d init, @dl.d List<? extends d> list) {
        f0.p(init, "init");
        f0.p(list, "list");
        this.f59744a = init;
        this.f59745b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l callback, List result) {
        if (PatchProxy.proxy(new Object[]{callback, result}, null, changeQuickRedirect, true, 165, new Class[]{l.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "$callback");
        f0.p(result, "$result");
        callback.invoke(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l callback, List result) {
        if (PatchProxy.proxy(new Object[]{callback, result}, null, changeQuickRedirect, true, 166, new Class[]{l.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "$callback");
        f0.p(result, "$result");
        callback.invoke(result);
    }

    @Override // com.heybox.imageviewer.core.a
    public void a(@dl.d List<? extends d> exclude, @dl.d d target) {
        if (PatchProxy.proxy(new Object[]{exclude, target}, this, changeQuickRedirect, false, bb.c.b.f30690i0, new Class[]{List.class, d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(exclude, "exclude");
        f0.p(target, "target");
        this.f59744a = target;
        List<? extends d> list = this.f59745b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!exclude.contains((d) obj)) {
                arrayList.add(obj);
            }
        }
        this.f59745b = arrayList;
    }

    @Override // com.heybox.imageviewer.core.a
    @dl.d
    public List<d> b() {
        return this.f59745b;
    }

    @Override // com.heybox.imageviewer.core.a
    public void c(long j10, @dl.d final l<? super List<? extends d>, b2> callback) {
        final List<? extends d> listSubList;
        if (PatchProxy.proxy(new Object[]{new Long(j10), callback}, this, changeQuickRedirect, false, 162, new Class[]{Long.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        Iterator<? extends d> it = this.f59745b.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else {
                if (it.next().id() == j10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (i10 < 0) {
            listSubList = CollectionsKt__CollectionsKt.E();
        } else {
            List<? extends d> list = this.f59745b;
            listSubList = list.subList(i10 + 1, list.size());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.heybox.imageviewer.core.e
            @Override // java.lang.Runnable
            public final void run() {
                g.h(callback, listSubList);
            }
        });
    }

    @Override // com.heybox.imageviewer.core.a
    @dl.d
    public List<d> d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 161, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : s.k(this.f59744a);
    }

    @Override // com.heybox.imageviewer.core.a
    public void e(long j10, @dl.d final l<? super List<? extends d>, b2> callback) {
        final List<? extends d> listSubList;
        if (PatchProxy.proxy(new Object[]{new Long(j10), callback}, this, changeQuickRedirect, false, 163, new Class[]{Long.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        Iterator<? extends d> it = this.f59745b.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else {
                if (it.next().id() == j10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (i10 < 0) {
            listSubList = CollectionsKt__CollectionsKt.E();
        } else {
            List<? extends d> list = this.f59745b;
            listSubList = list.subList(0, Math.min(i10, list.size()));
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.heybox.imageviewer.core.f
            @Override // java.lang.Runnable
            public final void run() {
                g.i(callback, listSubList);
            }
        });
    }
}
