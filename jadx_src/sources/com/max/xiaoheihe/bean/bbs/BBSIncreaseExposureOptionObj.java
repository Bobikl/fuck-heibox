package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSIncreaseExposureOptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2471108043573467825L;
    private String battery;
    private String text;

    public String getBattery() {
        return this.battery;
    }

    public String getText() {
        return this.text;
    }

    public void setBattery(String str) {
        this.battery = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
