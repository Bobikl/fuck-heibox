package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SteamAcceptGameParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3897941734941248889L;
    private String bind_id;
    private ArrayList<String> cookie_urls;
    private String cookie_version;
    private HashMap<String, ArrayList<String>> hosts;
    private String inject_js_on_ready;
    private String is_owned_regex;
    private boolean is_use_epic_api;
    private boolean is_use_new_epic_js;
    private EncryptionParamsObj js;
    private String key;
    private String login_url;
    private String msg;
    private MallOrderNotifyObj noti_msg;
    private EncryptionParamsObj proxy;
    private String proxy_type;
    private String purchase_token_regex;
    private ArrayList<String> r_cookie_urls;
    private EncryptionParamsObj r_js;
    private String r_url;
    private String regular;
    private String regular_bundle;
    private String relogin_url;
    private EncryptionParamsObj remember_js;
    private String send;
    private String steam_id;
    private String type;
    private String url;
    private String url_bundle;
    private String use_proxy;

    public String getBind_id() {
        return this.bind_id;
    }

    public ArrayList<String> getCookie_urls() {
        return this.cookie_urls;
    }

    public String getCookie_version() {
        return this.cookie_version;
    }

    public HashMap<String, ArrayList<String>> getHosts() {
        return this.hosts;
    }

    public String getInject_js_on_ready() {
        return this.inject_js_on_ready;
    }

    public String getIs_owned_regex() {
        return this.is_owned_regex;
    }

    public EncryptionParamsObj getJs() {
        return this.js;
    }

    public String getKey() {
        return this.key;
    }

    public String getLogin_url() {
        return this.login_url;
    }

    public String getMsg() {
        return this.msg;
    }

    public MallOrderNotifyObj getNoti_msg() {
        return this.noti_msg;
    }

    public EncryptionParamsObj getProxy() {
        return this.proxy;
    }

    public String getProxy_type() {
        return this.proxy_type;
    }

    public String getPurchase_token_regex() {
        return this.purchase_token_regex;
    }

    public ArrayList<String> getR_cookie_urls() {
        return this.r_cookie_urls;
    }

    public EncryptionParamsObj getR_js() {
        return this.r_js;
    }

    public String getR_url() {
        return this.r_url;
    }

    public String getRegular() {
        return this.regular;
    }

    public String getRegular_bundle() {
        return this.regular_bundle;
    }

    public String getRelogin_url() {
        return this.relogin_url;
    }

    public EncryptionParamsObj getRemember_js() {
        return this.remember_js;
    }

    public String getSend() {
        return this.send;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrl_bundle() {
        return this.url_bundle;
    }

    public String getUse_proxy() {
        return this.use_proxy;
    }

    public boolean isIs_use_epic_api() {
        return this.is_use_epic_api;
    }

    public boolean isIs_use_new_epic_js() {
        return this.is_use_new_epic_js;
    }

    public void setBind_id(String str) {
        this.bind_id = str;
    }

    public void setCookie_version(String str) {
        this.cookie_version = str;
    }

    public void setHosts(HashMap<String, ArrayList<String>> map) {
        this.hosts = map;
    }

    public void setInject_js_on_ready(String str) {
        this.inject_js_on_ready = str;
    }

    public void setIs_owned_regex(String str) {
        this.is_owned_regex = str;
    }

    public void setIs_use_epic_api(boolean z10) {
        this.is_use_epic_api = z10;
    }

    public void setIs_use_new_epic_js(boolean z10) {
        this.is_use_new_epic_js = z10;
    }

    public void setJs(EncryptionParamsObj encryptionParamsObj) {
        this.js = encryptionParamsObj;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLogin_url(String str) {
        this.login_url = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setNoti_msg(MallOrderNotifyObj mallOrderNotifyObj) {
        this.noti_msg = mallOrderNotifyObj;
    }

    public void setProxy(EncryptionParamsObj encryptionParamsObj) {
        this.proxy = encryptionParamsObj;
    }

    public void setProxy_type(String str) {
        this.proxy_type = str;
    }

    public void setPurchase_token_regex(String str) {
        this.purchase_token_regex = str;
    }

    public void setR_js(EncryptionParamsObj encryptionParamsObj) {
        this.r_js = encryptionParamsObj;
    }

    public void setR_url(String str) {
        this.r_url = str;
    }

    public void setRegular(String str) {
        this.regular = str;
    }

    public void setRegular_bundle(String str) {
        this.regular_bundle = str;
    }

    public void setRelogin_url(String str) {
        this.relogin_url = str;
    }

    public void setRemember_js(EncryptionParamsObj encryptionParamsObj) {
        this.remember_js = encryptionParamsObj;
    }

    public void setSend(String str) {
        this.send = str;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrl_bundle(String str) {
        this.url_bundle = str;
    }

    public void setUse_proxy(String str) {
        this.use_proxy = str;
    }
}
