package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentFriendsAndFollowsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f117079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f117080c;

    private w8(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f117078a = linearLayout;
        this.f117079b = segmentFilterView;
        this.f117080c = viewPager2;
    }

    @androidx.annotation.n0
    public static w8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17264, new Class[]{View.class}, w8.class);
        if (patchProxyResultProxy.isSupported) {
            return (w8) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.tab);
        if (segmentFilterView != null) {
            i10 = R.id.vp;
            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
            if (viewPager2 != null) {
                return new w8((LinearLayout) view, segmentFilterView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17262, new Class[]{LayoutInflater.class}, w8.class);
        return patchProxyResultProxy.isSupported ? (w8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17263, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w8.class);
        if (patchProxyResultProxy.isSupported) {
            return (w8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_friends_and_follows, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117078a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17265, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
