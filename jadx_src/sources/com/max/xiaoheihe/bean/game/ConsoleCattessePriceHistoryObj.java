package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConsoleCattessePriceHistoryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ConsoleCattessePriceHistoryObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameDetailDataObj> game_data;

    @e
    private List<PricePointObj> prices;

    @e
    private String start_price;

    public ConsoleCattessePriceHistoryObj(@e List<PricePointObj> list, @e List<GameDetailDataObj> list2, @e String str) {
        this.prices = list;
        this.game_data = list2;
        this.start_price = str;
    }

    public static /* synthetic */ ConsoleCattessePriceHistoryObj copy$default(ConsoleCattessePriceHistoryObj consoleCattessePriceHistoryObj, List list, List list2, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{consoleCattessePriceHistoryObj, list, list2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14663, new Class[]{ConsoleCattessePriceHistoryObj.class, List.class, List.class, String.class, Integer.TYPE, Object.class}, ConsoleCattessePriceHistoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConsoleCattessePriceHistoryObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = consoleCattessePriceHistoryObj.prices;
        }
        if ((i10 & 2) != 0) {
            list2 = consoleCattessePriceHistoryObj.game_data;
        }
        if ((i10 & 4) != 0) {
            str = consoleCattessePriceHistoryObj.start_price;
        }
        return consoleCattessePriceHistoryObj.copy(list, list2, str);
    }

    @e
    public final List<PricePointObj> component1() {
        return this.prices;
    }

    @e
    public final List<GameDetailDataObj> component2() {
        return this.game_data;
    }

    @e
    public final String component3() {
        return this.start_price;
    }

    @d
    public final ConsoleCattessePriceHistoryObj copy(@e List<PricePointObj> list, @e List<GameDetailDataObj> list2, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, str}, this, changeQuickRedirect, false, 14662, new Class[]{List.class, List.class, String.class}, ConsoleCattessePriceHistoryObj.class);
        return patchProxyResultProxy.isSupported ? (ConsoleCattessePriceHistoryObj) patchProxyResultProxy.result : new ConsoleCattessePriceHistoryObj(list, list2, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14666, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsoleCattessePriceHistoryObj)) {
            return false;
        }
        ConsoleCattessePriceHistoryObj consoleCattessePriceHistoryObj = (ConsoleCattessePriceHistoryObj) obj;
        return f0.g(this.prices, consoleCattessePriceHistoryObj.prices) && f0.g(this.game_data, consoleCattessePriceHistoryObj.game_data) && f0.g(this.start_price, consoleCattessePriceHistoryObj.start_price);
    }

    @e
    public final List<GameDetailDataObj> getGame_data() {
        return this.game_data;
    }

    @e
    public final List<PricePointObj> getPrices() {
        return this.prices;
    }

    @e
    public final String getStart_price() {
        return this.start_price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14665, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<PricePointObj> list = this.prices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GameDetailDataObj> list2 = this.game_data;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.start_price;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setGame_data(@e List<GameDetailDataObj> list) {
        this.game_data = list;
    }

    public final void setPrices(@e List<PricePointObj> list) {
        this.prices = list;
    }

    public final void setStart_price(@e String str) {
        this.start_price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14664, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ConsoleCattessePriceHistoryObj(prices=" + this.prices + ", game_data=" + this.game_data + ", start_price=" + this.start_price + ')';
    }
}
