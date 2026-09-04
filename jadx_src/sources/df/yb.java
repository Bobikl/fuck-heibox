package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentWaterfallLinksBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f117886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f117887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117889d;

    private yb(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f117886a = coordinatorLayout;
        this.f117887b = appBarLayout;
        this.f117888c = frameLayout;
        this.f117889d = recyclerView;
    }

    @androidx.annotation.n0
    public static yb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17584, new Class[]{View.class}, yb.class);
        if (patchProxyResultProxy.isSupported) {
            return (yb) patchProxyResultProxy.result;
        }
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.fragment_container;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
            if (frameLayout != null) {
                i10 = R.id.rv_topic;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_topic);
                if (recyclerView != null) {
                    return new yb((CoordinatorLayout) view, appBarLayout, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17582, new Class[]{LayoutInflater.class}, yb.class);
        return patchProxyResultProxy.isSupported ? (yb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17583, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yb.class);
        if (patchProxyResultProxy.isSupported) {
            return (yb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_waterfall_links, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f117886a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17585, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
