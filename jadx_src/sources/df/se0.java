package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDestiny2MatchCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class se0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f115606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final rh f115607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final rh f115608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final rh f115609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final rh f115610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final rh f115611g;

    private se0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 rh rhVar, @androidx.annotation.n0 rh rhVar2, @androidx.annotation.n0 rh rhVar3, @androidx.annotation.n0 rh rhVar4, @androidx.annotation.n0 rh rhVar5) {
        this.f115605a = cardView;
        this.f115606b = i20Var;
        this.f115607c = rhVar;
        this.f115608d = rhVar2;
        this.f115609e = rhVar3;
        this.f115610f = rhVar4;
        this.f115611g = rhVar5;
    }

    @androidx.annotation.n0
    public static se0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21590, new Class[]{View.class}, se0.class);
        if (patchProxyResultProxy.isSupported) {
            return (se0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_all_bottom;
        View viewA = l3.d.a(view, R.id.vg_all_bottom);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_operators_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_0);
            if (viewA2 != null) {
                rh rhVarA = rh.a(viewA2);
                i10 = R.id.vg_operators_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_1);
                if (viewA3 != null) {
                    rh rhVarA2 = rh.a(viewA3);
                    i10 = R.id.vg_operators_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_2);
                    if (viewA4 != null) {
                        rh rhVarA3 = rh.a(viewA4);
                        i10 = R.id.vg_operators_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_3);
                        if (viewA5 != null) {
                            rh rhVarA4 = rh.a(viewA5);
                            i10 = R.id.vg_operators_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_4);
                            if (viewA6 != null) {
                                return new se0((CardView) view, i20VarA, rhVarA, rhVarA2, rhVarA3, rhVarA4, rh.a(viewA6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static se0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21588, new Class[]{LayoutInflater.class}, se0.class);
        return patchProxyResultProxy.isSupported ? (se0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static se0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21589, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, se0.class);
        if (patchProxyResultProxy.isSupported) {
            return (se0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_destiny2_match_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115605a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21591, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
