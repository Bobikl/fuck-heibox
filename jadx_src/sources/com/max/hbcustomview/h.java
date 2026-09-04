package com.max.hbcustomview;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ViewHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public class h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f69126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f69130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<View> f69131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f69133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<Integer, SparseArray<View>> f69134i;

    private h(int i10, View view, ViewGroup viewGroup, int i11, Context context) {
        this.f69127b = -1;
        this.f69126a = context;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i11, viewGroup, false);
        viewInflate.setTag(this);
        r(viewInflate);
        y(i10);
        x(i11);
        this.f69131f = new SparseArray<>();
    }

    private h(int i10, View view, ViewGroup viewGroup, int i11, Context context, int i12) {
        this.f69127b = -1;
        this.f69126a = context;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i11, viewGroup, false);
        viewInflate.setTag(this);
        r(viewInflate);
        y(i10);
        x(i11);
        u(i10);
        this.f69131f = new SparseArray<>();
    }

    public h(Context context, View view) {
        this.f69127b = -1;
        this.f69126a = context;
        this.f69131f = new SparseArray<>();
        r(view);
    }

    public static h f(int i10, View view, ViewGroup viewGroup, int i11, Context context) {
        Object[] objArr = {new Integer(i10), view, viewGroup, new Integer(i11), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Xd, new Class[]{cls, View.class, ViewGroup.class, cls, Context.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (view == null || view.getTag() == null || ((h) view.getTag()).i() != i11) {
            return new h(i10, view, viewGroup, i11, context);
        }
        h hVar = (h) view.getTag();
        hVar.w(hVar.j());
        hVar.y(i10);
        return hVar;
    }

    public static h g(int i10, View view, ViewGroup viewGroup, int i11, Context context, int i12) {
        Object[] objArr = {new Integer(i10), view, viewGroup, new Integer(i11), context, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Yd, new Class[]{cls, View.class, ViewGroup.class, cls, Context.class, cls}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (view == null || ((h) view.getTag()).i() != i11) {
            return new h(i10, view, viewGroup, i11, context, i12);
        }
        h hVar = (h) view.getTag();
        hVar.w(hVar.j());
        hVar.y(i10);
        hVar.u(i12);
        return hVar;
    }

    private SparseArray<View> k(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32148ae, new Class[]{Integer.TYPE}, SparseArray.class);
        if (patchProxyResultProxy.isSupported) {
            return (SparseArray) patchProxyResultProxy.result;
        }
        Map<Integer, SparseArray<View>> mapO = o();
        if (mapO.get(Integer.valueOf(i10)) == null) {
            mapO.put(Integer.valueOf(i10), new SparseArray<>());
        }
        return mapO.get(Integer.valueOf(i10));
    }

    private Map<Integer, SparseArray<View>> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32194ce, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        if (this.f69134i == null) {
            this.f69134i = new HashMap();
        }
        return this.f69134i;
    }

    public boolean A(int i10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.f.f32356je, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean z10 = !TextUtils.isEmpty(str);
        if (z10) {
            D(i10).setText(str);
        }
        return z10;
    }

    public void B(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32402le, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewM = m(i10);
        if (viewM.getVisibility() != 0) {
            viewM.setVisibility(0);
        }
    }

    public void C(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32379ke, new Class[]{View.class}, Void.TYPE).isSupported || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }

    public TextView D(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32264fe, new Class[]{Integer.TYPE}, TextView.class);
        return patchProxyResultProxy.isSupported ? (TextView) patchProxyResultProxy.result : (TextView) m(i10);
    }

    public Button a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32333ie, new Class[]{Integer.TYPE}, Button.class);
        return patchProxyResultProxy.isSupported ? (Button) patchProxyResultProxy.result : (Button) m(i10);
    }

    public CheckBox b(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32287ge, new Class[]{Integer.TYPE}, CheckBox.class);
        return patchProxyResultProxy.isSupported ? (CheckBox) patchProxyResultProxy.result : (CheckBox) m(i10);
    }

    public View c() {
        return this.f69130e;
    }

    public int d() {
        return this.f69132g;
    }

    public <T extends View> T e(int... iArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, bb.c.f.f32218de, new Class[]{int[].class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        T tM = (T) this.f69131f.get(iArr[iArr.length - 1]);
        if (tM == null) {
            tM = m(iArr[0]);
            for (int i10 = 1; i10 < iArr.length; i10++) {
                tM = (T) tM.findViewById(iArr[i10]);
            }
        }
        return (T) tM;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.f32494pe, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f69130e.equals(((h) obj).f69130e);
    }

    public int h() {
        return this.f69127b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32517qe, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69130e.hashCode();
    }

    public int i() {
        return this.f69129d;
    }

    public int j() {
        return this.f69128c;
    }

    public Object l() {
        return this.f69133h;
    }

    public <T extends View> T m(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Zd, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        T t10 = (T) this.f69131f.get(i10);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) c().findViewById(i10);
        this.f69131f.put(i10, t11);
        return t11;
    }

    public <T extends View> T n(View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32171be, new Class[]{View.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        SparseArray<View> sparseArrayK = k(view.hashCode());
        T t10 = (T) sparseArrayK.get(i10);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) view.findViewById(i10);
        sparseArrayK.put(i10, t11);
        return t11;
    }

    public ImageView p(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32241ee, new Class[]{Integer.TYPE}, ImageView.class);
        return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : (ImageView) m(i10);
    }

    public RadioButton q(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32310he, new Class[]{Integer.TYPE}, RadioButton.class);
        return patchProxyResultProxy.isSupported ? (RadioButton) patchProxyResultProxy.result : (RadioButton) m(i10);
    }

    public void r(View view) {
        this.f69130e = view;
    }

    public void s(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32425me, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewM = m(i10);
        if (viewM.getVisibility() != 8) {
            viewM.setVisibility(8);
        }
    }

    public void t(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32448ne, new Class[]{View.class}, Void.TYPE).isSupported || view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public void u(int i10) {
        this.f69132g = i10;
    }

    public void v(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32471oe, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        c().setOnClickListener(onClickListener);
    }

    public void w(int i10) {
        this.f69127b = i10;
    }

    public void x(int i10) {
        this.f69129d = i10;
    }

    public void y(int i10) {
        this.f69128c = i10;
    }

    public void z(Object obj) {
        this.f69133h = obj;
    }
}
