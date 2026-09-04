package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class GameBindJsObj implements Serializable {
    public static final String KEY_BIND_CSGO = "bind_csgo";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5693684786596433304L;
    private SteamAcceptGameParams bind_csgo;
    private ArrayList<SteamAcceptGameParams> injectJS;
    private String msg;
    private EncryptionParamsObj proxy;
    private SteamAcceptGameParams remember_js;
    private String switch_bind_nonacc;
    private String url;

    public SteamAcceptGameParams getBind_csgo() {
        return this.bind_csgo;
    }

    public ArrayList<SteamAcceptGameParams> getInjectJS() {
        return this.injectJS;
    }

    public String getMsg() {
        return this.msg;
    }

    public EncryptionParamsObj getProxy() {
        return this.proxy;
    }

    public SteamAcceptGameParams getRemember_js() {
        return this.remember_js;
    }

    public String getSwitch_bind_nonacc() {
        return this.switch_bind_nonacc;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBind_csgo(SteamAcceptGameParams steamAcceptGameParams) {
        this.bind_csgo = steamAcceptGameParams;
    }

    public void setInjectJS(ArrayList<SteamAcceptGameParams> arrayList) {
        this.injectJS = arrayList;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setProxy(EncryptionParamsObj encryptionParamsObj) {
        this.proxy = encryptionParamsObj;
    }

    public void setRemember_js(SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_js = steamAcceptGameParams;
    }

    public void setSwitch_bind_nonacc(String str) {
        this.switch_bind_nonacc = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
