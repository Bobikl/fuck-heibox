package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentOwGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ka implements l3.c {
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
    public final View G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final RelativeLayout L;

    @androidx.annotation.n0
    public final FrameLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final LinearLayout O;

    @androidx.annotation.n0
    public final LinearLayout P;

    @androidx.annotation.n0
    public final RelativeLayout Q;

    @androidx.annotation.n0
    public final lh0 R;

    @androidx.annotation.n0
    public final WebView S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f112503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f112505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f112518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f112519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112528z;

    private ka(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 lh0 lh0Var, @androidx.annotation.n0 WebView webView) {
        this.f112503a = smartRefreshLayout;
        this.f112504b = view;
        this.f112505c = cardView;
        this.f112506d = imageView;
        this.f112507e = imageView2;
        this.f112508f = imageView3;
        this.f112509g = imageView4;
        this.f112510h = imageView5;
        this.f112511i = imageView6;
        this.f112512j = imageView7;
        this.f112513k = imageView8;
        this.f112514l = linearLayout;
        this.f112515m = relativeLayout;
        this.f112516n = recyclerView;
        this.f112517o = recyclerView2;
        this.f112518p = smartRefreshLayout2;
        this.f112519q = marqueeTextView;
        this.f112520r = textView;
        this.f112521s = textView2;
        this.f112522t = textView3;
        this.f112523u = textView4;
        this.f112524v = textView5;
        this.f112525w = textView6;
        this.f112526x = textView7;
        this.f112527y = textView8;
        this.f112528z = textView9;
        this.A = textView10;
        this.B = textView11;
        this.C = textView12;
        this.D = textView13;
        this.E = textView14;
        this.F = textView15;
        this.G = view2;
        this.H = frameLayout;
        this.I = linearLayout2;
        this.J = linearLayout3;
        this.K = linearLayout4;
        this.L = relativeLayout2;
        this.M = frameLayout2;
        this.N = linearLayout5;
        this.O = linearLayout6;
        this.P = linearLayout7;
        this.Q = relativeLayout3;
        this.R = lh0Var;
        this.S = webView;
    }

    @androidx.annotation.n0
    public static ka a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17424, new Class[]{View.class}, ka.class);
        if (patchProxyResultProxy.isSupported) {
            return (ka) patchProxyResultProxy.result;
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
                    i10 = R.id.iv_fragment_r6_data_avatar;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_fragment_r6_data_avatar);
                    if (imageView2 != null) {
                        i10 = R.id.iv_fragment_r6_data_update_icon;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_fragment_r6_data_update_icon);
                        if (imageView3 != null) {
                            i10 = R.id.iv_level_frame;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_level_frame);
                            if (imageView4 != null) {
                                i10 = R.id.iv_level_frame_icon;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_level_frame_icon);
                                if (imageView5 != null) {
                                    i10 = R.id.iv_r6_data_head_image;
                                    ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_r6_data_head_image);
                                    if (imageView6 != null) {
                                        i10 = R.id.iv_rank_img;
                                        ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_rank_img);
                                        if (imageView7 != null) {
                                            i10 = R.id.iv_tag;
                                            ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_tag);
                                            if (imageView8 != null) {
                                                i10 = R.id.ll_expanded_data;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_expanded_data);
                                                if (linearLayout != null) {
                                                    i10 = R.id.rl_message;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_message);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.rv_expanded_data;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_expanded_data);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.rv_header_data;
                                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_header_data);
                                                            if (recyclerView2 != null) {
                                                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                                                i10 = R.id.tv_content;
                                                                MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_content);
                                                                if (marqueeTextView != null) {
                                                                    i10 = R.id.tv_data_expand;
                                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_data_expand);
                                                                    if (textView != null) {
                                                                        i10 = R.id.tv_fragment_r6_bind_hint;
                                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_bind_hint);
                                                                        if (textView2 != null) {
                                                                            i10 = R.id.tv_fragment_r6_data_nickname;
                                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_data_nickname);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_fragment_r6_data_update_text;
                                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_data_update_text);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.tv_fragment_r6_data_update_time;
                                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_data_update_time);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.tv_level;
                                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_level);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.tv_medal_bronze;
                                                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_medal_bronze);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.tv_medal_gold;
                                                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_medal_gold);
                                                                                                if (textView8 != null) {
                                                                                                    i10 = R.id.tv_medal_silver;
                                                                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_medal_silver);
                                                                                                    if (textView9 != null) {
                                                                                                        i10 = R.id.tv_r6_data_desc1;
                                                                                                        TextView textView10 = (TextView) l3.d.a(view, R.id.tv_r6_data_desc1);
                                                                                                        if (textView10 != null) {
                                                                                                            i10 = R.id.tv_r6_data_desc2;
                                                                                                            TextView textView11 = (TextView) l3.d.a(view, R.id.tv_r6_data_desc2);
                                                                                                            if (textView11 != null) {
                                                                                                                i10 = R.id.tv_r6_data_main1;
                                                                                                                TextView textView12 = (TextView) l3.d.a(view, R.id.tv_r6_data_main1);
                                                                                                                if (textView12 != null) {
                                                                                                                    i10 = R.id.tv_r6_data_main2;
                                                                                                                    TextView textView13 = (TextView) l3.d.a(view, R.id.tv_r6_data_main2);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i10 = R.id.tv_season;
                                                                                                                        TextView textView14 = (TextView) l3.d.a(view, R.id.tv_season);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i10 = R.id.tv_season_arrow;
                                                                                                                            TextView textView15 = (TextView) l3.d.a(view, R.id.tv_season_arrow);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i10 = R.id.v_fragment_r6_game_data;
                                                                                                                                View viewA2 = l3.d.a(view, R.id.v_fragment_r6_game_data);
                                                                                                                                if (viewA2 != null) {
                                                                                                                                    i10 = R.id.vg_bind_card_container;
                                                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bind_card_container);
                                                                                                                                    if (frameLayout != null) {
                                                                                                                                        i10 = R.id.vg_content_list;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_content_list);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i10 = R.id.vg_data_container;
                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_data_container);
                                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                                i10 = R.id.vg_fragment_r6_bind_hint;
                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_fragment_r6_bind_hint);
                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                    i10 = R.id.vg_fragment_r6_data_update;
                                                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_fragment_r6_data_update);
                                                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                                                        i10 = R.id.vg_level;
                                                                                                                                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_level);
                                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                                            i10 = R.id.vg_medal;
                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_medal);
                                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                                i10 = R.id.vg_r6_data_player_info_wrapper;
                                                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_r6_data_player_info_wrapper);
                                                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                                                    i10 = R.id.vg_rating;
                                                                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_rating);
                                                                                                                                                                    if (linearLayout7 != null) {
                                                                                                                                                                        i10 = R.id.vg_season;
                                                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_season);
                                                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                                                            i10 = R.id.view_radar_chart;
                                                                                                                                                                            View viewA3 = l3.d.a(view, R.id.view_radar_chart);
                                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                                lh0 lh0VarA = lh0.a(viewA3);
                                                                                                                                                                                i10 = R.id.webview_update;
                                                                                                                                                                                WebView webView = (WebView) l3.d.a(view, R.id.webview_update);
                                                                                                                                                                                if (webView != null) {
                                                                                                                                                                                    return new ka(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, linearLayout, relativeLayout, recyclerView, recyclerView2, smartRefreshLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewA2, frameLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout2, frameLayout2, linearLayout5, linearLayout6, linearLayout7, relativeLayout3, lh0VarA, webView);
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
    public static ka c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17422, new Class[]{LayoutInflater.class}, ka.class);
        return patchProxyResultProxy.isSupported ? (ka) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ka d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17423, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ka.class);
        if (patchProxyResultProxy.isSupported) {
            return (ka) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ow_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f112503a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17425, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
