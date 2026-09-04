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
public final class CollectionFolderDetailObjV2 {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CollectionFolder folder;

    @e
    private String has_next;

    @e
    private List<FavouredLinkObj> links;

    public CollectionFolderDetailObjV2(@e CollectionFolder collectionFolder, @e List<FavouredLinkObj> list, @e String str) {
        this.folder = collectionFolder;
        this.links = list;
        this.has_next = str;
    }

    public static /* synthetic */ CollectionFolderDetailObjV2 copy$default(CollectionFolderDetailObjV2 collectionFolderDetailObjV2, CollectionFolder collectionFolder, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolderDetailObjV2, collectionFolder, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14233, new Class[]{CollectionFolderDetailObjV2.class, CollectionFolder.class, List.class, String.class, Integer.TYPE, Object.class}, CollectionFolderDetailObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFolderDetailObjV2) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            collectionFolder = collectionFolderDetailObjV2.folder;
        }
        if ((i10 & 2) != 0) {
            list = collectionFolderDetailObjV2.links;
        }
        if ((i10 & 4) != 0) {
            str = collectionFolderDetailObjV2.has_next;
        }
        return collectionFolderDetailObjV2.copy(collectionFolder, list, str);
    }

    @e
    public final CollectionFolder component1() {
        return this.folder;
    }

    @e
    public final List<FavouredLinkObj> component2() {
        return this.links;
    }

    @e
    public final String component3() {
        return this.has_next;
    }

    @d
    public final CollectionFolderDetailObjV2 copy(@e CollectionFolder collectionFolder, @e List<FavouredLinkObj> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolder, list, str}, this, changeQuickRedirect, false, 14232, new Class[]{CollectionFolder.class, List.class, String.class}, CollectionFolderDetailObjV2.class);
        return patchProxyResultProxy.isSupported ? (CollectionFolderDetailObjV2) patchProxyResultProxy.result : new CollectionFolderDetailObjV2(collectionFolder, list, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14236, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionFolderDetailObjV2)) {
            return false;
        }
        CollectionFolderDetailObjV2 collectionFolderDetailObjV2 = (CollectionFolderDetailObjV2) obj;
        return f0.g(this.folder, collectionFolderDetailObjV2.folder) && f0.g(this.links, collectionFolderDetailObjV2.links) && f0.g(this.has_next, collectionFolderDetailObjV2.has_next);
    }

    @e
    public final CollectionFolder getFolder() {
        return this.folder;
    }

    @e
    public final String getHas_next() {
        return this.has_next;
    }

    @e
    public final List<FavouredLinkObj> getLinks() {
        return this.links;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14235, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CollectionFolder collectionFolder = this.folder;
        int iHashCode = (collectionFolder == null ? 0 : collectionFolder.hashCode()) * 31;
        List<FavouredLinkObj> list = this.links;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.has_next;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setFolder(@e CollectionFolder collectionFolder) {
        this.folder = collectionFolder;
    }

    public final void setHas_next(@e String str) {
        this.has_next = str;
    }

    public final void setLinks(@e List<FavouredLinkObj> list) {
        this.links = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14234, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFolderDetailObjV2(folder=" + this.folder + ", links=" + this.links + ", has_next=" + this.has_next + ')';
    }
}
