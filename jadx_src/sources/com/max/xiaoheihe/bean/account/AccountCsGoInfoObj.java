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

/* JADX INFO: compiled from: AccountCsGoInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AccountCsGoInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    @e
    private String f76945bg;

    @e
    private String bottom_data;

    @e
    private String bottom_data_desc;

    @e
    private String dan_img;

    @e
    private String default_msg;

    @e
    private String delta;

    @e
    private String elo;

    @e
    private Boolean is_bind;

    @e
    private String kda_detail;

    @e
    private String map_name;

    @e
    private List<MiniProgramObj> mini_program_list;

    @e
    private String nickname;

    @e
    private String protocol;

    @e
    private String rating;

    public AccountCsGoInfoObj(@e List<MiniProgramObj> list, @e Boolean bool, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12) {
        this.mini_program_list = list;
        this.is_bind = bool;
        this.nickname = str;
        this.map_name = str2;
        this.f76945bg = str3;
        this.rating = str4;
        this.kda_detail = str5;
        this.elo = str6;
        this.delta = str7;
        this.dan_img = str8;
        this.bottom_data_desc = str9;
        this.bottom_data = str10;
        this.protocol = str11;
        this.default_msg = str12;
    }

    public static /* synthetic */ AccountCsGoInfoObj copy$default(AccountCsGoInfoObj accountCsGoInfoObj, List list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountCsGoInfoObj, list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.hO, new Class[]{AccountCsGoInfoObj.class, List.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AccountCsGoInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AccountCsGoInfoObj) patchProxyResultProxy.result;
        }
        return accountCsGoInfoObj.copy((i10 & 1) != 0 ? accountCsGoInfoObj.mini_program_list : list, (i10 & 2) != 0 ? accountCsGoInfoObj.is_bind : bool, (i10 & 4) != 0 ? accountCsGoInfoObj.nickname : str, (i10 & 8) != 0 ? accountCsGoInfoObj.map_name : str2, (i10 & 16) != 0 ? accountCsGoInfoObj.f76945bg : str3, (i10 & 32) != 0 ? accountCsGoInfoObj.rating : str4, (i10 & 64) != 0 ? accountCsGoInfoObj.kda_detail : str5, (i10 & 128) != 0 ? accountCsGoInfoObj.elo : str6, (i10 & 256) != 0 ? accountCsGoInfoObj.delta : str7, (i10 & 512) != 0 ? accountCsGoInfoObj.dan_img : str8, (i10 & 1024) != 0 ? accountCsGoInfoObj.bottom_data_desc : str9, (i10 & 2048) != 0 ? accountCsGoInfoObj.bottom_data : str10, (i10 & 4096) != 0 ? accountCsGoInfoObj.protocol : str11, (i10 & 8192) != 0 ? accountCsGoInfoObj.default_msg : str12);
    }

    @e
    public final List<MiniProgramObj> component1() {
        return this.mini_program_list;
    }

    @e
    public final String component10() {
        return this.dan_img;
    }

    @e
    public final String component11() {
        return this.bottom_data_desc;
    }

    @e
    public final String component12() {
        return this.bottom_data;
    }

    @e
    public final String component13() {
        return this.protocol;
    }

    @e
    public final String component14() {
        return this.default_msg;
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
        return this.map_name;
    }

    @e
    public final String component5() {
        return this.f76945bg;
    }

    @e
    public final String component6() {
        return this.rating;
    }

    @e
    public final String component7() {
        return this.kda_detail;
    }

    @e
    public final String component8() {
        return this.elo;
    }

    @e
    public final String component9() {
        return this.delta;
    }

    @d
    public final AccountCsGoInfoObj copy(@e List<MiniProgramObj> list, @e Boolean bool, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12}, this, changeQuickRedirect, false, c.m.gO, new Class[]{List.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, AccountCsGoInfoObj.class);
        return patchProxyResultProxy.isSupported ? (AccountCsGoInfoObj) patchProxyResultProxy.result : new AccountCsGoInfoObj(list, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.kO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCsGoInfoObj)) {
            return false;
        }
        AccountCsGoInfoObj accountCsGoInfoObj = (AccountCsGoInfoObj) obj;
        return f0.g(this.mini_program_list, accountCsGoInfoObj.mini_program_list) && f0.g(this.is_bind, accountCsGoInfoObj.is_bind) && f0.g(this.nickname, accountCsGoInfoObj.nickname) && f0.g(this.map_name, accountCsGoInfoObj.map_name) && f0.g(this.f76945bg, accountCsGoInfoObj.f76945bg) && f0.g(this.rating, accountCsGoInfoObj.rating) && f0.g(this.kda_detail, accountCsGoInfoObj.kda_detail) && f0.g(this.elo, accountCsGoInfoObj.elo) && f0.g(this.delta, accountCsGoInfoObj.delta) && f0.g(this.dan_img, accountCsGoInfoObj.dan_img) && f0.g(this.bottom_data_desc, accountCsGoInfoObj.bottom_data_desc) && f0.g(this.bottom_data, accountCsGoInfoObj.bottom_data) && f0.g(this.protocol, accountCsGoInfoObj.protocol) && f0.g(this.default_msg, accountCsGoInfoObj.default_msg);
    }

    @e
    public final String getBg() {
        return this.f76945bg;
    }

    @e
    public final String getBottom_data() {
        return this.bottom_data;
    }

    @e
    public final String getBottom_data_desc() {
        return this.bottom_data_desc;
    }

    @e
    public final String getDan_img() {
        return this.dan_img;
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
    public final String getElo() {
        return this.elo;
    }

    @e
    public final String getKda_detail() {
        return this.kda_detail;
    }

    @e
    public final String getMap_name() {
        return this.map_name;
    }

    @e
    public final List<MiniProgramObj> getMini_program_list() {
        return this.mini_program_list;
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

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.jO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MiniProgramObj> list = this.mini_program_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.is_bind;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.map_name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f76945bg;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rating;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.kda_detail;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.elo;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.delta;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dan_img;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bottom_data_desc;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.bottom_data;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.protocol;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.default_msg;
        return iHashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    @e
    public final Boolean is_bind() {
        return this.is_bind;
    }

    public final void setBg(@e String str) {
        this.f76945bg = str;
    }

    public final void setBottom_data(@e String str) {
        this.bottom_data = str;
    }

    public final void setBottom_data_desc(@e String str) {
        this.bottom_data_desc = str;
    }

    public final void setDan_img(@e String str) {
        this.dan_img = str;
    }

    public final void setDefault_msg(@e String str) {
        this.default_msg = str;
    }

    public final void setDelta(@e String str) {
        this.delta = str;
    }

    public final void setElo(@e String str) {
        this.elo = str;
    }

    public final void setKda_detail(@e String str) {
        this.kda_detail = str;
    }

    public final void setMap_name(@e String str) {
        this.map_name = str;
    }

    public final void setMini_program_list(@e List<MiniProgramObj> list) {
        this.mini_program_list = list;
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

    public final void set_bind(@e Boolean bool) {
        this.is_bind = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.iO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AccountCsGoInfoObj(mini_program_list=" + this.mini_program_list + ", is_bind=" + this.is_bind + ", nickname=" + this.nickname + ", map_name=" + this.map_name + ", bg=" + this.f76945bg + ", rating=" + this.rating + ", kda_detail=" + this.kda_detail + ", elo=" + this.elo + ", delta=" + this.delta + ", dan_img=" + this.dan_img + ", bottom_data_desc=" + this.bottom_data_desc + ", bottom_data=" + this.bottom_data + ", protocol=" + this.protocol + ", default_msg=" + this.default_msg + ')';
    }
}
