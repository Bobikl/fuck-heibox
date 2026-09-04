package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogSwitchGamePlatformBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114451d;

    private p6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f114448a = relativeLayout;
        this.f114449b = frameLayout;
        this.f114450c = linearLayout;
        this.f114451d = linearLayout2;
    }

    @androidx.annotation.n0
    public static p6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17028, new Class[]{View.class}, p6.class);
        if (patchProxyResultProxy.isSupported) {
            return (p6) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_bg;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
        if (frameLayout != null) {
            i10 = R.id.vg_bottom_bar;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
            if (linearLayout != null) {
                i10 = R.id.vg_platform;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_platform);
                if (linearLayout2 != null) {
                    return new p6((RelativeLayout) view, frameLayout, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17026, new Class[]{LayoutInflater.class}, p6.class);
        return patchProxyResultProxy.isSupported ? (p6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17027, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p6.class);
        if (patchProxyResultProxy.isSupported) {
            return (p6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_switch_game_platform, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114448a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17029, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
