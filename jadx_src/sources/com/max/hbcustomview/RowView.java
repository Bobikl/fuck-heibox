package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RowView<T> extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f68783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<T> f68784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected List<View> f68786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<View> f68787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f68788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d<T> f68789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e<T> f68790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f68792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f68793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f68794n;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f68795b;

        a(h hVar) {
            this.f68795b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32306ha, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d dVar = RowView.this.f68789i;
            h hVar = this.f68795b;
            dVar.a(hVar, view, RowView.this.g(hVar.j()));
        }
    }

    public class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f68797b;

        b(h hVar) {
            this.f68797b = hVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32329ia, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            e eVar = RowView.this.f68790j;
            h hVar = this.f68797b;
            return eVar.a(hVar, view, RowView.this.g(hVar.j()));
        }
    }

    public interface c<E> {
        void a(h hVar, E e10);

        void b(h hVar, E e10);
    }

    public interface d<E> {
        void a(h hVar, View view, E e10);
    }

    public interface e<E> {
        boolean a(h hVar, View view, E e10);
    }

    public RowView(Context context) {
        super(context);
        this.f68786f = new ArrayList();
        this.f68787g = new ArrayList();
        this.f68788h = "RowView";
        this.f68791k = true;
        this.f68792l = true;
        this.f68794n = true;
    }

    public RowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68786f = new ArrayList();
        this.f68787g = new ArrayList();
        this.f68788h = "RowView";
        this.f68791k = true;
        this.f68792l = true;
        this.f68794n = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.G2);
        this.f68782b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RowView_row_layout, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RowView_divider_layout, -1);
        this.f68785e = resourceId;
        this.f68791k = resourceId != -1;
        Log.d(this.f68788h, "RowsViewSS: " + this.f68782b + "::" + this.f68785e);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32214da, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iF = this.f68791k ? f(h(this.f68784d)) : 0;
        if (iF == 0) {
            this.f68787g.clear();
            return;
        }
        int size = iF - this.f68787g.size();
        if (size > 0) {
            while (i10 < size) {
                this.f68787g.add(getDividierView());
                i10++;
            }
        } else {
            while (i10 < size * (-1)) {
                List<View> list = this.f68787g;
                list.remove(list.size() - 1);
                i10++;
            }
        }
    }

    private void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32237ea, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iE = e() - this.f68786f.size();
        if (iE > 0) {
            for (int i10 = 0; i10 < iE; i10++) {
                View rowView = getRowView();
                if (this.f68792l) {
                    this.f68786f.add(0, rowView);
                } else {
                    this.f68786f.add(rowView);
                }
            }
            Log.d(this.f68788h, "RowsViewSS: add " + iE + "rowView");
            return;
        }
        if (iE >= 0) {
            Log.d(this.f68788h, "RowsViewSS: keep rowView");
            return;
        }
        for (int i11 = 0; i11 < iE * (-1); i11++) {
            List<View> list = this.f68786f;
            list.remove(list.size() - 1);
        }
        Log.d(this.f68788h, "RowsViewSS: remoview " + iE + "rowView");
    }

    private int f(int i10) {
        if (i10 < 2) {
            return 0;
        }
        return i10 - 1;
    }

    private View getDividierView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32283ga, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.f68785e != -1) {
            return LayoutInflater.from(getContext()).inflate(this.f68785e, (ViewGroup) this, false);
        }
        return null;
    }

    private View getRowView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32260fa, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.f68782b == -1) {
            return null;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.f68782b, (ViewGroup) this, false);
        h hVar = new h(getContext(), viewInflate);
        hVar.y(this.f68786f.size());
        viewInflate.setTag(R.id.tag_viewholder, hVar);
        c cVar = this.f68783c;
        if (cVar != null) {
            cVar.b(hVar, g(this.f68786f.size()));
        }
        if (this.f68789i != null) {
            viewInflate.setOnClickListener(new a(hVar));
        }
        if (this.f68790j != null) {
            viewInflate.setOnLongClickListener(new b(hVar));
        }
        return viewInflate;
    }

    public static int h(List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.f.f32144aa, new Class[]{List.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void k(boolean z10) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32167ba, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            while (i10 < this.f68786f.size()) {
                l(i10);
                i10++;
            }
            if (this.f68793m != null) {
                removeViewAt(getChildCount() - 1);
                addView(this.f68793m);
                return;
            }
            return;
        }
        removeAllViews();
        if (e() == 0) {
            this.f68786f.clear();
            this.f68787g.clear();
        } else {
            d();
            c();
        }
        if (this.f68791k) {
            int size = this.f68786f.size() + this.f68787g.size();
            Log.d("RowsView", "onRefresh::" + this.f68786f.size() + "::" + this.f68787g.size());
            while (i10 < size) {
                int i11 = i10 / 2;
                if (i10 % 2 == 0) {
                    View viewL = l(i11);
                    if (viewL != null) {
                        addView(viewL);
                    }
                } else {
                    addView(this.f68787g.get(i11));
                }
                i10++;
            }
        } else {
            while (i10 < this.f68786f.size()) {
                View viewL2 = l(i10);
                if (viewL2 != null) {
                    addView(viewL2);
                }
                i10++;
            }
        }
        View view = this.f68793m;
        if (view != null) {
            addView(view);
        }
    }

    public int e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.W9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<T> list = this.f68784d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T g(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.X9, new Class[]{Integer.TYPE}, Object.class);
        return patchProxyResultProxy.isSupported ? (T) patchProxyResultProxy.result : this.f68784d.get(i10);
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Z9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k(true);
    }

    public void j(List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Y9, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f68794n) {
            this.f68784d = list;
        } else if (list == null || list.size() <= 0) {
            this.f68784d = null;
        } else {
            this.f68784d = (List) ((ArrayList) list).clone();
        }
        int iH = h(this.f68784d);
        k((iH == this.f68786f.size()) && (!this.f68791k ? this.f68787g.size() == 0 : this.f68787g.size() == f(iH)));
    }

    public View l(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32190ca, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f68786f.get(i10);
        if (this.f68783c != null) {
            h hVar = (h) view.getTag(R.id.tag_viewholder);
            hVar.y(i10);
            this.f68783c.a(hVar, g(i10));
        }
        return view;
    }

    public void setCloneList(boolean z10) {
        this.f68794n = z10;
    }

    public void setOnItemLongClickListner(e<T> eVar) {
        this.f68790j = eVar;
    }

    public void setOnItemclickListener(d<T> dVar) {
        this.f68789i = dVar;
    }

    public void setRowLayoutId(int i10) {
        this.f68782b = i10;
    }

    public void setViewSetter(c<T> cVar) {
        this.f68783c = cVar;
    }

    public void setmFooter(View view) {
        this.f68793m = view;
    }
}
