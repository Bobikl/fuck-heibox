package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRelatedGoodsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f114982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114991j;

    private qw(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114982a = frameLayout;
        this.f114983b = imageView;
        this.f114984c = imageView2;
        this.f114985d = imageView3;
        this.f114986e = linearLayout;
        this.f114987f = relativeLayout;
        this.f114988g = textView;
        this.f114989h = textView2;
        this.f114990i = textView3;
        this.f114991j = textView4;
    }

    @androidx.annotation.n0
    public static qw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19728, new Class[]{View.class}, qw.class);
        if (patchProxyResultProxy.isSupported) {
            return (qw) patchProxyResultProxy.result;
        }
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.iv_bg_close;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg_close);
            if (imageView2 != null) {
                i10 = R.id.iv_img_rec_float;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img_rec_float);
                if (imageView3 != null) {
                    i10 = R.id.ll_price_related;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_price_related);
                    if (linearLayout != null) {
                        i10 = R.id.ml_container;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.ml_container);
                        if (relativeLayout != null) {
                            i10 = R.id.tv_buy_product;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_buy_product);
                            if (textView != null) {
                                i10 = R.id.tv_current_price;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_price);
                                if (textView2 != null) {
                                    i10 = R.id.tv_origin_price;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_origin_price);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_related_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_related_name);
                                        if (textView4 != null) {
                                            return new qw((FrameLayout) view, imageView, imageView2, imageView3, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
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
    public static qw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19726, new Class[]{LayoutInflater.class}, qw.class);
        return patchProxyResultProxy.isSupported ? (qw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19727, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qw.class);
        if (patchProxyResultProxy.isSupported) {
            return (qw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_related_goods, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f114982a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19729, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
