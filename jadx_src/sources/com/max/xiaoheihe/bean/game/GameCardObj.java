package com.max.xiaoheihe.bean.game;

import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.account.GameCardChildObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameCardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2293123296811475373L;
    private List<GameCardChildObj> accounts;

    @SerializedName("add_accounts")
    private boolean canAddAccounts;
    private String card_show;
    private String friend_code_show;
    private String game_name;
    private String game_type;
    private String icon;
    private String master;
    private String nickname;
    private String protocol;
    private String topic_id;

    public List<GameCardChildObj> getAccounts() {
        return this.accounts;
    }

    public String getCard_show() {
        return this.card_show;
    }

    public String getFriend_code_show() {
        return this.friend_code_show;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getMaster() {
        return this.master;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public boolean isCanAddAccounts() {
        return this.canAddAccounts;
    }

    public void setAccounts(List<GameCardChildObj> list) {
        this.accounts = list;
    }

    public void setCanAddAccounts(boolean z10) {
        this.canAddAccounts = z10;
    }

    public void setCard_show(String str) {
        this.card_show = str;
    }

    public void setFriend_code_show(String str) {
        this.friend_code_show = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMaster(String str) {
        this.master = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14692, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameCardObj{game_name='" + this.game_name + "', game_type='" + this.game_type + "', nickname='" + this.nickname + "', accounts=" + this.accounts + '}';
    }
}
