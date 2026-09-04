package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPlatformsCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f116273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f116279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBViewPager2 f116286n;

    private u80(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 HBViewPager2 hBViewPager2) {
        this.f116273a = cardView;
        this.f116274b = imageView;
        this.f116275c = imageView2;
        this.f116276d = imageView3;
        this.f116277e = imageView4;
        this.f116278f = imageView5;
        this.f116279g = radioGroup;
        this.f116280h = relativeLayout;
        this.f116281i = frameLayout;
        this.f116282j = frameLayout2;
        this.f116283k = cardView2;
        this.f116284l = relativeLayout2;
        this.f116285m = frameLayout3;
        this.f116286n = hBViewPager2;
    }

    @androidx.annotation.n0
    public static u80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20982, new Class[]{View.class}, u80.class);
        if (patchProxyResultProxy.isSupported) {
            return (u80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bottom_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom_bg);
        if (imageView != null) {
            i10 = R.id.iv_bottom_mask;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bottom_mask);
            if (imageView2 != null) {
                i10 = R.id.iv_setting;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_setting);
                if (imageView3 != null) {
                    i10 = R.id.iv_top_bg;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_top_bg);
                    if (imageView4 != null) {
                        i10 = R.id.iv_top_mask;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_top_mask);
                        if (imageView5 != null) {
                            i10 = R.id.rg_platforms;
                            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_platforms);
                            if (radioGroup != null) {
                                i10 = R.id.rl_platforms_header;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_platforms_header);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_bg_container;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg_container);
                                    if (frameLayout != null) {
                                        i10 = R.id.vg_bottom_video;
                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_bottom_video);
                                        if (frameLayout2 != null) {
                                            CardView cardView = (CardView) view;
                                            i10 = R.id.vg_platforms_container;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_platforms_container);
                                            if (relativeLayout2 != null) {
                                                i10 = R.id.vg_top_video;
                                                FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_top_video);
                                                if (frameLayout3 != null) {
                                                    i10 = R.id.vp_platform;
                                                    HBViewPager2 hBViewPager2 = (HBViewPager2) l3.d.a(view, R.id.vp_platform);
                                                    if (hBViewPager2 != null) {
                                                        return new u80(cardView, imageView, imageView2, imageView3, imageView4, imageView5, radioGroup, relativeLayout, frameLayout, frameLayout2, cardView, relativeLayout2, frameLayout3, hBViewPager2);
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
    public static u80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20980, new Class[]{LayoutInflater.class}, u80.class);
        return patchProxyResultProxy.isSupported ? (u80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20981, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u80.class);
        if (patchProxyResultProxy.isSupported) {
            return (u80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_platforms_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f116273a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20983, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
