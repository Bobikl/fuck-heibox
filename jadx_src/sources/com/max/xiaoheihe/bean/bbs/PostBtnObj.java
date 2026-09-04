package com.max.xiaoheihe.bean.bbs;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PostBtnObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5997417561596066642L;
    private String img;

    @SerializedName(alternate = {"text_place_holder"}, value = "prompt")
    @JSONField(alternateNames = {"text_place_holder"}, name = "prompt")
    private String prompt;
    private String protocol;

    @SerializedName(alternate = {"page_title"}, value = "text")
    @JSONField(alternateNames = {"page_title"}, name = "text")
    private String text;
    private String title_place_holder;

    public String getImg() {
        return this.img;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle_place_holder() {
        return this.title_place_holder;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setPrompt(String str) {
        this.prompt = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle_place_holder(String str) {
        this.title_place_holder = str;
    }
}
