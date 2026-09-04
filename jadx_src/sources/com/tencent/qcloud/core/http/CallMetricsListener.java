package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.logger.QCloudLogger;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.p;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class CallMetricsListener extends p {
    private long connectStartTime;
    private long connectTookTime;
    private long dnsLookupTookTime;
    private long dnsStartTime;
    private List<InetAddress> inetAddressList;
    private long readResponseBodyStartTime;
    private long readResponseBodyTookTime;
    private long readResponseHeaderStartTime;
    private long readResponseHeaderTookTime;
    private long requestBodyByteCount;
    private long responseBodyByteCount;
    private long secureConnectStartTime;
    private long secureConnectTookTime;
    private long writeRequestBodyStartTime;
    private long writeRequestBodyTookTime;
    private long writeRequestHeaderStartTime;
    private long writeRequestHeaderTookTime;

    public CallMetricsListener(e eVar) {
    }

    @Override // okhttp3.p
    public void connectEnd(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(eVar, inetSocketAddress, proxy, protocol);
        this.connectTookTime += System.nanoTime() - this.connectStartTime;
    }

    @Override // okhttp3.p
    public void connectFailed(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, protocol, iOException);
        this.connectTookTime += System.nanoTime() - this.connectStartTime;
    }

    @Override // okhttp3.p
    public void connectStart(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        this.connectStartTime = System.nanoTime();
    }

    @Override // okhttp3.p
    public void dnsEnd(e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        StringBuffer stringBuffer = new StringBuffer("{");
        if (list != null) {
            Iterator<InetAddress> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().getHostAddress());
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        stringBuffer.append(g.f141884d);
        QCloudLogger.i(QCloudHttpClient.HTTP_LOG_TAG, "dns: " + str + ":" + stringBuffer.toString(), new Object[0]);
        this.dnsLookupTookTime = this.dnsLookupTookTime + (System.nanoTime() - this.dnsStartTime);
        this.inetAddressList = list;
    }

    @Override // okhttp3.p
    public void dnsStart(e eVar, String str) {
        super.dnsStart(eVar, str);
        this.dnsStartTime = System.nanoTime();
    }

    public List<InetAddress> dumpDns() {
        return this.inetAddressList;
    }

    public void dumpMetrics(HttpTaskMetrics httpTaskMetrics) {
        httpTaskMetrics.remoteAddress = this.inetAddressList;
        httpTaskMetrics.dnsLookupTookTime += this.dnsLookupTookTime;
        httpTaskMetrics.connectTookTime += this.connectTookTime;
        httpTaskMetrics.secureConnectTookTime += this.secureConnectTookTime;
        httpTaskMetrics.writeRequestHeaderTookTime += this.writeRequestHeaderTookTime;
        httpTaskMetrics.writeRequestBodyTookTime += this.writeRequestBodyTookTime;
        httpTaskMetrics.readResponseHeaderTookTime += this.readResponseHeaderTookTime;
        httpTaskMetrics.readResponseBodyTookTime += this.readResponseBodyTookTime;
        httpTaskMetrics.requestBodyByteCount = this.requestBodyByteCount;
        httpTaskMetrics.responseBodyByteCount = this.responseBodyByteCount;
    }

    @Override // okhttp3.p
    public void requestBodyEnd(e eVar, long j10) {
        super.requestBodyEnd(eVar, j10);
        this.writeRequestBodyTookTime += System.nanoTime() - this.writeRequestBodyStartTime;
        this.requestBodyByteCount = j10;
    }

    @Override // okhttp3.p
    public void requestBodyStart(e eVar) {
        super.requestBodyStart(eVar);
        this.writeRequestBodyStartTime = System.nanoTime();
    }

    @Override // okhttp3.p
    public void requestHeadersEnd(e eVar, a0 a0Var) {
        super.requestHeadersEnd(eVar, a0Var);
        this.writeRequestHeaderTookTime += System.nanoTime() - this.writeRequestHeaderStartTime;
    }

    @Override // okhttp3.p
    public void requestHeadersStart(e eVar) {
        super.requestHeadersStart(eVar);
        this.writeRequestHeaderStartTime = System.nanoTime();
    }

    @Override // okhttp3.p
    public void responseBodyEnd(e eVar, long j10) {
        super.responseBodyEnd(eVar, j10);
        this.readResponseBodyTookTime += System.nanoTime() - this.readResponseBodyStartTime;
        this.responseBodyByteCount = j10;
    }

    @Override // okhttp3.p
    public void responseBodyStart(e eVar) {
        super.responseBodyStart(eVar);
        this.readResponseBodyStartTime = System.nanoTime();
    }

    @Override // okhttp3.p
    public void responseHeadersEnd(e eVar, c0 c0Var) {
        super.responseHeadersEnd(eVar, c0Var);
        this.readResponseHeaderTookTime += System.nanoTime() - this.readResponseHeaderStartTime;
    }

    @Override // okhttp3.p
    public void responseHeadersStart(e eVar) {
        super.responseHeadersStart(eVar);
        this.readResponseHeaderStartTime = System.nanoTime();
    }

    @Override // okhttp3.p
    public void secureConnectEnd(e eVar, Handshake handshake) {
        super.secureConnectEnd(eVar, handshake);
        this.secureConnectTookTime += System.nanoTime() - this.secureConnectStartTime;
    }

    @Override // okhttp3.p
    public void secureConnectStart(e eVar) {
        super.secureConnectStart(eVar);
        this.secureConnectStartTime = System.nanoTime();
    }
}
