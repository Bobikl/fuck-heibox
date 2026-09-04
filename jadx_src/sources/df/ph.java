package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDebugOptionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ph implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f114559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114561e;

    private ph(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 SwitchButton switchButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114557a = relativeLayout;
        this.f114558b = imageView;
        this.f114559c = switchButton;
        this.f114560d = textView;
        this.f114561e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ph a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18171, new Class[]{View.class}, ph.class);
        if (patchProxyResultProxy.isSupported) {
            return (ph) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.sb_option;
            SwitchButton switchButton = (SwitchButton) l3.d.a(view, R.id.sb_option);
            if (switchButton != null) {
                i10 = R.id.tv_option;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_option);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new ph(relativeLayout, imageView, switchButton, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ph c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18169, new Class[]{LayoutInflater.class}, ph.class);
        return patchProxyResultProxy.isSupported ? (ph) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ph d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18170, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ph.class);
        if (patchProxyResultProxy.isSupported) {
            return (ph) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_debug_option, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114557a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18172, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
