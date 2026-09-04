package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeSteamInventoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamInventoryResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<? extends AdsBannerObj> banner;

    @e
    private Integer count;

    @e
    private ArrayList<TradeFilterTabObj> filter;

    @e
    private Integer has_bind_steam;

    @e
    private Integer has_trade_info;

    @e
    private String has_trade_info_desc;

    @e
    private ArrayList<TradeSteamInventoryObj> invalid_list;

    @e
    private String lastval;

    @e
    private ArrayList<TradeSteamInventoryObj> list;

    @e
    private String message;

    @e
    private Integer sale_setting;

    @e
    private List<? extends KeyDescObj> shortcuts;

    @e
    private ArrayList<KeyDescObj> sort_types;

    @e
    private String style;

    @e
    private String total_price;

    @e
    private ArrayList<TradeSteamInventoryObj> valid_list;

    public TradeSteamInventoryResult(@e Integer num, @e ArrayList<TradeSteamInventoryObj> arrayList, @e ArrayList<TradeSteamInventoryObj> arrayList2, @e ArrayList<TradeSteamInventoryObj> arrayList3, @e ArrayList<TradeFilterTabObj> arrayList4, @e ArrayList<KeyDescObj> arrayList5, @e String str, @e String str2, @e String str3, @e String str4, @e List<? extends AdsBannerObj> list, @e List<? extends KeyDescObj> list2, @e Integer num2, @e String str5, @e Integer num3, @e Integer num4) {
        this.count = num;
        this.list = arrayList;
        this.invalid_list = arrayList2;
        this.valid_list = arrayList3;
        this.filter = arrayList4;
        this.sort_types = arrayList5;
        this.total_price = str;
        this.style = str2;
        this.message = str3;
        this.lastval = str4;
        this.banner = list;
        this.shortcuts = list2;
        this.has_trade_info = num2;
        this.has_trade_info_desc = str5;
        this.has_bind_steam = num3;
        this.sale_setting = num4;
    }

    public static /* synthetic */ TradeSteamInventoryResult copy$default(TradeSteamInventoryResult tradeSteamInventoryResult, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str, String str2, String str3, String str4, List list, List list2, Integer num2, String str5, Integer num3, Integer num4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamInventoryResult, num, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2, str3, str4, list, list2, num2, str5, num3, num4, new Integer(i10), obj}, null, changeQuickRedirect, true, 16188, new Class[]{TradeSteamInventoryResult.class, Integer.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class, String.class, String.class, List.class, List.class, Integer.class, String.class, Integer.class, Integer.class, Integer.TYPE, Object.class}, TradeSteamInventoryResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamInventoryResult) patchProxyResultProxy.result;
        }
        return tradeSteamInventoryResult.copy((i10 & 1) != 0 ? tradeSteamInventoryResult.count : num, (i10 & 2) != 0 ? tradeSteamInventoryResult.list : arrayList, (i10 & 4) != 0 ? tradeSteamInventoryResult.invalid_list : arrayList2, (i10 & 8) != 0 ? tradeSteamInventoryResult.valid_list : arrayList3, (i10 & 16) != 0 ? tradeSteamInventoryResult.filter : arrayList4, (i10 & 32) != 0 ? tradeSteamInventoryResult.sort_types : arrayList5, (i10 & 64) != 0 ? tradeSteamInventoryResult.total_price : str, (i10 & 128) != 0 ? tradeSteamInventoryResult.style : str2, (i10 & 256) != 0 ? tradeSteamInventoryResult.message : str3, (i10 & 512) != 0 ? tradeSteamInventoryResult.lastval : str4, (i10 & 1024) != 0 ? tradeSteamInventoryResult.banner : list, (i10 & 2048) != 0 ? tradeSteamInventoryResult.shortcuts : list2, (i10 & 4096) != 0 ? tradeSteamInventoryResult.has_trade_info : num2, (i10 & 8192) != 0 ? tradeSteamInventoryResult.has_trade_info_desc : str5, (i10 & 16384) != 0 ? tradeSteamInventoryResult.has_bind_steam : num3, (i10 & 32768) != 0 ? tradeSteamInventoryResult.sale_setting : num4);
    }

    @e
    public final Integer component1() {
        return this.count;
    }

    @e
    public final String component10() {
        return this.lastval;
    }

    @e
    public final List<AdsBannerObj> component11() {
        return this.banner;
    }

    @e
    public final List<KeyDescObj> component12() {
        return this.shortcuts;
    }

    @e
    public final Integer component13() {
        return this.has_trade_info;
    }

    @e
    public final String component14() {
        return this.has_trade_info_desc;
    }

    @e
    public final Integer component15() {
        return this.has_bind_steam;
    }

    @e
    public final Integer component16() {
        return this.sale_setting;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> component2() {
        return this.list;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> component3() {
        return this.invalid_list;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> component4() {
        return this.valid_list;
    }

    @e
    public final ArrayList<TradeFilterTabObj> component5() {
        return this.filter;
    }

    @e
    public final ArrayList<KeyDescObj> component6() {
        return this.sort_types;
    }

    @e
    public final String component7() {
        return this.total_price;
    }

    @e
    public final String component8() {
        return this.style;
    }

    @e
    public final String component9() {
        return this.message;
    }

    @d
    public final TradeSteamInventoryResult copy(@e Integer num, @e ArrayList<TradeSteamInventoryObj> arrayList, @e ArrayList<TradeSteamInventoryObj> arrayList2, @e ArrayList<TradeSteamInventoryObj> arrayList3, @e ArrayList<TradeFilterTabObj> arrayList4, @e ArrayList<KeyDescObj> arrayList5, @e String str, @e String str2, @e String str3, @e String str4, @e List<? extends AdsBannerObj> list, @e List<? extends KeyDescObj> list2, @e Integer num2, @e String str5, @e Integer num3, @e Integer num4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2, str3, str4, list, list2, num2, str5, num3, num4}, this, changeQuickRedirect, false, 16187, new Class[]{Integer.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, ArrayList.class, String.class, String.class, String.class, String.class, List.class, List.class, Integer.class, String.class, Integer.class, Integer.class}, TradeSteamInventoryResult.class);
        return patchProxyResultProxy.isSupported ? (TradeSteamInventoryResult) patchProxyResultProxy.result : new TradeSteamInventoryResult(num, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str, str2, str3, str4, list, list2, num2, str5, num3, num4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16191, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSteamInventoryResult)) {
            return false;
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = (TradeSteamInventoryResult) obj;
        return f0.g(this.count, tradeSteamInventoryResult.count) && f0.g(this.list, tradeSteamInventoryResult.list) && f0.g(this.invalid_list, tradeSteamInventoryResult.invalid_list) && f0.g(this.valid_list, tradeSteamInventoryResult.valid_list) && f0.g(this.filter, tradeSteamInventoryResult.filter) && f0.g(this.sort_types, tradeSteamInventoryResult.sort_types) && f0.g(this.total_price, tradeSteamInventoryResult.total_price) && f0.g(this.style, tradeSteamInventoryResult.style) && f0.g(this.message, tradeSteamInventoryResult.message) && f0.g(this.lastval, tradeSteamInventoryResult.lastval) && f0.g(this.banner, tradeSteamInventoryResult.banner) && f0.g(this.shortcuts, tradeSteamInventoryResult.shortcuts) && f0.g(this.has_trade_info, tradeSteamInventoryResult.has_trade_info) && f0.g(this.has_trade_info_desc, tradeSteamInventoryResult.has_trade_info_desc) && f0.g(this.has_bind_steam, tradeSteamInventoryResult.has_bind_steam) && f0.g(this.sale_setting, tradeSteamInventoryResult.sale_setting);
    }

    @e
    public final List<AdsBannerObj> getBanner() {
        return this.banner;
    }

    @e
    public final Integer getCount() {
        return this.count;
    }

    @e
    public final ArrayList<TradeFilterTabObj> getFilter() {
        return this.filter;
    }

    @e
    public final Integer getHas_bind_steam() {
        return this.has_bind_steam;
    }

    @e
    public final Integer getHas_trade_info() {
        return this.has_trade_info;
    }

    @e
    public final String getHas_trade_info_desc() {
        return this.has_trade_info_desc;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> getInvalid_list() {
        return this.invalid_list;
    }

    @e
    public final String getLastval() {
        return this.lastval;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> getList() {
        return this.list;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final Integer getSale_setting() {
        return this.sale_setting;
    }

    @e
    public final List<KeyDescObj> getShortcuts() {
        return this.shortcuts;
    }

    @e
    public final ArrayList<KeyDescObj> getSort_types() {
        return this.sort_types;
    }

    @e
    public final String getStyle() {
        return this.style;
    }

    @e
    public final String getTotal_price() {
        return this.total_price;
    }

    @e
    public final ArrayList<TradeSteamInventoryObj> getValid_list() {
        return this.valid_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16190, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ArrayList<TradeSteamInventoryObj> arrayList = this.list;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<TradeSteamInventoryObj> arrayList2 = this.invalid_list;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<TradeSteamInventoryObj> arrayList3 = this.valid_list;
        int iHashCode4 = (iHashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList<TradeFilterTabObj> arrayList4 = this.filter;
        int iHashCode5 = (iHashCode4 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList5 = this.sort_types;
        int iHashCode6 = (iHashCode5 + (arrayList5 == null ? 0 : arrayList5.hashCode())) * 31;
        String str = this.total_price;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastval;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<? extends AdsBannerObj> list = this.banner;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends KeyDescObj> list2 = this.shortcuts;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.has_trade_info;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.has_trade_info_desc;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.has_bind_steam;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sale_setting;
        return iHashCode15 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setBanner(@e List<? extends AdsBannerObj> list) {
        this.banner = list;
    }

    public final void setCount(@e Integer num) {
        this.count = num;
    }

    public final void setFilter(@e ArrayList<TradeFilterTabObj> arrayList) {
        this.filter = arrayList;
    }

    public final void setHas_bind_steam(@e Integer num) {
        this.has_bind_steam = num;
    }

    public final void setHas_trade_info(@e Integer num) {
        this.has_trade_info = num;
    }

    public final void setHas_trade_info_desc(@e String str) {
        this.has_trade_info_desc = str;
    }

    public final void setInvalid_list(@e ArrayList<TradeSteamInventoryObj> arrayList) {
        this.invalid_list = arrayList;
    }

    public final void setLastval(@e String str) {
        this.lastval = str;
    }

    public final void setList(@e ArrayList<TradeSteamInventoryObj> arrayList) {
        this.list = arrayList;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setSale_setting(@e Integer num) {
        this.sale_setting = num;
    }

    public final void setShortcuts(@e List<? extends KeyDescObj> list) {
        this.shortcuts = list;
    }

    public final void setSort_types(@e ArrayList<KeyDescObj> arrayList) {
        this.sort_types = arrayList;
    }

    public final void setStyle(@e String str) {
        this.style = str;
    }

    public final void setTotal_price(@e String str) {
        this.total_price = str;
    }

    public final void setValid_list(@e ArrayList<TradeSteamInventoryObj> arrayList) {
        this.valid_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16189, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamInventoryResult(count=" + this.count + ", list=" + this.list + ", invalid_list=" + this.invalid_list + ", valid_list=" + this.valid_list + ", filter=" + this.filter + ", sort_types=" + this.sort_types + ", total_price=" + this.total_price + ", style=" + this.style + ", message=" + this.message + ", lastval=" + this.lastval + ", banner=" + this.banner + ", shortcuts=" + this.shortcuts + ", has_trade_info=" + this.has_trade_info + ", has_trade_info_desc=" + this.has_trade_info_desc + ", has_bind_steam=" + this.has_bind_steam + ", sale_setting=" + this.sale_setting + ')';
    }
}
