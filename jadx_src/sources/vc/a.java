package vc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hblayout.hbgame.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: HbLGameSingleCardBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f140866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f140867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f140868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final LinearLayout f140869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final GradientTextView f140870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final GradientTextView f140871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f140872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final GradientTextView f140873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final GradientTextView f140874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f140875j;

    private a(@n0 ConstraintLayout constraintLayout, @n0 ImageView imageView, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 LinearLayout linearLayout, @n0 GradientTextView gradientTextView, @n0 GradientTextView gradientTextView2, @n0 HBLineHeightTextView hBLineHeightTextView, @n0 GradientTextView gradientTextView3, @n0 GradientTextView gradientTextView4, @n0 TextView textView) {
        this.f140866a = constraintLayout;
        this.f140867b = imageView;
        this.f140868c = qMUIRadiusImageView;
        this.f140869d = linearLayout;
        this.f140870e = gradientTextView;
        this.f140871f = gradientTextView2;
        this.f140872g = hBLineHeightTextView;
        this.f140873h = gradientTextView3;
        this.f140874i = gradientTextView4;
        this.f140875j = textView;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.Re, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.gradient_logo_view;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_game_img;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) d.a(view, i10);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.ll_price;
                LinearLayout linearLayout = (LinearLayout) d.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.tv_current_price;
                    GradientTextView gradientTextView = (GradientTextView) d.a(view, i10);
                    if (gradientTextView != null) {
                        i10 = R.id.tv_current_price_symbol;
                        GradientTextView gradientTextView2 = (GradientTextView) d.a(view, i10);
                        if (gradientTextView2 != null) {
                            i10 = R.id.tv_game_name;
                            HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) d.a(view, i10);
                            if (hBLineHeightTextView != null) {
                                i10 = R.id.tv_origin_price;
                                GradientTextView gradientTextView3 = (GradientTextView) d.a(view, i10);
                                if (gradientTextView3 != null) {
                                    i10 = R.id.tv_origin_price_symbol;
                                    GradientTextView gradientTextView4 = (GradientTextView) d.a(view, i10);
                                    if (gradientTextView4 != null) {
                                        i10 = R.id.tv_tag;
                                        TextView textView = (TextView) d.a(view, i10);
                                        if (textView != null) {
                                            return new a((ConstraintLayout) view, imageView, qMUIRadiusImageView, linearLayout, gradientTextView, gradientTextView2, hBLineHeightTextView, gradientTextView3, gradientTextView4, textView);
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
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.Pe, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Qe, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hb_l_game_single_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f140866a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Se, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
