package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.QCloudHttpRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudSigner {
    void sign(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials) throws QCloudClientException;
}
