package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.R;
import com.max.hbcommon.view.VerticalCenterTextView;
import com.max.hbcommon.view.VerticalCenterViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LoadingViewBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final VerticalCenterViewGroup f131580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f131581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f131582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final VerticalCenterTextView f131583e;

    private i1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 VerticalCenterViewGroup verticalCenterViewGroup, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 VerticalCenterTextView verticalCenterTextView) {
        this.f131579a = constraintLayout;
        this.f131580b = verticalCenterViewGroup;
        this.f131581c = circularProgressIndicator;
        this.f131582d = constraintLayout2;
        this.f131583e = verticalCenterTextView;
    }

    @androidx.annotation.n0
    public static i1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 4095, new Class[]{View.class}, i1.class);
        if (patchProxyResultProxy.isSupported) {
            return (i1) patchProxyResultProxy.result;
        }
        int i10 = R.id.center_anchor;
        VerticalCenterViewGroup verticalCenterViewGroup = (VerticalCenterViewGroup) l3.d.a(view, i10);
        if (verticalCenterViewGroup != null) {
            i10 = R.id.img_progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, i10);
            if (circularProgressIndicator != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.tv_loading_description;
                VerticalCenterTextView verticalCenterTextView = (VerticalCenterTextView) l3.d.a(view, i10);
                if (verticalCenterTextView != null) {
                    return new i1(constraintLayout, verticalCenterViewGroup, circularProgressIndicator, constraintLayout, verticalCenterTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Z9, new Class[]{LayoutInflater.class}, i1.class);
        return patchProxyResultProxy.isSupported ? (i1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31703aa, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i1.class);
        if (patchProxyResultProxy.isSupported) {
            return (i1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.loading_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131579a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4096, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
