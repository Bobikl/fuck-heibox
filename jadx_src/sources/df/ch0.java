package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPurchaseTotalCountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ch0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f109433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f109434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109436g;

    private ch0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 GradientTextView gradientTextView2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f109430a = relativeLayout;
        this.f109431b = imageView;
        this.f109432c = textView;
        this.f109433d = gradientTextView;
        this.f109434e = gradientTextView2;
        this.f109435f = textView2;
        this.f109436g = linearLayout;
    }

    @androidx.annotation.n0
    public static ch0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21834, new Class[]{View.class}, ch0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ch0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.tv_coupon_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
            if (textView != null) {
                i10 = R.id.tv_discount;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_discount);
                if (gradientTextView != null) {
                    i10 = R.id.tv_discount_desc;
                    GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, R.id.tv_discount_desc);
                    if (gradientTextView2 != null) {
                        i10 = R.id.tv_final_price;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_final_price);
                        if (textView2 != null) {
                            i10 = R.id.vg_discount;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_discount);
                            if (linearLayout != null) {
                                return new ch0((RelativeLayout) view, imageView, textView, gradientTextView, gradientTextView2, textView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ch0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21832, new Class[]{LayoutInflater.class}, ch0.class);
        return patchProxyResultProxy.isSupported ? (ch0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ch0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21833, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ch0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ch0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_purchase_total_count, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109430a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21835, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
