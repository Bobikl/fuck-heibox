package com.max.xiaoheihe.bean;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.gamedata.LeaderboardsPlayerRankObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6095425836904710455L;
    private String account_id;
    private String avatar;
    private String avatar_btn_state;
    private String avatar_desc;
    private List<KeyDescObj> badges;
    private String banned;
    private String best_rating;
    private String best_rating_mode;
    private String best_rating_mode_url;
    private String best_rating_region;
    private String best_rating_region_desc;
    private boolean checked;
    private PUBGMatchObj compat;
    private String credit;
    private String credit_color;
    private String credit_desc;
    private BBSUserInfoObj heybox_info;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76938id;
    private String is_vip;
    private String level;
    private String level_desc;
    private String level_img;
    private String match_count;
    private String mmr;
    private String name;
    private String nickname;
    private String player_id;
    private LeaderboardsPlayerRankObj player_info;
    private String portraitAvatar;
    private String rank;
    private String rank_img;
    private String rating;
    private String rating_desc;
    private String rating_img;
    private String real_name;
    private String region;
    private String season;
    private String server;
    private String steam_id;
    private String steam_id32;
    private String steam_nickname;
    private String steamid;
    private String update_desc;
    private String update_time;
    private String value;
    private String value1;
    private String value2;
    private String value3;
    private String value4;
    private String value5;

    public String getAccount_id() {
        return this.account_id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatar_btn_state() {
        return this.avatar_btn_state;
    }

    public String getAvatar_desc() {
        return this.avatar_desc;
    }

    public List<KeyDescObj> getBadges() {
        return this.badges;
    }

    public String getBanned() {
        return this.banned;
    }

    public String getBest_rating() {
        return this.best_rating;
    }

    public String getBest_rating_mode() {
        return this.best_rating_mode;
    }

    public String getBest_rating_mode_url() {
        return this.best_rating_mode_url;
    }

    public String getBest_rating_region() {
        return this.best_rating_region;
    }

    public String getBest_rating_region_desc() {
        return this.best_rating_region_desc;
    }

    public PUBGMatchObj getCompat() {
        return this.compat;
    }

    public String getCredit() {
        return this.credit;
    }

    public String getCredit_color() {
        return this.credit_color;
    }

    public String getCredit_desc() {
        return this.credit_desc;
    }

    public BBSUserInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getId() {
        return this.f76938id;
    }

    public String getIs_vip() {
        return this.is_vip;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevel_desc() {
        return this.level_desc;
    }

    public String getLevel_img() {
        return this.level_img;
    }

    public String getMatch_count() {
        return this.match_count;
    }

    public String getMmr() {
        return this.mmr;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPlayer_id() {
        return this.player_id;
    }

    public LeaderboardsPlayerRankObj getPlayer_info() {
        return this.player_info;
    }

    public String getPortraitAvatar() {
        return this.portraitAvatar;
    }

    public String getRank() {
        return this.rank;
    }

    public String getRank_img() {
        return this.rank_img;
    }

    public String getRating() {
        return this.rating;
    }

    public String getRating_desc() {
        return this.rating_desc;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getReal_name() {
        return this.real_name;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSeason() {
        return this.season;
    }

    public String getServer() {
        return this.server;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public String getSteam_id32() {
        return this.steam_id32;
    }

    public String getSteam_nickname() {
        return this.steam_nickname;
    }

    public String getSteamid() {
        return this.steamid;
    }

    public String getUpdate_desc() {
        return this.update_desc;
    }

    public String getUpdate_time() {
        return this.update_time;
    }

    public String getValue() {
        return this.value;
    }

    public String getValue1() {
        return this.value1;
    }

    public String getValue2() {
        return this.value2;
    }

    public String getValue3() {
        return this.value3;
    }

    public String getValue4() {
        return this.value4;
    }

    public String getValue5() {
        return this.value5;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setAccount_id(String str) {
        this.account_id = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_btn_state(String str) {
        this.avatar_btn_state = str;
    }

    public void setAvatar_desc(String str) {
        this.avatar_desc = str;
    }

    public void setBadges(List<KeyDescObj> list) {
        this.badges = list;
    }

    public void setBanned(String str) {
        this.banned = str;
    }

    public void setBest_rating(String str) {
        this.best_rating = str;
    }

    public void setBest_rating_mode(String str) {
        this.best_rating_mode = str;
    }

    public void setBest_rating_mode_url(String str) {
        this.best_rating_mode_url = str;
    }

    public void setBest_rating_region(String str) {
        this.best_rating_region = str;
    }

    public void setBest_rating_region_desc(String str) {
        this.best_rating_region_desc = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setCompat(PUBGMatchObj pUBGMatchObj) {
        this.compat = pUBGMatchObj;
    }

    public void setCredit(String str) {
        this.credit = str;
    }

    public void setCredit_color(String str) {
        this.credit_color = str;
    }

    public void setCredit_desc(String str) {
        this.credit_desc = str;
    }

    public void setHeybox_info(BBSUserInfoObj bBSUserInfoObj) {
        this.heybox_info = bBSUserInfoObj;
    }

    public void setId(String str) {
        this.f76938id = str;
    }

    public void setIs_vip(String str) {
        this.is_vip = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevel_desc(String str) {
        this.level_desc = str;
    }

    public void setLevel_img(String str) {
        this.level_img = str;
    }

    public void setMatch_count(String str) {
        this.match_count = str;
    }

    public void setMmr(String str) {
        this.mmr = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
    }

    public void setPlayer_info(LeaderboardsPlayerRankObj leaderboardsPlayerRankObj) {
        this.player_info = leaderboardsPlayerRankObj;
    }

    public void setPortraitAvatar(String str) {
        this.portraitAvatar = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setRank_img(String str) {
        this.rank_img = str;
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public void setRating_desc(String str) {
        this.rating_desc = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setReal_name(String str) {
        this.real_name = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setSeason(String str) {
        this.season = str;
    }

    public void setServer(String str) {
        this.server = str;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }

    public void setSteam_id32(String str) {
        this.steam_id32 = str;
    }

    public void setSteam_nickname(String str) {
        this.steam_nickname = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public void setUpdate_desc(String str) {
        this.update_desc = str;
    }

    public void setUpdate_time(String str) {
        this.update_time = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setValue1(String str) {
        this.value1 = str;
    }

    public void setValue2(String str) {
        this.value2 = str;
    }

    public void setValue3(String str) {
        this.value3 = str;
    }

    public void setValue4(String str) {
        this.value4 = str;
    }

    public void setValue5(String str) {
        this.value5 = str;
    }
}
