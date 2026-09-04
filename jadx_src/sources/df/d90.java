package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutProtocolMatrix2x2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final e4 f109701e;

    private d90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 e4 e4Var, @androidx.annotation.n0 e4 e4Var2, @androidx.annotation.n0 e4 e4Var3, @androidx.annotation.n0 e4 e4Var4) {
        this.f109697a = linearLayout;
        this.f109698b = e4Var;
        this.f109699c = e4Var2;
        this.f109700d = e4Var3;
        this.f109701e = e4Var4;
    }

    @androidx.annotation.n0
    public static d90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21018, new Class[]{View.class}, d90.class);
        if (patchProxyResultProxy.isSupported) {
            return (d90) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_protocol_0;
        View viewA = l3.d.a(view, R.id.vg_protocol_0);
        if (viewA != null) {
            e4 e4VarA = e4.a(viewA);
            i10 = R.id.vg_protocol_1;
            View viewA2 = l3.d.a(view, R.id.vg_protocol_1);
            if (viewA2 != null) {
                e4 e4VarA2 = e4.a(viewA2);
                i10 = R.id.vg_protocol_2;
                View viewA3 = l3.d.a(view, R.id.vg_protocol_2);
                if (viewA3 != null) {
                    e4 e4VarA3 = e4.a(viewA3);
                    i10 = R.id.vg_protocol_3;
                    View viewA4 = l3.d.a(view, R.id.vg_protocol_3);
                    if (viewA4 != null) {
                        return new d90((LinearLayout) view, e4VarA, e4VarA2, e4VarA3, e4.a(viewA4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21016, new Class[]{LayoutInflater.class}, d90.class);
        return patchProxyResultProxy.isSupported ? (d90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21017, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d90.class);
        if (patchProxyResultProxy.isSupported) {
            return (d90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_protocol_matrix_2x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109697a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21019, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
