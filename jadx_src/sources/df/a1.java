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

/* JADX INFO: compiled from: ActivityItemCenterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f108289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f108290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108292m;

    private a1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioButton radioButton4, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108280a = relativeLayout;
        this.f108281b = frameLayout;
        this.f108282c = imageView;
        this.f108283d = imageView2;
        this.f108284e = imageView3;
        this.f108285f = imageView4;
        this.f108286g = radioButton;
        this.f108287h = radioButton2;
        this.f108288i = radioButton3;
        this.f108289j = radioButton4;
        this.f108290k = radioGroup;
        this.f108291l = linearLayout;
        this.f108292m = linearLayout2;
    }

    @androidx.annotation.n0
    public static a1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16448, new Class[]{View.class}, a1.class);
        if (patchProxyResultProxy.isSupported) {
            return (a1) patchProxyResultProxy.result;
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
                        i10 = R.id.iv_tips_4;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_tips_4);
                        if (imageView4 != null) {
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
                                            i10 = R.id.rg_main;
                                            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_main);
                                            if (radioGroup != null) {
                                                i10 = R.id.vg_tips_3;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tips_3);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_tips_4;
                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tips_4);
                                                    if (linearLayout2 != null) {
                                                        return new a1((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, linearLayout, linearLayout2);
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
    public static a1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16446, new Class[]{LayoutInflater.class}, a1.class);
        return patchProxyResultProxy.isSupported ? (a1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16447, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a1.class);
        if (patchProxyResultProxy.isSupported) {
            return (a1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_item_center, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108280a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16449, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
