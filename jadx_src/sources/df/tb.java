package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentTradeDiscoverySecondaryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f115933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f115934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterSelected f115935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f115942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f115943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115951t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final qc f115952u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115954w;

    private tb(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 SegmentFilterSelected segmentFilterSelected, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 qc qcVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f115932a = linearLayout;
        this.f115933b = consecutiveScrollerLayout;
        this.f115934c = filterButtonView;
        this.f115935d = segmentFilterSelected;
        this.f115936e = imageView;
        this.f115937f = view;
        this.f115938g = imageView2;
        this.f115939h = imageView3;
        this.f115940i = recyclerView;
        this.f115941j = recyclerView2;
        this.f115942k = smartRefreshLayout;
        this.f115943l = commonTabLayout;
        this.f115944m = textView;
        this.f115945n = textView2;
        this.f115946o = textView3;
        this.f115947p = textView4;
        this.f115948q = textView5;
        this.f115949r = textView6;
        this.f115950s = view2;
        this.f115951t = view3;
        this.f115952u = qcVar;
        this.f115953v = linearLayout2;
        this.f115954w = linearLayout3;
    }

    @androidx.annotation.n0
    public static tb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17564, new Class[]{View.class}, tb.class);
        if (patchProxyResultProxy.isSupported) {
            return (tb) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.fbv_sort;
            FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
            if (filterButtonView != null) {
                i10 = R.id.filter_selected;
                SegmentFilterSelected segmentFilterSelected = (SegmentFilterSelected) l3.d.a(view, R.id.filter_selected);
                if (segmentFilterSelected != null) {
                    i10 = R.id.iv_filter;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_filter);
                    if (imageView != null) {
                        i10 = R.id.iv_filter_mask;
                        View viewA = l3.d.a(view, R.id.iv_filter_mask);
                        if (viewA != null) {
                            i10 = R.id.iv_format;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_format);
                            if (imageView2 != null) {
                                i10 = R.id.iv_refreshing;
                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_refreshing);
                                if (imageView3 != null) {
                                    i10 = R.id.rv;
                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                    if (recyclerView != null) {
                                        i10 = R.id.rv_shortcut;
                                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_shortcut);
                                        if (recyclerView2 != null) {
                                            i10 = R.id.srl;
                                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                            if (smartRefreshLayout != null) {
                                                i10 = R.id.tab_title;
                                                CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.tab_title);
                                                if (commonTabLayout != null) {
                                                    i10 = R.id.tv_count_desc;
                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_count_desc);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_item_count;
                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_count);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_refreshing;
                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_refreshing);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tv_title_symbol;
                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title_symbol);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.tv_title_tips;
                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title_tips);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.tv_value;
                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_value);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.v_divider_1;
                                                                            View viewA2 = l3.d.a(view, R.id.v_divider_1);
                                                                            if (viewA2 != null) {
                                                                                i10 = R.id.v_divider_2;
                                                                                View viewA3 = l3.d.a(view, R.id.v_divider_2);
                                                                                if (viewA3 != null) {
                                                                                    i10 = R.id.vg_invntory_empty;
                                                                                    View viewA4 = l3.d.a(view, R.id.vg_invntory_empty);
                                                                                    if (viewA4 != null) {
                                                                                        qc qcVarA = qc.a(viewA4);
                                                                                        i10 = R.id.vg_refreshing;
                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_refreshing);
                                                                                        if (linearLayout != null) {
                                                                                            i10 = R.id.vg_shortcuts;
                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_shortcuts);
                                                                                            if (linearLayout2 != null) {
                                                                                                return new tb((LinearLayout) view, consecutiveScrollerLayout, filterButtonView, segmentFilterSelected, imageView, viewA, imageView2, imageView3, recyclerView, recyclerView2, smartRefreshLayout, commonTabLayout, textView, textView2, textView3, textView4, textView5, textView6, viewA2, viewA3, qcVarA, linearLayout, linearLayout2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static tb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17562, new Class[]{LayoutInflater.class}, tb.class);
        return patchProxyResultProxy.isSupported ? (tb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17563, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tb.class);
        if (patchProxyResultProxy.isSupported) {
            return (tb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_trade_discovery_secondary, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115932a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17565, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
