package com.tencent.qcloud.core.auth;

/* JADX INFO: loaded from: classes4.dex */
public interface QCloudLifecycleCredentials extends QCloudCredentials {
    String getKeyTime();

    String getSignKey();

    boolean isValid();
}
