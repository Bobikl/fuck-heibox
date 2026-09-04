package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSSourceInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3332680091727509802L;
    private String desc;
    private String source;

    public String getDesc() {
        return this.desc;
    }

    public String getSource() {
        return this.source;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setSource(String str) {
        this.source = str;
    }
}
