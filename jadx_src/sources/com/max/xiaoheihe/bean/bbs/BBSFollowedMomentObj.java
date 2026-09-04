package com.max.xiaoheihe.bean.bbs;

import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GameRollRoomObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSFollowedMomentObj implements Serializable {
    public static final String CONTENT_TYPE_FOLLOW_GAME = "follow_game";
    public static final String CONTENT_TYPE_FOLLOW_USER = "follow_user";
    public static final String CONTENT_TYPE_GAME_ACHIEVE = "game_achieve";
    public static final String CONTENT_TYPE_GAME_COMMENT = "game_comment";
    public static final String CONTENT_TYPE_GAME_PURCHASE = "game_purchase";
    public static final String CONTENT_TYPE_POST_LINK = "post_link";
    public static final String CONTENT_TYPE_POST_LINK_FORWARD = "post_link_forward";
    public static final String CONTENT_TYPE_ROLL_ROOM = "roll_room";
    public static final String PURCHASE_CHANNEL_HEYBOX = "heybox";
    public static final String PURCHASE_CHANNEL_STEAM = "steam";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1744097266471059120L;
    private String achieve_count;
    private MomentsRelatedStatsObj achieve_stats;
    private String appid;
    private String content_type;
    private List<BBSFollowedMomentObj> events;
    private String follow_count;
    private List<BBSUserInfoObj> followings;
    private GameObj game;
    private List<GameObj> games;
    private String group_id;
    private String group_type;
    private String h_src;
    private List<GameObj> items;
    private BBSLinkObj link;
    private String purchase_channel;
    private String purchase_count;

    @SerializedName(alternate = {"room"}, value = "room_detail")
    private GameRollRoomObj room_detail;
    private GameCommentsObj share_info;
    private String timestamp;
    private String unlocktime;
    private BBSUserInfoObj user;
    private String userid;

    public String getAchieve_count() {
        return this.achieve_count;
    }

    public MomentsRelatedStatsObj getAchieve_stats() {
        return this.achieve_stats;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getContent_type() {
        return this.content_type;
    }

    public List<BBSFollowedMomentObj> getEvents() {
        return this.events;
    }

    public String getFollow_count() {
        return this.follow_count;
    }

    public List<BBSUserInfoObj> getFollowings() {
        return this.followings;
    }

    public GameObj getGame() {
        return this.game;
    }

    public List<GameObj> getGames() {
        return this.games;
    }

    public String getGroup_id() {
        return this.group_id;
    }

    public String getGroup_type() {
        return this.group_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public List<GameObj> getItems() {
        return this.items;
    }

    public BBSLinkObj getLink() {
        return this.link;
    }

    public String getPurchase_channel() {
        return this.purchase_channel;
    }

    public String getPurchase_count() {
        return this.purchase_count;
    }

    public GameRollRoomObj getRoom_detail() {
        return this.room_detail;
    }

    public GameCommentsObj getShare_info() {
        return this.share_info;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUnlocktime() {
        return this.unlocktime;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setAchieve_count(String str) {
        this.achieve_count = str;
    }

    public void setAchieve_stats(MomentsRelatedStatsObj momentsRelatedStatsObj) {
        this.achieve_stats = momentsRelatedStatsObj;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setContent_type(String str) {
        this.content_type = str;
    }

    public void setEvents(List<BBSFollowedMomentObj> list) {
        this.events = list;
    }

    public void setFollow_count(String str) {
        this.follow_count = str;
    }

    public void setFollowings(List<BBSUserInfoObj> list) {
        this.followings = list;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setGames(List<GameObj> list) {
        this.games = list;
    }

    public void setGroup_id(String str) {
        this.group_id = str;
    }

    public void setGroup_type(String str) {
        this.group_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setItems(List<GameObj> list) {
        this.items = list;
    }

    public void setLink(BBSLinkObj bBSLinkObj) {
        this.link = bBSLinkObj;
    }

    public void setPurchase_channel(String str) {
        this.purchase_channel = str;
    }

    public void setPurchase_count(String str) {
        this.purchase_count = str;
    }

    public void setRoom_detail(GameRollRoomObj gameRollRoomObj) {
        this.room_detail = gameRollRoomObj;
    }

    public void setShare_info(GameCommentsObj gameCommentsObj) {
        this.share_info = gameCommentsObj;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setUnlocktime(String str) {
        this.unlocktime = str;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public void setUserid(String str) {
        this.userid = str;
    }
}
