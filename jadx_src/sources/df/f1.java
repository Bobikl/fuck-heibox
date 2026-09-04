package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentContainerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityMainBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FragmentContainerView f110354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f110365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110370s;

    private f1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FragmentContainerView fragmentContainerView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioButton radioButton4, @androidx.annotation.n0 RadioButton radioButton5, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110352a = relativeLayout;
        this.f110353b = frameLayout;
        this.f110354c = fragmentContainerView;
        this.f110355d = imageView;
        this.f110356e = imageView2;
        this.f110357f = imageView3;
        this.f110358g = imageView4;
        this.f110359h = imageView5;
        this.f110360i = radioButton;
        this.f110361j = radioButton2;
        this.f110362k = radioButton3;
        this.f110363l = radioButton4;
        this.f110364m = radioButton5;
        this.f110365n = radioGroup;
        this.f110366o = frameLayout2;
        this.f110367p = relativeLayout2;
        this.f110368q = cardView;
        this.f110369r = linearLayout;
        this.f110370s = linearLayout2;
    }

    @androidx.annotation.n0
    public static f1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16468, new Class[]{View.class}, f1.class);
        if (patchProxyResultProxy.isSupported) {
            return (f1) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_container);
        if (frameLayout != null) {
            i10 = R.id.fragment_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) l3.d.a(view, R.id.fragment_container);
            if (fragmentContainerView != null) {
                i10 = R.id.iv_tips_1;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_tips_1);
                if (imageView != null) {
                    i10 = R.id.iv_tips_2;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_tips_2);
                    if (imageView2 != null) {
                        i10 = R.id.iv_tips_3;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_tips_3);
                        if (imageView3 != null) {
                            i10 = R.id.iv_tips_4;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_tips_4);
                            if (imageView4 != null) {
                                i10 = R.id.iv_tips_5;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_tips_5);
                                if (imageView5 != null) {
                                    i10 = R.id.rb_1;
                                    RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_1);
                                    if (radioButton != null) {
                                        i10 = R.id.rb_2;
                                        RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_2);
                                        if (radioButton2 != null) {
                                            i10 = R.id.rb_3;
                                            RadioButton radioButton3 = (RadioButton) l3.d.a(view, R.id.rb_3);
                                            if (radioButton3 != null) {
                                                i10 = R.id.rb_4;
                                                RadioButton radioButton4 = (RadioButton) l3.d.a(view, R.id.rb_4);
                                                if (radioButton4 != null) {
                                                    i10 = R.id.rb_5;
                                                    RadioButton radioButton5 = (RadioButton) l3.d.a(view, R.id.rb_5);
                                                    if (radioButton5 != null) {
                                                        i10 = R.id.rg_main;
                                                        RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_main);
                                                        if (radioGroup != null) {
                                                            i10 = R.id.vg_fullscreen_video_container;
                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_video_container);
                                                            if (frameLayout2 != null) {
                                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                i10 = R.id.vg_mid_tab;
                                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_mid_tab);
                                                                if (cardView != null) {
                                                                    i10 = R.id.vg_tips;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tips);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_tips_3;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tips_3);
                                                                        if (linearLayout2 != null) {
                                                                            return new f1(relativeLayout, frameLayout, fragmentContainerView, imageView, imageView2, imageView3, imageView4, imageView5, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioGroup, frameLayout2, relativeLayout, cardView, linearLayout, linearLayout2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16466, new Class[]{LayoutInflater.class}, f1.class);
        return patchProxyResultProxy.isSupported ? (f1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16467, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f1.class);
        if (patchProxyResultProxy.isSupported) {
            return (f1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110352a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16469, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
