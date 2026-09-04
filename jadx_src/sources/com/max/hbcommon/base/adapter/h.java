package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h<T> extends BaseAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<T> f66744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f66745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f66746d;

    /* JADX INFO: compiled from: CommonAdapter.java */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f66747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f66748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f66749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SparseArray<View> f66750d = new SparseArray<>();

        public a(int i10, View view, int i11) {
            this.f66747a = i10;
            this.f66748b = view;
            this.f66749c = i11;
        }

        public View b() {
            return this.f66748b;
        }

        public int c() {
            return this.f66747a;
        }

        public int d() {
            return this.f66749c;
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
        public View e(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.wy, new Class[]{Integer.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View view = this.f66750d.get(i10);
            if (view != null) {
                return view;
            }
            View viewFindViewById = this.f66748b.findViewById(i10);
            this.f66750d.put(i10, viewFindViewById);
            return viewFindViewById;
        }

        public a f(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.zy, new Class[]{cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            ((ImageView) e(i10)).setImageResource(i11);
            return this;
        }

        public void g(int i10) {
            this.f66749c = i10;
        }

        public a h(int i10, CharSequence charSequence) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), charSequence}, this, changeQuickRedirect, false, bb.c.b.xy, new Class[]{Integer.TYPE, CharSequence.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            ((TextView) e(i10)).setText(charSequence);
            return this;
        }

        public a i(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.yy, new Class[]{cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            ((TextView) e(i10)).setTextColor(i11);
            return this;
        }
    }

    public h(Context context, List<T> list, int i10) {
        this.f66744b = list;
        this.f66745c = LayoutInflater.from(context);
        this.f66746d = i10;
    }

    public List<T> a() {
        return this.f66744b;
    }

    public abstract void b(a aVar, T t10);

    public void c(List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.vy, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f66744b = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.sy, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66744b.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.ty, new Class[]{Integer.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? (T) patchProxyResultProxy.result : this.f66744b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view, viewGroup}, this, changeQuickRedirect, false, bb.c.b.uy, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (view == null) {
            view = this.f66745c.inflate(this.f66746d, viewGroup, false);
            aVar = new a(this.f66746d, view, i10);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            aVar.f66749c = i10;
        }
        b(aVar, getItem(i10));
        return view;
    }
}
