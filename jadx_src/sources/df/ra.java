package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentPubgDetailContainerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ra implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f115154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f115155c;

    private ra(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 ViewPager viewPager) {
        this.f115153a = linearLayout;
        this.f115154b = segmentFilterView;
        this.f115155c = viewPager;
    }

    @androidx.annotation.n0
    public static ra a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17452, new Class[]{View.class}, ra.class);
        if (patchProxyResultProxy.isSupported) {
            return (ra) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_tab;
        SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
        if (segmentFilterView != null) {
            i10 = R.id.vp_region;
            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp_region);
            if (viewPager != null) {
                return new ra((LinearLayout) view, segmentFilterView, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ra c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17450, new Class[]{LayoutInflater.class}, ra.class);
        return patchProxyResultProxy.isSupported ? (ra) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ra d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17451, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ra.class);
        if (patchProxyResultProxy.isSupported) {
            return (ra) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pubg_detail_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115153a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17453, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
