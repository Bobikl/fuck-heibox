package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.max.hbcommon.component.CheckItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutCheckitemviewBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CheckItemView f131727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckItemView f131728b;

    private r0(@androidx.annotation.n0 CheckItemView checkItemView, @androidx.annotation.n0 CheckItemView checkItemView2) {
        this.f131727a = checkItemView;
        this.f131728b = checkItemView2;
    }

    @androidx.annotation.n0
    public static r0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.L8, new Class[]{View.class}, r0.class);
        if (patchProxyResultProxy.isSupported) {
            return (r0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CheckItemView checkItemView = (CheckItemView) view;
        return new r0(checkItemView, checkItemView);
    }

    @androidx.annotation.n0
    public static r0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.J8, new Class[]{LayoutInflater.class}, r0.class);
        return patchProxyResultProxy.isSupported ? (r0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.K8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r0.class);
        if (patchProxyResultProxy.isSupported) {
            return (r0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_checkitemview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CheckItemView b() {
        return this.f131727a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.M8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
