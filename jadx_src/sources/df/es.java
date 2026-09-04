package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOrderListMultiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class es implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallPriceCamelView f110291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110293h;

    private es(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 MallPriceCamelView mallPriceCamelView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110286a = linearLayout;
        this.f110287b = imageView;
        this.f110288c = textView;
        this.f110289d = textView2;
        this.f110290e = constraintLayout;
        this.f110291f = mallPriceCamelView;
        this.f110292g = linearLayout2;
        this.f110293h = linearLayout3;
    }

    @androidx.annotation.n0
    public static es a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19268, new Class[]{View.class}, es.class);
        if (patchProxyResultProxy.isSupported) {
            return (es) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_state_desc_faq;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_state_desc_faq);
        if (imageView != null) {
            i10 = R.id.tv_count;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
            if (textView != null) {
                i10 = R.id.tv_state_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_state_desc);
                if (textView2 != null) {
                    i10 = R.id.vg_count;
                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_count);
                    if (constraintLayout != null) {
                        i10 = R.id.vg_price;
                        MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) l3.d.a(view, R.id.vg_price);
                        if (mallPriceCamelView != null) {
                            i10 = R.id.vg_product;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_product);
                            if (linearLayout != null) {
                                i10 = R.id.vg_state_desc;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_state_desc);
                                if (linearLayout2 != null) {
                                    return new es((LinearLayout) view, imageView, textView, textView2, constraintLayout, mallPriceCamelView, linearLayout, linearLayout2);
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
    public static es c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19266, new Class[]{LayoutInflater.class}, es.class);
        return patchProxyResultProxy.isSupported ? (es) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static es d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19267, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, es.class);
        if (patchProxyResultProxy.isSupported) {
            return (es) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_order_list_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110286a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19269, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
