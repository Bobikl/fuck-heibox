package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseHeader implements IMessageEntity {

    @Packed
    protected int statusCode;

    public ResponseHeader() {
    }

    public ResponseHeader(int i10) {
        this.statusCode = i10;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
