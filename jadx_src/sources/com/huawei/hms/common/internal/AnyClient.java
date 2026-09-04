package com.huawei.hms.common.internal;

import com.huawei.hms.core.aidl.IMessageEntity;

/* JADX INFO: loaded from: classes7.dex */
public interface AnyClient {

    public interface CallBack {
        void onCallback(IMessageEntity iMessageEntity, String str);
    }

    void connect(int i10);

    void connect(int i10, boolean z10);

    void disconnect();

    int getRequestHmsVersionCode();

    String getSessionId();

    boolean isConnected();

    boolean isConnecting();

    void post(IMessageEntity iMessageEntity, String str, CallBack callBack);
}
