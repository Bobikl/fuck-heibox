package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameCompilationMatrix1x2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final rr f118220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final rr f118221c;

    private z50(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 rr rrVar, @androidx.annotation.n0 rr rrVar2) {
        this.f118219a = linearLayout;
        this.f118220b = rrVar;
        this.f118221c = rrVar2;
    }

    @androidx.annotation.n0
    public static z50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20692, new Class[]{View.class}, z50.class);
        if (patchProxyResultProxy.isSupported) {
            return (z50) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_game_compilation_0;
        View viewA = l3.d.a(view, R.id.vg_game_compilation_0);
        if (viewA != null) {
            rr rrVarA = rr.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_game_compilation_1);
            if (viewA2 != null) {
                return new z50((LinearLayout) view, rrVarA, rr.a(viewA2));
            }
            i10 = R.id.vg_game_compilation_1;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20690, new Class[]{LayoutInflater.class}, z50.class);
        return patchProxyResultProxy.isSupported ? (z50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20691, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z50.class);
        if (patchProxyResultProxy.isSupported) {
            return (z50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_compilation_matrix_1x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118219a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20693, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
