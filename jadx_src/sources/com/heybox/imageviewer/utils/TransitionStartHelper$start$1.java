package com.heybox.imageviewer.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransitionStartHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TransitionStartHelper$start$1 implements v {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f59772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecyclerView.ViewHolder f59773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f59774d;

    TransitionStartHelper$start$1(y yVar, RecyclerView.ViewHolder viewHolder, yh.a<b2> aVar) {
        this.f59772b = yVar;
        this.f59773c = viewHolder;
        this.f59774d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(yh.a tmp0) {
        if (PatchProxy.proxy(new Object[]{tmp0}, null, changeQuickRedirect, true, bb.c.b.f30919s1, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.b.f30897r1, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(source, "source");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f59772b.getLifecycle().d(this);
            TransitionStartHelper transitionStartHelper = TransitionStartHelper.f59770a;
            TransitionStartHelper.f59771b = false;
            View view = this.f59773c.itemView;
            final yh.a<b2> aVar = this.f59774d;
            view.removeCallbacks(new Runnable() { // from class: com.heybox.imageviewer.utils.g
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionStartHelper$start$1.c(aVar);
                }
            });
            View view2 = this.f59773c.itemView;
            f0.n(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            androidx.transition.v.d((ViewGroup) view2);
        }
    }
}
