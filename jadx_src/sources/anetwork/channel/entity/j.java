package anetwork.channel.entity;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.n;
import anet.channel.statist.RequestMonitor;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ DefaultFinishEvent f30236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ anetwork.channel.aidl.g f30237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f30238d;

    j(g gVar, DefaultFinishEvent defaultFinishEvent, anetwork.channel.aidl.g gVar2) {
        this.f30238d = gVar;
        this.f30236b = defaultFinishEvent;
        this.f30237c = gVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        DefaultFinishEvent defaultFinishEvent = this.f30236b;
        String strOptString = null;
        if (defaultFinishEvent != null) {
            defaultFinishEvent.d(null);
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RequestStatistic requestStatistic = this.f30236b.f30025f;
            if (requestStatistic != null) {
                requestStatistic.rspCbStart = jCurrentTimeMillis;
                requestStatistic.lastProcessTime = jCurrentTimeMillis - requestStatistic.rspEnd;
                requestStatistic.oneWayTime = requestStatistic.retryCostTime + (jCurrentTimeMillis - requestStatistic.start);
                this.f30236b.z().a(requestStatistic);
            }
            this.f30237c.x0(this.f30236b);
            if (requestStatistic != null) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.rspCbEnd = jCurrentTimeMillis2;
                requestStatistic.callbackTime = jCurrentTimeMillis2 - jCurrentTimeMillis;
                anet.channel.fulltrace.a.a().commitRequest(requestStatistic.traceId, requestStatistic);
            }
            if (this.f30238d.f30224c != null) {
                this.f30238d.f30224c.q1();
            }
            if (requestStatistic != null) {
                ALog.e("anet.Repeater", "[traceId:" + requestStatistic.traceId + "]end, " + requestStatistic.toString(), this.f30238d.f30223b, new Object[0]);
                CopyOnWriteArrayList<String> bucketInfo = GlobalAppRuntimeInfo.getBucketInfo();
                if (bucketInfo != null) {
                    int size = bucketInfo.size();
                    for (int i10 = 0; i10 < size - 1; i10 += 2) {
                        requestStatistic.putExtra(bucketInfo.get(i10), bucketInfo.get(i10 + 1));
                    }
                }
                if (GlobalAppRuntimeInfo.isAppBackground()) {
                    requestStatistic.putExtra("restrictBg", Integer.valueOf(NetworkStatusHelper.getRestrictBackgroundStatus()));
                }
                anet.channel.fulltrace.b sceneInfo = anet.channel.fulltrace.a.a().getSceneInfo();
                if (sceneInfo != null) {
                    ALog.i("anet.Repeater", sceneInfo.toString(), this.f30238d.f30223b, new Object[0]);
                    long j10 = requestStatistic.start;
                    long j11 = sceneInfo.f29711c;
                    requestStatistic.sinceInitTime = j10 - j11;
                    int i11 = sceneInfo.f29709a;
                    requestStatistic.startType = i11;
                    if (i11 != 1) {
                        requestStatistic.sinceLastLaunchTime = j11 - sceneInfo.f29712d;
                    }
                    requestStatistic.deviceLevel = sceneInfo.f29713e;
                    requestStatistic.isFromExternal = sceneInfo.f29710b ? 1 : 0;
                    requestStatistic.speedBucket = sceneInfo.f29714f;
                    requestStatistic.abTestBucket = sceneInfo.f29715g;
                }
                requestStatistic.serializeTransferTime = requestStatistic.reqServiceTransmissionEnd - requestStatistic.netReqStart;
                requestStatistic.userInfo = this.f30238d.f30226e.b(w3.a.f140973i);
                AppMonitor.getInstance().commitStat(requestStatistic);
                if (t3.b.r(requestStatistic)) {
                    AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                }
                try {
                    String str = requestStatistic.ip;
                    JSONObject jSONObject = requestStatistic.extra;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("firstIp");
                    }
                    if (anet.channel.strategy.utils.c.b(str) || anet.channel.strategy.utils.c.b(strOptString)) {
                        AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                    }
                } catch (Exception unused) {
                }
                anetwork.channel.stat.b.a().b(this.f30238d.f30226e.l(), this.f30236b.z());
                n.a(requestStatistic);
            }
        } catch (Throwable unused2) {
        }
    }
}
