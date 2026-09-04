package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigContentView2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f115080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f115081d;

    private r40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2) {
        this.f115078a = linearLayout;
        this.f115079b = qMUIRadiusImageView;
        this.f115080c = expressionTextView;
        this.f115081d = expressionTextView2;
    }

    @androidx.annotation.n0
    public static r40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20556, new Class[]{View.class}, r40.class);
        if (patchProxyResultProxy.isSupported) {
            return (r40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_content;
            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
            if (expressionTextView != null) {
                i10 = R.id.tv_title;
                ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                if (expressionTextView2 != null) {
                    return new r40((LinearLayout) view, qMUIRadiusImageView, expressionTextView, expressionTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20554, new Class[]{LayoutInflater.class}, r40.class);
        return patchProxyResultProxy.isSupported ? (r40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20555, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r40.class);
        if (patchProxyResultProxy.isSupported) {
            return (r40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_content_view_2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115078a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20557, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
