package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallCartListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final oe0 f116902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallPriceCamelView f116916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116917w;

    private vp(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 oe0 oe0Var, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 FrameLayout frameLayout4, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 MallPriceCamelView mallPriceCamelView, @androidx.annotation.n0 FrameLayout frameLayout5) {
        this.f116895a = constraintLayout;
        this.f116896b = imageView;
        this.f116897c = imageView2;
        this.f116898d = imageView3;
        this.f116899e = imageView4;
        this.f116900f = qMUIRadiusImageView;
        this.f116901g = imageView5;
        this.f116902h = oe0Var;
        this.f116903i = linearLayout;
        this.f116904j = textView;
        this.f116905k = textView2;
        this.f116906l = textView3;
        this.f116907m = textView4;
        this.f116908n = textView5;
        this.f116909o = textView6;
        this.f116910p = frameLayout;
        this.f116911q = linearLayout2;
        this.f116912r = frameLayout2;
        this.f116913s = frameLayout3;
        this.f116914t = frameLayout4;
        this.f116915u = constraintLayout2;
        this.f116916v = mallPriceCamelView;
        this.f116917w = frameLayout5;
    }

    @androidx.annotation.n0
    public static vp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19024, new Class[]{View.class}, vp.class);
        if (patchProxyResultProxy.isSupported) {
            return (vp) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_add;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add);
        if (imageView != null) {
            i10 = R.id.iv_checkbox;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_checkbox);
            if (imageView2 != null) {
                i10 = R.id.iv_expand;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_expand);
                if (imageView3 != null) {
                    i10 = R.id.iv_game;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_game);
                    if (imageView4 != null) {
                        i10 = R.id.iv_img;
                        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
                        if (qMUIRadiusImageView != null) {
                            i10 = R.id.iv_minus;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_minus);
                            if (imageView5 != null) {
                                i10 = R.id.iv_sold_out;
                                View viewA = l3.d.a(view, R.id.iv_sold_out);
                                if (viewA != null) {
                                    oe0 oe0VarA = oe0.a(viewA);
                                    i10 = R.id.ll_tags;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_tags);
                                    if (linearLayout != null) {
                                        i10 = R.id.tv_content_1;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_content_1);
                                        if (textView != null) {
                                            i10 = R.id.tv_content_2;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_content_2);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_count;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_count);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_name;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_pre_sale;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_pre_sale);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_sale_desc;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_sale_desc);
                                                            if (textView6 != null) {
                                                                i10 = R.id.vg_check;
                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_check);
                                                                if (frameLayout != null) {
                                                                    i10 = R.id.vg_count;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_count);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_count_bar;
                                                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_count_bar);
                                                                        if (frameLayout2 != null) {
                                                                            i10 = R.id.vg_divider_group;
                                                                            FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_divider_group);
                                                                            if (frameLayout3 != null) {
                                                                                i10 = R.id.vg_divider_normal;
                                                                                FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, R.id.vg_divider_normal);
                                                                                if (frameLayout4 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    i10 = R.id.vg_price;
                                                                                    MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) l3.d.a(view, R.id.vg_price);
                                                                                    if (mallPriceCamelView != null) {
                                                                                        i10 = R.id.vg_product_info;
                                                                                        FrameLayout frameLayout5 = (FrameLayout) l3.d.a(view, R.id.vg_product_info);
                                                                                        if (frameLayout5 != null) {
                                                                                            return new vp(constraintLayout, imageView, imageView2, imageView3, imageView4, qMUIRadiusImageView, imageView5, oe0VarA, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout2, frameLayout2, frameLayout3, frameLayout4, constraintLayout, mallPriceCamelView, frameLayout5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19022, new Class[]{LayoutInflater.class}, vp.class);
        return patchProxyResultProxy.isSupported ? (vp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19023, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vp.class);
        if (patchProxyResultProxy.isSupported) {
            return (vp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_cart_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116895a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19025, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
