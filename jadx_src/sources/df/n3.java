package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.HornItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityXboxDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final TextView B;

    @androidx.annotation.n0
    public final TextView C;

    @androidx.annotation.n0
    public final TextView D;

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final View J;

    @androidx.annotation.n0
    public final RelativeLayout K;

    @androidx.annotation.n0
    public final RelativeLayout L;

    @androidx.annotation.n0
    public final RelativeLayout M;

    @androidx.annotation.n0
    public final RelativeLayout N;

    @androidx.annotation.n0
    public final RelativeLayout O;

    @androidx.annotation.n0
    public final RelativeLayout P;

    @androidx.annotation.n0
    public final RelativeLayout Q;

    @androidx.annotation.n0
    public final RelativeLayout R;

    @androidx.annotation.n0
    public final RelativeLayout S;

    @androidx.annotation.n0
    public final LinearLayout T;

    @androidx.annotation.n0
    public final RelativeLayout U;

    @androidx.annotation.n0
    public final wh0 V;

    @androidx.annotation.n0
    public final RelativeLayout W;

    @androidx.annotation.n0
    public final LinearLayout X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f113612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f113613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f113614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HornItemView f113618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final Toolbar f113630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113636y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113637z;

    private n3(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 HornItemView hornItemView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 Toolbar toolbar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout8, @androidx.annotation.n0 RelativeLayout relativeLayout9, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout10, @androidx.annotation.n0 wh0 wh0Var, @androidx.annotation.n0 RelativeLayout relativeLayout11, @androidx.annotation.n0 LinearLayout linearLayout7) {
        this.f113612a = coordinatorLayout;
        this.f113613b = appBarLayout;
        this.f113614c = collapsingToolbarLayout;
        this.f113615d = frameLayout;
        this.f113616e = frameLayout2;
        this.f113617f = frameLayout3;
        this.f113618g = hornItemView;
        this.f113619h = imageView;
        this.f113620i = imageView2;
        this.f113621j = imageView3;
        this.f113622k = imageView4;
        this.f113623l = imageView5;
        this.f113624m = linearLayout;
        this.f113625n = linearLayout2;
        this.f113626o = linearLayout3;
        this.f113627p = linearLayout4;
        this.f113628q = linearLayout5;
        this.f113629r = smartRefreshLayout;
        this.f113630s = toolbar;
        this.f113631t = textView;
        this.f113632u = textView2;
        this.f113633v = textView3;
        this.f113634w = textView4;
        this.f113635x = textView5;
        this.f113636y = textView6;
        this.f113637z = textView7;
        this.A = textView8;
        this.B = textView9;
        this.C = textView10;
        this.D = textView11;
        this.E = textView12;
        this.F = textView13;
        this.G = textView14;
        this.H = textView15;
        this.I = textView16;
        this.J = view;
        this.K = relativeLayout;
        this.L = relativeLayout2;
        this.M = relativeLayout3;
        this.N = relativeLayout4;
        this.O = relativeLayout5;
        this.P = relativeLayout6;
        this.Q = relativeLayout7;
        this.R = relativeLayout8;
        this.S = relativeLayout9;
        this.T = linearLayout6;
        this.U = relativeLayout10;
        this.V = wh0Var;
        this.W = relativeLayout11;
        this.X = linearLayout7;
    }

    @androidx.annotation.n0
    public static n3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16708, new Class[]{View.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl_xbox_detail;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl_xbox_detail);
        if (appBarLayout != null) {
            i10 = R.id.ctl_toolbar_wrapper;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl_toolbar_wrapper);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.fl_friends;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_friends);
                if (frameLayout != null) {
                    i10 = R.id.fl_games;
                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.fl_games);
                    if (frameLayout2 != null) {
                        i10 = R.id.fl_screenshots;
                        FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.fl_screenshots);
                        if (frameLayout3 != null) {
                            i10 = R.id.horn_item;
                            HornItemView hornItemView = (HornItemView) l3.d.a(view, R.id.horn_item);
                            if (hornItemView != null) {
                                i10 = R.id.iv_avatar;
                                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
                                if (imageView != null) {
                                    i10 = R.id.iv_back;
                                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_back);
                                    if (imageView2 != null) {
                                        i10 = R.id.iv_mask;
                                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mask);
                                        if (imageView3 != null) {
                                            i10 = R.id.iv_xbox_detail_update_icon;
                                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_xbox_detail_update_icon);
                                            if (imageView4 != null) {
                                                i10 = R.id.iv_xbox_header_bg;
                                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_xbox_header_bg);
                                                if (imageView5 != null) {
                                                    i10 = R.id.ll_content;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.ll_friend_more;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_friend_more);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.ll_game_more;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_game_more);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.ll_info_wrapper;
                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.ll_info_wrapper);
                                                                if (linearLayout4 != null) {
                                                                    i10 = R.id.ll_screenshot_more;
                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.ll_screenshot_more);
                                                                    if (linearLayout5 != null) {
                                                                        i10 = R.id.srl_xbox_detail;
                                                                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl_xbox_detail);
                                                                        if (smartRefreshLayout != null) {
                                                                            i10 = R.id.tb_xbox_detail;
                                                                            Toolbar toolbar = (Toolbar) l3.d.a(view, R.id.tb_xbox_detail);
                                                                            if (toolbar != null) {
                                                                                i10 = R.id.tv_avaliable_time;
                                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_avaliable_time);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.tv_friend_count;
                                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_friend_count);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.tv_friend_title;
                                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_friend_title);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.tv_game_count;
                                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_game_count);
                                                                                            if (textView4 != null) {
                                                                                                i10 = R.id.tv_game_title;
                                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_game_title);
                                                                                                if (textView5 != null) {
                                                                                                    i10 = R.id.tv_key_0;
                                                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_key_0);
                                                                                                    if (textView6 != null) {
                                                                                                        i10 = R.id.tv_key_1;
                                                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_key_1);
                                                                                                        if (textView7 != null) {
                                                                                                            i10 = R.id.tv_nickname;
                                                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.tv_online_state;
                                                                                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_online_state);
                                                                                                                if (textView9 != null) {
                                                                                                                    i10 = R.id.tv_screenshot_count;
                                                                                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_screenshot_count);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i10 = R.id.tv_screenshot_title;
                                                                                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_screenshot_title);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i10 = R.id.tv_update_time;
                                                                                                                            TextView textView12 = (TextView) l3.d.a(view, R.id.tv_update_time);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i10 = R.id.tv_value_0;
                                                                                                                                TextView textView13 = (TextView) l3.d.a(view, R.id.tv_value_0);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i10 = R.id.tv_value_1;
                                                                                                                                    TextView textView14 = (TextView) l3.d.a(view, R.id.tv_value_1);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i10 = R.id.tv_xbox_detail_update_text;
                                                                                                                                        TextView textView15 = (TextView) l3.d.a(view, R.id.tv_xbox_detail_update_text);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i10 = R.id.tv_xgpu;
                                                                                                                                            TextView textView16 = (TextView) l3.d.a(view, R.id.tv_xgpu);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i10 = R.id.v_blank;
                                                                                                                                                View viewA = l3.d.a(view, R.id.v_blank);
                                                                                                                                                if (viewA != null) {
                                                                                                                                                    i10 = R.id.vg_achievement_rank;
                                                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_achievement_rank);
                                                                                                                                                    if (relativeLayout != null) {
                                                                                                                                                        i10 = R.id.vg_avatar;
                                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_avatar);
                                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                                            i10 = R.id.vg_friend_more;
                                                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_friend_more);
                                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                                i10 = R.id.vg_game_more;
                                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_game_more);
                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                    i10 = R.id.vg_no_friend;
                                                                                                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_no_friend);
                                                                                                                                                                    if (relativeLayout5 != null) {
                                                                                                                                                                        i10 = R.id.vg_no_game;
                                                                                                                                                                        RelativeLayout relativeLayout6 = (RelativeLayout) l3.d.a(view, R.id.vg_no_game);
                                                                                                                                                                        if (relativeLayout6 != null) {
                                                                                                                                                                            i10 = R.id.vg_no_screenshot;
                                                                                                                                                                            RelativeLayout relativeLayout7 = (RelativeLayout) l3.d.a(view, R.id.vg_no_screenshot);
                                                                                                                                                                            if (relativeLayout7 != null) {
                                                                                                                                                                                i10 = R.id.vg_rank_in_friend;
                                                                                                                                                                                RelativeLayout relativeLayout8 = (RelativeLayout) l3.d.a(view, R.id.vg_rank_in_friend);
                                                                                                                                                                                if (relativeLayout8 != null) {
                                                                                                                                                                                    i10 = R.id.vg_screenshot_more;
                                                                                                                                                                                    RelativeLayout relativeLayout9 = (RelativeLayout) l3.d.a(view, R.id.vg_screenshot_more);
                                                                                                                                                                                    if (relativeLayout9 != null) {
                                                                                                                                                                                        i10 = R.id.vg_week_got;
                                                                                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_week_got);
                                                                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                                                                            i10 = R.id.vg_xbox_detail_update;
                                                                                                                                                                                            RelativeLayout relativeLayout10 = (RelativeLayout) l3.d.a(view, R.id.vg_xbox_detail_update);
                                                                                                                                                                                            if (relativeLayout10 != null) {
                                                                                                                                                                                                i10 = R.id.vg_xbox_detail_value;
                                                                                                                                                                                                View viewA2 = l3.d.a(view, R.id.vg_xbox_detail_value);
                                                                                                                                                                                                if (viewA2 != null) {
                                                                                                                                                                                                    wh0 wh0VarA = wh0.a(viewA2);
                                                                                                                                                                                                    i10 = R.id.vg_xbox_game_pass;
                                                                                                                                                                                                    RelativeLayout relativeLayout11 = (RelativeLayout) l3.d.a(view, R.id.vg_xbox_game_pass);
                                                                                                                                                                                                    if (relativeLayout11 != null) {
                                                                                                                                                                                                        i10 = R.id.vg_xgpu;
                                                                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_xgpu);
                                                                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                                                                            return new n3((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, frameLayout, frameLayout2, frameLayout3, hornItemView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, smartRefreshLayout, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, viewA, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, relativeLayout8, relativeLayout9, linearLayout6, relativeLayout10, wh0VarA, relativeLayout11, linearLayout7);
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
    public static n3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16706, new Class[]{LayoutInflater.class}, n3.class);
        return patchProxyResultProxy.isSupported ? (n3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16707, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_xbox_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f113612a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16709, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
