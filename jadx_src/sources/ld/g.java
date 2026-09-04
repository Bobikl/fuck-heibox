package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbsearchItemSearchHistoryHeaderBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f131373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f131374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final View f131375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final LinearLayout f131376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final LinearLayout f131377f;

    private g(@n0 RelativeLayout relativeLayout, @n0 TextView textView, @n0 TextView textView2, @n0 View view, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2) {
        this.f131372a = relativeLayout;
        this.f131373b = textView;
        this.f131374c = textView2;
        this.f131375d = view;
        this.f131376e = linearLayout;
        this.f131377f = linearLayout2;
    }

    @n0
    public static g a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.K8, new Class[]{View.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_clear_all;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.tv_done_clear_action;
            TextView textView2 = (TextView) l3.d.a(view, i10);
            if (textView2 != null && (viewA = l3.d.a(view, (i10 = R.id.v_vg_clear_delegate))) != null) {
                i10 = R.id.vg_clear;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.vg_clear_action;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout2 != null) {
                        return new g((RelativeLayout) view, textView, textView2, viewA, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static g c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.I8, new Class[]{LayoutInflater.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static g d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.J8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_item_search_history_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131372a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.L8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
