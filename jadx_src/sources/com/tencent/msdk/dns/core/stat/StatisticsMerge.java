package com.tencent.msdk.dns.core.stat;

import android.content.Context;
import android.util.ArrayMap;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.utl.BaseMonitor;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.core.IStatisticsMerge;
import com.tencent.msdk.dns.core.IpSet;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.local.LocalDns;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import com.xiaomi.mipush.sdk.Constants;
import f.b;
import k.g;
import k.k;
import k.m;
import org.json.JSONObject;
import r.e;
import w.c;
import w.d;

/* JADX INFO: loaded from: classes4.dex */
public final class StatisticsMerge implements IStatisticsMerge<e> {
    public IpSet ipSet;
    public final String netType;
    public String hostname = "";
    public String requestHostname = "";
    public String channel = "";
    public int curNetStack = -1;
    public LocalDns.Statistics localDnsStat = LocalDns.Statistics.NOT_LOOKUP;
    public AbsRestDns.Statistics restDnsStat = AbsRestDns.Statistics.NOT_LOOKUP;
    public boolean lookupSuccess = false;
    public boolean lookupFailed = true;
    private boolean hasBeenMerge = false;
    private boolean hasPartCache = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LookupResult f100964a;

        public a(StatisticsMerge statisticsMerge, LookupResult lookupResult) {
            this.f100964a = lookupResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            LookupResult lookupResult = this.f100964a;
            if (lookupResult == null) {
                throw new IllegalArgumentException("lookupResult".concat(" can not be null"));
            }
            Statistics statistics = lookupResult.stat;
            if (!(statistics instanceof StatisticsMerge)) {
                b.g("lookupResult.stat is not instanceof StatisticsMerge", new Object[0]);
                return;
            }
            StatisticsMerge statisticsMerge = (StatisticsMerge) statistics;
            AbsRestDns.Statistics statistics2 = statisticsMerge.restDnsStat;
            if (statistics2.cached) {
                c.a(lookupResult);
            } else if (d.f140916a.useExpiredIpEnable) {
                d.b("HDNSLookupExpiredAsync", lookupResult);
            } else if (statistics2.costTimeMills <= 0 || statisticsMerge.localDnsStat.costTimeMills <= 0) {
                return;
            } else {
                d.b("HDNSGetHostByName", lookupResult);
            }
            ArrayMap arrayMap = new ArrayMap(20);
            arrayMap.put("channel", statisticsMerge.channel);
            arrayMap.put(DispatchConstants.NET_TYPE, statisticsMerge.netType);
            arrayMap.put("domain", statisticsMerge.hostname);
            if (!statisticsMerge.requestHostname.equals(statisticsMerge.hostname)) {
                arrayMap.put("request_domain", statisticsMerge.requestHostname);
            }
            arrayMap.put("net_stack", String.valueOf(statisticsMerge.curNetStack));
            arrayMap.put("ldns_ip", b.a.h(statisticsMerge.localDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP));
            arrayMap.put("ldns_time", String.valueOf(statisticsMerge.localDnsStat.costTimeMills));
            arrayMap.put("isCache", String.valueOf(statisticsMerge.restDnsStat.cached));
            arrayMap.put("hdns_err_code", String.valueOf(statisticsMerge.restDnsStat.errorCode));
            arrayMap.put("hdns_err_msg", statisticsMerge.restDnsStat.errorMsg);
            arrayMap.put("hdns_ip", b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP));
            arrayMap.put(RemoteMessageConst.TTL, String.valueOf(statisticsMerge.restDnsStat.ttl));
            arrayMap.put("clientIP", statisticsMerge.restDnsStat.clientIp);
            arrayMap.put("hdns_time", String.valueOf(statisticsMerge.restDnsStat.costTimeMills));
            arrayMap.put("hdns_retry", String.valueOf(statisticsMerge.restDnsStat.retryTimes));
            arrayMap.put("status_code", String.valueOf(statisticsMerge.restDnsStat.statusCode));
            d.d(arrayMap);
            d.c("HDNSGetHostByName", arrayMap);
        }
    }

    public StatisticsMerge(Context context) {
        if (context == null) {
            throw new IllegalArgumentException(com.umeng.analytics.pro.d.R.concat(" can not be null"));
        }
        this.netType = b.a.b(context);
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
    public boolean lookupFailed() {
        return this.lookupFailed;
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge
    public boolean lookupNeedRetry() {
        return (lookupSuccess() || lookupFailed()) ? false : true;
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
    public boolean lookupPartCached() {
        return this.hasPartCache;
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
    public boolean lookupSuccess() {
        return this.lookupSuccess;
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge
    public <StatisticsT extends g.c> void merge(g gVar, StatisticsT statisticst) {
        if (gVar == null) {
            throw new IllegalArgumentException(BaseMonitor.COUNT_POINT_DNS.concat(" can not be null"));
        }
        if (statisticst == null) {
            throw new IllegalArgumentException("stat".concat(" can not be null"));
        }
        boolean z10 = false;
        b.f("%s.merge(%s, %s) called", super.toString(), gVar, statisticst);
        if (this.hasBeenMerge) {
            this.lookupSuccess = this.lookupSuccess && statisticst.lookupSuccess();
        } else {
            this.lookupSuccess = statisticst.lookupSuccess();
            this.hasBeenMerge = true;
        }
        if (this.lookupFailed && statisticst.lookupFailed()) {
            z10 = true;
        }
        this.lookupFailed = z10;
        this.hasPartCache = statisticst.lookupPartCached();
        if ("Local".equals(gVar.a().f124366a)) {
            this.localDnsStat = (LocalDns.Statistics) statisticst;
        } else {
            this.restDnsStat = (AbsRestDns.Statistics) statisticst;
        }
        DnsExecutors.f100946c.execute(new a(this, new LookupResult(IpSet.EMPTY, this)));
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge
    public void statContext(k<e> kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        m<LookupExtra> mVar = kVar.f124382a;
        this.hostname = mVar.f124394b;
        this.requestHostname = mVar.f124407o;
        this.channel = mVar.f124398f;
        this.curNetStack = kVar.f();
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge
    public void statResult(IpSet ipSet) {
        if (ipSet == null) {
            throw new IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        this.ipSet = ipSet;
    }

    @Override // com.tencent.msdk.dns.core.IStatisticsMerge
    public String toJsonResult() {
        JSONObject jSONObject = new JSONObject();
        try {
            IpSet ipSet = this.ipSet;
            jSONObject.put("v4_ips", ipSet == null ? "" : b.a.h(ipSet.v4Ips, Constants.ACCEPT_TIME_SEPARATOR_SP));
            IpSet ipSet2 = this.ipSet;
            jSONObject.put("v6_ips", ipSet2 == null ? "" : b.a.h(ipSet2.v6Ips, Constants.ACCEPT_TIME_SEPARATOR_SP));
            String str = this.requestHostname;
            if (str == null) {
                str = "";
            }
            jSONObject.put("request_name", str);
            jSONObject.put(RemoteMessageConst.TTL, String.valueOf(this.restDnsStat.ttl));
            jSONObject.put("client_ip", String.valueOf(this.restDnsStat.clientIp));
            jSONObject.put("expired_time", String.valueOf(this.restDnsStat.expiredTime));
            return jSONObject.toString();
        } catch (Exception e10) {
            b.e("exception: %s", e10);
            return "";
        }
    }

    public String toString() {
        return super.toString() + "{netType='" + this.netType + "', hostname='" + this.hostname + "', requestHostname='" + this.requestHostname + "', channel='" + this.channel + "', curNetStack=" + this.curNetStack + ", localDnsStat=" + this.localDnsStat + ", restDnsStat=" + this.restDnsStat + ", ipSet=" + this.ipSet + ", lookupSuccess=" + this.lookupSuccess + ", lookupGetEmptyResponse=" + this.lookupFailed + ", hasBeenMerge=" + this.hasBeenMerge + '}';
    }
}
