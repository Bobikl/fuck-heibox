package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class StoryModeListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<ItemsObj> items;

    @e
    private PageObj page;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryModeListObj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public StoryModeListObj(@e List<ItemsObj> list, @e PageObj pageObj) {
        this.items = list;
        this.page = pageObj;
    }

    public /* synthetic */ StoryModeListObj(List list, PageObj pageObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : pageObj);
    }

    public static /* synthetic */ StoryModeListObj copy$default(StoryModeListObj storyModeListObj, List list, PageObj pageObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyModeListObj, list, pageObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15983, new Class[]{StoryModeListObj.class, List.class, PageObj.class, Integer.TYPE, Object.class}, StoryModeListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryModeListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = storyModeListObj.items;
        }
        if ((i10 & 2) != 0) {
            pageObj = storyModeListObj.page;
        }
        return storyModeListObj.copy(list, pageObj);
    }

    @e
    public final List<ItemsObj> component1() {
        return this.items;
    }

    @e
    public final PageObj component2() {
        return this.page;
    }

    @d
    public final StoryModeListObj copy(@e List<ItemsObj> list, @e PageObj pageObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, pageObj}, this, changeQuickRedirect, false, 15982, new Class[]{List.class, PageObj.class}, StoryModeListObj.class);
        return patchProxyResultProxy.isSupported ? (StoryModeListObj) patchProxyResultProxy.result : new StoryModeListObj(list, pageObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15986, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryModeListObj)) {
            return false;
        }
        StoryModeListObj storyModeListObj = (StoryModeListObj) obj;
        return f0.g(this.items, storyModeListObj.items) && f0.g(this.page, storyModeListObj.page);
    }

    @e
    public final List<ItemsObj> getItems() {
        return this.items;
    }

    @e
    public final PageObj getPage() {
        return this.page;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15985, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<ItemsObj> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PageObj pageObj = this.page;
        return iHashCode + (pageObj != null ? pageObj.hashCode() : 0);
    }

    public final void setItems(@e List<ItemsObj> list) {
        this.items = list;
    }

    public final void setPage(@e PageObj pageObj) {
        this.page = pageObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15984, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryModeListObj(items=" + this.items + ", page=" + this.page + ')';
    }
}
