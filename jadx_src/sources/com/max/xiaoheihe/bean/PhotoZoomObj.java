package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoZoomObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2709004332206629795L;
    private String height;
    private String width;

    public String getHeight() {
        return this.height;
    }

    public String getWidth() {
        return this.width;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }
}
