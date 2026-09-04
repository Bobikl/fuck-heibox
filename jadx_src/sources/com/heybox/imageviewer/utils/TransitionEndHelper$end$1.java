package com.heybox.imageviewer.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransitionEndHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TransitionEndHelper$end$1 implements v {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f59763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecyclerView.ViewHolder f59764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f59765d;

    TransitionEndHelper$end$1(j jVar, RecyclerView.ViewHolder viewHolder, yh.a<b2> aVar) {
        this.f59763b = jVar;
        this.f59764c = viewHolder;
        this.f59765d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(yh.a tmp0) {
        if (PatchProxy.proxy(new Object[]{tmp0}, null, changeQuickRedirect, true, 210, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, 209, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(source, "source");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f59763b.getLifecycle().d(this);
            TransitionEndHelper transitionEndHelper = TransitionEndHelper.f59761a;
            TransitionEndHelper.f59762b = false;
            View view = this.f59764c.itemView;
            final yh.a<b2> aVar = this.f59765d;
            view.removeCallbacks(new Runnable() { // from class: com.heybox.imageviewer.utils.e
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEndHelper$end$1.c(aVar);
                }
            });
            View view2 = this.f59764c.itemView;
            f0.n(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            androidx.transition.v.d((ViewGroup) view2);
        }
    }
}
