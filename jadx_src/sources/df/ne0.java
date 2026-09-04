package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.shadowlayput.ShadowLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.widget.BottomAdsBarConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewBottomAbsShadowLayoutBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ne0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ShadowLayout f113814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomAdsBarConstraintLayout f113815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShadowLayout f113816c;

    private ne0(@androidx.annotation.n0 ShadowLayout shadowLayout, @androidx.annotation.n0 BottomAdsBarConstraintLayout bottomAdsBarConstraintLayout, @androidx.annotation.n0 ShadowLayout shadowLayout2) {
        this.f113814a = shadowLayout;
        this.f113815b = bottomAdsBarConstraintLayout;
        this.f113816c = shadowLayout2;
    }

    @androidx.annotation.n0
    public static ne0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21570, new Class[]{View.class}, ne0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ne0) patchProxyResultProxy.result;
        }
        BottomAdsBarConstraintLayout bottomAdsBarConstraintLayout = (BottomAdsBarConstraintLayout) l3.d.a(view, R.id.cl_top_layer);
        if (bottomAdsBarConstraintLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.cl_top_layer)));
        }
        ShadowLayout shadowLayout = (ShadowLayout) view;
        return new ne0(shadowLayout, bottomAdsBarConstraintLayout, shadowLayout);
    }

    @androidx.annotation.n0
    public static ne0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21568, new Class[]{LayoutInflater.class}, ne0.class);
        return patchProxyResultProxy.isSupported ? (ne0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ne0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21569, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ne0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ne0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_bottom_abs_shadow_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ShadowLayout b() {
        return this.f113814a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21571, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
