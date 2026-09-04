package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewMatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f113061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f113062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113063f;

    private lg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113058a = cardView;
        this.f113059b = textView;
        this.f113060c = linearLayout;
        this.f113061d = h20Var;
        this.f113062e = i20Var;
        this.f113063f = relativeLayout;
    }

    @androidx.annotation.n0
    public static lg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21766, new Class[]{View.class}, lg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_match_list;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_match_list);
            if (linearLayout != null) {
                i10 = R.id.vg_matches_card_layout_all;
                View viewA = l3.d.a(view, R.id.vg_matches_card_layout_all);
                if (viewA != null) {
                    h20 h20VarA = h20.a(viewA);
                    i10 = R.id.vg_matches_card_layout_all_bottom;
                    View viewA2 = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
                    if (viewA2 != null) {
                        i20 i20VarA = i20.a(viewA2);
                        i10 = R.id.vg_matches_card_no_data;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_matches_card_no_data);
                        if (relativeLayout != null) {
                            return new lg0((CardView) view, textView, linearLayout, h20VarA, i20VarA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21764, new Class[]{LayoutInflater.class}, lg0.class);
        return patchProxyResultProxy.isSupported ? (lg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21765, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113058a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21767, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
