package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements IAuth.AuthCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f29844a;

    i(TnetSpdySession tnetSpdySession) {
        this.f29844a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i10, String str) {
        this.f29844a.notifyStatus(5, null);
        SessionStatistic sessionStatistic = this.f29844a.f29556q;
        if (sessionStatistic != null) {
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i10;
            this.f29844a.f29556q.errorCode = (long) i10;
        }
        this.f29844a.close();
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f29844a.notifyStatus(4, null);
        this.f29844a.f29823z = System.currentTimeMillis();
        TnetSpdySession tnetSpdySession = this.f29844a;
        IHeartbeat iHeartbeat = tnetSpdySession.D;
        if (iHeartbeat != null) {
            iHeartbeat.start(tnetSpdySession);
        }
        TnetSpdySession tnetSpdySession2 = this.f29844a;
        SessionStatistic sessionStatistic = tnetSpdySession2.f29556q;
        sessionStatistic.ret = 1;
        ALog.d("awcn.TnetSpdySession", "spdyOnStreamResponse", tnetSpdySession2.f29555p, "authTime", Long.valueOf(sessionStatistic.authTime));
        TnetSpdySession tnetSpdySession3 = this.f29844a;
        if (tnetSpdySession3.A > 0) {
            tnetSpdySession3.f29556q.authTime = System.currentTimeMillis() - this.f29844a.A;
        }
    }
}
