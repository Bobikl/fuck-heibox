package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: MultiTypeCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m<T> extends h<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public m(Context context, List<T> list) {
        super(context, list, -1);
    }

    public abstract int d(int i10, int i11, T t10);

    public abstract int e();

    public abstract int f(int i10, T t10);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.bz, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return i10 >= this.f66744b.size() ? super.getItemViewType(i10) : d(f(i10, this.f66744b.get(i10)), i10, this.f66744b.get(i10));
    }

    @Override // com.max.hbcommon.base.adapter.h, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        h.a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view, viewGroup}, this, changeQuickRedirect, false, bb.c.b.cz, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        int iF = f(i10, getItem(i10));
        if (view == null) {
            view = this.f66745c.inflate(iF, viewGroup, false);
            aVar = new h.a(iF, view, i10);
            view.setTag(aVar);
        } else {
            aVar = (h.a) view.getTag();
            aVar.g(i10);
        }
        b(aVar, getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.az, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : e();
    }
}
