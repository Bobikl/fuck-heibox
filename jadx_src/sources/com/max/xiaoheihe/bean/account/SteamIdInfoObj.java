package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.account.steaminfo.BadgeDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SteamIdInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String account_year;
    private String api_key_desc;
    private String api_key_protocol;
    private String avatar;
    private String avatar_frame;
    private String city;
    private String country;
    private String country_code;
    private String country_flag;
    private String date_desc;
    private String desc;
    private List<KeyDescObj> distribute_play_time;
    private List<KeyDescObj> distribute_price;
    private BadgeDetailObj favorite_badge;
    private String friend_code;
    private String friend_code_show;
    private String friend_list_protocol;
    private String gameid;
    private String has_history;
    private String head_image;
    private String head_video;
    private HeyboxInfoObj heybox_info;
    private String individuality_signature;
    private String inventory_open;
    private int level;
    private String level_icon;
    private String nickname;
    private String online_state_url;
    private String personal_infomation_open;
    private PlayInfoObj play_info;
    private String protocol;
    private String province;
    private String short_id;
    private String steamid;
    private String total_badge_count;
    private String total_dlcs_count;
    private String total_game_count;
    private String total_game_price;
    private String total_player_time;
    private String update_time;
    private int personastate = 0;
    private String gameextrainfo = null;

    public String getAccount_year() {
        return this.account_year;
    }

    public String getApi_key_desc() {
        return this.api_key_desc;
    }

    public String getApi_key_protocol() {
        return this.api_key_protocol;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatar_frame() {
        return this.avatar_frame;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountry_code() {
        return this.country_code;
    }

    public String getCountry_flag() {
        return this.country_flag;
    }

    public String getDate_desc() {
        return this.date_desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<KeyDescObj> getDistribute_play_time() {
        return this.distribute_play_time;
    }

    public List<KeyDescObj> getDistribute_price() {
        return this.distribute_price;
    }

    public BadgeDetailObj getFavorite_badge() {
        return this.favorite_badge;
    }

    public String getFriend_code() {
        return this.friend_code;
    }

    public String getFriend_code_show() {
        return this.friend_code_show;
    }

    public String getFriend_list_protocol() {
        return this.friend_list_protocol;
    }

    public String getGameextrainfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13970, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ("Counter-Strike: Global Offensive".equals(this.gameextrainfo)) {
            return "CS:GO";
        }
        return ("playerunknown's battlegrounds".equals(this.gameextrainfo) || "PLAYERUNKNOWN'S BATTLEGROUNDS".equals(this.gameextrainfo)) ? "绝地求生" : this.gameextrainfo;
    }

    public String getGameid() {
        return this.gameid;
    }

    public String getHas_history() {
        return this.has_history;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public String getHead_video() {
        return this.head_video;
    }

    public HeyboxInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getIndividuality_signature() {
        return this.individuality_signature;
    }

    public String getInventory_open() {
        return this.inventory_open;
    }

    public int getLevel() {
        return this.level;
    }

    public String getLevel_icon() {
        return this.level_icon;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getOnline_state_url() {
        return this.online_state_url;
    }

    public String getPersonal_infomation_open() {
        return this.personal_infomation_open;
    }

    public int getPersonastate() {
        return this.personastate;
    }

    public PlayInfoObj getPlay_info() {
        return this.play_info;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getProvince() {
        return this.province;
    }

    public String getShort_id() {
        return this.short_id;
    }

    public String getSteamid() {
        return this.steamid;
    }

    public String getTotal_badge_count() {
        return this.total_badge_count;
    }

    public String getTotal_dlcs_count() {
        return this.total_dlcs_count;
    }

    public String getTotal_game_count() {
        return this.total_game_count;
    }

    public String getTotal_game_price() {
        return this.total_game_price;
    }

    public String getTotal_player_time() {
        return this.total_player_time;
    }

    public String getUpdate_time() {
        return this.update_time;
    }

    public void setAccount_year(String str) {
        this.account_year = str;
    }

    public void setApi_key_desc(String str) {
        this.api_key_desc = str;
    }

    public void setApi_key_protocol(String str) {
        this.api_key_protocol = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_frame(String str) {
        this.avatar_frame = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCountry_code(String str) {
        this.country_code = str;
    }

    public void setCountry_flag(String str) {
        this.country_flag = str;
    }

    public void setDate_desc(String str) {
        this.date_desc = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDistribute_play_time(List<KeyDescObj> list) {
        this.distribute_play_time = list;
    }

    public void setDistribute_price(List<KeyDescObj> list) {
        this.distribute_price = list;
    }

    public void setFavorite_badge(BadgeDetailObj badgeDetailObj) {
        this.favorite_badge = badgeDetailObj;
    }

    public void setFriend_code(String str) {
        this.friend_code = str;
    }

    public void setFriend_code_show(String str) {
        this.friend_code_show = str;
    }

    public void setFriend_list_protocol(String str) {
        this.friend_list_protocol = str;
    }

    public SteamIdInfoObj setGameextrainfo(String str) {
        this.gameextrainfo = str;
        return this;
    }

    public void setGameid(String str) {
        this.gameid = str;
    }

    public void setHas_history(String str) {
        this.has_history = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setHead_video(String str) {
        this.head_video = str;
    }

    public SteamIdInfoObj setHeybox_info(HeyboxInfoObj heyboxInfoObj) {
        this.heybox_info = heyboxInfoObj;
        return this;
    }

    public void setIndividuality_signature(String str) {
        this.individuality_signature = str;
    }

    public SteamIdInfoObj setInventory_open(String str) {
        this.inventory_open = str;
        return this;
    }

    public void setLevel(int i10) {
        this.level = i10;
    }

    public void setLevel_icon(String str) {
        this.level_icon = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setOnline_state_url(String str) {
        this.online_state_url = str;
    }

    public SteamIdInfoObj setPersonal_infomation_open(String str) {
        this.personal_infomation_open = str;
        return this;
    }

    public SteamIdInfoObj setPersonastate(int i10) {
        this.personastate = i10;
        return this;
    }

    public void setPlay_info(PlayInfoObj playInfoObj) {
        this.play_info = playInfoObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setShort_id(String str) {
        this.short_id = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public SteamIdInfoObj setTotal_badge_count(String str) {
        this.total_badge_count = str;
        return this;
    }

    public SteamIdInfoObj setTotal_dlcs_count(String str) {
        this.total_dlcs_count = str;
        return this;
    }

    public SteamIdInfoObj setTotal_game_count(String str) {
        this.total_game_count = str;
        return this;
    }

    public SteamIdInfoObj setTotal_game_price(String str) {
        this.total_game_price = str;
        return this;
    }

    public SteamIdInfoObj setTotal_player_time(String str) {
        this.total_player_time = str;
        return this;
    }

    public void setUpdate_time(String str) {
        this.update_time = str;
    }

    public HeyboxRankObj toHeyBoxRankObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13971, new Class[0], HeyboxRankObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyboxRankObj) patchProxyResultProxy.result;
        }
        HeyboxRankObj heyboxRankObj = new HeyboxRankObj();
        heyboxRankObj.setSteamid_info(this);
        heyboxRankObj.setHeybox_info(this.heybox_info);
        heyboxRankObj.setPlay_info(this.play_info);
        return heyboxRankObj;
    }
}
