package com.huawei.hms.support.api.entity.opendevice;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class OdidResp extends AbstractMessageEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Packed
    private String f62669id;

    public String getId() {
        return this.f62669id;
    }

    public void setId(String str) {
        this.f62669id = str;
    }
}
