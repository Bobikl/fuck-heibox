package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemImgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117604f;

    private xo(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f117599a = relativeLayout;
        this.f117600b = imageView;
        this.f117601c = imageView2;
        this.f117602d = textView;
        this.f117603e = view;
        this.f117604f = view2;
    }

    @androidx.annotation.n0
    public static xo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18928, new Class[]{View.class}, xo.class);
        if (patchProxyResultProxy.isSupported) {
            return (xo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_authentication;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_authentication);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_factory;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_factory);
                if (textView != null) {
                    i10 = R.id.v_gradient_1;
                    View viewA = l3.d.a(view, R.id.v_gradient_1);
                    if (viewA != null) {
                        i10 = R.id.v_gradient_2;
                        View viewA2 = l3.d.a(view, R.id.v_gradient_2);
                        if (viewA2 != null) {
                            return new xo((RelativeLayout) view, imageView, imageView2, textView, viewA, viewA2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18926, new Class[]{LayoutInflater.class}, xo.class);
        return patchProxyResultProxy.isSupported ? (xo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18927, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xo.class);
        if (patchProxyResultProxy.isSupported) {
            return (xo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_img, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117599a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18929, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
