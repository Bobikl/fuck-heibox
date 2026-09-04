package com.max.xiaoheihe.module.game.heybox.gamematerial.bean;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameMaterialObj.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameMaterialListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("has_more")
    @e
    private final Boolean hasMore;

    @SerializedName("hash_tag")
    @e
    private final String hashTag;

    @SerializedName(alternate = {"link_list"}, value = SocializeProtocolConstants.LINKS)
    @e
    private final ArrayList<GameMaterialItem> materialList;

    public GameMaterialListObj() {
        this(null, null, null, 7, null);
    }

    public GameMaterialListObj(@e ArrayList<GameMaterialItem> arrayList, @e Boolean bool, @e String str) {
        this.materialList = arrayList;
        this.hasMore = bool;
        this.hashTag = str;
    }

    public /* synthetic */ GameMaterialListObj(ArrayList arrayList, Boolean bool, String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : arrayList, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str);
    }

    public static /* synthetic */ GameMaterialListObj copy$default(GameMaterialListObj gameMaterialListObj, ArrayList arrayList, Boolean bool, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialListObj, arrayList, bool, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 37516, new Class[]{GameMaterialListObj.class, ArrayList.class, Boolean.class, String.class, Integer.TYPE, Object.class}, GameMaterialListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMaterialListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = gameMaterialListObj.materialList;
        }
        if ((i10 & 2) != 0) {
            bool = gameMaterialListObj.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = gameMaterialListObj.hashTag;
        }
        return gameMaterialListObj.copy(arrayList, bool, str);
    }

    @e
    public final ArrayList<GameMaterialItem> component1() {
        return this.materialList;
    }

    @e
    public final Boolean component2() {
        return this.hasMore;
    }

    @e
    public final String component3() {
        return this.hashTag;
    }

    @d
    public final GameMaterialListObj copy(@e ArrayList<GameMaterialItem> arrayList, @e Boolean bool, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, bool, str}, this, changeQuickRedirect, false, 37515, new Class[]{ArrayList.class, Boolean.class, String.class}, GameMaterialListObj.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialListObj) patchProxyResultProxy.result : new GameMaterialListObj(arrayList, bool, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37519, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameMaterialListObj)) {
            return false;
        }
        GameMaterialListObj gameMaterialListObj = (GameMaterialListObj) obj;
        return f0.g(this.materialList, gameMaterialListObj.materialList) && f0.g(this.hasMore, gameMaterialListObj.hasMore) && f0.g(this.hashTag, gameMaterialListObj.hashTag);
    }

    @e
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @e
    public final String getHashTag() {
        return this.hashTag;
    }

    @e
    public final ArrayList<GameMaterialItem> getMaterialList() {
        return this.materialList;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37518, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<GameMaterialItem> arrayList = this.materialList;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.hashTag;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37517, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameMaterialListObj(materialList=" + this.materialList + ", hasMore=" + this.hasMore + ", hashTag=" + this.hashTag + ')';
    }
}
