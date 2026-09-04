package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GiftBotProgressObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1719946489653322356L;
    private String bind_steamid_64;
    private String content;
    private String error_msg;
    private List<String> hb_bot_steamids;
    private String hb_friends_code;
    private HashMap<String, String> host;
    private String need_add_friends;
    private SteamAcceptGameParams remember_store_login;
    private String state;
    private String tips;
    private String title;

    public String getBind_steamid_64() {
        return this.bind_steamid_64;
    }

    public String getContent() {
        return this.content;
    }

    public String getError_msg() {
        return this.error_msg;
    }

    public List<String> getHb_bot_steamids() {
        return this.hb_bot_steamids;
    }

    public String getHb_friends_code() {
        return this.hb_friends_code;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public String getNeed_add_friends() {
        return this.need_add_friends;
    }

    public SteamAcceptGameParams getRemember_store_login() {
        return this.remember_store_login;
    }

    public String getState() {
        return this.state;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTitle() {
        return this.title;
    }

    public void setBind_steamid_64(String str) {
        this.bind_steamid_64 = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setError_msg(String str) {
        this.error_msg = str;
    }

    public void setHb_bot_steamids(List<String> list) {
        this.hb_bot_steamids = list;
    }

    public void setHb_friends_code(String str) {
        this.hb_friends_code = str;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setNeed_add_friends(String str) {
        this.need_add_friends = str;
    }

    public void setRemember_store_login(SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_store_login = steamAcceptGameParams;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
