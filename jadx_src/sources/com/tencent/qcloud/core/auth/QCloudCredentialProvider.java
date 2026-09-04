package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudCredentialProvider {
    QCloudCredentials getCredentials() throws QCloudClientException;

    void refresh() throws QCloudClientException;
}
