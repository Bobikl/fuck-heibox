package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WebCfgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2989209511908518278L;
    private boolean allow_display_keyboard;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private String f76943bg;
    private boolean disable_navi;
    private String inject_images;
    private boolean proxy;
    private String proxy_type;
    private boolean pull;
    private boolean refresh;
    private String url;

    public String getBg() {
        return this.f76943bg;
    }

    public String getInject_images() {
        return this.inject_images;
    }

    public String getProxy_type() {
        return this.proxy_type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAllow_display_keyboard() {
        return this.allow_display_keyboard;
    }

    public boolean isDisable_navi() {
        return this.disable_navi;
    }

    public boolean isProxy() {
        return this.proxy;
    }

    public boolean isPull() {
        return this.pull;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public void setAllow_display_keyboard(boolean z10) {
        this.allow_display_keyboard = z10;
    }

    public void setBg(String str) {
        this.f76943bg = str;
    }

    public void setDisable_navi(boolean z10) {
        this.disable_navi = z10;
    }

    public void setInject_images(String str) {
        this.inject_images = str;
    }

    public void setProxy(boolean z10) {
        this.proxy = z10;
    }

    public void setProxy_type(String str) {
        this.proxy_type = str;
    }

    public void setPull(boolean z10) {
        this.pull = z10;
    }

    public void setRefresh(boolean z10) {
        this.refresh = z10;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
