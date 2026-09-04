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

/* JADX INFO: compiled from: FragmentR6GameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ab implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final View A;

    @androidx.annotation.n0
    public final View B;

    @androidx.annotation.n0
    public final FrameLayout C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final ih0 G;

    @androidx.annotation.n0
    public final RelativeLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final lh0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f108452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f108465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108477z;

    private ab(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 ih0 ih0Var, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 lh0 lh0Var) {
        this.f108452a = smartRefreshLayout;
        this.f108453b = view;
        this.f108454c = cardView;
        this.f108455d = imageView;
        this.f108456e = imageView2;
        this.f108457f = imageView3;
        this.f108458g = imageView4;
        this.f108459h = imageView5;
        this.f108460i = linearLayout;
        this.f108461j = relativeLayout;
        this.f108462k = recyclerView;
        this.f108463l = recyclerView2;
        this.f108464m = smartRefreshLayout2;
        this.f108465n = marqueeTextView;
        this.f108466o = textView;
        this.f108467p = textView2;
        this.f108468q = textView3;
        this.f108469r = textView4;
        this.f108470s = textView5;
        this.f108471t = textView6;
        this.f108472u = textView7;
        this.f108473v = textView8;
        this.f108474w = textView9;
        this.f108475x = textView10;
        this.f108476y = textView11;
        this.f108477z = textView12;
        this.A = view2;
        this.B = view3;
        this.C = frameLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
        this.G = ih0Var;
        this.H = relativeLayout2;
        this.I = linearLayout5;
        this.J = linearLayout6;
        this.K = lh0Var;
    }

    @androidx.annotation.n0
    public static ab a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17488, new Class[]{View.class}, ab.class);
        if (patchProxyResultProxy.isSupported) {
            return (ab) patchProxyResultProxy.result;
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
                                                                                                i10 = R.id.tv_tips;
                                                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_tips);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.tv_tips_title;
                                                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_tips_title);
                                                                                                    if (textView12 != null) {
                                                                                                        i10 = R.id.v_blank;
                                                                                                        View viewA2 = l3.d.a(view, R.id.v_blank);
                                                                                                        if (viewA2 != null) {
                                                                                                            i10 = R.id.v_fragment_r6_game_data;
                                                                                                            View viewA3 = l3.d.a(view, R.id.v_fragment_r6_game_data);
                                                                                                            if (viewA3 != null) {
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
                                                                                                                                i10 = R.id.vg_fragment_r6_data_queue;
                                                                                                                                View viewA4 = l3.d.a(view, R.id.vg_fragment_r6_data_queue);
                                                                                                                                if (viewA4 != null) {
                                                                                                                                    ih0 ih0VarA = ih0.a(viewA4);
                                                                                                                                    i10 = R.id.vg_fragment_r6_data_update;
                                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_fragment_r6_data_update);
                                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                                        i10 = R.id.vg_r6_data_player_info_wrapper;
                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_r6_data_player_info_wrapper);
                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                            i10 = R.id.vg_rating;
                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_rating);
                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                i10 = R.id.view_radar_chart;
                                                                                                                                                View viewA5 = l3.d.a(view, R.id.view_radar_chart);
                                                                                                                                                if (viewA5 != null) {
                                                                                                                                                    return new ab(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, recyclerView, recyclerView2, smartRefreshLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewA2, viewA3, frameLayout, linearLayout2, linearLayout3, linearLayout4, ih0VarA, relativeLayout2, linearLayout5, linearLayout6, lh0.a(viewA5));
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
    public static ab c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17486, new Class[]{LayoutInflater.class}, ab.class);
        return patchProxyResultProxy.isSupported ? (ab) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ab d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17487, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ab.class);
        if (patchProxyResultProxy.isSupported) {
            return (ab) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_r6_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f108452a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17489, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
