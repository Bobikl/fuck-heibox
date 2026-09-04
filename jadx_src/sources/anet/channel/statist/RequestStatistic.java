package anet.channel.statist;

import ad.c;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.AppLifecycle;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.taobao.accs.common.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
@Monitor(module = "networkPrefer", monitorPoint = c.f1243w)
public class RequestStatistic extends StatObject {

    @Dimension
    public String abTestBucket;

    @Dimension
    public volatile String bizId;

    @Dimension
    public volatile String bssid;

    @Dimension
    public int deviceLevel;

    @Dimension
    public volatile String f_refer;

    @Dimension
    public int firstErrorCode;

    @Dimension
    public String firstProtocol;

    @Dimension
    public volatile String host;

    @Dimension
    public volatile String ip;

    @Dimension
    public volatile String isBg;

    @Dimension
    public volatile boolean isProxy;
    public boolean isReqMain;
    public boolean isReqSync;

    @Dimension
    public volatile boolean isSSL;
    public String locationUrl;

    @Dimension
    public String mnc;
    public volatile long netReqStart;

    @Dimension
    public volatile String netType;
    public String pTraceId;

    @Dimension
    public volatile int port;

    @Dimension
    public String process;

    @Dimension
    public volatile String protocolType;

    @Dimension
    public volatile String proxyType;

    @Deprecated
    public volatile String quicConnectionID;
    public volatile long reqServiceTransmissionEnd;

    @Dimension
    public volatile int ret;

    @Dimension
    public volatile int retryTimes;

    @Dimension
    public int roaming;
    public volatile long rspCbDispatch;
    public volatile long rspCbEnd;
    public volatile long rspCbStart;

    @Dimension
    public long sinceBgTime;

    @Dimension
    public long sinceInitTime;

    @Dimension
    public long sinceLastLaunchTime;

    @Dimension
    public String speedBucket;
    public String traceId;

    @Dimension
    public String unit;

    @Dimension(name = "URL")
    public volatile String url;
    public String userInfo;

    @Dimension
    public volatile int ipRefer = 0;

    @Dimension
    public volatile int ipType = 1;

    @Dimension
    public volatile boolean isDNS = false;

    @Dimension(name = Constants.KEY_ERROR_CODE)
    public volatile int statusCode = 0;

    @Dimension(name = "errorMsg")
    public volatile String msg = "";

    @Dimension
    public volatile String contentEncoding = null;

    @Dimension
    public volatile String contentType = null;

    @Dimension
    public volatile int degraded = 0;

    @Dimension
    public volatile StringBuilder errorTrace = null;

    @Dimension
    public double lng = 90000.0d;

    @Dimension
    public double lat = 90000.0d;

    @Dimension
    public float accuracy = -1.0f;

    @Dimension
    public JSONObject extra = null;

    @Dimension
    public int startType = 0;

    @Dimension
    public int isFromExternal = 0;

    @Measure
    public volatile long reqHeadInflateSize = 0;

    @Measure
    public volatile long reqBodyInflateSize = 0;

    @Measure
    public volatile long reqHeadDeflateSize = 0;

    @Measure
    public volatile long reqBodyDeflateSize = 0;

    @Measure
    public volatile long rspHeadDeflateSize = 0;

    @Measure
    public volatile long rspBodyDeflateSize = 0;

    @Measure
    public volatile long rspHeadInflateSize = 0;

    @Measure
    public volatile long rspBodyInflateSize = 0;

    @Measure
    public volatile long retryCostTime = 0;

    @Measure
    public volatile long connWaitTime = 0;

    @Measure
    public volatile long sendBeforeTime = 0;

    @Measure
    public volatile long processTime = 0;

    @Measure
    public volatile long sendDataTime = 0;

    @Measure
    public volatile long firstDataTime = 0;

    @Measure
    public volatile long recDataTime = 0;

    @Measure
    public volatile long serverRT = 0;

    @Measure
    public volatile long cacheTime = 0;

    @Measure
    public volatile long lastProcessTime = 0;

    @Measure
    public volatile long callbackTime = 0;

    @Measure(max = 60000.0d)
    public volatile long oneWayTime = 0;

    @Measure
    public volatile long sendDataSize = 0;

    @Measure
    public volatile long recDataSize = 0;

    @Deprecated
    public volatile long waitingTime = 0;

    @Measure
    public volatile long serializeTransferTime = 0;
    public final AtomicBoolean isDone = new AtomicBoolean(false);
    public volatile boolean spdyRequestSend = false;
    public volatile long start = 0;
    public volatile long reqStart = 0;
    public volatile long sendStart = 0;
    public volatile long sendEnd = 0;
    public volatile long rspStart = 0;
    public volatile long rspEnd = 0;
    public volatile long contentLength = 0;
    public volatile int tnetErrorCode = 0;

