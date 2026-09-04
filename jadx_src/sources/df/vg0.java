package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ViewPostToolsV2GameShotBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f116849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final UniversalRecyclerView f116850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final p80 f116853e;

    private vg0(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 UniversalRecyclerView universalRecyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 p80 p80Var) {
        this.f116849a = frameLayout;
        this.f116850b = universalRecyclerView;
        this.f116851c = smartRefreshLayout;
        this.f116852d = view;
        this.f116853e = p80Var;
    }

    @androidx.annotation.n0
    public static vg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21806, new Class[]{View.class}, vg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) l3.d.a(view, R.id.rv);
        if (universalRecyclerView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    i10 = R.id.vg_help;
                    View viewA2 = l3.d.a(view, R.id.vg_help);
                    if (viewA2 != null) {
                        return new vg0((FrameLayout) view, universalRecyclerView, smartRefreshLayout, viewA, p80.a(viewA2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21804, new Class[]{LayoutInflater.class}, vg0.class);
        return patchProxyResultProxy.isSupported ? (vg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21805, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_post_tools_v2_game_shot, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f116849a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21807, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
