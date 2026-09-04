package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentFavourCollectionContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final nj f114468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final nj f114469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final UniversalRecyclerView f114470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114471e;

    private p8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 nj njVar, @androidx.annotation.n0 nj njVar2, @androidx.annotation.n0 UniversalRecyclerView universalRecyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout) {
        this.f114467a = relativeLayout;
        this.f114468b = njVar;
        this.f114469c = njVar2;
        this.f114470d = universalRecyclerView;
        this.f114471e = smartRefreshLayout;
    }

    @androidx.annotation.n0
    public static p8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17236, new Class[]{View.class}, p8.class);
        if (patchProxyResultProxy.isSupported) {
            return (p8) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_invalid_tip;
        View viewA = l3.d.a(view, R.id.bottom_invalid_tip);
        if (viewA != null) {
            nj njVarA = nj.a(viewA);
            i10 = R.id.front_bottom_invalid_tip;
            View viewA2 = l3.d.a(view, R.id.front_bottom_invalid_tip);
            if (viewA2 != null) {
                nj njVarA2 = nj.a(viewA2);
                i10 = R.id.rv;
                UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) l3.d.a(view, R.id.rv);
                if (universalRecyclerView != null) {
                    i10 = R.id.srl;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                    if (smartRefreshLayout != null) {
                        return new p8((RelativeLayout) view, njVarA, njVarA2, universalRecyclerView, smartRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17234, new Class[]{LayoutInflater.class}, p8.class);
        return patchProxyResultProxy.isSupported ? (p8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17235, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p8.class);
        if (patchProxyResultProxy.isSupported) {
            return (p8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_favour_collection_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114467a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17237, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
