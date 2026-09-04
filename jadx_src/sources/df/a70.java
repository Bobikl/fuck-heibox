package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: LayoutHashtagContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108411g;

    private a70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108405a = relativeLayout;
        this.f108406b = recyclerView;
        this.f108407c = smartRefreshLayout;
        this.f108408d = view;
        this.f108409e = view2;
        this.f108410f = view3;
        this.f108411g = linearLayout;
    }

    @androidx.annotation.n0
    public static a70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20800, new Class[]{View.class}, a70.class);
        if (patchProxyResultProxy.isSupported) {
            return (a70) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.v_space_waterfall;
                View viewA = l3.d.a(view, R.id.v_space_waterfall);
                if (viewA != null) {
                    i10 = R.id.v_waterfall_bg;
                    View viewA2 = l3.d.a(view, R.id.v_waterfall_bg);
                    if (viewA2 != null) {
                        i10 = R.id.v_waterfall_bg_top;
                        View viewA3 = l3.d.a(view, R.id.v_waterfall_bg_top);
                        if (viewA3 != null) {
                            i10 = R.id.vg_banner;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_banner);
                            if (linearLayout != null) {
                                return new a70((RelativeLayout) view, recyclerView, smartRefreshLayout, viewA, viewA2, viewA3, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20798, new Class[]{LayoutInflater.class}, a70.class);
        return patchProxyResultProxy.isSupported ? (a70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20799, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a70.class);
        if (patchProxyResultProxy.isSupported) {
            return (a70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_hashtag_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108405a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20801, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
