package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbcustomview.RippleView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMenuStoreV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LottieAnimationView f115291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RippleView f115292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f115296i;

    private rq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LottieAnimationView lottieAnimationView, @androidx.annotation.n0 RippleView rippleView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f115288a = relativeLayout;
        this.f115289b = imageView;
        this.f115290c = imageView2;
        this.f115291d = lottieAnimationView;
        this.f115292e = rippleView;
        this.f115293f = textView;
        this.f115294g = textView2;
        this.f115295h = linearLayout;
        this.f115296i = constraintLayout;
    }

    @androidx.annotation.n0
    public static rq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19112, new Class[]{View.class}, rq.class);
        if (patchProxyResultProxy.isSupported) {
            return (rq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_animator;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_animator);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView2 != null) {
                i10 = R.id.lottie_animation_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) l3.d.a(view, R.id.lottie_animation_view);
                if (lottieAnimationView != null) {
                    i10 = R.id.rip_circle;
                    RippleView rippleView = (RippleView) l3.d.a(view, R.id.rip_circle);
                    if (rippleView != null) {
                        i10 = R.id.tv_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView != null) {
                            i10 = R.id.tv_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView2 != null) {
                                i10 = R.id.vg_animator;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_animator);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_item;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_item);
                                    if (constraintLayout != null) {
                                        return new rq((RelativeLayout) view, imageView, imageView2, lottieAnimationView, rippleView, textView, textView2, linearLayout, constraintLayout);
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
    public static rq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19110, new Class[]{LayoutInflater.class}, rq.class);
        return patchProxyResultProxy.isSupported ? (rq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19111, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rq.class);
        if (patchProxyResultProxy.isSupported) {
            return (rq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_menu_store_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115288a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19113, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
