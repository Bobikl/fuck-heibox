package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBottomEditorLottieButtonBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class he implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LottieAnimationView f111411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f111412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111414g;

    private he(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LottieAnimationView lottieAnimationView, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f111408a = relativeLayout;
        this.f111409b = imageView;
        this.f111410c = imageView2;
        this.f111411d = lottieAnimationView;
        this.f111412e = shineButton;
        this.f111413f = textView;
        this.f111414g = linearLayout;
    }

    @androidx.annotation.n0
    public static he a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17828, new Class[]{View.class}, he.class);
        if (patchProxyResultProxy.isSupported) {
            return (he) patchProxyResultProxy.result;
        }
        int i10 = R.id.img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.img);
        if (imageView != null) {
            i10 = R.id.iv_sp_after_like;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_sp_after_like);
            if (imageView2 != null) {
                i10 = R.id.lottie_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) l3.d.a(view, R.id.lottie_view);
                if (lottieAnimationView != null) {
                    i10 = R.id.shine_button;
                    ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.shine_button);
                    if (shineButton != null) {
                        i10 = R.id.text;
                        TextView textView = (TextView) l3.d.a(view, R.id.text);
                        if (textView != null) {
                            i10 = R.id.vg_content;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                            if (linearLayout != null) {
                                return new he((RelativeLayout) view, imageView, imageView2, lottieAnimationView, shineButton, textView, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static he c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17826, new Class[]{LayoutInflater.class}, he.class);
        return patchProxyResultProxy.isSupported ? (he) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static he d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17827, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, he.class);
        if (patchProxyResultProxy.isSupported) {
            return (he) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_editor_lottie_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111408a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17829, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
