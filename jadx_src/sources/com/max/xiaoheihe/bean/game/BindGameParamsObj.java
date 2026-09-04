package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.BindAccountGameInfo;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BindGameParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AccProxyObj acc_proxy;
    private String bind_url;
    private BindAccountGameInfo destiny2;
    private HashMap<String, String> host;
    private ArrayList<TagJsObj> js_list;
    private String proxy_ip;
    private String proxy_manager_id;
    private String proxy_port;
    private SteamAcceptGameParams steam_proxy;
    private String update_state;

    public AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    public String getBind_url() {
        return this.bind_url;
    }

    public BindAccountGameInfo getDestiny2() {
        return this.destiny2;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    public String getProxy_ip() {
        return this.proxy_ip;
    }

    public String getProxy_manager_id() {
        return this.proxy_manager_id;
    }

    public String getProxy_port() {
        return this.proxy_port;
    }

    public SteamAcceptGameParams getSteam_proxy() {
        return this.steam_proxy;
    }

    public String getUpdate_state() {
        return this.update_state;
    }

    public void setAcc_proxy(AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public void setBind_url(String str) {
        this.bind_url = str;
    }

    public void setDestiny2(BindAccountGameInfo bindAccountGameInfo) {
        this.destiny2 = bindAccountGameInfo;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setJs_list(ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public void setProxy_ip(String str) {
        this.proxy_ip = str;
    }

    public void setProxy_manager_id(String str) {
        this.proxy_manager_id = str;
    }

    public void setProxy_port(String str) {
        this.proxy_port = str;
    }

    public void setSteam_proxy(SteamAcceptGameParams steamAcceptGameParams) {
        this.steam_proxy = steamAcceptGameParams;
    }

    public void setUpdate_state(String str) {
        this.update_state = str;
    }
}
