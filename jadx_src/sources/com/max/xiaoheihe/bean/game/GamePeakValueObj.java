package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePeakValueObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 438619792449486947L;
    private String peak_value;
    private String time;

    public String getPeak_value() {
        return this.peak_value;
    }

    public String getTime() {
        return this.time;
    }

    public void setPeak_value(String str) {
        this.peak_value = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
