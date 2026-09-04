package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameMatrix2x2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f112883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f112884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f112885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f112886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f112887f;

    private l60(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 w3 w3Var, @androidx.annotation.n0 w3 w3Var2, @androidx.annotation.n0 w3 w3Var3, @androidx.annotation.n0 w3 w3Var4) {
        this.f112882a = constraintLayout;
        this.f112883b = guideline;
        this.f112884c = w3Var;
        this.f112885d = w3Var2;
        this.f112886e = w3Var3;
        this.f112887f = w3Var4;
    }

    @androidx.annotation.n0
    public static l60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20740, new Class[]{View.class}, l60.class);
        if (patchProxyResultProxy.isSupported) {
            return (l60) patchProxyResultProxy.result;
        }
        int i10 = R.id.guideline2;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guideline2);
        if (guideline != null) {
            i10 = R.id.vg_game_0;
            View viewA = l3.d.a(view, R.id.vg_game_0);
            if (viewA != null) {
                w3 w3VarA = w3.a(viewA);
                i10 = R.id.vg_game_1;
                View viewA2 = l3.d.a(view, R.id.vg_game_1);
                if (viewA2 != null) {
                    w3 w3VarA2 = w3.a(viewA2);
                    i10 = R.id.vg_game_2;
                    View viewA3 = l3.d.a(view, R.id.vg_game_2);
                    if (viewA3 != null) {
                        w3 w3VarA3 = w3.a(viewA3);
                        i10 = R.id.vg_game_3;
                        View viewA4 = l3.d.a(view, R.id.vg_game_3);
                        if (viewA4 != null) {
                            return new l60((ConstraintLayout) view, guideline, w3VarA, w3VarA2, w3VarA3, w3.a(viewA4));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20738, new Class[]{LayoutInflater.class}, l60.class);
        return patchProxyResultProxy.isSupported ? (l60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20739, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l60.class);
        if (patchProxyResultProxy.isSupported) {
            return (l60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_matrix_2x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112882a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20741, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
