package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptMomentsLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f110187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f110189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final qp f110192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f110193h;

    private eg(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 qp qpVar, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f110186a = linearLayout;
        this.f110187b = id0Var;
        this.f110188c = linearLayout2;
        this.f110189d = bBSLinkListBottomBar;
        this.f110190e = linearLayout3;
        this.f110191f = linearLayout4;
        this.f110192g = qpVar;
        this.f110193h = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static eg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18023, new Class[]{View.class}, eg.class);
        if (patchProxyResultProxy.isSupported) {
            return (eg) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.ll_origin_post;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_origin_post);
            if (linearLayout != null) {
                i10 = R.id.vg_bottom_bar;
                BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
                if (bBSLinkListBottomBar != null) {
                    i10 = R.id.vg_bottom_sub;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_bottom_sub);
                    if (linearLayout2 != null) {
                        LinearLayout linearLayout3 = (LinearLayout) view;
                        i10 = R.id.vg_sub;
                        View viewA2 = l3.d.a(view, R.id.vg_sub);
                        if (viewA2 != null) {
                            qp qpVarA = qp.a(viewA2);
                            i10 = R.id.vg_title;
                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                            if (bBSUserSectionView != null) {
                                return new eg(linearLayout3, id0VarA, linearLayout, bBSLinkListBottomBar, linearLayout2, linearLayout3, qpVarA, bBSUserSectionView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static eg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18021, new Class[]{LayoutInflater.class}, eg.class);
        return patchProxyResultProxy.isSupported ? (eg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static eg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18022, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, eg.class);
        if (patchProxyResultProxy.isSupported) {
            return (eg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_moments_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110186a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18024, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
