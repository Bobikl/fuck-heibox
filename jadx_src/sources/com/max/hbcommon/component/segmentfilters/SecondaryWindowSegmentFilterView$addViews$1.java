package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SecondaryWindowSegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SecondaryWindowSegmentFilterView$addViews$1 extends com.max.hbcommon.base.adapter.s<FilterGroup> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SecondaryWindowSegmentFilterView f67855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecondaryWindowSegmentFilterView$addViews$1(SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, Context context, List<FilterGroup> list, int i10) {
        super(context, list, i10);
        this.f67855b = secondaryWindowSegmentFilterView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(FilterGroup filterGroup, com.max.hbcommon.base.adapter.s.e viewHolder, SecondaryWindowSegmentFilterView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{filterGroup, viewHolder, this$0, view}, null, changeQuickRedirect, true, bb.c.e.f31967q3, new Class[]{FilterGroup.class, com.max.hbcommon.base.adapter.s.e.class, SecondaryWindowSegmentFilterView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterGroup, "$filterGroup");
        f0.p(viewHolder, "$viewHolder");
        f0.p(this$0, "this$0");
        if (!f0.g(filterGroup.getType(), FilterGroup.TYPE_SINGLE)) {
            SecondaryWindowSegmentFilterView.a aVar = SecondaryWindowSegmentFilterView.f67839l;
            aVar.t(true, viewHolder);
            aVar.p(true, viewHolder);
            kotlinx.coroutines.k.f(this$0.f67844d, null, null, new SecondaryWindowSegmentFilterView$addViews$1$onBindViewHolder$1$1(this$0, filterGroup, viewHolder, null), 3, null);
        } else if (com.max.hbcommon.utils.c.u(filterGroup.getProtocol()) && filterGroup.getFilters().size() == 2) {
            filterGroup.getFilters().get(0).setCustom_checked(!filterGroup.getFilters().get(0).isCustom_checked());
            filterGroup.getFilters().get(1).setCustom_checked(!filterGroup.getFilters().get(0).isCustom_checked());
            SecondaryWindowSegmentFilterView.f67839l.p(filterGroup.getFilters().get(1).isCustom_checked(), viewHolder);
        }
        e filterClickListener = this$0.getFilterClickListener();
        if (filterClickListener != null) {
            filterClickListener.a(filterGroup, viewHolder.getAbsoluteAdapterPosition());
        }
    }

    public void n(@dl.d final com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final FilterGroup filterGroup) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{viewHolder, filterGroup}, this, changeQuickRedirect, false, bb.c.e.f31950p3, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FilterGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(filterGroup, "filterGroup");
        int iF = ViewUtils.f(this.f67855b.getContext(), 24.0f);
        if (viewHolder.itemView.getLayoutParams().height != iF) {
            viewHolder.itemView.getLayoutParams().height = iF;
        }
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_arrow);
        imageView.setVisibility(0);
        if (filterGroup.isNormalSlider()) {
            if (filterGroup.getCustom_range() == null || (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) == 0 && filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) == filterGroup.getFilters().size() - 1)) {
                z10 = false;
            }
            SecondaryWindowSegmentFilterView.f67839l.p(z10, viewHolder);
            if (z10) {
                viewHolder.p(R.id.tv_filter_name, filterGroup.getCustom_range().getStart().getDesc() + '-' + filterGroup.getCustom_range().getEnd().getDesc());
            } else {
                viewHolder.p(R.id.tv_filter_name, filterGroup.getDesc());
            }
        } else if (f0.g(FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH, filterGroup.getType())) {
            boolean z11 = (filterGroup.getCustom_range() == null || (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) == 0 && filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) == filterGroup.getFilters().size() - 1)) ? false : true;
            boolean z12 = (filterGroup.getCustom_switch_key() == null || f0.g(filterGroup.getCustom_switch_key(), "all")) ? false : true;
            if (!z11 && !z12) {
                z10 = false;
            }
            SecondaryWindowSegmentFilterView.f67839l.p(z10, viewHolder);
            if (z11) {
                viewHolder.p(R.id.tv_filter_name, filterGroup.getCustom_range().getStart().getDesc() + '-' + filterGroup.getCustom_range().getEnd().getDesc());
            } else if (z12) {
                String custom_switch_key = filterGroup.getCustom_switch_key();
                String str = "想玩";
                if (custom_switch_key != null) {
                    int iHashCode = custom_switch_key.hashCode();
                    if (iHashCode == 48) {
                        custom_switch_key.equals("0");
                    } else if (iHashCode != 49) {
                        if (iHashCode == 96673 && custom_switch_key.equals("all")) {
                            str = d0.f87251w;
                        }
                    } else if (custom_switch_key.equals("1")) {
                        str = "玩过";
                    }
                }
                viewHolder.p(R.id.tv_filter_name, str);
            } else {
                viewHolder.p(R.id.tv_filter_name, filterGroup.getDesc());
            }
        } else if (f0.g(FilterGroup.TYPE_SINGLE, filterGroup.getType())) {
            imageView.setVisibility(8);
            if (filterGroup.getFilters().size() == 2) {
                SecondaryWindowSegmentFilterView.f67839l.p(filterGroup.getFilters().get(1).isCustom_checked(), viewHolder);
                viewHolder.p(R.id.tv_filter_name, filterGroup.getFilters().get(1).getDesc());
            }
        } else {
            SecondaryWindowSegmentFilterView.a aVar = SecondaryWindowSegmentFilterView.f67839l;
            FilterItem filterItemC = aVar.c(filterGroup);
            boolean z13 = (filterItemC != null && !filterItemC.isHide()) && filterGroup.getFilters().indexOf(filterItemC) > 0;
            aVar.p(z13, viewHolder);
            if (!z13) {
                viewHolder.p(R.id.tv_filter_name, filterGroup.getDesc());
            } else if (f0.g(FilterGroup.TYPE_MULTI, filterGroup.getType())) {
                StringBuilder sb2 = new StringBuilder();
                for (FilterItem filterItem : filterGroup.getFilters()) {
                    if (filterItem.isCustom_checked()) {
                        if (sb2.length() > 0) {
                            sb2.append("...");
                            break;
                        }
                        sb2.append(filterItem.getDesc());
                    }
                }
                viewHolder.p(R.id.tv_filter_name, sb2.toString());
            } else {
                int i10 = R.id.tv_filter_name;
                f0.m(filterItemC);
                viewHolder.p(i10, filterItemC.getDesc());
            }
        }
        SecondaryWindowSegmentFilterView.f67839l.t(false, viewHolder);
        View view = viewHolder.itemView;
        final SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = this.f67855b;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.segmentfilters.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SecondaryWindowSegmentFilterView$addViews$1.o(filterGroup, viewHolder, secondaryWindowSegmentFilterView, view2);
            }
        });
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, FilterGroup filterGroup) {
        if (PatchProxy.proxy(new Object[]{eVar, filterGroup}, this, changeQuickRedirect, false, bb.c.e.f31984r3, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, filterGroup);
    }
}
