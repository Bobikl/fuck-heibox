package com.max.xiaoheihe.bean.game.apex;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class ApexSearchPlayerObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avatar;
    private String games_played;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName(alternate = {"origin_id"}, value = "id")
    private String f76975id;
    private String nickname;

    public String getAvatar() {
        return this.avatar;
    }

    public String getGames_played() {
        return this.games_played;
    }

    public String getId() {
        return this.f76975id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setGames_played(String str) {
        this.games_played = str;
    }

    public void setId(String str) {
        this.f76975id = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
