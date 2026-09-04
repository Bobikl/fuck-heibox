package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameLibraryBaseBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f110495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f110496d;

    private f9(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f110493a = linearLayout;
        this.f110494b = linearLayout2;
        this.f110495c = slidingTabLayout;
        this.f110496d = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static f9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17300, new Class[]{View.class}, f9.class);
        if (patchProxyResultProxy.isSupported) {
            return (f9) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_divider;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_divider);
        if (linearLayout != null) {
            i10 = R.id.tl;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, R.id.tl);
            if (slidingTabLayout != null) {
                i10 = R.id.vp;
                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
                if (viewPagerFixed != null) {
                    return new f9((LinearLayout) view, linearLayout, slidingTabLayout, viewPagerFixed);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17298, new Class[]{LayoutInflater.class}, f9.class);
        return patchProxyResultProxy.isSupported ? (f9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17299, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f9.class);
        if (patchProxyResultProxy.isSupported) {
            return (f9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_library_base, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110493a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17301, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
