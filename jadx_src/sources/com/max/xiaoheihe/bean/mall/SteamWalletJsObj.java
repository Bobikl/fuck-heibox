package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.GameBindJsObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.proxy.ProxyParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SteamWalletJsObj extends ProxyParamsObj implements Serializable {
    public static final String KEY_ADD_FREE_LICENSE = "addfreelicense";
    public static final String KEY_ADD_FREE_LICENSE_EPIC = "addfreelicense_epic";
    public static final String KEY_BALANCE = "balance";
    public static final String KEY_LOAD_COOKIE = "loadcookie";
    public static final String KEY_NSWITCH_OAUTH = "ns_oauth";
    public static final String KEY_PAY = "pay";
    public static final String KEY_REDEEM_WALLET = "redeemwallet";
    public static final String KEY_STEAM_BALANCE = "steam_balance";
    public static final String KEY_STEAM_GAME_DLC = "steam_game";
    public static final String KEY_STEAM_PURCHASE = "steam_purchase";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5827971641153601025L;
    private SteamAcceptGameParams addfreelicense;
    private SteamAcceptGameParams addfreelicense_epic;
    private SteamAcceptGameParams addwishlist_steam;
    private SteamAcceptGameParams balance;
    private SteamAcceptGameParams checkLogin;
    private SteamAcceptGameParams fast_balance;
    private SteamAcceptGameParams license_count_js;
    private SteamAcceptGameParams loadcookie;
    private SteamAcceptGameParams order_finish;
    private SteamAcceptGameParams pay;
    private KeyDescObj r_proxy;
    private SteamAcceptGameParams redeemwallet;
    private SteamAcceptGameParams remember_js;
    private GameBindJsObj request;
    private SteamAcceptGameParams submit_order_js;
    private boolean isGameDlc = false;
    private boolean isCheckAccount = false;
    private boolean isSteamBalance = false;

    public SteamAcceptGameParams getAddfreelicense() {
        return this.addfreelicense;
    }

    public SteamAcceptGameParams getAddfreelicense_epic() {
        return this.addfreelicense_epic;
    }

    public SteamAcceptGameParams getAddwishlist_steam() {
        return this.addwishlist_steam;
    }

    public SteamAcceptGameParams getBalance() {
        return this.balance;
    }

    public SteamAcceptGameParams getCheckLogin() {
        return this.checkLogin;
    }

    public SteamAcceptGameParams getFast_balance() {
        return this.fast_balance;
    }

    public SteamAcceptGameParams getLicense_count_js() {
        return this.license_count_js;
    }

    public SteamAcceptGameParams getLoadcookie() {
        return this.loadcookie;
    }

    public SteamAcceptGameParams getOrder_finish() {
        return this.order_finish;
    }

    public SteamAcceptGameParams getPay() {
        return this.pay;
    }

    public KeyDescObj getR_proxy() {
        return this.r_proxy;
    }

    public SteamAcceptGameParams getRedeemwallet() {
        return this.redeemwallet;
    }

    public SteamAcceptGameParams getRemember_js() {
        return this.remember_js;
    }

    public GameBindJsObj getRequest() {
        return this.request;
    }

    public SteamAcceptGameParams getSubmit_order_js() {
        return this.submit_order_js;
    }

    public boolean isCheckAccount() {
        return this.isCheckAccount;
    }

    public boolean isGameDlc() {
        return this.isGameDlc;
    }

    public boolean isSteamBalance() {
        return this.isSteamBalance;
    }

    public void setAddfreelicense(SteamAcceptGameParams steamAcceptGameParams) {
        this.addfreelicense = steamAcceptGameParams;
    }

    public void setAddfreelicense_epic(SteamAcceptGameParams steamAcceptGameParams) {
        this.addfreelicense_epic = steamAcceptGameParams;
    }

    public void setAddwishlist_steam(SteamAcceptGameParams steamAcceptGameParams) {
        this.addwishlist_steam = steamAcceptGameParams;
    }

    public void setBalance(SteamAcceptGameParams steamAcceptGameParams) {
        this.balance = steamAcceptGameParams;
    }

    public void setCheckAccount(boolean z10) {
        this.isCheckAccount = z10;
    }

    public void setCheckLogin(SteamAcceptGameParams steamAcceptGameParams) {
        this.checkLogin = steamAcceptGameParams;
    }

    public void setFast_balance(SteamAcceptGameParams steamAcceptGameParams) {
        this.fast_balance = steamAcceptGameParams;
    }

    public void setGameDlc(boolean z10) {
        this.isGameDlc = z10;
    }

    public void setLicense_count_js(SteamAcceptGameParams steamAcceptGameParams) {
        this.license_count_js = steamAcceptGameParams;
    }

    public void setLoadcookie(SteamAcceptGameParams steamAcceptGameParams) {
        this.loadcookie = steamAcceptGameParams;
    }

    public void setOrder_finish(SteamAcceptGameParams steamAcceptGameParams) {
        this.order_finish = steamAcceptGameParams;
    }

    public void setPay(SteamAcceptGameParams steamAcceptGameParams) {
        this.pay = steamAcceptGameParams;
    }

    public void setR_proxy(KeyDescObj keyDescObj) {
        this.r_proxy = keyDescObj;
    }

    public void setRedeemwallet(SteamAcceptGameParams steamAcceptGameParams) {
        this.redeemwallet = steamAcceptGameParams;
    }

    public void setRemember_js(SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_js = steamAcceptGameParams;
    }

    public void setRequest(GameBindJsObj gameBindJsObj) {
        this.request = gameBindJsObj;
    }

    public void setSteamBalance(boolean z10) {
        this.isSteamBalance = z10;
    }

    public void setSubmit_order_js(SteamAcceptGameParams steamAcceptGameParams) {
        this.submit_order_js = steamAcceptGameParams;
    }
}
