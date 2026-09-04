package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityMallPurchaseBundleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final TextView B;

    @androidx.annotation.n0
    public final TextView C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    @androidx.annotation.n0
    public final RelativeLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final RelativeLayout J;

    @androidx.annotation.n0
    public final RelativeLayout K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f111943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f111948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f111954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111962z;

    private j1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView3, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout8) {
        this.f111937a = relativeLayout;
        this.f111938b = cardView;
        this.f111939c = cardView2;
        this.f111940d = view;
        this.f111941e = cardView3;
        this.f111942f = imageView;
        this.f111943g = qMUIRadiusImageView;
        this.f111944h = imageView2;
        this.f111945i = imageView3;
        this.f111946j = recyclerView;
        this.f111947k = oVar;
        this.f111948l = smartRefreshLayout;
        this.f111949m = textView;
        this.f111950n = textView2;
        this.f111951o = textView3;
        this.f111952p = textView4;
        this.f111953q = textView5;
        this.f111954r = marqueeTextView;
        this.f111955s = textView6;
        this.f111956t = textView7;
        this.f111957u = textView8;
        this.f111958v = textView9;
        this.f111959w = textView10;
        this.f111960x = textView11;
        this.f111961y = textView12;
        this.f111962z = textView13;
        this.A = textView14;
        this.B = textView15;
        this.C = textView16;
        this.D = linearLayout;
        this.E = relativeLayout2;
        this.F = relativeLayout3;
        this.G = relativeLayout4;
        this.H = relativeLayout5;
        this.I = relativeLayout6;
        this.J = relativeLayout7;
        this.K = relativeLayout8;
    }

    @androidx.annotation.n0
    public static j1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16484, new Class[]{View.class}, j1.class);
        if (patchProxyResultProxy.isSupported) {
            return (j1) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_order_detail;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_order_detail);
        if (cardView != null) {
            i10 = R.id.card_steam_info;
            CardView cardView2 = (CardView) l3.d.a(view, R.id.card_steam_info);
            if (cardView2 != null) {
                i10 = R.id.confirm_divider;
                View viewA = l3.d.a(view, R.id.confirm_divider);
                if (viewA != null) {
                    i10 = R.id.cv_cards;
                    CardView cardView3 = (CardView) l3.d.a(view, R.id.cv_cards);
                    if (cardView3 != null) {
                        i10 = R.id.iv_dismiss_message;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_dismiss_message);
                        if (imageView != null) {
                            i10 = R.id.iv_product_img;
                            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_product_img);
                            if (qMUIRadiusImageView != null) {
                                i10 = R.id.iv_steam_avatar;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam_avatar);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_steam_bg;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_steam_bg);
                                    if (imageView3 != null) {
                                        i10 = R.id.rv_skus;
                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_skus);
                                        if (recyclerView != null) {
                                            i10 = R.id.skus_divider;
                                            View viewA2 = l3.d.a(view, R.id.skus_divider);
                                            if (viewA2 != null) {
                                                mb.o oVarA = mb.o.a(viewA2);
                                                i10 = R.id.srl;
                                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                if (smartRefreshLayout != null) {
                                                    i10 = R.id.tv_bottom_tips;
                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bottom_tips);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_confirm;
                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_discount_price;
                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount_price);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tv_expected_platform_balance;
                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_expected_platform_balance);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.tv_expected_steam_balance;
                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_expected_steam_balance);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.tv_message;
                                                                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                                                                        if (marqueeTextView != null) {
                                                                            i10 = R.id.tv_package_name;
                                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_package_name);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.tv_package_name_desc;
                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_package_name_desc);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_platform_name;
                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_platform_name);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_price;
                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_price);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tv_price_desc;
                                                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_price_desc);
                                                                                            if (textView10 != null) {
                                                                                                i10 = R.id.tv_product_name;
                                                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_product_name);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.tv_redeem;
                                                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_redeem);
                                                                                                    if (textView12 != null) {
                                                                                                        i10 = R.id.tv_steam_balance;
                                                                                                        TextView textView13 = (TextView) l3.d.a(view, R.id.tv_steam_balance);
                                                                                                        if (textView13 != null) {
                                                                                                            i10 = R.id.tv_steam_name;
                                                                                                            TextView textView14 = (TextView) l3.d.a(view, R.id.tv_steam_name);
                                                                                                            if (textView14 != null) {
                                                                                                                i10 = R.id.tv_total_price;
                                                                                                                TextView textView15 = (TextView) l3.d.a(view, R.id.tv_total_price);
                                                                                                                if (textView15 != null) {
                                                                                                                    i10 = R.id.tv_total_price_desc;
                                                                                                                    TextView textView16 = (TextView) l3.d.a(view, R.id.tv_total_price_desc);
                                                                                                                    if (textView16 != null) {
                                                                                                                        i10 = R.id.vg_confirm;
                                                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_confirm);
                                                                                                                        if (linearLayout != null) {
                                                                                                                            i10 = R.id.vg_message;
                                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_message);
                                                                                                                            if (relativeLayout != null) {
                                                                                                                                i10 = R.id.vg_package_name;
                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_package_name);
                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                    i10 = R.id.vg_price;
                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_price);
                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                        i10 = R.id.vg_product_info;
                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_product_info);
                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                            i10 = R.id.vg_progress;
                                                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                                                            if (relativeLayout5 != null) {
                                                                                                                                                i10 = R.id.vg_steam_avatar;
                                                                                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) l3.d.a(view, R.id.vg_steam_avatar);
                                                                                                                                                if (relativeLayout6 != null) {
                                                                                                                                                    i10 = R.id.vg_total_price;
                                                                                                                                                    RelativeLayout relativeLayout7 = (RelativeLayout) l3.d.a(view, R.id.vg_total_price);
                                                                                                                                                    if (relativeLayout7 != null) {
                                                                                                                                                        return new j1((RelativeLayout) view, cardView, cardView2, viewA, cardView3, imageView, qMUIRadiusImageView, imageView2, imageView3, recyclerView, oVarA, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, marqueeTextView, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static j1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16482, new Class[]{LayoutInflater.class}, j1.class);
        return patchProxyResultProxy.isSupported ? (j1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16483, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j1.class);
        if (patchProxyResultProxy.isSupported) {
            return (j1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_mall_purchase_bundle, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111937a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16485, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
