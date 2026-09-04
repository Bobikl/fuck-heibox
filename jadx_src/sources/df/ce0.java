package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcChessCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ce0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f109353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ch f109354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ch f109355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ch f109356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ch f109357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ch f109358g;

    private ce0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 ch chVar, @androidx.annotation.n0 ch chVar2, @androidx.annotation.n0 ch chVar3, @androidx.annotation.n0 ch chVar4, @androidx.annotation.n0 ch chVar5) {
        this.f109352a = cardView;
        this.f109353b = i20Var;
        this.f109354c = chVar;
        this.f109355d = chVar2;
        this.f109356e = chVar3;
        this.f109357f = chVar4;
        this.f109358g = chVar5;
    }

    @androidx.annotation.n0
    public static ce0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21528, new Class[]{View.class}, ce0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ce0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_all_bottom;
        View viewA = l3.d.a(view, R.id.vg_all_bottom);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_operators_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_0);
            if (viewA2 != null) {
                ch chVarA = ch.a(viewA2);
                i10 = R.id.vg_operators_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_1);
                if (viewA3 != null) {
                    ch chVarA2 = ch.a(viewA3);
                    i10 = R.id.vg_operators_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_2);
                    if (viewA4 != null) {
                        ch chVarA3 = ch.a(viewA4);
                        i10 = R.id.vg_operators_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_3);
                        if (viewA5 != null) {
                            ch chVarA4 = ch.a(viewA5);
                            i10 = R.id.vg_operators_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_4);
                            if (viewA6 != null) {
                                return new ce0((CardView) view, i20VarA, chVarA, chVarA2, chVarA3, chVarA4, ch.a(viewA6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ce0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21526, new Class[]{LayoutInflater.class}, ce0.class);
        return patchProxyResultProxy.isSupported ? (ce0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ce0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21527, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ce0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ce0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_chess_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109352a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21529, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
