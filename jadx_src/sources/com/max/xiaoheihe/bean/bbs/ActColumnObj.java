package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActColumnObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ActColumnObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ColumnInfoObj col;

    @e
    private String lastval;

    @e
    private ArrayList<BBSLinkObj> links;

    @e
    private ColumnInfoObj share_info;

    @e
    private ArrayList<ActColumnTabObj> tabs;

    public ActColumnObj(@e ColumnInfoObj columnInfoObj, @e String str, @e ArrayList<BBSLinkObj> arrayList, @e ColumnInfoObj columnInfoObj2, @e ArrayList<ActColumnTabObj> arrayList2) {
        this.col = columnInfoObj;
        this.lastval = str;
        this.links = arrayList;
        this.share_info = columnInfoObj2;
        this.tabs = arrayList2;
    }

    public static /* synthetic */ ActColumnObj copy$default(ActColumnObj actColumnObj, ColumnInfoObj columnInfoObj, String str, ArrayList arrayList, ColumnInfoObj columnInfoObj2, ArrayList arrayList2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{actColumnObj, columnInfoObj, str, arrayList, columnInfoObj2, arrayList2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14137, new Class[]{ActColumnObj.class, ColumnInfoObj.class, String.class, ArrayList.class, ColumnInfoObj.class, ArrayList.class, Integer.TYPE, Object.class}, ActColumnObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ActColumnObj) patchProxyResultProxy.result;
        }
        return actColumnObj.copy((i10 & 1) != 0 ? actColumnObj.col : columnInfoObj, (i10 & 2) != 0 ? actColumnObj.lastval : str, (i10 & 4) != 0 ? actColumnObj.links : arrayList, (i10 & 8) != 0 ? actColumnObj.share_info : columnInfoObj2, (i10 & 16) != 0 ? actColumnObj.tabs : arrayList2);
    }

    @e
    public final ColumnInfoObj component1() {
        return this.col;
    }

    @e
    public final String component2() {
        return this.lastval;
    }

    @e
    public final ArrayList<BBSLinkObj> component3() {
        return this.links;
    }

    @e
    public final ColumnInfoObj component4() {
        return this.share_info;
    }

    @e
    public final ArrayList<ActColumnTabObj> component5() {
        return this.tabs;
    }

    @d
    public final ActColumnObj copy(@e ColumnInfoObj columnInfoObj, @e String str, @e ArrayList<BBSLinkObj> arrayList, @e ColumnInfoObj columnInfoObj2, @e ArrayList<ActColumnTabObj> arrayList2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{columnInfoObj, str, arrayList, columnInfoObj2, arrayList2}, this, changeQuickRedirect, false, 14136, new Class[]{ColumnInfoObj.class, String.class, ArrayList.class, ColumnInfoObj.class, ArrayList.class}, ActColumnObj.class);
        return patchProxyResultProxy.isSupported ? (ActColumnObj) patchProxyResultProxy.result : new ActColumnObj(columnInfoObj, str, arrayList, columnInfoObj2, arrayList2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14140, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActColumnObj)) {
            return false;
        }
        ActColumnObj actColumnObj = (ActColumnObj) obj;
        return f0.g(this.col, actColumnObj.col) && f0.g(this.lastval, actColumnObj.lastval) && f0.g(this.links, actColumnObj.links) && f0.g(this.share_info, actColumnObj.share_info) && f0.g(this.tabs, actColumnObj.tabs);
    }

    @e
    public final ColumnInfoObj getCol() {
        return this.col;
    }

    @e
    public final String getLastval() {
        return this.lastval;
    }

    @e
    public final ArrayList<BBSLinkObj> getLinks() {
        return this.links;
    }

    @e
    public final ColumnInfoObj getShare_info() {
        return this.share_info;
    }

    @e
    public final ArrayList<ActColumnTabObj> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14139, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ColumnInfoObj columnInfoObj = this.col;
        int iHashCode = (columnInfoObj == null ? 0 : columnInfoObj.hashCode()) * 31;
        String str = this.lastval;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList<BBSLinkObj> arrayList = this.links;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ColumnInfoObj columnInfoObj2 = this.share_info;
        int iHashCode4 = (iHashCode3 + (columnInfoObj2 == null ? 0 : columnInfoObj2.hashCode())) * 31;
        ArrayList<ActColumnTabObj> arrayList2 = this.tabs;
        return iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final void setCol(@e ColumnInfoObj columnInfoObj) {
        this.col = columnInfoObj;
    }

    public final void setLastval(@e String str) {
        this.lastval = str;
    }

    public final void setLinks(@e ArrayList<BBSLinkObj> arrayList) {
        this.links = arrayList;
    }

    public final void setShare_info(@e ColumnInfoObj columnInfoObj) {
        this.share_info = columnInfoObj;
    }

    public final void setTabs(@e ArrayList<ActColumnTabObj> arrayList) {
        this.tabs = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14138, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ActColumnObj(col=" + this.col + ", lastval=" + this.lastval + ", links=" + this.links + ", share_info=" + this.share_info + ", tabs=" + this.tabs + ')';
    }
}
