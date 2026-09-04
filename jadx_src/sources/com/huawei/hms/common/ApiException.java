package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes7.dex */
public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status status) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(status.getStatusCode());
        sb2.append(": ");
        sb2.append(status.getStatusMessage() != null ? status.getStatusMessage() : "");
        super(sb2.toString());
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
