package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMallCartOrderPriceInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f116689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f116690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f116691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f116692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallPriceCamelView f116693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116706t;

    private v70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 MoreButton moreButton, @androidx.annotation.n0 MoreButton moreButton2, @androidx.annotation.n0 MoreButton moreButton3, @androidx.annotation.n0 MoreButton moreButton4, @androidx.annotation.n0 MallPriceCamelView mallPriceCamelView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 FrameLayout frameLayout4, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f116687a = linearLayout;
        this.f116688b = linearLayout2;
        this.f116689c = moreButton;
        this.f116690d = moreButton2;
        this.f116691e = moreButton3;
        this.f116692f = moreButton4;
        this.f116693g = mallPriceCamelView;
        this.f116694h = textView;
        this.f116695i = textView2;
        this.f116696j = textView3;
        this.f116697k = textView4;
        this.f116698l = textView5;
        this.f116699m = view;
        this.f116700n = relativeLayout;
        this.f116701o = frameLayout;
        this.f116702p = frameLayout2;
        this.f116703q = frameLayout3;
        this.f116704r = frameLayout4;
        this.f116705s = linearLayout3;
        this.f116706t = relativeLayout2;
    }

    @androidx.annotation.n0
    public static v70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20882, new Class[]{View.class}, v70.class);
        if (patchProxyResultProxy.isSupported) {
            return (v70) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_activities;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_activities);
        if (linearLayout != null) {
            i10 = R.id.mb_coupon;
            MoreButton moreButton = (MoreButton) l3.d.a(view, R.id.mb_coupon);
            if (moreButton != null) {
                i10 = R.id.mb_hcoin_deduct;
                MoreButton moreButton2 = (MoreButton) l3.d.a(view, R.id.mb_hcoin_deduct);
                if (moreButton2 != null) {
                    i10 = R.id.mb_purchase_code;
                    MoreButton moreButton3 = (MoreButton) l3.d.a(view, R.id.mb_purchase_code);
                    if (moreButton3 != null) {
                        i10 = R.id.mb_stack_coupon;
                        MoreButton moreButton4 = (MoreButton) l3.d.a(view, R.id.mb_stack_coupon);
                        if (moreButton4 != null) {
                            i10 = R.id.price_view;
                            MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) l3.d.a(view, R.id.price_view);
                            if (mallPriceCamelView != null) {
                                i10 = R.id.tv_coupon_desc;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
                                if (textView != null) {
                                    i10 = R.id.tv_pay_type;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_pay_type);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_postage;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_postage);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_stack_coupon_desc;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_stack_coupon_desc);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_total_price;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_total_price);
                                                if (textView5 != null) {
                                                    i10 = R.id.v_div_purchase;
                                                    View viewA = l3.d.a(view, R.id.v_div_purchase);
                                                    if (viewA != null) {
                                                        i10 = R.id.vg_coupon;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_coupon);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.vg_hcoin_deduct;
                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_hcoin_deduct);
                                                            if (frameLayout != null) {
                                                                i10 = R.id.vg_paytype;
                                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_paytype);
                                                                if (frameLayout2 != null) {
                                                                    i10 = R.id.vg_postage;
                                                                    FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_postage);
                                                                    if (frameLayout3 != null) {
                                                                        i10 = R.id.vg_purchase_code;
                                                                        FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, R.id.vg_purchase_code);
                                                                        if (frameLayout4 != null) {
                                                                            i10 = R.id.vg_return_info;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_return_info);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.vg_stack_coupon;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_stack_coupon);
                                                                                if (relativeLayout2 != null) {
                                                                                    return new v70((LinearLayout) view, linearLayout, moreButton, moreButton2, moreButton3, moreButton4, mallPriceCamelView, textView, textView2, textView3, textView4, textView5, viewA, relativeLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4, linearLayout2, relativeLayout2);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static v70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20880, new Class[]{LayoutInflater.class}, v70.class);
        return patchProxyResultProxy.isSupported ? (v70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20881, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v70.class);
        if (patchProxyResultProxy.isSupported) {
            return (v70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_mall_cart_order_price_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116687a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20883, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
