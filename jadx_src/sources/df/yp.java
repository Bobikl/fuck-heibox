package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallOrderProductInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f118011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f118013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f118014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f118018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallPriceCamelView f118019i;

    private yp(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 MallPriceCamelView mallPriceCamelView) {
        this.f118011a = constraintLayout;
        this.f118012b = imageView;
        this.f118013c = qMUIRadiusImageView;
        this.f118014d = hBLineHeightTextView;
        this.f118015e = textView;
        this.f118016f = textView2;
        this.f118017g = textView3;
        this.f118018h = constraintLayout2;
        this.f118019i = mallPriceCamelView;
    }

    @androidx.annotation.n0
    public static yp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19036, new Class[]{View.class}, yp.class);
        if (patchProxyResultProxy.isSupported) {
            return (yp) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game);
        if (imageView != null) {
            i10 = R.id.iv_img;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.tv_desc;
                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                if (hBLineHeightTextView != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        i10 = R.id.tv_pre_sale;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_pre_sale);
                        if (textView2 != null) {
                            i10 = R.id.tv_waring;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_waring);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = R.id.vg_price;
                                MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) l3.d.a(view, R.id.vg_price);
                                if (mallPriceCamelView != null) {
                                    return new yp(constraintLayout, imageView, qMUIRadiusImageView, hBLineHeightTextView, textView, textView2, textView3, constraintLayout, mallPriceCamelView);
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
    public static yp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19034, new Class[]{LayoutInflater.class}, yp.class);
        return patchProxyResultProxy.isSupported ? (yp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19035, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yp.class);
        if (patchProxyResultProxy.isSupported) {
            return (yp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_order_product_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f118011a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19037, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
