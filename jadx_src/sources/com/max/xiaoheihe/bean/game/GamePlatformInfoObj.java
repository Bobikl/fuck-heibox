package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePlatformInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4680988065243890700L;
    private String appid;
    private String img_url;
    private String key;
    private String name;
    private String platf;
    private GamePriceObj price;
    private String value;

    public String getAppid() {
        return this.appid;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getPlatf() {
        return this.platf;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public String getValue() {
        return this.value;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlatf(String str) {
        this.platf = str;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
