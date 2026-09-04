package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.MtuDetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, Long> f29662a = new HashMap<>();

    k() {
    }

    private void a(int i10, Future<PingResponse> future) {
        PingResponse pingResponse;
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return;
        }
        int successCnt = pingResponse.getSuccessCnt();
        int i11 = 3 - successCnt;
        StringBuilder sb2 = new StringBuilder();
        PingEntry[] results = pingResponse.getResults();
        int length = results.length;
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append(results[i12].rtt);
            if (i12 != length - 1) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        ALog.i("anet.MTUDetector", "MTU detect result", null, "mtu", Integer.valueOf(i10), "successCount", Integer.valueOf(successCnt), "timeoutCount", Integer.valueOf(i11));
        MtuDetectStat mtuDetectStat = new MtuDetectStat();
        mtuDetectStat.mtu = i10;
        mtuDetectStat.pingSuccessCount = successCnt;
        mtuDetectStat.pingTimeoutCount = i11;
        mtuDetectStat.rtt = sb2.toString();
        mtuDetectStat.errCode = pingResponse.getErrcode();
        AppMonitor.getInstance().commitStat(mtuDetectStat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        PingResponse pingResponse;
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.i("anet.MTUDetector", "network detect closed.", null, new Object[0]);
            return;
        }
        ALog.i("anet.MTUDetector", "mtuDetectTask start", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l10 = f29662a.get(str);
        if (l10 == null || jCurrentTimeMillis >= l10.longValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            long j10 = defaultSharedPreferences.getLong("sp_mtu_" + str, 0L);
            if (jCurrentTimeMillis < j10) {
                f29662a.put(str, Long.valueOf(j10));
                ALog.i("anet.MTUDetector", "mtuDetectTask in period of validity", null, new Object[0]);
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost("guide-acs.m.taobao.com");
            String ip = (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) ? null : connStrategyListByHost.get(0).getIp();
            if (TextUtils.isEmpty(ip)) {
                return;
            }
            String str2 = ip;
            Future futureLaunch = new PingTask(str2, 1000, 3, 0, 0).launch();
            Future<PingResponse> futureLaunch2 = new PingTask(str2, 1000, 3, bb.c.b.Cj, 0).launch();
            Future<PingResponse> futureLaunch3 = new PingTask(str2, 1000, 3, bb.c.b.yl, 0).launch();
            Future<PingResponse> futureLaunch4 = new PingTask(str2, 1000, 3, bb.c.b.un, 0).launch();
            Future<PingResponse> futureLaunch5 = new PingTask(str2, 1000, 3, bb.c.b.Co, 0).launch();
            try {
                pingResponse = (PingResponse) futureLaunch.get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            if (pingResponse == null) {
                return;
            }
            if (pingResponse.getSuccessCnt() < 2) {
                ALog.e("anet.MTUDetector", "MTU detect preTask error", null, i7.a.i.f119320o, Integer.valueOf(pingResponse.getErrcode()), "successCount", Integer.valueOf(pingResponse.getSuccessCnt()));
                return;
            }
            a(1200, futureLaunch2);
            a(1300, futureLaunch3);
            a(bb.c.b.Wn, futureLaunch4);
            a(bb.c.b.ep, futureLaunch5);
            long j11 = jCurrentTimeMillis + com.max.heybox.hblog.f.f74520m;
            f29662a.put(str, Long.valueOf(j11));
            defaultSharedPreferences.edit().putLong("sp_mtu_" + str, j11).apply();
        }
    }

    public void a() {
        NetworkStatusHelper.addStatusChangeListener(new l(this));
    }
}
