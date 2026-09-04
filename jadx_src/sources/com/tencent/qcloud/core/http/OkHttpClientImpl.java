package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.http.interceptor.HttpMetricsInterceptor;
import com.tencent.qcloud.core.http.interceptor.RetryInterceptor;
import com.tencent.qcloud.core.http.interceptor.TrafficControlInterceptor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import okhttp3.e;
import okhttp3.o;
import okhttp3.p;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpClientImpl extends NetworkClient {
    private p.c mEventListenerFactory = new p.c() { // from class: com.tencent.qcloud.core.http.OkHttpClientImpl.1
        @Override // okhttp3.p.c
        public p create(e eVar) {
            return new CallMetricsListener(eVar);
        }
    };
    private z okHttpClient;

    @Override // com.tencent.qcloud.core.http.NetworkClient
    public NetworkProxy getNetworkProxy() {
        return new OkHttpProxy(this.okHttpClient);
    }

    @Override // com.tencent.qcloud.core.http.NetworkClient
    public void init(QCloudHttpClient.Builder builder, HostnameVerifier hostnameVerifier, o oVar, HttpLogger httpLogger) {
        super.init(builder, hostnameVerifier, oVar, httpLogger);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(httpLogger);
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        z.a aVarQ = builder.mBuilder.t(true).u(true).Z(hostnameVerifier).q(oVar);
        long j10 = builder.connectionTimeout;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.okHttpClient = aVarQ.k(j10, timeUnit).j0(builder.socketTimeout, timeUnit).R0(builder.socketTimeout, timeUnit).s(this.mEventListenerFactory).d(new HttpMetricsInterceptor()).c(httpLoggingInterceptor).c(new RetryInterceptor(builder.retryStrategy)).c(new TrafficControlInterceptor()).f();
    }
}
