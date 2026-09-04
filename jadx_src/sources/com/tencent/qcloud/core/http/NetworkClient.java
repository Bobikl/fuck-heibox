package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.task.RetryStrategy;
import javax.net.ssl.HostnameVerifier;
import okhttp3.o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NetworkClient {
    protected o dns;
    protected boolean enableDebugLog;
    protected HttpLogger httpLogger;
    protected RetryStrategy retryStrategy;

    public abstract NetworkProxy getNetworkProxy();

    public void init(QCloudHttpClient.Builder builder, HostnameVerifier hostnameVerifier, o oVar, HttpLogger httpLogger) {
        this.retryStrategy = builder.retryStrategy;
        this.httpLogger = httpLogger;
        this.enableDebugLog = builder.enableDebugLog;
        this.dns = oVar;
    }
}
