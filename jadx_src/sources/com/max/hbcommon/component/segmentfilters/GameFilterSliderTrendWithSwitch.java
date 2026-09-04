package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.bean.segmentfilter.FilterRangeObj;
import com.max.hbcustomview.seekbar.HbRangeTrendView;
import com.max.hbcustomview.seekbar.RangeSeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameFilterSliderTrendWithSwitch.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nGameFilterSliderTrendWithSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameFilterSliderTrendWithSwitch.kt\ncom/max/hbcommon/component/segmentfilters/GameFilterSliderTrendWithSwitch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n*S KotlinDebug\n*F\n+ 1 GameFilterSliderTrendWithSwitch.kt\ncom/max/hbcommon/component/segmentfilters/GameFilterSliderTrendWithSwitch\n*L\n114#1:147,2\n*E\n"})
public final class GameFilterSliderTrendWithSwitch extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RangeSeekBar f67826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HbRangeTrendView f67827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioGroup f67828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FilterGroup f67829e;

    /* JADX INFO: compiled from: GameFilterSliderTrendWithSwitch.kt */
    public static final class a implements com.max.hbcustomview.seekbar.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void a(@dl.d RangeSeekBar rangeSeekBar, float f10, float f11, boolean z10) {
            Object[] objArr = {rangeSeekBar, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.P1, new Class[]{RangeSeekBar.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(rangeSeekBar, "rangeSeekBar");
            GameFilterSliderTrendWithSwitch.this.getTrendView().setRange(f10, f11);
            FilterRangeObj filterRangeObj = new FilterRangeObj();
            int i10 = (int) f10;
            filterRangeObj.setStart(GameFilterSliderTrendWithSwitch.this.getMData().getFilters().get(i10));
            int i11 = (int) f11;
            filterRangeObj.setEnd(GameFilterSliderTrendWithSwitch.this.getMData().getFilters().get(i11));
            GameFilterSliderTrendWithSwitch.this.getMData().setCustom_range(filterRangeObj);
            if (z10) {
                if (i10 == 0 && i11 == GameFilterSliderTrendWithSwitch.this.getMData().getFilters().size() - 1) {
                    return;
                }
                View childAt = GameFilterSliderTrendWithSwitch.this.getRg_playState().getChildAt(1);
                f0.n(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
                ((RadioButton) childAt).setChecked(true);
            }
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void b(@dl.e RangeSeekBar rangeSeekBar, boolean z10) {
        }

        @Override // com.max.hbcustomview.seekbar.f
        public void c(@dl.e RangeSeekBar rangeSeekBar, boolean z10) {
        }
    }

    public GameFilterSliderTrendWithSwitch(@dl.e Context context) {
        this(context, null);
    }

    public GameFilterSliderTrendWithSwitch(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameFilterSliderTrendWithSwitch(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameFilterSliderTrendWithSwitch(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.L1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_game_filter_slider_trend_with_switch, this);
        View viewFindViewById = findViewById(R.id.rsb);
        f0.o(viewFindViewById, "findViewById(...)");
        setSeekBar((RangeSeekBar) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.trend_view);
        f0.o(viewFindViewById2, "findViewById(...)");
        setTrendView((HbRangeTrendView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.rg_playState);
        f0.o(viewFindViewById3, "findViewById(...)");
        setRg_playState((RadioGroup) viewFindViewById3);
        getSeekBar().setOnRangeChangedListener(new a());
        getRg_playState().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.max.hbcommon.component.segmentfilters.b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                GameFilterSliderTrendWithSwitch.d(this.f67891a, radioGroup, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(GameFilterSliderTrendWithSwitch this$0, RadioGroup radioGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, radioGroup, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.N1, new Class[]{GameFilterSliderTrendWithSwitch.class, RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (i10 == R.id.rb_0) {
            this$0.getMData().setCustom_switch_key("all");
            this$0.getSeekBar().setEnabled(true);
            this$0.getSeekBar().setLeftEnable(true);
            this$0.getSeekBar().setRange(0.0f, this$0.getMData().getFilters().size() - 1, 1.0f);
            this$0.getMData().setCustom_range(null);
            this$0.getSeekBar().setProgress(0.0f, this$0.getMData().getFilters().size() - 1);
            return;
        }
        if (i10 != R.id.rb_1) {
            this$0.getMData().setCustom_switch_key("0");
            this$0.getSeekBar().setEnabled(false);
            this$0.getSeekBar().setLeftEnable(false);
            this$0.getSeekBar().setRange(0.0f, this$0.getMData().getFilters().size() - 1, 0.0f);
            this$0.getSeekBar().setProgress(0.0f, 0.0f);
            this$0.getMData().setCustom_range(null);
            return;
        }
        this$0.getMData().setCustom_switch_key("1");
        this$0.getSeekBar().setEnabled(true);
        this$0.getSeekBar().setLeftEnable(true);
        this$0.getSeekBar().setRange(0.0f, this$0.getMData().getFilters().size() - 1, 1.0f);
        if (this$0.getMData().getCustom_range() != null) {
            this$0.getSeekBar().setProgress(this$0.getMData().getFilters().indexOf(this$0.getMData().getCustom_range().getStart()), this$0.getMData().getFilters().indexOf(this$0.getMData().getCustom_range().getEnd()));
        } else {
            this$0.getSeekBar().setProgress(0.0f, this$0.getMData().getFilters().size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(GameFilterSliderTrendWithSwitch this$0, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.O1, new Class[]{GameFilterSliderTrendWithSwitch.class, Float.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(this$0, "this$0");
        return this$0.getMData().getFilters().get((int) f10).getDesc();
    }

    @dl.d
    public final FilterGroup getMData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.J1, new Class[0], FilterGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (FilterGroup) patchProxyResultProxy.result;
        }
        FilterGroup filterGroup = this.f67829e;
        if (filterGroup != null) {
            return filterGroup;
        }
        f0.S("mData");
        return null;
    }

    @dl.d
    public final RadioGroup getRg_playState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.H1, new Class[0], RadioGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (RadioGroup) patchProxyResultProxy.result;
        }
        RadioGroup radioGroup = this.f67828d;
        if (radioGroup != null) {
            return radioGroup;
        }
        f0.S("rg_playState");
        return null;
    }

    @dl.d
    public final RangeSeekBar getSeekBar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.D1, new Class[0], RangeSeekBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (RangeSeekBar) patchProxyResultProxy.result;
        }
        RangeSeekBar rangeSeekBar = this.f67826b;
        if (rangeSeekBar != null) {
            return rangeSeekBar;
        }
        f0.S("seekBar");
        return null;
    }

    @dl.d
    public final HbRangeTrendView getTrendView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.F1, new Class[0], HbRangeTrendView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HbRangeTrendView) patchProxyResultProxy.result;
        }
        HbRangeTrendView hbRangeTrendView = this.f67827c;
        if (hbRangeTrendView != null) {
            return hbRangeTrendView;
        }
        f0.S("trendView");
        return null;
    }

    public final void setData(@dl.d FilterGroup data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, bb.c.e.M1, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        setMData(data);
        ArrayList<Float> arrayList = new ArrayList<>();
        List<FilterItem> filters = getMData().getFilters();
        f0.o(filters, "getFilters(...)");
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(com.max.hbutils.utils.n.p(((FilterItem) it.next()).getUp_count())));
        }
        getTrendView().setData(arrayList);
        getSeekBar().setRange(0.0f, getMData().getFilters().size() - 1, 1.0f);
        getSeekBar().setSteps(getMData().getFilters().size() - 1);
        getSeekBar().setTextGenerator(new RangeSeekBar.c() { // from class: com.max.hbcommon.component.segmentfilters.a
            @Override // com.max.hbcustomview.seekbar.RangeSeekBar.c
            public final String a(float f10) {
                return GameFilterSliderTrendWithSwitch.e(this.f67890a, f10);
            }
        });
        if (com.max.hbcommon.utils.c.x(getMData().getIs_released())) {
            getRg_playState().setVisibility(8);
        } else {
            getRg_playState().setVisibility(0);
        }
        if (getMData().getCustom_switch_key() == null) {
            getRg_playState().check(R.id.rb_0);
            return;
        }
        String custom_switch_key = getMData().getCustom_switch_key();
        if (custom_switch_key != null) {
            int iHashCode = custom_switch_key.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 96673 && custom_switch_key.equals("all")) {
                        getRg_playState().check(R.id.rb_0);
                    }
                } else if (custom_switch_key.equals("1")) {
                    getRg_playState().check(R.id.rb_1);
                }
            } else if (custom_switch_key.equals("0")) {
                getRg_playState().check(R.id.rb_2);
            }
        }
        if ((getRg_playState().getCheckedRadioButtonId() == R.id.rb_0 || getRg_playState().getCheckedRadioButtonId() == R.id.rb_1) && getMData().getCustom_range() != null) {
            float fIndexOf = getMData().getFilters().indexOf(getMData().getCustom_range().getStart());
            float fIndexOf2 = getMData().getFilters().indexOf(getMData().getCustom_range().getEnd());
            getSeekBar().setProgress(fIndexOf, fIndexOf2);
            getTrendView().setRange(fIndexOf, fIndexOf2);
        }
    }

    public final void setMData(@dl.d FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.K1, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterGroup, "<set-?>");
        this.f67829e = filterGroup;
    }

    public final void setRg_playState(@dl.d RadioGroup radioGroup) {
        if (PatchProxy.proxy(new Object[]{radioGroup}, this, changeQuickRedirect, false, bb.c.e.I1, new Class[]{RadioGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(radioGroup, "<set-?>");
        this.f67828d = radioGroup;
    }

    public final void setSeekBar(@dl.d RangeSeekBar rangeSeekBar) {
        if (PatchProxy.proxy(new Object[]{rangeSeekBar}, this, changeQuickRedirect, false, bb.c.e.E1, new Class[]{RangeSeekBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rangeSeekBar, "<set-?>");
        this.f67826b = rangeSeekBar;
    }

    public final void setTrendView(@dl.d HbRangeTrendView hbRangeTrendView) {
        if (PatchProxy.proxy(new Object[]{hbRangeTrendView}, this, changeQuickRedirect, false, bb.c.e.G1, new Class[]{HbRangeTrendView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hbRangeTrendView, "<set-?>");
        this.f67827c = hbRangeTrendView;
    }
}
