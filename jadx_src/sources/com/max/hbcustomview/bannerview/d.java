package com.max.hbcustomview.bannerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseBannerAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d<T> extends RecyclerView.Adapter<e<T>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f69012e = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<T> f69013b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BannerViewPager.b f69015d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(e eVar, View view) {
        if (PatchProxy.proxy(new Object[]{eVar, view}, this, changeQuickRedirect, false, bb.c.f.f32519qg, new Class[]{e.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        int adapterPosition = eVar.getAdapterPosition();
        if (this.f69015d == null || adapterPosition == -1) {
            return;
        }
        this.f69015d.a(view, xb.a.c(eVar.getAdapterPosition(), r()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32381kg, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!this.f69014c || r() <= 1) {
            return r();
        }
        return 1000;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32358jg, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : s(xb.a.c(i10, r()));
    }

    public abstract void n(e<T> eVar, T t10, int i10, int i11);

    public e<T> o(@n0 ViewGroup viewGroup, View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32450ng, new Class[]{ViewGroup.class, View.class, Integer.TYPE}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : new e<>(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32473og, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v((e) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32496pg, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : w(viewGroup, i10);
    }

    List<T> p() {
        return this.f69013b;
    }

    @i0
    public abstract int q(int i10);

    public int r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32427mg, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69013b.size();
    }

    public int s(int i10) {
        return 0;
    }

    public boolean t() {
        return this.f69014c;
    }

    public final void v(@n0 e<T> eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32334ig, new Class[]{e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iC = xb.a.c(i10, r());
        n(eVar, this.f69013b.get(iC), iC, r());
    }

    @n0
    public final e<T> w(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32312hg, new Class[]{ViewGroup.class, Integer.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(q(i10) != -1 ? q(i10) : R.layout.layout_empty, viewGroup, false);
        final e<T> eVarO = o(viewGroup, viewInflate, i10);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcustomview.bannerview.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69010b.u(eVarO, view);
            }
        });
        return eVarO;
    }

    void x(boolean z10) {
        this.f69014c = z10;
    }

    void y(List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.f32404lg, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f69013b.clear();
        this.f69013b.addAll(list);
    }

    void z(BannerViewPager.b bVar) {
        this.f69015d = bVar;
    }
}
