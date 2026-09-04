package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.HttpUrl;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SessionCenter f30323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HttpUrl f30324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RequestStatistic f30325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HttpUrl f30326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f30327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ g f30328g;

    i(g gVar, SessionCenter sessionCenter, HttpUrl httpUrl, RequestStatistic requestStatistic, HttpUrl httpUrl2, boolean z10) {
        this.f30328g = gVar;
        this.f30323b = sessionCenter;
        this.f30324c = httpUrl;
        this.f30325d = requestStatistic;
        this.f30326e = httpUrl2;
        this.f30327f = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Session session = this.f30323b.get(this.f30324c, anet.channel.entity.c.f29700a, 3000L);
        this.f30325d.connWaitTime = System.currentTimeMillis() - jCurrentTimeMillis;
        this.f30325d.spdyRequestSend = session != null;
        Session sessionA = this.f30328g.a(session, this.f30323b, this.f30326e, this.f30327f);
        g gVar = this.f30328g;
        gVar.f(sessionA, gVar.f30306b.f30339a.a());
    }
}
