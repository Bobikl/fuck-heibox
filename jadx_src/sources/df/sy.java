package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSingleBottomBtnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f115727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f115728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115729e;

    private sy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115725a = relativeLayout;
        this.f115726b = imageView;
        this.f115727c = shineButton;
        this.f115728d = gradientTextView;
        this.f115729e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static sy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19940, new Class[]{View.class}, sy.class);
        if (patchProxyResultProxy.isSupported) {
            return (sy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.shine_button;
            ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.shine_button);
            if (shineButton != null) {
                i10 = R.id.tv_desc;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_desc);
                if (gradientTextView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new sy(relativeLayout, imageView, shineButton, gradientTextView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19938, new Class[]{LayoutInflater.class}, sy.class);
        return patchProxyResultProxy.isSupported ? (sy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19939, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sy.class);
        if (patchProxyResultProxy.isSupported) {
            return (sy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_single_bottom_btn, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115725a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19941, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
