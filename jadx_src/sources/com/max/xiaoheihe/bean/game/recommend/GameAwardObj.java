package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameAwardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameAwardObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String collection_id;

    @e
    private String desc;

    @e
    private String detail_name;

    @e
    private String prot;

    public GameAwardObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.collection_id = str;
        this.desc = str2;
        this.detail_name = str3;
        this.prot = str4;
    }

    public static /* synthetic */ GameAwardObj copy$default(GameAwardObj gameAwardObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameAwardObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15344, new Class[]{GameAwardObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GameAwardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameAwardObj) patchProxyResultProxy.result;
        }
        return gameAwardObj.copy((i10 & 1) != 0 ? gameAwardObj.collection_id : str, (i10 & 2) != 0 ? gameAwardObj.desc : str2, (i10 & 4) != 0 ? gameAwardObj.detail_name : str3, (i10 & 8) != 0 ? gameAwardObj.prot : str4);
    }

    @e
    public final String component1() {
        return this.collection_id;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.detail_name;
    }

    @e
    public final String component4() {
        return this.prot;
    }

    @d
    public final GameAwardObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15343, new Class[]{String.class, String.class, String.class, String.class}, GameAwardObj.class);
        return patchProxyResultProxy.isSupported ? (GameAwardObj) patchProxyResultProxy.result : new GameAwardObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15347, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameAwardObj)) {
            return false;
        }
        GameAwardObj gameAwardObj = (GameAwardObj) obj;
        return f0.g(this.collection_id, gameAwardObj.collection_id) && f0.g(this.desc, gameAwardObj.desc) && f0.g(this.detail_name, gameAwardObj.detail_name) && f0.g(this.prot, gameAwardObj.prot);
    }

    @e
    public final String getCollection_id() {
        return this.collection_id;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getDetail_name() {
        return this.detail_name;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15346, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.collection_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detail_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prot;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCollection_id(@e String str) {
        this.collection_id = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setDetail_name(@e String str) {
        this.detail_name = str;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15345, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameAwardObj(collection_id=" + this.collection_id + ", desc=" + this.desc + ", detail_name=" + this.detail_name + ", prot=" + this.prot + ')';
    }
}
