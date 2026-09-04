package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.SegmentTabLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentCsgoGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v7 implements l3.c {
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
    public final FrameLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final RelativeLayout O;

    @androidx.annotation.n0
    public final ug P;

    @androidx.annotation.n0
    public final LinearLayout Q;

    @androidx.annotation.n0
    public final LinearLayout R;

    @androidx.annotation.n0
    public final LinearLayout S;

    @androidx.annotation.n0
    public final CardView T;

    @androidx.annotation.n0
    public final qe0 U;

    @androidx.annotation.n0
    public final lh0 V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f116661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f116673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f116676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116681u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentTabLayout f116682v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f116683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116686z;

    private v7(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 SegmentTabLayout segmentTabLayout, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ug ugVar, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 qe0 qe0Var, @androidx.annotation.n0 lh0 lh0Var) {
        this.f116661a = smartRefreshLayout;
        this.f116662b = view;
        this.f116663c = cardView;
        this.f116664d = imageView;
        this.f116665e = imageView2;
        this.f116666f = imageView3;
        this.f116667g = imageView4;
        this.f116668h = imageView5;
        this.f116669i = imageView6;
        this.f116670j = imageView7;
        this.f116671k = imageView8;
        this.f116672l = imageView9;
        this.f116673m = lineChart;
        this.f116674n = linearLayout;
        this.f116675o = linearLayout2;
        this.f116676p = nestedScrollView;
        this.f116677q = relativeLayout;
        this.f116678r = recyclerView;
        this.f116679s = recyclerView2;
        this.f116680t = recyclerView3;
        this.f116681u = smartRefreshLayout2;
        this.f116682v = segmentTabLayout;
        this.f116683w = marqueeTextView;
        this.f116684x = textView;
        this.f116685y = textView2;
        this.f116686z = textView3;
        this.A = textView4;
        this.B = textView5;
        this.C = textView6;
        this.D = textView7;
        this.E = textView8;
        this.F = textView9;
        this.G = textView10;
        this.H = textView11;
        this.I = textView12;
        this.J = view2;
        this.K = frameLayout;
        this.L = linearLayout3;
        this.M = linearLayout4;
        this.N = linearLayout5;
        this.O = relativeLayout2;
        this.P = ugVar;
        this.Q = linearLayout6;
        this.R = linearLayout7;
        this.S = linearLayout8;
        this.T = cardView2;
        this.U = qe0Var;
        this.V = lh0Var;
    }

    @androidx.annotation.n0
    public static v7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17156, new Class[]{View.class}, v7.class);
        if (patchProxyResultProxy.isSupported) {
            return (v7) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_space;
        View viewA = l3.d.a(view, R.id.bottom_space);
        if (viewA != null) {
            i10 = R.id.cv_player_info;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_player_info);
            if (cardView != null) {
                i10 = R.id.iv_cancel;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_cancel);
                if (imageView != null) {
                    i10 = R.id.iv_fragment_pubg_data_avatar;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_avatar);
                    if (imageView2 != null) {
                        i10 = R.id.iv_fragment_pubg_data_avatar_scrim;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_avatar_scrim);
                        if (imageView3 != null) {
                            i10 = R.id.iv_fragment_pubg_data_ranking;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_ranking);
                            if (imageView4 != null) {
                                i10 = R.id.iv_fragment_pubg_data_rating;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_rating);
                                if (imageView5 != null) {
                                    i10 = R.id.iv_fragment_pubg_data_unbind;
                                    ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_unbind);
                                    if (imageView6 != null) {
                                        i10 = R.id.iv_fragment_pubg_data_update_icon;
                                        ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_fragment_pubg_data_update_icon);
                                        if (imageView7 != null) {
                                            i10 = R.id.iv_pubg_data_head_image;
                                            ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_pubg_data_head_image);
                                            if (imageView8 != null) {
                                                i10 = R.id.iv_rating_faq;
                                                ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_rating_faq);
                                                if (imageView9 != null) {
                                                    i10 = R.id.line_chart_trend;
                                                    LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
                                                    if (lineChart != null) {
                                                        i10 = R.id.ll_expanded_data;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_expanded_data);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.ll_mode_stats;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_mode_stats);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.nv_fregment_pubg_scroll_view;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.nv_fregment_pubg_scroll_view);
                                                                if (nestedScrollView != null) {
                                                                    i10 = R.id.rl_message;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_message);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.rv_expanded_data;
                                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_expanded_data);
                                                                        if (recyclerView != null) {
                                                                            i10 = R.id.rv_fragment_pubg_menu;
                                                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_fragment_pubg_menu);
                                                                            if (recyclerView2 != null) {
                                                                                i10 = R.id.rv_header_data;
                                                                                RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_header_data);
                                                                                if (recyclerView3 != null) {
                                                                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                                                                    i10 = R.id.tl_trend;
                                                                                    SegmentTabLayout segmentTabLayout = (SegmentTabLayout) l3.d.a(view, R.id.tl_trend);
                                                                                    if (segmentTabLayout != null) {
                                                                                        i10 = R.id.tv_content;
                                                                                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_content);
                                                                                        if (marqueeTextView != null) {
                                                                                            i10 = R.id.tv_data_expand;
                                                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_data_expand);
                                                                                            if (textView != null) {
                                                                                                i10 = R.id.tv_fragment_pubg_data_nickname;
                                                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_nickname);
                                                                                                if (textView2 != null) {
                                                                                                    i10 = R.id.tv_fragment_pubg_data_ranking;
                                                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_ranking);
                                                                                                    if (textView3 != null) {
                                                                                                        i10 = R.id.tv_fragment_pubg_data_ranking_desc;
                                                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_ranking_desc);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = R.id.tv_fragment_pubg_data_rating;
                                                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_rating);
                                                                                                            if (textView5 != null) {
                                                                                                                i10 = R.id.tv_fragment_pubg_data_rating_desc;
                                                                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_rating_desc);
                                                                                                                if (textView6 != null) {
                                                                                                                    i10 = R.id.tv_fragment_pubg_data_season;
                                                                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_season);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i10 = R.id.tv_fragment_pubg_data_update_text;
                                                                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_fragment_pubg_data_update_text);
                                                                                                                        if (textView8 != null) {
                                                                                                                            i10 = R.id.tv_server_desc;
                                                                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_server_desc);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i10 = R.id.tv_steam_id_desc;
                                                                                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_steam_id_desc);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    i10 = R.id.tv_trend_desc;
                                                                                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_trend_desc);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        i10 = R.id.tv_update_desc;
                                                                                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_update_desc);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            i10 = R.id.v_fragment_pubg_game_data;
                                                                                                                                            View viewA2 = l3.d.a(view, R.id.v_fragment_pubg_game_data);
                                                                                                                                            if (viewA2 != null) {
                                                                                                                                                i10 = R.id.vg_bind_card_container;
                                                                                                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bind_card_container);
                                                                                                                                                if (frameLayout != null) {
                                                                                                                                                    i10 = R.id.vg_data_container;
                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_data_container);
                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                        i10 = R.id.vg_faq;
                                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_faq);
                                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                                            i10 = R.id.vg_fragment_pubg_data_season_wrapper;
                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_fragment_pubg_data_season_wrapper);
                                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                                i10 = R.id.vg_fragment_pubg_data_update;
                                                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_fragment_pubg_data_update);
                                                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                                                    i10 = R.id.vg_pubg_data_matches_card;
                                                                                                                                                                    View viewA3 = l3.d.a(view, R.id.vg_pubg_data_matches_card);
                                                                                                                                                                    if (viewA3 != null) {
                                                                                                                                                                        ug ugVarA = ug.a(viewA3);
                                                                                                                                                                        i10 = R.id.vg_pubg_data_player_info_wrapper;
                                                                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_pubg_data_player_info_wrapper);
                                                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                                                            i10 = R.id.vg_rating;
                                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_rating);
                                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                                i10 = R.id.vg_title;
                                                                                                                                                                                LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                                                                                                                                                                if (linearLayout8 != null) {
                                                                                                                                                                                    i10 = R.id.vg_trend;
                                                                                                                                                                                    CardView cardView2 = (CardView) l3.d.a(view, R.id.vg_trend);
                                                                                                                                                                                    if (cardView2 != null) {
                                                                                                                                                                                        i10 = R.id.vg_weapons_card;
                                                                                                                                                                                        View viewA4 = l3.d.a(view, R.id.vg_weapons_card);
                                                                                                                                                                                        if (viewA4 != null) {
                                                                                                                                                                                            qe0 qe0VarA = qe0.a(viewA4);
                                                                                                                                                                                            i10 = R.id.view_radar_chart;
                                                                                                                                                                                            View viewA5 = l3.d.a(view, R.id.view_radar_chart);
                                                                                                                                                                                            if (viewA5 != null) {
                                                                                                                                                                                                return new v7(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, lineChart, linearLayout, linearLayout2, nestedScrollView, relativeLayout, recyclerView, recyclerView2, recyclerView3, smartRefreshLayout, segmentTabLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewA2, frameLayout, linearLayout3, linearLayout4, linearLayout5, relativeLayout2, ugVarA, linearLayout6, linearLayout7, linearLayout8, cardView2, qe0VarA, lh0.a(viewA5));
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
    public static v7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17154, new Class[]{LayoutInflater.class}, v7.class);
        return patchProxyResultProxy.isSupported ? (v7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17155, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v7.class);
        if (patchProxyResultProxy.isSupported) {
            return (v7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_csgo_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f116661a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17157, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
