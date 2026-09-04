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

/* JADX INFO: compiled from: ViewOwAchievementsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f115244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f115245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115246f;

    private rg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f115241a = cardView;
        this.f115242b = textView;
        this.f115243c = linearLayout;
        this.f115244d = quVar;
        this.f115245e = i20Var;
        this.f115246f = relativeLayout;
    }

    @androidx.annotation.n0
    public static rg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21790, new Class[]{View.class}, rg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_achievement;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_achievement);
            if (linearLayout != null) {
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
                            return new rg0((CardView) view, textView, linearLayout, quVarA, i20VarA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21788, new Class[]{LayoutInflater.class}, rg0.class);
        return patchProxyResultProxy.isSupported ? (rg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21789, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ow_achievements_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115241a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21791, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
