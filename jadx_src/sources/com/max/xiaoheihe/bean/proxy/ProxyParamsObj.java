package com.max.xiaoheihe.bean.proxy;

import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2838083720585445433L;
    private AccProxyObj acc_proxy;
    private HashMap<String, String> host;
    private ArrayList<TagJsObj> js_list;
    private SteamAcceptGameParams steam_proxy;
    private String sys_msg;

    public AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    public SteamAcceptGameParams getSteam_proxy() {
        return this.steam_proxy;
    }

    public String getSys_msg() {
        return this.sys_msg;
    }

    public void setAcc_proxy(AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setJs_list(ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public void setSteam_proxy(SteamAcceptGameParams steamAcceptGameParams) {
        this.steam_proxy = steamAcceptGameParams;
    }

    public void setSys_msg(String str) {
        this.sys_msg = str;
    }
}
