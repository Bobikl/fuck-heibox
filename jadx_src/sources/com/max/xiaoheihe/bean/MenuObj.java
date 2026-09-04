package com.max.xiaoheihe.bean;

import com.max.xiaoheihe.bean.game.GameCenterBubbleObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MenuObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4386771113469730334L;
    private String animator_image;
    private String animator_timestamp;
    private GameCenterBubbleObj bubble;
    private String content_url;
    private String desc;
    private String enable;
    private String image_url;
    private String key;
    private String lottie_key;
    private String prot;
    private boolean show_flash_animation;
    private String tips_count;
    private String tips_time;
    private String type;

    public String getAnimator_image() {
        return this.animator_image;
    }

    public String getAnimator_timestamp() {
        return this.animator_timestamp;
    }

    public String getContent_url() {
        return this.content_url;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnable() {
        return this.enable;
    }

    public GameCenterBubbleObj getGameCenterBubbleObj() {
        return this.bubble;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getKey() {
        return this.key;
    }

    public String getLottie_key() {
        return this.lottie_key;
    }

    public String getProt() {
        return this.prot;
    }

    public String getTips_count() {
        return this.tips_count;
    }

    public String getTips_time() {
        return this.tips_time;
    }

    public String getType() {
        return this.type;
    }

    public boolean isShow_flash_animation() {
        return this.show_flash_animation;
    }

    public void setAnimator_image(String str) {
        this.animator_image = str;
    }

    public void setAnimator_timestamp(String str) {
        this.animator_timestamp = str;
    }

    public void setContent_url(String str) {
        this.content_url = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void setGameCenterBubbleObj(GameCenterBubbleObj gameCenterBubbleObj) {
        this.bubble = gameCenterBubbleObj;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLottie_key(String str) {
        this.lottie_key = str;
    }

    public void setProt(String str) {
        this.prot = str;
    }

    public void setShow_flash_animation(boolean z10) {
        this.show_flash_animation = z10;
    }

    public void setTips_count(String str) {
        this.tips_count = str;
    }

    public void setTips_time(String str) {
        this.tips_time = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
