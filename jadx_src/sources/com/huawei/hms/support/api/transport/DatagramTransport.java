package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;

/* JADX INFO: loaded from: classes7.dex */
public interface DatagramTransport {

    public interface a {
        void a(int i10, IMessageEntity iMessageEntity);
    }

    void post(ApiClient apiClient, a aVar);

    void send(ApiClient apiClient, a aVar);
}
