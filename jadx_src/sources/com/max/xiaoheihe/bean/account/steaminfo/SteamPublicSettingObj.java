package com.max.xiaoheihe.bean.account.steaminfo;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SteamPublicSettingObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AccProxyObj acc_proxy;
    private String banned;
    private EncryptionParamsObj encrypted_proxy_info;
    private String games_url;
    private HashMap<String, String> host;
    private ArrayList<TagJsObj> js_list;
    private String msg;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f76949p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f76950p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f76951p3;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private String f76952q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private String f76953q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private String f76954q3;
    private KeyDescObj r_proxy;
    private String r_url;
    private SteamAcceptGameParams steam_proxy;
    private String sys_msg;
    private BindTaskInfoObj task_info;
    private String url;
    private String use_http;

    public AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    public String getBanned() {
        return this.banned;
    }

    public EncryptionParamsObj getEncrypted_proxy_info() {
        return this.encrypted_proxy_info;
    }

    public String getGames_url() {
        return this.games_url;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getP1() {
        return this.f76949p1;
    }

    public String getP2() {
        return this.f76950p2;
    }

    public String getP3() {
        return this.f76951p3;
    }

    public String getQ1() {
        return this.f76952q1;
    }

    public String getQ2() {
        return this.f76953q2;
    }

    public String getQ3() {
        return this.f76954q3;
    }

    public KeyDescObj getR_proxy() {
        return this.r_proxy;
    }

    public String getR_url() {
        return this.r_url;
    }

    public SteamAcceptGameParams getSteam_proxy() {
        return this.steam_proxy;
    }

    public String getSys_msg() {
        return this.sys_msg;
    }

    public BindTaskInfoObj getTask_info() {
        return this.task_info;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUse_http() {
        return this.use_http;
    }

    public void setAcc_proxy(AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public void setBanned(String str) {
        this.banned = str;
    }

    public void setEncrypted_proxy_info(EncryptionParamsObj encryptionParamsObj) {
        this.encrypted_proxy_info = encryptionParamsObj;
    }

    public void setGames_url(String str) {
        this.games_url = str;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setJs_list(ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setP1(String str) {
        this.f76949p1 = str;
    }

    public void setP2(String str) {
        this.f76950p2 = str;
    }

    public void setP3(String str) {
        this.f76951p3 = str;
    }

    public void setQ1(String str) {
        this.f76952q1 = str;
    }

    public void setQ2(String str) {
        this.f76953q2 = str;
    }

    public void setQ3(String str) {
        this.f76954q3 = str;
    }

    public void setR_proxy(KeyDescObj keyDescObj) {
        this.r_proxy = keyDescObj;
    }

    public void setR_url(String str) {
        this.r_url = str;
    }

    public void setSteam_proxy(SteamAcceptGameParams steamAcceptGameParams) {
        this.steam_proxy = steamAcceptGameParams;
    }

    public void setSys_msg(String str) {
        this.sys_msg = str;
    }

    public void setTask_info(BindTaskInfoObj bindTaskInfoObj) {
        this.task_info = bindTaskInfoObj;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUse_http(String str) {
        this.use_http = str;
    }
}
