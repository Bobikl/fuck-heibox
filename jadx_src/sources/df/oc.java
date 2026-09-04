package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HeaderXboxAchievementBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114190b;

    private oc(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view) {
        this.f114189a = relativeLayout;
        this.f114190b = view;
    }

    @androidx.annotation.n0
    public static oc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17648, new Class[]{View.class}, oc.class);
        if (patchProxyResultProxy.isSupported) {
            return (oc) patchProxyResultProxy.result;
        }
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            return new oc((RelativeLayout) view, viewA);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.divider)));
    }

    @androidx.annotation.n0
    public static oc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17646, new Class[]{LayoutInflater.class}, oc.class);
        return patchProxyResultProxy.isSupported ? (oc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17647, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oc.class);
        if (patchProxyResultProxy.isSupported) {
            return (oc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.header_xbox_achievement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114189a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17649, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