    public RequestStatistic(String str, String str2) {
        this.proxyType = "";
        this.netType = "";
        this.bssid = null;
        this.isBg = "";
        this.roaming = 0;
        this.mnc = "0";
        this.sinceBgTime = 0L;
        this.host = str;
        this.proxyType = NetworkStatusHelper.getProxyType();
        this.isProxy = !this.proxyType.isEmpty();
        this.netType = NetworkStatusHelper.getNetworkSubType();
        this.bssid = NetworkStatusHelper.getWifiBSSID();
        this.isBg = GlobalAppRuntimeInfo.isAppBackground() ? WebviewFragment.f94370q4 : "fg";
        if (WebviewFragment.f94370q4.equals(this.isBg) && AppLifecycle.lastEnterBackgroundTime > 0) {
            this.sinceBgTime = System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime;
        }
        this.roaming = NetworkStatusHelper.isRoaming() ? 1 : 0;
        this.mnc = NetworkStatusHelper.getSimOp();
        this.bizId = str2;
    }

    public void appendErrorTrace(String str) {
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        if (this.errorTrace.length() != 0) {
            this.errorTrace.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        StringBuilder sb2 = this.errorTrace;
        sb2.append(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(System.currentTimeMillis() - this.reqStart);
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        return this.statusCode != -200;
    }

    public void putExtra(String str, Object obj) {
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void recordRedirect(int i10, String str) {
        this.url = str;
        appendErrorTrace(String.valueOf(i10));
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.retryCostTime += jCurrentTimeMillis - this.start;
        this.start = jCurrentTimeMillis;
    }

    public void setConnType(ConnType connType) {
        this.isSSL = connType.isSSL();
        this.protocolType = connType.toString();
    }

    public void setIPAndPort(String str, int i10) {
        this.ip = str;
        this.port = i10;
        if (str != null) {
            this.isDNS = true;
        }
        if (this.retryTimes != 0 || str == null) {
            return;
        }
        putExtra("firstIp", str);
    }

    public void setIpInfo(int i10, int i11) {
        this.ipRefer = i10;
        this.ipType = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("[RequestStatistic]ret=");
        sb2.append(this.ret);
        sb2.append(",statusCode=");
        sb2.append(this.statusCode);
        sb2.append(",msg=");
        sb2.append(this.msg);
        sb2.append(",bizId=");
        sb2.append(this.bizId);
        sb2.append(",host=");
        sb2.append(this.host);
        sb2.append(",ip=");
        sb2.append(this.ip);
        sb2.append(",port=");
        sb2.append(this.port);
        sb2.append(",protocolType=");
        sb2.append(this.protocolType);
        sb2.append(",retryTime=");
        sb2.append(this.retryTimes);
        sb2.append(",retryCostTime=");
        sb2.append(this.retryCostTime);
        sb2.append(",processTime=");
        sb2.append(this.processTime);
        sb2.append(",connWaitTime=");
        sb2.append(this.connWaitTime);
        sb2.append(",cacheTime=");
        sb2.append(this.cacheTime);
        sb2.append(",sendDataTime=");
        sb2.append(this.sendDataTime);
        sb2.append(",firstDataTime=");
        sb2.append(this.firstDataTime);
        sb2.append(",recDataTime=");
        sb2.append(this.recDataTime);
        sb2.append(",lastProcessTime=");
        sb2.append(this.lastProcessTime);
        sb2.append(",oneWayTime=");
        sb2.append(this.oneWayTime);
        sb2.append(",callbackTime=");
        sb2.append(this.callbackTime);
        sb2.append(",serverRT=");
        sb2.append(this.serverRT);
        sb2.append(",sendSize=");
        sb2.append(this.sendDataSize);
        sb2.append(",recDataSize=");
        sb2.append(this.recDataSize);
        sb2.append(",originalDataSize=");
        sb2.append(this.rspBodyDeflateSize);
        if (this.extra != null) {
            sb2.append(",extra=");
            sb2.append(this.extra.toString());
        }
        sb2.append(",isReqSync=");
        sb2.append(this.isReqSync);
        sb2.append(",isReqMain=");
        sb2.append(this.isReqMain);
        sb2.append(",process=");
        sb2.append(this.process);
        if (!TextUtils.isEmpty(this.speedBucket)) {
            sb2.append(", speedBucket=");
            sb2.append(this.speedBucket);
        }
        sb2.append(",url=");
        sb2.append(this.url);
        return sb2.toString();
    }
}
