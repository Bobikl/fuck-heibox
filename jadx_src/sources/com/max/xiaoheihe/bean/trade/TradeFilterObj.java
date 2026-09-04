package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeFilterObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeFilterObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String key;

    @e
    private ArrayList<TradeFilterItemObj> list;

    @e
    private String show;

    @e
    private String sub_cat;

    public TradeFilterObj(@e String str, @e String str2, @e String str3, @e String str4, @e ArrayList<TradeFilterItemObj> arrayList) {
        this.desc = str;
        this.sub_cat = str2;
        this.show = str3;
        this.key = str4;
        this.list = arrayList;
    }

    public static /* synthetic */ TradeFilterObj copy$default(TradeFilterObj tradeFilterObj, String str, String str2, String str3, String str4, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeFilterObj, str, str2, str3, str4, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 16071, new Class[]{TradeFilterObj.class, String.class, String.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, TradeFilterObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterObj) patchProxyResultProxy.result;
        }
        return tradeFilterObj.copy((i10 & 1) != 0 ? tradeFilterObj.desc : str, (i10 & 2) != 0 ? tradeFilterObj.sub_cat : str2, (i10 & 4) != 0 ? tradeFilterObj.show : str3, (i10 & 8) != 0 ? tradeFilterObj.key : str4, (i10 & 16) != 0 ? tradeFilterObj.list : arrayList);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.sub_cat;
    }

    @e
    public final String component3() {
        return this.show;
    }

    @e
    public final String component4() {
        return this.key;
    }

    @e
    public final ArrayList<TradeFilterItemObj> component5() {
        return this.list;
    }

    @d
    public final TradeFilterObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e ArrayList<TradeFilterItemObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, arrayList}, this, changeQuickRedirect, false, 16070, new Class[]{String.class, String.class, String.class, String.class, ArrayList.class}, TradeFilterObj.class);
        return patchProxyResultProxy.isSupported ? (TradeFilterObj) patchProxyResultProxy.result : new TradeFilterObj(str, str2, str3, str4, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16074, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeFilterObj)) {
            return false;
        }
        TradeFilterObj tradeFilterObj = (TradeFilterObj) obj;
        return f0.g(this.desc, tradeFilterObj.desc) && f0.g(this.sub_cat, tradeFilterObj.sub_cat) && f0.g(this.show, tradeFilterObj.show) && f0.g(this.key, tradeFilterObj.key) && f0.g(this.list, tradeFilterObj.list);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final ArrayList<TradeFilterItemObj> getList() {
        return this.list;
    }

    @e
    public final String getShow() {
        return this.show;
    }

    @e
    public final String getSub_cat() {
        return this.sub_cat;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16073, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sub_cat;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.show;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.key;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<TradeFilterItemObj> arrayList = this.list;
        return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setList(@e ArrayList<TradeFilterItemObj> arrayList) {
        this.list = arrayList;
    }

    public final void setShow(@e String str) {
        this.show = str;
    }

    public final void setSub_cat(@e String str) {
        this.sub_cat = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16072, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeFilterObj(desc=" + this.desc + ", sub_cat=" + this.sub_cat + ", show=" + this.show + ", key=" + this.key + ", list=" + this.list + ')';
    }
}
