package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.BlurView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRecommendMiddleGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ph0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final InnerGameItemView f114563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final BlurView f114567f;

    private ph0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 InnerGameItemView innerGameItemView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 BlurView blurView) {
        this.f114562a = relativeLayout;
        this.f114563b = innerGameItemView;
        this.f114564c = imageView;
        this.f114565d = linearLayout;
        this.f114566e = relativeLayout2;
        this.f114567f = blurView;
    }

    @androidx.annotation.n0
    public static ph0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21886, new Class[]{View.class}, ph0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ph0) patchProxyResultProxy.result;
        }
        int i10 = R.id.game_item;
        InnerGameItemView innerGameItemView = (InnerGameItemView) l3.d.a(view, R.id.game_item);
        if (innerGameItemView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView != null) {
                i10 = R.id.ll_platform_icon;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.view_blur;
                    BlurView blurView = (BlurView) l3.d.a(view, R.id.view_blur);
                    if (blurView != null) {
                        return new ph0(relativeLayout, innerGameItemView, imageView, linearLayout, relativeLayout, blurView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ph0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21884, new Class[]{LayoutInflater.class}, ph0.class);
        return patchProxyResultProxy.isSupported ? (ph0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ph0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21885, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ph0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ph0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_recommend_middle_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114562a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21887, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
