package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class MallGamePlatformObj {
    public static final String PLATFORM_STEAM = "steam";
    public static final String PLATFORM_SWITCH = "switch";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String game_type;
    private String icon_url;
    private String img_url;
    private String key;
    private String mall_img;
    private String name;

    public String getGame_type() {
        return this.game_type;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getKey() {
        return this.key;
    }

    public String getMall_img() {
        return this.mall_img;
    }

    public String getName() {
        return this.name;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setIcon_url(String str) {
        this.icon_url = str;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMall_img(String str) {
        this.mall_img = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
