package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TreeMap<String, anet.channel.strategy.l.c> f29648a = new TreeMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f29649b = new AtomicInteger(1);

    d() {
    }

    private static IConnStrategy a(ConnProtocol connProtocol, anet.channel.strategy.l.e eVar) {
        return new j(eVar, connProtocol);
    }

    private void a(anet.channel.strategy.l.c cVar) {
        anet.channel.strategy.l.e[] eVarArr = cVar.f29965b;
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        String str = cVar.f29964a;
        int i10 = 0;
        while (true) {
            anet.channel.strategy.l.e[] eVarArr2 = cVar.f29965b;
            if (i10 >= eVarArr2.length) {
                return;
            }
            anet.channel.strategy.l.e eVar = eVarArr2[i10];
            String str2 = eVar.f29975b.f29945b;
            if (str2.equalsIgnoreCase("http") || str2.equalsIgnoreCase("https")) {
                a(str, eVar);
            } else if (str2.equalsIgnoreCase(ConnType.HTTP2) || str2.equalsIgnoreCase(ConnType.SPDY) || str2.equalsIgnoreCase(ConnType.QUIC)) {
                b(str, eVar);
            } else if (str2.equalsIgnoreCase("tcp")) {
                c(str, eVar);
            }
            i10++;
        }
    }

    private void a(String str, HorseRaceStat horseRaceStat) {
        if (AwcnConfig.isPing6Enable() && anet.channel.strategy.utils.c.b(str)) {
            try {
                PingResponse pingResponse = (PingResponse) new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.getSuccessCnt();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.getLocalIPStr();
            } catch (Throwable th2) {
                ALog.e("anet.HorseRaceDetector", "ping6 task fail.", null, th2, new Object[0]);
            }
        }
    }

    private void a(String str, anet.channel.strategy.l.e eVar) {
        HttpUrl httpUrl = HttpUrl.parse(eVar.f29975b.f29945b + HttpConstant.SCHEME_SPLIT + str + eVar.f29976c);
        if (httpUrl == null) {
            return;
        }
        ALog.i("anet.HorseRaceDetector", "startShortLinkTask", null, "url", httpUrl);
        Request requestBuild = new Request.Builder().setUrl(httpUrl).addHeader("Connection", "close").setConnectTimeout(eVar.f29975b.f29946c).setReadTimeout(eVar.f29975b.f29947d).setRedirectEnable(false).setSslSocketFactory(new anet.channel.util.j(str)).setSeq("HR" + this.f29649b.getAndIncrement()).build();
        requestBuild.setDnsOptimize(eVar.f29974a, eVar.f29975b.f29944a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        anet.channel.session.b.a aVarA = anet.channel.session.b.a(requestBuild, (RequestCb) null);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        horseRaceStat.connTime = jCurrentTimeMillis2;
        int i10 = aVarA.f29829a;
        if (i10 <= 0) {
            horseRaceStat.connErrorCode = i10;
        } else {
            horseRaceStat.connRet = 1;
            horseRaceStat.reqRet = aVarA.f29829a == 200 ? 1 : 0;
            horseRaceStat.reqErrorCode = aVarA.f29829a;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        a(eVar.f29974a, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    private void b(String str, anet.channel.strategy.l.e eVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(eVar.f29975b);
        ConnType connTypeValueOf = ConnType.valueOf(connProtocolValueOf);
        if (connTypeValueOf == null) {
            return;
        }
        ALog.i("anet.HorseRaceDetector", "startLongLinkTask", null, "host", str, "ip", eVar.f29974a, HeyboxMicFragment.f93763y, Integer.valueOf(eVar.f29975b.f29944a), SwitchDetailActivity.P, connProtocolValueOf);
        String str2 = "HR" + this.f29649b.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(connTypeValueOf.isSSL() ? "https://" : "http://");
        sb2.append(str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new anet.channel.entity.a(sb2.toString(), str2, a(connProtocolValueOf, eVar)));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new h(this, horseRaceStat, jCurrentTimeMillis, str2, eVar, tnetSpdySession));
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                int i10 = eVar.f29975b.f29946c;
                if (i10 == 0) {
                    i10 = 10000;
                }
                horseRaceStat.wait(i10);
                if (horseRaceStat.connTime == 0) {
                    horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
                }
                a(eVar.f29974a, horseRaceStat);
                AppMonitor.getInstance().commitStat(horseRaceStat);
            } catch (InterruptedException unused) {
            }
        }
        tnetSpdySession.close(false);
    }

    private void c(String str, anet.channel.strategy.l.e eVar) {
        String str2 = "HR" + this.f29649b.getAndIncrement();
        ALog.i("anet.HorseRaceDetector", "startTcpTask", str2, "ip", eVar.f29974a, HeyboxMicFragment.f93763y, Integer.valueOf(eVar.f29975b.f29944a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f29974a, eVar.f29975b.f29944a);
            int i10 = eVar.f29975b.f29946c;
            if (i10 == 0) {
                i10 = 10000;
            }
            socket.setSoTimeout(i10);
            ALog.i("anet.HorseRaceDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
            horseRaceStat.connErrorCode = -404;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    void a() {
        ALog.e("anet.HorseRaceDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.f29648a) {
                if (!AwcnConfig.isHorseRaceEnable()) {
                    this.f29648a.clear();
                    return;
                }
                Map.Entry<String, anet.channel.strategy.l.c> entryPollFirstEntry = this.f29648a.pollFirstEntry();
                if (entryPollFirstEntry == null) {
                    return;
                }
                try {
                    a(entryPollFirstEntry.getValue());
                } catch (Exception e10) {
                    ALog.e("anet.HorseRaceDetector", "start hr task failed", null, e10, new Object[0]);
                }
            }
        }
    }

    public void b() {
        StrategyCenter.getInstance().registerListener(new e(this));
        AppLifecycle.registerLifecycleListener(new f(this));
    }
}
