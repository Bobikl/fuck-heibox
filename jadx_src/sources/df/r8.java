package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.FloatingButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentFollowedMomentsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f115126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingButton f115128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f115129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f115131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final qf f115135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final f50 f115136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final jb0 f115137m;

    private r8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 FloatingButton floatingButton, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 qf qfVar, @androidx.annotation.n0 f50 f50Var, @androidx.annotation.n0 jb0 jb0Var) {
        this.f115125a = relativeLayout;
        this.f115126b = consecutiveScrollerLayout;
        this.f115127c = view;
        this.f115128d = floatingButton;
        this.f115129e = circularProgressIndicator;
        this.f115130f = recyclerView;
        this.f115131g = smartRefreshLayout;
        this.f115132h = oVar;
        this.f115133i = recyclerView2;
        this.f115134j = frameLayout;
        this.f115135k = qfVar;
        this.f115136l = f50Var;
        this.f115137m = jb0Var;
    }

    @androidx.annotation.n0
    public static r8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17244, new Class[]{View.class}, r8.class);
        if (patchProxyResultProxy.isSupported) {
            return (r8) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.divider_friend;
            View viewA = l3.d.a(view, R.id.divider_friend);
            if (viewA != null) {
                i10 = R.id.fb_write_timeline;
                FloatingButton floatingButton = (FloatingButton) l3.d.a(view, R.id.fb_write_timeline);
                if (floatingButton != null) {
                    i10 = R.id.img_progress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.img_progress);
                    if (circularProgressIndicator != null) {
                        i10 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                        if (recyclerView != null) {
                            i10 = R.id.srl;
                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                            if (smartRefreshLayout != null) {
                                i10 = R.id.v_scroll_container_divier;
                                View viewA2 = l3.d.a(view, R.id.v_scroll_container_divier);
                                if (viewA2 != null) {
                                    mb.o oVarA = mb.o.a(viewA2);
                                    i10 = R.id.vg_friend_header;
                                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.vg_friend_header);
                                    if (recyclerView2 != null) {
                                        i10 = R.id.vg_loading;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_loading);
                                        if (frameLayout != null) {
                                            i10 = R.id.vg_login_header;
                                            View viewA3 = l3.d.a(view, R.id.vg_login_header);
                                            if (viewA3 != null) {
                                                qf qfVarA = qf.a(viewA3);
                                                i10 = R.id.vg_moments_header;
                                                View viewA4 = l3.d.a(view, R.id.vg_moments_header);
                                                if (viewA4 != null) {
                                                    f50 f50VarA = f50.a(viewA4);
                                                    i10 = R.id.vg_subtitle;
                                                    View viewA5 = l3.d.a(view, R.id.vg_subtitle);
                                                    if (viewA5 != null) {
                                                        return new r8((RelativeLayout) view, consecutiveScrollerLayout, viewA, floatingButton, circularProgressIndicator, recyclerView, smartRefreshLayout, oVarA, recyclerView2, frameLayout, qfVarA, f50VarA, jb0.a(viewA5));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17242, new Class[]{LayoutInflater.class}, r8.class);
        return patchProxyResultProxy.isSupported ? (r8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17243, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r8.class);
        if (patchProxyResultProxy.isSupported) {
            return (r8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_followed_moments, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115125a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17245, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
