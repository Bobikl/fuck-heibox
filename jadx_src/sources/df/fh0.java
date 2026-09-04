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

/* JADX INFO: compiled from: ViewR6MatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final wu f110585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final wu f110586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final wu f110587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final wu f110588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final wu f110589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f110590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f110591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110592j;

    private fh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 wu wuVar, @androidx.annotation.n0 wu wuVar2, @androidx.annotation.n0 wu wuVar3, @androidx.annotation.n0 wu wuVar4, @androidx.annotation.n0 wu wuVar5, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110583a = cardView;
        this.f110584b = textView;
        this.f110585c = wuVar;
        this.f110586d = wuVar2;
        this.f110587e = wuVar3;
        this.f110588f = wuVar4;
        this.f110589g = wuVar5;
        this.f110590h = h20Var;
        this.f110591i = i20Var;
        this.f110592j = relativeLayout;
    }

    @androidx.annotation.n0
    public static fh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21846, new Class[]{View.class}, fh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_matches_card_item_matches_0;
            View viewA = l3.d.a(view, R.id.vg_matches_card_item_matches_0);
            if (viewA != null) {
                wu wuVarA = wu.a(viewA);
                i10 = R.id.vg_matches_card_item_matches_1;
                View viewA2 = l3.d.a(view, R.id.vg_matches_card_item_matches_1);
                if (viewA2 != null) {
                    wu wuVarA2 = wu.a(viewA2);
                    i10 = R.id.vg_matches_card_item_matches_2;
                    View viewA3 = l3.d.a(view, R.id.vg_matches_card_item_matches_2);
                    if (viewA3 != null) {
                        wu wuVarA3 = wu.a(viewA3);
                        i10 = R.id.vg_matches_card_item_matches_3;
                        View viewA4 = l3.d.a(view, R.id.vg_matches_card_item_matches_3);
                        if (viewA4 != null) {
                            wu wuVarA4 = wu.a(viewA4);
                            i10 = R.id.vg_matches_card_item_matches_4;
                            View viewA5 = l3.d.a(view, R.id.vg_matches_card_item_matches_4);
                            if (viewA5 != null) {
                                wu wuVarA5 = wu.a(viewA5);
                                i10 = R.id.vg_matches_card_layout_all;
                                View viewA6 = l3.d.a(view, R.id.vg_matches_card_layout_all);
                                if (viewA6 != null) {
                                    h20 h20VarA = h20.a(viewA6);
                                    i10 = R.id.vg_matches_card_layout_all_bottom;
                                    View viewA7 = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
                                    if (viewA7 != null) {
                                        i20 i20VarA = i20.a(viewA7);
                                        i10 = R.id.vg_matches_card_no_data;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_matches_card_no_data);
                                        if (relativeLayout != null) {
                                            return new fh0((CardView) view, textView, wuVarA, wuVarA2, wuVarA3, wuVarA4, wuVarA5, h20VarA, i20VarA, relativeLayout);
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
    public static fh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21844, new Class[]{LayoutInflater.class}, fh0.class);
        return patchProxyResultProxy.isSupported ? (fh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21845, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110583a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21847, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
