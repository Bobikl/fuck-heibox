package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HeyboxInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avartar;
    private AvatarDecorationObj avatar_decoration;
    private String is_follow;
    private LevelInfoObj level_info;
    private int sex;
    private String userid;
    private String username;

    public String getAvartar() {
        return this.avartar;
    }

    public AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    public String getIs_follow() {
        return this.is_follow;
    }

    public LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    public int getSex() {
        return this.sex;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getUsername() {
        return this.username;
    }

    public HeyboxInfoObj setAvartar(String str) {
        this.avartar = str;
        return this;
    }

    public void setAvatar_decoration(AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public void setIs_follow(String str) {
        this.is_follow = str;
    }

    public HeyboxInfoObj setLevel_info(LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
        return this;
    }

    public HeyboxInfoObj setSex(int i10) {
        this.sex = i10;
        return this;
    }

    public HeyboxInfoObj setUserid(String str) {
        this.userid = str;
        return this;
    }

    public HeyboxInfoObj setUsername(String str) {
        this.username = str;
        return this;
    }
}
