package com.max.hbcommon.base.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BigBrotherViewHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
public class g extends s.e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f66741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d l3.c binding) {
        super(-1, binding.getRoot());
        f0.p(binding, "binding");
    }

    public final void A(boolean z10) {
        this.f66743i = z10;
    }

    public void f() {
        this.f66743i = true;
    }

    public final boolean r() {
        return this.f66742h;
    }

    public final boolean s() {
        return this.f66741g;
    }

    public final boolean t() {
        return this.f66743i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ry, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return super.toString() + ", hasRecycled = " + this.f66743i + ", hasPreBind = " + this.f66741g + ", hasOnBind = " + this.f66742h;
    }

    public void u() {
    }

    public void v(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @dl.e Object obj) {
        if (PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, bb.c.b.qy, new Class[]{Context.class, s.class, s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        com.max.heybox.hblog.g.f74531b.q("BigBotherViewHolder, onBind " + viewHolder + " hasPreBind = " + this.f66741g + ", hasRecycled = " + this.f66743i);
        if (!this.f66741g) {
            x(context, adapter, viewHolder, obj);
        }
        this.f66742h = true;
    }

    public void w() {
    }

    @dl.e
    public Pair<l, RecyclerView> x(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, bb.c.b.py, new Class[]{Context.class, s.class, s.e.class, Object.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        this.f66741g = true;
        return null;
    }

    public final void y(boolean z10) {
        this.f66742h = z10;
    }

    public final void z(boolean z10) {
        this.f66741g = z10;
    }
}
