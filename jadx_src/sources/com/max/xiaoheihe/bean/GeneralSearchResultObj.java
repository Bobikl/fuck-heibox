package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.NewFilterListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GeneralSearchResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GeneralSearchResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bottom_tips;

    @e
    private ArrayList<NewFilterListObj> filter_list;

    @e
    private ArrayList<KeyDescObj> game_type_list;

    @e
    private ArrayList<GeneralSearchInfo> items;

    @e
    private String search_not_result_tips;

    @e
    private ArrayList<KeyDescObj> sort_filter_list;

    @e
    private ArrayList<KeyDescObj> time_range_list;

    public GeneralSearchResultObj(@e ArrayList<GeneralSearchInfo> arrayList, @e ArrayList<KeyDescObj> arrayList2, @e ArrayList<KeyDescObj> arrayList3, @e ArrayList<KeyDescObj> arrayList4, @e ArrayList<NewFilterListObj> arrayList5, @e String str, @e String str2) {
        this.items = arrayList;
        this.game_type_list = arrayList2;
        this.sort_filter_list = arrayList3;
        this.time_range_list = arrayList4;
        this.filter_list = arrayList5;
        this.bottom_tips = str;
        this.search_not_result_tips = str2;
    }

    public static /* synthetic */ GeneralSearchResultObj copy$default(GeneralSearchResultObj generalSearchResultObj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{generalSearchResultObj, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.kM, new Class[]{GeneralSearchResultObj.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class, Integer.TYPE, Object.class}, GeneralSearchResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GeneralSearchResultObj) patchProxyResultProxy.result;
        }
        return generalSearchResultObj.copy((i10 & 1) != 0 ? generalSearchResultObj.items : arrayList, (i10 & 2) != 0 ? generalSearchResultObj.game_type_list : arrayList2, (i10 & 4) != 0 ? generalSearchResultObj.sort_filter_list : arrayList3, (i10 & 8) != 0 ? generalSearchResultObj.time_range_list : arrayList4, (i10 & 16) != 0 ? generalSearchResultObj.filter_list : arrayList5, (i10 & 32) != 0 ? generalSearchResultObj.bottom_tips : str, (i10 & 64) != 0 ? generalSearchResultObj.search_not_result_tips : str2);
    }

    @e
    public final ArrayList<GeneralSearchInfo> component1() {
        return this.items;
    }

    @e
    public final ArrayList<KeyDescObj> component2() {
        return this.game_type_list;
    }

    @e
    public final ArrayList<KeyDescObj> component3() {
        return this.sort_filter_list;
    }

    @e
    public final ArrayList<KeyDescObj> component4() {
        return this.time_range_list;
    }

    @e
    public final ArrayList<NewFilterListObj> component5() {
        return this.filter_list;
    }

    @e
    public final String component6() {
        return this.bottom_tips;
    }

    @e
    public final String component7() {
        return this.search_not_result_tips;
    }

    @d
    public final GeneralSearchResultObj copy(@e ArrayList<GeneralSearchInfo> arrayList, @e ArrayList<KeyDescObj> arrayList2, @e ArrayList<KeyDescObj> arrayList3, @e ArrayList<KeyDescObj> arrayList4, @e ArrayList<NewFilterListObj> arrayList5, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2}, this, changeQuickRedirect, false, c.m.jM, new Class[]{ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class}, GeneralSearchResultObj.class);
        return patchProxyResultProxy.isSupported ? (GeneralSearchResultObj) patchProxyResultProxy.result : new GeneralSearchResultObj(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.nM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralSearchResultObj)) {
            return false;
        }
        GeneralSearchResultObj generalSearchResultObj = (GeneralSearchResultObj) obj;
        return f0.g(this.items, generalSearchResultObj.items) && f0.g(this.game_type_list, generalSearchResultObj.game_type_list) && f0.g(this.sort_filter_list, generalSearchResultObj.sort_filter_list) && f0.g(this.time_range_list, generalSearchResultObj.time_range_list) && f0.g(this.filter_list, generalSearchResultObj.filter_list) && f0.g(this.bottom_tips, generalSearchResultObj.bottom_tips) && f0.g(this.search_not_result_tips, generalSearchResultObj.search_not_result_tips);
    }

    @e
    public final String getBottom_tips() {
        return this.bottom_tips;
    }

    @e
    public final ArrayList<NewFilterListObj> getFilter_list() {
        return this.filter_list;
    }

    @e
    public final ArrayList<KeyDescObj> getGame_type_list() {
        return this.game_type_list;
    }

    @e
    public final ArrayList<GeneralSearchInfo> getItems() {
        return this.items;
    }

    @e
    public final String getSearch_not_result_tips() {
        return this.search_not_result_tips;
    }

    @e
    public final ArrayList<KeyDescObj> getSort_filter_list() {
        return this.sort_filter_list;
    }

    @e
    public final ArrayList<KeyDescObj> getTime_range_list() {
        return this.time_range_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.mM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<GeneralSearchInfo> arrayList = this.items;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<KeyDescObj> arrayList2 = this.game_type_list;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList3 = this.sort_filter_list;
        int iHashCode3 = (iHashCode2 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList4 = this.time_range_list;
        int iHashCode4 = (iHashCode3 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        ArrayList<NewFilterListObj> arrayList5 = this.filter_list;
        int iHashCode5 = (iHashCode4 + (arrayList5 == null ? 0 : arrayList5.hashCode())) * 31;
        String str = this.bottom_tips;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.search_not_result_tips;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBottom_tips(@e String str) {
        this.bottom_tips = str;
    }

    public final void setFilter_list(@e ArrayList<NewFilterListObj> arrayList) {
        this.filter_list = arrayList;
    }

    public final void setGame_type_list(@e ArrayList<KeyDescObj> arrayList) {
        this.game_type_list = arrayList;
    }

    public final void setItems(@e ArrayList<GeneralSearchInfo> arrayList) {
        this.items = arrayList;
    }

    public final void setSearch_not_result_tips(@e String str) {
        this.search_not_result_tips = str;
    }

    public final void setSort_filter_list(@e ArrayList<KeyDescObj> arrayList) {
        this.sort_filter_list = arrayList;
    }

    public final void setTime_range_list(@e ArrayList<KeyDescObj> arrayList) {
        this.time_range_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.lM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GeneralSearchResultObj(items=" + this.items + ", game_type_list=" + this.game_type_list + ", sort_filter_list=" + this.sort_filter_list + ", time_range_list=" + this.time_range_list + ", filter_list=" + this.filter_list + ", bottom_tips=" + this.bottom_tips + ", search_not_result_tips=" + this.search_not_result_tips + ')';
    }
}
