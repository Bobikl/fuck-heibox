package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletCouponRollItemBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final CardView f35255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final Barrier f35256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final View f35259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f35260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f35261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ImageView f35262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final Guideline f35263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f35266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final ImageView f35267m;

    private d(@n0 CardView cardView, @n0 Barrier barrier, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 View view, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 Guideline guideline, @n0 HBLineHeightTextView hBLineHeightTextView, @n0 HBLineHeightTextView hBLineHeightTextView2, @n0 TextView textView, @n0 ImageView imageView5) {
        this.f35255a = cardView;
        this.f35256b = barrier;
        this.f35257c = imageView;
        this.f35258d = imageView2;
        this.f35259e = view;
        this.f35260f = qMUIRadiusImageView;
        this.f35261g = imageView3;
        this.f35262h = imageView4;
        this.f35263i = guideline;
        this.f35264j = hBLineHeightTextView;
        this.f35265k = hBLineHeightTextView2;
        this.f35266l = textView;
        this.f35267m = imageView5;
    }

    @n0
    public static d a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34447t4, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, i10);
        if (barrier != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_checkmark;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null && (viewA = l3.d.a(view, (i10 = R.id.iv_frame))) != null) {
                    i10 = R.id.iv_icon;
                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
                    if (qMUIRadiusImageView != null) {
                        i10 = R.id.iv_substract_bottom;
                        ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                        if (imageView3 != null) {
                            i10 = R.id.iv_substract_top;
                            ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                            if (imageView4 != null) {
                                i10 = R.id.line_divider;
                                Guideline guideline = (Guideline) l3.d.a(view, i10);
                                if (guideline != null) {
                                    i10 = R.id.tv_desc;
                                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, i10);
                                    if (hBLineHeightTextView != null) {
                                        i10 = R.id.tv_name;
                                        HBLineHeightTextView hBLineHeightTextView2 = (HBLineHeightTextView) l3.d.a(view, i10);
                                        if (hBLineHeightTextView2 != null) {
                                            i10 = R.id.tv_time;
                                            TextView textView = (TextView) l3.d.a(view, i10);
                                            if (textView != null) {
                                                i10 = R.id.v_coupon_line;
                                                ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                                                if (imageView5 != null) {
                                                    return new d((CardView) view, barrier, imageView, imageView2, viewA, qMUIRadiusImageView, imageView3, imageView4, guideline, hBLineHeightTextView, hBLineHeightTextView2, textView, imageView5);
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
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34403r4, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34425s4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_coupon_roll_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public CardView b() {
        return this.f35255a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34469u4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
