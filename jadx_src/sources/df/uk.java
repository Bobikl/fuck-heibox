package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PriceDiscountView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameGlobalPriceStaticV3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final PriceDiscountView f116470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116471j;

    private uk(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 PriceDiscountView priceDiscountView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116462a = relativeLayout;
        this.f116463b = imageView;
        this.f116464c = imageView2;
        this.f116465d = textView;
        this.f116466e = textView2;
        this.f116467f = textView3;
        this.f116468g = textView4;
        this.f116469h = textView5;
        this.f116470i = priceDiscountView;
        this.f116471j = linearLayout;
    }

    @androidx.annotation.n0
    public static uk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18501, new Class[]{View.class}, uk.class);
        if (patchProxyResultProxy.isSupported) {
            return (uk) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_expand_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_expand_arrow);
        if (imageView != null) {
            i10 = R.id.iv_flag;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_flag);
            if (imageView2 != null) {
                i10 = R.id.tv_country;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_country);
                if (textView != null) {
                    i10 = R.id.tv_current_cn_price;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_cn_price);
                    if (textView2 != null) {
                        i10 = R.id.tv_current_other_price;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_current_other_price);
                        if (textView3 != null) {
                            i10 = R.id.tv_origin_cn_price;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_origin_cn_price);
                            if (textView4 != null) {
                                i10 = R.id.tv_origin_other_price;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_origin_other_price);
                                if (textView5 != null) {
                                    i10 = R.id.v_cn_price_discount;
                                    PriceDiscountView priceDiscountView = (PriceDiscountView) l3.d.a(view, R.id.v_cn_price_discount);
                                    if (priceDiscountView != null) {
                                        i10 = R.id.vg_current_price;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_current_price);
                                        if (linearLayout != null) {
                                            return new uk((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, priceDiscountView, linearLayout);
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
    public static uk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18499, new Class[]{LayoutInflater.class}, uk.class);
        return patchProxyResultProxy.isSupported ? (uk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18500, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uk.class);
        if (patchProxyResultProxy.isSupported) {
            return (uk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_global_price_static_v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116462a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18502, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
