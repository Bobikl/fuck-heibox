package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentTopicDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final mb.o B;

    @androidx.annotation.n0
    public final FrameLayout C;

    @androidx.annotation.n0
    public final RelativeLayout D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final RelativeLayout J;

    @androidx.annotation.n0
    public final RelativeLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final ViewPager M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f115543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f115544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f115546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f115564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115567y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115568z;

    private sb(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 ImageView imageView10, @androidx.annotation.n0 ImageView imageView11, @androidx.annotation.n0 ImageView imageView12, @androidx.annotation.n0 ImageView imageView13, @androidx.annotation.n0 ImageView imageView14, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 View view, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 ViewPager viewPager) {
        this.f115543a = coordinatorLayout;
        this.f115544b = appBarLayout;
        this.f115545c = relativeLayout;
        this.f115546d = collapsingToolbarLayout;
        this.f115547e = imageView;
        this.f115548f = imageView2;
        this.f115549g = imageView3;
        this.f115550h = imageView4;
        this.f115551i = imageView5;
        this.f115552j = imageView6;
        this.f115553k = imageView7;
        this.f115554l = imageView8;
        this.f115555m = imageView9;
        this.f115556n = imageView10;
        this.f115557o = imageView11;
        this.f115558p = imageView12;
        this.f115559q = imageView13;
        this.f115560r = imageView14;
        this.f115561s = linearLayout;
        this.f115562t = linearLayout2;
        this.f115563u = view;
        this.f115564v = titleBar;
        this.f115565w = textView;
        this.f115566x = textView2;
        this.f115567y = textView3;
        this.f115568z = textView4;
        this.A = textView5;
        this.B = oVar;
        this.C = frameLayout;
        this.D = relativeLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
        this.G = linearLayout5;
        this.H = linearLayout6;
        this.I = relativeLayout3;
        this.J = relativeLayout4;
        this.K = relativeLayout5;
        this.L = linearLayout7;
        this.M = viewPager;
    }

    @androidx.annotation.n0
    public static sb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17560, new Class[]{View.class}, sb.class);
        if (patchProxyResultProxy.isSupported) {
            return (sb) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.bg_container;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.bg_container);
            if (relativeLayout != null) {
                i10 = R.id.ctl;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
                if (collapsingToolbarLayout != null) {
                    i10 = R.id.iv_bg_bottom_gradient;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_bottom_gradient);
                    if (imageView != null) {
                        i10 = R.id.iv_bg_bottom_scrim;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg_bottom_scrim);
                        if (imageView2 != null) {
                            i10 = R.id.iv_bg_color;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_bg_color);
                            if (imageView3 != null) {
                                i10 = R.id.iv_bg_img;
                                ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_bg_img);
                                if (imageView4 != null) {
                                    i10 = R.id.iv_bg_scrim;
                                    ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_bg_scrim);
                                    if (imageView5 != null) {
                                        i10 = R.id.iv_bg_top_scrim;
                                        ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_bg_top_scrim);
                                        if (imageView6 != null) {
                                            i10 = R.id.iv_follow_status;
                                            ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_follow_status);
                                            if (imageView7 != null) {
                                                i10 = R.id.iv_game_arrow;
                                                ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_game_arrow);
                                                if (imageView8 != null) {
                                                    i10 = R.id.iv_game_icon;
                                                    ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_game_icon);
                                                    if (imageView9 != null) {
                                                        i10 = R.id.iv_topic_provisions;
                                                        ImageView imageView10 = (ImageView) l3.d.a(view, R.id.iv_topic_provisions);
                                                        if (imageView10 != null) {
                                                            i10 = R.id.iv_topic_to_forbid_history;
                                                            ImageView imageView11 = (ImageView) l3.d.a(view, R.id.iv_topic_to_forbid_history);
                                                            if (imageView11 != null) {
                                                                i10 = R.id.iv_topic_to_wiki;
                                                                ImageView imageView12 = (ImageView) l3.d.a(view, R.id.iv_topic_to_wiki);
                                                                if (imageView12 != null) {
                                                                    i10 = R.id.iv_user_avatar;
                                                                    ImageView imageView13 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
                                                                    if (imageView13 != null) {
                                                                        i10 = R.id.iv_write_post;
                                                                        ImageView imageView14 = (ImageView) l3.d.a(view, R.id.iv_write_post);
                                                                        if (imageView14 != null) {
                                                                            i10 = R.id.ll_nav;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_nav);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.ll_related_topics;
                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_related_topics);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.status_bar;
                                                                                    View viewA = l3.d.a(view, R.id.status_bar);
                                                                                    if (viewA != null) {
                                                                                        i10 = R.id.toolbar;
                                                                                        TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                                                                        if (titleBar != null) {
                                                                                            i10 = R.id.tv_topic_name;
                                                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_topic_name);
                                                                                            if (textView != null) {
                                                                                                i10 = R.id.tv_topic_provisions;
                                                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_topic_provisions);
                                                                                                if (textView2 != null) {
                                                                                                    i10 = R.id.tv_topic_to_forbid_history;
                                                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_topic_to_forbid_history);
                                                                                                    if (textView3 != null) {
                                                                                                        i10 = R.id.tv_topic_to_wiki;
                                                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_topic_to_wiki);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = R.id.tv_user_name;
                                                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                                                                            if (textView5 != null) {
                                                                                                                i10 = R.id.v_related_topics_divider;
                                                                                                                View viewA2 = l3.d.a(view, R.id.v_related_topics_divider);
                                                                                                                if (viewA2 != null) {
                                                                                                                    mb.o oVarA = mb.o.a(viewA2);
                                                                                                                    i10 = R.id.vg_game_icon;
                                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_game_icon);
                                                                                                                    if (frameLayout != null) {
                                                                                                                        i10 = R.id.vg_header_container;
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_header_container);
                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                            i10 = R.id.vg_related_topics;
                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_related_topics);
                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                i10 = R.id.vg_sort_header;
                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_sort_header);
                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                    i10 = R.id.vg_topic_entry;
                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_topic_entry);
                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                        i10 = R.id.vg_topic_name;
                                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_topic_name);
                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                            i10 = R.id.vg_topic_provisions;
                                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_topic_provisions);
                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                i10 = R.id.vg_topic_to_forbid_history;
                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_topic_to_forbid_history);
                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                    i10 = R.id.vg_topic_to_wiki;
                                                                                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_topic_to_wiki);
                                                                                                                                                    if (relativeLayout5 != null) {
                                                                                                                                                        i10 = R.id.vg_user_forbid_info;
                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_user_forbid_info);
                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                            i10 = R.id.vp;
                                                                                                                                                            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                                                                                                                                            if (viewPager != null) {
                                                                                                                                                                return new sb((CoordinatorLayout) view, appBarLayout, relativeLayout, collapsingToolbarLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, linearLayout, linearLayout2, viewA, titleBar, textView, textView2, textView3, textView4, textView5, oVarA, frameLayout, relativeLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout3, relativeLayout4, relativeLayout5, linearLayout7, viewPager);
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
    public static sb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17558, new Class[]{LayoutInflater.class}, sb.class);
        return patchProxyResultProxy.isSupported ? (sb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17559, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sb.class);
        if (patchProxyResultProxy.isSupported) {
            return (sb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_topic_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f115543a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17561, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
