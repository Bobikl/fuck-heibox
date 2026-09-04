package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Layout0dividerHorizontalF3f4f5Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f110377a;

    private f20(@androidx.annotation.n0 View view) {
        this.f110377a = view;
    }

    @androidx.annotation.n0
    public static f20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20304, new Class[]{View.class}, f20.class);
        if (patchProxyResultProxy.isSupported) {
            return (f20) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new f20(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static f20 b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20302, new Class[]{LayoutInflater.class}, f20.class);
        return patchProxyResultProxy.isSupported ? (f20) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f20 c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20303, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f20.class);
        if (patchProxyResultProxy.isSupported) {
            return (f20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_0divider_horizontal_f3f4f5, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f110377a;
    }
}
