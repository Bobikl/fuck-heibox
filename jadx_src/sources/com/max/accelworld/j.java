package com.max.accelworld;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: AccelWorldABTest.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nAccelWorldABTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldABTest.kt\ncom/max/accelworld/DoClass\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n13309#2,2:93\n1855#3,2:95\n1855#3,2:97\n*S KotlinDebug\n*F\n+ 1 AccelWorldABTest.kt\ncom/max/accelworld/DoClass\n*L\n14#1:93,2\n22#1:95,2\n26#1:97,2\n*E\n"})
public final class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private List<View> f64940a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<View> f64941b = new ArrayList();

    public final void a(@dl.d View... views) {
        if (PatchProxy.proxy(new Object[]{views}, this, changeQuickRedirect, false, bb.c.b.Qf, new Class[]{View[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(views, "views");
        x.p0(this.f64940a, views);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@dl.d l<? super View, b2> action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, bb.c.b.Sf, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        Iterator<T> it = this.f64940a.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@dl.d l<? super View, b2> action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, bb.c.b.Tf, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        Iterator<T> it = this.f64941b.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public final void d(@dl.d View... views) {
        if (PatchProxy.proxy(new Object[]{views}, this, changeQuickRedirect, false, bb.c.b.Rf, new Class[]{View[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(views, "views");
        for (View view : views) {
            if (!this.f64941b.contains(view)) {
                this.f64941b.add(view);
            }
        }
    }
}
