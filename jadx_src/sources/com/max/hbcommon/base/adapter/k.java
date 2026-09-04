package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ELVSectionCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k<T> extends BaseExpandableListAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66764f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseArray<String> f66765a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LayoutInflater f66766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseExpandableListAdapter f66767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66769e;

    public k(Context context, BaseExpandableListAdapter baseExpandableListAdapter, int i10, int i11) {
        this.f66766b = LayoutInflater.from(context);
        this.f66767c = baseExpandableListAdapter;
        this.f66768d = i10;
        this.f66769e = i11;
        d();
    }

    private String c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Xy, new Class[]{Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f66765a.get(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        String strValueAt;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Vy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int groupCount = this.f66767c.getGroupCount();
        this.f66765a.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < groupCount; i11++) {
            String strB = b(this.f66767c.getGroup(i11));
            int i12 = 0;
            while (i12 < this.f66765a.size() && ((strValueAt = this.f66765a.valueAt(i12)) == null || !strValueAt.equals(strB))) {
                i12++;
            }
            if (i12 >= this.f66765a.size()) {
                this.f66765a.put(i11 + i10, strB);
                i10++;
            }
        }
    }

    public int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Wy, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f66765a.size(); i12++) {
            if (this.f66765a.keyAt(i12) < i10) {
                i11++;
            }
        }
        return i10 - i11;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public boolean areAllItemsEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qy, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66767c.areAllItemsEnabled() && this.f66765a.size() == 0;
    }

    public abstract String b(T t10);

    public void e(View view, String str, h.a aVar, int i10) {
        if (PatchProxy.proxy(new Object[]{view, str, aVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ty, new Class[]{View.class, String.class, h.a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aVar.h(this.f66769e, str);
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Ly, new Class[]{cls, cls}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.f66767c.getChild(a(i10), i11);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Ny, new Class[]{cls, cls}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f66767c.getChildId(a(i10), i11);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i10, int i11, boolean z10, View view, ViewGroup viewGroup) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Uy, new Class[]{cls, cls, Boolean.TYPE, View.class, ViewGroup.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.f66767c.getChildView(a(i10), i11, z10, view, viewGroup);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Jy, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = a(i10);
        if (this.f66765a.get(i10) == null) {
            return this.f66767c.getChildrenCount(iA);
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ky, new Class[]{Integer.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.f66767c.getGroup(a(i10));
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Iy, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66767c.getGroupCount() + this.f66765a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.My, new Class[]{Integer.TYPE}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f66767c.getGroupId(a(i10));
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Oy, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = a(i10);
        if (this.f66765a.get(i10) == null) {
            return this.f66767c.getGroupType(iA) + 1;
        }
        return 0;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupTypeCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Py, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66767c.getGroupTypeCount() + 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i10, boolean z10, View view, ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), view, viewGroup}, this, changeQuickRedirect, false, bb.c.b.Sy, new Class[]{Integer.TYPE, Boolean.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        h.a aVar = null;
        if (getGroupType(i10) != 0) {
            view = this.f66767c.getGroupView(a(i10), z10, view, viewGroup);
        } else if (view == null) {
            view = this.f66766b.inflate(this.f66768d, viewGroup, false);
            aVar = new h.a(this.f66768d, view, i10);
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

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i10, int i11) {
        return true;
    }

    @Override // android.widget.BaseExpandableListAdapter
    public void notifyDataSetChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ry, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66767c.notifyDataSetChanged();
        d();
        super.notifyDataSetChanged();
    }
}
