package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameCompilationDetailObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1617510105790630945L;
    private String bg_img;
    private String desc;
    private List<GameObj> games;
    private String key_point;
    private String share_desc;
    private String share_img;
    private String share_title;
    private String share_url;
    private String title;

    public String getBg_img() {
        return this.bg_img;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<GameObj> getGames() {
        return this.games;
    }

    public String getKey_point() {
        return this.key_point;
    }

    public String getShare_desc() {
        return this.share_desc;
    }

    public String getShare_img() {
        return this.share_img;
    }

    public String getShare_title() {
        return this.share_title;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setGames(List<GameObj> list) {
        this.games = list;
    }

    public void setKey_point(String str) {
        this.key_point = str;
    }

    public void setShare_desc(String str) {
        this.share_desc = str;
    }

    public void setShare_img(String str) {
        this.share_img = str;
    }

    public void setShare_title(String str) {
        this.share_title = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
