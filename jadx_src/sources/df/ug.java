package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCsgoMatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ug implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f116418c;

    private ug(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 i20 i20Var) {
        this.f116416a = linearLayout;
        this.f116417b = linearLayout2;
        this.f116418c = i20Var;
    }

    @androidx.annotation.n0
    public static ug a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18087, new Class[]{View.class}, ug.class);
        if (patchProxyResultProxy.isSupported) {
            return (ug) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_match_list;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_match_list);
        if (linearLayout != null) {
            i10 = R.id.vg_matches_card_layout_all_bottom;
            View viewA = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
            if (viewA != null) {
                return new ug((LinearLayout) view, linearLayout, i20.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ug c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18085, new Class[]{LayoutInflater.class}, ug.class);
        return patchProxyResultProxy.isSupported ? (ug) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ug d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18086, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ug.class);
        if (patchProxyResultProxy.isSupported) {
            return (ug) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_csgo_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116416a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18088, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
