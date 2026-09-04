package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCsgob5MatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f117183c;

    private wg(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 i20 i20Var) {
        this.f117181a = linearLayout;
        this.f117182b = linearLayout2;
        this.f117183c = i20Var;
    }

    @androidx.annotation.n0
    public static wg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18095, new Class[]{View.class}, wg.class);
        if (patchProxyResultProxy.isSupported) {
            return (wg) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_match_list;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_match_list);
        if (linearLayout != null) {
            i10 = R.id.vg_matches_card_layout_all_bottom;
            View viewA = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
            if (viewA != null) {
                return new wg((LinearLayout) view, linearLayout, i20.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18093, new Class[]{LayoutInflater.class}, wg.class);
        return patchProxyResultProxy.isSupported ? (wg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18094, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wg.class);
        if (patchProxyResultProxy.isSupported) {
            return (wg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_csgob5_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117181a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18096, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
