package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentDota2TeammateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f113728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final wl f113730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f113731e;

    private n8(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 wl wlVar, @androidx.annotation.n0 ViewPager viewPager) {
        this.f113727a = linearLayout;
        this.f113728b = heyBoxTabLayout;
        this.f113729c = linearLayout2;
        this.f113730d = wlVar;
        this.f113731e = viewPager;
    }

    @androidx.annotation.n0
    public static n8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17228, new Class[]{View.class}, n8.class);
        if (patchProxyResultProxy.isSupported) {
            return (n8) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tab);
        if (heyBoxTabLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = R.id.vg_header;
            View viewA = l3.d.a(view, R.id.vg_header);
            if (viewA != null) {
                wl wlVarA = wl.a(viewA);
                i10 = R.id.vp;
                ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                if (viewPager != null) {
                    return new n8(linearLayout, heyBoxTabLayout, linearLayout, wlVarA, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17226, new Class[]{LayoutInflater.class}, n8.class);
        return patchProxyResultProxy.isSupported ? (n8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17227, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n8.class);
        if (patchProxyResultProxy.isSupported) {
            return (n8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_teammate, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113727a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17229, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
