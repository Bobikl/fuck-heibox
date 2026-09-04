package com.max.xiaoheihe.bean.game.steamproxy;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseProxyParamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class BaseProxyParamObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccProxyObj acc_proxy;

    @e
    private ArrayList<SteamAcceptGameParams> injectJS;

    @e
    private String msg;

    @e
    private ProxyManage proxy_manage;

    @e
    private KeyDescObj r_proxy;

    @e
    private String r_url;

    @e
    private SteamHttpProxyObj steam_proxy;

    @e
    private String switch_bind_nonacc;

    @e
    private String url;

    public BaseProxyParamObj() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public BaseProxyParamObj(@e KeyDescObj keyDescObj, @e String str, @e String str2, @e AccProxyObj accProxyObj, @e SteamHttpProxyObj steamHttpProxyObj, @e String str3, @e ArrayList<SteamAcceptGameParams> arrayList, @e String str4, @e ProxyManage proxyManage) {
        this.r_proxy = keyDescObj;
        this.url = str;
        this.r_url = str2;
        this.acc_proxy = accProxyObj;
        this.steam_proxy = steamHttpProxyObj;
        this.switch_bind_nonacc = str3;
        this.injectJS = arrayList;
        this.msg = str4;
        this.proxy_manage = proxyManage;
    }

    public /* synthetic */ BaseProxyParamObj(KeyDescObj keyDescObj, String str, String str2, AccProxyObj accProxyObj, SteamHttpProxyObj steamHttpProxyObj, String str3, ArrayList arrayList, String str4, ProxyManage proxyManage, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : keyDescObj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : accProxyObj, (i10 & 16) != 0 ? null : steamHttpProxyObj, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : arrayList, (i10 & 128) != 0 ? null : str4, (i10 & 256) == 0 ? proxyManage : null);
    }

    @e
    public final AccProxyObj getAcc_proxy() {
        return this.acc_proxy;
    }

    @e
    public final ArrayList<SteamAcceptGameParams> getInjectJS() {
        return this.injectJS;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final ProxyManage getProxy_manage() {
        return this.proxy_manage;
    }

    @e
    public final KeyDescObj getR_proxy() {
        return this.r_proxy;
    }

    @e
    public final String getR_url() {
        return this.r_url;
    }

    @e
    public final SteamHttpProxyObj getSteam_proxy() {
        return this.steam_proxy;
    }

    @e
    public final String getSwitch_bind_nonacc() {
        return this.switch_bind_nonacc;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public final void setAcc_proxy(@e AccProxyObj accProxyObj) {
        this.acc_proxy = accProxyObj;
    }

    public final void setInjectJS(@e ArrayList<SteamAcceptGameParams> arrayList) {
        this.injectJS = arrayList;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setProxy_manage(@e ProxyManage proxyManage) {
        this.proxy_manage = proxyManage;
    }

    public final void setR_proxy(@e KeyDescObj keyDescObj) {
        this.r_proxy = keyDescObj;
    }

    public final void setR_url(@e String str) {
        this.r_url = str;
    }

    public final void setSteam_proxy(@e SteamHttpProxyObj steamHttpProxyObj) {
        this.steam_proxy = steamHttpProxyObj;
    }

    public final void setSwitch_bind_nonacc(@e String str) {
        this.switch_bind_nonacc = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }
}
