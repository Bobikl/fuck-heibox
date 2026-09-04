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
import mb.q;

/* JADX INFO: compiled from: HbsearchFragmentSingleSearchBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final LinearLayout f131357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f131358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final q f131359d;

    private d(@n0 RelativeLayout relativeLayout, @n0 LinearLayout linearLayout, @n0 TextView textView, @n0 q qVar) {
        this.f131356a = relativeLayout;
        this.f131357b = linearLayout;
        this.f131358c = textView;
        this.f131359d = qVar;
    }

    @n0
    public static d a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33974y8, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_no_result;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.tv_search_tips;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null && (viewA = l3.d.a(view, (i10 = R.id.vg_search_empty))) != null) {
                return new d((RelativeLayout) view, linearLayout, textView, q.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33930w8, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33952x8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_fragment_single_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131356a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33996z8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
