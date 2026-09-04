package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicMenuObj implements Serializable {
    public static final String TYPE_ADDFREELICENSE = "addfreelicense";
    public static final String TYPE_ADDFREELICENSE_EPIC = "addfreelicense_epic";
    public static final String TYPE_GAME = "game";
    public static final String TYPE_GAME_DATA = "game_data";
    public static final String TYPE_HOT_POINT = "hot_point";
    public static final String TYPE_LINK = "link";
    public static final String TYPE_NEWS = "news";
    public static final String TYPE_STATISTIC = "statistic";
    public static final String TYPE_TEAM_ORG = "team_org";
    public static final String TYPE_WATERFALL = "waterfall";
    public static final String TYPE_WEBVIEW = "webview";
    public static final String TYPE_WIKI = "wiki";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -9021688948417229115L;
    private String appid;
    private String badge_count;
    private BgConfigObj bg_config;
    private String color;
    private ArrayList<BBSTopicMenuObj> filters;
    private String game_type;
    private String menu_id;
    private String nestscroll;
    private HashMap<String, String> params;
    private String player_id;
    private PostBtnObj post_btn;
    private KeyDescObj share_info;
    private String show_loading;
    private String title;
    private String type;
    private String url;
    private String wiki_id;

    public String getAppid() {
        return this.appid;
    }

    public String getBadge_count() {
        return this.badge_count;
    }

    public BgConfigObj getBg_config() {
        return this.bg_config;
    }

    public String getColor() {
        return this.color;
    }

    public ArrayList<BBSTopicMenuObj> getFilters() {
        return this.filters;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getMenu_id() {
        return this.menu_id;
    }

    public String getNestscroll() {
        return this.nestscroll;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getPlayer_id() {
        return this.player_id;
    }

    public PostBtnObj getPost_btn() {
        return this.post_btn;
    }

    public KeyDescObj getShare_info() {
        return this.share_info;
    }

    public String getShow_loading() {
        return this.show_loading;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWiki_id() {
        return this.wiki_id;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBadge_count(String str) {
        this.badge_count = str;
    }

    public void setBg_config(BgConfigObj bgConfigObj) {
        this.bg_config = bgConfigObj;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setFilters(ArrayList<BBSTopicMenuObj> arrayList) {
        this.filters = arrayList;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setMenu_id(String str) {
        this.menu_id = str;
    }

    public void setNestscroll(String str) {
        this.nestscroll = str;
    }

    public void setParams(HashMap<String, String> map) {
        this.params = map;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
    }

    public void setPost_btn(PostBtnObj postBtnObj) {
        this.post_btn = postBtnObj;
    }

    public void setShare_info(KeyDescObj keyDescObj) {
        this.share_info = keyDescObj;
    }

    public void setShow_loading(String str) {
        this.show_loading = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWiki_id(String str) {
        this.wiki_id = str;
    }
}
