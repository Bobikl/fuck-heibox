package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMallCartOrderPayTypeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final ConstraintLayout A;

    @androidx.annotation.n0
    public final ConstraintLayout B;

    @androidx.annotation.n0
    public final LinearLayout C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f116242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f116243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f116244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f116245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116266z;

    private u70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 Guideline guideline3, @androidx.annotation.n0 Guideline guideline4, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 ConstraintLayout constraintLayout3, @androidx.annotation.n0 ConstraintLayout constraintLayout4, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f116241a = linearLayout;
        this.f116242b = guideline;
        this.f116243c = guideline2;
        this.f116244d = guideline3;
        this.f116245e = guideline4;
        this.f116246f = imageView;
        this.f116247g = imageView2;
        this.f116248h = imageView3;
        this.f116249i = imageView4;
        this.f116250j = imageView5;
        this.f116251k = imageView6;
        this.f116252l = imageView7;
        this.f116253m = imageView8;
        this.f116254n = qMUIRadiusImageView;
        this.f116255o = imageView9;
        this.f116256p = textView;
        this.f116257q = textView2;
        this.f116258r = textView3;
        this.f116259s = textView4;
        this.f116260t = textView5;
        this.f116261u = linearLayout2;
        this.f116262v = linearLayout3;
        this.f116263w = linearLayout4;
        this.f116264x = constraintLayout;
        this.f116265y = constraintLayout2;
        this.f116266z = linearLayout5;
        this.A = constraintLayout3;
        this.B = constraintLayout4;
        this.C = linearLayout6;
    }

    @androidx.annotation.n0
    public static u70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20878, new Class[]{View.class}, u70.class);
        if (patchProxyResultProxy.isSupported) {
            return (u70) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.guardline_2;
            Guideline guideline2 = (Guideline) l3.d.a(view, R.id.guardline_2);
            if (guideline2 != null) {
                i10 = R.id.guardline_3;
                Guideline guideline3 = (Guideline) l3.d.a(view, R.id.guardline_3);
                if (guideline3 != null) {
                    i10 = R.id.guardline_4;
                    Guideline guideline4 = (Guideline) l3.d.a(view, R.id.guardline_4);
                    if (guideline4 != null) {
                        i10 = R.id.iv_checkbox_ali;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_checkbox_ali);
                        if (imageView != null) {
                            i10 = R.id.iv_checkbox_h5;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_checkbox_h5);
                            if (imageView2 != null) {
                                i10 = R.id.iv_checkbox_heybox;
                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_checkbox_heybox);
                                if (imageView3 != null) {
                                    i10 = R.id.iv_checkbox_lianlian;
                                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_checkbox_lianlian);
                                    if (imageView4 != null) {
                                        i10 = R.id.iv_checkbox_weixin;
                                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_checkbox_weixin);
                                        if (imageView5 != null) {
                                            i10 = R.id.iv_icon_ali;
                                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_icon_ali);
                                            if (imageView6 != null) {
                                                i10 = R.id.iv_icon_h5;
                                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_icon_h5);
                                                if (imageView7 != null) {
                                                    i10 = R.id.iv_icon_heybox;
                                                    ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_icon_heybox);
                                                    if (imageView8 != null) {
                                                        i10 = R.id.iv_icon_lianlian;
                                                        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon_lianlian);
                                                        if (qMUIRadiusImageView != null) {
                                                            i10 = R.id.iv_icon_weixin;
                                                            ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_icon_weixin);
                                                            if (imageView9 != null) {
                                                                i10 = R.id.tv_ali_msg;
                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_ali_msg);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_desc_h5;
                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc_h5);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tv_hcash;
                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_hcash);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tv_lianlian_msg;
                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_lianlian_msg);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.tv_weixin_msg;
                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_weixin_msg);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.vg_ali_msg;
                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_ali_msg);
                                                                                    if (linearLayout != null) {
                                                                                        i10 = R.id.vg_heybox_msg;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_heybox_msg);
                                                                                        if (linearLayout2 != null) {
                                                                                            i10 = R.id.vg_lianlian_msg;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_lianlian_msg);
                                                                                            if (linearLayout3 != null) {
                                                                                                i10 = R.id.vg_pay_ali;
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_pay_ali);
                                                                                                if (constraintLayout != null) {
                                                                                                    i10 = R.id.vg_pay_h5;
                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_pay_h5);
                                                                                                    if (constraintLayout2 != null) {
                                                                                                        i10 = R.id.vg_pay_hbalace;
                                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_pay_hbalace);
                                                                                                        if (linearLayout4 != null) {
                                                                                                            i10 = R.id.vg_pay_lianlian;
                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) l3.d.a(view, R.id.vg_pay_lianlian);
                                                                                                            if (constraintLayout3 != null) {
                                                                                                                i10 = R.id.vg_pay_weixin;
                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) l3.d.a(view, R.id.vg_pay_weixin);
                                                                                                                if (constraintLayout4 != null) {
                                                                                                                    i10 = R.id.vg_weixin_msg;
                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_weixin_msg);
                                                                                                                    if (linearLayout5 != null) {
                                                                                                                        return new u70((LinearLayout) view, guideline, guideline2, guideline3, guideline4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, qMUIRadiusImageView, imageView9, textView, textView2, textView3, textView4, textView5, linearLayout, linearLayout2, linearLayout3, constraintLayout, constraintLayout2, linearLayout4, constraintLayout3, constraintLayout4, linearLayout5);
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
    public static u70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20876, new Class[]{LayoutInflater.class}, u70.class);
        return patchProxyResultProxy.isSupported ? (u70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20877, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u70.class);
        if (patchProxyResultProxy.isSupported) {
            return (u70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_mall_cart_order_pay_type, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116241a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20879, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
