package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentConceptTopicsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f114757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f114758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CoordinatorLayout f114759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f114762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f114766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f114768l;

    private q7(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CoordinatorLayout coordinatorLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ViewPager viewPager) {
        this.f114757a = coordinatorLayout;
        this.f114758b = appBarLayout;
        this.f114759c = coordinatorLayout2;
        this.f114760d = recyclerView;
        this.f114761e = smartRefreshLayout;
        this.f114762f = slidingTabLayout;
        this.f114763g = textView;
        this.f114764h = textView2;
        this.f114765i = textView3;
        this.f114766j = oVar;
        this.f114767k = linearLayout;
        this.f114768l = viewPager;
    }

    @androidx.annotation.n0
    public static q7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17136, new Class[]{View.class}, q7.class);
        if (patchProxyResultProxy.isSupported) {
            return (q7) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i10 = R.id.rv_subscribed;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_subscribed);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                if (smartRefreshLayout != null) {
                    i10 = R.id.tab;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, R.id.tab);
                    if (slidingTabLayout != null) {
                        i10 = R.id.tv_channel_title;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_channel_title);
                        if (textView != null) {
                            i10 = R.id.tv_edit;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_edit);
                            if (textView2 != null) {
                                i10 = R.id.tv_subscribed_empty_tips;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_subscribed_empty_tips);
                                if (textView3 != null) {
                                    i10 = R.id.v_scroll_container_divier;
                                    View viewA = l3.d.a(view, R.id.v_scroll_container_divier);
                                    if (viewA != null) {
                                        mb.o oVarA = mb.o.a(viewA);
                                        i10 = R.id.vg_header;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_header);
                                        if (linearLayout != null) {
                                            i10 = R.id.vp;
                                            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                            if (viewPager != null) {
                                                return new q7(coordinatorLayout, appBarLayout, coordinatorLayout, recyclerView, smartRefreshLayout, slidingTabLayout, textView, textView2, textView3, oVarA, linearLayout, viewPager);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17134, new Class[]{LayoutInflater.class}, q7.class);
        return patchProxyResultProxy.isSupported ? (q7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17135, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q7.class);
        if (patchProxyResultProxy.isSupported) {
            return (q7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_concept_topics, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f114757a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17137, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
