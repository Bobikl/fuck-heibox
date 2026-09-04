package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerRankObj implements ISteamOnlineState, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4571316112188813164L;
    private String account_id;
    private String avatar;
    private String end_color;
    private String gameextrainfo;
    private String gameid;
    private String has_heybox;
    private HeyboxInfoObj heybox_info;
    private String is_steam;
    private String nickname;
    private double percent;
    private int personastate;
    private String player_id;
    private String protocol;
    private int rank;
    private String rating_img;
    private String real_name;
    private String start_color;
    private String steam_id;
    private String steamid;
    private String value;
    private String value_desc;

    public String getAccount_id() {
        return this.account_id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public String getGameextrainfo() {
        return this.gameextrainfo;
    }

    public String getGameid() {
        return this.gameid;
    }

    public String getHas_heybox() {
        return this.has_heybox;
    }

    public HeyboxInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getIs_steam() {
        return this.is_steam;
    }

    public String getNickname() {
        return this.nickname;
    }

    public double getPercent() {
        return this.percent;
    }

    public int getPersonastate() {
        return this.personastate;
    }

    public String getPlayer_id() {
        return this.player_id;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public int getRank() {
        return this.rank;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getReal_name() {
        return this.real_name;
    }

    public String getStart_color() {
        return this.start_color;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public String getSteamGameextrainfo() {
        return this.gameextrainfo;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public String getSteamGameid() {
        return this.gameid;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public int getSteamPersonastate() {
        return this.personastate;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public String getSteamSteamid() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13913, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getSteamid();
    }

    public String getSteam_id() {
        String str;
        String str2 = this.steam_id;
        return (str2 != null || (str = this.steamid) == null) ? str2 : str;
    }

    public String getSteamid() {
        String str;
        String str2 = this.steamid;
        return (str2 != null || (str = this.steam_id) == null) ? str2 : str;
    }

    public String getValue() {
        return this.value;
    }

    public String getValue_desc() {
        return this.value_desc;
    }

    public void setAccount_id(String str) {
        this.account_id = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    public void setGameid(String str) {
        this.gameid = str;
    }

    public void setHas_heybox(String str) {
        this.has_heybox = str;
    }

    public void setHeybox_info(HeyboxInfoObj heyboxInfoObj) {
        this.heybox_info = heyboxInfoObj;
    }

    public void setIs_steam(String str) {
        this.is_steam = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPercent(double d10) {
        this.percent = d10;
    }

    public void setPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setReal_name(String str) {
        this.real_name = str;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public void setSteamGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public void setSteamGameid(String str) {
        this.gameid = str;
    }

    @Override // com.max.xiaoheihe.bean.account.ISteamOnlineState
    public void setSteamPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setValue_desc(String str) {
        this.value_desc = str;
    }
}
