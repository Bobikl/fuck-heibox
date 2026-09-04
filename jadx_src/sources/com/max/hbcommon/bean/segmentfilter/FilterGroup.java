package com.max.hbcommon.bean.segmentfilter;

import bb.c;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FilterGroup implements Serializable {
    public static final String TYPE_MULTI = "multi";
    public static final String TYPE_SINGLE = "single";
    public static final String TYPE_SLIDER = "slider";
    public static final String TYPE_SLIDER_TREND_WITH_SWITCH = "slider_trend_with_switch";
    public static final String TYPE_SLIDER_WITH_LEGEND = "slider_with_legend";
    public static final String TYPE_SLIDER_WITH_TREND = "slider_with_trend";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1552037958922915366L;
    private FilterRangeObj custom_range;
    private String custom_switch_key;
    private String default_check;
    private String desc;
    private List<FilterItem> filters;
    private String is_released;
    private String key;
    private List<SliderFilterSwitchOptionObj> legend;
    private String protocol;
    private List<String> show_sort_type;

    @SerializedName(alternate = {"switch"}, value = "switchoptions")
    private SliderFilterSwitchObj switchoptions;
    private String type;

    public FilterGroup deepCopyByJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.G5, new Class[0], FilterGroup.class);
        return patchProxyResultProxy.isSupported ? (FilterGroup) patchProxyResultProxy.result : (FilterGroup) k.a(k.p(this), FilterGroup.class);
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.H5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterGroup filterGroup = (FilterGroup) obj;
        String str = this.key;
        if (str == null ? filterGroup.key != null : !str.equals(filterGroup.key)) {
            return false;
        }
        List<FilterItem> list = this.filters;
        List<FilterItem> list2 = filterGroup.filters;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public FilterRangeObj getCustom_range() {
        return this.custom_range;
    }

    public String getCustom_switch_key() {
        return this.custom_switch_key;
    }

    public String getDefault_check() {
        return this.default_check;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<FilterItem> getFilters() {
        return this.filters;
    }

    public String getIs_released() {
        return this.is_released;
    }

    public String getKey() {
        return this.key;
    }

    public List<SliderFilterSwitchOptionObj> getLegend() {
        return this.legend;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public List<String> getShow_sort_type() {
        return this.show_sort_type;
    }

    public SliderFilterSwitchObj getSwitchoptions() {
        return this.switchoptions;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.I5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<FilterItem> list = this.filters;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public boolean isCheckedHide() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.L5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.w(this.filters)) {
            return false;
        }
        if (TYPE_MULTI.equals(this.type)) {
            List<FilterItem> listK = SecondaryWindowSegmentFilterView.k(this);
            return listK.size() == 1 && listK.get(0).isHide();
        }
        FilterItem filterItemH = SecondaryWindowSegmentFilterView.h(this);
        return filterItemH != null && filterItemH.isHide();
    }

    public boolean isNormalSlider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.J5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return TYPE_SLIDER.equals(this.type) || TYPE_SLIDER_WITH_TREND.equals(this.type) || TYPE_SLIDER_WITH_LEGEND.equals(this.type);
    }

    public boolean isSlider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.K5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return isNormalSlider() || TYPE_SLIDER_TREND_WITH_SWITCH.equals(this.type);
    }

    public void setCustom_range(FilterRangeObj filterRangeObj) {
        this.custom_range = filterRangeObj;
    }

    public void setCustom_switch_key(String str) {
        this.custom_switch_key = str;
    }

    public void setDefault_check(String str) {
        this.default_check = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setFilters(List<FilterItem> list) {
        this.filters = list;
    }

    public void setIs_released(String str) {
        this.is_released = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLegend(List<SliderFilterSwitchOptionObj> list) {
        this.legend = list;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setShow_sort_type(List<String> list) {
        this.show_sort_type = list;
    }

    public void setSwitchoptions(SliderFilterSwitchObj sliderFilterSwitchObj) {
        this.switchoptions = sliderFilterSwitchObj;
    }

    public void setType(String str) {
        this.type = str;
    }
}
