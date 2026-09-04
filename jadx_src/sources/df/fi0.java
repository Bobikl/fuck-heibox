package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewTopLayoutBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fi0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f110597b;

    private fi0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HBUiKitView hBUiKitView) {
        this.f110596a = constraintLayout;
        this.f110597b = hBUiKitView;
    }

    @androidx.annotation.n0
    public static fi0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21946, new Class[]{View.class}, fi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fi0) patchProxyResultProxy.result;
        }
        HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.uikit);
        if (hBUiKitView != null) {
            return new fi0((ConstraintLayout) view, hBUiKitView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.uikit)));
    }

    @androidx.annotation.n0
    public static fi0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21944, new Class[]{LayoutInflater.class}, fi0.class);
        return patchProxyResultProxy.isSupported ? (fi0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fi0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21945, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fi0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_top_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110596a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21947, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
