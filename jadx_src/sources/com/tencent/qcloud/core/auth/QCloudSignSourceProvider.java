package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudSignSourceProvider {
    <T> void onSignRequestSuccess(HttpRequest<T> httpRequest, QCloudCredentials qCloudCredentials, String str) throws QCloudClientException;

    <T> String source(HttpRequest<T> httpRequest) throws QCloudClientException;
}
