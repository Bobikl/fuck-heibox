package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcFriendsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ee0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f110163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ih f110164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ih f110165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ih f110166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ih f110167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ih f110168g;

    private ee0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 ih ihVar, @androidx.annotation.n0 ih ihVar2, @androidx.annotation.n0 ih ihVar3, @androidx.annotation.n0 ih ihVar4, @androidx.annotation.n0 ih ihVar5) {
        this.f110162a = cardView;
        this.f110163b = i20Var;
        this.f110164c = ihVar;
        this.f110165d = ihVar2;
        this.f110166e = ihVar3;
        this.f110167f = ihVar4;
        this.f110168g = ihVar5;
    }

    @androidx.annotation.n0
    public static ee0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21536, new Class[]{View.class}, ee0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ee0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_all_bottom;
        View viewA = l3.d.a(view, R.id.vg_all_bottom);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_operators_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_0);
            if (viewA2 != null) {
                ih ihVarA = ih.a(viewA2);
                i10 = R.id.vg_operators_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_1);
                if (viewA3 != null) {
                    ih ihVarA2 = ih.a(viewA3);
                    i10 = R.id.vg_operators_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_2);
                    if (viewA4 != null) {
                        ih ihVarA3 = ih.a(viewA4);
                        i10 = R.id.vg_operators_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_3);
                        if (viewA5 != null) {
                            ih ihVarA4 = ih.a(viewA5);
                            i10 = R.id.vg_operators_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_4);
                            if (viewA6 != null) {
                                return new ee0((CardView) view, i20VarA, ihVarA, ihVarA2, ihVarA3, ihVarA4, ih.a(viewA6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ee0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21534, new Class[]{LayoutInflater.class}, ee0.class);
        return patchProxyResultProxy.isSupported ? (ee0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ee0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21535, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ee0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ee0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_friends_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110162a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21537, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
