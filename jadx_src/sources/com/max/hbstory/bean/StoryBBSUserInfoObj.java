package com.max.hbstory.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class StoryBBSUserInfoObj implements Serializable, ISteamOnlineState {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1359361077363968341L;
    private List<KeyDescObj> achieve;
    private KeyDescObj author_center;
    private String avartar;
    private String avatar;
    private AvatarDecorationObj avatar_decoration;
    private String awarded_num;
    private String battery;
    private String border;
    private boolean checked;
    private String fan_num;
    private String favour_num;
    private String favour_post_num;
    private String follow_at;
    private String follow_num;
    private int follow_score;
    private String follow_status;
    private String forbid_duration;
    private String forbid_info;
    private String game_comment_num;
    private String gameextrainfo;
    private String gameid;
    private String is_bbs_manager;
    private String is_follow;
    private String is_offical;
    private int last_event_at;
    private LevelInfoObj level_info;
    private List<UserMedalObj> medal;
    private List<UserMedalObj> medals;
    private String moments_num;
    private String news_comment_num;
    private int personastate;
    private String post_article_num;
    private String post_comment_num;
    private String post_link_num;
    private String post_user_status_num;
    private String post_video_num;
    private String rec_tag;
    private String remarks;
    private String sender_id;
    private String sex;
    private String signature;
    private String steamid;
    private int unread;
    private String userid;
    private String username;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Hd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBBSUserInfoObj)) {
            return false;
        }
        StoryBBSUserInfoObj storyBBSUserInfoObj = (StoryBBSUserInfoObj) obj;
        return getPersonastate() == storyBBSUserInfoObj.getPersonastate() && getFollow_score() == storyBBSUserInfoObj.getFollow_score() && getLast_event_at() == storyBBSUserInfoObj.getLast_event_at() && isChecked() == storyBBSUserInfoObj.isChecked() && getUnread() == storyBBSUserInfoObj.getUnread() && Objects.equals(getAvartar(), storyBBSUserInfoObj.getAvartar()) && Objects.equals(getAvatar(), storyBBSUserInfoObj.getAvatar()) && Objects.equals(getGame_comment_num(), storyBBSUserInfoObj.getGame_comment_num()) && Objects.equals(getMoments_num(), storyBBSUserInfoObj.getMoments_num()) && Objects.equals(getNews_comment_num(), storyBBSUserInfoObj.getNews_comment_num()) && Objects.equals(getPost_comment_num(), storyBBSUserInfoObj.getPost_comment_num()) && Objects.equals(getPost_link_num(), storyBBSUserInfoObj.getPost_link_num()) && Objects.equals(getPost_article_num(), storyBBSUserInfoObj.getPost_article_num()) && Objects.equals(getPost_video_num(), storyBBSUserInfoObj.getPost_video_num()) && Objects.equals(getIs_bbs_manager(), storyBBSUserInfoObj.getIs_bbs_manager()) && Objects.equals(getIs_offical(), storyBBSUserInfoObj.getIs_offical()) && Objects.equals(getLevel_info(), storyBBSUserInfoObj.getLevel_info()) && Objects.equals(getSex(), storyBBSUserInfoObj.getSex()) && Objects.equals(getSignature(), storyBBSUserInfoObj.getSignature()) && Objects.equals(getUserid(), storyBBSUserInfoObj.getUserid()) && Objects.equals(getUsername(), storyBBSUserInfoObj.getUsername()) && Objects.equals(getMedal(), storyBBSUserInfoObj.getMedal()) && Objects.equals(getMedals(), storyBBSUserInfoObj.getMedals()) && Objects.equals(getAwarded_num(), storyBBSUserInfoObj.getAwarded_num()) && Objects.equals(getFan_num(), storyBBSUserInfoObj.getFan_num()) && Objects.equals(getFollow_num(), storyBBSUserInfoObj.getFollow_num()) && Objects.equals(getFollow_status(), storyBBSUserInfoObj.getFollow_status()) && Objects.equals(getIs_follow(), storyBBSUserInfoObj.getIs_follow()) && Objects.equals(getRec_tag(), storyBBSUserInfoObj.getRec_tag()) && Objects.equals(getForbid_info(), storyBBSUserInfoObj.getForbid_info()) && Objects.equals(getForbid_duration(), storyBBSUserInfoObj.getForbid_duration()) && Objects.equals(getAchieve(), storyBBSUserInfoObj.getAchieve()) && Objects.equals(getAuthor_center(), storyBBSUserInfoObj.getAuthor_center()) && Objects.equals(getSteamid(), storyBBSUserInfoObj.getSteamid()) && Objects.equals(getGameextrainfo(), storyBBSUserInfoObj.getGameextrainfo()) && Objects.equals(getGameid(), storyBBSUserInfoObj.getGameid()) && Objects.equals(getBattery(), storyBBSUserInfoObj.getBattery()) && Objects.equals(getFollow_at(), storyBBSUserInfoObj.getFollow_at()) && Objects.equals(getAvatar_decoration(), storyBBSUserInfoObj.getAvatar_decoration()) && Objects.equals(getSender_id(), storyBBSUserInfoObj.getSender_id()) && Objects.equals(getBorder(), storyBBSUserInfoObj.getBorder()) && Objects.equals(getFavour_num(), storyBBSUserInfoObj.getFavour_num()) && Objects.equals(getFavour_post_num(), storyBBSUserInfoObj.getFavour_post_num()) && Objects.equals(getPost_user_status_num(), storyBBSUserInfoObj.getPost_user_status_num());
    }

    public List<KeyDescObj> getAchieve() {
        return this.achieve;
    }

    public KeyDescObj getAuthor_center() {
        return this.author_center;
    }

    public String getAvartar() {
        return this.avartar;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    public String getAwarded_num() {
        return this.awarded_num;
    }

    public String getBattery() {
        return this.battery;
    }

    public String getBorder() {
        return this.border;
    }

    public String getFan_num() {
        return this.fan_num;
    }

    public String getFavour_num() {
        return this.favour_num;
    }

    public String getFavour_post_num() {
        return this.favour_post_num;
    }

    public String getFollow_at() {
        return this.follow_at;
    }

    public String getFollow_num() {
        return this.follow_num;
    }

    public int getFollow_score() {
        return this.follow_score;
    }

    public String getFollow_status() {
        return this.follow_status;
    }

    public String getForbid_duration() {
        return this.forbid_duration;
    }

    public String getForbid_info() {
        return this.forbid_info;
    }

    public String getGame_comment_num() {
        return this.game_comment_num;
    }

    public String getGameextrainfo() {
        return this.gameextrainfo;
    }

    public String getGameid() {
        return this.gameid;
    }

    public String getIs_bbs_manager() {
        return this.is_bbs_manager;
    }

    public String getIs_follow() {
        return this.is_follow;
    }

    public String getIs_offical() {
        return this.is_offical;
    }

    public int getLast_event_at() {
        return this.last_event_at;
    }

    public LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    public List<UserMedalObj> getMedal() {
        return this.medal;
    }

    public List<UserMedalObj> getMedals() {
        return this.medals;
    }

    public String getMoments_num() {
        return this.moments_num;
    }

    public String getNews_comment_num() {
        return this.news_comment_num;
    }

    public int getPersonastate() {
        return this.personastate;
    }

    public String getPost_article_num() {
        return this.post_article_num;
    }

    public String getPost_comment_num() {
        return this.post_comment_num;
    }

    public String getPost_link_num() {
        return this.post_link_num;
    }

    public String getPost_user_status_num() {
        return this.post_user_status_num;
    }

    public String getPost_video_num() {
        return this.post_video_num;
    }

    public String getRec_tag() {
        return this.rec_tag;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSender_id() {
        return this.sender_id;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public String getSteamGameextrainfo() {
        return this.gameextrainfo;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public String getSteamGameid() {
        return this.gameid;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public int getSteamPersonastate() {
        return this.personastate;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public String getSteamSteamid() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Gd, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getSteamid();
    }

    public String getSteamid() {
        return this.steamid;
    }

    public int getUnread() {
        return this.unread;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Id, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getAvartar(), getAvatar(), getGame_comment_num(), getMoments_num(), getNews_comment_num(), getPost_comment_num(), getPost_link_num(), getPost_article_num(), getPost_video_num(), getIs_bbs_manager(), getIs_offical(), getLevel_info(), getSex(), getSignature(), getUserid(), getUsername(), getMedal(), getMedals(), getAwarded_num(), getFan_num(), getFollow_num(), getFollow_status(), getIs_follow(), getRec_tag(), getForbid_info(), getForbid_duration(), getAchieve(), getAuthor_center(), getSteamid(), Integer.valueOf(getPersonastate()), getGameextrainfo(), getGameid(), getBattery(), getFollow_at(), Integer.valueOf(getFollow_score()), Integer.valueOf(getLast_event_at()), getAvatar_decoration(), getSender_id(), getBorder(), Boolean.valueOf(isChecked()), Integer.valueOf(getUnread()), getFavour_num(), getFavour_post_num(), getPost_user_status_num(), getRemarks());
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setAchieve(List<KeyDescObj> list) {
        this.achieve = list;
    }

    public void setAuthor_center(KeyDescObj keyDescObj) {
        this.author_center = keyDescObj;
    }

    public void setAvartar(String str) {
        this.avartar = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_decoration(AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public void setAwarded_num(String str) {
        this.awarded_num = str;
    }

    public void setBattery(String str) {
        this.battery = str;
    }

    public void setBorder(String str) {
        this.border = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setFan_num(String str) {
        this.fan_num = str;
    }

    public void setFavour_num(String str) {
        this.favour_num = str;
    }

    public void setFavour_post_num(String str) {
        this.favour_post_num = str;
    }

    public void setFollow_at(String str) {
        this.follow_at = str;
    }

    public void setFollow_num(String str) {
        this.follow_num = str;
    }

    public void setFollow_score(int i10) {
        this.follow_score = i10;
    }

    public void setFollow_status(String str) {
        this.follow_status = str;
    }

    public void setForbid_duration(String str) {
        this.forbid_duration = str;
    }

    public void setForbid_info(String str) {
        this.forbid_info = str;
    }

    public void setGame_comment_num(String str) {
        this.game_comment_num = str;
    }

    public void setGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    public void setGameid(String str) {
        this.gameid = str;
    }

    public void setIs_bbs_manager(String str) {
        this.is_bbs_manager = str;
    }

    public void setIs_follow(String str) {
        this.is_follow = str;
    }

    public void setIs_offical(String str) {
        this.is_offical = str;
    }

    public void setLast_event_at(int i10) {
        this.last_event_at = i10;
    }

    public void setLevel_info(LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
    }

    public void setMedal(List<UserMedalObj> list) {
        this.medal = list;
    }

    public void setMedals(List<UserMedalObj> list) {
        this.medals = list;
    }

    public void setMoments_num(String str) {
        this.moments_num = str;
    }

    public void setNews_comment_num(String str) {
        this.news_comment_num = str;
    }

    public void setPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setPost_article_num(String str) {
        this.post_article_num = str;
    }

    public void setPost_comment_num(String str) {
        this.post_comment_num = str;
    }

    public void setPost_link_num(String str) {
        this.post_link_num = str;
    }

    public void setPost_user_status_num(String str) {
        this.post_user_status_num = str;
    }

    public void setPost_video_num(String str) {
        this.post_video_num = str;
    }

    public void setRec_tag(String str) {
        this.rec_tag = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setSender_id(String str) {
        this.sender_id = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public void setSteamGameextrainfo(String str) {
        this.gameextrainfo = str;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public void setSteamGameid(String str) {
        this.gameid = str;
    }

    @Override // com.max.hbstory.bean.ISteamOnlineState
    public void setSteamPersonastate(int i10) {
        this.personastate = i10;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public void setUnread(int i10) {
        this.unread = i10;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
