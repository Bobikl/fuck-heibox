package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.GamePlatformsCardContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserGameDataHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f115360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f115361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final x30 f115363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final fl f115364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mz f115365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final GamePlatformsCardContainer f115366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final oo f115371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final oo f115372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final fr f115373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f115374q;

    private s00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 SegmentFilterView segmentFilterView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 x30 x30Var, @androidx.annotation.n0 fl flVar, @androidx.annotation.n0 mz mzVar, @androidx.annotation.n0 GamePlatformsCardContainer gamePlatformsCardContainer, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 oo ooVar, @androidx.annotation.n0 oo ooVar2, @androidx.annotation.n0 fr frVar, @androidx.annotation.n0 BannerViewPager bannerViewPager) {
        this.f115358a = linearLayout;
        this.f115359b = qMUIRadiusImageView;
        this.f115360c = segmentFilterView;
        this.f115361d = segmentFilterView2;
        this.f115362e = linearLayout2;
        this.f115363f = x30Var;
        this.f115364g = flVar;
        this.f115365h = mzVar;
        this.f115366i = gamePlatformsCardContainer;
        this.f115367j = linearLayout3;
        this.f115368k = linearLayout4;
        this.f115369l = linearLayout5;
        this.f115370m = linearLayout6;
        this.f115371n = ooVar;
        this.f115372o = ooVar2;
        this.f115373p = frVar;
        this.f115374q = bannerViewPager;
    }

    @androidx.annotation.n0
    public static s00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20148, new Class[]{View.class}, s00.class);
        if (patchProxyResultProxy.isSupported) {
            return (s00) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_update_max_account;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_update_max_account);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.ll_tab;
            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
            if (segmentFilterView != null) {
                i10 = R.id.v_sf_max;
                SegmentFilterView segmentFilterView2 = (SegmentFilterView) l3.d.a(view, R.id.v_sf_max);
                if (segmentFilterView2 != null) {
                    i10 = R.id.vg_binding_fragment;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_binding_fragment);
                    if (linearLayout != null) {
                        i10 = R.id.vg_follow_match_title;
                        View viewA = l3.d.a(view, R.id.vg_follow_match_title);
                        if (viewA != null) {
                            x30 x30VarA = x30.a(viewA);
                            i10 = R.id.vg_follow_user_title;
                            View viewA2 = l3.d.a(view, R.id.vg_follow_user_title);
                            if (viewA2 != null) {
                                fl flVarA = fl.a(viewA2);
                                i10 = R.id.vg_followed_games_title;
                                View viewA3 = l3.d.a(view, R.id.vg_followed_games_title);
                                if (viewA3 != null) {
                                    mz mzVarA = mz.a(viewA3);
                                    i10 = R.id.vg_game_card;
                                    GamePlatformsCardContainer gamePlatformsCardContainer = (GamePlatformsCardContainer) l3.d.a(view, R.id.vg_game_card);
                                    if (gamePlatformsCardContainer != null) {
                                        i10 = R.id.vg_heybox_filter;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_heybox_filter);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_home_menu;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_home_menu);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.vg_max_filter;
                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_max_filter);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.vg_max_title;
                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_max_title);
                                                    if (linearLayout5 != null) {
                                                        i10 = R.id.vg_menu_mall;
                                                        View viewA4 = l3.d.a(view, R.id.vg_menu_mall);
                                                        if (viewA4 != null) {
                                                            oo ooVarA = oo.a(viewA4);
                                                            i10 = R.id.vg_menu_task;
                                                            View viewA5 = l3.d.a(view, R.id.vg_menu_task);
                                                            if (viewA5 != null) {
                                                                oo ooVarA2 = oo.a(viewA5);
                                                                i10 = R.id.vg_owned_games_title;
                                                                View viewA6 = l3.d.a(view, R.id.vg_owned_games_title);
                                                                if (viewA6 != null) {
                                                                    fr frVarA = fr.a(viewA6);
                                                                    i10 = R.id.vp_mini_app;
                                                                    BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.vp_mini_app);
                                                                    if (bannerViewPager != null) {
                                                                        return new s00((LinearLayout) view, qMUIRadiusImageView, segmentFilterView, segmentFilterView2, linearLayout, x30VarA, flVarA, mzVarA, gamePlatformsCardContainer, linearLayout2, linearLayout3, linearLayout4, linearLayout5, ooVarA, ooVarA2, frVarA, bannerViewPager);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static s00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20146, new Class[]{LayoutInflater.class}, s00.class);
        return patchProxyResultProxy.isSupported ? (s00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20147, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s00.class);
        if (patchProxyResultProxy.isSupported) {
            return (s00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_game_data_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115358a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20149, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
