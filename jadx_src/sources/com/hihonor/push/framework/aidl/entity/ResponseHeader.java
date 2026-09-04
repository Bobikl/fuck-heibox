package com.hihonor.push.framework.aidl.entity;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseHeader implements IMessageEntity {

    @Packed
    public int statusCode;

    @Packed
    public String statusMessage;

    public ResponseHeader() {
        this.statusCode = -1;
    }

    public ResponseHeader(int i10, String str) {
        this.statusCode = i10;
        this.statusMessage = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusCode(int i10) {
        this.statusCode = i10;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }
}
