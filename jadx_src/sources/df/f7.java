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

/* JADX INFO: compiled from: FragmentApexGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final ih0 E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final lh0 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f110450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f110462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f110463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110475z;

    private f7(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 ih0 ih0Var, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 lh0 lh0Var) {
        this.f110450a = smartRefreshLayout;
        this.f110451b = view;
        this.f110452c = cardView;
        this.f110453d = imageView;
        this.f110454e = imageView2;
        this.f110455f = imageView3;
        this.f110456g = imageView4;
        this.f110457h = imageView5;
        this.f110458i = linearLayout;
        this.f110459j = relativeLayout;
        this.f110460k = recyclerView;
        this.f110461l = recyclerView2;
        this.f110462m = smartRefreshLayout2;
        this.f110463n = marqueeTextView;
        this.f110464o = textView;
        this.f110465p = textView2;
        this.f110466q = textView3;
        this.f110467r = textView4;
        this.f110468s = textView5;
        this.f110469t = textView6;
        this.f110470u = textView7;
        this.f110471v = textView8;
        this.f110472w = textView9;
        this.f110473x = textView10;
        this.f110474y = view2;
        this.f110475z = frameLayout;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = linearLayout4;
        this.D = linearLayout5;
        this.E = ih0Var;
        this.F = relativeLayout2;
        this.G = linearLayout6;
        this.H = linearLayout7;
        this.I = lh0Var;
    }

    @androidx.annotation.n0
    public static f7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17092, new Class[]{View.class}, f7.class);
        if (patchProxyResultProxy.isSupported) {
            return (f7) patchProxyResultProxy.result;
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
                            i10 = R.id.iv_r6_data_head_image;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_r6_data_head_image);
                            if (imageView4 != null) {
                                i10 = R.id.iv_tag;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_tag);
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
                                                                                i10 = R.id.tv_r6_data_desc1;
                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_r6_data_desc1);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_r6_data_desc2;
                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_r6_data_desc2);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_r6_data_main1;
                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_r6_data_main1);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tv_r6_data_main2;
                                                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_r6_data_main2);
                                                                                            if (textView10 != null) {
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
                                                                                                                i10 = R.id.vg_faq;
                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_faq);
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    i10 = R.id.vg_fragment_r6_bind_hint;
                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_fragment_r6_bind_hint);
                                                                                                                    if (linearLayout5 != null) {
                                                                                                                        i10 = R.id.vg_fragment_r6_data_queue;
                                                                                                                        View viewA3 = l3.d.a(view, R.id.vg_fragment_r6_data_queue);
                                                                                                                        if (viewA3 != null) {
                                                                                                                            ih0 ih0VarA = ih0.a(viewA3);
                                                                                                                            i10 = R.id.vg_fragment_r6_data_update;
                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_fragment_r6_data_update);
                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                i10 = R.id.vg_r6_data_player_info_wrapper;
                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_r6_data_player_info_wrapper);
                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                    i10 = R.id.vg_rating;
                                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_rating);
                                                                                                                                    if (linearLayout7 != null) {
                                                                                                                                        i10 = R.id.view_radar_chart;
                                                                                                                                        View viewA4 = l3.d.a(view, R.id.view_radar_chart);
                                                                                                                                        if (viewA4 != null) {
                                                                                                                                            return new f7(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, recyclerView, recyclerView2, smartRefreshLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewA2, frameLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, ih0VarA, relativeLayout2, linearLayout6, linearLayout7, lh0.a(viewA4));
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
    public static f7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17090, new Class[]{LayoutInflater.class}, f7.class);
        return patchProxyResultProxy.isSupported ? (f7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17091, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f7.class);
        if (patchProxyResultProxy.isSupported) {
            return (f7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_apex_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f110450a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17093, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
