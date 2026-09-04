package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MatchSizeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MatchSizeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String gold;

    @e
    private String kill;

    @e
    private String name;

    @e
    private List<Dota2PlayerObj> player_list;

    @e
    private String win;

    public MatchSizeObj(@e String str, @e String str2, @e String str3, @e String str4, @e List<Dota2PlayerObj> list) {
        this.kill = str;
        this.win = str2;
        this.gold = str3;
        this.name = str4;
        this.player_list = list;
    }

    public static /* synthetic */ MatchSizeObj copy$default(MatchSizeObj matchSizeObj, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matchSizeObj, str, str2, str3, str4, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15132, new Class[]{MatchSizeObj.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, MatchSizeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MatchSizeObj) patchProxyResultProxy.result;
        }
        return matchSizeObj.copy((i10 & 1) != 0 ? matchSizeObj.kill : str, (i10 & 2) != 0 ? matchSizeObj.win : str2, (i10 & 4) != 0 ? matchSizeObj.gold : str3, (i10 & 8) != 0 ? matchSizeObj.name : str4, (i10 & 16) != 0 ? matchSizeObj.player_list : list);
    }

    @e
    public final String component1() {
        return this.kill;
    }

    @e
    public final String component2() {
        return this.win;
    }

    @e
    public final String component3() {
        return this.gold;
    }

    @e
    public final String component4() {
        return this.name;
    }

    @e
    public final List<Dota2PlayerObj> component5() {
        return this.player_list;
    }

    @d
    public final MatchSizeObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<Dota2PlayerObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list}, this, changeQuickRedirect, false, 15131, new Class[]{String.class, String.class, String.class, String.class, List.class}, MatchSizeObj.class);
        return patchProxyResultProxy.isSupported ? (MatchSizeObj) patchProxyResultProxy.result : new MatchSizeObj(str, str2, str3, str4, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15135, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchSizeObj)) {
            return false;
        }
        MatchSizeObj matchSizeObj = (MatchSizeObj) obj;
        return f0.g(this.kill, matchSizeObj.kill) && f0.g(this.win, matchSizeObj.win) && f0.g(this.gold, matchSizeObj.gold) && f0.g(this.name, matchSizeObj.name) && f0.g(this.player_list, matchSizeObj.player_list);
    }

    @e
    public final String getGold() {
        return this.gold;
    }

    @e
    public final String getKill() {
        return this.kill;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final List<Dota2PlayerObj> getPlayer_list() {
        return this.player_list;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15134, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.kill;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.win;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gold;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Dota2PlayerObj> list = this.player_list;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setGold(@e String str) {
        this.gold = str;
    }

    public final void setKill(@e String str) {
        this.kill = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPlayer_list(@e List<Dota2PlayerObj> list) {
        this.player_list = list;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15133, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MatchSizeObj(kill=" + this.kill + ", win=" + this.win + ", gold=" + this.gold + ", name=" + this.name + ", player_list=" + this.player_list + ')';
    }
}
