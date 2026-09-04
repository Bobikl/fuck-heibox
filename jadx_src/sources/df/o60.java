package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PriceLowestTagView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGamePriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PriceLowestTagView f114121h;

    private o60(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 PriceLowestTagView priceLowestTagView) {
        this.f114114a = linearLayout;
        this.f114115b = imageView;
        this.f114116c = hBLineHeightTextView;
        this.f114117d = textView;
        this.f114118e = textView2;
        this.f114119f = textView3;
        this.f114120g = textView4;
        this.f114121h = priceLowestTagView;
    }

    @androidx.annotation.n0
    public static o60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20752, new Class[]{View.class}, o60.class);
        if (patchProxyResultProxy.isSupported) {
            return (o60) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_country_flag;
            HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_country_flag);
            if (hBLineHeightTextView != null) {
                i10 = R.id.tv_current_price;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                if (textView != null) {
                    i10 = R.id.tv_current_price_symbol;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_price_symbol);
                    if (textView2 != null) {
                        i10 = R.id.tv_inner_discount;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_inner_discount);
                        if (textView3 != null) {
                            i10 = R.id.tv_original_price;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_original_price);
                            if (textView4 != null) {
                                i10 = R.id.v_price_tag;
                                PriceLowestTagView priceLowestTagView = (PriceLowestTagView) l3.d.a(view, R.id.v_price_tag);
                                if (priceLowestTagView != null) {
                                    return new o60((LinearLayout) view, imageView, hBLineHeightTextView, textView, textView2, textView3, textView4, priceLowestTagView);
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
    public static o60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20750, new Class[]{LayoutInflater.class}, o60.class);
        return patchProxyResultProxy.isSupported ? (o60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20751, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o60.class);
        if (patchProxyResultProxy.isSupported) {
            return (o60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114114a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20753, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
