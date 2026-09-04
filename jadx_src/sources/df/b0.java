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
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGameCenterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f108685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108687k;

    private b0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108677a = relativeLayout;
        this.f108678b = frameLayout;
        this.f108679c = imageView;
        this.f108680d = imageView2;
        this.f108681e = imageView3;
        this.f108682f = radioButton;
        this.f108683g = radioButton2;
        this.f108684h = radioButton3;
        this.f108685i = radioGroup;
        this.f108686j = frameLayout2;
        this.f108687k = linearLayout;
    }

    @androidx.annotation.n0
    public static b0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16348, new Class[]{View.class}, b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_container);
        if (frameLayout != null) {
            i10 = R.id.iv_tips_1;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_tips_1);
            if (imageView != null) {
                i10 = R.id.iv_tips_2;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_tips_2);
                if (imageView2 != null) {
                    i10 = R.id.iv_tips_3;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_tips_3);
                    if (imageView3 != null) {
                        i10 = R.id.rb_1;
                        RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_1);
                        if (radioButton != null) {
                            i10 = R.id.rb_2;
                            RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_2);
                            if (radioButton2 != null) {
                                i10 = R.id.rb_3;
                                RadioButton radioButton3 = (RadioButton) l3.d.a(view, R.id.rb_3);
                                if (radioButton3 != null) {
                                    i10 = R.id.rg_main;
                                    RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_main);
                                    if (radioGroup != null) {
                                        i10 = R.id.vg_fullscreen_video_container;
                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_video_container);
                                        if (frameLayout2 != null) {
                                            i10 = R.id.vg_tips_3;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tips_3);
                                            if (linearLayout != null) {
                                                return new b0((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, radioButton, radioButton2, radioButton3, radioGroup, frameLayout2, linearLayout);
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
    public static b0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16346, new Class[]{LayoutInflater.class}, b0.class);
        return patchProxyResultProxy.isSupported ? (b0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16347, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_center, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108677a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16349, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
