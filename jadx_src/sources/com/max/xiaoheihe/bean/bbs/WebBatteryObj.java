package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WebBatteryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int battery;

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int i10) {
        this.battery = i10;
    }
}
