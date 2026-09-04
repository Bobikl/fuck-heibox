package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewBigGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class me0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final InnerGameItemView f113424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113429g;

    private me0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 InnerGameItemView innerGameItemView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113423a = relativeLayout;
        this.f113424b = innerGameItemView;
        this.f113425c = qMUIRadiusImageView;
        this.f113426d = imageView;
        this.f113427e = imageView2;
        this.f113428f = textView;
        this.f113429g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static me0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21566, new Class[]{View.class}, me0.class);
        if (patchProxyResultProxy.isSupported) {
            return (me0) patchProxyResultProxy.result;
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
                    i10 = R.id.iv_gradient_top;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_gradient_top);
                    if (imageView2 != null) {
                        i10 = R.id.tv_left_top_label;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_left_top_label);
                        if (textView != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new me0(relativeLayout, innerGameItemView, qMUIRadiusImageView, imageView, imageView2, textView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static me0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21564, new Class[]{LayoutInflater.class}, me0.class);
        return patchProxyResultProxy.isSupported ? (me0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static me0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21565, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, me0.class);
        if (patchProxyResultProxy.isSupported) {
            return (me0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_big_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113423a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21567, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
