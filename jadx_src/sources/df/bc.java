package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentWebWithNativeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f108897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f108899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f108901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108903g;

    private bc(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108897a = frameLayout;
        this.f108898b = frameLayout2;
        this.f108899c = circularProgressIndicator;
        this.f108900d = imageView;
        this.f108901e = titleBar;
        this.f108902f = relativeLayout;
        this.f108903g = linearLayout;
    }

    @androidx.annotation.n0
    public static bc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17596, new Class[]{View.class}, bc.class);
        if (patchProxyResultProxy.isSupported) {
            return (bc) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.img_progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.img_progress);
            if (circularProgressIndicator != null) {
                i10 = R.id.v_bg;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.v_bg);
                if (imageView != null) {
                    i10 = R.id.v_native_title_bar;
                    TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.v_native_title_bar);
                    if (titleBar != null) {
                        i10 = R.id.vg_bg;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bg);
                        if (relativeLayout != null) {
                            i10 = R.id.vg_container;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                            if (linearLayout != null) {
                                return new bc((FrameLayout) view, frameLayout, circularProgressIndicator, imageView, titleBar, relativeLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17594, new Class[]{LayoutInflater.class}, bc.class);
        return patchProxyResultProxy.isSupported ? (bc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17595, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bc.class);
        if (patchProxyResultProxy.isSupported) {
            return (bc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_web_with_native, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f108897a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17597, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
