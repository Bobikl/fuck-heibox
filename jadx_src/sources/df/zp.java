package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallOrderProductInfoInListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f118416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f118417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f118419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f118425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallPriceCamelView f118426k;

    private zp(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 MallPriceCamelView mallPriceCamelView) {
        this.f118416a = constraintLayout;
        this.f118417b = frameLayout;
        this.f118418c = imageView;
        this.f118419d = qMUIRadiusImageView;
        this.f118420e = textView;
        this.f118421f = textView2;
        this.f118422g = textView3;
        this.f118423h = textView4;
        this.f118424i = textView5;
        this.f118425j = constraintLayout2;
        this.f118426k = mallPriceCamelView;
    }

    @androidx.annotation.n0
    public static zp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19040, new Class[]{View.class}, zp.class);
        if (patchProxyResultProxy.isSupported) {
            return (zp) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_price;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_price);
        if (frameLayout != null) {
            i10 = R.id.iv_game;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game);
            if (imageView != null) {
                i10 = R.id.iv_img;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.tv_count;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
                    if (textView != null) {
                        i10 = R.id.tv_coupon_desc;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
                        if (textView2 != null) {
                            i10 = R.id.tv_desc;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView3 != null) {
                                i10 = R.id.tv_name;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView4 != null) {
                                    i10 = R.id.tv_pre_sale;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_pre_sale);
                                    if (textView5 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i10 = R.id.vg_price;
                                        MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) l3.d.a(view, R.id.vg_price);
                                        if (mallPriceCamelView != null) {
                                            return new zp(constraintLayout, frameLayout, imageView, qMUIRadiusImageView, textView, textView2, textView3, textView4, textView5, constraintLayout, mallPriceCamelView);
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
    public static zp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19038, new Class[]{LayoutInflater.class}, zp.class);
        return patchProxyResultProxy.isSupported ? (zp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19039, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zp.class);
        if (patchProxyResultProxy.isSupported) {
            return (zp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_order_product_info_in_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f118416a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19041, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
