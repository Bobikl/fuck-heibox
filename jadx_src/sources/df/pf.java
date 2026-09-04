package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptFeedsLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f114531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f114533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final jp f114535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final qp f114536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f114537i;

    private pf(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 jp jpVar, @androidx.annotation.n0 qp qpVar, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f114529a = relativeLayout;
        this.f114530b = view;
        this.f114531c = id0Var;
        this.f114532d = textView;
        this.f114533e = bBSLinkListBottomBar;
        this.f114534f = linearLayout;
        this.f114535g = jpVar;
        this.f114536h = qpVar;
        this.f114537i = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static pf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17964, new Class[]{View.class}, pf.class);
        if (patchProxyResultProxy.isSupported) {
            return (pf) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_margin;
        View viewA = l3.d.a(view, R.id.bottom_margin);
        if (viewA != null) {
            i10 = R.id.divider;
            View viewA2 = l3.d.a(view, R.id.divider);
            if (viewA2 != null) {
                id0 id0VarA = id0.a(viewA2);
                i10 = R.id.tv_internal_tag;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_internal_tag);
                if (textView != null) {
                    i10 = R.id.vg_bottom_bar;
                    BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
                    if (bBSLinkListBottomBar != null) {
                        i10 = R.id.vg_bottom_sub;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_sub);
                        if (linearLayout != null) {
                            i10 = R.id.vg_link_content;
                            View viewA3 = l3.d.a(view, R.id.vg_link_content);
                            if (viewA3 != null) {
                                jp jpVarA = jp.a(viewA3);
                                i10 = R.id.vg_sub;
                                View viewA4 = l3.d.a(view, R.id.vg_sub);
                                if (viewA4 != null) {
                                    qp qpVarA = qp.a(viewA4);
                                    i10 = R.id.vg_user;
                                    BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_user);
                                    if (bBSUserSectionView != null) {
                                        return new pf((RelativeLayout) view, viewA, id0VarA, textView, bBSLinkListBottomBar, linearLayout, jpVarA, qpVarA, bBSUserSectionView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17962, new Class[]{LayoutInflater.class}, pf.class);
        return patchProxyResultProxy.isSupported ? (pf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17963, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pf.class);
        if (patchProxyResultProxy.isSupported) {
            return (pf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_feeds_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114529a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17965, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
