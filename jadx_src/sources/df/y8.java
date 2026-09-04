package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentGameAchievementBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f117825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f117827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final xf0 f117828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final vc f117829e;

    private y8(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 xf0 xf0Var, @androidx.annotation.n0 vc vcVar) {
        this.f117825a = coordinatorLayout;
        this.f117826b = recyclerView;
        this.f117827c = smartRefreshLayout;
        this.f117828d = xf0Var;
        this.f117829e = vcVar;
    }

    @androidx.annotation.n0
    public static y8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17272, new Class[]{View.class}, y8.class);
        if (patchProxyResultProxy.isSupported) {
            return (y8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_fragment_game_achievement_list;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_fragment_game_achievement_list);
        if (recyclerView != null) {
            i10 = R.id.srl_fragment_game_achievement;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl_fragment_game_achievement);
            if (smartRefreshLayout != null) {
                i10 = R.id.vg_fragment_game_achievement_game_info;
                View viewA = l3.d.a(view, R.id.vg_fragment_game_achievement_game_info);
                if (viewA != null) {
                    xf0 xf0VarA = xf0.a(viewA);
                    i10 = R.id.vg_fragment_game_achievement_title;
                    View viewA2 = l3.d.a(view, R.id.vg_fragment_game_achievement_title);
                    if (viewA2 != null) {
                        return new y8((CoordinatorLayout) view, recyclerView, smartRefreshLayout, xf0VarA, vc.a(viewA2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17270, new Class[]{LayoutInflater.class}, y8.class);
        return patchProxyResultProxy.isSupported ? (y8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17271, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y8.class);
        if (patchProxyResultProxy.isSupported) {
            return (y8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_achievement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f117825a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17273, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
