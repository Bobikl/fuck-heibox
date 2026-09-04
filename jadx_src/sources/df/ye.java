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

/* JADX INFO: compiled from: ItemChannelsLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ye implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f117927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f117929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f117931f;

    private ye(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f117926a = linearLayout;
        this.f117927b = id0Var;
        this.f117928c = linearLayout2;
        this.f117929d = bBSLinkListBottomBar;
        this.f117930e = linearLayout3;
        this.f117931f = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static ye a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17896, new Class[]{View.class}, ye.class);
        if (patchProxyResultProxy.isSupported) {
            return (ye) patchProxyResultProxy.result;
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
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i10 = R.id.vg_title;
                    BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                    if (bBSUserSectionView != null) {
                        return new ye(linearLayout2, id0VarA, linearLayout, bBSLinkListBottomBar, linearLayout2, bBSUserSectionView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ye c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17894, new Class[]{LayoutInflater.class}, ye.class);
        return patchProxyResultProxy.isSupported ? (ye) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ye d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17895, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ye.class);
        if (patchProxyResultProxy.isSupported) {
            return (ye) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_channels_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117926a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17897, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
