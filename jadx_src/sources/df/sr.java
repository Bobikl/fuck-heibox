package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f115684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f115685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f115686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f115687g;

    private sr(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f115681a = linearLayout;
        this.f115682b = qMUIRadiusImageView;
        this.f115683c = imageView;
        this.f115684d = expressionTextView;
        this.f115685e = expressionTextView2;
        this.f115686f = bBSLinkListBottomBar;
        this.f115687g = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static sr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19220, new Class[]{View.class}, sr.class);
        if (patchProxyResultProxy.isSupported) {
            return (sr) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_link_more;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_link_more);
            if (imageView != null) {
                i10 = R.id.tv_content;
                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
                if (expressionTextView != null) {
                    i10 = R.id.tv_title;
                    ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                    if (expressionTextView2 != null) {
                        i10 = R.id.vg_bottom_bar;
                        BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
                        if (bBSLinkListBottomBar != null) {
                            i10 = R.id.vg_user;
                            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
                            if (bBSUserSectionSmallView != null) {
                                return new sr((LinearLayout) view, qMUIRadiusImageView, imageView, expressionTextView, expressionTextView2, bBSLinkListBottomBar, bBSUserSectionSmallView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19218, new Class[]{LayoutInflater.class}, sr.class);
        return patchProxyResultProxy.isSupported ? (sr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19219, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sr.class);
        if (patchProxyResultProxy.isSupported) {
            return (sr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115681a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19221, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
