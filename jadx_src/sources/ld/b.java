package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import mb.b1;
import mb.o;

/* JADX INFO: compiled from: FragmentUserCenteredSearchResultBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final b1 f131326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final o f131327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f131328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RelativeLayout f131329e;

    private b(@n0 RelativeLayout relativeLayout, @n0 b1 b1Var, @n0 o oVar, @n0 TextView textView, @n0 RelativeLayout relativeLayout2) {
        this.f131325a = relativeLayout;
        this.f131326b = b1Var;
        this.f131327c = oVar;
        this.f131328d = textView;
        this.f131329e = relativeLayout2;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33798q8, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.srl;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            b1 b1VarA = b1.a(viewA);
            i10 = R.id.top_divider;
            View viewA2 = l3.d.a(view, i10);
            if (viewA2 != null) {
                o oVarA = o.a(viewA2);
                i10 = R.id.tv_no_search_found;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new b(relativeLayout, b1VarA, oVarA, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33752o8, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33775p8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_user_centered_search_result, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131325a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33820r8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
