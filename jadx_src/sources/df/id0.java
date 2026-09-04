package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SearchDivider4dpBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class id0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f111774a;

    private id0(@androidx.annotation.n0 View view) {
        this.f111774a = view;
    }

    @androidx.annotation.n0
    public static id0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21449, new Class[]{View.class}, id0.class);
        if (patchProxyResultProxy.isSupported) {
            return (id0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new id0(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static id0 b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21447, new Class[]{LayoutInflater.class}, id0.class);
        return patchProxyResultProxy.isSupported ? (id0) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static id0 c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21448, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, id0.class);
        if (patchProxyResultProxy.isSupported) {
            return (id0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.search_divider_4dp, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f111774a;
    }
}
