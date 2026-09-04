package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TitleBarHomepageBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Toolbar f131674a;

    private n1(@androidx.annotation.n0 Toolbar toolbar) {
        this.f131674a = toolbar;
    }

    @androidx.annotation.n0
    public static n1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f32059va, new Class[]{View.class}, n1.class);
        if (patchProxyResultProxy.isSupported) {
            return (n1) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new n1((Toolbar) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static n1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f32025ta, new Class[]{LayoutInflater.class}, n1.class);
        return patchProxyResultProxy.isSupported ? (n1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32042ua, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n1.class);
        if (patchProxyResultProxy.isSupported) {
            return (n1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.title_bar_homepage, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Toolbar b() {
        return this.f131674a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32076wa, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
