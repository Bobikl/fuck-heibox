package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHorLinkV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f114947g;

    private qo(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 HBUiKitView hBUiKitView) {
        this.f114941a = cardView;
        this.f114942b = imageView;
        this.f114943c = imageView2;
        this.f114944d = textView;
        this.f114945e = expressionTextView;
        this.f114946f = view;
        this.f114947g = hBUiKitView;
    }

    @androidx.annotation.n0
    public static qo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18900, new Class[]{View.class}, qo.class);
        if (patchProxyResultProxy.isSupported) {
            return (qo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_comment_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_comment_icon);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.tv_comment_num;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_comment_num);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                    if (expressionTextView != null) {
                        i10 = R.id.v_border;
                        View viewA = l3.d.a(view, R.id.v_border);
                        if (viewA != null) {
                            i10 = R.id.v_bottom_uikit;
                            HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_bottom_uikit);
                            if (hBUiKitView != null) {
                                return new qo((CardView) view, imageView, imageView2, textView, expressionTextView, viewA, hBUiKitView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18898, new Class[]{LayoutInflater.class}, qo.class);
        return patchProxyResultProxy.isSupported ? (qo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18899, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qo.class);
        if (patchProxyResultProxy.isSupported) {
            return (qo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hor_link_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114941a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18901, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
