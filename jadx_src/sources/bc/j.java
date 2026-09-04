package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFloatingViewBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35217b;

    private j(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView) {
        this.f35216a = relativeLayout;
        this.f35217b = imageView;
    }

    @n0
    public static j a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.f32315hj, new Class[]{View.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        int i10 = R.id.icon;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            return new j((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static j c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.f.f32269fj, new Class[]{LayoutInflater.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static j d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.f32292gj, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_floating_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35216a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32337ij, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
