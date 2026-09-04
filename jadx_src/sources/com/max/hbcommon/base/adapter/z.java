package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SectionCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z<T> extends BaseAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f66860g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SparseArray<String> f66861b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LayoutInflater f66862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BaseAdapter f66863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66865f;

    public z(Context context, BaseAdapter baseAdapter, int i10, int i11) {
        this.f66862c = LayoutInflater.from(context);
        this.f66863d = baseAdapter;
        this.f66864e = i10;
        this.f66865f = i11;
        d();
    }

    private String c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.J1, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f66861b.get(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        String strValueAt;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.H1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int count = this.f66863d.getCount();
        this.f66861b.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            String strB = b(this.f66863d.getItem(i11));
            int i12 = 0;
            while (i12 < this.f66861b.size() && ((strValueAt = this.f66861b.valueAt(i12)) == null || !strValueAt.equals(strB))) {
                i12++;
            }
            if (i12 >= this.f66861b.size()) {
                this.f66861b.put(i11 + i10, strB);
                i10++;
            }
        }
    }

    public int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.I1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f66861b.size(); i12++) {
            if (this.f66861b.keyAt(i12) < i10) {
                i11++;
            }
        }
        return i10 - i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.C1, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66863d.areAllItemsEnabled() && this.f66861b.size() == 0;
    }

    public abstract String b(T t10);

    public void e(View view, String str, h.a aVar, int i10) {
        if (PatchProxy.proxy(new Object[]{view, str, aVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.G1, new Class[]{View.class, String.class, h.a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aVar.h(this.f66865f, str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31628x1, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66863d.getCount() + this.f66861b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31650y1, new Class[]{Integer.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.f66863d.getItem(a(i10));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 2158, new Class[]{Integer.TYPE}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f66863d.getItemId(a(i10));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.B1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = a(i10);
        if (this.f66861b.get(i10) == null) {
            return this.f66863d.getItemViewType(iA) + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view, viewGroup}, this, changeQuickRedirect, false, bb.c.d.F1, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        h.a aVar = null;
        if (getItemViewType(i10) != 0) {
            view = this.f66863d.getView(a(i10), view, viewGroup);
        } else if (view == null) {
            view = this.f66862c.inflate(this.f66864e, viewGroup, false);
            aVar = new h.a(this.f66864e, view, i10);
            view.setTag(aVar);
        } else {
            aVar = (h.a) view.getTag();
            aVar.g(i10);
        }
        if (aVar != null) {
            e(view, c(i10), aVar, i10);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.A1, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66863d.getViewTypeCount() + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.D1, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66861b.get(i10) == null && this.f66863d.isEnabled(a(i10));
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.E1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66863d.notifyDataSetChanged();
        d();
        super.notifyDataSetChanged();
    }
}
