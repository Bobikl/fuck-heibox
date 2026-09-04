package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.favour.FavouredLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CollectionFolderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CollectionFolderDetailObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CollectionFolder folder;

    @e
    private List<FavouredLinkObj> links;

    public CollectionFolderDetailObj(@e CollectionFolder collectionFolder, @e List<FavouredLinkObj> list) {
        this.folder = collectionFolder;
        this.links = list;
    }

    public static /* synthetic */ CollectionFolderDetailObj copy$default(CollectionFolderDetailObj collectionFolderDetailObj, CollectionFolder collectionFolder, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolderDetailObj, collectionFolder, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14228, new Class[]{CollectionFolderDetailObj.class, CollectionFolder.class, List.class, Integer.TYPE, Object.class}, CollectionFolderDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFolderDetailObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            collectionFolder = collectionFolderDetailObj.folder;
        }
        if ((i10 & 2) != 0) {
            list = collectionFolderDetailObj.links;
        }
        return collectionFolderDetailObj.copy(collectionFolder, list);
    }

    @e
    public final CollectionFolder component1() {
        return this.folder;
    }

    @e
    public final List<FavouredLinkObj> component2() {
        return this.links;
    }

    @d
    public final CollectionFolderDetailObj copy(@e CollectionFolder collectionFolder, @e List<FavouredLinkObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolder, list}, this, changeQuickRedirect, false, 14227, new Class[]{CollectionFolder.class, List.class}, CollectionFolderDetailObj.class);
        return patchProxyResultProxy.isSupported ? (CollectionFolderDetailObj) patchProxyResultProxy.result : new CollectionFolderDetailObj(collectionFolder, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14231, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionFolderDetailObj)) {
            return false;
        }
        CollectionFolderDetailObj collectionFolderDetailObj = (CollectionFolderDetailObj) obj;
        return f0.g(this.folder, collectionFolderDetailObj.folder) && f0.g(this.links, collectionFolderDetailObj.links);
    }

    @e
    public final CollectionFolder getFolder() {
        return this.folder;
    }

    @e
    public final List<FavouredLinkObj> getLinks() {
        return this.links;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14230, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CollectionFolder collectionFolder = this.folder;
        int iHashCode = (collectionFolder == null ? 0 : collectionFolder.hashCode()) * 31;
        List<FavouredLinkObj> list = this.links;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setFolder(@e CollectionFolder collectionFolder) {
        this.folder = collectionFolder;
    }

    public final void setLinks(@e List<FavouredLinkObj> list) {
        this.links = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14229, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFolderDetailObj(folder=" + this.folder + ", links=" + this.links + ')';
    }
}
