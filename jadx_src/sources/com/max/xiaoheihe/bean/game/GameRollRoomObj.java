package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameRollRoomObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6538835030686565741L;
    private String create_time;
    private List<GameRollEarnInfoObj> earn_info;
    private String game_count;
    private String get_prize_user_num;
    private boolean has_pass;
    private boolean has_pwd;
    private BBSUserInfoObj host_user_info;
    private String in_room;
    private String join_user_count;
    private List<BBSUserInfoObj> join_users;
    private String joined;
    private String link_id;
    private String link_tag;
    private GameRollEarnInfoObj my_prize;
    private String need_coin;
    private String over;
    private EncryptionParamsObj passwd;
    private String people;
    private String price;
    private List<RollItemObj> roll_items;
    private String roll_time;
    private String roll_time_desc;
    private String room_desc;
    private String room_id;
    private String room_title;
    private String share_desc;
    private String share_title;
    private String share_url;
    private String total_price;
    private BBSUserInfoObj user_info;
    private String win_prize;

    public String getCreate_time() {
        return this.create_time;
    }

    public List<GameRollEarnInfoObj> getEarn_info() {
        return this.earn_info;
    }

    public String getGame_count() {
        return this.game_count;
    }

    public String getGet_prize_user_num() {
        return this.get_prize_user_num;
    }

    public BBSUserInfoObj getHost_user_info() {
        return this.host_user_info;
    }

    public String getIn_room() {
        return this.in_room;
    }

    public String getJoin_user_count() {
        return this.join_user_count;
    }

    public List<BBSUserInfoObj> getJoin_users() {
        return this.join_users;
    }

    public String getJoined() {
        return this.joined;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public String getLink_tag() {
        return this.link_tag;
    }

    public GameRollEarnInfoObj getMy_prize() {
        return this.my_prize;
    }

    public String getNeed_coin() {
        return this.need_coin;
    }

    public String getOver() {
        return this.over;
    }

    public EncryptionParamsObj getPasswd() {
        return this.passwd;
    }

    public String getPeople() {
        return this.people;
    }

    public String getPrice() {
        return this.price;
    }

    public List<RollItemObj> getRoll_items() {
        return this.roll_items;
    }

    public String getRoll_time() {
        return this.roll_time;
    }

    public String getRoll_time_desc() {
        return this.roll_time_desc;
    }

    public String getRoom_desc() {
        return this.room_desc;
    }

    public String getRoom_id() {
        return this.room_id;
    }

    public String getRoom_title() {
        return this.room_title;
    }

    public String getShare_desc() {
        return this.share_desc;
    }

    public String getShare_title() {
        return this.share_title;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getTotal_price() {
        return this.total_price;
    }

    public BBSUserInfoObj getUser_info() {
        return this.user_info;
    }

    public String getWin_prize() {
        return this.win_prize;
    }

    public boolean isHas_pass() {
        return this.has_pass;
    }

    public boolean isHas_pwd() {
        return this.has_pwd;
    }

    public void setCreate_time(String str) {
        this.create_time = str;
    }

    public void setEarn_info(List<GameRollEarnInfoObj> list) {
        this.earn_info = list;
    }

    public void setGame_count(String str) {
        this.game_count = str;
    }

    public void setGet_prize_user_num(String str) {
        this.get_prize_user_num = str;
    }

    public void setHas_pass(boolean z10) {
        this.has_pass = z10;
    }

    public void setHas_pwd(boolean z10) {
        this.has_pwd = z10;
    }

    public void setHost_user_info(BBSUserInfoObj bBSUserInfoObj) {
        this.host_user_info = bBSUserInfoObj;
    }

    public void setIn_room(String str) {
        this.in_room = str;
    }

    public void setJoin_user_count(String str) {
        this.join_user_count = str;
    }

    public void setJoin_users(List<BBSUserInfoObj> list) {
        this.join_users = list;
    }

    public void setJoined(String str) {
        this.joined = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setLink_tag(String str) {
        this.link_tag = str;
    }

    public void setMy_prize(GameRollEarnInfoObj gameRollEarnInfoObj) {
        this.my_prize = gameRollEarnInfoObj;
    }

    public void setNeed_coin(String str) {
        this.need_coin = str;
    }

    public void setOver(String str) {
        this.over = str;
    }

    public void setPasswd(EncryptionParamsObj encryptionParamsObj) {
        this.passwd = encryptionParamsObj;
    }

    public void setPeople(String str) {
        this.people = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRoll_items(List<RollItemObj> list) {
        this.roll_items = list;
    }

    public void setRoll_time(String str) {
        this.roll_time = str;
    }

    public void setRoll_time_desc(String str) {
        this.roll_time_desc = str;
    }

    public void setRoom_desc(String str) {
        this.room_desc = str;
    }

    public void setRoom_id(String str) {
        this.room_id = str;
    }

    public void setShare_desc(String str) {
        this.share_desc = str;
    }

    public void setShare_title(String str) {
        this.share_title = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setTotal_price(String str) {
        this.total_price = str;
    }

    public void setUser_info(BBSUserInfoObj bBSUserInfoObj) {
        this.user_info = bBSUserInfoObj;
    }

    public void setWin_prize(String str) {
        this.win_prize = str;
    }
}
