package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsV4Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ur implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116504a;

    private ur(@androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116504a = linearLayout;
    }

    @androidx.annotation.n0
    public static ur a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19228, new Class[]{View.class}, ur.class);
        if (patchProxyResultProxy.isSupported) {
            return (ur) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new ur((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static ur c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19226, new Class[]{LayoutInflater.class}, ur.class);
        return patchProxyResultProxy.isSupported ? (ur) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ur d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19227, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ur.class);
        if (patchProxyResultProxy.isSupported) {
            return (ur) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_v4, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116504a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19229, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
