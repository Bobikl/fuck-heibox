package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class RectObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 974627840238647197L;
    private String height;
    private String left;
    private String top;
    private String width;

    public String getHeight() {
        return this.height;
    }

    public String getLeft() {
        return this.left;
    }

    public String getTop() {
        return this.top;
    }

    public String getWidth() {
        return this.width;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setLeft(String str) {
        this.left = str;
    }

    public void setTop(String str) {
        this.top = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }
}
