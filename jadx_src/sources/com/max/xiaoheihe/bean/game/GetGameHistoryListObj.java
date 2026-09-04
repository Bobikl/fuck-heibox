package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GetGameHistoryListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GetGameHistoryListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<GetGameHistoryObj> games;

    @e
    private String last_time;

    public GetGameHistoryListObj(@d List<GetGameHistoryObj> games, @e String str) {
        f0.p(games, "games");
        this.games = games;
        this.last_time = str;
    }

    public static /* synthetic */ GetGameHistoryListObj copy$default(GetGameHistoryListObj getGameHistoryListObj, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{getGameHistoryListObj, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14883, new Class[]{GetGameHistoryListObj.class, List.class, String.class, Integer.TYPE, Object.class}, GetGameHistoryListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GetGameHistoryListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = getGameHistoryListObj.games;
        }
        if ((i10 & 2) != 0) {
            str = getGameHistoryListObj.last_time;
        }
        return getGameHistoryListObj.copy(list, str);
    }

    @d
    public final List<GetGameHistoryObj> component1() {
        return this.games;
    }

    @e
    public final String component2() {
        return this.last_time;
    }

    @d
    public final GetGameHistoryListObj copy(@d List<GetGameHistoryObj> games, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{games, str}, this, changeQuickRedirect, false, 14882, new Class[]{List.class, String.class}, GetGameHistoryListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GetGameHistoryListObj) patchProxyResultProxy.result;
        }
        f0.p(games, "games");
        return new GetGameHistoryListObj(games, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14886, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGameHistoryListObj)) {
            return false;
        }
        GetGameHistoryListObj getGameHistoryListObj = (GetGameHistoryListObj) obj;
        return f0.g(this.games, getGameHistoryListObj.games) && f0.g(this.last_time, getGameHistoryListObj.last_time);
    }

    @d
    public final List<GetGameHistoryObj> getGames() {
        return this.games;
    }

    @e
    public final String getLast_time() {
        return this.last_time;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14885, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.games.hashCode() * 31;
        String str = this.last_time;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setGames(@d List<GetGameHistoryObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14881, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.games = list;
    }

    public final void setLast_time(@e String str) {
        this.last_time = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14884, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GetGameHistoryListObj(games=" + this.games + ", last_time=" + this.last_time + ')';
    }
}
