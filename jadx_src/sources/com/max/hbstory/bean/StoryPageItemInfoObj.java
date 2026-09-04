package com.max.hbstory.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryData.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryPageItemInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<StoryItemsObj> items;

    @e
    private StoryPageObj page;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryPageItemInfoObj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public StoryPageItemInfoObj(@e List<StoryItemsObj> list, @e StoryPageObj storyPageObj) {
        this.items = list;
        this.page = storyPageObj;
    }

    public /* synthetic */ StoryPageItemInfoObj(List list, StoryPageObj storyPageObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : storyPageObj);
    }

    public static /* synthetic */ StoryPageItemInfoObj copy$default(StoryPageItemInfoObj storyPageItemInfoObj, List list, StoryPageObj storyPageObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyPageItemInfoObj, list, storyPageObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33781pe, new Class[]{StoryPageItemInfoObj.class, List.class, StoryPageObj.class, Integer.TYPE, Object.class}, StoryPageItemInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryPageItemInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = storyPageItemInfoObj.items;
        }
        if ((i10 & 2) != 0) {
            storyPageObj = storyPageItemInfoObj.page;
        }
        return storyPageItemInfoObj.copy(list, storyPageObj);
    }

    @e
    public final List<StoryItemsObj> component1() {
        return this.items;
    }

    @e
    public final StoryPageObj component2() {
        return this.page;
    }

    @d
    public final StoryPageItemInfoObj copy(@e List<StoryItemsObj> list, @e StoryPageObj storyPageObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, storyPageObj}, this, changeQuickRedirect, false, c.k.f33758oe, new Class[]{List.class, StoryPageObj.class}, StoryPageItemInfoObj.class);
        return patchProxyResultProxy.isSupported ? (StoryPageItemInfoObj) patchProxyResultProxy.result : new StoryPageItemInfoObj(list, storyPageObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33848se, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPageItemInfoObj)) {
            return false;
        }
        StoryPageItemInfoObj storyPageItemInfoObj = (StoryPageItemInfoObj) obj;
        return f0.g(this.items, storyPageItemInfoObj.items) && f0.g(this.page, storyPageItemInfoObj.page);
    }

    @e
    public final List<StoryItemsObj> getItems() {
        return this.items;
    }

    @e
    public final StoryPageObj getPage() {
        return this.page;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33826re, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<StoryItemsObj> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        StoryPageObj storyPageObj = this.page;
        return iHashCode + (storyPageObj != null ? storyPageObj.hashCode() : 0);
    }

    public final void setItems(@e List<StoryItemsObj> list) {
        this.items = list;
    }

    public final void setPage(@e StoryPageObj storyPageObj) {
        this.page = storyPageObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33804qe, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryPageItemInfoObj(items=" + this.items + ", page=" + this.page + ')';
    }
}
