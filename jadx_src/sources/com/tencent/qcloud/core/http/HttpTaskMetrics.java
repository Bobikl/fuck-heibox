package com.tencent.qcloud.core.http;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HttpTaskMetrics {
    private long calculateMD5STookTime;
    private long calculateMD5StartTime;

    @p0
    InetAddress connectAddress;
    long connectTookTime;
    long dnsLookupTookTime;

    @p0
    String domainName;
    private long fullTaskStartTime;
    private long fullTaskTookTime;
    private long httpTaskStartTime;
    private long httpTaskTookTime;
    long readResponseBodyTookTime;
    long readResponseHeaderTookTime;

    @p0
    List<InetAddress> remoteAddress;
    long requestBodyByteCount;
    long responseBodyByteCount;
    long secureConnectTookTime;
    private long signRequestStartTime;
    private long signRequestTookTime;
    long writeRequestBodyTookTime;
    long writeRequestHeaderTookTime;

    public static HttpTaskMetrics createMetricsWithHost(String str) {
        HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
        httpTaskMetrics.domainName = str;
        return httpTaskMetrics;
    }

    private double toSeconds(long j10) {
        return j10 / 1.0E9d;
    }

    public double calculateMD5STookTime() {
        return toSeconds(this.calculateMD5STookTime);
    }

    public double connectTookTime() {
        return toSeconds(this.connectTookTime);
    }

    public double dnsLookupTookTime() {
        return toSeconds(this.dnsLookupTookTime);
    }

    public double fullTaskTookTime() {
        return toSeconds(this.fullTaskTookTime);
    }

    @p0
    public InetAddress getConnectAddress() {
        return this.connectAddress;
    }

    @p0
    public String getDomainName() {
        return this.domainName;
    }

    @p0
    public List<InetAddress> getRemoteAddress() {
        return this.remoteAddress;
    }

    public double httpTaskFullTime() {
        return toSeconds(this.httpTaskTookTime);
    }

    public synchronized HttpTaskMetrics merge(HttpTaskMetrics httpTaskMetrics) {
        String str;
        if (!TextUtils.isEmpty(this.domainName) && !TextUtils.isEmpty(httpTaskMetrics.domainName) && !this.domainName.equals(httpTaskMetrics.domainName)) {
            return this;
        }
        if (TextUtils.isEmpty(this.domainName) && (str = httpTaskMetrics.domainName) != null) {
            this.domainName = str;
        }
        this.dnsLookupTookTime = Math.max(httpTaskMetrics.dnsLookupTookTime, this.dnsLookupTookTime);
        this.connectTookTime = Math.max(httpTaskMetrics.connectTookTime, this.connectTookTime);
        this.secureConnectTookTime = Math.max(httpTaskMetrics.secureConnectTookTime, this.secureConnectTookTime);
        this.writeRequestHeaderTookTime += httpTaskMetrics.writeRequestHeaderTookTime;
        this.writeRequestBodyTookTime += httpTaskMetrics.writeRequestBodyTookTime;
        this.readResponseHeaderTookTime += httpTaskMetrics.readResponseHeaderTookTime;
        this.readResponseBodyTookTime += httpTaskMetrics.readResponseBodyTookTime;
        this.requestBodyByteCount += httpTaskMetrics.requestBodyByteCount;
        this.responseBodyByteCount += httpTaskMetrics.responseBodyByteCount;
        this.fullTaskTookTime += httpTaskMetrics.fullTaskTookTime;
        this.httpTaskTookTime += httpTaskMetrics.httpTaskTookTime;
        this.calculateMD5STookTime += httpTaskMetrics.calculateMD5STookTime;
        this.signRequestTookTime += httpTaskMetrics.signRequestTookTime;
        if (httpTaskMetrics.getRemoteAddress() != null) {
            this.remoteAddress = httpTaskMetrics.getRemoteAddress();
        }
        if (httpTaskMetrics.connectAddress != null) {
            this.connectAddress = httpTaskMetrics.getConnectAddress();
        }
        return this;
    }

    void onCalculateMD5End() {
        this.calculateMD5STookTime += System.nanoTime() - this.calculateMD5StartTime;
    }

    void onCalculateMD5Start() {
        this.calculateMD5StartTime = System.nanoTime();
    }

    public void onDataReady() {
    }

    void onHttpTaskEnd() {
        this.httpTaskTookTime = System.nanoTime() - this.httpTaskStartTime;
    }

    void onHttpTaskStart() {
        this.httpTaskStartTime = System.nanoTime();
    }

    void onSignRequestEnd() {
        this.signRequestTookTime += System.nanoTime() - this.signRequestStartTime;
    }

    void onSignRequestStart() {
        this.signRequestStartTime = System.nanoTime();
    }

    void onTaskEnd() {
        this.fullTaskTookTime = System.nanoTime() - this.fullTaskStartTime;
        onDataReady();
    }

    void onTaskStart() {
        this.fullTaskStartTime = System.nanoTime();
    }

    public double readResponseBodyTookTime() {
        return toSeconds(this.readResponseBodyTookTime);
    }

    public double readResponseHeaderTookTime() {
        return toSeconds(this.readResponseHeaderTookTime);
    }

    public void recordConnectAddress(InetAddress inetAddress) {
        if (inetAddress != null) {
            this.domainName = inetAddress.getHostName();
            this.connectAddress = inetAddress;
        }
    }

    public long requestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public long responseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public double secureConnectTookTime() {
        return toSeconds(this.secureConnectTookTime);
    }

    public void setDomainName(@p0 String str) {
        this.domainName = str;
    }

    public double signRequestTookTime() {
        return toSeconds(this.signRequestTookTime);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Http Metrics: \n");
        sb2.append("domain : ");
        sb2.append(this.domainName);
        sb2.append("\n");
        sb2.append("dns : ");
        InetAddress inetAddress = this.connectAddress;
        sb2.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb2.append("\n");
        sb2.append("fullTaskTookTime : ");
        sb2.append(fullTaskTookTime());
        sb2.append("\n");
        sb2.append("calculateMD5STookTime : ");
        sb2.append(calculateMD5STookTime());
        sb2.append("\n");
        sb2.append("signRequestTookTime : ");
        sb2.append(signRequestTookTime());
        sb2.append("\n");
        sb2.append("dnsLookupTookTime : ");
        sb2.append(dnsLookupTookTime());
        sb2.append("\n");
        sb2.append("connectTookTime : ");
        sb2.append(connectTookTime());
        sb2.append("\n");
        sb2.append("secureConnectTookTime : ");
        sb2.append(secureConnectTookTime());
        sb2.append("\n");
        sb2.append("writeRequestHeaderTookTime : ");
        sb2.append(writeRequestHeaderTookTime());
        sb2.append("\n");
        sb2.append("writeRequestBodyTookTime : ");
        sb2.append(writeRequestBodyTookTime());
        sb2.append("\n");
        sb2.append("readResponseHeaderTookTime : ");
        sb2.append(readResponseHeaderTookTime());
        sb2.append("\n");
        sb2.append("readResponseBodyTookTime : ");
        sb2.append(readResponseBodyTookTime());
        return sb2.toString();
    }

    public double writeRequestBodyTookTime() {
        return toSeconds(this.writeRequestBodyTookTime);
    }

    public double writeRequestHeaderTookTime() {
        return toSeconds(this.writeRequestHeaderTookTime);
    }
}
