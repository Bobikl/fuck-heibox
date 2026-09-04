package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcRecentMatchesCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ge0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f110956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110963j;

    private ge0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110954a = cardView;
        this.f110955b = imageView;
        this.f110956c = lineChart;
        this.f110957d = linearLayout;
        this.f110958e = recyclerView;
        this.f110959f = textView;
        this.f110960g = textView2;
        this.f110961h = textView3;
        this.f110962i = textView4;
        this.f110963j = relativeLayout;
    }

    @androidx.annotation.n0
    public static ge0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21544, new Class[]{View.class}, ge0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_layout_all_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_layout_all_icon);
        if (imageView != null) {
            i10 = R.id.line_chart_trend;
            LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
            if (lineChart != null) {
                i10 = R.id.ll_layout_all_action;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_layout_all_action);
                if (linearLayout != null) {
                    i10 = R.id.rv_matches;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_matches);
                    if (recyclerView != null) {
                        i10 = R.id.tv_layout_all_action_text;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_layout_all_action_text);
                        if (textView != null) {
                            i10 = R.id.tv_layout_all_subtitle;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_layout_all_subtitle);
                            if (textView2 != null) {
                                i10 = R.id.tv_layout_all_title;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_layout_all_title);
                                if (textView3 != null) {
                                    i10 = R.id.tv_trend_chart_expand;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_trend_chart_expand);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_line_chart_container;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_line_chart_container);
                                        if (relativeLayout != null) {
                                            return new ge0((CardView) view, imageView, lineChart, linearLayout, recyclerView, textView, textView2, textView3, textView4, relativeLayout);
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
    public static ge0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21542, new Class[]{LayoutInflater.class}, ge0.class);
        return patchProxyResultProxy.isSupported ? (ge0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ge0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21543, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ge0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_recent_matches_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110954a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21545, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
