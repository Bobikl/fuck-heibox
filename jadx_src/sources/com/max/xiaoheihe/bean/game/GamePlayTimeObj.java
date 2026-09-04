package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GamePlayTimeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GamePlayTimeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<KeyDescObj> data;

    @e
    private List<KeyDescObj> table;

    @e
    private KeyDescObj tips;

    @e
    private String title;

    public GamePlayTimeObj(@e List<KeyDescObj> list, @e List<KeyDescObj> list2, @e KeyDescObj keyDescObj, @e String str) {
        this.table = list;
        this.data = list2;
        this.tips = keyDescObj;
        this.title = str;
    }

    public static /* synthetic */ GamePlayTimeObj copy$default(GamePlayTimeObj gamePlayTimeObj, List list, List list2, KeyDescObj keyDescObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePlayTimeObj, list, list2, keyDescObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14841, new Class[]{GamePlayTimeObj.class, List.class, List.class, KeyDescObj.class, String.class, Integer.TYPE, Object.class}, GamePlayTimeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePlayTimeObj) patchProxyResultProxy.result;
        }
        return gamePlayTimeObj.copy((i10 & 1) != 0 ? gamePlayTimeObj.table : list, (i10 & 2) != 0 ? gamePlayTimeObj.data : list2, (i10 & 4) != 0 ? gamePlayTimeObj.tips : keyDescObj, (i10 & 8) != 0 ? gamePlayTimeObj.title : str);
    }

    @e
    public final List<KeyDescObj> component1() {
        return this.table;
    }

    @e
    public final List<KeyDescObj> component2() {
        return this.data;
    }

    @e
    public final KeyDescObj component3() {
        return this.tips;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @d
    public final GamePlayTimeObj copy(@e List<KeyDescObj> list, @e List<KeyDescObj> list2, @e KeyDescObj keyDescObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, keyDescObj, str}, this, changeQuickRedirect, false, 14840, new Class[]{List.class, List.class, KeyDescObj.class, String.class}, GamePlayTimeObj.class);
        return patchProxyResultProxy.isSupported ? (GamePlayTimeObj) patchProxyResultProxy.result : new GamePlayTimeObj(list, list2, keyDescObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14844, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamePlayTimeObj)) {
            return false;
        }
        GamePlayTimeObj gamePlayTimeObj = (GamePlayTimeObj) obj;
        return f0.g(this.table, gamePlayTimeObj.table) && f0.g(this.data, gamePlayTimeObj.data) && f0.g(this.tips, gamePlayTimeObj.tips) && f0.g(this.title, gamePlayTimeObj.title);
    }

    @e
    public final List<KeyDescObj> getData() {
        return this.data;
    }

    @e
    public final List<KeyDescObj> getTable() {
        return this.table;
    }

    @e
    public final KeyDescObj getTips() {
        return this.tips;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14843, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<KeyDescObj> list = this.table;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<KeyDescObj> list2 = this.data;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        KeyDescObj keyDescObj = this.tips;
        int iHashCode3 = (iHashCode2 + (keyDescObj == null ? 0 : keyDescObj.hashCode())) * 31;
        String str = this.title;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setData(@e List<KeyDescObj> list) {
        this.data = list;
    }

    public final void setTable(@e List<KeyDescObj> list) {
        this.table = list;
    }

    public final void setTips(@e KeyDescObj keyDescObj) {
        this.tips = keyDescObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14842, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GamePlayTimeObj(table=" + this.table + ", data=" + this.data + ", tips=" + this.tips + ", title=" + this.title + ')';
    }
}
