package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSpaceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class va0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f116759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116760b;

    private va0(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f116759a = view;
        this.f116760b = view2;
    }

    @androidx.annotation.n0
    public static va0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21194, new Class[]{View.class}, va0.class);
        if (patchProxyResultProxy.isSupported) {
            return (va0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new va0(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static va0 b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21192, new Class[]{LayoutInflater.class}, va0.class);
        return patchProxyResultProxy.isSupported ? (va0) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static va0 c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21193, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, va0.class);
        if (patchProxyResultProxy.isSupported) {
            return (va0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_space, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f116759a;
    }
}
