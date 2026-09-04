package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemWeaponsTitlePubgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116979a;

    private w10(@androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f116979a = relativeLayout;
    }

    @androidx.annotation.n0
    public static w10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20268, new Class[]{View.class}, w10.class);
        if (patchProxyResultProxy.isSupported) {
            return (w10) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new w10((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static w10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20266, new Class[]{LayoutInflater.class}, w10.class);
        return patchProxyResultProxy.isSupported ? (w10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20267, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w10.class);
        if (patchProxyResultProxy.isSupported) {
            return (w10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_weapons_title_pubg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116979a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20269, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
