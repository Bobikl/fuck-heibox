package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentMallPurchaseAvatarDecorDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f116720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116726h;

    private v9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f116719a = relativeLayout;
        this.f116720b = flexboxLayout;
        this.f116721c = imageView;
        this.f116722d = linearLayout;
        this.f116723e = textView;
        this.f116724f = textView2;
        this.f116725g = linearLayout2;
        this.f116726h = relativeLayout2;
    }

    @androidx.annotation.n0
    public static v9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17364, new Class[]{View.class}, v9.class);
        if (patchProxyResultProxy.isSupported) {
            return (v9) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_tags;
        FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
        if (flexboxLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.ll_title;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_title);
                if (linearLayout != null) {
                    i10 = R.id.tv_confirm;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                    if (textView != null) {
                        i10 = R.id.tv_h_coin;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_h_coin);
                        if (textView2 != null) {
                            i10 = R.id.vg_bottom_bar;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                            if (linearLayout2 != null) {
                                i10 = R.id.vg_progress;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                if (relativeLayout != null) {
                                    return new v9((RelativeLayout) view, flexboxLayout, imageView, linearLayout, textView, textView2, linearLayout2, relativeLayout);
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
    public static v9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17362, new Class[]{LayoutInflater.class}, v9.class);
        return patchProxyResultProxy.isSupported ? (v9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17363, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v9.class);
        if (patchProxyResultProxy.isSupported) {
            return (v9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mall_purchase_avatar_decor_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116719a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17365, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
