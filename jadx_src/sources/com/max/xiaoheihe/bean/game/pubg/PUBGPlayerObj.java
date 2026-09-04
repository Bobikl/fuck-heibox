package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGPlayerObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8322085930540400433L;
    private String avatar;
    private String nickname;
    private String rating;
    private String rating_img;
    private String real_name;

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getRating() {
        return this.rating;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getReal_name() {
        return this.real_name;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setReal_name(String str) {
        this.real_name = str;
    }
}
