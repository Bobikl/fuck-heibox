package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityGameDeveloperDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f110337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f110338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f110339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f110343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f110344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110348l;

    private f0(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110337a = coordinatorLayout;
        this.f110338b = appBarLayout;
        this.f110339c = collapsingToolbarLayout;
        this.f110340d = imageView;
        this.f110341e = imageView2;
        this.f110342f = recyclerView;
        this.f110343g = smartRefreshLayout;
        this.f110344h = titleBar;
        this.f110345i = textView;
        this.f110346j = textView2;
        this.f110347k = textView3;
        this.f110348l = relativeLayout;
    }

    @androidx.annotation.n0
    public static f0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16364, new Class[]{View.class}, f0.class);
        if (patchProxyResultProxy.isSupported) {
            return (f0) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.iv_bg_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_img);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                        if (recyclerView != null) {
                            i10 = R.id.srl;
                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                            if (smartRefreshLayout != null) {
                                i10 = R.id.toolbar;
                                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                if (titleBar != null) {
                                    i10 = R.id.tv_desc;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                                    if (textView != null) {
                                        i10 = R.id.tv_follow_state;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_follow_state);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView3 != null) {
                                                i10 = R.id.vg_header_container;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header_container);
                                                if (relativeLayout != null) {
                                                    return new f0((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, imageView, imageView2, recyclerView, smartRefreshLayout, titleBar, textView, textView2, textView3, relativeLayout);
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
    public static f0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16362, new Class[]{LayoutInflater.class}, f0.class);
        return patchProxyResultProxy.isSupported ? (f0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16363, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f0.class);
        if (patchProxyResultProxy.isSupported) {
            return (f0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_developer_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f110337a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16365, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
