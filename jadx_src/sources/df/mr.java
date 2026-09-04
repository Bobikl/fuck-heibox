package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsLinkV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f113513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final lr f113514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f113515g;

    private mr(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 lr lrVar, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f113509a = linearLayout;
        this.f113510b = imageView;
        this.f113511c = expressionTextView;
        this.f113512d = expressionTextView2;
        this.f113513e = bBSLinkListBottomBar;
        this.f113514f = lrVar;
        this.f113515g = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static mr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19196, new Class[]{View.class}, mr.class);
        if (patchProxyResultProxy.isSupported) {
            return (mr) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_link_more;
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
                        i10 = R.id.vg_img;
                        View viewA = l3.d.a(view, R.id.vg_img);
                        if (viewA != null) {
                            lr lrVarA = lr.a(viewA);
                            i10 = R.id.vg_user;
                            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
                            if (bBSUserSectionSmallView != null) {
                                return new mr((LinearLayout) view, imageView, expressionTextView, expressionTextView2, bBSLinkListBottomBar, lrVarA, bBSUserSectionSmallView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19194, new Class[]{LayoutInflater.class}, mr.class);
        return patchProxyResultProxy.isSupported ? (mr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19195, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mr.class);
        if (patchProxyResultProxy.isSupported) {
            return (mr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_link_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113509a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19197, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
