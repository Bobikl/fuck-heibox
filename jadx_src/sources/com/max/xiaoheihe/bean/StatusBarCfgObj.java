package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class StatusBarCfgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1601879555947172673L;
    private String style;

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String str) {
        this.style = str;
    }
}
