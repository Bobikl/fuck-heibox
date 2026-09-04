package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentNewsTagListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ja implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f112100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f112103f;

    private ja(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f112098a = linearLayout;
        this.f112099b = imageView;
        this.f112100c = heyBoxTabLayout;
        this.f112101d = view;
        this.f112102e = frameLayout;
        this.f112103f = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static ja a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17420, new Class[]{View.class}, ja.class);
        if (patchProxyResultProxy.isSupported) {
            return (ja) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_setting_point;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_setting_point);
        if (imageView != null) {
            i10 = R.id.tab_news_tag;
            HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tab_news_tag);
            if (heyBoxTabLayout != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    i10 = R.id.vg_setting;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_setting);
                    if (frameLayout != null) {
                        i10 = R.id.vp_news_tag;
                        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp_news_tag);
                        if (viewPagerFixed != null) {
                            return new ja((LinearLayout) view, imageView, heyBoxTabLayout, viewA, frameLayout, viewPagerFixed);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ja c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17418, new Class[]{LayoutInflater.class}, ja.class);
        return patchProxyResultProxy.isSupported ? (ja) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ja d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17419, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ja.class);
        if (patchProxyResultProxy.isSupported) {
            return (ja) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_news_tag_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112098a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17421, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
