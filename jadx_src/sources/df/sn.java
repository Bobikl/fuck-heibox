package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGetCouponGuideBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115672f;

    private sn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f115667a = linearLayout;
        this.f115668b = imageView;
        this.f115669c = imageView2;
        this.f115670d = textView;
        this.f115671e = textView2;
        this.f115672f = textView3;
    }

    @androidx.annotation.n0
    public static sn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18804, new Class[]{View.class}, sn.class);
        if (patchProxyResultProxy.isSupported) {
            return (sn) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_coupon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_coupon);
        if (imageView != null) {
            i10 = R.id.iv_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView2 != null) {
                i10 = R.id.tv_coupon_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
                if (textView != null) {
                    i10 = R.id.tv_coupon_title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_coupon_title);
                    if (textView2 != null) {
                        i10 = R.id.tv_more;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_more);
                        if (textView3 != null) {
                            return new sn((LinearLayout) view, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18802, new Class[]{LayoutInflater.class}, sn.class);
        return patchProxyResultProxy.isSupported ? (sn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18803, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sn.class);
        if (patchProxyResultProxy.isSupported) {
            return (sn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_get_coupon_guide, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115667a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18805, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
