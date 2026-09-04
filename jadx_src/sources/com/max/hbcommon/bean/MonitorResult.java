package com.max.hbcommon.bean;

import androidx.collection.k;
import androidx.compose.foundation.b0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MonitorResult.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MonitorResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int callCoat;
    private int conectTotalCost;
    private int dnsCost;

    @d
    private String dnsResult;

    @d
    private String ip;
    private boolean isHttps;
    private boolean isProxy;

    @d
    private String netType;

    @d
    private String port;

    @d
    private String protocol;
    private long requestBodyByteCount;
    private int requestBodyCost;
    private int requestHeaderCost;

    @d
    private String requestMethod;
    private int requestTotalCost;
    private long responseBodyByteCount;
    private int responseBodyCost;
    private int responseCode;
    private int responseHeaderCost;
    private int responseTotalCost;
    private int tcpCost;
    private int tlsCost;

    @d
    private String tlsHandshakeInfo;

    @d
    private String url;

    public MonitorResult() {
        this(null, null, null, false, null, null, false, null, null, null, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, null);
    }

    public MonitorResult(@d String netType, @d String url, @d String requestMethod, boolean z10, @d String ip, @d String port, boolean z11, @d String protocol, @d String dnsResult, @d String tlsHandshakeInfo, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        f0.p(netType, "netType");
        f0.p(url, "url");
        f0.p(requestMethod, "requestMethod");
        f0.p(ip, "ip");
        f0.p(port, "port");
        f0.p(protocol, "protocol");
        f0.p(dnsResult, "dnsResult");
        f0.p(tlsHandshakeInfo, "tlsHandshakeInfo");
        this.netType = netType;
        this.url = url;
        this.requestMethod = requestMethod;
        this.isHttps = z10;
        this.ip = ip;
        this.port = port;
        this.isProxy = z11;
        this.protocol = protocol;
        this.dnsResult = dnsResult;
        this.tlsHandshakeInfo = tlsHandshakeInfo;
        this.requestBodyByteCount = j10;
        this.responseBodyByteCount = j11;
        this.responseCode = i10;
        this.dnsCost = i11;
        this.tcpCost = i12;
        this.tlsCost = i13;
        this.conectTotalCost = i14;
        this.requestHeaderCost = i15;
        this.requestBodyCost = i16;
        this.requestTotalCost = i17;
        this.responseHeaderCost = i18;
        this.responseBodyCost = i19;
        this.responseTotalCost = i20;
        this.callCoat = i21;
    }

    public /* synthetic */ MonitorResult(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, String str6, String str7, String str8, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, u uVar) {
        this((i22 & 1) != 0 ? "" : str, (i22 & 2) != 0 ? "" : str2, (i22 & 4) != 0 ? "" : str3, (i22 & 8) != 0 ? false : z10, (i22 & 16) != 0 ? "" : str4, (i22 & 32) != 0 ? "" : str5, (i22 & 64) != 0 ? false : z11, (i22 & 128) != 0 ? "" : str6, (i22 & 256) != 0 ? "" : str7, (i22 & 512) == 0 ? str8 : "", (i22 & 1024) != 0 ? 0L : j10, (i22 & 2048) == 0 ? j11 : 0L, (i22 & 4096) != 0 ? 0 : i10, (i22 & 8192) != 0 ? 0 : i11, (i22 & 16384) != 0 ? 0 : i12, (i22 & 32768) != 0 ? 0 : i13, (i22 & 65536) != 0 ? 0 : i14, (i22 & 131072) != 0 ? 0 : i15, (i22 & 262144) != 0 ? 0 : i16, (i22 & 524288) != 0 ? 0 : i17, (i22 & 1048576) != 0 ? 0 : i18, (i22 & 2097152) != 0 ? 0 : i19, (i22 & 4194304) != 0 ? 0 : i20, (i22 & 8388608) != 0 ? 0 : i21);
    }

    public static /* synthetic */ MonitorResult copy$default(MonitorResult monitorResult, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, String str6, String str7, String str8, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, Object obj) {
        Object[] objArr = {monitorResult, str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0), str4, str5, new Byte(z11 ? (byte) 1 : (byte) 0), str6, str7, str8, new Long(j10), new Long(j11), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17), new Integer(i18), new Integer(i19), new Integer(i20), new Integer(i21), new Integer(i22), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.d.f31201e4, new Class[]{MonitorResult.class, String.class, String.class, String.class, cls, String.class, String.class, cls, String.class, String.class, String.class, cls2, cls2, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, Object.class}, MonitorResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (MonitorResult) patchProxyResultProxy.result;
        }
        return monitorResult.copy((i22 & 1) != 0 ? monitorResult.netType : str, (i22 & 2) != 0 ? monitorResult.url : str2, (i22 & 4) != 0 ? monitorResult.requestMethod : str3, (i22 & 8) != 0 ? monitorResult.isHttps : z10 ? 1 : 0, (i22 & 16) != 0 ? monitorResult.ip : str4, (i22 & 32) != 0 ? monitorResult.port : str5, (i22 & 64) != 0 ? monitorResult.isProxy : z11 ? 1 : 0, (i22 & 128) != 0 ? monitorResult.protocol : str6, (i22 & 256) != 0 ? monitorResult.dnsResult : str7, (i22 & 512) != 0 ? monitorResult.tlsHandshakeInfo : str8, (i22 & 1024) != 0 ? monitorResult.requestBodyByteCount : j10, (i22 & 2048) != 0 ? monitorResult.responseBodyByteCount : j11, (i22 & 4096) != 0 ? monitorResult.responseCode : i10, (i22 & 8192) != 0 ? monitorResult.dnsCost : i11, (i22 & 16384) != 0 ? monitorResult.tcpCost : i12, (i22 & 32768) != 0 ? monitorResult.tlsCost : i13, (i22 & 65536) != 0 ? monitorResult.conectTotalCost : i14, (i22 & 131072) != 0 ? monitorResult.requestHeaderCost : i15, (i22 & 262144) != 0 ? monitorResult.requestBodyCost : i16, (i22 & 524288) != 0 ? monitorResult.requestTotalCost : i17, (i22 & 1048576) != 0 ? monitorResult.responseHeaderCost : i18, (i22 & 2097152) != 0 ? monitorResult.responseBodyCost : i19, (i22 & 4194304) != 0 ? monitorResult.responseTotalCost : i20, (i22 & 8388608) != 0 ? monitorResult.callCoat : i21);
    }

    @d
    public final String component1() {
        return this.netType;
    }

    @d
    public final String component10() {
        return this.tlsHandshakeInfo;
    }

    public final long component11() {
        return this.requestBodyByteCount;
    }

    public final long component12() {
        return this.responseBodyByteCount;
    }

    public final int component13() {
        return this.responseCode;
    }

    public final int component14() {
        return this.dnsCost;
    }

    public final int component15() {
        return this.tcpCost;
    }

    public final int component16() {
        return this.tlsCost;
    }

    public final int component17() {
        return this.conectTotalCost;
    }

    public final int component18() {
        return this.requestHeaderCost;
    }

    public final int component19() {
        return this.requestBodyCost;
    }

    @d
    public final String component2() {
        return this.url;
    }

    public final int component20() {
        return this.requestTotalCost;
    }

    public final int component21() {
        return this.responseHeaderCost;
    }

    public final int component22() {
        return this.responseBodyCost;
    }

    public final int component23() {
        return this.responseTotalCost;
    }

    public final int component24() {
        return this.callCoat;
    }

    @d
    public final String component3() {
        return this.requestMethod;
    }

    public final boolean component4() {
        return this.isHttps;
    }

    @d
    public final String component5() {
        return this.ip;
    }

    @d
    public final String component6() {
        return this.port;
    }

    public final boolean component7() {
        return this.isProxy;
    }

    @d
    public final String component8() {
        return this.protocol;
    }

    @d
    public final String component9() {
        return this.dnsResult;
    }

    @d
    public final MonitorResult copy(@d String netType, @d String url, @d String requestMethod, boolean z10, @d String ip, @d String port, boolean z11, @d String protocol, @d String dnsResult, @d String tlsHandshakeInfo, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        Object[] objArr = {netType, url, requestMethod, new Byte(z10 ? (byte) 1 : (byte) 0), ip, port, new Byte(z11 ? (byte) 1 : (byte) 0), protocol, dnsResult, tlsHandshakeInfo, new Long(j10), new Long(j11), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17), new Integer(i18), new Integer(i19), new Integer(i20), new Integer(i21)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 2292, new Class[]{String.class, String.class, String.class, cls, String.class, String.class, cls, String.class, String.class, String.class, cls2, cls2, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3}, MonitorResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (MonitorResult) patchProxyResultProxy.result;
        }
        f0.p(netType, "netType");
        f0.p(url, "url");
        f0.p(requestMethod, "requestMethod");
        f0.p(ip, "ip");
        f0.p(port, "port");
        f0.p(protocol, "protocol");
        f0.p(dnsResult, "dnsResult");
        f0.p(tlsHandshakeInfo, "tlsHandshakeInfo");
        return new MonitorResult(netType, url, requestMethod, z10, ip, port, z11, protocol, dnsResult, tlsHandshakeInfo, j10, j11, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31270h4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonitorResult)) {
            return false;
        }
        MonitorResult monitorResult = (MonitorResult) obj;
        return f0.g(this.netType, monitorResult.netType) && f0.g(this.url, monitorResult.url) && f0.g(this.requestMethod, monitorResult.requestMethod) && this.isHttps == monitorResult.isHttps && f0.g(this.ip, monitorResult.ip) && f0.g(this.port, monitorResult.port) && this.isProxy == monitorResult.isProxy && f0.g(this.protocol, monitorResult.protocol) && f0.g(this.dnsResult, monitorResult.dnsResult) && f0.g(this.tlsHandshakeInfo, monitorResult.tlsHandshakeInfo) && this.requestBodyByteCount == monitorResult.requestBodyByteCount && this.responseBodyByteCount == monitorResult.responseBodyByteCount && this.responseCode == monitorResult.responseCode && this.dnsCost == monitorResult.dnsCost && this.tcpCost == monitorResult.tcpCost && this.tlsCost == monitorResult.tlsCost && this.conectTotalCost == monitorResult.conectTotalCost && this.requestHeaderCost == monitorResult.requestHeaderCost && this.requestBodyCost == monitorResult.requestBodyCost && this.requestTotalCost == monitorResult.requestTotalCost && this.responseHeaderCost == monitorResult.responseHeaderCost && this.responseBodyCost == monitorResult.responseBodyCost && this.responseTotalCost == monitorResult.responseTotalCost && this.callCoat == monitorResult.callCoat;
    }

    public final int getCallCoat() {
        return this.callCoat;
    }

    public final int getConectTotalCost() {
        return this.conectTotalCost;
    }

    public final int getDnsCost() {
        return this.dnsCost;
    }

    @d
    public final String getDnsResult() {
        return this.dnsResult;
    }

    @d
    public final String getIp() {
        return this.ip;
    }

    @d
    public final String getNetType() {
        return this.netType;
    }

    @d
    public final String getPort() {
        return this.port;
    }

    @d
    public final String getProtocol() {
        return this.protocol;
    }

    public final long getRequestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public final int getRequestBodyCost() {
        return this.requestBodyCost;
    }

    public final int getRequestHeaderCost() {
        return this.requestHeaderCost;
    }

    @d
    public final String getRequestMethod() {
        return this.requestMethod;
    }

    public final int getRequestTotalCost() {
        return this.requestTotalCost;
    }

    public final long getResponseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public final int getResponseBodyCost() {
        return this.responseBodyCost;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final int getResponseHeaderCost() {
        return this.responseHeaderCost;
    }

    public final int getResponseTotalCost() {
        return this.responseTotalCost;
    }

    public final int getTcpCost() {
        return this.tcpCost;
    }

    public final int getTlsCost() {
        return this.tlsCost;
    }

    @d
    public final String getTlsHandshakeInfo() {
        return this.tlsHandshakeInfo;
    }

    @d
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31247g4, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((((((((((((((((((((((((((((((((((((((((((this.netType.hashCode() * 31) + this.url.hashCode()) * 31) + this.requestMethod.hashCode()) * 31) + b0.a(this.isHttps)) * 31) + this.ip.hashCode()) * 31) + this.port.hashCode()) * 31) + b0.a(this.isProxy)) * 31) + this.protocol.hashCode()) * 31) + this.dnsResult.hashCode()) * 31) + this.tlsHandshakeInfo.hashCode()) * 31) + k.a(this.requestBodyByteCount)) * 31) + k.a(this.responseBodyByteCount)) * 31) + this.responseCode) * 31) + this.dnsCost) * 31) + this.tcpCost) * 31) + this.tlsCost) * 31) + this.conectTotalCost) * 31) + this.requestHeaderCost) * 31) + this.requestBodyCost) * 31) + this.requestTotalCost) * 31) + this.responseHeaderCost) * 31) + this.responseBodyCost) * 31) + this.responseTotalCost) * 31) + this.callCoat;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final boolean isProxy() {
        return this.isProxy;
    }

    public final void setCallCoat(int i10) {
        this.callCoat = i10;
    }

    public final void setConectTotalCost(int i10) {
        this.conectTotalCost = i10;
    }

    public final void setDnsCost(int i10) {
        this.dnsCost = i10;
    }

    public final void setDnsResult(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.f31131b4, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.dnsResult = str;
    }

    public final void setHttps(boolean z10) {
        this.isHttps = z10;
    }

    public final void setIp(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.Y3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.ip = str;
    }

    public final void setNetType(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.V3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.netType = str;
    }

    public final void setPort(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.Z3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.port = str;
    }

    public final void setProtocol(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.f31108a4, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.protocol = str;
    }

    public final void setProxy(boolean z10) {
        this.isProxy = z10;
    }

    public final void setRequestBodyByteCount(long j10) {
        this.requestBodyByteCount = j10;
    }

    public final void setRequestBodyCost(int i10) {
        this.requestBodyCost = i10;
    }

    public final void setRequestHeaderCost(int i10) {
        this.requestHeaderCost = i10;
    }

    public final void setRequestMethod(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.X3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.requestMethod = str;
    }

    public final void setRequestTotalCost(int i10) {
        this.requestTotalCost = i10;
    }

    public final void setResponseBodyByteCount(long j10) {
        this.responseBodyByteCount = j10;
    }

    public final void setResponseBodyCost(int i10) {
        this.responseBodyCost = i10;
    }

    public final void setResponseCode(int i10) {
        this.responseCode = i10;
    }

    public final void setResponseHeaderCost(int i10) {
        this.responseHeaderCost = i10;
    }

    public final void setResponseTotalCost(int i10) {
        this.responseTotalCost = i10;
    }

    public final void setTcpCost(int i10) {
        this.tcpCost = i10;
    }

    public final void setTlsCost(int i10) {
        this.tlsCost = i10;
    }

    public final void setTlsHandshakeInfo(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.f31154c4, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.tlsHandshakeInfo = str;
    }

    public final void setUrl(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.W3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31224f4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MonitorResult(netType=" + this.netType + ", url=" + this.url + ", requestMethod=" + this.requestMethod + ", isHttps=" + this.isHttps + ", ip=" + this.ip + ", port=" + this.port + ", isProxy=" + this.isProxy + ", protocol=" + this.protocol + ", dnsResult=" + this.dnsResult + ", tlsHandshakeInfo=" + this.tlsHandshakeInfo + ", requestBodyByteCount=" + this.requestBodyByteCount + ", responseBodyByteCount=" + this.responseBodyByteCount + ", responseCode=" + this.responseCode + ", dnsCost=" + this.dnsCost + ", tcpCost=" + this.tcpCost + ", tlsCost=" + this.tlsCost + ", conectTotalCost=" + this.conectTotalCost + ", requestHeaderCost=" + this.requestHeaderCost + ", requestBodyCost=" + this.requestBodyCost + ", requestTotalCost=" + this.requestTotalCost + ", responseHeaderCost=" + this.responseHeaderCost + ", responseBodyCost=" + this.responseBodyCost + ", responseTotalCost=" + this.responseTotalCost + ", callCoat=" + this.callCoat + ')';
    }
}
