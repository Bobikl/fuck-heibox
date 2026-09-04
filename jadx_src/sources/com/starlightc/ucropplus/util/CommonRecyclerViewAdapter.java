package com.starlightc.ucropplus.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CommonRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CommonRecyclerViewAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<? extends T> dataList;
    private final int layoutID;

    /* JADX INFO: compiled from: CommonRecyclerViewAdapter.kt */
    public static final class CommonViewHolder extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonViewHolder(@d View item) {
            super(item);
            f0.p(item, "item");
        }

        @d
        public final <V extends View> V findViewById(@d0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50910, new Class[]{Integer.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (V) patchProxyResultProxy.result;
            }
            V v10 = (V) this.itemView.findViewById(i10);
            f0.o(v10, "findViewById(...)");
            return v10;
        }
    }

    public CommonRecyclerViewAdapter(@d List<? extends T> dataList, @i0 int i10) {
        f0.p(dataList, "dataList");
        this.dataList = dataList;
        this.layoutID = i10;
    }

    public abstract void bindViewHolder(@d CommonViewHolder commonViewHolder, T t10, int i10);

    @d
    public final List<T> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50907, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.dataList.size();
    }

    public final int getLayoutID() {
        return this.layoutID;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 50909, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((CommonViewHolder) viewHolder, i10);
    }

    public void onBindViewHolder(@d CommonViewHolder holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 50906, new Class[]{CommonViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        bindViewHolder(holder, this.dataList.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 50908, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    public CommonViewHolder onCreateViewHolder(@d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 50905, new Class[]{ViewGroup.class, Integer.TYPE}, CommonViewHolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonViewHolder) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.layoutID, parent, false);
        f0.m(viewInflate);
        return new CommonViewHolder(viewInflate);
    }

    public final void setDataList(@d List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50904, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.dataList = list;
    }
}
