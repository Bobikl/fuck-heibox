package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGameDetailsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f109946c;

    private e0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f109944a = relativeLayout;
        this.f109945b = frameLayout;
        this.f109946c = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static e0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16360, new Class[]{View.class}, e0.class);
        if (patchProxyResultProxy.isSupported) {
            return (e0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_fullscreen_video_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_video_container);
        if (frameLayout != null) {
            i10 = R.id.vp;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
            if (viewPagerFixed != null) {
                return new e0((RelativeLayout) view, frameLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16358, new Class[]{LayoutInflater.class}, e0.class);
        return patchProxyResultProxy.isSupported ? (e0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16359, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e0.class);
        if (patchProxyResultProxy.isSupported) {
            return (e0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109944a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16361, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
