package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentBbsRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f111659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f111660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f111663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111664f;

    private i7(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView) {
        this.f111659a = smartRefreshLayout;
        this.f111660b = appBarLayout;
        this.f111661c = recyclerView;
        this.f111662d = recyclerView2;
        this.f111663e = smartRefreshLayout2;
        this.f111664f = textView;
    }

    @androidx.annotation.n0
    public static i7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17104, new Class[]{View.class}, i7.class);
        if (patchProxyResultProxy.isSupported) {
            return (i7) patchProxyResultProxy.result;
        }
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.rv_links;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_links);
            if (recyclerView != null) {
                i10 = R.id.rv_topic;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_topic);
                if (recyclerView2 != null) {
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                    i10 = R.id.tv_update_tips;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_update_tips);
                    if (textView != null) {
                        return new i7(smartRefreshLayout, appBarLayout, recyclerView, recyclerView2, smartRefreshLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17102, new Class[]{LayoutInflater.class}, i7.class);
        return patchProxyResultProxy.isSupported ? (i7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17103, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i7.class);
        if (patchProxyResultProxy.isSupported) {
            return (i7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bbs_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f111659a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17105, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
