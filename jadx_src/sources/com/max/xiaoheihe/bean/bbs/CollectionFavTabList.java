package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CollectionFolders.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CollectionFavTabList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<CollectionFavTab> tab_list;

    public CollectionFavTabList(@e List<CollectionFavTab> list) {
        this.tab_list = list;
    }

    public static /* synthetic */ CollectionFavTabList copy$default(CollectionFavTabList collectionFavTabList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFavTabList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14218, new Class[]{CollectionFavTabList.class, List.class, Integer.TYPE, Object.class}, CollectionFavTabList.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFavTabList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = collectionFavTabList.tab_list;
        }
        return collectionFavTabList.copy(list);
    }

    @e
    public final List<CollectionFavTab> component1() {
        return this.tab_list;
    }

    @d
    public final CollectionFavTabList copy(@e List<CollectionFavTab> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14217, new Class[]{List.class}, CollectionFavTabList.class);
        return patchProxyResultProxy.isSupported ? (CollectionFavTabList) patchProxyResultProxy.result : new CollectionFavTabList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14221, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionFavTabList) && f0.g(this.tab_list, ((CollectionFavTabList) obj).tab_list);
    }

    @e
    public final List<CollectionFavTab> getTab_list() {
        return this.tab_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14220, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<CollectionFavTab> list = this.tab_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTab_list(@e List<CollectionFavTab> list) {
        this.tab_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14219, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFavTabList(tab_list=" + this.tab_list + ')';
    }
}
