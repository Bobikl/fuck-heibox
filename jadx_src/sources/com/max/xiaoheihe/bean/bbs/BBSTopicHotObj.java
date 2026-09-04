package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicHotObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5132100080685741064L;
    private String desc;
    private String level;

    public String getDesc() {
        return this.desc;
    }

    public String getLevel() {
        return this.level;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }
}
