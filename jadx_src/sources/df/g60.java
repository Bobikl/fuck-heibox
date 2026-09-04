package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.chart.CustomBarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameDistributionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CustomBarChart f110843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final b70 f110845d;

    private g60(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CustomBarChart customBarChart, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 b70 b70Var) {
        this.f110842a = cardView;
        this.f110843b = customBarChart;
        this.f110844c = cardView2;
        this.f110845d = b70Var;
    }

    @androidx.annotation.n0
    public static g60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20720, new Class[]{View.class}, g60.class);
        if (patchProxyResultProxy.isSupported) {
            return (g60) patchProxyResultProxy.result;
        }
        int i10 = R.id.bc_chart;
        CustomBarChart customBarChart = (CustomBarChart) l3.d.a(view, R.id.bc_chart);
        if (customBarChart != null) {
            CardView cardView = (CardView) view;
            View viewA = l3.d.a(view, R.id.vg_header_binary_switch);
            if (viewA != null) {
                return new g60(cardView, customBarChart, cardView, b70.a(viewA));
            }
            i10 = R.id.vg_header_binary_switch;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20718, new Class[]{LayoutInflater.class}, g60.class);
        return patchProxyResultProxy.isSupported ? (g60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20719, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g60.class);
        if (patchProxyResultProxy.isSupported) {
            return (g60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_distribution, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110842a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20721, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
