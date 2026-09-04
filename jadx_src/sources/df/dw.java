package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendNewcomerCardGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f109909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f109910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f109911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109914h;

    private dw(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 GradientTextView gradientTextView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f109907a = constraintLayout;
        this.f109908b = qMUIRadiusImageView;
        this.f109909c = gradientTextView;
        this.f109910d = gradientTextView2;
        this.f109911e = hBLineHeightTextView;
        this.f109912f = textView;
        this.f109913g = textView2;
        this.f109914h = textView3;
    }

    @androidx.annotation.n0
    public static dw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19676, new Class[]{View.class}, dw.class);
        if (patchProxyResultProxy.isSupported) {
            return (dw) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_img;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_game_img);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_current_price;
            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_current_price);
            if (gradientTextView != null) {
                i10 = R.id.tv_current_price_symbol;
                GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, R.id.tv_current_price_symbol);
                if (gradientTextView2 != null) {
                    i10 = R.id.tv_game_name;
                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_game_name);
                    if (hBLineHeightTextView != null) {
                        i10 = R.id.tv_origin_price;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_origin_price);
                        if (textView != null) {
                            i10 = R.id.tv_origin_price_symbol;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_origin_price_symbol);
                            if (textView2 != null) {
                                i10 = R.id.tv_tag;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_tag);
                                if (textView3 != null) {
                                    return new dw((ConstraintLayout) view, qMUIRadiusImageView, gradientTextView, gradientTextView2, hBLineHeightTextView, textView, textView2, textView3);
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
    public static dw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19674, new Class[]{LayoutInflater.class}, dw.class);
        return patchProxyResultProxy.isSupported ? (dw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19675, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dw.class);
        if (patchProxyResultProxy.isSupported) {
            return (dw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_newcomer_card_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109907a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19677, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
