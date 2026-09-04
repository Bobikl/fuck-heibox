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

/* JADX INFO: compiled from: FragmentGameStoreBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f113341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f113342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f113344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f113345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final yk f113346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final jn f113347g;

    private m9(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 yk ykVar, @androidx.annotation.n0 jn jnVar) {
        this.f113341a = smartRefreshLayout;
        this.f113342b = consecutiveScrollerLayout;
        this.f113343c = recyclerView;
        this.f113344d = qVar;
        this.f113345e = smartRefreshLayout2;
        this.f113346f = ykVar;
        this.f113347g = jnVar;
    }

    @androidx.annotation.n0
    public static m9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17328, new Class[]{View.class}, m9.class);
        if (patchProxyResultProxy.isSupported) {
            return (m9) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.rv_empty_view;
                View viewA = l3.d.a(view, R.id.rv_empty_view);
                if (viewA != null) {
                    mb.q qVarA = mb.q.a(viewA);
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                    i10 = R.id.vg_filter;
                    View viewA2 = l3.d.a(view, R.id.vg_filter);
                    if (viewA2 != null) {
                        yk ykVarA = yk.a(viewA2);
                        i10 = R.id.vg_header;
                        View viewA3 = l3.d.a(view, R.id.vg_header);
                        if (viewA3 != null) {
                            return new m9(smartRefreshLayout, consecutiveScrollerLayout, recyclerView, qVarA, smartRefreshLayout, ykVarA, jn.a(viewA3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17326, new Class[]{LayoutInflater.class}, m9.class);
        return patchProxyResultProxy.isSupported ? (m9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17327, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m9.class);
        if (patchProxyResultProxy.isSupported) {
            return (m9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_store, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f113341a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17329, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
