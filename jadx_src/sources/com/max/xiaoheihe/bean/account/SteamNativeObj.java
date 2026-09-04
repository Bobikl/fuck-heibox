package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SteamNativeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avatar;
    private String avatarfull;
    private String avatarmedium;
    private int communityvisibilitystate;
    private String gameextrainfo;
    private String gameid;
    private String lastlogoff;
    private String loccountrycode;
    private String personaname;
    private int personastate;
    private int personastateflags;
    private String primaryclanid;
    private int profilestate;
    private String profileurl;
    private String realname;
    private String steamid;
    private String timecreated;

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarfull() {
        return this.avatarfull;
    }

    public String getAvatarmedium() {
        return this.avatarmedium;
    }

    public int getCommunityvisibilitystate() {
        return this.communityvisibilitystate;
    }

    public String getGameextrainfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13972, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ("Counter-Strike: Global Offensive".equals(this.gameextrainfo)) {
            return "CS:GO";
        }
        return ("playerunknown's battlegrounds".equals(this.gameextrainfo) || "PLAYERUNKNOWN'S BATTLEGROUNDS".equals(this.gameextrainfo)) ? "绝地求生" : this.gameextrainfo;
    }

    public String getGameid() {
        return this.gameid;
    }

    public String getLastlogoff() {
        return this.lastlogoff;
    }

    public String getLoccountrycode() {
        return this.loccountrycode;
    }

    public String getPersonaname() {
        return this.personaname;
    }

    public int getPersonastate() {
        return this.personastate;
    }

    public int getPersonastateflags() {
        return this.personastateflags;
    }

    public String getPrimaryclanid() {
        return this.primaryclanid;
    }

    public int getProfilestate() {
        return this.profilestate;
    }

    public String getProfileurl() {
        return this.profileurl;
    }

    public String getRealname() {
        return this.realname;
    }

    public String getSteamid() {
        return this.steamid;
    }

    public String getTimecreated() {
        return this.timecreated;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarfull(String str) {
        this.avatarfull = str;
    }

    public void setAvatarmedium(String str) {
        this.avatarmedium = str;
    }

    public void setCommunityvisibilitystate(int i10) {
        this.communityvisibilitystate = i10;
    }

    public void setGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    public void setGameid(String str) {
        this.gameid = str;
    }

    public void setLastlogoff(String str) {
        this.lastlogoff = str;
    }

    public void setLoccountrycode(String str) {
        this.loccountrycode = str;
    }

    public void setPersonaname(String str) {
        this.personaname = str;
    }

    public void setPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setPersonastateflags(int i10) {
        this.personastateflags = i10;
    }

    public void setPrimaryclanid(String str) {
        this.primaryclanid = str;
    }

    public void setProfilestate(int i10) {
        this.profilestate = i10;
    }

    public void setProfileurl(String str) {
        this.profileurl = str;
    }

    public void setRealname(String str) {
        this.realname = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public void setTimecreated(String str) {
        this.timecreated = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13973, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamNativeObj{steamid='" + this.steamid + "', personaname='" + this.personaname + "', personastate=" + this.personastate + ", realname='" + this.realname + "', gameid='" + this.gameid + "'}";
    }
}
