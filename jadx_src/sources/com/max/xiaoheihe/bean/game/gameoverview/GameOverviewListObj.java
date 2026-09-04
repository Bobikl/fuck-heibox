package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private List<BaseGameOverviewObj> data_list;

    @e
    private String follow_state;

    @e
    private String is_me;

    @e
    private String match_id;

    @e
    private String mmr;

    @e
    private String need_bind;

    @e
    private String search_hint;

    @e
    private String search_protocol;

    @e
    private String steam_id;

    public GameOverviewListObj(@e List<BaseGameOverviewObj> list, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9) {
        this.data_list = list;
        this.need_bind = str;
        this.follow_state = str2;
        this.is_me = str3;
        this.search_hint = str4;
        this.search_protocol = str5;
        this.steam_id = str6;
        this.mmr = str7;
        this.count = str8;
        this.match_id = str9;
    }

    public static /* synthetic */ GameOverviewListObj copy$default(GameOverviewListObj gameOverviewListObj, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameOverviewListObj, list, str, str2, str3, str4, str5, str6, str7, str8, str9, new Integer(i10), obj}, null, changeQuickRedirect, true, 15235, new Class[]{GameOverviewListObj.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GameOverviewListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameOverviewListObj) patchProxyResultProxy.result;
        }
        return gameOverviewListObj.copy((i10 & 1) != 0 ? gameOverviewListObj.data_list : list, (i10 & 2) != 0 ? gameOverviewListObj.need_bind : str, (i10 & 4) != 0 ? gameOverviewListObj.follow_state : str2, (i10 & 8) != 0 ? gameOverviewListObj.is_me : str3, (i10 & 16) != 0 ? gameOverviewListObj.search_hint : str4, (i10 & 32) != 0 ? gameOverviewListObj.search_protocol : str5, (i10 & 64) != 0 ? gameOverviewListObj.steam_id : str6, (i10 & 128) != 0 ? gameOverviewListObj.mmr : str7, (i10 & 256) != 0 ? gameOverviewListObj.count : str8, (i10 & 512) != 0 ? gameOverviewListObj.match_id : str9);
    }

    @e
    public final List<BaseGameOverviewObj> component1() {
        return this.data_list;
    }

    @e
    public final String component10() {
        return this.match_id;
    }

    @e
    public final String component2() {
        return this.need_bind;
    }

    @e
    public final String component3() {
        return this.follow_state;
    }

    @e
    public final String component4() {
        return this.is_me;
    }

    @e
    public final String component5() {
        return this.search_hint;
    }

    @e
    public final String component6() {
        return this.search_protocol;
    }

    @e
    public final String component7() {
        return this.steam_id;
    }

    @e
    public final String component8() {
        return this.mmr;
    }

    @e
    public final String component9() {
        return this.count;
    }

    @d
    public final GameOverviewListObj copy(@e List<BaseGameOverviewObj> list, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2, str3, str4, str5, str6, str7, str8, str9}, this, changeQuickRedirect, false, 15234, new Class[]{List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, GameOverviewListObj.class);
        return patchProxyResultProxy.isSupported ? (GameOverviewListObj) patchProxyResultProxy.result : new GameOverviewListObj(list, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15238, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameOverviewListObj)) {
            return false;
        }
        GameOverviewListObj gameOverviewListObj = (GameOverviewListObj) obj;
        return f0.g(this.data_list, gameOverviewListObj.data_list) && f0.g(this.need_bind, gameOverviewListObj.need_bind) && f0.g(this.follow_state, gameOverviewListObj.follow_state) && f0.g(this.is_me, gameOverviewListObj.is_me) && f0.g(this.search_hint, gameOverviewListObj.search_hint) && f0.g(this.search_protocol, gameOverviewListObj.search_protocol) && f0.g(this.steam_id, gameOverviewListObj.steam_id) && f0.g(this.mmr, gameOverviewListObj.mmr) && f0.g(this.count, gameOverviewListObj.count) && f0.g(this.match_id, gameOverviewListObj.match_id);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final List<BaseGameOverviewObj> getData_list() {
        return this.data_list;
    }

    @e
    public final String getFollow_state() {
        return this.follow_state;
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final String getMmr() {
        return this.mmr;
    }

    @e
    public final String getNeed_bind() {
        return this.need_bind;
    }

    @e
    public final String getSearch_hint() {
        return this.search_hint;
    }

    @e
    public final String getSearch_protocol() {
        return this.search_protocol;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15237, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<BaseGameOverviewObj> list = this.data_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.need_bind;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.follow_state;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.is_me;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.search_hint;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.search_protocol;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.steam_id;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mmr;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.count;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.match_id;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @e
    public final String is_me() {
        return this.is_me;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setData_list(@e List<BaseGameOverviewObj> list) {
        this.data_list = list;
    }

    public final void setFollow_state(@e String str) {
        this.follow_state = str;
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setMmr(@e String str) {
        this.mmr = str;
    }

    public final void setNeed_bind(@e String str) {
        this.need_bind = str;
    }

    public final void setSearch_hint(@e String str) {
        this.search_hint = str;
    }

    public final void setSearch_protocol(@e String str) {
        this.search_protocol = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void set_me(@e String str) {
        this.is_me = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15236, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameOverviewListObj(data_list=" + this.data_list + ", need_bind=" + this.need_bind + ", follow_state=" + this.follow_state + ", is_me=" + this.is_me + ", search_hint=" + this.search_hint + ", search_protocol=" + this.search_protocol + ", steam_id=" + this.steam_id + ", mmr=" + this.mmr + ", count=" + this.count + ", match_id=" + this.match_id + ')';
    }
}
