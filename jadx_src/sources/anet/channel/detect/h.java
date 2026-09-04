package anet.channel.detect;

import anet.channel.Session;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements EventCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HorseRaceStat f29653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f29654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f29655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ anet.channel.strategy.l.e f29656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f29657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f29658f;

    h(d dVar, HorseRaceStat horseRaceStat, long j10, String str, anet.channel.strategy.l.e eVar, TnetSpdySession tnetSpdySession) {
        this.f29658f = dVar;
        this.f29653a = horseRaceStat;
        this.f29654b = j10;
        this.f29655c = str;
        this.f29656d = eVar;
        this.f29657e = tnetSpdySession;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, anet.channel.entity.b bVar) {
        if (this.f29653a.connTime != 0) {
            return;
        }
        this.f29653a.connTime = System.currentTimeMillis() - this.f29654b;
        if (i10 != 1) {
            this.f29653a.connErrorCode = bVar.f29698b;
            synchronized (this.f29653a) {
                this.f29653a.notify();
            }
            return;
        }
        ALog.i("anet.HorseRaceDetector", "tnetSpdySession connect success", this.f29655c, new Object[0]);
        this.f29653a.connRet = 1;
        HttpUrl httpUrl = HttpUrl.parse(session.getHost() + this.f29656d.f29976c);
        if (httpUrl == null) {
            return;
        }
        this.f29657e.request(new Request.Builder().setUrl(httpUrl).setReadTimeout(this.f29656d.f29975b.f29947d).setRedirectEnable(false).setSeq(this.f29655c).build(), new i(this));
    }
}
