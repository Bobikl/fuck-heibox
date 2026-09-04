package anetwork.channel.unified;

import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class k implements RequestCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Request f30336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ RequestStatistic f30337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f30338c;

    k(g gVar, Request request, RequestStatistic requestStatistic) {
        this.f30338c = gVar;
        this.f30336a = request;
        this.f30337b = requestStatistic;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        if (this.f30338c.f30313i.get()) {
            return;
        }
        g gVar = this.f30338c;
        if (gVar.f30315k == 0) {
            ALog.i(g.f30304o, "[onDataReceive] receive first data chunk!", gVar.f30306b.f30341c, new Object[0]);
        }
        if (z10) {
            ALog.i(g.f30304o, "[onDataReceive] receive last data chunk!", this.f30338c.f30306b.f30341c, new Object[0]);
        }
        g gVar2 = this.f30338c;
        int i10 = gVar2.f30315k + 1;
        gVar2.f30315k = i10;
        try {
            g.a aVar = gVar2.f30318n;
            if (aVar != null) {
                aVar.f30321c.add(byteArray);
                if (this.f30337b.recDataSize > 131072 || z10) {
                    g gVar3 = this.f30338c;
                    gVar3.f30315k = gVar3.f30318n.a(gVar3.f30306b.f30340b, gVar3.f30314j);
                    g gVar4 = this.f30338c;
                    gVar4.f30316l = true;
                    gVar4.f30317m = gVar4.f30315k > 1;
                    gVar4.f30318n = null;
                }
            } else {
                gVar2.f30306b.f30340b.a(i10, gVar2.f30314j, byteArray);
                this.f30338c.f30317m = true;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f30338c.f30309e;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                if (z10) {
                    String strL = this.f30338c.f30306b.f30339a.l();
                    g gVar5 = this.f30338c;
                    gVar5.f30308d.f30149b = gVar5.f30309e.toByteArray();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    g gVar6 = this.f30338c;
                    gVar6.f30307c.put(strL, gVar6.f30308d);
                    ALog.i(g.f30304o, "write cache", this.f30338c.f30306b.f30341c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), UiKitSpanObj.TYPE_SIZE, Integer.valueOf(this.f30338c.f30308d.f30149b.length), "key", strL);
                }
            }
        } catch (Exception e10) {
            ALog.w(g.f30304o, "[onDataReceive] error.", this.f30338c.f30306b.f30341c, e10, new Object[0]);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        String strValueOf;
        DefaultFinishEvent defaultFinishEvent;
        if (this.f30338c.f30313i.getAndSet(true)) {
            return;
        }
        int i11 = 3;
        if (ALog.isPrintLog(2)) {
            ALog.i(g.f30304o, "[onFinish]", this.f30338c.f30306b.f30341c, "code", Integer.valueOf(i10), "msg", str);
        }
        if (i10 < 0) {
            try {
                if (this.f30338c.f30306b.f30339a.i()) {
                    g gVar = this.f30338c;
                    if (!gVar.f30316l && !gVar.f30317m) {
                        ALog.e(g.f30304o, "clear response buffer and retry", gVar.f30306b.f30341c, new Object[0]);
                        g.a aVar = this.f30338c.f30318n;
                        if (aVar != null) {
                            if (!aVar.f30321c.isEmpty()) {
                                i11 = 4;
                            }
                            requestStatistic.roaming = i11;
                            this.f30338c.f30318n.b();
                            this.f30338c.f30318n = null;
                        }
                        if (this.f30338c.f30306b.f30339a.f30243e == 0) {
                            requestStatistic.firstProtocol = requestStatistic.protocolType;
                            requestStatistic.firstErrorCode = requestStatistic.tnetErrorCode != 0 ? requestStatistic.tnetErrorCode : i10;
                        }
                        this.f30338c.f30306b.f30339a.p();
                        this.f30338c.f30306b.f30342d = new AtomicBoolean();
                        g gVar2 = this.f30338c;
                        l lVar = gVar2.f30306b;
                        lVar.f30343e = new g(lVar, gVar2.f30307c, gVar2.f30308d);
                        if (requestStatistic.tnetErrorCode != 0) {
                            strValueOf = i10 + "|" + requestStatistic.protocolType + "|" + requestStatistic.tnetErrorCode;
                            requestStatistic.tnetErrorCode = 0;
                        } else {
                            strValueOf = String.valueOf(i10);
                        }
                        requestStatistic.appendErrorTrace(strValueOf);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        requestStatistic.retryCostTime += jCurrentTimeMillis - requestStatistic.start;
                        requestStatistic.start = jCurrentTimeMillis;
                        ThreadPoolExecutorFactory.submitPriorityTask(this.f30338c.f30306b.f30343e, ThreadPoolExecutorFactory.Priority.HIGH);
                        return;
                    }
                    requestStatistic.msg += ":回调后触发重试";
                    g gVar3 = this.f30338c;
                    if (gVar3.f30317m) {
                        requestStatistic.roaming = 2;
                    } else if (gVar3.f30316l) {
                        requestStatistic.roaming = 1;
                    }
                    ALog.e(g.f30304o, "Cannot retry request after onHeader/onDataReceived callback!", gVar3.f30306b.f30341c, new Object[0]);
                }
            } catch (Exception unused) {
                return;
            }
        }
        g gVar4 = this.f30338c;
        g.a aVar2 = gVar4.f30318n;
        if (aVar2 != null) {
            aVar2.a(gVar4.f30306b.f30340b, gVar4.f30314j);
        }
        this.f30338c.f30306b.a();
        requestStatistic.isDone.set(true);
        if (this.f30338c.f30306b.f30339a.o() && requestStatistic.contentLength != 0 && requestStatistic.contentLength != requestStatistic.rspBodyDeflateSize) {
            requestStatistic.ret = 0;
            requestStatistic.statusCode = -206;
            str = ErrorConstant.getErrMsg(-206);
            requestStatistic.msg = str;
            g gVar5 = this.f30338c;
            ALog.e(g.f30304o, "received data length not match with content-length", gVar5.f30306b.f30341c, com.alipay.zoloz.android.phone.mrpc.core.f.f39659n, Integer.valueOf(gVar5.f30314j), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
            ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-206, str, "rt");
            exceptionStatistic.url = this.f30338c.f30306b.f30339a.l();
            AppMonitor.getInstance().commitStat(exceptionStatistic);
            i10 = -206;
        }
        if (i10 != 304 || this.f30338c.f30308d == null) {
            defaultFinishEvent = new DefaultFinishEvent(i10, str, this.f30336a);
        } else {
            requestStatistic.protocolType = "cache";
            defaultFinishEvent = new DefaultFinishEvent(200, str, this.f30336a);
        }
        this.f30338c.f30306b.f30340b.b(defaultFinishEvent);
        if (i10 >= 0) {
            anet.channel.monitor.b.a().a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize);
        } else {
            requestStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        }
        NetworkAnalysis.getInstance().commitFlow(new FlowStat(this.f30338c.f30310f, requestStatistic));
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        String singleHeaderFieldByKey;
        if (this.f30338c.f30313i.get()) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(g.f30304o, "onResponseCode", this.f30336a.getSeq(), "code", Integer.valueOf(i10));
            ALog.i(g.f30304o, "onResponseCode", this.f30336a.getSeq(), "headers", map);
        }
        if (HttpHelper.checkRedirect(this.f30336a, i10) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location")) != null) {
            HttpUrl httpUrl = HttpUrl.parse(singleHeaderFieldByKey);
            if (httpUrl != null) {
                if (this.f30338c.f30313i.compareAndSet(false, true)) {
                    httpUrl.lockScheme();
                    this.f30338c.f30306b.f30339a.d(httpUrl);
                    this.f30338c.f30306b.f30342d = new AtomicBoolean();
                    l lVar = this.f30338c.f30306b;
                    lVar.f30343e = new g(lVar, null, null);
                    this.f30337b.recordRedirect(i10, httpUrl.simpleUrlString());
                    this.f30337b.locationUrl = singleHeaderFieldByKey;
                    ThreadPoolExecutorFactory.submitPriorityTask(this.f30338c.f30306b.f30343e, ThreadPoolExecutorFactory.Priority.HIGH);
                    return;
                }
                return;
            }
            ALog.e(g.f30304o, "redirect url is invalid!", this.f30336a.getSeq(), "redirect url", singleHeaderFieldByKey);
        }
        try {
            this.f30338c.f30306b.a();
            anetwork.channel.cookie.a.l(this.f30338c.f30306b.f30339a.l(), map);
            this.f30338c.f30314j = HttpHelper.parseContentLength(map);
            String strL = this.f30338c.f30306b.f30339a.l();
            g gVar = this.f30338c;
            Cache.Entry entry = gVar.f30308d;
            if (entry != null && i10 == 304) {
                entry.f30154g.putAll(map);
                Cache.Entry entryB = anetwork.channel.cache.c.b(map);
                if (entryB != null) {
                    long j10 = entryB.f30153f;
                    Cache.Entry entry2 = this.f30338c.f30308d;
                    if (j10 > entry2.f30153f) {
                        entry2.f30153f = j10;
                    }
                }
                g gVar2 = this.f30338c;
                gVar2.f30306b.f30340b.onResponseCode(200, gVar2.f30308d.f30154g);
                g gVar3 = this.f30338c;
                v3.a aVar = gVar3.f30306b.f30340b;
                byte[] bArr = gVar3.f30308d.f30149b;
                aVar.a(1, bArr.length, ByteArray.wrap(bArr));
                long jCurrentTimeMillis = System.currentTimeMillis();
                g gVar4 = this.f30338c;
                gVar4.f30307c.put(strL, gVar4.f30308d);
                ALog.i(g.f30304o, "update cache", this.f30338c.f30306b.f30341c, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "key", strL);
                return;
            }
            if (gVar.f30307c != null) {
                if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control"))) {
                    this.f30338c.f30307c.remove(strL);
                } else {
                    g gVar5 = this.f30338c;
                    Cache.Entry entryB2 = anetwork.channel.cache.c.b(map);
                    gVar5.f30308d = entryB2;
                    if (entryB2 != null) {
                        HttpHelper.removeHeaderFiledByKey(map, "Cache-Control");
                        map.put("Cache-Control", Arrays.asList("no-store"));
                        g gVar6 = this.f30338c;
                        int i11 = this.f30338c.f30314j;
                        if (i11 == 0) {
                            i11 = bb.c.f.Yc;
                        }
                        gVar6.f30309e = new ByteArrayOutputStream(i11);
                    }
                }
            }
            map.put(HttpConstant.X_PROTOCOL, Arrays.asList(this.f30337b.protocolType));
            if (!"open".equalsIgnoreCase(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.STREAMING_PARSER)) && t3.b.s()) {
                g gVar7 = this.f30338c;
                if (gVar7.f30314j <= 131072) {
                    gVar7.f30318n = new g.a(i10, map);
                    return;
                }
            }
            this.f30338c.f30306b.f30340b.onResponseCode(i10, map);
            this.f30338c.f30316l = true;
        } catch (Exception e10) {
            ALog.w(g.f30304o, "[onResponseCode] error.", this.f30338c.f30306b.f30341c, e10, new Object[0]);
        }
    }
}
