package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class EnableNotifyReq implements IMessageEntity {

    @Packed
    private boolean enable;

    @Packed
    private String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z10) {
        this.enable = z10;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        return "EnableNotifyReq{packageName='" + this.packageName + "', enable=" + this.enable + '}';
    }
}
