package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LocalHtmlObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5469268954610108630L;
    private String local_html;
    private String local_html_version;

    public String getLocal_html() {
        return this.local_html;
    }

    public String getLocal_html_version() {
        return this.local_html_version;
    }

    public void setLocal_html(String str) {
        this.local_html = str;
    }

    public void setLocal_html_version(String str) {
        this.local_html_version = str;
    }
}
