package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class IconCfgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6213828472366419045L;
    private boolean enabled;
    private String file;
    private WebProtocolObj protocol;
    private String title;

    public String getFile() {
        return this.file;
    }

    public WebProtocolObj getProtocol() {
        return this.protocol;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setProtocol(WebProtocolObj webProtocolObj) {
        this.protocol = webProtocolObj;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
