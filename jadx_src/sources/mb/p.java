package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DividerConceptBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f131691a;

    private p(@androidx.annotation.n0 View view) {
        this.f131691a = view;
    }

    @androidx.annotation.n0
    public static p a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.E6, new Class[]{View.class}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new p(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static p b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.C6, new Class[]{LayoutInflater.class}, p.class);
        return patchProxyResultProxy.isSupported ? (p) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.D6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.divider_concept, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f131691a;
    }
}
