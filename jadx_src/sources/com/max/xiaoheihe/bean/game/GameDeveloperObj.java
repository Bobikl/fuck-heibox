package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDeveloperObj implements Serializable {
    public static final String FOLLOW_STATE_FOLLOWING = "following";
    public static final String FOLLOW_STATE_UNFOLLOWING = "unfollowing";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7947619433612579990L;
    private String bg_img;
    private String desc;
    private String dvpid;
    private String follow_state;
    private String game_desc;
    private List<GameObj> games;
    private String img_url;
    private String name;

    public String getBg_img() {
        return this.bg_img;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDvpid() {
        return this.dvpid;
    }

    public String getFollow_state() {
        return this.follow_state;
    }

    public String getGame_desc() {
        return this.game_desc;
    }

    public List<GameObj> getGames() {
        return this.games;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getName() {
        return this.name;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDvpid(String str) {
        this.dvpid = str;
    }

    public void setFollow_state(String str) {
        this.follow_state = str;
    }

    public void setGame_desc(String str) {
        this.game_desc = str;
    }

    public void setGames(List<GameObj> list) {
        this.games = list;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
