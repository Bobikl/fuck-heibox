package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.piasy.biv.view.BigImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutImageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BigImageView f110857b;

    private g70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BigImageView bigImageView) {
        this.f110856a = linearLayout;
        this.f110857b = bigImageView;
    }

    @androidx.annotation.n0
    public static g70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20824, new Class[]{View.class}, g70.class);
        if (patchProxyResultProxy.isSupported) {
            return (g70) patchProxyResultProxy.result;
        }
        BigImageView bigImageView = (BigImageView) l3.d.a(view, R.id.biv_image);
        if (bigImageView != null) {
            return new g70((LinearLayout) view, bigImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.biv_image)));
    }

    @androidx.annotation.n0
    public static g70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20822, new Class[]{LayoutInflater.class}, g70.class);
        return patchProxyResultProxy.isSupported ? (g70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20823, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g70.class);
        if (patchProxyResultProxy.isSupported) {
            return (g70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_image, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110856a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20825, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
