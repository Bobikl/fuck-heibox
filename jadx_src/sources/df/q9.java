package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.indicator.LinePageIndicator;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentItemInventoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final qc A;

    @androidx.annotation.n0
    public final FrameLayout B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final RelativeLayout D;

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final ViewPager H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f114776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f114777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f114778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f114779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterSelected f114780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final Switch f114787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinePageIndicator f114788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f114790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f114793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114801z;

    private q9(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 SegmentFilterSelected segmentFilterSelected, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 Switch r14, @androidx.annotation.n0 LinePageIndicator linePageIndicator, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 qc qcVar, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 ViewPager viewPager) {
        this.f114776a = frameLayout;
        this.f114777b = consecutiveScrollerLayout;
        this.f114778c = editText;
        this.f114779d = filterButtonView;
        this.f114780e = segmentFilterSelected;
        this.f114781f = imageView;
        this.f114782g = imageView2;
        this.f114783h = view;
        this.f114784i = imageView3;
        this.f114785j = imageView4;
        this.f114786k = recyclerView;
        this.f114787l = r14;
        this.f114788m = linePageIndicator;
        this.f114789n = smartRefreshLayout;
        this.f114790o = commonTabLayout;
        this.f114791p = textView;
        this.f114792q = textView2;
        this.f114793r = marqueeTextView;
        this.f114794s = textView3;
        this.f114795t = textView4;
        this.f114796u = textView5;
        this.f114797v = textView6;
        this.f114798w = textView7;
        this.f114799x = view2;
        this.f114800y = view3;
        this.f114801z = linearLayout;
        this.A = qcVar;
        this.B = frameLayout2;
        this.C = linearLayout2;
        this.D = relativeLayout;
        this.E = frameLayout3;
        this.F = linearLayout3;
        this.G = linearLayout4;
        this.H = viewPager;
    }

    @androidx.annotation.n0
    public static q9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17344, new Class[]{View.class}, q9.class);
        if (patchProxyResultProxy.isSupported) {
            return (q9) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.et_item_search;
            EditText editText = (EditText) l3.d.a(view, R.id.et_item_search);
            if (editText != null) {
                i10 = R.id.fbv_sort;
                FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
                if (filterButtonView != null) {
                    i10 = R.id.filter_selected;
                    SegmentFilterSelected segmentFilterSelected = (SegmentFilterSelected) l3.d.a(view, R.id.filter_selected);
                    if (segmentFilterSelected != null) {
                        i10 = R.id.iv_del;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
                        if (imageView != null) {
                            i10 = R.id.iv_filter;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_filter);
                            if (imageView2 != null) {
                                i10 = R.id.iv_filter_mask;
                                View viewA = l3.d.a(view, R.id.iv_filter_mask);
                                if (viewA != null) {
                                    i10 = R.id.iv_format;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_format);
                                    if (imageView3 != null) {
                                        i10 = R.id.iv_refreshing;
                                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_refreshing);
                                        if (imageView4 != null) {
                                            i10 = R.id.rv;
                                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                            if (recyclerView != null) {
                                                i10 = R.id.sb_sale;
                                                Switch r15 = (Switch) l3.d.a(view, R.id.sb_sale);
                                                if (r15 != null) {
                                                    i10 = R.id.shortcut_indicatior;
                                                    LinePageIndicator linePageIndicator = (LinePageIndicator) l3.d.a(view, R.id.shortcut_indicatior);
                                                    if (linePageIndicator != null) {
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
                                                                        i10 = R.id.tv_message;
                                                                        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                                                                        if (marqueeTextView != null) {
                                                                            i10 = R.id.tv_refreshing;
                                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_refreshing);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_sale_setting;
                                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sale_setting);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.tv_title_symbol;
                                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title_symbol);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.tv_title_tips;
                                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title_tips);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.tv_value;
                                                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_value);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.v_divider_1;
                                                                                                View viewA2 = l3.d.a(view, R.id.v_divider_1);
                                                                                                if (viewA2 != null) {
                                                                                                    i10 = R.id.v_divider_2;
                                                                                                    View viewA3 = l3.d.a(view, R.id.v_divider_2);
                                                                                                    if (viewA3 != null) {
                                                                                                        i10 = R.id.vg_banner;
                                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_banner);
                                                                                                        if (linearLayout != null) {
                                                                                                            i10 = R.id.vg_invntory_empty;
                                                                                                            View viewA4 = l3.d.a(view, R.id.vg_invntory_empty);
                                                                                                            if (viewA4 != null) {
                                                                                                                qc qcVarA = qc.a(viewA4);
                                                                                                                i10 = R.id.vg_message;
                                                                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_message);
                                                                                                                if (frameLayout != null) {
                                                                                                                    i10 = R.id.vg_refreshing;
                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_refreshing);
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        i10 = R.id.vg_search;
                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search);
                                                                                                                        if (relativeLayout != null) {
                                                                                                                            i10 = R.id.vg_search_scan;
                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_search_scan);
                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                i10 = R.id.vg_search_switch;
                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_search_switch);
                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                    i10 = R.id.vg_shortcuts;
                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_shortcuts);
                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                        i10 = R.id.vp_shortcut;
                                                                                                                                        ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp_shortcut);
                                                                                                                                        if (viewPager != null) {
                                                                                                                                            return new q9((FrameLayout) view, consecutiveScrollerLayout, editText, filterButtonView, segmentFilterSelected, imageView, imageView2, viewA, imageView3, imageView4, recyclerView, r15, linePageIndicator, smartRefreshLayout, commonTabLayout, textView, textView2, marqueeTextView, textView3, textView4, textView5, textView6, textView7, viewA2, viewA3, linearLayout, qcVarA, frameLayout, linearLayout2, relativeLayout, frameLayout2, linearLayout3, linearLayout4, viewPager);
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
    public static q9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17342, new Class[]{LayoutInflater.class}, q9.class);
        return patchProxyResultProxy.isSupported ? (q9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17343, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q9.class);
        if (patchProxyResultProxy.isSupported) {
            return (q9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_item_inventory, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f114776a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17345, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
