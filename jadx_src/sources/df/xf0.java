package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameInfoCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final on f117563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final wh0 f117564c;

    private xf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 on onVar, @androidx.annotation.n0 wh0 wh0Var) {
        this.f117562a = linearLayout;
        this.f117563b = onVar;
        this.f117564c = wh0Var;
    }

    @androidx.annotation.n0
    public static xf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21712, new Class[]{View.class}, xf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_view_game_info_card;
        View viewA = l3.d.a(view, R.id.vg_view_game_info_card);
        if (viewA != null) {
            on onVarA = on.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_view_game_info_card_grid);
            if (viewA2 != null) {
                return new xf0((LinearLayout) view, onVarA, wh0.a(viewA2));
            }
            i10 = R.id.vg_view_game_info_card_grid;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21710, new Class[]{LayoutInflater.class}, xf0.class);
        return patchProxyResultProxy.isSupported ? (xf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21711, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_info_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117562a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21713, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
