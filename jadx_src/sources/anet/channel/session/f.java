package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Request f29838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ RequestCb f29839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RequestStatistic f29840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f29841d;

    f(d dVar, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f29841d = dVar;
        this.f29838a = request;
        this.f29839b = requestCb;
        this.f29840c = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29838a.f29773a.sendBeforeTime = System.currentTimeMillis() - this.f29838a.f29773a.reqStart;
        b.a(this.f29838a, new g(this));
    }
}
