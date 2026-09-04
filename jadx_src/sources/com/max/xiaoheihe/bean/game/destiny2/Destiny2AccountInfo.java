package com.max.xiaoheihe.bean.game.destiny2;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.tencent.open.SocialConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Destiny2AccountInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7978498542363719278L;
    private String avatar;

    @SerializedName(alternate = {SocialConstants.PARAM_IMG_URL}, value = "image")
    private String image;
    private String key1;
    private String key2;
    private String key3;
    private String key4;
    private String name;
    private String player_id;
    private String value1;
    private String value2;
    private String value3;
    private String value4;

    public String getAvatar() {
        return this.avatar;
    }

    public String getImage() {
        return this.image;
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

    public String getName() {
        return this.name;
    }

    public String getPlayer_id() {
        return this.player_id;
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

    public void setImage(String str) {
        this.image = str;
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

    public void setName(String str) {
        this.name = str;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
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
