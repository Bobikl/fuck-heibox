package com.max.xiaoheihe.bean.game.gamedata;

import com.max.xiaoheihe.bean.account.HeyboxInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LeaderboardsPlayerRankObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4269490096093165104L;
    private String account_id;
    private String avatar;
    private HeyboxInfoObj heybox_info;
    private String nickname;
    private String rating_desc;
    private String value;

    public String getAccount_id() {
        return this.account_id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public HeyboxInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getRating_desc() {
        return this.rating_desc;
    }

    public String getValue() {
        return this.value;
    }

    public void setAccount_id(String str) {
        this.account_id = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setHeybox_info(HeyboxInfoObj heyboxInfoObj) {
        this.heybox_info = heyboxInfoObj;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRating_desc(String str) {
        this.rating_desc = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
