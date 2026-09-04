package com.max.xiaoheihe.bean.account.steaminfo;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DialogMsgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -973466875762783177L;
    private String button;
    private String desc;
    private String title;

    public String getButton() {
        return this.button;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButton(String str) {
        this.button = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
