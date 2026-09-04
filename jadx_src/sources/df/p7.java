package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.component.FloatingButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentCommunityRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f114456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingButton f114457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f114459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f114462h;

    private p7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 FloatingButton floatingButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewPager viewPager) {
        this.f114455a = relativeLayout;
        this.f114456b = appBarLayout;
        this.f114457c = floatingButton;
        this.f114458d = textView;
        this.f114459e = oVar;
        this.f114460f = linearLayout;
        this.f114461g = frameLayout;
        this.f114462h = viewPager;
    }

    @androidx.annotation.n0
    public static p7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17132, new Class[]{View.class}, p7.class);
        if (patchProxyResultProxy.isSupported) {
            return (p7) patchProxyResultProxy.result;
        }
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.fb_write_post;
            FloatingButton floatingButton = (FloatingButton) l3.d.a(view, R.id.fb_write_post);
            if (floatingButton != null) {
                i10 = R.id.tv_update_tips;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_update_tips);
                if (textView != null) {
                    i10 = R.id.v_scroll_container_divier;
                    View viewA = l3.d.a(view, R.id.v_scroll_container_divier);
                    if (viewA != null) {
                        mb.o oVarA = mb.o.a(viewA);
                        i10 = R.id.vg_recommend_header;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_recommend_header);
                        if (linearLayout != null) {
                            i10 = R.id.vg_update_tips;
                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_update_tips);
                            if (frameLayout != null) {
                                i10 = R.id.vp;
                                ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                if (viewPager != null) {
                                    return new p7((RelativeLayout) view, appBarLayout, floatingButton, textView, oVarA, linearLayout, frameLayout, viewPager);
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
    public static p7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17130, new Class[]{LayoutInflater.class}, p7.class);
        return patchProxyResultProxy.isSupported ? (p7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17131, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p7.class);
        if (patchProxyResultProxy.isSupported) {
            return (p7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_community_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114455a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17133, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
