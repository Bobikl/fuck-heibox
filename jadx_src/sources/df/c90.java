package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutProtocolMatrix1x2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109245c;

    private c90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 e4 e4Var, @androidx.annotation.n0 e4 e4Var2) {
        this.f109243a = linearLayout;
        this.f109244b = e4Var;
        this.f109245c = e4Var2;
    }

    @androidx.annotation.n0
    public static c90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21014, new Class[]{View.class}, c90.class);
        if (patchProxyResultProxy.isSupported) {
            return (c90) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_protocol_0;
        View viewA = l3.d.a(view, R.id.vg_protocol_0);
        if (viewA != null) {
            e4 e4VarA = e4.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_protocol_1);
            if (viewA2 != null) {
                return new c90((LinearLayout) view, e4VarA, e4.a(viewA2));
            }
            i10 = R.id.vg_protocol_1;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21012, new Class[]{LayoutInflater.class}, c90.class);
        return patchProxyResultProxy.isSupported ? (c90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21013, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c90.class);
        if (patchProxyResultProxy.isSupported) {
            return (c90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_protocol_matrix_1x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109243a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21015, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
