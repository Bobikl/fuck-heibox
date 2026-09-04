package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityHashtagDetailTransBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final ViewPager A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f114343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f114344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f114345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f114361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f114362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final AutoOffsettingBackgroundLayout f114366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingPostButton f114368z;

    private p0(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 View view2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout, @androidx.annotation.n0 View view3, @androidx.annotation.n0 FloatingPostButton floatingPostButton, @androidx.annotation.n0 ViewPager viewPager) {
        this.f114343a = coordinatorLayout;
        this.f114344b = appBarLayout;
        this.f114345c = collapsingToolbarLayout;
        this.f114346d = imageView;
        this.f114347e = imageView2;
        this.f114348f = imageView3;
        this.f114349g = qMUIRadiusImageView;
        this.f114350h = imageView4;
        this.f114351i = view;
        this.f114352j = textView;
        this.f114353k = constraintLayout;
        this.f114354l = constraintLayout2;
        this.f114355m = view2;
        this.f114356n = textView2;
        this.f114357o = textView3;
        this.f114358p = textView4;
        this.f114359q = textView5;
        this.f114360r = imageView5;
        this.f114361s = tabLayout;
        this.f114362t = titleBar;
        this.f114363u = textView6;
        this.f114364v = textView7;
        this.f114365w = textView8;
        this.f114366x = autoOffsettingBackgroundLayout;
        this.f114367y = view3;
        this.f114368z = floatingPostButton;
        this.A = viewPager;
    }

    @androidx.annotation.n0
    public static p0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16404, new Class[]{View.class}, p0.class);
        if (patchProxyResultProxy.isSupported) {
            return (p0) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.iv_bg_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_img);
                if (imageView != null) {
                    i10 = R.id.iv_default_mask;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_default_mask);
                    if (imageView2 != null) {
                        i10 = R.id.iv_header_bg;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_header_bg);
                        if (imageView3 != null) {
                            i10 = R.id.iv_icon_hashtag;
                            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon_hashtag);
                            if (qMUIRadiusImageView != null) {
                                i10 = R.id.more_inspiration_arrow;
                                ImageView imageView4 = (ImageView) l3.d.a(view, R.id.more_inspiration_arrow);
                                if (imageView4 != null) {
                                    i10 = R.id.more_inspiration_bg;
                                    View viewA = l3.d.a(view, R.id.more_inspiration_bg);
                                    if (viewA != null) {
                                        i10 = R.id.more_inspiration_text;
                                        TextView textView = (TextView) l3.d.a(view, R.id.more_inspiration_text);
                                        if (textView != null) {
                                            i10 = R.id.normal_header;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.normal_header);
                                            if (constraintLayout != null) {
                                                i10 = R.id.related_act_card;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.related_act_card);
                                                if (constraintLayout2 != null) {
                                                    i10 = R.id.related_act_card_background;
                                                    View viewA2 = l3.d.a(view, R.id.related_act_card_background);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.related_act_card_desc;
                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.related_act_card_desc);
                                                        if (textView2 != null) {
                                                            i10 = R.id.related_act_card_label;
                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.related_act_card_label);
                                                            if (textView3 != null) {
                                                                i10 = R.id.related_act_card_title;
                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.related_act_card_title);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.related_act_card_view_more;
                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.related_act_card_view_more);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.related_act_card_view_more_arrow;
                                                                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.related_act_card_view_more_arrow);
                                                                        if (imageView5 != null) {
                                                                            i10 = R.id.tab;
                                                                            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
                                                                            if (tabLayout != null) {
                                                                                i10 = R.id.tb_title_trans;
                                                                                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.tb_title_trans);
                                                                                if (titleBar != null) {
                                                                                    i10 = R.id.tv_desc;
                                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_desc);
                                                                                    if (textView6 != null) {
                                                                                        i10 = R.id.tv_long_desc;
                                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_long_desc);
                                                                                        if (textView7 != null) {
                                                                                            i10 = R.id.tv_name;
                                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                                            if (textView8 != null) {
                                                                                                i10 = R.id.v_auto_offsetting_bg;
                                                                                                AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout = (AutoOffsettingBackgroundLayout) l3.d.a(view, R.id.v_auto_offsetting_bg);
                                                                                                if (autoOffsettingBackgroundLayout != null) {
                                                                                                    i10 = R.id.v_title_bg;
                                                                                                    View viewA3 = l3.d.a(view, R.id.v_title_bg);
                                                                                                    if (viewA3 != null) {
                                                                                                        i10 = R.id.vg_post;
                                                                                                        FloatingPostButton floatingPostButton = (FloatingPostButton) l3.d.a(view, R.id.vg_post);
                                                                                                        if (floatingPostButton != null) {
                                                                                                            i10 = R.id.vp_content;
                                                                                                            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp_content);
                                                                                                            if (viewPager != null) {
                                                                                                                return new p0((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, imageView, imageView2, imageView3, qMUIRadiusImageView, imageView4, viewA, textView, constraintLayout, constraintLayout2, viewA2, textView2, textView3, textView4, textView5, imageView5, tabLayout, titleBar, textView6, textView7, textView8, autoOffsettingBackgroundLayout, viewA3, floatingPostButton, viewPager);
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
    public static p0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16402, new Class[]{LayoutInflater.class}, p0.class);
        return patchProxyResultProxy.isSupported ? (p0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16403, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p0.class);
        if (patchProxyResultProxy.isSupported) {
            return (p0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_hashtag_detail_trans, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f114343a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16405, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
