package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeFilterTabObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeFilterTabObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String desc;

    @d
    private String key;

    @d
    private ArrayList<TradeFilterObj> list;

    @d
    private String short_desc;

    public TradeFilterTabObj(@d String desc, @d String short_desc, @d String key, @d ArrayList<TradeFilterObj> list) {
        f0.p(desc, "desc");
        f0.p(short_desc, "short_desc");
        f0.p(key, "key");
        f0.p(list, "list");
        this.desc = desc;
        this.short_desc = short_desc;
        this.key = key;
        this.list = list;
    }

    public static /* synthetic */ TradeFilterTabObj copy$default(TradeFilterTabObj tradeFilterTabObj, String str, String str2, String str3, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeFilterTabObj, str, str2, str3, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 16081, new Class[]{TradeFilterTabObj.class, String.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, TradeFilterTabObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterTabObj) patchProxyResultProxy.result;
        }
        return tradeFilterTabObj.copy((i10 & 1) != 0 ? tradeFilterTabObj.desc : str, (i10 & 2) != 0 ? tradeFilterTabObj.short_desc : str2, (i10 & 4) != 0 ? tradeFilterTabObj.key : str3, (i10 & 8) != 0 ? tradeFilterTabObj.list : arrayList);
    }

    @d
    public final String component1() {
        return this.desc;
    }

    @d
    public final String component2() {
        return this.short_desc;
    }

    @d
    public final String component3() {
        return this.key;
    }

    @d
    public final ArrayList<TradeFilterObj> component4() {
        return this.list;
    }

    @d
    public final TradeFilterTabObj copy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16079, new Class[0], TradeFilterTabObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterTabObj) patchProxyResultProxy.result;
        }
        Object objFromJson = new Gson().fromJson(new Gson().toJson(this), (Class<Object>) TradeFilterTabObj.class);
        f0.o(objFromJson, "Gson().fromJson(Gson().t…on(this), this.javaClass)");
        return (TradeFilterTabObj) objFromJson;
    }

    @d
    public final TradeFilterTabObj copy(@d String desc, @d String short_desc, @d String key, @d ArrayList<TradeFilterObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{desc, short_desc, key, list}, this, changeQuickRedirect, false, 16080, new Class[]{String.class, String.class, String.class, ArrayList.class}, TradeFilterTabObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterTabObj) patchProxyResultProxy.result;
        }
        f0.p(desc, "desc");
        f0.p(short_desc, "short_desc");
        f0.p(key, "key");
        f0.p(list, "list");
        return new TradeFilterTabObj(desc, short_desc, key, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16084, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeFilterTabObj)) {
            return false;
        }
        TradeFilterTabObj tradeFilterTabObj = (TradeFilterTabObj) obj;
        return f0.g(this.desc, tradeFilterTabObj.desc) && f0.g(this.short_desc, tradeFilterTabObj.short_desc) && f0.g(this.key, tradeFilterTabObj.key) && f0.g(this.list, tradeFilterTabObj.list);
    }

    @d
    public final String getDesc() {
        return this.desc;
    }

    @d
    public final String getKey() {
        return this.key;
    }

    @d
    public final ArrayList<TradeFilterObj> getList() {
        return this.list;
    }

    @d
    public final String getShort_desc() {
        return this.short_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16083, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((this.desc.hashCode() * 31) + this.short_desc.hashCode()) * 31) + this.key.hashCode()) * 31) + this.list.hashCode();
    }

    public final void setDesc(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16075, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.desc = str;
    }

    public final void setKey(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16077, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.key = str;
    }

    public final void setList(@d ArrayList<TradeFilterObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 16078, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setShort_desc(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16076, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.short_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16082, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeFilterTabObj(desc=" + this.desc + ", short_desc=" + this.short_desc + ", key=" + this.key + ", list=" + this.list + ')';
    }
}
