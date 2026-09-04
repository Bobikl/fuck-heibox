package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcustomview.NoScrollViewPager;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletFragmentHistoryBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final SlidingTabLayout f35324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final NoScrollViewPager f35325c;

    private j(@n0 LinearLayout linearLayout, @n0 SlidingTabLayout slidingTabLayout, @n0 NoScrollViewPager noScrollViewPager) {
        this.f35323a = linearLayout;
        this.f35324b = slidingTabLayout;
        this.f35325c = noScrollViewPager;
    }

    @n0
    public static j a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.R4, new Class[]{View.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, i10);
        if (slidingTabLayout != null) {
            i10 = R.id.vp;
            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) l3.d.a(view, i10);
            if (noScrollViewPager != null) {
                return new j((LinearLayout) view, slidingTabLayout, noScrollViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static j c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 10201, new Class[]{LayoutInflater.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static j d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Q4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_fragment_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35323a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.S4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
