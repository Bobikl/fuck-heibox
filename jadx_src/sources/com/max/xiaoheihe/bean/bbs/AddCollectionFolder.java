package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CollectionFolders.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AddCollectionFolder implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CollectionFolder folder;

    public AddCollectionFolder(@e CollectionFolder collectionFolder) {
        this.folder = collectionFolder;
    }

    public static /* synthetic */ AddCollectionFolder copy$default(AddCollectionFolder addCollectionFolder, CollectionFolder collectionFolder, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{addCollectionFolder, collectionFolder, new Integer(i10), obj}, null, changeQuickRedirect, true, 14152, new Class[]{AddCollectionFolder.class, CollectionFolder.class, Integer.TYPE, Object.class}, AddCollectionFolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (AddCollectionFolder) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            collectionFolder = addCollectionFolder.folder;
        }
        return addCollectionFolder.copy(collectionFolder);
    }

    @e
    public final CollectionFolder component1() {
        return this.folder;
    }

    @d
    public final AddCollectionFolder copy(@e CollectionFolder collectionFolder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolder}, this, changeQuickRedirect, false, 14151, new Class[]{CollectionFolder.class}, AddCollectionFolder.class);
        return patchProxyResultProxy.isSupported ? (AddCollectionFolder) patchProxyResultProxy.result : new AddCollectionFolder(collectionFolder);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14155, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCollectionFolder) && f0.g(this.folder, ((AddCollectionFolder) obj).folder);
    }

    @e
    public final CollectionFolder getFolder() {
        return this.folder;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14154, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CollectionFolder collectionFolder = this.folder;
        if (collectionFolder == null) {
            return 0;
        }
        return collectionFolder.hashCode();
    }

    public final void setFolder(@e CollectionFolder collectionFolder) {
        this.folder = collectionFolder;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14153, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AddCollectionFolder(folder=" + this.folder + ')';
    }
}
