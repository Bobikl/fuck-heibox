package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcustomview.textview.AutoLineTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PriceLowestTagView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewMallProductV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f112624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final AutoLineTextView f112631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final PriceLowestTagView f112633l;

    private kg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 View view, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 AutoLineTextView autoLineTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 PriceLowestTagView priceLowestTagView) {
        this.f112622a = cardView;
        this.f112623b = view;
        this.f112624c = flexboxLayout;
        this.f112625d = view2;
        this.f112626e = imageView;
        this.f112627f = linearLayout;
        this.f112628g = linearLayout2;
        this.f112629h = textView;
        this.f112630i = textView2;
        this.f112631j = autoLineTextView;
        this.f112632k = textView3;
        this.f112633l = priceLowestTagView;
    }

    @androidx.annotation.n0
    public static kg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21762, new Class[]{View.class}, kg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom;
        View viewA = l3.d.a(view, R.id.bottom);
        if (viewA != null) {
            i10 = R.id.fl_tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
            if (flexboxLayout != null) {
                i10 = R.id.img_divider;
                View viewA2 = l3.d.a(view, R.id.img_divider);
                if (viewA2 != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView != null) {
                        i10 = R.id.ll_h_tag;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_h_tag);
                        if (linearLayout != null) {
                            i10 = R.id.ll_price;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_price);
                            if (linearLayout2 != null) {
                                i10 = R.id.tv_current_price;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                                if (textView != null) {
                                    i10 = R.id.tv_discount;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_name;
                                        AutoLineTextView autoLineTextView = (AutoLineTextView) l3.d.a(view, R.id.tv_name);
                                        if (autoLineTextView != null) {
                                            i10 = R.id.tv_original_price;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_original_price);
                                            if (textView3 != null) {
                                                i10 = R.id.v_price_tag;
                                                PriceLowestTagView priceLowestTagView = (PriceLowestTagView) l3.d.a(view, R.id.v_price_tag);
                                                if (priceLowestTagView != null) {
                                                    return new kg0((CardView) view, viewA, flexboxLayout, viewA2, imageView, linearLayout, linearLayout2, textView, textView2, autoLineTextView, textView3, priceLowestTagView);
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
    public static kg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21760, new Class[]{LayoutInflater.class}, kg0.class);
        return patchProxyResultProxy.isSupported ? (kg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21761, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_mall_product_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112622a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21763, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
