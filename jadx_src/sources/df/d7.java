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
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentAcGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final RelativeLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final lh0 G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f109654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f109667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109673t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109674u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109678y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109679z;

    private d7(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 lh0 lh0Var) {
        this.f109654a = smartRefreshLayout;
        this.f109655b = view;
        this.f109656c = cardView;
        this.f109657d = imageView;
        this.f109658e = imageView2;
        this.f109659f = imageView3;
        this.f109660g = imageView4;
        this.f109661h = imageView5;
        this.f109662i = linearLayout;
        this.f109663j = relativeLayout;
        this.f109664k = recyclerView;
        this.f109665l = recyclerView2;
        this.f109666m = smartRefreshLayout2;
        this.f109667n = marqueeTextView;
        this.f109668o = textView;
        this.f109669p = textView2;
        this.f109670q = textView3;
        this.f109671r = textView4;
        this.f109672s = textView5;
        this.f109673t = textView6;
        this.f109674u = textView7;
        this.f109675v = textView8;
        this.f109676w = textView9;
        this.f109677x = textView10;
        this.f109678y = textView11;
        this.f109679z = frameLayout;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = linearLayout4;
        this.D = relativeLayout2;
        this.E = relativeLayout3;
        this.F = relativeLayout4;
        this.G = lh0Var;
    }

    @androidx.annotation.n0
    public static d7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17084, new Class[]{View.class}, d7.class);
        if (patchProxyResultProxy.isSupported) {
            return (d7) patchProxyResultProxy.result;
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
                    i10 = R.id.iv_dac_data_head_image;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_dac_data_head_image);
                    if (imageView2 != null) {
                        i10 = R.id.iv_dac_data_img1;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_dac_data_img1);
                        if (imageView3 != null) {
                            i10 = R.id.iv_dac_data_img2;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_dac_data_img2);
                            if (imageView4 != null) {
                                i10 = R.id.iv_fragment_dac_data_avatar;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_fragment_dac_data_avatar);
                                if (imageView5 != null) {
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
                                                        i10 = R.id.tv_credit_score;
                                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_credit_score);
                                                        if (textView != null) {
                                                            i10 = R.id.tv_dac_data_desc1;
                                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_dac_data_desc1);
                                                            if (textView2 != null) {
                                                                i10 = R.id.tv_dac_data_desc2;
                                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_dac_data_desc2);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_dac_data_main1;
                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_dac_data_main1);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tv_dac_data_main2;
                                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_dac_data_main2);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.tv_data_expand;
                                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_data_expand);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.tv_follow;
                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_follow);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_fragment_dac_data_nickname;
                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_fragment_dac_data_nickname);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_fragment_dac_data_update_text;
                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_fragment_dac_data_update_text);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tv_season;
                                                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_season);
                                                                                            if (textView10 != null) {
                                                                                                i10 = R.id.tv_season_arrow;
                                                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_season_arrow);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.vg_bind_card_container;
                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bind_card_container);
                                                                                                    if (frameLayout != null) {
                                                                                                        i10 = R.id.vg_content_list;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_content_list);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i10 = R.id.vg_dac_data_player_info_wrapper;
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_dac_data_player_info_wrapper);
                                                                                                            if (linearLayout3 != null) {
                                                                                                                i10 = R.id.vg_data_container;
                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_data_container);
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    i10 = R.id.vg_name;
                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                        i10 = R.id.vg_season;
                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_season);
                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                            i10 = R.id.vg_stats;
                                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_stats);
                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                i10 = R.id.view_radar_chart;
                                                                                                                                View viewA2 = l3.d.a(view, R.id.view_radar_chart);
                                                                                                                                if (viewA2 != null) {
                                                                                                                                    return new d7(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, recyclerView, recyclerView2, smartRefreshLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, frameLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout2, relativeLayout3, relativeLayout4, lh0.a(viewA2));
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
    public static d7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17082, new Class[]{LayoutInflater.class}, d7.class);
        return patchProxyResultProxy.isSupported ? (d7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17083, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d7.class);
        if (patchProxyResultProxy.isSupported) {
            return (d7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ac_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f109654a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17085, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
