package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityMessageAndFriendsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f113588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f113589f;

    private n1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f113584a = linearLayout;
        this.f113585b = imageView;
        this.f113586c = imageView2;
        this.f113587d = imageView3;
        this.f113588e = tabLayout;
        this.f113589f = viewPager2;
    }

    @androidx.annotation.n0
    public static n1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16500, new Class[]{View.class}, n1.class);
        if (patchProxyResultProxy.isSupported) {
            return (n1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_title_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_title_action);
        if (imageView != null) {
            i10 = R.id.iv_title_action_service;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_title_action_service);
            if (imageView2 != null) {
                i10 = R.id.iv_title_back;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_title_back);
                if (imageView3 != null) {
                    i10 = R.id.tab;
                    TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
                    if (tabLayout != null) {
                        i10 = R.id.vp;
                        ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
                        if (viewPager2 != null) {
                            return new n1((LinearLayout) view, imageView, imageView2, imageView3, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16498, new Class[]{LayoutInflater.class}, n1.class);
        return patchProxyResultProxy.isSupported ? (n1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16499, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n1.class);
        if (patchProxyResultProxy.isSupported) {
            return (n1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_message_and_friends, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113584a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16501, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
