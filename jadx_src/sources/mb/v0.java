package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLeftCheckBoxBottomDoubleButtonBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class v0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f131798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f131799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131805i;

    private v0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BaseBottomButton baseBottomButton, @androidx.annotation.n0 BaseBottomButton baseBottomButton2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 View view) {
        this.f131797a = linearLayout;
        this.f131798b = baseBottomButton;
        this.f131799c = baseBottomButton2;
        this.f131800d = imageView;
        this.f131801e = linearLayout2;
        this.f131802f = linearLayout3;
        this.f131803g = textView;
        this.f131804h = linearLayout4;
        this.f131805i = view;
    }

    @androidx.annotation.n0
    public static v0 a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31719b9, new Class[]{View.class}, v0.class);
        if (patchProxyResultProxy.isSupported) {
            return (v0) patchProxyResultProxy.result;
        }
        int i10 = R.id.button_left;
        BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, i10);
        if (baseBottomButton != null) {
            i10 = R.id.button_right;
            BaseBottomButton baseBottomButton2 = (BaseBottomButton) l3.d.a(view, i10);
            if (baseBottomButton2 != null) {
                i10 = R.id.iv_cb;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = R.id.ll_left_view;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = R.id.tv_checkbox;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.vg_checkbox;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                            if (linearLayout3 != null && (viewA = l3.d.a(view, (i10 = R.id.view_between_button))) != null) {
                                return new v0(linearLayout, baseBottomButton, baseBottomButton2, imageView, linearLayout, linearLayout2, textView, linearLayout3, viewA);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Z8, new Class[]{LayoutInflater.class}, v0.class);
        return patchProxyResultProxy.isSupported ? (v0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31702a9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v0.class);
        if (patchProxyResultProxy.isSupported) {
            return (v0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_left_check_box_bottom_double_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131797a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31736c9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
