package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.gameoverview.ConsecutiveInfoObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2MatchListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2MatchListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ConsecutiveInfoObj consecutive_info;

    @e
    private GameOverviewHeaderInfoObj header_info;

    @e
    private String match_id;

    @e
    private List<MatchObj> match_list;

    @e
    private String max_lose;

    @e
    private String max_win;

    public Dota2MatchListObj(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, @e ConsecutiveInfoObj consecutiveInfoObj, @e List<MatchObj> list, @e String str, @e String str2, @e String str3) {
        this.header_info = gameOverviewHeaderInfoObj;
        this.consecutive_info = consecutiveInfoObj;
        this.match_list = list;
        this.max_win = str;
        this.max_lose = str2;
        this.match_id = str3;
    }

    public static /* synthetic */ Dota2MatchListObj copy$default(Dota2MatchListObj dota2MatchListObj, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, ConsecutiveInfoObj consecutiveInfoObj, List list, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2MatchListObj, gameOverviewHeaderInfoObj, consecutiveInfoObj, list, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15087, new Class[]{Dota2MatchListObj.class, GameOverviewHeaderInfoObj.class, ConsecutiveInfoObj.class, List.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2MatchListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2MatchListObj) patchProxyResultProxy.result;
        }
        return dota2MatchListObj.copy((i10 & 1) != 0 ? dota2MatchListObj.header_info : gameOverviewHeaderInfoObj, (i10 & 2) != 0 ? dota2MatchListObj.consecutive_info : consecutiveInfoObj, (i10 & 4) != 0 ? dota2MatchListObj.match_list : list, (i10 & 8) != 0 ? dota2MatchListObj.max_win : str, (i10 & 16) != 0 ? dota2MatchListObj.max_lose : str2, (i10 & 32) != 0 ? dota2MatchListObj.match_id : str3);
    }

    @e
    public final GameOverviewHeaderInfoObj component1() {
        return this.header_info;
    }

    @e
    public final ConsecutiveInfoObj component2() {
        return this.consecutive_info;
    }

    @e
    public final List<MatchObj> component3() {
        return this.match_list;
    }

    @e
    public final String component4() {
        return this.max_win;
    }

    @e
    public final String component5() {
        return this.max_lose;
    }

    @e
    public final String component6() {
        return this.match_id;
    }

    @d
    public final Dota2MatchListObj copy(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, @e ConsecutiveInfoObj consecutiveInfoObj, @e List<MatchObj> list, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameOverviewHeaderInfoObj, consecutiveInfoObj, list, str, str2, str3}, this, changeQuickRedirect, false, 15086, new Class[]{GameOverviewHeaderInfoObj.class, ConsecutiveInfoObj.class, List.class, String.class, String.class, String.class}, Dota2MatchListObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2MatchListObj) patchProxyResultProxy.result : new Dota2MatchListObj(gameOverviewHeaderInfoObj, consecutiveInfoObj, list, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15090, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2MatchListObj)) {
            return false;
        }
        Dota2MatchListObj dota2MatchListObj = (Dota2MatchListObj) obj;
        return f0.g(this.header_info, dota2MatchListObj.header_info) && f0.g(this.consecutive_info, dota2MatchListObj.consecutive_info) && f0.g(this.match_list, dota2MatchListObj.match_list) && f0.g(this.max_win, dota2MatchListObj.max_win) && f0.g(this.max_lose, dota2MatchListObj.max_lose) && f0.g(this.match_id, dota2MatchListObj.match_id);
    }

    @e
    public final ConsecutiveInfoObj getConsecutive_info() {
        return this.consecutive_info;
    }

    @e
    public final GameOverviewHeaderInfoObj getHeader_info() {
        return this.header_info;
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final List<MatchObj> getMatch_list() {
        return this.match_list;
    }

    @e
    public final String getMax_lose() {
        return this.max_lose;
    }

    @e
    public final String getMax_win() {
        return this.max_win;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15089, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj = this.header_info;
        int iHashCode = (gameOverviewHeaderInfoObj == null ? 0 : gameOverviewHeaderInfoObj.hashCode()) * 31;
        ConsecutiveInfoObj consecutiveInfoObj = this.consecutive_info;
        int iHashCode2 = (iHashCode + (consecutiveInfoObj == null ? 0 : consecutiveInfoObj.hashCode())) * 31;
        List<MatchObj> list = this.match_list;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.max_win;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.max_lose;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.match_id;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setConsecutive_info(@e ConsecutiveInfoObj consecutiveInfoObj) {
        this.consecutive_info = consecutiveInfoObj;
    }

    public final void setHeader_info(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setMatch_list(@e List<MatchObj> list) {
        this.match_list = list;
    }

    public final void setMax_lose(@e String str) {
        this.max_lose = str;
    }

    public final void setMax_win(@e String str) {
        this.max_win = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15088, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2MatchListObj(header_info=" + this.header_info + ", consecutive_info=" + this.consecutive_info + ", match_list=" + this.match_list + ", max_win=" + this.max_win + ", max_lose=" + this.max_lose + ", match_id=" + this.match_id + ')';
    }
}
