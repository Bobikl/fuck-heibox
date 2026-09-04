package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityGameBundlesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f108260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SecondaryWindowSegmentFilterView f108262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108264f;

    private a0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f108259a = linearLayout;
        this.f108260b = filterButtonView;
        this.f108261c = recyclerView;
        this.f108262d = secondaryWindowSegmentFilterView;
        this.f108263e = smartRefreshLayout;
        this.f108264f = relativeLayout;
    }

    @androidx.annotation.n0
    public static a0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16344, new Class[]{View.class}, a0.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0) patchProxyResultProxy.result;
        }
        int i10 = R.id.fbv_filter;
        FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_filter);
        if (filterButtonView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.secondary_filter;
                SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = (SecondaryWindowSegmentFilterView) l3.d.a(view, R.id.secondary_filter);
                if (secondaryWindowSegmentFilterView != null) {
                    i10 = R.id.srl;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                    if (smartRefreshLayout != null) {
                        i10 = R.id.vg_header;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header);
                        if (relativeLayout != null) {
                            return new a0((LinearLayout) view, filterButtonView, recyclerView, secondaryWindowSegmentFilterView, smartRefreshLayout, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16342, new Class[]{LayoutInflater.class}, a0.class);
        return patchProxyResultProxy.isSupported ? (a0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16343, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a0.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_bundles, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108259a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16345, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
