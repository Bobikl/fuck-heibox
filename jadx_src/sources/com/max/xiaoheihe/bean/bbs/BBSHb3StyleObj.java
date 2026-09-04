package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSHb3StyleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5401223544372553461L;
    private String color;
    private String corner_img;

    public String getColor() {
        return this.color;
    }

    public String getCorner_img() {
        return this.corner_img;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setCorner_img(String str) {
        this.corner_img = str;
    }
}
