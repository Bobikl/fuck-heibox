package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentMallPurchaseDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117098k;

    private w9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117088a = relativeLayout;
        this.f117089b = frameLayout;
        this.f117090c = imageView;
        this.f117091d = imageView2;
        this.f117092e = relativeLayout2;
        this.f117093f = textView;
        this.f117094g = textView2;
        this.f117095h = textView3;
        this.f117096i = linearLayout;
        this.f117097j = relativeLayout3;
        this.f117098k = linearLayout2;
    }

    @androidx.annotation.n0
    public static w9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17368, new Class[]{View.class}, w9.class);
        if (patchProxyResultProxy.isSupported) {
            return (w9) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_fragment_container);
        if (frameLayout != null) {
            i10 = R.id.iv_game_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_icon);
            if (imageView != null) {
                i10 = R.id.iv_steam_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam_icon);
                if (imageView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.tv_buy_game;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_buy_game);
                    if (textView != null) {
                        i10 = R.id.tv_buy_product;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_buy_product);
                        if (textView2 != null) {
                            i10 = R.id.tv_discount;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount);
                            if (textView3 != null) {
                                i10 = R.id.vg_buy_game;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_buy_game);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_buy_product;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_buy_product);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.vg_selector;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_selector);
                                        if (linearLayout2 != null) {
                                            return new w9(relativeLayout, frameLayout, imageView, imageView2, relativeLayout, textView, textView2, textView3, linearLayout, relativeLayout2, linearLayout2);
                                        }
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
    public static w9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17366, new Class[]{LayoutInflater.class}, w9.class);
        return patchProxyResultProxy.isSupported ? (w9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17367, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w9.class);
        if (patchProxyResultProxy.isSupported) {
            return (w9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mall_purchase_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117088a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17369, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
