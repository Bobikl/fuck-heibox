package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutScreenshotViewpagerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ka0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f112533e;

    private ka0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f112529a = relativeLayout;
        this.f112530b = recyclerView;
        this.f112531c = relativeLayout2;
        this.f112532d = linearLayout;
        this.f112533e = viewPager2;
    }

    @androidx.annotation.n0
    public static ka0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21150, new Class[]{View.class}, ka0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ka0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_screenshots;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_screenshots);
        if (recyclerView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.vg_indicator;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_indicator);
            if (linearLayout != null) {
                i10 = R.id.vp2;
                ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp2);
                if (viewPager2 != null) {
                    return new ka0(relativeLayout, recyclerView, relativeLayout, linearLayout, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ka0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21148, new Class[]{LayoutInflater.class}, ka0.class);
        return patchProxyResultProxy.isSupported ? (ka0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ka0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21149, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ka0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ka0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_screenshot_viewpager, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112529a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21151, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
