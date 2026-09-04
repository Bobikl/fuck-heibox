package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.bean.segmentfilter.FilterRangeObj;
import com.max.hbcustomview.seekbar.HbRangeTrendView;
import com.max.hbcustomview.seekbar.RangeSeekBar;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SecondaryWindowSegmentFilterView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f67839l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f67840m = 10.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f67841n = 24.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f67842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f67843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final q0 f67844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private PopupWindow f67845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.max.hbcommon.base.adapter.s<FilterGroup> f67846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private List<FilterGroup> f67847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private d f67848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private e f67849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private f f67850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f67851k;

    /* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
        public static final class C0546a implements com.max.hbcustomview.seekbar.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HbRangeTrendView f67852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilterGroup f67853b;

            C0546a(HbRangeTrendView hbRangeTrendView, FilterGroup filterGroup) {
                this.f67852a = hbRangeTrendView;
                this.f67853b = filterGroup;
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void a(@dl.d RangeSeekBar view, float f10, float f11, boolean z10) {
                Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.f31848j3, new Class[]{RangeSeekBar.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                this.f67852a.setRange(f10, f11);
                FilterRangeObj filterRangeObj = new FilterRangeObj();
                filterRangeObj.setStart(this.f67853b.getFilters().get((int) f10));
                filterRangeObj.setEnd(this.f67853b.getFilters().get((int) f11));
                this.f67853b.setCustom_range(filterRangeObj);
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void b(@dl.d RangeSeekBar view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f31865k3, new Class[]{RangeSeekBar.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void c(@dl.d RangeSeekBar view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f31882l3, new Class[]{RangeSeekBar.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
            }
        }

        /* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
        public static final class b implements com.max.hbcustomview.seekbar.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FilterGroup f67854a;

            b(FilterGroup filterGroup) {
                this.f67854a = filterGroup;
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void a(@dl.d RangeSeekBar view, float f10, float f11, boolean z10) {
                Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.f31899m3, new Class[]{RangeSeekBar.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                FilterRangeObj filterRangeObj = new FilterRangeObj();
                filterRangeObj.setStart(this.f67854a.getFilters().get((int) f10));
                filterRangeObj.setEnd(this.f67854a.getFilters().get((int) f11));
                this.f67854a.setCustom_range(filterRangeObj);
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void b(@dl.d RangeSeekBar view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f31916n3, new Class[]{RangeSeekBar.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
            }

            @Override // com.max.hbcustomview.seekbar.f
            public void c(@dl.d RangeSeekBar view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f31933o3, new Class[]{RangeSeekBar.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h(FilterGroup filtersObj, float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31815h3, new Class[]{FilterGroup.class, Float.TYPE}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(filtersObj, "$filtersObj");
            return filtersObj.getFilters().get((int) f10).getDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j(FilterGroup filtersObj, float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31832i3, new Class[]{FilterGroup.class, Float.TYPE}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(filtersObj, "$filtersObj");
            return filtersObj.getFilters().get((int) f10).getDesc();
        }

        @dl.e
        @xh.m
        public final FilterItem c(@dl.e FilterGroup filterGroup) {
            List<FilterItem> filters;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.S2, new Class[]{FilterGroup.class}, FilterItem.class);
            if (patchProxyResultProxy.isSupported) {
                return (FilterItem) patchProxyResultProxy.result;
            }
            if (filterGroup == null || (filters = filterGroup.getFilters()) == null) {
                return null;
            }
            for (FilterItem filterItem : filters) {
                if (filterItem.isCustom_checked()) {
                    return filterItem;
                }
            }
            return null;
        }

        @dl.e
        @xh.m
        public final FilterItem d(@dl.e FilterGroup filterGroup, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup, str}, this, changeQuickRedirect, false, bb.c.e.R2, new Class[]{FilterGroup.class, String.class}, FilterItem.class);
            if (patchProxyResultProxy.isSupported) {
                return (FilterItem) patchProxyResultProxy.result;
            }
            FilterItem filterItemC = c(filterGroup);
            if (filterItemC == null || !o(filterItemC.getShow_sort_type(), str)) {
                return null;
            }
            return filterItemC;
        }

        @dl.d
        @xh.m
        public final List<FilterItem> e(@dl.e List<FilterItem> list, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, bb.c.e.f31696a3, new Class[]{List.class, String.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (FilterItem filterItem : list) {
                    if (SecondaryWindowSegmentFilterView.f67839l.o(filterItem.getShow_sort_type(), str)) {
                        FilterItem filterItemDeepCopyByJson = filterItem.deepCopyByJson();
                        f0.o(filterItemDeepCopyByJson, "deepCopyByJson(...)");
                        arrayList.add(filterItemDeepCopyByJson);
                    }
                }
            }
            return arrayList;
        }

        @dl.d
        @xh.m
        public final List<FilterItem> f(@dl.e FilterGroup filterGroup) {
            List<FilterItem> filters;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.T2, new Class[]{FilterGroup.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            ArrayList arrayList = new ArrayList();
            if (filterGroup != null && (filters = filterGroup.getFilters()) != null) {
                for (FilterItem filterItem : filters) {
                    if (filterItem.isCustom_checked()) {
                        f0.m(filterItem);
                        arrayList.add(filterItem);
                    }
                }
            }
            return arrayList;
        }

        @dl.d
        @xh.m
        public final View g(@dl.d Context context, @dl.d final FilterGroup filtersObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, filtersObj}, this, changeQuickRedirect, false, bb.c.e.f31713b3, new Class[]{Context.class, FilterGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(filtersObj, "filtersObj");
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_game_filter_slider_with_trend, (ViewGroup) null, false);
            RangeSeekBar rangeSeekBar = (RangeSeekBar) viewInflate.findViewById(R.id.rsb);
            HbRangeTrendView hbRangeTrendView = (HbRangeTrendView) viewInflate.findViewById(R.id.trend_view);
            ArrayList<Float> arrayList = new ArrayList<>();
            Iterator<FilterItem> it = filtersObj.getFilters().iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(com.max.hbutils.utils.n.p(it.next().getUp_count())));
            }
            hbRangeTrendView.setData(arrayList);
            rangeSeekBar.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            rangeSeekBar.setRange(0.0f, filtersObj.getFilters().size() - 1, 1.0f);
            rangeSeekBar.setSteps(filtersObj.getFilters().size() - 1);
            rangeSeekBar.setLeftEnable(false);
            rangeSeekBar.setTextGenerator(new RangeSeekBar.c() { // from class: com.max.hbcommon.component.segmentfilters.j
                @Override // com.max.hbcustomview.seekbar.RangeSeekBar.c
                public final String a(float f10) {
                    return SecondaryWindowSegmentFilterView.a.h(filtersObj, f10);
                }
            });
            if (filtersObj.getCustom_range() == null) {
                rangeSeekBar.setProgress(0.0f, filtersObj.getFilters().size() - 1);
                hbRangeTrendView.setRange(0.0f, filtersObj.getFilters().size() - 1);
            } else {
                float fIndexOf = filtersObj.getFilters().indexOf(filtersObj.getCustom_range().getStart());
                float fIndexOf2 = filtersObj.getFilters().indexOf(filtersObj.getCustom_range().getEnd());
                rangeSeekBar.setProgress(fIndexOf, fIndexOf2);
                hbRangeTrendView.setRange(fIndexOf, fIndexOf2);
            }
            rangeSeekBar.setOnRangeChangedListener(new C0546a(hbRangeTrendView, filtersObj));
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(context, 46.0f)));
            f0.m(viewInflate);
            return viewInflate;
        }

        @dl.d
        @xh.m
        public final View i(@dl.d Context context, @dl.d final FilterGroup filtersObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, filtersObj}, this, changeQuickRedirect, false, bb.c.e.f31747d3, new Class[]{Context.class, FilterGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(filtersObj, "filtersObj");
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_game_filter_slider, (ViewGroup) null, false);
            RangeSeekBar rangeSeekBar = (RangeSeekBar) viewInflate.findViewById(R.id.rsb);
            rangeSeekBar.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            rangeSeekBar.setRange(0.0f, filtersObj.getFilters().size() - 1, 1.0f);
            rangeSeekBar.setSteps(filtersObj.getFilters().size() - 1);
            rangeSeekBar.setTextGenerator(new RangeSeekBar.c() { // from class: com.max.hbcommon.component.segmentfilters.k
                @Override // com.max.hbcustomview.seekbar.RangeSeekBar.c
                public final String a(float f10) {
                    return SecondaryWindowSegmentFilterView.a.j(filtersObj, f10);
                }
            });
            if (filtersObj.getCustom_range() == null) {
                rangeSeekBar.setProgress(0.0f, filtersObj.getFilters().size() - 1);
            } else {
                rangeSeekBar.setProgress(filtersObj.getFilters().indexOf(filtersObj.getCustom_range().getStart()), filtersObj.getFilters().indexOf(filtersObj.getCustom_range().getEnd()));
            }
            rangeSeekBar.setOnRangeChangedListener(new b(filtersObj));
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            f0.m(viewInflate);
            return viewInflate;
        }

        @xh.m
        public final void k(@dl.d ArrayList<KeyDescObj> mPageList) {
            if (PatchProxy.proxy(new Object[]{mPageList}, this, changeQuickRedirect, false, bb.c.e.f31730c3, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mPageList, "mPageList");
            for (KeyDescObj keyDescObj : mPageList) {
                if (f0.g(keyDescObj.getMulti(), "1") && keyDescObj.getData() != null && keyDescObj.getData().size() > 0 && keyDescObj.getData().get(0) != null) {
                    keyDescObj.setKey(keyDescObj.getData().get(0).getKey());
                    keyDescObj.setDesc(keyDescObj.getData().get(0).getDesc());
                }
            }
        }

        @xh.m
        public final boolean l(@dl.e List<FilterGroup> list) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.e.f31798g3, new Class[]{List.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (list != null) {
                for (FilterGroup filterGroup : list) {
                    if (filterGroup.isNormalSlider()) {
                        if (filterGroup.getCustom_range() != null && (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) != 0 || filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) != filterGroup.getFilters().size() - 1)) {
                            return true;
                        }
                    } else if (filterGroup.getFilters().indexOf(SecondaryWindowSegmentFilterView.f67839l.c(filterGroup)) > 0) {
                        return true;
                    }
                }
            }
            return false;
        }

        @xh.m
        public final boolean m(@dl.e List<FilterItem> list) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.e.f31764e3, new Class[]{List.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (list != null) {
                Iterator<FilterItem> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().isCustom_checked()) {
                        return true;
                    }
                }
            }
            return false;
        }

        @xh.m
        public final boolean n(@dl.d FilterGroup filterGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.f31781f3, new Class[]{FilterGroup.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(filterGroup, "filterGroup");
            if (filterGroup.isNormalSlider()) {
                if (filterGroup.getCustom_range() != null && (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) != 0 || filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) != filterGroup.getFilters().size() - 1)) {
                    return true;
                }
            } else if (f0.g(FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH, filterGroup.getType())) {
                boolean z10 = (filterGroup.getCustom_range() == null || (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) == 0 && filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) == filterGroup.getFilters().size() - 1)) ? false : true;
                boolean z11 = (filterGroup.getCustom_switch_key() == null || f0.g(filterGroup.getCustom_switch_key(), "all")) ? false : true;
                if (z10 || z11) {
                    return true;
                }
            } else if (filterGroup.getFilters().indexOf(c(filterGroup)) > 0) {
                return true;
            }
            return false;
        }

        @xh.m
        public final boolean o(@dl.e List<String> list, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, bb.c.e.Z2, new Class[]{List.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return list == null || CollectionsKt___CollectionsKt.R1(list, str);
        }

        @xh.m
        public final void p(boolean z10, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), viewHolder}, this, changeQuickRedirect, false, bb.c.e.P2, new Class[]{Boolean.TYPE, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            TextView textView = (TextView) viewHolder.i(R.id.tv_filter_name);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_arrow);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_icon);
            Context context = viewHolder.itemView.getContext();
            float fH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.W(viewHolder.itemView), ViewUtils.f(context, 24.0f)));
            if (z10) {
                viewHolder.itemView.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color, fH0));
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                int i10 = R.color.background_layer_2_color;
                textView.setTextColor(com.max.hbcommon.utils.l.a(i10));
                if (imageView != null) {
                    imageView.setColorFilter(com.max.hbcommon.utils.l.a(i10));
                }
                if (imageView2 != null) {
                    imageView2.setColorFilter(com.max.hbcommon.utils.l.a(i10));
                    return;
                }
                return;
            }
            viewHolder.itemView.setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, fH0));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            int i11 = R.color.text_primary_2_color;
            textView.setTextColor(com.max.hbcommon.utils.l.a(i11));
            if (imageView2 != null) {
                imageView2.setColorFilter(com.max.hbcommon.utils.l.a(i11));
            }
            if (imageView != null) {
                imageView.setColorFilter(com.max.hbcommon.utils.l.a(R.color.text_secondary_2_color));
            }
        }

        @xh.m
        public final void q(@dl.e FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.W2, new Class[]{FilterGroup.class}, Void.TYPE).isSupported || filterGroup == null) {
                return;
            }
            if (filterGroup.isNormalSlider()) {
                filterGroup.setCustom_range(null);
                return;
            }
            List<FilterItem> filters = filterGroup.getFilters();
            if (filters != null) {
                boolean z10 = false;
                for (FilterItem filterItem : filters) {
                    if (com.max.hbcommon.utils.c.u(filterGroup.getDefault_check()) || !f0.g(filterGroup.getDefault_check(), filterItem.getKey())) {
                        filterItem.setCustom_checked(false);
                    } else {
                        filterItem.setCustom_checked(true);
                        z10 = true;
                    }
                }
                if (z10) {
                    return;
                }
                filters.get(0).setCustom_checked(true);
            }
        }

        @xh.m
        public final void r(@dl.e FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{filterGroup}, this, changeQuickRedirect, false, bb.c.e.U2, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
                return;
            }
            s(filterGroup != null ? filterGroup.getFilters() : null, filterGroup != null ? filterGroup.getDefault_check() : null, filterGroup != null ? filterGroup.getType() : null);
        }

        @xh.m
        public final void s(@dl.e List<FilterItem> list, @dl.e String str, @dl.e String str2) {
            if (PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, bb.c.e.V2, new Class[]{List.class, String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
                return;
            }
            f0.m(list);
            int size = list.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                FilterItem filterItem = list.get(i10);
                filterItem.setCustom_index(i10);
                if (com.max.hbcommon.utils.c.u(str) || !f0.g(str, filterItem.getKey())) {
                    filterItem.setCustom_checked(false);
                } else {
                    filterItem.setCustom_checked(true);
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            list.get(0).setCustom_checked(true);
        }

        @xh.m
        public final void t(boolean z10, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), viewHolder}, this, changeQuickRedirect, false, bb.c.e.Q2, new Class[]{Boolean.TYPE, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_arrow);
            if (z10) {
                if (imageView == null) {
                    return;
                }
                imageView.setRotationX(180.0f);
            } else {
                if (imageView == null) {
                    return;
                }
                imageView.setRotationX(0.0f);
            }
        }

        @xh.m
        public final void u(@dl.e FilterGroup filterGroup, @dl.e FilterItem filterItem) {
            if (PatchProxy.proxy(new Object[]{filterGroup, filterItem}, this, changeQuickRedirect, false, bb.c.e.X2, new Class[]{FilterGroup.class, FilterItem.class}, Void.TYPE).isSupported) {
                return;
            }
            v(filterGroup != null ? filterGroup.getFilters() : null, filterItem, f0.g(filterGroup != null ? filterGroup.getType() : null, FilterGroup.TYPE_MULTI));
        }

        @xh.m
        public final void v(@dl.e List<FilterItem> list, @dl.e FilterItem filterItem, boolean z10) {
            if (PatchProxy.proxy(new Object[]{list, filterItem, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.Y2, new Class[]{List.class, FilterItem.class, Boolean.TYPE}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list) || filterItem == null) {
                return;
            }
            if (!z10 || filterItem.isSingle()) {
                f0.m(list);
                for (FilterItem filterItem2 : list) {
                    filterItem2.setCustom_checked(filterItem2.getKey() != null && f0.g(filterItem2.getKey(), filterItem.getKey()));
                }
                return;
            }
            f0.m(list);
            int i10 = 0;
            for (FilterItem filterItem3 : list) {
                if (filterItem3.isSingle()) {
                    filterItem3.setCustom_checked(false);
                } else {
                    if (f0.g(filterItem3.getKey(), filterItem.getKey())) {
                        filterItem3.setCustom_checked(!filterItem3.isCustom_checked());
                    }
                    if (filterItem3.isCustom_checked()) {
                        i10++;
                    }
                }
            }
            if (i10 == 0) {
                list.get(0).setCustom_checked(true);
            }
        }
    }

    /* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<FilterItem> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f67860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FilterGroup f67861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SecondaryWindowSegmentFilterView f67862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, FilterGroup filterGroup, SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, List<FilterItem> list, int i10) {
            super(context, list, i10);
            this.f67860b = context;
            this.f67861c = filterGroup;
            this.f67862d = secondaryWindowSegmentFilterView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(FilterGroup filterGroup, FilterItem item, b this$0, SecondaryWindowSegmentFilterView this$1, Context context, com.max.hbcommon.base.adapter.s.e viewHolder, View view) {
            if (PatchProxy.proxy(new Object[]{filterGroup, item, this$0, this$1, context, viewHolder, view}, null, changeQuickRedirect, true, bb.c.e.f32086x3, new Class[]{FilterGroup.class, FilterItem.class, b.class, SecondaryWindowSegmentFilterView.class, Context.class, com.max.hbcommon.base.adapter.s.e.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(filterGroup, "$filterGroup");
            f0.p(item, "$item");
            f0.p(this$0, "this$0");
            f0.p(this$1, "this$1");
            f0.p(context, "$context");
            f0.p(viewHolder, "$viewHolder");
            SecondaryWindowSegmentFilterView.f67839l.u(filterGroup, item);
            this$0.notifyDataSetChanged();
            if (f0.g(filterGroup.getType(), FilterGroup.TYPE_MULTI)) {
                return;
            }
            this$1.getAdapter().notifyDataSetChanged();
            this$1.o(context);
            f secondaryFilterItemClickListener = this$1.getSecondaryFilterItemClickListener();
            if (secondaryFilterItemClickListener != null) {
                secondaryFilterItemClickListener.a(filterGroup, item, viewHolder.getAbsoluteAdapterPosition());
            }
        }

        public void n(@dl.d final com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final FilterItem item) {
            if (PatchProxy.proxy(new Object[]{viewHolder, item}, this, changeQuickRedirect, false, bb.c.e.f32069w3, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FilterItem.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(item, "item");
            TextView textView = (TextView) viewHolder.i(R.id.tv_filter_name);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
            if (com.max.hbcommon.utils.c.u(item.getImg_url())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                com.max.hbimage.b.K(item.getImg_url(), imageView);
            }
            viewHolder.itemView.setVisibility(0);
            if (viewHolder.getAbsoluteAdapterPosition() != 0) {
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (item.isHide()) {
                    marginLayoutParams.rightMargin = 0;
                    marginLayoutParams.width = 0;
                } else {
                    marginLayoutParams.rightMargin = ViewUtils.f(this.f67860b, 4.0f);
                    marginLayoutParams.width = -2;
                    SecondaryWindowSegmentFilterView.f67839l.p(item.isCustom_checked(), viewHolder);
                }
                viewHolder.itemView.setLayoutParams(marginLayoutParams);
            } else if (this.f67861c.isCheckedHide()) {
                SecondaryWindowSegmentFilterView.f67839l.p(true, viewHolder);
            } else {
                SecondaryWindowSegmentFilterView.f67839l.p(item.isCustom_checked(), viewHolder);
            }
            textView.setText(item.getDesc());
            View view = viewHolder.itemView;
            final FilterGroup filterGroup = this.f67861c;
            final SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = this.f67862d;
            final Context context = this.f67860b;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SecondaryWindowSegmentFilterView.b.o(filterGroup, item, this, secondaryWindowSegmentFilterView, context, viewHolder, view2);
                }
            });
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, FilterItem filterItem) {
            if (PatchProxy.proxy(new Object[]{eVar, filterItem}, this, changeQuickRedirect, false, bb.c.e.f32103y3, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, filterItem);
        }
    }

    /* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
    public static final class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayout f67863a;

        c(LinearLayout linearLayout) {
            this.f67863a = linearLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.e.A3, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.e.B3, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.e.f32120z3, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f67863a.setVisibility(0);
        }
    }

    public SecondaryWindowSegmentFilterView(@dl.e Context context) {
        this(context, null);
    }

    public SecondaryWindowSegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecondaryWindowSegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SecondaryWindowSegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67844d = r0.a(e1.e());
        this.f67847g = new ArrayList();
        f(attributeSet);
    }

    @xh.m
    public static final void A(@dl.e List<FilterItem> list, @dl.e FilterItem filterItem, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, filterItem, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.F2, new Class[]{List.class, FilterItem.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.v(list, filterItem, z10);
    }

    public static final /* synthetic */ void e(SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, Context context, View view, FilterGroup filterGroup, com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{secondaryWindowSegmentFilterView, context, view, filterGroup, eVar}, null, changeQuickRedirect, true, bb.c.e.O2, new Class[]{SecondaryWindowSegmentFilterView.class, Context.class, View.class, FilterGroup.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        secondaryWindowSegmentFilterView.v(context, view, filterGroup, eVar);
    }

    private final void f(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.e.f31881l2, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setAdapter(new SecondaryWindowSegmentFilterView$addViews$1(this, getContext(), this.f67847g, R.layout.item_hsv_filter));
        setRv(new RecyclerView(getContext()));
        getRv().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRv().setAdapter(getAdapter());
        if (getRv().getItemAnimator() instanceof SimpleItemAnimator) {
            RecyclerView.ItemAnimator itemAnimator = getRv().getItemAnimator();
            f0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 24.0f));
        int i10 = R.id.ll_right;
        layoutParams.addRule(0, i10);
        layoutParams.alignWithParent = true;
        getRv().setLayoutParams(layoutParams);
        getRv().setPadding(ViewUtils.f(getContext(), 9.0f), 0, ViewUtils.f(getContext(), 9.0f), 0);
        getRv().setClipToPadding(false);
        getRv().setClipChildren(false);
        addView(getRv());
        setLlRightContainer(new LinearLayout(getContext()));
        getLlRightContainer().setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        getLlRightContainer().setLayoutParams(layoutParams2);
        addView(getLlRightContainer());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.P3);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.VerSpace_topSpace, ViewUtils.f(getContext(), 10.0f));
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.VerSpace_bottomSpace, ViewUtils.f(getContext(), 10.0f));
        setTopPadding(dimension);
        setBottomPadding(dimension2);
    }

    @dl.e
    @xh.m
    public static final FilterItem h(@dl.e FilterGroup filterGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, null, changeQuickRedirect, true, bb.c.e.f32119z2, new Class[]{FilterGroup.class}, FilterItem.class);
        return patchProxyResultProxy.isSupported ? (FilterItem) patchProxyResultProxy.result : f67839l.c(filterGroup);
    }

    @dl.e
    @xh.m
    public static final FilterItem i(@dl.e FilterGroup filterGroup, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup, str}, null, changeQuickRedirect, true, bb.c.e.f32102y2, new Class[]{FilterGroup.class, String.class}, FilterItem.class);
        return patchProxyResultProxy.isSupported ? (FilterItem) patchProxyResultProxy.result : f67839l.d(filterGroup, str);
    }

    @dl.d
    @xh.m
    public static final List<FilterItem> j(@dl.e List<FilterItem> list, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, bb.c.e.H2, new Class[]{List.class, String.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : f67839l.e(list, str);
    }

    @dl.d
    @xh.m
    public static final List<FilterItem> k(@dl.e FilterGroup filterGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, null, changeQuickRedirect, true, bb.c.e.A2, new Class[]{FilterGroup.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : f67839l.f(filterGroup);
    }

    @dl.d
    @xh.m
    public static final View l(@dl.d Context context, @dl.d FilterGroup filterGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, filterGroup}, null, changeQuickRedirect, true, bb.c.e.I2, new Class[]{Context.class, FilterGroup.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : f67839l.g(context, filterGroup);
    }

    @dl.d
    @xh.m
    public static final View m(@dl.d Context context, @dl.d FilterGroup filterGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, filterGroup}, null, changeQuickRedirect, true, bb.c.e.K2, new Class[]{Context.class, FilterGroup.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : f67839l.i(context, filterGroup);
    }

    @xh.m
    public static final void n(@dl.d ArrayList<KeyDescObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, bb.c.e.J2, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.k(arrayList);
    }

    @xh.m
    public static final boolean p(@dl.e List<FilterGroup> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.e.N2, new Class[]{List.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f67839l.l(list);
    }

    @xh.m
    public static final boolean q(@dl.e List<FilterItem> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.e.L2, new Class[]{List.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f67839l.m(list);
    }

    @xh.m
    public static final boolean r(@dl.d FilterGroup filterGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroup}, null, changeQuickRedirect, true, bb.c.e.M2, new Class[]{FilterGroup.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f67839l.n(filterGroup);
    }

    @xh.m
    public static final boolean s(@dl.e List<String> list, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, bb.c.e.G2, new Class[]{List.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f67839l.o(list, str);
    }

    @xh.m
    public static final void setDefaultChecked(@dl.e FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{filterGroup}, null, changeQuickRedirect, true, bb.c.e.B2, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.r(filterGroup);
    }

    @xh.m
    public static final void setDefaultChecked(@dl.e List<FilterItem> list, @dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{list, str, str2}, null, changeQuickRedirect, true, bb.c.e.C2, new Class[]{List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.s(list, str, str2);
    }

    @xh.m
    public static final void setFilterWinExpanded(boolean z10, @dl.d com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), eVar}, null, changeQuickRedirect, true, bb.c.e.f32085x2, new Class[]{Boolean.TYPE, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.t(z10, eVar);
    }

    @xh.m
    public static final void t(boolean z10, @dl.d com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), eVar}, null, changeQuickRedirect, true, bb.c.e.f32068w2, new Class[]{Boolean.TYPE, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.p(z10, eVar);
    }

    @xh.m
    public static final void u(@dl.e FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{filterGroup}, null, changeQuickRedirect, true, bb.c.e.D2, new Class[]{FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.q(filterGroup);
    }

    private final void v(final Context context, View view, final FilterGroup filterGroup, final com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{context, view, filterGroup, eVar}, this, changeQuickRedirect, false, bb.c.e.f31915n2, new Class[]{Context.class, View.class, FilterGroup.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.dialog_scrim_color));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SecondaryWindowSegmentFilterView.w(this.f67893b, context, view2);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setBackgroundResource(R.drawable.white_bottom_8dp);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SecondaryWindowSegmentFilterView.x(view2);
            }
        });
        linearLayout.addView(linearLayout2);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.divider, (ViewGroup) linearLayout2, false);
        f0.o(viewInflate, "inflate(...)");
        linearLayout2.addView(viewInflate);
        linearLayout2.addView(g(context, filterGroup, linearLayout2));
        PopupWindow popupWindow = new PopupWindow((View) linearLayout, -1, -1, true);
        this.f67845e = popupWindow;
        f0.m(popupWindow);
        popupWindow.setTouchable(true);
        PopupWindow popupWindow2 = this.f67845e;
        f0.m(popupWindow2);
        popupWindow2.setBackgroundDrawable(new BitmapDrawable());
        PopupWindow popupWindow3 = this.f67845e;
        f0.m(popupWindow3);
        popupWindow3.setAnimationStyle(0);
        PopupWindow popupWindow4 = this.f67845e;
        f0.m(popupWindow4);
        popupWindow4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.max.hbcommon.component.segmentfilters.i
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                SecondaryWindowSegmentFilterView.y(this.f67895b, eVar, filterGroup);
            }
        });
        PopupWindow popupWindow5 = this.f67845e;
        f0.m(popupWindow5);
        if (popupWindow5.isShowing() || view == null) {
            return;
        }
        ViewUtils.o0(this.f67845e, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new c(linearLayout2));
        linearLayout2.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SecondaryWindowSegmentFilterView this$0, Context context, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, context, view}, null, changeQuickRedirect, true, bb.c.e.f32034u2, new Class[]{SecondaryWindowSegmentFilterView.class, Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(context, "$context");
        this$0.o(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SecondaryWindowSegmentFilterView this$0, com.max.hbcommon.base.adapter.s.e viewHolder, FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{this$0, viewHolder, filterGroup}, null, changeQuickRedirect, true, bb.c.e.f32051v2, new Class[]{SecondaryWindowSegmentFilterView.class, com.max.hbcommon.base.adapter.s.e.class, FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(viewHolder, "$viewHolder");
        f0.p(filterGroup, "$filterGroup");
        this$0.getAdapter().notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
        d dVar = this$0.f67848h;
        if (dVar != null) {
            dVar.a(filterGroup, viewHolder.getAbsoluteAdapterPosition());
        }
    }

    @xh.m
    public static final void z(@dl.e FilterGroup filterGroup, @dl.e FilterItem filterItem) {
        if (PatchProxy.proxy(new Object[]{filterGroup, filterItem}, null, changeQuickRedirect, true, bb.c.e.E2, new Class[]{FilterGroup.class, FilterItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f67839l.u(filterGroup, filterItem);
    }

    @dl.d
    public View g(@dl.d Context context, @dl.d FilterGroup filterGroup, @dl.d ViewGroup parent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, filterGroup, parent}, this, changeQuickRedirect, false, bb.c.e.f31932o2, new Class[]{Context.class, FilterGroup.class, ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(filterGroup, "filterGroup");
        f0.p(parent, "parent");
        if (f0.g(FilterGroup.TYPE_SLIDER, filterGroup.getType())) {
            View viewI = f67839l.i(context, filterGroup);
            int iF = ViewUtils.f(context, 16.0f);
            ViewUtils.n0(viewI, 0, iF, 0, iF);
            return viewI;
        }
        if (f0.g(FilterGroup.TYPE_SLIDER_WITH_TREND, filterGroup.getType())) {
            View viewG = f67839l.g(context, filterGroup);
            int iF2 = ViewUtils.f(context, 16.0f);
            ViewUtils.n0(viewG, 0, iF2, 0, iF2);
            return viewG;
        }
        if (f0.g(FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH, filterGroup.getType())) {
            GameFilterSliderTrendWithSwitch gameFilterSliderTrendWithSwitch = new GameFilterSliderTrendWithSwitch(context);
            gameFilterSliderTrendWithSwitch.setData(filterGroup);
            return gameFilterSliderTrendWithSwitch;
        }
        if (f0.g(FilterGroup.TYPE_SLIDER_WITH_LEGEND, filterGroup.getType())) {
            GameFilterSliderWithLegend gameFilterSliderWithLegend = new GameFilterSliderWithLegend(context);
            gameFilterSliderWithLegend.setProportional(true);
            gameFilterSliderWithLegend.setTotalHeightDp(96.0f);
            gameFilterSliderWithLegend.setData(filterGroup);
            return gameFilterSliderWithLegend;
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(ViewUtils.f(context, 8.0f), ViewUtils.f(context, 12.0f), ViewUtils.f(context, 8.0f), ViewUtils.f(context, 12.0f));
        recyclerView.setAdapter(new b(context, filterGroup, this, filterGroup.getFilters(), R.layout.item_flex_filter));
        return recyclerView;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.s<FilterGroup> getAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31831i2, new Class[0], com.max.hbcommon.base.adapter.s.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s<FilterGroup> sVar = this.f67846f;
        if (sVar != null) {
            return sVar;
        }
        f0.S("adapter");
        return null;
    }

    public final long getDelayShowSecondaryWindowTime() {
        return this.f67851k;
    }

    @dl.e
    public final d getDismissListener() {
        return this.f67848h;
    }

    @dl.e
    public final e getFilterClickListener() {
        return this.f67849i;
    }

    @dl.d
    public final List<FilterGroup> getList() {
        return this.f67847g;
    }

    @dl.d
    public final LinearLayout getLlRightContainer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31797g2, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f67843c;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("llRightContainer");
        return null;
    }

    @dl.d
    public final RecyclerView getRv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31763e2, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f67842b;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv");
        return null;
    }

    @dl.e
    public final f getSecondaryFilterItemClickListener() {
        return this.f67850j;
    }

    public final void o(@dl.d Context activity) {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.f31898m2, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        PopupWindow popupWindow2 = this.f67845e;
        if (!(popupWindow2 != null && popupWindow2.isShowing()) || (popupWindow = this.f67845e) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@dl.e Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, bb.c.e.f32017t2, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onRestoreInstanceState(parcelable);
        com.max.heybox.hblog.g.f74531b.q("SecondaryWindowSegmentFilterView, onRestoreInstanceState, state = " + parcelable);
    }

    public final void setAdapter(@dl.d com.max.hbcommon.base.adapter.s<FilterGroup> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, bb.c.e.f31847j2, new Class[]{com.max.hbcommon.base.adapter.s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f67846f = sVar;
    }

    public final void setBottomPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f32000s2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getRv().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLlRightContainer().getLayoutParams();
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.bottomMargin = i10;
    }

    @qa.a(note = "设置底部空白高度")
    public final void setBottomPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31983r2, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTopPadding(ViewUtils.f(getContext(), f10));
    }

    public final void setDelayShowSecondaryWindowTime(long j10) {
        this.f67851k = j10;
    }

    public final void setDismissListener(@dl.e d dVar) {
        this.f67848h = dVar;
    }

    public final void setFilterClickListener(@dl.e e eVar) {
        this.f67849i = eVar;
    }

    public final void setList(@dl.d List<FilterGroup> value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, bb.c.e.f31864k2, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.f67847g.clear();
        this.f67847g.addAll(value);
        getAdapter().notifyDataSetChanged();
    }

    public final void setLlRightContainer(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, bb.c.e.f31814h2, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f67843c = linearLayout;
    }

    public final void setRv(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.e.f31780f2, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f67842b = recyclerView;
    }

    public final void setSecondaryFilterItemClickListener(@dl.e f fVar) {
        this.f67850j = fVar;
    }

    public final void setTopPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f31966q2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getRv().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLlRightContainer().getLayoutParams();
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.topMargin = i10;
    }

    @qa.a(note = "设置顶部空白高度")
    public final void setTopPaddingDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31949p2, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTopPadding(ViewUtils.f(getContext(), f10));
    }
}
