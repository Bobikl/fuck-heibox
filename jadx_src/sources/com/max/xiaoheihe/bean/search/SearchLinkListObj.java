package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchLinkListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchLinkListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<? extends BBSLinkObj> link_list;

    @e
    private String more_prot;

    public SearchLinkListObj(@e String str, @e List<? extends BBSLinkObj> list) {
        this.more_prot = str;
        this.link_list = list;
    }

    public static /* synthetic */ SearchLinkListObj copy$default(SearchLinkListObj searchLinkListObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchLinkListObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15863, new Class[]{SearchLinkListObj.class, String.class, List.class, Integer.TYPE, Object.class}, SearchLinkListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchLinkListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchLinkListObj.more_prot;
        }
        if ((i10 & 2) != 0) {
            list = searchLinkListObj.link_list;
        }
        return searchLinkListObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.more_prot;
    }

    @e
    public final List<BBSLinkObj> component2() {
        return this.link_list;
    }

    @d
    public final SearchLinkListObj copy(@e String str, @e List<? extends BBSLinkObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 15862, new Class[]{String.class, List.class}, SearchLinkListObj.class);
        return patchProxyResultProxy.isSupported ? (SearchLinkListObj) patchProxyResultProxy.result : new SearchLinkListObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15866, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLinkListObj)) {
            return false;
        }
        SearchLinkListObj searchLinkListObj = (SearchLinkListObj) obj;
        return f0.g(this.more_prot, searchLinkListObj.more_prot) && f0.g(this.link_list, searchLinkListObj.link_list);
    }

    @e
    public final List<BBSLinkObj> getLink_list() {
        return this.link_list;
    }

    @e
    public final String getMore_prot() {
        return this.more_prot;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15865, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.more_prot;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends BBSLinkObj> list = this.link_list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setLink_list(@e List<? extends BBSLinkObj> list) {
        this.link_list = list;
    }

    public final void setMore_prot(@e String str) {
        this.more_prot = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15864, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchLinkListObj(more_prot=" + this.more_prot + ", link_list=" + this.link_list + ')';
    }
}
