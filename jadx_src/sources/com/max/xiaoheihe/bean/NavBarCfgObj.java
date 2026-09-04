package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NavBarCfgObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1906430522306150899L;
    private IconCfgObj right_icon;
    private String title;

    public IconCfgObj getRight_icon() {
        return this.right_icon;
    }

    public String getTitle() {
        return this.title;
    }

    public void setRight_icon(IconCfgObj iconCfgObj) {
        this.right_icon = iconCfgObj;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
