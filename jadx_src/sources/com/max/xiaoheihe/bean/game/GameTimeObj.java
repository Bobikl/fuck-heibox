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

/* JADX INFO: compiled from: GameTimeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameTimeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<KeyDescObj> data;

    @e
    private String title;

    @e
    private String url;

    public GameTimeObj(@e List<KeyDescObj> list, @e String str, @e String str2) {
        this.data = list;
        this.url = str;
        this.title = str2;
    }

    public static /* synthetic */ GameTimeObj copy$default(GameTimeObj gameTimeObj, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameTimeObj, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14877, new Class[]{GameTimeObj.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, GameTimeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameTimeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = gameTimeObj.data;
        }
        if ((i10 & 2) != 0) {
            str = gameTimeObj.url;
        }
        if ((i10 & 4) != 0) {
            str2 = gameTimeObj.title;
        }
        return gameTimeObj.copy(list, str, str2);
    }

    @e
    public final List<KeyDescObj> component1() {
        return this.data;
    }

    @e
    public final String component2() {
        return this.url;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @d
    public final GameTimeObj copy(@e List<KeyDescObj> list, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 14876, new Class[]{List.class, String.class, String.class}, GameTimeObj.class);
        return patchProxyResultProxy.isSupported ? (GameTimeObj) patchProxyResultProxy.result : new GameTimeObj(list, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14880, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameTimeObj)) {
            return false;
        }
        GameTimeObj gameTimeObj = (GameTimeObj) obj;
        return f0.g(this.data, gameTimeObj.data) && f0.g(this.url, gameTimeObj.url) && f0.g(this.title, gameTimeObj.title);
    }

    @e
    public final List<KeyDescObj> getData() {
        return this.data;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14879, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<KeyDescObj> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setData(@e List<KeyDescObj> list) {
        this.data = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14878, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameTimeObj(data=" + this.data + ", url=" + this.url + ", title=" + this.title + ')';
    }
}
