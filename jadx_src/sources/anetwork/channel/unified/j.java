package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.google.android.exoplayer2.source.rtsp.q;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class j implements SessionGetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RequestStatistic f30329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f30330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Request f30331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SessionCenter f30332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HttpUrl f30333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f30334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ g f30335g;

    j(g gVar, RequestStatistic requestStatistic, long j10, Request request, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z10) {
        this.f30335g = gVar;
        this.f30329a = requestStatistic;
        this.f30330b = j10;
        this.f30331c = request;
        this.f30332d = sessionCenter;
        this.f30333e = httpUrl;
        this.f30334f = z10;
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetFail() {
        ALog.e(g.f30304o, "onSessionGetFail", this.f30335g.f30306b.f30341c, "url", this.f30329a.url);
        this.f30329a.connWaitTime = System.currentTimeMillis() - this.f30330b;
        g gVar = this.f30335g;
        gVar.f(gVar.a(null, this.f30332d, this.f30333e, this.f30334f), this.f30331c);
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetSuccess(Session session) {
        ALog.i(g.f30304o, "onSessionGetSuccess", this.f30335g.f30306b.f30341c, q.f48929z, session);
        this.f30329a.connWaitTime = System.currentTimeMillis() - this.f30330b;
        this.f30329a.spdyRequestSend = true;
        this.f30335g.f(session, this.f30331c);
    }
}
