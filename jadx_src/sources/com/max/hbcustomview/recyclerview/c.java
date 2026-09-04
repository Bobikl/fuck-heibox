package com.max.hbcustomview.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UniversalMultiTypeRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T> extends RecyclerView.Adapter<dc.b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private List<T> dataList;

    public c(@dl.d List<T> dataList) {
        f0.p(dataList, "dataList");
        this.dataList = dataList;
    }

    public abstract void bindViewHolder(@dl.d dc.b bVar, T t10, int i10);

    @dl.d
    public final List<T> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Pl, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ql, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : provideLayoutID(i10, this.dataList.get(i10));
    }

    public final void loadMore(@dl.d List<? extends T> data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, bb.c.f.Rl, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        int size = data.size();
        int size2 = this.dataList.size();
        this.dataList.addAll(data);
        notifyItemRangeChanged(size2, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Tl, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((dc.b) viewHolder, i10);
    }

    public void onBindViewHolder(@dl.d dc.b holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ol, new Class[]{dc.b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        bindViewHolder(holder, this.dataList.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Sl, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public dc.b onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Nl, new Class[]{ViewGroup.class, Integer.TYPE}, dc.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (dc.b) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(i10, parent, false);
        f0.m(viewInflate);
        return new dc.b(viewInflate);
    }

    public abstract int provideLayoutID(int i10, T t10);

    public final void setDataList(@dl.d List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Ml, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.dataList = list;
    }
}
