package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2MatchDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2MatchDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Dota2BanPickObj ban_pick;

    @e
    private MatchSizeObj dire;

    @e
    private Dota2TeamSumObj dire_sum;

    @e
    private MatchInfoObj match_info;

    @e
    private String party_name;

    @e
    private MatchSizeObj radiant;

    @e
    private Dota2TeamSumObj radiant_sum;

    @e
    private String rep_url;

    @e
    private ResultColorObj result_color;

    @e
    private String server;

    @e
    private String show_chart;

    @e
    private String tool_card_ids;

    public Dota2MatchDetailObj(@e String str, @e String str2, @e MatchInfoObj matchInfoObj, @e ResultColorObj resultColorObj, @e MatchSizeObj matchSizeObj, @e MatchSizeObj matchSizeObj2, @e Dota2TeamSumObj dota2TeamSumObj, @e Dota2TeamSumObj dota2TeamSumObj2, @e String str3, @e String str4, @e Dota2BanPickObj dota2BanPickObj, @e String str5) {
        this.party_name = str;
        this.server = str2;
        this.match_info = matchInfoObj;
        this.result_color = resultColorObj;
        this.dire = matchSizeObj;
        this.radiant = matchSizeObj2;
        this.radiant_sum = dota2TeamSumObj;
        this.dire_sum = dota2TeamSumObj2;
        this.rep_url = str3;
        this.show_chart = str4;
        this.ban_pick = dota2BanPickObj;
        this.tool_card_ids = str5;
    }

    public static /* synthetic */ Dota2MatchDetailObj copy$default(Dota2MatchDetailObj dota2MatchDetailObj, String str, String str2, MatchInfoObj matchInfoObj, ResultColorObj resultColorObj, MatchSizeObj matchSizeObj, MatchSizeObj matchSizeObj2, Dota2TeamSumObj dota2TeamSumObj, Dota2TeamSumObj dota2TeamSumObj2, String str3, String str4, Dota2BanPickObj dota2BanPickObj, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2MatchDetailObj, str, str2, matchInfoObj, resultColorObj, matchSizeObj, matchSizeObj2, dota2TeamSumObj, dota2TeamSumObj2, str3, str4, dota2BanPickObj, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15082, new Class[]{Dota2MatchDetailObj.class, String.class, String.class, MatchInfoObj.class, ResultColorObj.class, MatchSizeObj.class, MatchSizeObj.class, Dota2TeamSumObj.class, Dota2TeamSumObj.class, String.class, String.class, Dota2BanPickObj.class, String.class, Integer.TYPE, Object.class}, Dota2MatchDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2MatchDetailObj) patchProxyResultProxy.result;
        }
        return dota2MatchDetailObj.copy((i10 & 1) != 0 ? dota2MatchDetailObj.party_name : str, (i10 & 2) != 0 ? dota2MatchDetailObj.server : str2, (i10 & 4) != 0 ? dota2MatchDetailObj.match_info : matchInfoObj, (i10 & 8) != 0 ? dota2MatchDetailObj.result_color : resultColorObj, (i10 & 16) != 0 ? dota2MatchDetailObj.dire : matchSizeObj, (i10 & 32) != 0 ? dota2MatchDetailObj.radiant : matchSizeObj2, (i10 & 64) != 0 ? dota2MatchDetailObj.radiant_sum : dota2TeamSumObj, (i10 & 128) != 0 ? dota2MatchDetailObj.dire_sum : dota2TeamSumObj2, (i10 & 256) != 0 ? dota2MatchDetailObj.rep_url : str3, (i10 & 512) != 0 ? dota2MatchDetailObj.show_chart : str4, (i10 & 1024) != 0 ? dota2MatchDetailObj.ban_pick : dota2BanPickObj, (i10 & 2048) != 0 ? dota2MatchDetailObj.tool_card_ids : str5);
    }

    @e
    public final String component1() {
        return this.party_name;
    }

    @e
    public final String component10() {
        return this.show_chart;
    }

    @e
    public final Dota2BanPickObj component11() {
        return this.ban_pick;
    }

    @e
    public final String component12() {
        return this.tool_card_ids;
    }

    @e
    public final String component2() {
        return this.server;
    }

    @e
    public final MatchInfoObj component3() {
        return this.match_info;
    }

    @e
    public final ResultColorObj component4() {
        return this.result_color;
    }

    @e
    public final MatchSizeObj component5() {
        return this.dire;
    }

    @e
    public final MatchSizeObj component6() {
        return this.radiant;
    }

    @e
    public final Dota2TeamSumObj component7() {
        return this.radiant_sum;
    }

    @e
    public final Dota2TeamSumObj component8() {
        return this.dire_sum;
    }

    @e
    public final String component9() {
        return this.rep_url;
    }

    @d
    public final Dota2MatchDetailObj copy(@e String str, @e String str2, @e MatchInfoObj matchInfoObj, @e ResultColorObj resultColorObj, @e MatchSizeObj matchSizeObj, @e MatchSizeObj matchSizeObj2, @e Dota2TeamSumObj dota2TeamSumObj, @e Dota2TeamSumObj dota2TeamSumObj2, @e String str3, @e String str4, @e Dota2BanPickObj dota2BanPickObj, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, matchInfoObj, resultColorObj, matchSizeObj, matchSizeObj2, dota2TeamSumObj, dota2TeamSumObj2, str3, str4, dota2BanPickObj, str5}, this, changeQuickRedirect, false, 15081, new Class[]{String.class, String.class, MatchInfoObj.class, ResultColorObj.class, MatchSizeObj.class, MatchSizeObj.class, Dota2TeamSumObj.class, Dota2TeamSumObj.class, String.class, String.class, Dota2BanPickObj.class, String.class}, Dota2MatchDetailObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2MatchDetailObj) patchProxyResultProxy.result : new Dota2MatchDetailObj(str, str2, matchInfoObj, resultColorObj, matchSizeObj, matchSizeObj2, dota2TeamSumObj, dota2TeamSumObj2, str3, str4, dota2BanPickObj, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15085, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2MatchDetailObj)) {
            return false;
        }
        Dota2MatchDetailObj dota2MatchDetailObj = (Dota2MatchDetailObj) obj;
        return f0.g(this.party_name, dota2MatchDetailObj.party_name) && f0.g(this.server, dota2MatchDetailObj.server) && f0.g(this.match_info, dota2MatchDetailObj.match_info) && f0.g(this.result_color, dota2MatchDetailObj.result_color) && f0.g(this.dire, dota2MatchDetailObj.dire) && f0.g(this.radiant, dota2MatchDetailObj.radiant) && f0.g(this.radiant_sum, dota2MatchDetailObj.radiant_sum) && f0.g(this.dire_sum, dota2MatchDetailObj.dire_sum) && f0.g(this.rep_url, dota2MatchDetailObj.rep_url) && f0.g(this.show_chart, dota2MatchDetailObj.show_chart) && f0.g(this.ban_pick, dota2MatchDetailObj.ban_pick) && f0.g(this.tool_card_ids, dota2MatchDetailObj.tool_card_ids);
    }

    @e
    public final Dota2BanPickObj getBan_pick() {
        return this.ban_pick;
    }

    @e
    public final MatchSizeObj getDire() {
        return this.dire;
    }

    @e
    public final Dota2TeamSumObj getDire_sum() {
        return this.dire_sum;
    }

    @e
    public final MatchInfoObj getMatch_info() {
        return this.match_info;
    }

    @e
    public final String getParty_name() {
        return this.party_name;
    }

    @e
    public final MatchSizeObj getRadiant() {
        return this.radiant;
    }

    @e
    public final Dota2TeamSumObj getRadiant_sum() {
        return this.radiant_sum;
    }

    @e
    public final String getRep_url() {
        return this.rep_url;
    }

    @e
    public final ResultColorObj getResult_color() {
        return this.result_color;
    }

    @e
    public final String getServer() {
        return this.server;
    }

    @e
    public final String getShow_chart() {
        return this.show_chart;
    }

    @e
    public final String getTool_card_ids() {
        return this.tool_card_ids;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15084, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.party_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.server;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MatchInfoObj matchInfoObj = this.match_info;
        int iHashCode3 = (iHashCode2 + (matchInfoObj == null ? 0 : matchInfoObj.hashCode())) * 31;
        ResultColorObj resultColorObj = this.result_color;
        int iHashCode4 = (iHashCode3 + (resultColorObj == null ? 0 : resultColorObj.hashCode())) * 31;
        MatchSizeObj matchSizeObj = this.dire;
        int iHashCode5 = (iHashCode4 + (matchSizeObj == null ? 0 : matchSizeObj.hashCode())) * 31;
        MatchSizeObj matchSizeObj2 = this.radiant;
        int iHashCode6 = (iHashCode5 + (matchSizeObj2 == null ? 0 : matchSizeObj2.hashCode())) * 31;
        Dota2TeamSumObj dota2TeamSumObj = this.radiant_sum;
        int iHashCode7 = (iHashCode6 + (dota2TeamSumObj == null ? 0 : dota2TeamSumObj.hashCode())) * 31;
        Dota2TeamSumObj dota2TeamSumObj2 = this.dire_sum;
        int iHashCode8 = (iHashCode7 + (dota2TeamSumObj2 == null ? 0 : dota2TeamSumObj2.hashCode())) * 31;
        String str3 = this.rep_url;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.show_chart;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Dota2BanPickObj dota2BanPickObj = this.ban_pick;
        int iHashCode11 = (iHashCode10 + (dota2BanPickObj == null ? 0 : dota2BanPickObj.hashCode())) * 31;
        String str5 = this.tool_card_ids;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBan_pick(@e Dota2BanPickObj dota2BanPickObj) {
        this.ban_pick = dota2BanPickObj;
    }

    public final void setDire(@e MatchSizeObj matchSizeObj) {
        this.dire = matchSizeObj;
    }

    public final void setDire_sum(@e Dota2TeamSumObj dota2TeamSumObj) {
        this.dire_sum = dota2TeamSumObj;
    }

    public final void setMatch_info(@e MatchInfoObj matchInfoObj) {
        this.match_info = matchInfoObj;
    }

    public final void setParty_name(@e String str) {
        this.party_name = str;
    }

    public final void setRadiant(@e MatchSizeObj matchSizeObj) {
        this.radiant = matchSizeObj;
    }

    public final void setRadiant_sum(@e Dota2TeamSumObj dota2TeamSumObj) {
        this.radiant_sum = dota2TeamSumObj;
    }

    public final void setRep_url(@e String str) {
        this.rep_url = str;
    }

    public final void setResult_color(@e ResultColorObj resultColorObj) {
        this.result_color = resultColorObj;
    }

    public final void setServer(@e String str) {
        this.server = str;
    }

    public final void setShow_chart(@e String str) {
        this.show_chart = str;
    }

    public final void setTool_card_ids(@e String str) {
        this.tool_card_ids = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15083, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2MatchDetailObj(party_name=" + this.party_name + ", server=" + this.server + ", match_info=" + this.match_info + ", result_color=" + this.result_color + ", dire=" + this.dire + ", radiant=" + this.radiant + ", radiant_sum=" + this.radiant_sum + ", dire_sum=" + this.dire_sum + ", rep_url=" + this.rep_url + ", show_chart=" + this.show_chart + ", ban_pick=" + this.ban_pick + ", tool_card_ids=" + this.tool_card_ids + ')';
    }
}
