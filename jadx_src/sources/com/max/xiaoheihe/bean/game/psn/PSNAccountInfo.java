package com.max.xiaoheihe.bean.game.psn;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.tencent.open.SocialConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PSNAccountInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1658485132905481229L;
    private String avatar;
    private String bg_img;

    @SerializedName(alternate = {SocialConstants.PARAM_APP_DESC}, value = "description")
    @JSONField(alternateNames = {SocialConstants.PARAM_APP_DESC}, name = "description")
    private String description;
    private String is_open;
    private String key1;
    private String key2;
    private String key3;
    private String key4;
    private String level;
    private String name;
    private String protocol;
    private String value1;
    private String value2;
    private String value3;
    private String value4;

    public String getAvatar() {
        return this.avatar;
    }

    public String getBg_img() {
        return this.bg_img;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIs_open() {
        return this.is_open;
    }

    public String getKey1() {
        return this.key1;
    }

    public String getKey2() {
        return this.key2;
    }

    public String getKey3() {
        return this.key3;
    }

    public String getKey4() {
        return this.key4;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getValue1() {
        return this.value1;
    }

    public String getValue2() {
        return this.value2;
    }

    public String getValue3() {
        return this.value3;
    }

    public String getValue4() {
        return this.value4;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIs_open(String str) {
        this.is_open = str;
    }

    public void setKey1(String str) {
        this.key1 = str;
    }

    public void setKey2(String str) {
        this.key2 = str;
    }

    public void setKey3(String str) {
        this.key3 = str;
    }

    public void setKey4(String str) {
        this.key4 = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setValue1(String str) {
        this.value1 = str;
    }

    public void setValue2(String str) {
        this.value2 = str;
    }

    public void setValue3(String str) {
        this.value3 = str;
    }

    public void setValue4(String str) {
        this.value4 = str;
    }
}
