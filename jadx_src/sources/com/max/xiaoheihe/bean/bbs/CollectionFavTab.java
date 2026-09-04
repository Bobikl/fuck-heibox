package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CollectionFolders.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CollectionFavTab {

    @d
    public static final String TAB_TYPE_COLLECTION_FOLDER = "1";

    @d
    public static final String TAB_TYPE_CONTENT = "0";

    @d
    public static final String TAB_TYPE_CY = "2";

    @d
    public static final String TAB_TYPE_WIKI = "3";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String tab_name;

    @e
    private String tab_type;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: CollectionFolders.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public CollectionFavTab(@e String str, @e String str2) {
        this.tab_type = str;
        this.tab_name = str2;
    }

    public static /* synthetic */ CollectionFavTab copy$default(CollectionFavTab collectionFavTab, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFavTab, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14213, new Class[]{CollectionFavTab.class, String.class, String.class, Integer.TYPE, Object.class}, CollectionFavTab.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFavTab) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = collectionFavTab.tab_type;
        }
        if ((i10 & 2) != 0) {
            str2 = collectionFavTab.tab_name;
        }
        return collectionFavTab.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.tab_type;
    }

    @e
    public final String component2() {
        return this.tab_name;
    }

    @d
    public final CollectionFavTab copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14212, new Class[]{String.class, String.class}, CollectionFavTab.class);
        return patchProxyResultProxy.isSupported ? (CollectionFavTab) patchProxyResultProxy.result : new CollectionFavTab(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14216, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionFavTab)) {
            return false;
        }
        CollectionFavTab collectionFavTab = (CollectionFavTab) obj;
        return f0.g(this.tab_type, collectionFavTab.tab_type) && f0.g(this.tab_name, collectionFavTab.tab_name);
    }

    @e
    public final String getTab_name() {
        return this.tab_name;
    }

    @e
    public final String getTab_type() {
        return this.tab_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14215, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.tab_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tab_name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setTab_name(@e String str) {
        this.tab_name = str;
    }

    public final void setTab_type(@e String str) {
        this.tab_type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14214, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFavTab(tab_type=" + this.tab_type + ", tab_name=" + this.tab_name + ')';
    }
}
