package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderStateObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3244803150193819898L;
    private String add_friends_token;
    private String bot_steamid;
    private String gift_id;
    private List<String> hb_bot_steamids;
    private String need_add_friends;
    private String state;
    private String state_desc;
    private String version;

    public String getAdd_friends_token() {
        return this.add_friends_token;
    }

    public String getBot_steamid() {
        return this.bot_steamid;
    }

    public String getGift_id() {
        return this.gift_id;
    }

    public List<String> getHb_bot_steamids() {
        return this.hb_bot_steamids;
    }

    public String getNeed_add_friends() {
        return this.need_add_friends;
    }

    public String getState() {
        return this.state;
    }

    public String getState_desc() {
        return this.state_desc;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAdd_friends_token(String str) {
        this.add_friends_token = str;
    }

    public void setBot_steamid(String str) {
        this.bot_steamid = str;
    }

    public void setGift_id(String str) {
        this.gift_id = str;
    }

    public void setHb_bot_steamids(List<String> list) {
        this.hb_bot_steamids = list;
    }

    public void setNeed_add_friends(String str) {
        this.need_add_friends = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setState_desc(String str) {
        this.state_desc = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
