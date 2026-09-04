package com.max.hbwallet.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes2.dex */
public class PriceItemObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("default")
    private String checked;
    private String custom_type;
    private String desc;
    private String price;
    private String title;
    private String url;

    public String getChecked() {
        return this.checked;
    }

    public String getCustom_type() {
        return this.custom_type;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setChecked(String str) {
        this.checked = str;
    }

    public void setCustom_type(String str) {
        this.custom_type = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
