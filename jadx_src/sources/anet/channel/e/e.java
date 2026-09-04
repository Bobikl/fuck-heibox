package anet.channel.e;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import java.util.List;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f29687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f29688b;

    e(List list, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f29687a = list;
        this.f29688b = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        IConnStrategy iConnStrategy = (IConnStrategy) this.f29687a.get(0);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new anet.channel.entity.a("https://" + a.f29675b, "Http3Detect" + a.f29681h.getAndIncrement(), a.b(iConnStrategy)));
        tnetSpdySession.registerEventcb(257, new f(this, iConnStrategy));
        tnetSpdySession.f29556q.isCommitted = true;
        tnetSpdySession.connect();
    }
}
