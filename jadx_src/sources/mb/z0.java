package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutRefreshRvEmptyBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class z0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final q f131839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final b1 f131840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131841d;

    private z0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 q qVar, @androidx.annotation.n0 b1 b1Var, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f131838a = relativeLayout;
        this.f131839b = qVar;
        this.f131840c = b1Var;
        this.f131841d = relativeLayout2;
    }

    @androidx.annotation.n0
    public static z0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31990r9, new Class[]{View.class}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_empty_view;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            q qVarA = q.a(viewA);
            int i11 = R.id.srl;
            View viewA2 = l3.d.a(view, i11);
            if (viewA2 != null) {
                b1 b1VarA = b1.a(viewA2);
                int i12 = R.id.sticky_layout_header;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i12);
                if (relativeLayout != null) {
                    return new z0((RelativeLayout) view, qVarA, b1VarA, relativeLayout);
                }
                i10 = i12;
            } else {
                i10 = i11;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31956p9, new Class[]{LayoutInflater.class}, z0.class);
        return patchProxyResultProxy.isSupported ? (z0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31973q9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_refresh_rv_empty, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131838a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32007s9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
