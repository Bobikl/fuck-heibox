package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcustomview.tickerview.TickerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentGamePublishCalendarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final p60 f111688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f111689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f111693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f111694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TickerView f111696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final hk f111698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111703q;

    private i9(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 p60 p60Var, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TickerView tickerView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 hk hkVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f111687a = linearLayout;
        this.f111688b = p60Var;
        this.f111689c = filterButtonView;
        this.f111690d = imageView;
        this.f111691e = recyclerView;
        this.f111692f = recyclerView2;
        this.f111693g = smartRefreshLayout;
        this.f111694h = tabLayout;
        this.f111695i = textView;
        this.f111696j = tickerView;
        this.f111697k = textView2;
        this.f111698l = hkVar;
        this.f111699m = linearLayout2;
        this.f111700n = linearLayout3;
        this.f111701o = linearLayout4;
        this.f111702p = linearLayout5;
        this.f111703q = linearLayout6;
    }

    @androidx.annotation.n0
    public static i9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17312, new Class[]{View.class}, i9.class);
        if (patchProxyResultProxy.isSupported) {
            return (i9) patchProxyResultProxy.result;
        }
        int i10 = R.id.empty;
        View viewA = l3.d.a(view, R.id.empty);
        if (viewA != null) {
            p60 p60VarA = p60.a(viewA);
            i10 = R.id.fbv_filter;
            FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_filter);
            if (filterButtonView != null) {
                i10 = R.id.iv_calendar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_calendar);
                if (imageView != null) {
                    i10 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                    if (recyclerView != null) {
                        i10 = R.id.rv_single;
                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_single);
                        if (recyclerView2 != null) {
                            i10 = R.id.srl;
                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                            if (smartRefreshLayout != null) {
                                i10 = R.id.tab;
                                TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
                                if (tabLayout != null) {
                                    i10 = R.id.tv_next_event_day;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_next_event_day);
                                    if (textView != null) {
                                        i10 = R.id.tv_next_event_time;
                                        TickerView tickerView = (TickerView) l3.d.a(view, R.id.tv_next_event_time);
                                        if (tickerView != null) {
                                            i10 = R.id.tv_next_event_title;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_next_event_title);
                                            if (textView2 != null) {
                                                i10 = R.id.vg_calendar;
                                                View viewA2 = l3.d.a(view, R.id.vg_calendar);
                                                if (viewA2 != null) {
                                                    hk hkVarA = hk.a(viewA2);
                                                    i10 = R.id.vg_next_event_count_down;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_next_event_count_down);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_next_event_count_down_content;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_next_event_count_down_content);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.vg_next_event_day;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_next_event_day);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.vg_select;
                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_select);
                                                                if (linearLayout4 != null) {
                                                                    i10 = R.id.vg_single_day;
                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_single_day);
                                                                    if (linearLayout5 != null) {
                                                                        return new i9((LinearLayout) view, p60VarA, filterButtonView, imageView, recyclerView, recyclerView2, smartRefreshLayout, tabLayout, textView, tickerView, textView2, hkVarA, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
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
    public static i9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17310, new Class[]{LayoutInflater.class}, i9.class);
        return patchProxyResultProxy.isSupported ? (i9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17311, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i9.class);
        if (patchProxyResultProxy.isSupported) {
            return (i9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_publish_calendar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111687a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17313, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
