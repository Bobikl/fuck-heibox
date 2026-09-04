package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.QCloudHttpRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudSelfSigner {
    void sign(QCloudHttpRequest qCloudHttpRequest) throws QCloudClientException;
}
