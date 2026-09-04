package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFilterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f109158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GridView f109159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109160d;

    private c50(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 GridView gridView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f109157a = linearLayout;
        this.f109158b = oVar;
        this.f109159c = gridView;
        this.f109160d = linearLayout2;
    }

    @androidx.annotation.n0
    public static c50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20600, new Class[]{View.class}, c50.class);
        if (patchProxyResultProxy.isSupported) {
            return (c50) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider_top;
        View viewA = l3.d.a(view, R.id.divider_top);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            GridView gridView = (GridView) l3.d.a(view, R.id.gv_filter);
            if (gridView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new c50(linearLayout, oVarA, gridView, linearLayout);
            }
            i10 = R.id.gv_filter;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20598, new Class[]{LayoutInflater.class}, c50.class);
        return patchProxyResultProxy.isSupported ? (c50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20599, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c50.class);
        if (patchProxyResultProxy.isSupported) {
            return (c50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109157a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20601, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
