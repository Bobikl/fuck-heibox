package com.max.xiaoheihe.bean.account.steaminfo;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BindSteamUrlResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1907757110463930179L;
    private AccProxyObj acc_proxy;
    private String bind_url;
    private EncryptionParamsObj encrypted_proxy_info;
    private HashMap<String, String> host;
    private ArrayList<TagJsObj> js_list;
    private String r_bind_url;
    private KeyDescObj r_proxy;
    private String r_unbind_url;
    private SteamAcceptGameParams steam_proxy;
    private MallOrderNotifyObj sys_msg_bind;
    private MallOrderNotifyObj sys_msg_unbind;
    private String unbind_url;
    private String use_http;

    public AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    public String getBind_url() {
        return this.bind_url;
    }

    public EncryptionParamsObj getEncrypted_proxy_info() {
        return this.encrypted_proxy_info;
    }

    public HashMap<String, String> getHost() {
        return this.host;
    }

    public ArrayList<TagJsObj> getJs_list() {
        return this.js_list;
    }

    public String getR_bind_url() {
        return this.r_bind_url;
    }

    public KeyDescObj getR_proxy() {
        return this.r_proxy;
    }

    public String getR_unbind_url() {
        return this.r_unbind_url;
    }

    public SteamAcceptGameParams getSteam_proxy() {
        return this.steam_proxy;
    }

    public MallOrderNotifyObj getSys_msg_bind() {
        return this.sys_msg_bind;
    }

    public MallOrderNotifyObj getSys_msg_unbind() {
        return this.sys_msg_unbind;
    }

    public String getUnbind_url() {
        return this.unbind_url;
    }

    public String getUse_http() {
        return this.use_http;
    }

    public void setAcc_proxy(AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public void setBind_url(String str) {
        this.bind_url = str;
    }

    public void setEncrypted_proxy_info(EncryptionParamsObj encryptionParamsObj) {
        this.encrypted_proxy_info = encryptionParamsObj;
    }

    public void setHost(HashMap<String, String> map) {
        this.host = map;
    }

    public void setJs_list(ArrayList<TagJsObj> arrayList) {
        this.js_list = arrayList;
    }

    public void setR_bind_url(String str) {
        this.r_bind_url = str;
    }

    public void setR_proxy(KeyDescObj keyDescObj) {
        this.r_proxy = keyDescObj;
    }

    public void setR_unbind_url(String str) {
        this.r_unbind_url = str;
    }

    public void setSteam_proxy(SteamAcceptGameParams steamAcceptGameParams) {
        this.steam_proxy = steamAcceptGameParams;
    }

    public void setSys_msg_bind(MallOrderNotifyObj mallOrderNotifyObj) {
        this.sys_msg_bind = mallOrderNotifyObj;
    }

    public void setSys_msg_unbind(MallOrderNotifyObj mallOrderNotifyObj) {
        this.sys_msg_unbind = mallOrderNotifyObj;
    }

    public void setUnbind_url(String str) {
        this.unbind_url = str;
    }

    public void setUse_http(String str) {
        this.use_http = str;
    }
}
