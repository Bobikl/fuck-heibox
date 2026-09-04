package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcMatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fe0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f110554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mh f110555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mh f110556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mh f110557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mh f110558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final mh f110559g;

    private fe0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 mh mhVar, @androidx.annotation.n0 mh mhVar2, @androidx.annotation.n0 mh mhVar3, @androidx.annotation.n0 mh mhVar4, @androidx.annotation.n0 mh mhVar5) {
        this.f110553a = cardView;
        this.f110554b = i20Var;
        this.f110555c = mhVar;
        this.f110556d = mhVar2;
        this.f110557e = mhVar3;
        this.f110558f = mhVar4;
        this.f110559g = mhVar5;
    }

    @androidx.annotation.n0
    public static fe0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21540, new Class[]{View.class}, fe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fe0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_all_bottom;
        View viewA = l3.d.a(view, R.id.vg_all_bottom);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_operators_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_0);
            if (viewA2 != null) {
                mh mhVarA = mh.a(viewA2);
                i10 = R.id.vg_operators_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_1);
                if (viewA3 != null) {
                    mh mhVarA2 = mh.a(viewA3);
                    i10 = R.id.vg_operators_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_2);
                    if (viewA4 != null) {
                        mh mhVarA3 = mh.a(viewA4);
                        i10 = R.id.vg_operators_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_3);
                        if (viewA5 != null) {
                            mh mhVarA4 = mh.a(viewA5);
                            i10 = R.id.vg_operators_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_4);
                            if (viewA6 != null) {
                                return new fe0((CardView) view, i20VarA, mhVarA, mhVarA2, mhVarA3, mhVarA4, mh.a(viewA6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fe0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21538, new Class[]{LayoutInflater.class}, fe0.class);
        return patchProxyResultProxy.isSupported ? (fe0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fe0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21539, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fe0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110553a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21541, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
