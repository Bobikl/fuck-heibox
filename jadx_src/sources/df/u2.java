package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityTradeOrderDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f116142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final aq f116152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116154z;

    private u2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 aq aqVar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f116129a = linearLayout;
        this.f116130b = cardView;
        this.f116131c = cardView2;
        this.f116132d = imageView;
        this.f116133e = linearLayout2;
        this.f116134f = smartRefreshLayout;
        this.f116135g = textView;
        this.f116136h = textView2;
        this.f116137i = textView3;
        this.f116138j = textView4;
        this.f116139k = textView5;
        this.f116140l = textView6;
        this.f116141m = textView7;
        this.f116142n = marqueeTextView;
        this.f116143o = textView8;
        this.f116144p = textView9;
        this.f116145q = textView10;
        this.f116146r = textView11;
        this.f116147s = textView12;
        this.f116148t = textView13;
        this.f116149u = textView14;
        this.f116150v = textView15;
        this.f116151w = linearLayout3;
        this.f116152x = aqVar;
        this.f116153y = relativeLayout;
        this.f116154z = relativeLayout2;
        this.A = linearLayout4;
    }

    @androidx.annotation.n0
    public static u2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16632, new Class[]{View.class}, u2.class);
        if (patchProxyResultProxy.isSupported) {
            return (u2) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bundles;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_bundles);
        if (cardView != null) {
            i10 = R.id.cv_discount_info;
            CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_discount_info);
            if (cardView2 != null) {
                i10 = R.id.iv_dismiss_message;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_dismiss_message);
                if (imageView != null) {
                    i10 = R.id.ll_discount_info;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_discount_info);
                    if (linearLayout != null) {
                        i10 = R.id.srl;
                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                        if (smartRefreshLayout != null) {
                            i10 = R.id.tv_cat_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_cat_desc);
                            if (textView != null) {
                                i10 = R.id.tv_cat_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_cat_title);
                                if (textView2 != null) {
                                    i10 = R.id.tv_confirm;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_confirm_price;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_confirm_price);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_create_time;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_create_time);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_create_time_desc;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_create_time_desc);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_mall_agreement;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_mall_agreement);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_message;
                                                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                                                        if (marqueeTextView != null) {
                                                            i10 = R.id.tv_order_id;
                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_order_id);
                                                            if (textView8 != null) {
                                                                i10 = R.id.tv_order_id_copy;
                                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_order_id_copy);
                                                                if (textView9 != null) {
                                                                    i10 = R.id.tv_order_id_desc;
                                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_order_id_desc);
                                                                    if (textView10 != null) {
                                                                        i10 = R.id.tv_package_name;
                                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_package_name);
                                                                        if (textView11 != null) {
                                                                            i10 = R.id.tv_package_name_desc;
                                                                            TextView textView12 = (TextView) l3.d.a(view, R.id.tv_package_name_desc);
                                                                            if (textView12 != null) {
                                                                                i10 = R.id.tv_tips_desc;
                                                                                TextView textView13 = (TextView) l3.d.a(view, R.id.tv_tips_desc);
                                                                                if (textView13 != null) {
                                                                                    i10 = R.id.tv_tips_title;
                                                                                    TextView textView14 = (TextView) l3.d.a(view, R.id.tv_tips_title);
                                                                                    if (textView14 != null) {
                                                                                        i10 = R.id.tv_trade_order_offer_tips;
                                                                                        TextView textView15 = (TextView) l3.d.a(view, R.id.tv_trade_order_offer_tips);
                                                                                        if (textView15 != null) {
                                                                                            i10 = R.id.vg_confirm;
                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_confirm);
                                                                                            if (linearLayout2 != null) {
                                                                                                i10 = R.id.vg_item_preview;
                                                                                                View viewA = l3.d.a(view, R.id.vg_item_preview);
                                                                                                if (viewA != null) {
                                                                                                    aq aqVarA = aq.a(viewA);
                                                                                                    i10 = R.id.vg_message;
                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_message);
                                                                                                    if (relativeLayout != null) {
                                                                                                        i10 = R.id.vg_progress;
                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                        if (relativeLayout2 != null) {
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) view;
                                                                                                            return new u2(linearLayout3, cardView, cardView2, imageView, linearLayout, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, marqueeTextView, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, linearLayout2, aqVarA, relativeLayout, relativeLayout2, linearLayout3);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static u2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16630, new Class[]{LayoutInflater.class}, u2.class);
        return patchProxyResultProxy.isSupported ? (u2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16631, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u2.class);
        if (patchProxyResultProxy.isSupported) {
            return (u2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_trade_order_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116129a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16633, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
