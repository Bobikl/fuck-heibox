package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.shinebuttonlib.PorterShapeImageView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemBackpackCouponBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final CardView f35326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final Barrier f35327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final PorterShapeImageView f35330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f35331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f35332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ImageView f35333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final ImageView f35334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final Guideline f35335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final GradientTextView f35336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f35337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final TextView f35339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final TextView f35341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final TextView f35342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final TextView f35343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final ImageView f35344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final ConstraintLayout f35345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @n0
    public final LinearLayout f35346u;

    private k(@n0 CardView cardView, @n0 Barrier barrier, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 PorterShapeImageView porterShapeImageView, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 Guideline guideline, @n0 GradientTextView gradientTextView, @n0 TextView textView, @n0 HBLineHeightTextView hBLineHeightTextView, @n0 TextView textView2, @n0 HBLineHeightTextView hBLineHeightTextView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 ImageView imageView6, @n0 ConstraintLayout constraintLayout, @n0 LinearLayout linearLayout) {
        this.f35326a = cardView;
        this.f35327b = barrier;
        this.f35328c = imageView;
        this.f35329d = imageView2;
        this.f35330e = porterShapeImageView;
        this.f35331f = qMUIRadiusImageView;
        this.f35332g = imageView3;
        this.f35333h = imageView4;
        this.f35334i = imageView5;
        this.f35335j = guideline;
        this.f35336k = gradientTextView;
        this.f35337l = textView;
        this.f35338m = hBLineHeightTextView;
        this.f35339n = textView2;
        this.f35340o = hBLineHeightTextView2;
        this.f35341p = textView3;
        this.f35342q = textView4;
        this.f35343r = textView5;
        this.f35344s = imageView6;
        this.f35345t = constraintLayout;
        this.f35346u = linearLayout;
    }

    @n0
    public static k a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.V4, new Class[]{View.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, i10);
        if (barrier != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_checkmark;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.iv_gradient;
                    PorterShapeImageView porterShapeImageView = (PorterShapeImageView) l3.d.a(view, i10);
                    if (porterShapeImageView != null) {
                        i10 = R.id.iv_icon;
                        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
                        if (qMUIRadiusImageView != null) {
                            i10 = R.id.iv_substract_bottom;
                            ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                            if (imageView3 != null) {
                                i10 = R.id.iv_substract_top;
                                ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                                if (imageView4 != null) {
                                    i10 = R.id.iv_tag_new;
                                    ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                                    if (imageView5 != null) {
                                        i10 = R.id.line_divider;
                                        Guideline guideline = (Guideline) l3.d.a(view, i10);
                                        if (guideline != null) {
                                            i10 = R.id.tv_action;
                                            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, i10);
                                            if (gradientTextView != null) {
                                                i10 = R.id.tv_action_x;
                                                TextView textView = (TextView) l3.d.a(view, i10);
                                                if (textView != null) {
                                                    i10 = R.id.tv_desc;
                                                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, i10);
                                                    if (hBLineHeightTextView != null) {
                                                        i10 = R.id.tv_discount;
                                                        TextView textView2 = (TextView) l3.d.a(view, i10);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_name;
                                                            HBLineHeightTextView hBLineHeightTextView2 = (HBLineHeightTextView) l3.d.a(view, i10);
                                                            if (hBLineHeightTextView2 != null) {
                                                                i10 = R.id.tv_price;
                                                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_time;
                                                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tv_unit;
                                                                        TextView textView5 = (TextView) l3.d.a(view, i10);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.v_coupon_line;
                                                                            ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                                                                            if (imageView6 != null) {
                                                                                i10 = R.id.vg_price;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, i10);
                                                                                if (constraintLayout != null) {
                                                                                    i10 = R.id.vg_tag_stack;
                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                                                    if (linearLayout != null) {
                                                                                        return new k((CardView) view, barrier, imageView, imageView2, porterShapeImageView, qMUIRadiusImageView, imageView3, imageView4, imageView5, guideline, gradientTextView, textView, hBLineHeightTextView, textView2, hBLineHeightTextView2, textView3, textView4, textView5, imageView6, constraintLayout, linearLayout);
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

    @n0
    public static k c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.T4, new Class[]{LayoutInflater.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static k d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.U4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_backpack_coupon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public CardView b() {
        return this.f35326a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.W4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
