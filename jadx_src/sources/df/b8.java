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

/* JADX INFO: compiled from: FragmentDestinyGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b8 implements l3.c {
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f108834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f108847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108858y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108859z;

    private b8(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 ih0 ih0Var, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7) {
        this.f108834a = smartRefreshLayout;
        this.f108835b = view;
        this.f108836c = cardView;
        this.f108837d = imageView;
        this.f108838e = imageView2;
        this.f108839f = imageView3;
        this.f108840g = imageView4;
        this.f108841h = imageView5;
        this.f108842i = linearLayout;
        this.f108843j = relativeLayout;
        this.f108844k = recyclerView;
        this.f108845l = recyclerView2;
        this.f108846m = smartRefreshLayout2;
        this.f108847n = marqueeTextView;
        this.f108848o = textView;
        this.f108849p = textView2;
        this.f108850q = textView3;
        this.f108851r = textView4;
        this.f108852s = textView5;
        this.f108853t = textView6;
        this.f108854u = textView7;
        this.f108855v = textView8;
        this.f108856w = textView9;
        this.f108857x = textView10;
        this.f108858y = view2;
        this.f108859z = frameLayout;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = linearLayout4;
        this.D = linearLayout5;
        this.E = ih0Var;
        this.F = relativeLayout2;
        this.G = linearLayout6;
        this.H = linearLayout7;
    }

    @androidx.annotation.n0
    public static b8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17180, new Class[]{View.class}, b8.class);
        if (patchProxyResultProxy.isSupported) {
            return (b8) patchProxyResultProxy.result;
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
                                                            i10 = R.id.tv_fragment_destiny2_mode;
                                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_fragment_destiny2_mode);
                                                            if (textView2 != null) {
                                                                i10 = R.id.tv_fragment_r6_bind_hint;
                                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_bind_hint);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_fragment_r6_data_nickname;
                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_data_nickname);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tv_fragment_r6_data_update_text;
                                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_fragment_r6_data_update_text);
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
                                                                                                                i10 = R.id.vg_fragment_destiny2_play_mode_wrapper;
                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_fragment_destiny2_play_mode_wrapper);
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
                                                                                                                                        return new b8(smartRefreshLayout, viewA, cardView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, recyclerView, recyclerView2, smartRefreshLayout, marqueeTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewA2, frameLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, ih0VarA, relativeLayout2, linearLayout6, linearLayout7);
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
    public static b8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17178, new Class[]{LayoutInflater.class}, b8.class);
        return patchProxyResultProxy.isSupported ? (b8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17179, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b8.class);
        if (patchProxyResultProxy.isSupported) {
            return (b8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_destiny_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f108834a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17181, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
