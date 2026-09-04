package anet.channel.e;

import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.EventCb;
import anet.channel.statist.Http3DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements EventCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IConnStrategy f29689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f29690b;

    f(e eVar, IConnStrategy iConnStrategy) {
        this.f29690b = eVar;
        this.f29689a = iConnStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, anet.channel.entity.b bVar) {
        ?? r10 = i10 != 1 ? 0 : 1;
        a.f29674a.a(NetworkStatusHelper.getUniqueId(this.f29690b.f29688b), r10);
        session.close(false);
        Http3DetectStat http3DetectStat = new Http3DetectStat(a.f29675b, this.f29689a);
        http3DetectStat.ret = r10;
        AppMonitor.getInstance().commitStat(http3DetectStat);
    }
}
