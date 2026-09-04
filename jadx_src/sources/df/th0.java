package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.BlurView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewSearchGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class th0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final InnerGameItemView f116013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final BlurView f116018g;

    private th0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 InnerGameItemView innerGameItemView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 BlurView blurView) {
        this.f116012a = relativeLayout;
        this.f116013b = innerGameItemView;
        this.f116014c = qMUIRadiusImageView;
        this.f116015d = imageView;
        this.f116016e = textView;
        this.f116017f = relativeLayout2;
        this.f116018g = blurView;
    }

    @androidx.annotation.n0
    public static th0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21902, new Class[]{View.class}, th0.class);
        if (patchProxyResultProxy.isSupported) {
            return (th0) patchProxyResultProxy.result;
        }
        int i10 = R.id.game_item;
        InnerGameItemView innerGameItemView = (InnerGameItemView) l3.d.a(view, R.id.game_item);
        if (innerGameItemView != null) {
            i10 = R.id.iv_bg;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_bg);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_gradient;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient);
                if (imageView != null) {
                    i10 = R.id.tv_left_top_label;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_left_top_label);
                    if (textView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.view_blur;
                        BlurView blurView = (BlurView) l3.d.a(view, R.id.view_blur);
                        if (blurView != null) {
                            return new th0(relativeLayout, innerGameItemView, qMUIRadiusImageView, imageView, textView, relativeLayout, blurView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static th0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21900, new Class[]{LayoutInflater.class}, th0.class);
        return patchProxyResultProxy.isSupported ? (th0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static th0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21901, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, th0.class);
        if (patchProxyResultProxy.isSupported) {
            return (th0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_search_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116012a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21903, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
