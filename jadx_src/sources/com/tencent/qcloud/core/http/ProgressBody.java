package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudProgressListener;

/* JADX INFO: loaded from: classes4.dex */
public interface ProgressBody {
    long getBytesTransferred();

    void setProgressListener(QCloudProgressListener qCloudProgressListener);
}
