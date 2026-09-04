package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSWebShareObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5461880511231198172L;
    private String desc;
    private String firstImg;

    public String getDesc() {
        return this.desc;
    }

    public String getFirstImg() {
        return this.firstImg;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setFirstImg(String str) {
        this.firstImg = str;
    }
}
