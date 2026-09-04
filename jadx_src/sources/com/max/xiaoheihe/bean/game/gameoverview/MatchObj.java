package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MatchObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MatchObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String bg_color;

    @e
    private String color;

    @e
    private String dan_desc;

    @e
    private String dan_icon;

    @e
    private String desc;

    @e
    private String duration;

    @e
    private String font_color;

    @e
    private String hero_icon;

    @e
    private String hero_image;

    @e
    private String hero_level;

    @e
    private HeroMmrObj hero_mmr;

    @e
    private String hero_variant;

    @e
    private String is_mvp;

    @e
    private String is_verified;

    @e
    private KDAObj kda;

    @SerializedName(alternate = {"matchId"}, value = Dota2MatchDetailFragment.F)
    @e
    private String match_id;

    @e
    private Overlaymatch match_rank_change;

    @e
    private String mode;

    @e
    private String module;

    @e
    private String name;

    @e
    private String protocol;

    @e
    private String rank;

    @e
    private String record_time;

    @e
    private String steam_id;

    @e
    private String time_desc;

    @e
    private String value;

    @e
    private String win;

    public MatchObj(@e @JSONField(alternateNames = {"matchId"}, name = Dota2MatchDetailFragment.F) String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e KDAObj kDAObj, @e String str13, @e HeroMmrObj heroMmrObj, @e String str14, @e String str15, @e String str16, @e String str17, @e String str18, @e String str19, @e String str20, @e String str21, @e String str22, @e String str23, @e String str24, @e Overlaymatch overlaymatch, @e String str25) {
        this.match_id = str;
        this.is_mvp = str2;
        this.win = str3;
        this.color = str4;
        this.hero_image = str5;
        this.hero_icon = str6;
        this.time_desc = str7;
        this.hero_level = str8;
        this.module = str9;
        this.duration = str10;
        this.dan_icon = str11;
        this.dan_desc = str12;
        this.kda = kDAObj;
        this.rank = str13;
        this.hero_mmr = heroMmrObj;
        this.bg_color = str14;
        this.font_color = str15;
        this.desc = str16;
        this.value = str17;
        this.mode = str18;
        this.record_time = str19;
        this.avatar = str20;
        this.name = str21;
        this.is_verified = str22;
        this.steam_id = str23;
        this.hero_variant = str24;
        this.match_rank_change = overlaymatch;
        this.protocol = str25;
    }

    public static /* synthetic */ MatchObj copy$default(MatchObj matchObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, KDAObj kDAObj, String str13, HeroMmrObj heroMmrObj, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Overlaymatch overlaymatch, String str25, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matchObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, kDAObj, str13, heroMmrObj, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, overlaymatch, str25, new Integer(i10), obj}, null, changeQuickRedirect, true, 15266, new Class[]{MatchObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, KDAObj.class, String.class, HeroMmrObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Overlaymatch.class, String.class, Integer.TYPE, Object.class}, MatchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MatchObj) patchProxyResultProxy.result;
        }
        return matchObj.copy((i10 & 1) != 0 ? matchObj.match_id : str, (i10 & 2) != 0 ? matchObj.is_mvp : str2, (i10 & 4) != 0 ? matchObj.win : str3, (i10 & 8) != 0 ? matchObj.color : str4, (i10 & 16) != 0 ? matchObj.hero_image : str5, (i10 & 32) != 0 ? matchObj.hero_icon : str6, (i10 & 64) != 0 ? matchObj.time_desc : str7, (i10 & 128) != 0 ? matchObj.hero_level : str8, (i10 & 256) != 0 ? matchObj.module : str9, (i10 & 512) != 0 ? matchObj.duration : str10, (i10 & 1024) != 0 ? matchObj.dan_icon : str11, (i10 & 2048) != 0 ? matchObj.dan_desc : str12, (i10 & 4096) != 0 ? matchObj.kda : kDAObj, (i10 & 8192) != 0 ? matchObj.rank : str13, (i10 & 16384) != 0 ? matchObj.hero_mmr : heroMmrObj, (i10 & 32768) != 0 ? matchObj.bg_color : str14, (i10 & 65536) != 0 ? matchObj.font_color : str15, (i10 & 131072) != 0 ? matchObj.desc : str16, (i10 & 262144) != 0 ? matchObj.value : str17, (i10 & 524288) != 0 ? matchObj.mode : str18, (i10 & 1048576) != 0 ? matchObj.record_time : str19, (i10 & 2097152) != 0 ? matchObj.avatar : str20, (i10 & 4194304) != 0 ? matchObj.name : str21, (i10 & 8388608) != 0 ? matchObj.is_verified : str22, (i10 & 16777216) != 0 ? matchObj.steam_id : str23, (i10 & 33554432) != 0 ? matchObj.hero_variant : str24, (i10 & 67108864) != 0 ? matchObj.match_rank_change : overlaymatch, (i10 & 134217728) != 0 ? matchObj.protocol : str25);
    }

    @e
    public final String component1() {
        return this.match_id;
    }

    @e
    public final String component10() {
        return this.duration;
    }

    @e
    public final String component11() {
        return this.dan_icon;
    }

    @e
    public final String component12() {
        return this.dan_desc;
    }

    @e
    public final KDAObj component13() {
        return this.kda;
    }

    @e
    public final String component14() {
        return this.rank;
    }

    @e
    public final HeroMmrObj component15() {
        return this.hero_mmr;
    }

    @e
    public final String component16() {
        return this.bg_color;
    }

    @e
    public final String component17() {
        return this.font_color;
    }

    @e
    public final String component18() {
        return this.desc;
    }

    @e
    public final String component19() {
        return this.value;
    }

    @e
    public final String component2() {
        return this.is_mvp;
    }

    @e
    public final String component20() {
        return this.mode;
    }

    @e
    public final String component21() {
        return this.record_time;
    }

    @e
    public final String component22() {
        return this.avatar;
    }

    @e
    public final String component23() {
        return this.name;
    }

    @e
    public final String component24() {
        return this.is_verified;
    }

    @e
    public final String component25() {
        return this.steam_id;
    }

    @e
    public final String component26() {
        return this.hero_variant;
    }

    @e
    public final Overlaymatch component27() {
        return this.match_rank_change;
    }

    @e
    public final String component28() {
        return this.protocol;
    }

    @e
    public final String component3() {
        return this.win;
    }

    @e
    public final String component4() {
        return this.color;
    }

    @e
    public final String component5() {
        return this.hero_image;
    }

    @e
    public final String component6() {
        return this.hero_icon;
    }

    @e
    public final String component7() {
        return this.time_desc;
    }

    @e
    public final String component8() {
        return this.hero_level;
    }

    @e
    public final String component9() {
        return this.module;
    }

    @d
    public final MatchObj copy(@e @JSONField(alternateNames = {"matchId"}, name = Dota2MatchDetailFragment.F) String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e KDAObj kDAObj, @e String str13, @e HeroMmrObj heroMmrObj, @e String str14, @e String str15, @e String str16, @e String str17, @e String str18, @e String str19, @e String str20, @e String str21, @e String str22, @e String str23, @e String str24, @e Overlaymatch overlaymatch, @e String str25) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, kDAObj, str13, heroMmrObj, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, overlaymatch, str25}, this, changeQuickRedirect, false, 15265, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, KDAObj.class, String.class, HeroMmrObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Overlaymatch.class, String.class}, MatchObj.class);
        return patchProxyResultProxy.isSupported ? (MatchObj) patchProxyResultProxy.result : new MatchObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, kDAObj, str13, heroMmrObj, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, overlaymatch, str25);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15269, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchObj)) {
            return false;
        }
        MatchObj matchObj = (MatchObj) obj;
        return f0.g(this.match_id, matchObj.match_id) && f0.g(this.is_mvp, matchObj.is_mvp) && f0.g(this.win, matchObj.win) && f0.g(this.color, matchObj.color) && f0.g(this.hero_image, matchObj.hero_image) && f0.g(this.hero_icon, matchObj.hero_icon) && f0.g(this.time_desc, matchObj.time_desc) && f0.g(this.hero_level, matchObj.hero_level) && f0.g(this.module, matchObj.module) && f0.g(this.duration, matchObj.duration) && f0.g(this.dan_icon, matchObj.dan_icon) && f0.g(this.dan_desc, matchObj.dan_desc) && f0.g(this.kda, matchObj.kda) && f0.g(this.rank, matchObj.rank) && f0.g(this.hero_mmr, matchObj.hero_mmr) && f0.g(this.bg_color, matchObj.bg_color) && f0.g(this.font_color, matchObj.font_color) && f0.g(this.desc, matchObj.desc) && f0.g(this.value, matchObj.value) && f0.g(this.mode, matchObj.mode) && f0.g(this.record_time, matchObj.record_time) && f0.g(this.avatar, matchObj.avatar) && f0.g(this.name, matchObj.name) && f0.g(this.is_verified, matchObj.is_verified) && f0.g(this.steam_id, matchObj.steam_id) && f0.g(this.hero_variant, matchObj.hero_variant) && f0.g(this.match_rank_change, matchObj.match_rank_change) && f0.g(this.protocol, matchObj.protocol);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDan_desc() {
        return this.dan_desc;
    }

    @e
    public final String getDan_icon() {
        return this.dan_icon;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getDuration() {
        return this.duration;
    }

    @e
    public final String getFont_color() {
        return this.font_color;
    }

    @e
    public final String getHero_icon() {
        return this.hero_icon;
    }

    @e
    public final String getHero_image() {
        return this.hero_image;
    }

    @e
    public final String getHero_level() {
        return this.hero_level;
    }

    @e
    public final HeroMmrObj getHero_mmr() {
        return this.hero_mmr;
    }

    @e
    public final String getHero_variant() {
        return this.hero_variant;
    }

    @e
    public final KDAObj getKda() {
        return this.kda;
    }

    @e
    public final String getMatch_id() {
        return this.match_id;
    }

    @e
    public final Overlaymatch getMatch_rank_change() {
        return this.match_rank_change;
    }

    @e
    public final String getMode() {
        return this.mode;
    }

    @e
    public final String getModule() {
        return this.module;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getRank() {
        return this.rank;
    }

    @e
    public final String getRecord_time() {
        return this.record_time;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    @e
    public final String getTime_desc() {
        return this.time_desc;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15268, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.match_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.is_mvp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.win;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hero_image;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hero_icon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.time_desc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.hero_level;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.module;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.duration;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dan_icon;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dan_desc;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        KDAObj kDAObj = this.kda;
        int iHashCode13 = (iHashCode12 + (kDAObj == null ? 0 : kDAObj.hashCode())) * 31;
        String str13 = this.rank;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        HeroMmrObj heroMmrObj = this.hero_mmr;
        int iHashCode15 = (iHashCode14 + (heroMmrObj == null ? 0 : heroMmrObj.hashCode())) * 31;
        String str14 = this.bg_color;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.font_color;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.desc;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.value;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.mode;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.record_time;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.avatar;
        int iHashCode22 = (iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.name;
        int iHashCode23 = (iHashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.is_verified;
        int iHashCode24 = (iHashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.steam_id;
        int iHashCode25 = (iHashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.hero_variant;
        int iHashCode26 = (iHashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Overlaymatch overlaymatch = this.match_rank_change;
        int iHashCode27 = (iHashCode26 + (overlaymatch == null ? 0 : overlaymatch.hashCode())) * 31;
        String str25 = this.protocol;
        return iHashCode27 + (str25 != null ? str25.hashCode() : 0);
    }

    @e
    public final String is_mvp() {
        return this.is_mvp;
    }

    @e
    public final String is_verified() {
        return this.is_verified;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setDan_desc(@e String str) {
        this.dan_desc = str;
    }

    public final void setDan_icon(@e String str) {
        this.dan_icon = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setDuration(@e String str) {
        this.duration = str;
    }

    public final void setFont_color(@e String str) {
        this.font_color = str;
    }

    public final void setHero_icon(@e String str) {
        this.hero_icon = str;
    }

    public final void setHero_image(@e String str) {
        this.hero_image = str;
    }

    public final void setHero_level(@e String str) {
        this.hero_level = str;
    }

    public final void setHero_mmr(@e HeroMmrObj heroMmrObj) {
        this.hero_mmr = heroMmrObj;
    }

    public final void setHero_variant(@e String str) {
        this.hero_variant = str;
    }

    public final void setKda(@e KDAObj kDAObj) {
        this.kda = kDAObj;
    }

    public final void setMatch_id(@e String str) {
        this.match_id = str;
    }

    public final void setMatch_rank_change(@e Overlaymatch overlaymatch) {
        this.match_rank_change = overlaymatch;
    }

    public final void setMode(@e String str) {
        this.mode = str;
    }

    public final void setModule(@e String str) {
        this.module = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setRank(@e String str) {
        this.rank = str;
    }

    public final void setRecord_time(@e String str) {
        this.record_time = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void setTime_desc(@e String str) {
        this.time_desc = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }

    public final void set_mvp(@e String str) {
        this.is_mvp = str;
    }

    public final void set_verified(@e String str) {
        this.is_verified = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15267, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MatchObj(match_id=" + this.match_id + ", is_mvp=" + this.is_mvp + ", win=" + this.win + ", color=" + this.color + ", hero_image=" + this.hero_image + ", hero_icon=" + this.hero_icon + ", time_desc=" + this.time_desc + ", hero_level=" + this.hero_level + ", module=" + this.module + ", duration=" + this.duration + ", dan_icon=" + this.dan_icon + ", dan_desc=" + this.dan_desc + ", kda=" + this.kda + ", rank=" + this.rank + ", hero_mmr=" + this.hero_mmr + ", bg_color=" + this.bg_color + ", font_color=" + this.font_color + ", desc=" + this.desc + ", value=" + this.value + ", mode=" + this.mode + ", record_time=" + this.record_time + ", avatar=" + this.avatar + ", name=" + this.name + ", is_verified=" + this.is_verified + ", steam_id=" + this.steam_id + ", hero_variant=" + this.hero_variant + ", match_rank_change=" + this.match_rank_change + ", protocol=" + this.protocol + ')';
    }
}
