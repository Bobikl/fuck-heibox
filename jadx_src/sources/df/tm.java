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

/* JADX INFO: compiled from: ItemGameRecommend1x2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f116036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f116037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final w3 f116038d;

    private tm(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 w3 w3Var, @androidx.annotation.n0 w3 w3Var2) {
        this.f116035a = constraintLayout;
        this.f116036b = guideline;
        this.f116037c = w3Var;
        this.f116038d = w3Var2;
    }

    @androidx.annotation.n0
    public static tm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18704, new Class[]{View.class}, tm.class);
        if (patchProxyResultProxy.isSupported) {
            return (tm) patchProxyResultProxy.result;
        }
        int i10 = R.id.guideline2;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guideline2);
        if (guideline != null) {
            i10 = R.id.vg_game_0;
            View viewA = l3.d.a(view, R.id.vg_game_0);
            if (viewA != null) {
                w3 w3VarA = w3.a(viewA);
                View viewA2 = l3.d.a(view, R.id.vg_game_1);
                if (viewA2 != null) {
                    return new tm((ConstraintLayout) view, guideline, w3VarA, w3.a(viewA2));
                }
                i10 = R.id.vg_game_1;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static tm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18702, new Class[]{LayoutInflater.class}, tm.class);
        return patchProxyResultProxy.isSupported ? (tm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18703, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tm.class);
        if (patchProxyResultProxy.isSupported) {
            return (tm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_recommend_1x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116035a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18705, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
