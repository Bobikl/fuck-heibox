package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.ProxyObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class AutoAcceptGameParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1375025500764364635L;
    private AccProxyObj acc_proxy;
    private SteamAcceptGameParams accept_friend;
    private SteamAcceptGameParams accept_gift;
    private ProxyObj android_proxy;
    private String auto_accept;
    private String bind_steamid_64;
    private HashMap<String, String> host;
    private ArrayList<TagJsObj> js_list;
    private String no_bot;
    private String product_state;
    private SteamAcceptGameParams remember_community_login;
    private SteamAcceptGameParams remember_store_login;
    private SteamAcceptGameParams steam_proxy;
    private String sys_msg;
    private SteamAcceptGameParams use_cdkey;

    public AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    public SteamAcceptGameParams getAccept_friend() {
        return this.accept_friend;
    }

    public SteamAcceptGameParams getAccept_gift() {
        return this.accept_gift;
    }

    public ProxyObj getAndroid_proxy() {
        return this.android_proxy;
    }

    public String getAuto_accept() {
        return this.auto_accept;
    }

    public String getBind_steamid_64() {
        return this.bind_steamid_64;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    public String getNo_bot() {
        return this.no_bot;
    }

    public String getProduct_state() {
        return this.product_state;
    }

    public SteamAcceptGameParams getRemember_community_login() {
        return this.remember_community_login;
    }

    public SteamAcceptGameParams getRemember_store_login() {
        return this.remember_store_login;
    }

    public SteamAcceptGameParams getSteam_proxy() {
        return this.steam_proxy;
    }

    public String getSys_msg() {
        return this.sys_msg;
    }

    public SteamAcceptGameParams getUse_cdkey() {
        return this.use_cdkey;
    }

    public void setAcc_proxy(AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public void setAccept_friend(SteamAcceptGameParams steamAcceptGameParams) {
        this.accept_friend = steamAcceptGameParams;
    }

    public void setAccept_gift(SteamAcceptGameParams steamAcceptGameParams) {
        this.accept_gift = steamAcceptGameParams;
    }

    public void setAndroid_proxy(ProxyObj proxyObj) {
        this.android_proxy = proxyObj;
    }

    public void setAuto_accept(String str) {
        this.auto_accept = str;
    }

    public void setBind_steamid_64(String str) {
        this.bind_steamid_64 = str;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setJs_list(ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public void setNo_bot(String str) {
        this.no_bot = str;
    }

    public void setProduct_state(String str) {
        this.product_state = str;
    }

    public void setRemember_community_login(SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_community_login = steamAcceptGameParams;
    }

    public void setRemember_store_login(SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_store_login = steamAcceptGameParams;
    }

    public void setSteam_proxy(SteamAcceptGameParams steamAcceptGameParams) {
        this.steam_proxy = steamAcceptGameParams;
    }

    public void setSys_msg(String str) {
        this.sys_msg = str;
    }

    public void setUse_cdkey(SteamAcceptGameParams steamAcceptGameParams) {
        this.use_cdkey = steamAcceptGameParams;
    }
}
