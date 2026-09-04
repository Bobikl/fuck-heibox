package com.max.xiaoheihe.bean.game.ow;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OWAccountInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2498873595725710241L;
    private List<KeyDescObj> items;
    private String masthead;
    private String mode;
    private String nickname;
    private String player_id;
    private String portraitAvatar;
    private String season;

    public List<KeyDescObj> getItems() {
        return this.items;
    }

    public String getMasthead() {
        return this.masthead;
    }

    public String getMode() {
        return this.mode;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPlayer_id() {
        return this.player_id;
    }

    public String getPortraitAvatar() {
        return this.portraitAvatar;
    }

    public String getSeason() {
        return this.season;
    }

    public void setItems(List<KeyDescObj> list) {
        this.items = list;
    }

    public void setMasthead(String str) {
        this.masthead = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
    }

    public void setPortraitAvatar(String str) {
        this.portraitAvatar = str;
    }

    public void setSeason(String str) {
        this.season = str;
    }
}
