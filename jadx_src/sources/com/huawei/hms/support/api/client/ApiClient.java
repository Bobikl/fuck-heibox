package com.huawei.hms.support.api.client;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface ApiClient {
    String getAppID();

    Context getContext();

    String getCpID();

    String getPackageName();

    String getSessionId();

    SubAppInfo getSubAppInfo();

    String getTransportName();

    boolean isConnected();
}
