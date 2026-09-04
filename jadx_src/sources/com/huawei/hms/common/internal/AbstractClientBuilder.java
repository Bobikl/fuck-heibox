package com.huawei.hms.common.internal;

import android.content.Context;
import com.huawei.hms.common.internal.AnyClient;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractClientBuilder<TClient extends AnyClient, TOption> {
    public abstract TClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks);
}
