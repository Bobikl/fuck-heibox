package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: ELVCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j<T> extends BaseExpandableListAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<T> f66760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f66761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66763d;

    public j(Context context, List<T> list, int i10, int i11) {
        this.f66760a = list;
        this.f66761b = LayoutInflater.from(context);
        this.f66762c = i10;
        this.f66763d = i11;
    }

    public abstract Object a(int i10, int i11, T t10);

    public abstract int b(int i10, T t10);

    public abstract void c(int i10, int i11, h.a aVar, T t10);

    public abstract void d(int i10, h.a aVar, T t10);

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Fy, new Class[]{cls, cls}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(i10, i11, this.f66760a.get(i10));
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i10, int i11) {
        return i11;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i10, int i11, boolean z10, View view, ViewGroup viewGroup) {
        h.a aVar;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Hy, new Class[]{cls, cls, Boolean.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (view == null) {
            view = this.f66761b.inflate(this.f66763d, viewGroup, false);
            aVar = new h.a(this.f66763d, view, i10);
            view.setTag(aVar);
        } else {
            aVar = (h.a) view.getTag();
            aVar.g(i11);
        }
        c(i10, i11, aVar, getGroup(i10));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Dy, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b(i10, this.f66760a.get(i10));
    }

    @Override // android.widget.ExpandableListAdapter
    public T getGroup(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ey, new Class[]{Integer.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? (T) patchProxyResultProxy.result : this.f66760a.get(i10);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cy, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66760a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i10) {
        return i10;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i10, boolean z10, View view, ViewGroup viewGroup) {
        h.a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), view, viewGroup}, this, changeQuickRedirect, false, bb.c.b.Gy, new Class[]{Integer.TYPE, Boolean.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (view == null) {
            view = this.f66761b.inflate(this.f66762c, viewGroup, false);
            aVar = new h.a(this.f66762c, view, i10);
            view.setTag(aVar);
        } else {
            aVar = (h.a) view.getTag();
            aVar.g(i10);
        }
        d(i10, aVar, getGroup(i10));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i10, int i11) {
        return true;
    }
}
