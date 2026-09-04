package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.RippleView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHomeMenuBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RippleView f114292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114294h;

    private oo(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 RippleView rippleView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f114287a = relativeLayout;
        this.f114288b = imageView;
        this.f114289c = imageView2;
        this.f114290d = qMUIRadiusImageView;
        this.f114291e = qMUIRadiusImageView2;
        this.f114292f = rippleView;
        this.f114293g = textView;
        this.f114294h = textView2;
    }

    @androidx.annotation.n0
    public static oo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18892, new Class[]{View.class}, oo.class);
        if (patchProxyResultProxy.isSupported) {
            return (oo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.iv_menu_red_point;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_menu_red_point);
            if (imageView2 != null) {
                i10 = R.id.iv_red_dot;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_red_dot);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.radius_iv_img;
                    QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.radius_iv_img);
                    if (qMUIRadiusImageView2 != null) {
                        i10 = R.id.rip_circle;
                        RippleView rippleView = (RippleView) l3.d.a(view, R.id.rip_circle);
                        if (rippleView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView != null) {
                                i10 = R.id.tv_name;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView2 != null) {
                                    return new oo((RelativeLayout) view, imageView, imageView2, qMUIRadiusImageView, qMUIRadiusImageView2, rippleView, textView, textView2);
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
    public static oo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18890, new Class[]{LayoutInflater.class}, oo.class);
        return patchProxyResultProxy.isSupported ? (oo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18891, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oo.class);
        if (patchProxyResultProxy.isSupported) {
            return (oo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_home_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114287a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18893, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
