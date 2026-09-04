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

/* JADX INFO: compiled from: FragmentPubgDetailContainerV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sa implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f115519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f115520c;

    private sa(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 ViewPager viewPager) {
        this.f115518a = linearLayout;
        this.f115519b = segmentFilterView;
        this.f115520c = viewPager;
    }

    @androidx.annotation.n0
    public static sa a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17456, new Class[]{View.class}, sa.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_tab;
        SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
        if (segmentFilterView != null) {
            i10 = R.id.vp_region;
            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp_region);
            if (viewPager != null) {
                return new sa((LinearLayout) view, segmentFilterView, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sa c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17454, new Class[]{LayoutInflater.class}, sa.class);
        return patchProxyResultProxy.isSupported ? (sa) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sa d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17455, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sa.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pubg_detail_container_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115518a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17457, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
