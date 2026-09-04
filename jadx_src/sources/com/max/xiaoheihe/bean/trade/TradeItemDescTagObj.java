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

/* JADX INFO: compiled from: TradeItemDescTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeItemDescTagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<TradeItemTag> tags;

    @e
    private ArrayList<String> user_tag_ids;

    public TradeItemDescTagObj(@e ArrayList<String> arrayList, @e ArrayList<TradeItemTag> arrayList2) {
        this.user_tag_ids = arrayList;
        this.tags = arrayList2;
    }

    public static /* synthetic */ TradeItemDescTagObj copy$default(TradeItemDescTagObj tradeItemDescTagObj, ArrayList arrayList, ArrayList arrayList2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemDescTagObj, arrayList, arrayList2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16091, new Class[]{TradeItemDescTagObj.class, ArrayList.class, ArrayList.class, Integer.TYPE, Object.class}, TradeItemDescTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeItemDescTagObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = tradeItemDescTagObj.user_tag_ids;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = tradeItemDescTagObj.tags;
        }
        return tradeItemDescTagObj.copy(arrayList, arrayList2);
    }

    @e
    public final ArrayList<String> component1() {
        return this.user_tag_ids;
    }

    @e
    public final ArrayList<TradeItemTag> component2() {
        return this.tags;
    }

    @d
    public final TradeItemDescTagObj copy(@e ArrayList<String> arrayList, @e ArrayList<TradeItemTag> arrayList2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2}, this, changeQuickRedirect, false, 16090, new Class[]{ArrayList.class, ArrayList.class}, TradeItemDescTagObj.class);
        return patchProxyResultProxy.isSupported ? (TradeItemDescTagObj) patchProxyResultProxy.result : new TradeItemDescTagObj(arrayList, arrayList2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16094, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeItemDescTagObj)) {
            return false;
        }
        TradeItemDescTagObj tradeItemDescTagObj = (TradeItemDescTagObj) obj;
        return f0.g(this.user_tag_ids, tradeItemDescTagObj.user_tag_ids) && f0.g(this.tags, tradeItemDescTagObj.tags);
    }

    @e
    public final ArrayList<TradeItemTag> getTags() {
        return this.tags;
    }

    @e
    public final ArrayList<String> getUser_tag_ids() {
        return this.user_tag_ids;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16093, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<String> arrayList = this.user_tag_ids;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<TradeItemTag> arrayList2 = this.tags;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final void setTags(@e ArrayList<TradeItemTag> arrayList) {
        this.tags = arrayList;
    }

    public final void setUser_tag_ids(@e ArrayList<String> arrayList) {
        this.user_tag_ids = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16092, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeItemDescTagObj(user_tag_ids=" + this.user_tag_ids + ", tags=" + this.tags + ')';
    }
}
