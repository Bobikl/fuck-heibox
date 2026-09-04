package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentPostMaterialContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ma implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f113358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final z70 f113361e;

    private ma(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 z70 z70Var) {
        this.f113357a = relativeLayout;
        this.f113358b = consecutiveScrollerLayout;
        this.f113359c = recyclerView;
        this.f113360d = smartRefreshLayout;
        this.f113361e = z70Var;
    }

    @androidx.annotation.n0
    public static ma a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17432, new Class[]{View.class}, ma.class);
        if (patchProxyResultProxy.isSupported) {
            return (ma) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                if (smartRefreshLayout != null) {
                    i10 = R.id.vg_material_header;
                    View viewA = l3.d.a(view, R.id.vg_material_header);
                    if (viewA != null) {
                        return new ma((RelativeLayout) view, consecutiveScrollerLayout, recyclerView, smartRefreshLayout, z70.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ma c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17430, new Class[]{LayoutInflater.class}, ma.class);
        return patchProxyResultProxy.isSupported ? (ma) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ma d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17431, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ma.class);
        if (patchProxyResultProxy.isSupported) {
            return (ma) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_post_material_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113357a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17433, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
