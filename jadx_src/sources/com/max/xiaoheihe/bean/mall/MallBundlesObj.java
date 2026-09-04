package com.max.xiaoheihe.bean.mall;

import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallBundlesObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appid;
    private String coin;
    private String game_img;
    private String game_name;
    private String game_type;
    private String order_status_desc;
    private String package_id;
    private String package_name;
    private MallGamePlatformObj platform;
    private MallPriceObj price;
    private String session;
    private List<MallSkuObj> skus;
    private SteamIdInfoObj steam_info;

    public String getAppid() {
        return this.appid;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getOrder_status_desc() {
        return this.order_status_desc;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public MallGamePlatformObj getPlatform() {
        return this.platform;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public String getSession() {
        return this.session;
    }

    public List<MallSkuObj> getSkus() {
        return this.skus;
    }

    public SteamIdInfoObj getSteam_info() {
        return this.steam_info;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setOrder_status_desc(String str) {
        this.order_status_desc = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setPackage_name(String str) {
        this.package_name = str;
    }

    public void setPlatform(MallGamePlatformObj mallGamePlatformObj) {
        this.platform = mallGamePlatformObj;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSkus(List<MallSkuObj> list) {
        this.skus = list;
    }

    public void setSteam_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_info = steamIdInfoObj;
    }
}
