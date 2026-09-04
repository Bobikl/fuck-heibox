package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements IHeartbeat, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Session f29723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f29724b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f29725c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f29726d = 0;

    b() {
    }

    private void a(long j10) {
        try {
            this.f29724b = System.currentTimeMillis() + j10;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j10 + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f29723a.f29555p, e10, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f29724b = System.currentTimeMillis() + this.f29726d;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f29725c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f29724b - 1000) {
            a(this.f29724b - jCurrentTimeMillis);
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            Session session = this.f29723a;
            ALog.e("awcn.DefaultHeartbeatImpl", "close session in background", session.f29555p, d.aw, session);
            this.f29723a.close(false);
        } else {
            if (ALog.isPrintLog(1)) {
                Session session2 = this.f29723a;
                ALog.d("awcn.DefaultHeartbeatImpl", "heartbeat", session2.f29555p, d.aw, session2);
            }
            this.f29723a.ping(true);
            a(this.f29726d);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session == null) {
            throw new NullPointerException("session is null");
        }
        this.f29723a = session;
        long heartbeat = session.getConnStrategy().getHeartbeat();
        this.f29726d = heartbeat;
        if (heartbeat <= 0) {
            this.f29726d = 45000L;
        }
        ALog.i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f29555p, d.aw, session, ak.aT, Long.valueOf(this.f29726d));
        a(this.f29726d);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f29723a;
        if (session == null) {
            return;
        }
        ALog.i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f29555p, d.aw, session);
        this.f29725c = true;
    }
}
