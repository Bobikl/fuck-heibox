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

/* JADX INFO: compiled from: ViewR6OperatorsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f111453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f111454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final yu f111456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final yu f111457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final yu f111458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final yu f111459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final yu f111460j;

    private hh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 yu yuVar, @androidx.annotation.n0 yu yuVar2, @androidx.annotation.n0 yu yuVar3, @androidx.annotation.n0 yu yuVar4, @androidx.annotation.n0 yu yuVar5) {
        this.f111451a = cardView;
        this.f111452b = textView;
        this.f111453c = quVar;
        this.f111454d = i20Var;
        this.f111455e = relativeLayout;
        this.f111456f = yuVar;
        this.f111457g = yuVar2;
        this.f111458h = yuVar3;
        this.f111459i = yuVar4;
        this.f111460j = yuVar5;
    }

    @androidx.annotation.n0
    public static hh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21854, new Class[]{View.class}, hh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_card_title;
            View viewA = l3.d.a(view, R.id.vg_card_title);
            if (viewA != null) {
                qu quVarA = qu.a(viewA);
                i10 = R.id.vg_matches_card_layout_all_bottom;
                View viewA2 = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
                if (viewA2 != null) {
                    i20 i20VarA = i20.a(viewA2);
                    i10 = R.id.vg_matches_card_no_data;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_matches_card_no_data);
                    if (relativeLayout != null) {
                        i10 = R.id.vg_operators_card_item_0;
                        View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_0);
                        if (viewA3 != null) {
                            yu yuVarA = yu.a(viewA3);
                            i10 = R.id.vg_operators_card_item_1;
                            View viewA4 = l3.d.a(view, R.id.vg_operators_card_item_1);
                            if (viewA4 != null) {
                                yu yuVarA2 = yu.a(viewA4);
                                i10 = R.id.vg_operators_card_item_2;
                                View viewA5 = l3.d.a(view, R.id.vg_operators_card_item_2);
                                if (viewA5 != null) {
                                    yu yuVarA3 = yu.a(viewA5);
                                    i10 = R.id.vg_operators_card_item_3;
                                    View viewA6 = l3.d.a(view, R.id.vg_operators_card_item_3);
                                    if (viewA6 != null) {
                                        yu yuVarA4 = yu.a(viewA6);
                                        i10 = R.id.vg_operators_card_item_4;
                                        View viewA7 = l3.d.a(view, R.id.vg_operators_card_item_4);
                                        if (viewA7 != null) {
                                            return new hh0((CardView) view, textView, quVarA, i20VarA, relativeLayout, yuVarA, yuVarA2, yuVarA3, yuVarA4, yu.a(viewA7));
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
    public static hh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21852, new Class[]{LayoutInflater.class}, hh0.class);
        return patchProxyResultProxy.isSupported ? (hh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21853, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_operators_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111451a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21855, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
