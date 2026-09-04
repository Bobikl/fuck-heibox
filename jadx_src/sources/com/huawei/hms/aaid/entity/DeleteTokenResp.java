package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class DeleteTokenResp implements IMessageEntity {

    @Packed
    private int retCode = 0;

    public int getRetCode() {
        return this.retCode;
    }

    public void setRetCode(int i10) {
        this.retCode = i10;
    }
}
