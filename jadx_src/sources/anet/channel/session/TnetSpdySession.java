package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnType;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Utils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.taobao.accs.common.Constants;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class TnetSpdySession extends Session implements SessionCb {
    protected long A;
    protected int B;
    protected DataFrameCb C;
    protected IHeartbeat D;
    protected IAuth E;
    protected String F;
    protected ISecurity G;
    private int H;
    private boolean I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected SpdyAgent f29820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected SpdySession f29821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected volatile boolean f29822y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected long f29823z;

    /* JADX INFO: compiled from: Taobao */
    public class a extends anet.channel.session.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Request f29825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RequestCb f29826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f29827d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f29828e = 0;

        public a(Request request, RequestCb requestCb) {
            this.f29825b = request;
            this.f29826c = requestCb;
        }

        private void a(SuperviseData superviseData, int i10, String str) {
            try {
                this.f29825b.f29773a.rspEnd = System.currentTimeMillis();
                if (this.f29825b.f29773a.isDone.get()) {
                    return;
                }
                if (i10 > 0) {
                    this.f29825b.f29773a.ret = 1;
                }
                this.f29825b.f29773a.statusCode = i10;
                this.f29825b.f29773a.msg = str;
                if (superviseData != null) {
                    this.f29825b.f29773a.rspEnd = superviseData.responseEnd;
                    this.f29825b.f29773a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                    RequestStatistic requestStatistic = this.f29825b.f29773a;
                    requestStatistic.sendDataTime = superviseData.sendEnd - requestStatistic.sendStart;
                    this.f29825b.f29773a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    this.f29825b.f29773a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                    this.f29825b.f29773a.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                    this.f29825b.f29773a.recDataSize = this.f29828e + ((long) superviseData.recvUncompressSize);
                    this.f29825b.f29773a.reqHeadInflateSize = superviseData.uncompressSize;
                    this.f29825b.f29773a.reqHeadDeflateSize = superviseData.compressSize;
                    this.f29825b.f29773a.reqBodyInflateSize = superviseData.bodySize;
                    this.f29825b.f29773a.reqBodyDeflateSize = superviseData.bodySize;
                    this.f29825b.f29773a.rspHeadDeflateSize = superviseData.recvCompressSize;
                    this.f29825b.f29773a.rspHeadInflateSize = superviseData.recvUncompressSize;
                    this.f29825b.f29773a.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.f29825b.f29773a.rspBodyInflateSize = this.f29828e;
                    if (this.f29825b.f29773a.contentLength == 0) {
                        this.f29825b.f29773a.contentLength = superviseData.originContentLength;
                    }
                    SessionStatistic sessionStatistic = TnetSpdySession.this.f29556q;
                    sessionStatistic.recvSizeCount += (long) (superviseData.recvBodySize + superviseData.recvCompressSize);
                    sessionStatistic.sendSizeCount += (long) (superviseData.bodySize + superviseData.compressSize);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.a, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f29825b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z10));
            }
            this.f29828e += (long) spdyByteArray.getDataLength();
            this.f29825b.f29773a.recDataSize += (long) spdyByteArray.getDataLength();
            IHeartbeat iHeartbeat = TnetSpdySession.this.D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            if (this.f29826c != null) {
                ByteArray byteArrayA = anet.channel.bytes.a.C0240a.f29622a.a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f29826c.onDataReceive(byteArrayA, z10);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // anet.channel.session.a, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
            this.f29825b.f29773a.firstDataTime = System.currentTimeMillis() - this.f29825b.f29773a.sendStart;
            this.f29827d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.H = 0;
            ALog.i("awcn.TnetSpdySession", "", this.f29825b.getSeq(), HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(this.f29827d));
            ALog.i("awcn.TnetSpdySession", "", this.f29825b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f29826c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f29827d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f29825b.f29773a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f29825b.f29773a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f29825b.f29773a.contentLength = HttpHelper.parseContentLength(map);
            this.f29825b.f29773a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f29825b, this.f29827d);
            TnetSpdySession.this.handleResponseHeaders(this.f29825b, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }

        @Override // anet.channel.session.a, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
            String msg;
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f29825b.getSeq(), "streamId", Long.valueOf(j10), Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            }
            if (i10 != 0) {
                this.f29827d = -304;
                msg = ErrorConstant.formatMsg(-304, String.valueOf(i10));
                if (i10 != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(-300, msg, this.f29825b.f29773a, null));
                }
                ALog.e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f29825b.getSeq(), com.umeng.analytics.pro.d.aw, TnetSpdySession.this.f29555p, "status code", Integer.valueOf(i10), "URL", this.f29825b.getHttpUrl().simpleUrlString());
            } else {
                msg = "SUCCESS";
            }
            this.f29825b.f29773a.tnetErrorCode = i10;
            a(superviseData, this.f29827d, msg);
            RequestCb requestCb = this.f29826c;
            if (requestCb != null) {
                requestCb.onFinish(this.f29827d, msg, this.f29825b.f29773a);
            }
            if (i10 == -2004) {
                if (!TnetSpdySession.this.f29822y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.e(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.this.I;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f29543d, TnetSpdySession.this.f29550k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public TnetSpdySession(Context context, anet.channel.entity.a aVar) {
        super(context, aVar);
        this.f29822y = false;
        this.A = 0L;
        this.H = 0;
        this.B = -1;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = false;
    }

    private void a(int i10, int i11, boolean z10, String str) {
        DataFrameCb dataFrameCb = this.C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i10, i11, z10, str);
        }
    }

    private void c() {
        SpdyAgent.enableDebug = false;
        this.f29820w = SpdyAgent.getInstance(this.f29540a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f29820w.setAccsSslCallback(new j(this));
        }
        if (AwcnConfig.isTnetHeaderCacheEnable()) {
            return;
        }
        try {
            this.f29820w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.f29820w, new Object[0]);
            ALog.i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
        } catch (Exception e10) {
            ALog.e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e10, new Object[0]);
        }
    }

    static /* synthetic */ int e(TnetSpdySession tnetSpdySession) {
        int i10 = tnetSpdySession.H + 1;
        tnetSpdySession.H = i10;
        return i10;
    }

    protected void b() {
        IAuth iAuth = this.E;
        if (iAuth != null) {
            iAuth.auth(this, new i(this));
            return;
        }
        notifyStatus(4, null);
        this.f29556q.ret = 1;
        IHeartbeat iHeartbeat = this.D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.e("awcn.TnetSpdySession", "force close!", this.f29555p, com.umeng.analytics.pro.d.aw, this);
        notifyStatus(7, null);
        try {
            IHeartbeat iHeartbeat = this.D;
            if (iHeartbeat != null) {
                iHeartbeat.stop();
                this.D = null;
            }
            SpdySession spdySession = this.f29821x;
            if (spdySession != null) {
                spdySession.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.Session
    public void connect() {
        int xquicCongControl;
        int i10 = this.f29553n;
        int i11 = 1;
        if (i10 == 1 || i10 == 0 || i10 == 4) {
            return;
        }
        try {
            if (this.f29820w == null) {
                c();
            }
            if (anet.channel.util.c.a() && anet.channel.strategy.utils.c.a(this.f29544e)) {
                try {
                    this.f29545f = anet.channel.util.c.a(this.f29544e);
                } catch (Exception unused) {
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            ALog.e("awcn.TnetSpdySession", "connect", this.f29555p, "host", this.f29542c, "ip", this.f29545f, HeyboxMicFragment.f93763y, Integer.valueOf(this.f29546g), "sessionId", strValueOf, "SpdyProtocol,", this.f29549j, "proxyIp,", this.f29547h, "proxyPort,", Integer.valueOf(this.f29548i));
            SessionInfo sessionInfo = new SessionInfo(this.f29545f, this.f29546g, this.f29542c + lg.a.f131412e + this.F, this.f29547h, this.f29548i, strValueOf, this, this.f29549j.getTnetConType());
            sessionInfo.setConnectionTimeoutMs((int) (((float) this.f29557r) * Utils.getNetworkTimeFactor()));
            if (this.f29549j.isPublicKeyAuto() || this.f29549j.isH2S() || this.f29549j.isHTTP3()) {
                sessionInfo.setCertHost(this.f29552m ? this.f29544e : this.f29543d);
            } else {
                int i12 = this.B;
                if (i12 >= 0) {
                    sessionInfo.setPubKeySeqNum(i12);
                } else {
                    ConnType connType = this.f29549j;
                    ISecurity iSecurity = this.G;
                    int tnetPublicKey = connType.getTnetPublicKey(iSecurity != null ? iSecurity.isSecOff() : true);
                    this.B = tnetPublicKey;
                    sessionInfo.setPubKeySeqNum(tnetPublicKey);
                }
            }
            if (this.f29549j.isHTTP3() && (xquicCongControl = AwcnConfig.getXquicCongControl()) >= 0) {
                sessionInfo.setXquicCongControl(xquicCongControl);
            }
            SpdySession spdySessionCreateSession = this.f29820w.createSession(sessionInfo);
            this.f29821x = spdySessionCreateSession;
            if (spdySessionCreateSession.getRefCount() > 1) {
                ALog.e("awcn.TnetSpdySession", "get session ref count > 1!!!", this.f29555p, new Object[0]);
                notifyStatus(0, new anet.channel.entity.b(1));
                b();
                return;
            }
            notifyStatus(1, null);
            this.f29823z = System.currentTimeMillis();
            SessionStatistic sessionStatistic = this.f29556q;
            if (TextUtils.isEmpty(this.f29547h)) {
                i11 = 0;
            }
            sessionStatistic.isProxy = i11;
            SessionStatistic sessionStatistic2 = this.f29556q;
            sessionStatistic2.isTunnel = "false";
            sessionStatistic2.isBackground = GlobalAppRuntimeInfo.isAppBackground();
            this.A = 0L;
        } catch (Throwable th2) {
            notifyStatus(2, null);
            ALog.e("awcn.TnetSpdySession", "connect exception ", this.f29555p, th2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new h(this);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            ALog.i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            ISecurity iSecurity = this.G;
            if (iSecurity == null) {
                return null;
            }
            return iSecurity.getBytes(this.f29540a, "accs_ssl_key2_" + domain);
        } catch (Throwable th2) {
            ALog.e("awcn.TnetSpdySession", "getSSLMeta", null, th2, new Object[0]);
            return null;
        }
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.F = config.getAppkey();
            this.G = config.getSecurity();
        }
    }

    public void initSessionInfo(anet.channel.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.C = sessionInfo.dataFrameCb;
            this.E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f29556q.isKL = 1L;
                this.f29559t = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.D = iHeartbeat;
                boolean z10 = sessionInfo.isAccs;
                this.I = z10;
                if (iHeartbeat == null) {
                    if (!z10 || AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.D = HeartbeatManager.getDefaultHeartbeat();
                    } else {
                        this.D = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    }
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.D == null) {
            this.D = new anet.channel.heartbeat.c();
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f29553n == 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f29822y = false;
    }

    @Override // anet.channel.Session
    public void ping(boolean z10) {
        ping(z10, this.f29558s);
    }

    @Override // anet.channel.Session
    public void ping(boolean z10, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.TnetSpdySession", "ping", this.f29555p, "host", this.f29542c, "thread", Thread.currentThread().getName());
        }
        if (z10) {
            try {
                if (this.f29821x == null) {
                    SessionStatistic sessionStatistic = this.f29556q;
                    if (sessionStatistic != null) {
                        sessionStatistic.closeReason = "session null";
                    }
                    ALog.e("awcn.TnetSpdySession", this.f29542c + " session null", this.f29555p, new Object[0]);
                    close();
                    return;
                }
                int i11 = this.f29553n;
                if (i11 == 0 || i11 == 4) {
                    handleCallbacks(64, null);
                    if (this.f29822y) {
                        return;
                    }
                    this.f29822y = true;
                    this.f29556q.ppkgCount++;
                    this.f29821x.submitPing();
                    if (ALog.isPrintLog(1)) {
                        ALog.d("awcn.TnetSpdySession", this.f29542c + " submit ping ms:" + (System.currentTimeMillis() - this.f29823z) + " force:" + z10, this.f29555p, new Object[0]);
                    }
                    setPingTimeout(i10);
                    this.f29823z = System.currentTimeMillis();
                    IHeartbeat iHeartbeat = this.D;
                    if (iHeartbeat != null) {
                        iHeartbeat.reSchedule();
                    }
                }
            } catch (SpdyErrorException e10) {
                if (e10.SpdyErrorGetCode() == -1104 || e10.SpdyErrorGetCode() == -1103) {
                    ALog.e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f29555p, new Object[0]);
                    notifyStatus(6, new anet.channel.entity.b(2));
                }
                ALog.e("awcn.TnetSpdySession", "ping", this.f29555p, e10, new Object[0]);
            } catch (Exception e11) {
                ALog.e("awcn.TnetSpdySession", "ping", this.f29555p, e11, new Object[0]);
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        try {
            ISecurity iSecurity = this.G;
            if (iSecurity == null) {
                return -1;
            }
            Context context = this.f29540a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("accs_ssl_key2_");
            sb2.append(domain);
            return iSecurity.saveBytes(context, sb2.toString(), bArr) ? 0 : -1;
        } catch (Throwable th2) {
            ALog.e("awcn.TnetSpdySession", "putSSLMeta", null, th2, new Object[0]);
            return -1;
        }
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        int i10;
        anet.channel.request.c cVar = anet.channel.request.c.NULL;
        RequestStatistic requestStatistic = request != null ? request.f29773a : new RequestStatistic(this.f29543d, null);
        requestStatistic.setConnType(this.f29549j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        requestStatistic.setIPAndPort(this.f29545f, this.f29546g);
        requestStatistic.ipRefer = this.f29550k.getIpSource();
        requestStatistic.ipType = this.f29550k.getIpType();
        requestStatistic.unit = this.f29551l;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return cVar;
        }
        try {
            if (this.f29821x == null || !((i10 = this.f29553n) == 0 || i10 == 4)) {
                requestCb.onFinish(-301, ErrorConstant.getErrMsg(-301), request.f29773a);
                return cVar;
            }
            if (this.f29552m) {
                request.setDnsOptimize(this.f29544e, this.f29546g);
            }
            request.setUrlScheme(this.f29549j.isSSL());
            URL url = request.getUrl();
            if (ALog.isPrintLog(2)) {
                ALog.i("awcn.TnetSpdySession", "", request.getSeq(), "request URL", url.toString());
                ALog.i("awcn.TnetSpdySession", "", request.getSeq(), "request Method", request.getMethod());
                ALog.i("awcn.TnetSpdySession", "", request.getSeq(), "request headers", request.getHeaders());
            }
            SpdyRequest spdyRequest = (TextUtils.isEmpty(this.f29547h) || this.f29548i <= 0) ? new SpdyRequest(url, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout()) : new SpdyRequest(url, url.getHost(), url.getPort(), this.f29547h, this.f29548i, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout(), 0);
            spdyRequest.setRequestRdTimeoutMs(request.getReadTimeout());
            Map<String, String> headers = request.getHeaders();
            if (headers.containsKey("Host")) {
                HashMap map = new HashMap(request.getHeaders());
                String strRemove = map.remove("Host");
                if (this.f29552m) {
                    strRemove = this.f29544e;
                }
                map.put(":host", strRemove);
                spdyRequest.addHeaders(map);
            } else {
                spdyRequest.addHeaders(headers);
                spdyRequest.addHeader(":host", this.f29552m ? this.f29544e : request.getHost());
            }
            SpdyDataProvider spdyDataProvider = new SpdyDataProvider(request.getBodyBytes());
            request.f29773a.sendStart = System.currentTimeMillis();
            RequestStatistic requestStatistic2 = request.f29773a;
            requestStatistic2.processTime = requestStatistic2.sendStart - request.f29773a.start;
            int iSubmitRequest = this.f29821x.submitRequest(spdyRequest, spdyDataProvider, this, new a(request, requestCb));
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.TnetSpdySession", "", request.getSeq(), "streamId", Integer.valueOf(iSubmitRequest));
            }
            anet.channel.request.c cVar2 = new anet.channel.request.c(this.f29821x, iSubmitRequest, request.getSeq());
            try {
                SessionStatistic sessionStatistic = this.f29556q;
                sessionStatistic.requestCount++;
                sessionStatistic.stdRCount++;
                this.f29823z = System.currentTimeMillis();
                IHeartbeat iHeartbeat = this.D;
                if (iHeartbeat != null) {
                    iHeartbeat.reSchedule();
                }
                return cVar2;
            } catch (SpdyErrorException e10) {
                e = e10;
                cVar = cVar2;
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f29555p, new Object[0]);
                    notifyStatus(6, new anet.channel.entity.b(2));
                }
                requestCb.onFinish(-300, ErrorConstant.formatMsg(-300, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
                return cVar;
            } catch (Exception unused) {
                cVar = cVar2;
                requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
                return cVar;
            }
        } catch (SpdyErrorException e11) {
            e = e11;
        } catch (Exception unused2) {
        }
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
        SpdySession spdySession;
        try {
            if (this.C == null) {
                return;
            }
            ALog.e("awcn.TnetSpdySession", "sendCustomFrame", this.f29555p, Constants.KEY_DATA_ID, Integer.valueOf(i10), "type", Integer.valueOf(i11));
            if (this.f29553n != 4 || (spdySession = this.f29821x) == null) {
                ALog.e("awcn.TnetSpdySession", "sendCustomFrame", this.f29555p, "sendCustomFrame con invalid mStatus:" + this.f29553n);
                a(i10, -301, true, "session invalid");
                return;
            }
            if (bArr != null && bArr.length > 16384) {
                a(i10, -303, false, null);
                return;
            }
            spdySession.sendCustomControlFrame(i10, i11, 0, bArr == null ? 0 : bArr.length, bArr);
            SessionStatistic sessionStatistic = this.f29556q;
            sessionStatistic.requestCount++;
            sessionStatistic.cfRCount++;
            this.f29823z = System.currentTimeMillis();
            IHeartbeat iHeartbeat = this.D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        } catch (SpdyErrorException e10) {
            ALog.e("awcn.TnetSpdySession", "sendCustomFrame error", this.f29555p, e10, new Object[0]);
            a(i10, -300, true, "SpdyErrorException: " + e10.toString());
        } catch (Exception e11) {
            ALog.e("awcn.TnetSpdySession", "sendCustomFrame error", this.f29555p, e11, new Object[0]);
            a(i10, -101, true, e11.toString());
        }
    }

    public void setTnetPublicKey(int i10) {
        this.B = i10;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        ALog.e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f29555p, Constants.KEY_DATA_ID, Integer.valueOf(i10));
        a(i10, i11, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        ALog.e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f29555p, "len", Integer.valueOf(i13), "frameCb", this.C);
        if (ALog.isPrintLog(1) && i13 < 512) {
            String str = "";
            for (byte b10 : bArr) {
                str = str + Integer.toHexString(b10 & 255) + " ";
            }
            ALog.e("awcn.TnetSpdySession", null, this.f29555p, "str", str);
        }
        DataFrameCb dataFrameCb = this.C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i10, i11);
        } else {
            ALog.e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f29555p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.f29556q.inceptCount++;
        IHeartbeat iHeartbeat = this.D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.TnetSpdySession", "ping receive", this.f29555p, "Host", this.f29542c, "id", Long.valueOf(j10));
        }
        if (j10 < 0) {
            return;
        }
        this.f29822y = false;
        this.H = 0;
        IHeartbeat iHeartbeat = this.D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        ALog.e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f29555p, " errorCode:", Integer.valueOf(i10));
        IHeartbeat iHeartbeat = this.D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.e("awcn.TnetSpdySession", "session clean up failed!", null, e10, new Object[0]);
            }
        }
        if (i10 == -3516) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            StrategyCenter.getInstance().notifyConnEvent(this.f29543d, this.f29550k, connEvent);
        }
        notifyStatus(6, new anet.channel.entity.b(2));
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.f29556q;
            sessionStatistic.requestCount = superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f29549j.isHTTP3()) {
                    if (spdySession != null) {
                        ALog.e("awcn.TnetSpdySession", "[HTTP3 spdySessionCloseCallback]", this.f29555p, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                    }
                    this.f29556q.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.f29556q.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.f29556q.lossRate = superviseConnectInfo.lossRate;
                    this.f29556q.tlpCount = superviseConnectInfo.tlpCount;
                    this.f29556q.rtoCount = superviseConnectInfo.rtoCount;
                    this.f29556q.srtt = superviseConnectInfo.srtt;
                }
            } catch (Exception unused) {
            }
        }
        SessionStatistic sessionStatistic2 = this.f29556q;
        if (sessionStatistic2.errorCode == 0) {
            sessionStatistic2.errorCode = i10;
        }
        sessionStatistic2.lastPingInterval = (int) (System.currentTimeMillis() - this.f29823z);
        AppMonitor.getInstance().commitStat(this.f29556q);
        if (anet.channel.strategy.utils.c.b(this.f29556q.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f29556q));
        }
        AppMonitor.getInstance().commitAlarm(this.f29556q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        SessionStatistic sessionStatistic = this.f29556q;
        sessionStatistic.connectionTime = superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.A = System.currentTimeMillis();
        notifyStatus(0, new anet.channel.entity.b(1));
        b();
        ALog.e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f29555p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (this.f29549j.isHTTP3()) {
            this.f29556q.scid = superviseConnectInfo.scid;
            this.f29556q.dcid = superviseConnectInfo.dcid;
            this.f29556q.congControlKind = superviseConnectInfo.congControlKind;
            ALog.e("awcn.TnetSpdySession", "[HTTP3 spdySessionConnectCB]", this.f29555p, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e10, new Object[0]);
            }
        }
        notifyStatus(2, new anet.channel.entity.b(256, i10, "tnet connect fail"));
        ALog.e("awcn.TnetSpdySession", null, this.f29555p, " errorId:", Integer.valueOf(i10));
        SessionStatistic sessionStatistic = this.f29556q;
        sessionStatistic.errorCode = i10;
        sessionStatistic.ret = 0;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f29556q);
        if (anet.channel.strategy.utils.c.b(this.f29556q.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.f29556q));
        }
        AppMonitor.getInstance().commitAlarm(this.f29556q.getAlarmObject());
    }
}
