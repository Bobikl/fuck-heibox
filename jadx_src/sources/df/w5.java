package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogMallRegionAlertBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117036i;

    private w5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f117028a = relativeLayout;
        this.f117029b = imageView;
        this.f117030c = textView;
        this.f117031d = textView2;
        this.f117032e = frameLayout;
        this.f117033f = linearLayout;
        this.f117034g = linearLayout2;
        this.f117035h = linearLayout3;
        this.f117036i = linearLayout4;
    }

    @androidx.annotation.n0
    public static w5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16952, new Class[]{View.class}, w5.class);
        if (patchProxyResultProxy.isSupported) {
            return (w5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.tv_agreement;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_agreement);
            if (textView != null) {
                i10 = R.id.tv_confirm;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm);
                if (textView2 != null) {
                    i10 = R.id.vg_bg;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                    if (frameLayout != null) {
                        i10 = R.id.vg_bottom_bar;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                        if (linearLayout != null) {
                            i10 = R.id.vg_info_1;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_info_1);
                            if (linearLayout2 != null) {
                                i10 = R.id.vg_info_2;
                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_info_2);
                                if (linearLayout3 != null) {
                                    i10 = R.id.vg_info_3;
                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_info_3);
                                    if (linearLayout4 != null) {
                                        return new w5((RelativeLayout) view, imageView, textView, textView2, frameLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static w5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16950, new Class[]{LayoutInflater.class}, w5.class);
        return patchProxyResultProxy.isSupported ? (w5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16951, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w5.class);
        if (patchProxyResultProxy.isSupported) {
            return (w5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_mall_region_alert, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117028a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16953, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
