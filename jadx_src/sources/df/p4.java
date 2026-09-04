package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogBirthdayBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f114431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f114435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114438h;

    private p4(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3) {
        this.f114431a = frameLayout;
        this.f114432b = textView;
        this.f114433c = textView2;
        this.f114434d = view;
        this.f114435e = hBUiKitView;
        this.f114436f = constraintLayout;
        this.f114437g = frameLayout2;
        this.f114438h = frameLayout3;
    }

    @androidx.annotation.n0
    public static p4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16820, new Class[]{View.class}, p4.class);
        if (patchProxyResultProxy.isSupported) {
            return (p4) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_button;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_button);
        if (textView != null) {
            i10 = R.id.tv_tips;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_tips);
            if (textView2 != null) {
                i10 = R.id.v_gradient;
                View viewA = l3.d.a(view, R.id.v_gradient);
                if (viewA != null) {
                    i10 = R.id.v_ui_kit;
                    HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_ui_kit);
                    if (hBUiKitView != null) {
                        i10 = R.id.vg_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_container);
                        if (constraintLayout != null) {
                            i10 = R.id.vg_content;
                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_content);
                            if (frameLayout != null) {
                                i10 = R.id.vg_fullscreen_image;
                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_image);
                                if (frameLayout2 != null) {
                                    return new p4((FrameLayout) view, textView, textView2, viewA, hBUiKitView, constraintLayout, frameLayout, frameLayout2);
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
    public static p4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16818, new Class[]{LayoutInflater.class}, p4.class);
        return patchProxyResultProxy.isSupported ? (p4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16819, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p4.class);
        if (patchProxyResultProxy.isSupported) {
            return (p4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_birthday, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f114431a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16821, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
