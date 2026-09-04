package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FloatingButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityActColumnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingButton f109073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f109075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f109079h;

    private c(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FloatingButton floatingButton, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewPager viewPager) {
        this.f109072a = relativeLayout;
        this.f109073b = floatingButton;
        this.f109074c = imageView;
        this.f109075d = tabLayout;
        this.f109076e = textView;
        this.f109077f = textView2;
        this.f109078g = frameLayout;
        this.f109079h = viewPager;
    }

    @androidx.annotation.n0
    public static c a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16248, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.fb_write_post;
        FloatingButton floatingButton = (FloatingButton) l3.d.a(view, R.id.fb_write_post);
        if (floatingButton != null) {
            i10 = R.id.iv_banner;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_banner);
            if (imageView != null) {
                i10 = R.id.tab;
                TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
                if (tabLayout != null) {
                    i10 = R.id.tv_act_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_act_desc);
                    if (textView != null) {
                        i10 = R.id.tv_act_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_act_name);
                        if (textView2 != null) {
                            i10 = R.id.vg_fullscreen_video_container;
                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_video_container);
                            if (frameLayout != null) {
                                i10 = R.id.vp;
                                ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                if (viewPager != null) {
                                    return new c((RelativeLayout) view, floatingButton, imageView, tabLayout, textView, textView2, frameLayout, viewPager);
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
    public static c c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16246, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16247, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_act_column, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109072a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16249, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
