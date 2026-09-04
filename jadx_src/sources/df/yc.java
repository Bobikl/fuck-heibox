package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemAddressConfirmBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117906a;

    private yc(@androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117906a = linearLayout;
    }

    @androidx.annotation.n0
    public static yc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17688, new Class[]{View.class}, yc.class);
        if (patchProxyResultProxy.isSupported) {
            return (yc) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new yc((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static yc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17686, new Class[]{LayoutInflater.class}, yc.class);
        return patchProxyResultProxy.isSupported ? (yc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17687, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yc.class);
        if (patchProxyResultProxy.isSupported) {
            return (yc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_address_confirm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117906a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17689, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
