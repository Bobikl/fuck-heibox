package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.R;
import com.max.hbcommon.component.triplebanner.TripleBannerDecorationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CommonViewTripleBannerBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f131525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TripleBannerDecorationView f131527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TripleBannerDecorationView f131528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f131529e;

    private e(@androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TripleBannerDecorationView tripleBannerDecorationView, @androidx.annotation.n0 TripleBannerDecorationView tripleBannerDecorationView2, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f131525a = view;
        this.f131526b = relativeLayout;
        this.f131527c = tripleBannerDecorationView;
        this.f131528d = tripleBannerDecorationView2;
        this.f131529e = viewPager2;
    }

    @androidx.annotation.n0
    public static e a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.O5, new Class[]{View.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        int i10 = R.id.bvp_layout_indicator;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
        if (relativeLayout != null) {
            i10 = R.id.tbd_down;
            TripleBannerDecorationView tripleBannerDecorationView = (TripleBannerDecorationView) l3.d.a(view, i10);
            if (tripleBannerDecorationView != null) {
                i10 = R.id.tbd_up;
                TripleBannerDecorationView tripleBannerDecorationView2 = (TripleBannerDecorationView) l3.d.a(view, i10);
                if (tripleBannerDecorationView2 != null) {
                    i10 = R.id.vp_main;
                    ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, i10);
                    if (viewPager2 != null) {
                        return new e(view, relativeLayout, tripleBannerDecorationView, tripleBannerDecorationView2, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, bb.c.e.N5, new Class[]{LayoutInflater.class, ViewGroup.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.common_view_triple_banner, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f131525a;
    }
}
