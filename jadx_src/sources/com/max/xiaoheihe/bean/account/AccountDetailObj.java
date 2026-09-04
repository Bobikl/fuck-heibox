package com.max.xiaoheihe.bean.account;

import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.max.xiaoheihe.module.upload.g;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import lb.c;

/* JADX INFO: loaded from: classes3.dex */
public class AccountDetailObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4311682640395391635L;

    @SerializedName(alternate = {g.f93525b}, value = "avartar")
    private String avartar;
    private AvatarConfigObj avatar_config;
    private AvatarDecorationObj avatar_decoration;
    private String battery;
    private BBSInfoObj bbs_info;

    @SerializedName(alternate = {c.f131115k}, value = "bbs_medal")
    private List<UserMedalObj> bbs_medal;
    private String forbid_info;
    private String friends_count;
    private String ip_location;
    private LevelInfoObj level_info;
    private List<UserMedalObj> medals;
    private String sex;
    private String show_event;
    private String signature;
    private String userid;
    private String username;

    public String getAvartar() {
        return this.avartar;
    }

    public AvatarConfigObj getAvatar_config() {
        return this.avatar_config;
    }

    public AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    public String getBattery() {
        return this.battery;
    }

    public BBSInfoObj getBbs_info() {
        return this.bbs_info;
    }

    public List<UserMedalObj> getBbs_medal() {
        return this.bbs_medal;
    }

    public String getForbid_info() {
        return this.forbid_info;
    }

    public String getFriends_count() {
        return this.friends_count;
    }

    public String getIp_location() {
        return this.ip_location;
    }

    public LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    public List<UserMedalObj> getMedals() {
        return this.medals;
    }

    public String getSex() {
        return this.sex;
    }

    public String getShow_event() {
        return this.show_event;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getUsername() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lO, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d.P1(this.username);
    }

    public void setAvartar(String str) {
        this.avartar = str;
    }

    public void setAvatar_config(AvatarConfigObj avatarConfigObj) {
        this.avatar_config = avatarConfigObj;
    }

    public void setAvatar_decoration(AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public void setBattery(String str) {
        this.battery = str;
    }

    public void setBbs_info(BBSInfoObj bBSInfoObj) {
        this.bbs_info = bBSInfoObj;
    }

    public void setBbs_medal(List<UserMedalObj> list) {
        this.bbs_medal = list;
    }

    public void setForbid_info(String str) {
        this.forbid_info = str;
    }

    public void setFriends_count(String str) {
        this.friends_count = str;
    }

    public void setIp_location(String str) {
        this.ip_location = str;
    }

    public void setLevel_info(LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
    }

    public void setMedals(List<UserMedalObj> list) {
        this.medals = list;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setShow_event(String str) {
        this.show_event = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
