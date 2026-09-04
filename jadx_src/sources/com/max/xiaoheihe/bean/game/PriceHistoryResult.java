package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PriceHistoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PriceHistoryResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private LowestInfoObj lowest_info;

    @e
    private LowestInfoV2Obj lowest_info_v2;

    @e
    private String mDays;

    @e
    private ArrayList<PricePointObj> prices;

    @e
    private ArrayList<RegionObj> regions;

    public PriceHistoryResult(@e ArrayList<RegionObj> arrayList, @e ArrayList<PricePointObj> arrayList2, @e LowestInfoObj lowestInfoObj, @e LowestInfoV2Obj lowestInfoV2Obj, @e String str) {
        this.regions = arrayList;
        this.prices = arrayList2;
        this.lowest_info = lowestInfoObj;
        this.lowest_info_v2 = lowestInfoV2Obj;
        this.mDays = str;
    }

    public /* synthetic */ PriceHistoryResult(ArrayList arrayList, ArrayList arrayList2, LowestInfoObj lowestInfoObj, LowestInfoV2Obj lowestInfoV2Obj, String str, int i10, u uVar) {
        this(arrayList, arrayList2, lowestInfoObj, lowestInfoV2Obj, (i10 & 16) != 0 ? d0.f87252x : str);
    }

    public static /* synthetic */ PriceHistoryResult copy$default(PriceHistoryResult priceHistoryResult, ArrayList arrayList, ArrayList arrayList2, LowestInfoObj lowestInfoObj, LowestInfoV2Obj lowestInfoV2Obj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priceHistoryResult, arrayList, arrayList2, lowestInfoObj, lowestInfoV2Obj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14951, new Class[]{PriceHistoryResult.class, ArrayList.class, ArrayList.class, LowestInfoObj.class, LowestInfoV2Obj.class, String.class, Integer.TYPE, Object.class}, PriceHistoryResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (PriceHistoryResult) patchProxyResultProxy.result;
        }
        return priceHistoryResult.copy((i10 & 1) != 0 ? priceHistoryResult.regions : arrayList, (i10 & 2) != 0 ? priceHistoryResult.prices : arrayList2, (i10 & 4) != 0 ? priceHistoryResult.lowest_info : lowestInfoObj, (i10 & 8) != 0 ? priceHistoryResult.lowest_info_v2 : lowestInfoV2Obj, (i10 & 16) != 0 ? priceHistoryResult.mDays : str);
    }

    @e
    public final ArrayList<RegionObj> component1() {
        return this.regions;
    }

    @e
    public final ArrayList<PricePointObj> component2() {
        return this.prices;
    }

    @e
    public final LowestInfoObj component3() {
        return this.lowest_info;
    }

    @e
    public final LowestInfoV2Obj component4() {
        return this.lowest_info_v2;
    }

    @e
    public final String component5() {
        return this.mDays;
    }

    @d
    public final PriceHistoryResult copy(@e ArrayList<RegionObj> arrayList, @e ArrayList<PricePointObj> arrayList2, @e LowestInfoObj lowestInfoObj, @e LowestInfoV2Obj lowestInfoV2Obj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, lowestInfoObj, lowestInfoV2Obj, str}, this, changeQuickRedirect, false, 14950, new Class[]{ArrayList.class, ArrayList.class, LowestInfoObj.class, LowestInfoV2Obj.class, String.class}, PriceHistoryResult.class);
        return patchProxyResultProxy.isSupported ? (PriceHistoryResult) patchProxyResultProxy.result : new PriceHistoryResult(arrayList, arrayList2, lowestInfoObj, lowestInfoV2Obj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14954, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceHistoryResult)) {
            return false;
        }
        PriceHistoryResult priceHistoryResult = (PriceHistoryResult) obj;
        return f0.g(this.regions, priceHistoryResult.regions) && f0.g(this.prices, priceHistoryResult.prices) && f0.g(this.lowest_info, priceHistoryResult.lowest_info) && f0.g(this.lowest_info_v2, priceHistoryResult.lowest_info_v2) && f0.g(this.mDays, priceHistoryResult.mDays);
    }

    @e
    public final LowestInfoObj getLowest_info() {
        return this.lowest_info;
    }

    @e
    public final LowestInfoV2Obj getLowest_info_v2() {
        return this.lowest_info_v2;
    }

    @e
    public final String getMDays() {
        return this.mDays;
    }

    @e
    public final ArrayList<PricePointObj> getPrices() {
        return this.prices;
    }

    @e
    public final ArrayList<RegionObj> getRegions() {
        return this.regions;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14953, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<RegionObj> arrayList = this.regions;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<PricePointObj> arrayList2 = this.prices;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        LowestInfoObj lowestInfoObj = this.lowest_info;
        int iHashCode3 = (iHashCode2 + (lowestInfoObj == null ? 0 : lowestInfoObj.hashCode())) * 31;
        LowestInfoV2Obj lowestInfoV2Obj = this.lowest_info_v2;
        int iHashCode4 = (iHashCode3 + (lowestInfoV2Obj == null ? 0 : lowestInfoV2Obj.hashCode())) * 31;
        String str = this.mDays;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final void setLowest_info(@e LowestInfoObj lowestInfoObj) {
        this.lowest_info = lowestInfoObj;
    }

    public final void setLowest_info_v2(@e LowestInfoV2Obj lowestInfoV2Obj) {
        this.lowest_info_v2 = lowestInfoV2Obj;
    }

    public final void setMDays(@e String str) {
        this.mDays = str;
    }

    public final void setPrices(@e ArrayList<PricePointObj> arrayList) {
        this.prices = arrayList;
    }

    public final void setRegions(@e ArrayList<RegionObj> arrayList) {
        this.regions = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14952, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PriceHistoryResult(regions=" + this.regions + ", prices=" + this.prices + ", lowest_info=" + this.lowest_info + ", lowest_info_v2=" + this.lowest_info_v2 + ", mDays=" + this.mDays + ')';
    }
}
