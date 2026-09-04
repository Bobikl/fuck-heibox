package com.max.xiaoheihe.bean;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ShareInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4062620328078440572L;
    private JsonObject extra_data;
    private String share_btn_text;
    private String share_desc;
    private String share_img;
    private String share_title;
    private String share_url;
    private ShareWindowObj share_window;

    public ShareInfoObj(String str, String str2, String str3, String str4) {
        this.share_desc = str2;
        this.share_img = str4;
        this.share_title = str;
        this.share_url = str3;
    }

    public JsonObject getExtra_data() {
        return this.extra_data;
    }

    public String getShare_btn_text() {
        return this.share_btn_text;
    }

    public String getShare_desc() {
        return this.share_desc;
    }

    public String getShare_img() {
        return this.share_img;
    }

    public String getShare_title() {
        return this.share_title;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public ShareWindowObj getShare_window() {
        return this.share_window;
    }

    public void setExtra_data(JsonObject jsonObject) {
        this.extra_data = jsonObject;
    }

    public void setShare_btn_text(String str) {
        this.share_btn_text = str;
    }

    public void setShare_desc(String str) {
        this.share_desc = str;
    }

    public void setShare_img(String str) {
        this.share_img = str;
    }

    public void setShare_title(String str) {
        this.share_title = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setShare_window(ShareWindowObj shareWindowObj) {
        this.share_window = shareWindowObj;
    }
}
