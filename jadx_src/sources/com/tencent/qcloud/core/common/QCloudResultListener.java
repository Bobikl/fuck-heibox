package com.tencent.qcloud.core.common;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudResultListener<T> {
    void onFailure(QCloudClientException qCloudClientException, QCloudServiceException qCloudServiceException);

    void onSuccess(T t10);
}
