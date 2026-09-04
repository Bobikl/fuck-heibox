package com.alipay.face.config;

/* JADX INFO: loaded from: classes6.dex */
public class NavigatePage {
    public static final String DEFAULT_URL = "https://render.alipay.com/p/f/fd-j8l9yjja/index.html";
    private boolean enable = false;
    private String url = DEFAULT_URL;

    public String getUrl() {
        return this.url;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z10) {
        this.enable = z10;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "NavigatePage{enable=" + this.enable + ", url='" + this.url + "'}";
    }
}
