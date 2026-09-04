package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentMeHomeXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class da implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f109702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f109703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final s00 f109704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109706e;

    private da(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 s00 s00Var, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2) {
        this.f109702a = smartRefreshLayout;
        this.f109703b = consecutiveScrollerLayout;
        this.f109704c = s00Var;
        this.f109705d = recyclerView;
        this.f109706e = smartRefreshLayout2;
    }

    @androidx.annotation.n0
    public static da a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17396, new Class[]{View.class}, da.class);
        if (patchProxyResultProxy.isSupported) {
            return (da) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl_container;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl_container);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.header;
            View viewA = l3.d.a(view, R.id.header);
            if (viewA != null) {
                s00 s00VarA = s00.a(viewA);
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                if (recyclerView != null) {
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                    return new da(smartRefreshLayout, consecutiveScrollerLayout, s00VarA, recyclerView, smartRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static da c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17394, new Class[]{LayoutInflater.class}, da.class);
        return patchProxyResultProxy.isSupported ? (da) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static da d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17395, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, da.class);
        if (patchProxyResultProxy.isSupported) {
            return (da) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_me_home_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f109702a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17397, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
