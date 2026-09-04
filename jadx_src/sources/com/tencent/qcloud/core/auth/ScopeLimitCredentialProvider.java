package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;

/* JADX INFO: loaded from: classes4.dex */
public interface ScopeLimitCredentialProvider extends QCloudCredentialProvider {
    SessionQCloudCredentials getCredentials(STSCredentialScope[] sTSCredentialScopeArr) throws QCloudClientException;
}
