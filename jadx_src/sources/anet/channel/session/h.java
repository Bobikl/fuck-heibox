package anet.channel.session;

import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f29843a;

    h(TnetSpdySession tnetSpdySession) {
        this.f29843a = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f29843a.f29822y) {
            TnetSpdySession tnetSpdySession = this.f29843a;
            ALog.e("awcn.TnetSpdySession", "send msg time out!", tnetSpdySession.f29555p, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.f29822y));
            try {
                this.f29843a.handleCallbacks(2048, null);
                SessionStatistic sessionStatistic = this.f29843a.f29556q;
                if (sessionStatistic != null) {
                    sessionStatistic.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                connEvent.isAccs = this.f29843a.I;
                StrategyCenter.getInstance().notifyConnEvent(this.f29843a.f29543d, this.f29843a.f29550k, connEvent);
                this.f29843a.close(true);
            } catch (Exception unused) {
            }
        }
    }
}
