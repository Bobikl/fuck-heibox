package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcBuffCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ae0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f108527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah f108528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah f108529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah f108530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah f108531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ah f108532g;

    private ae0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 ah ahVar, @androidx.annotation.n0 ah ahVar2, @androidx.annotation.n0 ah ahVar3, @androidx.annotation.n0 ah ahVar4, @androidx.annotation.n0 ah ahVar5) {
        this.f108526a = cardView;
        this.f108527b = i20Var;
        this.f108528c = ahVar;
        this.f108529d = ahVar2;
        this.f108530e = ahVar3;
        this.f108531f = ahVar4;
        this.f108532g = ahVar5;
    }

    @androidx.annotation.n0
    public static ae0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21520, new Class[]{View.class}, ae0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ae0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_all_bottom;
        View viewA = l3.d.a(view, R.id.vg_all_bottom);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_operators_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_0);
            if (viewA2 != null) {
                ah ahVarA = ah.a(viewA2);
                i10 = R.id.vg_operators_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_1);
                if (viewA3 != null) {
                    ah ahVarA2 = ah.a(viewA3);
                    i10 = R.id.vg_operators_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_2);
                    if (viewA4 != null) {
                        ah ahVarA3 = ah.a(viewA4);
                        i10 = R.id.vg_operators_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_3);
                        if (viewA5 != null) {
                            ah ahVarA4 = ah.a(viewA5);
                            i10 = R.id.vg_operators_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_4);
                            if (viewA6 != null) {
                                return new ae0((CardView) view, i20VarA, ahVarA, ahVarA2, ahVarA3, ahVarA4, ah.a(viewA6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ae0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21518, new Class[]{LayoutInflater.class}, ae0.class);
        return patchProxyResultProxy.isSupported ? (ae0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ae0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21519, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ae0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ae0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_buff_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108526a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21521, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
