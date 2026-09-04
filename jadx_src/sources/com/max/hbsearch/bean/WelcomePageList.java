package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class WelcomePageList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String head_text;

    @e
    private Boolean is_hot;

    @e
    private List<WelcomePageListItem> items;

    @e
    private String tab_type;

    public WelcomePageList(@e List<WelcomePageListItem> list, @e String str, @e Boolean bool, @e String str2) {
        this.items = list;
        this.head_text = str;
        this.is_hot = bool;
        this.tab_type = str2;
    }

    public static /* synthetic */ WelcomePageList copy$default(WelcomePageList welcomePageList, List list, String str, Boolean bool, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{welcomePageList, list, str, bool, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.S7, new Class[]{WelcomePageList.class, List.class, String.class, Boolean.class, String.class, Integer.TYPE, Object.class}, WelcomePageList.class);
        if (patchProxyResultProxy.isSupported) {
            return (WelcomePageList) patchProxyResultProxy.result;
        }
        return welcomePageList.copy((i10 & 1) != 0 ? welcomePageList.items : list, (i10 & 2) != 0 ? welcomePageList.head_text : str, (i10 & 4) != 0 ? welcomePageList.is_hot : bool, (i10 & 8) != 0 ? welcomePageList.tab_type : str2);
    }

    @e
    public final List<WelcomePageListItem> component1() {
        return this.items;
    }

    @e
    public final String component2() {
        return this.head_text;
    }

    @e
    public final Boolean component3() {
        return this.is_hot;
    }

    @e
    public final String component4() {
        return this.tab_type;
    }

    @d
    public final WelcomePageList copy(@e List<WelcomePageListItem> list, @e String str, @e Boolean bool, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, bool, str2}, this, changeQuickRedirect, false, c.k.R7, new Class[]{List.class, String.class, Boolean.class, String.class}, WelcomePageList.class);
        return patchProxyResultProxy.isSupported ? (WelcomePageList) patchProxyResultProxy.result : new WelcomePageList(list, str, bool, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.V7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomePageList)) {
            return false;
        }
        WelcomePageList welcomePageList = (WelcomePageList) obj;
        return f0.g(this.items, welcomePageList.items) && f0.g(this.head_text, welcomePageList.head_text) && f0.g(this.is_hot, welcomePageList.is_hot) && f0.g(this.tab_type, welcomePageList.tab_type);
    }

    @e
    public final String getHead_text() {
        return this.head_text;
    }

    @e
    public final List<WelcomePageListItem> getItems() {
        return this.items;
    }

    @e
    public final String getTab_type() {
        return this.tab_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.U7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<WelcomePageListItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.head_text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.is_hot;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.tab_type;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @e
    public final Boolean is_hot() {
        return this.is_hot;
    }

    public final void setHead_text(@e String str) {
        this.head_text = str;
    }

    public final void setItems(@e List<WelcomePageListItem> list) {
        this.items = list;
    }

    public final void setTab_type(@e String str) {
        this.tab_type = str;
    }

    public final void set_hot(@e Boolean bool) {
        this.is_hot = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.T7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WelcomePageList(items=" + this.items + ", head_text=" + this.head_text + ", is_hot=" + this.is_hot + ", tab_type=" + this.tab_type + ')';
    }
}
