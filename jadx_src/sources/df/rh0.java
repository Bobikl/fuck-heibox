package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRvMiniProgramBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RecyclerView f115263a;

    private rh0(@androidx.annotation.n0 RecyclerView recyclerView) {
        this.f115263a = recyclerView;
    }

    @androidx.annotation.n0
    public static rh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21894, new Class[]{View.class}, rh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rh0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new rh0((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static rh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21892, new Class[]{LayoutInflater.class}, rh0.class);
        return patchProxyResultProxy.isSupported ? (rh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21893, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_rv_mini_program, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RecyclerView b() {
        return this.f115263a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21895, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
