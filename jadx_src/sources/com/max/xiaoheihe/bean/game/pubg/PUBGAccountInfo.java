package com.max.xiaoheihe.bean.game.pubg;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGAccountInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bg_image;
    private String match_count;
    private String match_count_desc;
    private String max_rating;
    private String max_rating_desc;
    private PlayerInfoObj player_info;
    private String rating;
    private String rating_desc;
    private String rating_img;
    private String rating_rank;
    private String rating_rank_desc;
    private List<KeyDescObj> regions;
    private String win_count;

    public String getBg_image() {
        return this.bg_image;
    }

    public String getMatch_count() {
        return this.match_count;
    }

    public String getMatch_count_desc() {
        return this.match_count_desc;
    }

    public String getMax_rating() {
        return this.max_rating;
    }

    public String getMax_rating_desc() {
        return this.max_rating_desc;
    }

    public PlayerInfoObj getPlayer_info() {
        return this.player_info;
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

    public String getRating_rank() {
        return this.rating_rank;
    }

    public String getRating_rank_desc() {
        return this.rating_rank_desc;
    }

    public List<KeyDescObj> getRegions() {
        return this.regions;
    }

    public String getWin_count() {
        return this.win_count;
    }

    public void setBg_image(String str) {
        this.bg_image = str;
    }

    public void setMatch_count(String str) {
        this.match_count = str;
    }

    public void setMatch_count_desc(String str) {
        this.match_count_desc = str;
    }

    public void setMax_rating(String str) {
        this.max_rating = str;
    }

    public void setMax_rating_desc(String str) {
        this.max_rating_desc = str;
    }

    public void setPlayer_info(PlayerInfoObj playerInfoObj) {
        this.player_info = playerInfoObj;
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

    public void setRating_rank(String str) {
        this.rating_rank = str;
    }

    public void setRating_rank_desc(String str) {
        this.rating_rank_desc = str;
    }

    public void setRegions(List<KeyDescObj> list) {
        this.regions = list;
    }

    public void setWin_count(String str) {
        this.win_count = str;
    }
}
