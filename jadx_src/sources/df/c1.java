package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.widget.MsgView;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityItemTradeProfileBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements l3.c {
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
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final RelativeLayout K;

    @androidx.annotation.n0
    public final RelativeLayout L;

    @androidx.annotation.n0
    public final ConstraintLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final LinearLayout O;

    @androidx.annotation.n0
    public final LinearLayout P;

    @androidx.annotation.n0
    public final LinearLayout Q;

    @androidx.annotation.n0
    public final LinearLayout R;

    @androidx.annotation.n0
    public final RelativeLayout S;

    @androidx.annotation.n0
    public final RelativeLayout T;

    @androidx.annotation.n0
    public final LinearLayout U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f109107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final MsgView f109109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final MsgView f109118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final MsgView f109119y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109120z;

    private c1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 MsgView msgView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 MsgView msgView2, @androidx.annotation.n0 MsgView msgView3, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8, @androidx.annotation.n0 LinearLayout linearLayout9, @androidx.annotation.n0 LinearLayout linearLayout10, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 LinearLayout linearLayout11) {
        this.f109095a = linearLayout;
        this.f109096b = imageView;
        this.f109097c = imageView2;
        this.f109098d = imageView3;
        this.f109099e = imageView4;
        this.f109100f = imageView5;
        this.f109101g = imageView6;
        this.f109102h = imageView7;
        this.f109103i = imageView8;
        this.f109104j = relativeLayout;
        this.f109105k = recyclerView;
        this.f109106l = smartRefreshLayout;
        this.f109107m = titleBar;
        this.f109108n = textView;
        this.f109109o = msgView;
        this.f109110p = textView2;
        this.f109111q = textView3;
        this.f109112r = textView4;
        this.f109113s = textView5;
        this.f109114t = textView6;
        this.f109115u = textView7;
        this.f109116v = textView8;
        this.f109117w = textView9;
        this.f109118x = msgView2;
        this.f109119y = msgView3;
        this.f109120z = textView10;
        this.A = textView11;
        this.B = textView12;
        this.C = textView13;
        this.D = textView14;
        this.E = textView15;
        this.F = textView16;
        this.G = linearLayout2;
        this.H = linearLayout3;
        this.I = linearLayout4;
        this.J = linearLayout5;
        this.K = relativeLayout2;
        this.L = relativeLayout3;
        this.M = constraintLayout;
        this.N = linearLayout6;
        this.O = linearLayout7;
        this.P = linearLayout8;
        this.Q = linearLayout9;
        this.R = linearLayout10;
        this.S = relativeLayout4;
        this.T = relativeLayout5;
        this.U = linearLayout11;
    }

    @androidx.annotation.n0
    public static c1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16456, new Class[]{View.class}, c1.class);
        if (patchProxyResultProxy.isSupported) {
            return (c1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView2 != null) {
                i10 = R.id.iv_data_update_icon;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_data_update_icon);
                if (imageView3 != null) {
                    i10 = R.id.iv_delivering;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_delivering);
                    if (imageView4 != null) {
                        i10 = R.id.iv_order_info_4;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_order_info_4);
                        if (imageView5 != null) {
                            i10 = R.id.iv_sell_info_4;
                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_sell_info_4);
                            if (imageView6 != null) {
                                i10 = R.id.iv_to_receive_icon;
                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_to_receive_icon);
                                if (imageView7 != null) {
                                    i10 = R.id.iv_trade_state;
                                    ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_trade_state);
                                    if (imageView8 != null) {
                                        i10 = R.id.rl_medal_level;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                                        if (relativeLayout != null) {
                                            i10 = R.id.rv_tools;
                                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_tools);
                                            if (recyclerView != null) {
                                                i10 = R.id.srl;
                                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                if (smartRefreshLayout != null) {
                                                    i10 = R.id.toolbar;
                                                    TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                                    if (titleBar != null) {
                                                        i10 = R.id.tv_bargain_purchase;
                                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_bargain_purchase);
                                                        if (textView != null) {
                                                            i10 = R.id.tv_bargain_sell;
                                                            MsgView msgView = (MsgView) l3.d.a(view, R.id.tv_bargain_sell);
                                                            if (msgView != null) {
                                                                i10 = R.id.tv_buy_orders;
                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_buy_orders);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.tv_data_update_text;
                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_data_update_text);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.tv_favour_num;
                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_favour_num);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_follow_num;
                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_follow_num);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_login_desc;
                                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_login_desc);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.tv_my_sell;
                                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_my_sell);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.tv_my_trade;
                                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_my_trade);
                                                                                        if (textView8 != null) {
                                                                                            i10 = R.id.tv_name;
                                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                                            if (textView9 != null) {
                                                                                                i10 = R.id.tv_num_to_delivering;
                                                                                                MsgView msgView2 = (MsgView) l3.d.a(view, R.id.tv_num_to_delivering);
                                                                                                if (msgView2 != null) {
                                                                                                    i10 = R.id.tv_num_to_received;
                                                                                                    MsgView msgView3 = (MsgView) l3.d.a(view, R.id.tv_num_to_received);
                                                                                                    if (msgView3 != null) {
                                                                                                        i10 = R.id.tv_order_sell;
                                                                                                        TextView textView10 = (TextView) l3.d.a(view, R.id.tv_order_sell);
                                                                                                        if (textView10 != null) {
                                                                                                            i10 = R.id.tv_selling;
                                                                                                            TextView textView11 = (TextView) l3.d.a(view, R.id.tv_selling);
                                                                                                            if (textView11 != null) {
                                                                                                                i10 = R.id.tv_tools;
                                                                                                                TextView textView12 = (TextView) l3.d.a(view, R.id.tv_tools);
                                                                                                                if (textView12 != null) {
                                                                                                                    i10 = R.id.tv_trade_check_message;
                                                                                                                    TextView textView13 = (TextView) l3.d.a(view, R.id.tv_trade_check_message);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i10 = R.id.tv_trade_state;
                                                                                                                        TextView textView14 = (TextView) l3.d.a(view, R.id.tv_trade_state);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i10 = R.id.tv_wallet_value;
                                                                                                                            TextView textView15 = (TextView) l3.d.a(view, R.id.tv_wallet_value);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i10 = R.id.tv_want_to_buy;
                                                                                                                                TextView textView16 = (TextView) l3.d.a(view, R.id.tv_want_to_buy);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i10 = R.id.vg_data_update;
                                                                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_data_update);
                                                                                                                                    if (linearLayout != null) {
                                                                                                                                        i10 = R.id.vg_info_group_1;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_info_group_1);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i10 = R.id.vg_order_info_1;
                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_order_info_1);
                                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                                i10 = R.id.vg_order_info_2;
                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_order_info_2);
                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                    i10 = R.id.vg_order_info_3;
                                                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_order_info_3);
                                                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                                                        i10 = R.id.vg_order_info_4;
                                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_order_info_4);
                                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                                            i10 = R.id.vg_profile;
                                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_profile);
                                                                                                                                                            if (constraintLayout != null) {
                                                                                                                                                                i10 = R.id.vg_profile_info_1;
                                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_profile_info_1);
                                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                                    i10 = R.id.vg_profile_info_2;
                                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_profile_info_2);
                                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                                        i10 = R.id.vg_profile_info_3;
                                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_profile_info_3);
                                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                                            i10 = R.id.vg_sell_info_1;
                                                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, R.id.vg_sell_info_1);
                                                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                                                i10 = R.id.vg_sell_info_2;
                                                                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, R.id.vg_sell_info_2);
                                                                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                                                                    i10 = R.id.vg_sell_info_3;
                                                                                                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_sell_info_3);
                                                                                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                                                                                        i10 = R.id.vg_sell_info_4;
                                                                                                                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_sell_info_4);
                                                                                                                                                                                        if (relativeLayout5 != null) {
                                                                                                                                                                                            i10 = R.id.vg_state;
                                                                                                                                                                                            LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, R.id.vg_state);
                                                                                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                                                                                return new c1((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, relativeLayout, recyclerView, smartRefreshLayout, titleBar, textView, msgView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, msgView2, msgView3, textView10, textView11, textView12, textView13, textView14, textView15, textView16, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout2, relativeLayout3, constraintLayout, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, relativeLayout4, relativeLayout5, linearLayout10);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static c1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16454, new Class[]{LayoutInflater.class}, c1.class);
        return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16455, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c1.class);
        if (patchProxyResultProxy.isSupported) {
            return (c1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_item_trade_profile, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109095a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16457, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
