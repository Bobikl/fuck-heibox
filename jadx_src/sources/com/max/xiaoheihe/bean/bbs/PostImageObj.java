package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PostImageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5667530031662665027L;
    private String height;
    private String mimetype;
    private String url;
    private String width;

    public String getHeight() {
        return this.height;
    }

    public String getMimetype() {
        return this.mimetype;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWidth() {
        return this.width;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setMimetype(String str) {
        this.mimetype = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }
}
