package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccountDota2InfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AccountDota2InfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    @e
    private String f76946bg;

    @e
    private String damage;

    @e
    private String damage_rate;

    @e
    private String default_msg;

    @e
    private String delta;

    @e
    private String hero_name;

    @e
    private Boolean is_bind;

    @e
    private String is_heybox_user;

    @e
    private String kda;

    @e
    private String kda_detail;

    @e
    private List<MiniProgramObj> mini_program_list;

    @e
    private String mmr;

    @e
    private String nickname;

    @e
    private String protocol;

    @e
    private String rating;

    @e
    private String steam_id;

    public AccountDota2InfoObj(@e List<MiniProgramObj> list, @e Boolean bool, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14) {
        this.mini_program_list = list;
        this.is_bind = bool;
        this.nickname = str;
        this.hero_name = str2;
        this.rating = str3;
        this.kda_detail = str4;
        this.kda = str5;
        this.f76946bg = str6;
        this.mmr = str7;
        this.delta = str8;
        this.damage_rate = str9;
        this.damage = str10;
        this.steam_id = str11;
        this.protocol = str12;
        this.default_msg = str13;
        this.is_heybox_user = str14;
    }

    public static /* synthetic */ AccountDota2InfoObj copy$default(AccountDota2InfoObj accountDota2InfoObj, List list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDota2InfoObj, list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.nO, new Class[]{AccountDota2InfoObj.class, List.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AccountDota2InfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AccountDota2InfoObj) patchProxyResultProxy.result;
        }
        return accountDota2InfoObj.copy((i10 & 1) != 0 ? accountDota2InfoObj.mini_program_list : list, (i10 & 2) != 0 ? accountDota2InfoObj.is_bind : bool, (i10 & 4) != 0 ? accountDota2InfoObj.nickname : str, (i10 & 8) != 0 ? accountDota2InfoObj.hero_name : str2, (i10 & 16) != 0 ? accountDota2InfoObj.rating : str3, (i10 & 32) != 0 ? accountDota2InfoObj.kda_detail : str4, (i10 & 64) != 0 ? accountDota2InfoObj.kda : str5, (i10 & 128) != 0 ? accountDota2InfoObj.f76946bg : str6, (i10 & 256) != 0 ? accountDota2InfoObj.mmr : str7, (i10 & 512) != 0 ? accountDota2InfoObj.delta : str8, (i10 & 1024) != 0 ? accountDota2InfoObj.damage_rate : str9, (i10 & 2048) != 0 ? accountDota2InfoObj.damage : str10, (i10 & 4096) != 0 ? accountDota2InfoObj.steam_id : str11, (i10 & 8192) != 0 ? accountDota2InfoObj.protocol : str12, (i10 & 16384) != 0 ? accountDota2InfoObj.default_msg : str13, (i10 & 32768) != 0 ? accountDota2InfoObj.is_heybox_user : str14);
    }

    @e
    public final List<MiniProgramObj> component1() {
        return this.mini_program_list;
    }

    @e
    public final String component10() {
        return this.delta;
    }

    @e
    public final String component11() {
        return this.damage_rate;
    }

    @e
    public final String component12() {
        return this.damage;
    }

    @e
    public final String component13() {
        return this.steam_id;
    }

    @e
    public final String component14() {
        return this.protocol;
    }

    @e
    public final String component15() {
        return this.default_msg;
    }

    @e
    public final String component16() {
        return this.is_heybox_user;
    }

    @e
    public final Boolean component2() {
        return this.is_bind;
    }

    @e
    public final String component3() {
        return this.nickname;
    }

    @e
    public final String component4() {
        return this.hero_name;
    }

    @e
    public final String component5() {
        return this.rating;
    }

    @e
    public final String component6() {
        return this.kda_detail;
    }

    @e
    public final String component7() {
        return this.kda;
    }

    @e
    public final String component8() {
        return this.f76946bg;
    }

    @e
    public final String component9() {
        return this.mmr;
    }

    @d
    public final AccountDota2InfoObj copy(@e List<MiniProgramObj> list, @e Boolean bool, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14}, this, changeQuickRedirect, false, c.m.mO, new Class[]{List.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, AccountDota2InfoObj.class);
        return patchProxyResultProxy.isSupported ? (AccountDota2InfoObj) patchProxyResultProxy.result : new AccountDota2InfoObj(list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.qO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDota2InfoObj)) {
            return false;
        }
        AccountDota2InfoObj accountDota2InfoObj = (AccountDota2InfoObj) obj;
        return f0.g(this.mini_program_list, accountDota2InfoObj.mini_program_list) && f0.g(this.is_bind, accountDota2InfoObj.is_bind) && f0.g(this.nickname, accountDota2InfoObj.nickname) && f0.g(this.hero_name, accountDota2InfoObj.hero_name) && f0.g(this.rating, accountDota2InfoObj.rating) && f0.g(this.kda_detail, accountDota2InfoObj.kda_detail) && f0.g(this.kda, accountDota2InfoObj.kda) && f0.g(this.f76946bg, accountDota2InfoObj.f76946bg) && f0.g(this.mmr, accountDota2InfoObj.mmr) && f0.g(this.delta, accountDota2InfoObj.delta) && f0.g(this.damage_rate, accountDota2InfoObj.damage_rate) && f0.g(this.damage, accountDota2InfoObj.damage) && f0.g(this.steam_id, accountDota2InfoObj.steam_id) && f0.g(this.protocol, accountDota2InfoObj.protocol) && f0.g(this.default_msg, accountDota2InfoObj.default_msg) && f0.g(this.is_heybox_user, accountDota2InfoObj.is_heybox_user);
    }

    @e
    public final String getBg() {
        return this.f76946bg;
    }

    @e
    public final String getDamage() {
        return this.damage;
    }

    @e
    public final String getDamage_rate() {
        return this.damage_rate;
    }

    @e
    public final String getDefault_msg() {
        return this.default_msg;
    }

    @e
    public final String getDelta() {
        return this.delta;
    }

    @e
    public final String getHero_name() {
        return this.hero_name;
    }

    @e
    public final String getKda() {
        return this.kda;
    }

    @e
    public final String getKda_detail() {
        return this.kda_detail;
    }

    @e
    public final List<MiniProgramObj> getMini_program_list() {
        return this.mini_program_list;
    }

    @e
    public final String getMmr() {
        return this.mmr;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getRating() {
        return this.rating;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.pO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MiniProgramObj> list = this.mini_program_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.is_bind;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hero_name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rating;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kda_detail;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.kda;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f76946bg;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mmr;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.delta;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.damage_rate;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.damage;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.steam_id;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.protocol;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.default_msg;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.is_heybox_user;
        return iHashCode15 + (str14 != null ? str14.hashCode() : 0);
    }

    @e
    public final Boolean is_bind() {
        return this.is_bind;
    }

    @e
    public final String is_heybox_user() {
        return this.is_heybox_user;
    }

    public final void setBg(@e String str) {
        this.f76946bg = str;
    }

    public final void setDamage(@e String str) {
        this.damage = str;
    }

    public final void setDamage_rate(@e String str) {
        this.damage_rate = str;
    }

    public final void setDefault_msg(@e String str) {
        this.default_msg = str;
    }

    public final void setDelta(@e String str) {
        this.delta = str;
    }

    public final void setHero_name(@e String str) {
        this.hero_name = str;
    }

    public final void setKda(@e String str) {
        this.kda = str;
    }

    public final void setKda_detail(@e String str) {
        this.kda_detail = str;
    }

    public final void setMini_program_list(@e List<MiniProgramObj> list) {
        this.mini_program_list = list;
    }

    public final void setMmr(@e String str) {
        this.mmr = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setRating(@e String str) {
        this.rating = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void set_bind(@e Boolean bool) {
        this.is_bind = bool;
    }

    public final void set_heybox_user(@e String str) {
        this.is_heybox_user = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.oO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AccountDota2InfoObj(mini_program_list=" + this.mini_program_list + ", is_bind=" + this.is_bind + ", nickname=" + this.nickname + ", hero_name=" + this.hero_name + ", rating=" + this.rating + ", kda_detail=" + this.kda_detail + ", kda=" + this.kda + ", bg=" + this.f76946bg + ", mmr=" + this.mmr + ", delta=" + this.delta + ", damage_rate=" + this.damage_rate + ", damage=" + this.damage + ", steam_id=" + this.steam_id + ", protocol=" + this.protocol + ", default_msg=" + this.default_msg + ", is_heybox_user=" + this.is_heybox_user + ')';
    }
}
