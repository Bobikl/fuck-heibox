package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewMyGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f114548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final gr f114549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final gr f114550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final gr f114551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final gr f114552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final gr f114553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f114555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final fr f114556j;

    private pg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 gr grVar, @androidx.annotation.n0 gr grVar2, @androidx.annotation.n0 gr grVar3, @androidx.annotation.n0 gr grVar4, @androidx.annotation.n0 gr grVar5, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 fr frVar) {
        this.f114547a = cardView;
        this.f114548b = i20Var;
        this.f114549c = grVar;
        this.f114550d = grVar2;
        this.f114551e = grVar3;
        this.f114552f = grVar4;
        this.f114553g = grVar5;
        this.f114554h = relativeLayout;
        this.f114555i = h20Var;
        this.f114556j = frVar;
    }

    @androidx.annotation.n0
    public static pg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21782, new Class[]{View.class}, pg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_my_game_card_all_wrapper;
        View viewA = l3.d.a(view, R.id.vg_my_game_card_all_wrapper);
        if (viewA != null) {
            i20 i20VarA = i20.a(viewA);
            i10 = R.id.vg_my_game_card_item_0;
            View viewA2 = l3.d.a(view, R.id.vg_my_game_card_item_0);
            if (viewA2 != null) {
                gr grVarA = gr.a(viewA2);
                i10 = R.id.vg_my_game_card_item_1;
                View viewA3 = l3.d.a(view, R.id.vg_my_game_card_item_1);
                if (viewA3 != null) {
                    gr grVarA2 = gr.a(viewA3);
                    i10 = R.id.vg_my_game_card_item_2;
                    View viewA4 = l3.d.a(view, R.id.vg_my_game_card_item_2);
                    if (viewA4 != null) {
                        gr grVarA3 = gr.a(viewA4);
                        i10 = R.id.vg_my_game_card_item_3;
                        View viewA5 = l3.d.a(view, R.id.vg_my_game_card_item_3);
                        if (viewA5 != null) {
                            gr grVarA4 = gr.a(viewA5);
                            i10 = R.id.vg_my_game_card_item_4;
                            View viewA6 = l3.d.a(view, R.id.vg_my_game_card_item_4);
                            if (viewA6 != null) {
                                gr grVarA5 = gr.a(viewA6);
                                i10 = R.id.vg_my_game_card_no_game;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_my_game_card_no_game);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_my_game_card_title_wrapper;
                                    View viewA7 = l3.d.a(view, R.id.vg_my_game_card_title_wrapper);
                                    if (viewA7 != null) {
                                        h20 h20VarA = h20.a(viewA7);
                                        i10 = R.id.vg_my_game_card_title_wrapper_x;
                                        View viewA8 = l3.d.a(view, R.id.vg_my_game_card_title_wrapper_x);
                                        if (viewA8 != null) {
                                            return new pg0((CardView) view, i20VarA, grVarA, grVarA2, grVarA3, grVarA4, grVarA5, relativeLayout, h20VarA, fr.a(viewA8));
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
    public static pg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21780, new Class[]{LayoutInflater.class}, pg0.class);
        return patchProxyResultProxy.isSupported ? (pg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21781, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_my_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114547a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21783, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
