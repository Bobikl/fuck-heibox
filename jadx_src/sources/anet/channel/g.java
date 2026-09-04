package anet.channel;

import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements EventCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Session f29716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SessionRequest f29717b;

    g(SessionRequest sessionRequest, Session session) {
        this.f29717b = sessionRequest;
        this.f29716a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, anet.channel.entity.b bVar) {
        ALog.d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i10));
        ConnEvent connEvent = new ConnEvent();
        if (i10 == 512) {
            connEvent.isSuccess = true;
        }
        SessionInfo sessionInfo = this.f29717b.f29580c;
        if (sessionInfo != null) {
            connEvent.isAccs = sessionInfo.isAccs;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f29716a.getRealHost(), this.f29716a.getConnStrategy(), connEvent);
    }
}
