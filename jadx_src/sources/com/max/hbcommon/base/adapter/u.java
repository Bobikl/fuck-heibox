package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: RVMultiTypeCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u<T> extends s<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public u(Context context, List<T> list) {
        super(context, list, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31174d0, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : m(i10, this.mDataList.get(i10));
    }

    public abstract int m(int i10, T t10);

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31197e0, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31150c0, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(i10, viewGroup, false);
        s.e eVar = new s.e(i10, viewInflate);
        setListener(viewGroup, i10, viewInflate, eVar);
        return eVar;
    }
}
