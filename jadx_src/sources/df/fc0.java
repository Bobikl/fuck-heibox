package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutVideoThumbBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110522d;

    private fc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ImageView imageView2) {
        this.f110519a = relativeLayout;
        this.f110520b = imageView;
        this.f110521c = relativeLayout2;
        this.f110522d = imageView2;
    }

    @androidx.annotation.n0
    public static fc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21333, new Class[]{View.class}, fc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_video_thumb;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_video_thumb);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.shadow);
            if (imageView2 != null) {
                return new fc0(relativeLayout, imageView, relativeLayout, imageView2);
            }
            i10 = R.id.shadow;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21331, new Class[]{LayoutInflater.class}, fc0.class);
        return patchProxyResultProxy.isSupported ? (fc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21332, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_video_thumb, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110519a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21334, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
