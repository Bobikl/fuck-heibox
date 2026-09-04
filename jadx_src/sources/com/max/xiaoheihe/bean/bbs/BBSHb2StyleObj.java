package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSHb2StyleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1008947448474836198L;
    private String bg_color;
    private String bg_pic;

    public String getBg_color() {
        return this.bg_color;
    }

    public String getBg_pic() {
        return this.bg_pic;
    }

    public void setBg_color(String str) {
        this.bg_color = str;
    }

    public void setBg_pic(String str) {
        this.bg_pic = str;
    }
}
