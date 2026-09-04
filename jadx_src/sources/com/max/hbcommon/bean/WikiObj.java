package com.max.hbcommon.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class WikiObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7767661979315014300L;
    private String appicon;
    private String enable;
    private String name;
    private String wiki_id;

    public String getAppicon() {
        return this.appicon;
    }

    public String getEnable() {
        return this.enable;
    }

    public String getName() {
        return this.name;
    }

    public String getWiki_id() {
        return this.wiki_id;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWiki_id(String str) {
        this.wiki_id = str;
    }
}
