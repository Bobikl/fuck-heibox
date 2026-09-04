package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewCartOutOfInventoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oe0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114210b;

    private oe0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view) {
        this.f114209a = relativeLayout;
        this.f114210b = view;
    }

    @androidx.annotation.n0
    public static oe0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21574, new Class[]{View.class}, oe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (oe0) patchProxyResultProxy.result;
        }
        View viewA = l3.d.a(view, R.id.v_divider);
        if (viewA != null) {
            return new oe0((RelativeLayout) view, viewA);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.v_divider)));
    }

    @androidx.annotation.n0
    public static oe0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21572, new Class[]{LayoutInflater.class}, oe0.class);
        return patchProxyResultProxy.isSupported ? (oe0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oe0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21573, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (oe0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_cart_out_of_inventory, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114209a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21575, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
