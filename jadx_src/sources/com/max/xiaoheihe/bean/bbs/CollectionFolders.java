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
public final class CollectionFolders implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cy_fav_num;

    @e
    private List<CollectionFolder> folders;

    @e
    private String game_list_fav_num;

    @e
    private BBSUserInfoObj user;

    @e
    private String wiki_fav_num;

    public CollectionFolders(@e List<CollectionFolder> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        this.folders = list;
        this.user = bBSUserInfoObj;
        this.wiki_fav_num = str;
        this.cy_fav_num = str2;
        this.game_list_fav_num = str3;
    }

    public static /* synthetic */ CollectionFolders copy$default(CollectionFolders collectionFolders, List list, BBSUserInfoObj bBSUserInfoObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFolders, list, bBSUserInfoObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14238, new Class[]{CollectionFolders.class, List.class, BBSUserInfoObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, CollectionFolders.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFolders) patchProxyResultProxy.result;
        }
        return collectionFolders.copy((i10 & 1) != 0 ? collectionFolders.folders : list, (i10 & 2) != 0 ? collectionFolders.user : bBSUserInfoObj, (i10 & 4) != 0 ? collectionFolders.wiki_fav_num : str, (i10 & 8) != 0 ? collectionFolders.cy_fav_num : str2, (i10 & 16) != 0 ? collectionFolders.game_list_fav_num : str3);
    }

    @e
    public final List<CollectionFolder> component1() {
        return this.folders;
    }

    @e
    public final BBSUserInfoObj component2() {
        return this.user;
    }

    @e
    public final String component3() {
        return this.wiki_fav_num;
    }

    @e
    public final String component4() {
        return this.cy_fav_num;
    }

    @e
    public final String component5() {
        return this.game_list_fav_num;
    }

    @d
    public final CollectionFolders copy(@e List<CollectionFolder> list, @e BBSUserInfoObj bBSUserInfoObj, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, bBSUserInfoObj, str, str2, str3}, this, changeQuickRedirect, false, 14237, new Class[]{List.class, BBSUserInfoObj.class, String.class, String.class, String.class}, CollectionFolders.class);
        return patchProxyResultProxy.isSupported ? (CollectionFolders) patchProxyResultProxy.result : new CollectionFolders(list, bBSUserInfoObj, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14241, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionFolders)) {
            return false;
        }
        CollectionFolders collectionFolders = (CollectionFolders) obj;
        return f0.g(this.folders, collectionFolders.folders) && f0.g(this.user, collectionFolders.user) && f0.g(this.wiki_fav_num, collectionFolders.wiki_fav_num) && f0.g(this.cy_fav_num, collectionFolders.cy_fav_num) && f0.g(this.game_list_fav_num, collectionFolders.game_list_fav_num);
    }

    @e
    public final String getCy_fav_num() {
        return this.cy_fav_num;
    }

    @e
    public final List<CollectionFolder> getFolders() {
        return this.folders;
    }

    @e
    public final String getGame_list_fav_num() {
        return this.game_list_fav_num;
    }

    @e
    public final BBSUserInfoObj getUser() {
        return this.user;
    }

    @e
    public final String getWiki_fav_num() {
        return this.wiki_fav_num;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14240, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<CollectionFolder> list = this.folders;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user;
        int iHashCode2 = (iHashCode + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str = this.wiki_fav_num;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cy_fav_num;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.game_list_fav_num;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCy_fav_num(@e String str) {
        this.cy_fav_num = str;
    }

    public final void setFolders(@e List<CollectionFolder> list) {
        this.folders = list;
    }

    public final void setGame_list_fav_num(@e String str) {
        this.game_list_fav_num = str;
    }

    public final void setUser(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public final void setWiki_fav_num(@e String str) {
        this.wiki_fav_num = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14239, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFolders(folders=" + this.folders + ", user=" + this.user + ", wiki_fav_num=" + this.wiki_fav_num + ", cy_fav_num=" + this.cy_fav_num + ", game_list_fav_num=" + this.game_list_fav_num + ')';
    }
}
