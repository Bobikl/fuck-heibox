package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogGameStorePurchaseShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114445e;

    private p5(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f114441a = linearLayout;
        this.f114442b = imageView;
        this.f114443c = imageView2;
        this.f114444d = imageView3;
        this.f114445e = linearLayout2;
    }

    @androidx.annotation.n0
    public static p5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16924, new Class[]{View.class}, p5.class);
        if (patchProxyResultProxy.isSupported) {
            return (p5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_share_qq;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_share_qq);
        if (imageView != null) {
            i10 = R.id.iv_share_weixin;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_share_weixin);
            if (imageView2 != null) {
                i10 = R.id.iv_share_weixin_circle;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_share_weixin_circle);
                if (imageView3 != null) {
                    i10 = R.id.vg_weixin_share_container;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_weixin_share_container);
                    if (linearLayout != null) {
                        return new p5((LinearLayout) view, imageView, imageView2, imageView3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16922, new Class[]{LayoutInflater.class}, p5.class);
        return patchProxyResultProxy.isSupported ? (p5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16923, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p5.class);
        if (patchProxyResultProxy.isSupported) {
            return (p5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_game_store_purchase_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114441a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16925, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
