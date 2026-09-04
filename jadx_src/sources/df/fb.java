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

/* JADX INFO: compiled from: FragmentRollMyRoomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f110509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f110510c;

    private fb(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f110508a = linearLayout;
        this.f110509b = slidingTabLayout;
        this.f110510c = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static fb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17508, new Class[]{View.class}, fb.class);
        if (patchProxyResultProxy.isSupported) {
            return (fb) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab_title;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, R.id.tab_title);
        if (slidingTabLayout != null) {
            i10 = R.id.vp;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
            if (viewPagerFixed != null) {
                return new fb((LinearLayout) view, slidingTabLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17506, new Class[]{LayoutInflater.class}, fb.class);
        return patchProxyResultProxy.isSupported ? (fb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17507, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fb.class);
        if (patchProxyResultProxy.isSupported) {
            return (fb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_roll_my_room, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110508a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17509, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
