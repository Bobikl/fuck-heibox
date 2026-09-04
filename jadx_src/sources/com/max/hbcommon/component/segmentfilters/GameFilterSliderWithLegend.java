package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.bean.segmentfilter.FilterRangeObj;
import com.max.hbcommon.bean.segmentfilter.SliderFilterSwitchOptionObj;
import com.max.hbcustomview.seekbar.HbRangeTrendView;
import com.max.hbcustomview.seekbar.RangeSeekBar;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameFilterSliderWithLegend.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nGameFilterSliderWithLegend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameFilterSliderWithLegend.kt\ncom/max/hbcommon/component/segmentfilters/GameFilterSliderWithLegend\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,184:1\n1855#2,2:185\n1855#2,2:187\n1855#2,2:190\n342#3:189\n*S KotlinDebug\n*F\n+ 1 GameFilterSliderWithLegend.kt\ncom/max/hbcommon/component/segmentfilters/GameFilterSliderWithLegend\n*L\n96#1:185,2\n105#1:187,2\n148#1:190,2\n117#1:189\n*E\n"})
public final class GameFilterSliderWithLegend extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RangeSeekBar f67831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HbRangeTrendView f67832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HbRangeTrendView f67833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f67834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FilterGroup f67835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f67837h;

    /* JADX INFO: compiled from: GameFilterSliderWithLegend.kt */
    public static final class a implements com.max.hbcustomview.seekbar.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void a(@dl.d RangeSeekBar rangeSeekBar, float f10, float f11, boolean z10) {
            Object[] objArr = {rangeSeekBar, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.f31746d2, new Class[]{RangeSeekBar.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(rangeSeekBar, "rangeSeekBar");
            GameFilterSliderWithLegend.this.getTrendView().setRange(f10, f11);
            GameFilterSliderWithLegend.this.getTrendViewDown().setRange(f10, f11);
            if (GameFilterSliderWithLegend.this.f67835f != null) {
                FilterRangeObj filterRangeObj = new FilterRangeObj();
                filterRangeObj.setStart(GameFilterSliderWithLegend.this.getMData().getFilters().get((int) f10));
                filterRangeObj.setEnd(GameFilterSliderWithLegend.this.getMData().getFilters().get((int) f11));
                GameFilterSliderWithLegend.this.getMData().setCustom_range(filterRangeObj);
            }
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void b(@dl.e RangeSeekBar rangeSeekBar, boolean z10) {
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void c(@dl.e RangeSeekBar rangeSeekBar, boolean z10) {
        }
    }

    public GameFilterSliderWithLegend(@dl.e Context context) {
        this(context, null);
    }

    public GameFilterSliderWithLegend(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameFilterSliderWithLegend(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameFilterSliderWithLegend(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67837h = 48.0f;
        b();
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31695a2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_game_filter_slider_with_legend, this);
        View viewFindViewById = findViewById(R.id.rsb);
        f0.o(viewFindViewById, "findViewById(...)");
        setSeekBar((RangeSeekBar) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.trend_view);
        f0.o(viewFindViewById2, "findViewById(...)");
        setTrendView((HbRangeTrendView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.trend_view_down);
        f0.o(viewFindViewById3, "findViewById(...)");
        setTrendViewDown((HbRangeTrendView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.vg_legend);
        f0.o(viewFindViewById4, "findViewById(...)");
        setVg_legend((LinearLayout) viewFindViewById4);
        getTrendViewDown().setOrientationDown(true);
        getSeekBar().setOnRangeChangedListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(GameFilterSliderWithLegend this$0, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31729c2, new Class[]{GameFilterSliderWithLegend.class, Float.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(this$0, "this$0");
        return this$0.getMData().getFilters().get((int) f10).getDesc();
    }

    @dl.d
    public final FilterGroup getMData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y1, new Class[0], FilterGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (FilterGroup) patchProxyResultProxy.result;
        }
        FilterGroup filterGroup = this.f67835f;
        if (filterGroup != null) {
            return filterGroup;
        }
        f0.S("mData");
        return null;
    }

    public final boolean getProportional() {
        return this.f67836g;
    }

    @dl.d
    public final RangeSeekBar getSeekBar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Q1, new Class[0], RangeSeekBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (RangeSeekBar) patchProxyResultProxy.result;
        }
        RangeSeekBar rangeSeekBar = this.f67831b;
        if (rangeSeekBar != null) {
            return rangeSeekBar;
        }
        f0.S("seekBar");
        return null;
    }

    public final float getTotalHeightDp() {
        return this.f67837h;
    }

    @dl.d
    public final HbRangeTrendView getTrendView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.S1, new Class[0], HbRangeTrendView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HbRangeTrendView) patchProxyResultProxy.result;
        }
        HbRangeTrendView hbRangeTrendView = this.f67832c;
        if (hbRangeTrendView != null) {
            return hbRangeTrendView;
        }
        f0.S("trendView");
        return null;
    }

    @dl.d
    public final HbRangeTrendView getTrendViewDown() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.U1, new Class[0], HbRangeTrendView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HbRangeTrendView) patchProxyResultProxy.result;
        }
        HbRangeTrendView hbRangeTrendView = this.f67833d;
        if (hbRangeTrendView != null) {
            return hbRangeTrendView;
        }
        f0.S("trendViewDown");
        return null;
    }

    @dl.d
    public final LinearLayout getVg_legend() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.W1, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f67834e;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_legend");
        return null;
    }

    public final void setData(@dl.d FilterGroup data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, bb.c.e.f31712b2, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.w(data.getFilters())) {
            return;
        }
        setMData(data);
        ArrayList<Float> arrayList = new ArrayList<>();
        List<FilterItem> filters = getMData().getFilters();
        f0.o(filters, "getFilters(...)");
        Iterator<T> it = filters.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            float fP = com.max.hbutils.utils.n.p(((FilterItem) it.next()).getUp_count());
            arrayList.add(Float.valueOf(fP));
            fMax = Math.max(fMax, fP);
        }
        getTrendView().setData(arrayList);
        ArrayList<Float> arrayList2 = new ArrayList<>();
        List<FilterItem> filters2 = getMData().getFilters();
        f0.o(filters2, "getFilters(...)");
        Iterator<T> it2 = filters2.iterator();
        float fMax2 = 0.0f;
        while (it2.hasNext()) {
            float fP2 = com.max.hbutils.utils.n.p(((FilterItem) it2.next()).getDown_count());
            arrayList2.add(Float.valueOf(fP2));
            fMax2 = Math.max(fMax2, fP2);
        }
        getTrendViewDown().setData(arrayList2);
        if (this.f67836g) {
            int iF = ViewUtils.f(getContext(), this.f67837h);
            getTrendView().getLayoutParams().height = (int) ((iF * fMax) / (fMax + fMax2));
            ViewGroup.LayoutParams layoutParams = getTrendViewDown().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iF - getTrendView().getLayoutParams().height;
            ViewGroup.LayoutParams layoutParams3 = getTrendView().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + getTrendView().getLayoutParams().height;
            getTrendViewDown().setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams4 = getVg_legend().getLayoutParams();
            f0.n(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams4)).topMargin += iF - ViewUtils.f(getContext(), 48.0f);
            getSeekBar().getLeftSeekBar().Z(getTrendView().getLayoutParams().height - ViewUtils.f(getContext(), 12.0f));
            getSeekBar().getRightSeekBar().Z(getTrendView().getLayoutParams().height - ViewUtils.f(getContext(), 12.0f));
            getSeekBar().getLayoutParams().height += getTrendView().getLayoutParams().height - ViewUtils.f(getContext(), 24.0f);
        }
        getTrendView().setRangeColor(com.max.hbcommon.utils.l.g(getMData().getLegend().get(0).getColor()));
        getTrendViewDown().setRangeColor(com.max.hbcommon.utils.l.g(getMData().getLegend().get(1).getColor()));
        getSeekBar().setRange(0.0f, getMData().getFilters().size() - 1, 1.0f);
        getSeekBar().setSteps(getMData().getFilters().size() - 1);
        getSeekBar().setTextGenerator(new RangeSeekBar.c() { // from class: com.max.hbcommon.component.segmentfilters.c
            @Override // com.max.hbcustomview.seekbar.RangeSeekBar.c
            public final String a(float f10) {
                return GameFilterSliderWithLegend.c(this.f67892a, f10);
            }
        });
        if (getMData().getCustom_range() == null) {
            getSeekBar().setProgress(0.0f, getMData().getFilters().size() - 1);
            getTrendView().setRange(0.0f, getMData().getFilters().size() - 1);
            getTrendViewDown().setRange(0.0f, getMData().getFilters().size() - 1);
        } else {
            float fIndexOf = getMData().getFilters().indexOf(getMData().getCustom_range().getStart());
            float fIndexOf2 = getMData().getFilters().indexOf(getMData().getCustom_range().getEnd());
            getSeekBar().setProgress(fIndexOf, fIndexOf2);
            getTrendView().setRange(fIndexOf, fIndexOf2);
            getTrendViewDown().setRange(fIndexOf, fIndexOf2);
        }
        getVg_legend().removeAllViews();
        List<SliderFilterSwitchOptionObj> legend = getMData().getLegend();
        f0.o(legend, "getLegend(...)");
        for (SliderFilterSwitchOptionObj sliderFilterSwitchOptionObj : legend) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 10.0f));
            layoutParams5.rightMargin = ViewUtils.f(getContext(), 4.0f);
            layoutParams5.leftMargin = ViewUtils.f(getContext(), 12.0f);
            imageView.setImageDrawable(com.max.hbutils.utils.q.v(getContext(), com.max.hbcommon.utils.l.g(sliderFilterSwitchOptionObj.getColor()), 1.0f));
            imageView.setAlpha(0.3f);
            getVg_legend().addView(imageView, layoutParams5);
            TextView textView = new TextView(getContext());
            textView.setIncludeFontPadding(false);
            textView.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            textView.setTextSize(1, 10.0f);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            textView.setText(sliderFilterSwitchOptionObj.getDesc());
            getVg_legend().addView(textView, layoutParams6);
        }
    }

    public final void setMData(@dl.d FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.Z1, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterGroup, "<set-?>");
        this.f67835f = filterGroup;
    }

    public final void setProportional(boolean z10) {
        this.f67836g = z10;
    }

    public final void setSeekBar(@dl.d RangeSeekBar rangeSeekBar) {
        if (PatchProxy.proxy(new Object[]{rangeSeekBar}, this, changeQuickRedirect, false, bb.c.e.R1, new Class[]{RangeSeekBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rangeSeekBar, "<set-?>");
        this.f67831b = rangeSeekBar;
    }

    public final void setTotalHeightDp(float f10) {
        this.f67837h = f10;
    }

    public final void setTrendView(@dl.d HbRangeTrendView hbRangeTrendView) {
        if (PatchProxy.proxy(new Object[]{hbRangeTrendView}, this, changeQuickRedirect, false, bb.c.e.T1, new Class[]{HbRangeTrendView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hbRangeTrendView, "<set-?>");
        this.f67832c = hbRangeTrendView;
    }

    public final void setTrendViewDown(@dl.d HbRangeTrendView hbRangeTrendView) {
        if (PatchProxy.proxy(new Object[]{hbRangeTrendView}, this, changeQuickRedirect, false, bb.c.e.V1, new Class[]{HbRangeTrendView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hbRangeTrendView, "<set-?>");
        this.f67833d = hbRangeTrendView;
    }

    public final void setVg_legend(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, bb.c.e.X1, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f67834e = linearLayout;
    }
}
