package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameTabListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameTabListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameObj> games;

    @e
    private String name;

    @e
    private String prot;

    public GameTabListObj(@e String str, @e List<GameObj> list, @e String str2) {
        this.name = str;
        this.games = list;
        this.prot = str2;
    }

    public static /* synthetic */ GameTabListObj copy$default(GameTabListObj gameTabListObj, String str, List list, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameTabListObj, str, list, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15379, new Class[]{GameTabListObj.class, String.class, List.class, String.class, Integer.TYPE, Object.class}, GameTabListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameTabListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = gameTabListObj.name;
        }
        if ((i10 & 2) != 0) {
            list = gameTabListObj.games;
        }
        if ((i10 & 4) != 0) {
            str2 = gameTabListObj.prot;
        }
        return gameTabListObj.copy(str, list, str2);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final List<GameObj> component2() {
        return this.games;
    }

    @e
    public final String component3() {
        return this.prot;
    }

    @d
    public final GameTabListObj copy(@e String str, @e List<GameObj> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2}, this, changeQuickRedirect, false, 15378, new Class[]{String.class, List.class, String.class}, GameTabListObj.class);
        return patchProxyResultProxy.isSupported ? (GameTabListObj) patchProxyResultProxy.result : new GameTabListObj(str, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15382, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameTabListObj)) {
            return false;
        }
        GameTabListObj gameTabListObj = (GameTabListObj) obj;
        return f0.g(this.name, gameTabListObj.name) && f0.g(this.games, gameTabListObj.games) && f0.g(this.prot, gameTabListObj.prot);
    }

    @e
    public final List<GameObj> getGames() {
        return this.games;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15381, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GameObj> list = this.games;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.prot;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setGames(@e List<GameObj> list) {
        this.games = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15380, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameTabListObj(name=" + this.name + ", games=" + this.games + ", prot=" + this.prot + ')';
    }
}
