package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutImageviewerCustomPageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f111317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f111318b;

    private h70(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator) {
        this.f111317a = frameLayout;
        this.f111318b = circularProgressIndicator;
    }

    @androidx.annotation.n0
    public static h70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20828, new Class[]{View.class}, h70.class);
        if (patchProxyResultProxy.isSupported) {
            return (h70) patchProxyResultProxy.result;
        }
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.progress_indicator);
        if (circularProgressIndicator != null) {
            return new h70((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.progress_indicator)));
    }

    @androidx.annotation.n0
    public static h70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20826, new Class[]{LayoutInflater.class}, h70.class);
        return patchProxyResultProxy.isSupported ? (h70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20827, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h70.class);
        if (patchProxyResultProxy.isSupported) {
            return (h70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_imageviewer_custom_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f111317a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20829, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
