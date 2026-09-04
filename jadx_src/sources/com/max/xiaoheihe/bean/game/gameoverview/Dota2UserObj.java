package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2UserObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2UserObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private HeyBoxUserObj heybox_info;

    @e
    private String is_verified;

    @e
    private String match_num;

    @e
    private MMRInfo mmr_info;

    @e
    private String name;

    @e
    private String online_state_color;

    @e
    private String online_state_desc;

    @e
    private String serial_number;

    @e
    private String steam_id;

    @e
    private String win_rate;

    public Dota2UserObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e MMRInfo mMRInfo, @e HeyBoxUserObj heyBoxUserObj, @e String str7, @e String str8, @e String str9) {
        this.steam_id = str;
        this.name = str2;
        this.is_verified = str3;
        this.avatar = str4;
        this.win_rate = str5;
        this.match_num = str6;
        this.mmr_info = mMRInfo;
        this.heybox_info = heyBoxUserObj;
        this.online_state_desc = str7;
        this.online_state_color = str8;
        this.serial_number = str9;
    }

    public static /* synthetic */ Dota2UserObj copy$default(Dota2UserObj dota2UserObj, String str, String str2, String str3, String str4, String str5, String str6, MMRInfo mMRInfo, HeyBoxUserObj heyBoxUserObj, String str7, String str8, String str9, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2UserObj, str, str2, str3, str4, str5, str6, mMRInfo, heyBoxUserObj, str7, str8, str9, new Integer(i10), obj}, null, changeQuickRedirect, true, 15225, new Class[]{Dota2UserObj.class, String.class, String.class, String.class, String.class, String.class, String.class, MMRInfo.class, HeyBoxUserObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2UserObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2UserObj) patchProxyResultProxy.result;
        }
        return dota2UserObj.copy((i10 & 1) != 0 ? dota2UserObj.steam_id : str, (i10 & 2) != 0 ? dota2UserObj.name : str2, (i10 & 4) != 0 ? dota2UserObj.is_verified : str3, (i10 & 8) != 0 ? dota2UserObj.avatar : str4, (i10 & 16) != 0 ? dota2UserObj.win_rate : str5, (i10 & 32) != 0 ? dota2UserObj.match_num : str6, (i10 & 64) != 0 ? dota2UserObj.mmr_info : mMRInfo, (i10 & 128) != 0 ? dota2UserObj.heybox_info : heyBoxUserObj, (i10 & 256) != 0 ? dota2UserObj.online_state_desc : str7, (i10 & 512) != 0 ? dota2UserObj.online_state_color : str8, (i10 & 1024) != 0 ? dota2UserObj.serial_number : str9);
    }

    @e
    public final String component1() {
        return this.steam_id;
    }

    @e
    public final String component10() {
        return this.online_state_color;
    }

    @e
    public final String component11() {
        return this.serial_number;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.is_verified;
    }

    @e
    public final String component4() {
        return this.avatar;
    }

    @e
    public final String component5() {
        return this.win_rate;
    }

    @e
    public final String component6() {
        return this.match_num;
    }

    @e
    public final MMRInfo component7() {
        return this.mmr_info;
    }

    @e
    public final HeyBoxUserObj component8() {
        return this.heybox_info;
    }

    @e
    public final String component9() {
        return this.online_state_desc;
    }

    @d
    public final Dota2UserObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e MMRInfo mMRInfo, @e HeyBoxUserObj heyBoxUserObj, @e String str7, @e String str8, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, mMRInfo, heyBoxUserObj, str7, str8, str9}, this, changeQuickRedirect, false, 15224, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, MMRInfo.class, HeyBoxUserObj.class, String.class, String.class, String.class}, Dota2UserObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2UserObj) patchProxyResultProxy.result : new Dota2UserObj(str, str2, str3, str4, str5, str6, mMRInfo, heyBoxUserObj, str7, str8, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15228, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2UserObj)) {
            return false;
        }
        Dota2UserObj dota2UserObj = (Dota2UserObj) obj;
        return f0.g(this.steam_id, dota2UserObj.steam_id) && f0.g(this.name, dota2UserObj.name) && f0.g(this.is_verified, dota2UserObj.is_verified) && f0.g(this.avatar, dota2UserObj.avatar) && f0.g(this.win_rate, dota2UserObj.win_rate) && f0.g(this.match_num, dota2UserObj.match_num) && f0.g(this.mmr_info, dota2UserObj.mmr_info) && f0.g(this.heybox_info, dota2UserObj.heybox_info) && f0.g(this.online_state_desc, dota2UserObj.online_state_desc) && f0.g(this.online_state_color, dota2UserObj.online_state_color) && f0.g(this.serial_number, dota2UserObj.serial_number);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final HeyBoxUserObj getHeybox_info() {
        return this.heybox_info;
    }

    @e
    public final String getMatch_num() {
        return this.match_num;
    }

    @e
    public final MMRInfo getMmr_info() {
        return this.mmr_info;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getOnline_state_color() {
        return this.online_state_color;
    }

    @e
    public final String getOnline_state_desc() {
        return this.online_state_desc;
    }

    @e
    public final String getSerial_number() {
        return this.serial_number;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    @e
    public final String getWin_rate() {
        return this.win_rate;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15227, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.steam_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.is_verified;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.win_rate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.match_num;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MMRInfo mMRInfo = this.mmr_info;
        int iHashCode7 = (iHashCode6 + (mMRInfo == null ? 0 : mMRInfo.hashCode())) * 31;
        HeyBoxUserObj heyBoxUserObj = this.heybox_info;
        int iHashCode8 = (iHashCode7 + (heyBoxUserObj == null ? 0 : heyBoxUserObj.hashCode())) * 31;
        String str7 = this.online_state_desc;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.online_state_color;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.serial_number;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    @e
    public final String is_verified() {
        return this.is_verified;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setHeybox_info(@e HeyBoxUserObj heyBoxUserObj) {
        this.heybox_info = heyBoxUserObj;
    }

    public final void setMatch_num(@e String str) {
        this.match_num = str;
    }

    public final void setMmr_info(@e MMRInfo mMRInfo) {
        this.mmr_info = mMRInfo;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setOnline_state_color(@e String str) {
        this.online_state_color = str;
    }

    public final void setOnline_state_desc(@e String str) {
        this.online_state_desc = str;
    }

    public final void setSerial_number(@e String str) {
        this.serial_number = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void setWin_rate(@e String str) {
        this.win_rate = str;
    }

    public final void set_verified(@e String str) {
        this.is_verified = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15226, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2UserObj(steam_id=" + this.steam_id + ", name=" + this.name + ", is_verified=" + this.is_verified + ", avatar=" + this.avatar + ", win_rate=" + this.win_rate + ", match_num=" + this.match_num + ", mmr_info=" + this.mmr_info + ", heybox_info=" + this.heybox_info + ", online_state_desc=" + this.online_state_desc + ", online_state_color=" + this.online_state_color + ", serial_number=" + this.serial_number + ')';
    }
}
