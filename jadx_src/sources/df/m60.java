package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameMatrix3x1Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final a4 f113303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final a4 f113304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final a4 f113305d;

    private m60(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 a4 a4Var, @androidx.annotation.n0 a4 a4Var2, @androidx.annotation.n0 a4 a4Var3) {
        this.f113302a = linearLayout;
        this.f113303b = a4Var;
        this.f113304c = a4Var2;
        this.f113305d = a4Var3;
    }

    @androidx.annotation.n0
    public static m60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20744, new Class[]{View.class}, m60.class);
        if (patchProxyResultProxy.isSupported) {
            return (m60) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_game_0;
        View viewA = l3.d.a(view, R.id.vg_game_0);
        if (viewA != null) {
            a4 a4VarA = a4.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_game_1);
            if (viewA2 != null) {
                a4 a4VarA2 = a4.a(viewA2);
                View viewA3 = l3.d.a(view, R.id.vg_game_2);
                if (viewA3 != null) {
                    return new m60((LinearLayout) view, a4VarA, a4VarA2, a4.a(viewA3));
                }
                i10 = R.id.vg_game_2;
            } else {
                i10 = R.id.vg_game_1;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20742, new Class[]{LayoutInflater.class}, m60.class);
        return patchProxyResultProxy.isSupported ? (m60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20743, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m60.class);
        if (patchProxyResultProxy.isSupported) {
            return (m60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_matrix_3x1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113302a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20745, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
