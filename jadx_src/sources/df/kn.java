package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameStorePurchaseShareHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112671i;

    private kn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112663a = linearLayout;
        this.f112664b = imageView;
        this.f112665c = imageView2;
        this.f112666d = imageView3;
        this.f112667e = imageView4;
        this.f112668f = textView;
        this.f112669g = textView2;
        this.f112670h = textView3;
        this.f112671i = linearLayout2;
    }

    @androidx.annotation.n0
    public static kn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18772, new Class[]{View.class}, kn.class);
        if (patchProxyResultProxy.isSupported) {
            return (kn) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_img);
        if (imageView != null) {
            i10 = R.id.iv_share_qq;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_share_qq);
            if (imageView2 != null) {
                i10 = R.id.iv_share_weixin;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_share_weixin);
                if (imageView3 != null) {
                    i10 = R.id.iv_share_weixin_circle;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_share_weixin_circle);
                    if (imageView4 != null) {
                        i10 = R.id.tv_share_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_share_desc);
                        if (textView != null) {
                            i10 = R.id.tv_share_tips;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_share_tips);
                            if (textView2 != null) {
                                i10 = R.id.tv_weixin_share_desc;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_weixin_share_desc);
                                if (textView3 != null) {
                                    i10 = R.id.vg_weixin_share_container;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_weixin_share_container);
                                    if (linearLayout != null) {
                                        return new kn((LinearLayout) view, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, linearLayout);
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

    @androidx.annotation.n0
    public static kn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18770, new Class[]{LayoutInflater.class}, kn.class);
        return patchProxyResultProxy.isSupported ? (kn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18771, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kn.class);
        if (patchProxyResultProxy.isSupported) {
            return (kn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_store_purchase_share_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112663a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18773, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
