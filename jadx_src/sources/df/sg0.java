package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewOwHeroesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final gs f115632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final gs f115633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final gs f115634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final gs f115635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final gs f115636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f115637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f115638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115639j;

    private sg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 gs gsVar, @androidx.annotation.n0 gs gsVar2, @androidx.annotation.n0 gs gsVar3, @androidx.annotation.n0 gs gsVar4, @androidx.annotation.n0 gs gsVar5, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f115630a = cardView;
        this.f115631b = textView;
        this.f115632c = gsVar;
        this.f115633d = gsVar2;
        this.f115634e = gsVar3;
        this.f115635f = gsVar4;
        this.f115636g = gsVar5;
        this.f115637h = quVar;
        this.f115638i = i20Var;
        this.f115639j = relativeLayout;
    }

    @androidx.annotation.n0
    public static sg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21794, new Class[]{View.class}, sg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_card_item_0;
            View viewA = l3.d.a(view, R.id.vg_card_item_0);
            if (viewA != null) {
                gs gsVarA = gs.a(viewA);
                i10 = R.id.vg_card_item_1;
                View viewA2 = l3.d.a(view, R.id.vg_card_item_1);
                if (viewA2 != null) {
                    gs gsVarA2 = gs.a(viewA2);
                    i10 = R.id.vg_card_item_2;
                    View viewA3 = l3.d.a(view, R.id.vg_card_item_2);
                    if (viewA3 != null) {
                        gs gsVarA3 = gs.a(viewA3);
                        i10 = R.id.vg_card_item_3;
                        View viewA4 = l3.d.a(view, R.id.vg_card_item_3);
                        if (viewA4 != null) {
                            gs gsVarA4 = gs.a(viewA4);
                            i10 = R.id.vg_card_item_4;
                            View viewA5 = l3.d.a(view, R.id.vg_card_item_4);
                            if (viewA5 != null) {
                                gs gsVarA5 = gs.a(viewA5);
                                i10 = R.id.vg_card_title;
                                View viewA6 = l3.d.a(view, R.id.vg_card_title);
                                if (viewA6 != null) {
                                    qu quVarA = qu.a(viewA6);
                                    i10 = R.id.vg_matches_card_layout_all_bottom;
                                    View viewA7 = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
                                    if (viewA7 != null) {
                                        i20 i20VarA = i20.a(viewA7);
                                        i10 = R.id.vg_matches_card_no_data;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_matches_card_no_data);
                                        if (relativeLayout != null) {
                                            return new sg0((CardView) view, textView, gsVarA, gsVarA2, gsVarA3, gsVarA4, gsVarA5, quVarA, i20VarA, relativeLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21792, new Class[]{LayoutInflater.class}, sg0.class);
        return patchProxyResultProxy.isSupported ? (sg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21793, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ow_heroes_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115630a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21795, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
