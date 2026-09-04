package anet.channel;

import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import com.google.android.exoplayer2.source.rtsp.q;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements EventCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SessionRequest.IConnCb f29703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f29704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SessionRequest f29705c;

    f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j10) {
        this.f29705c = sessionRequest;
        this.f29703a = iConnCb;
        this.f29704b = j10;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, anet.channel.entity.b bVar) {
        if (session == null) {
            return;
        }
        int i11 = bVar == null ? 0 : bVar.f29698b;
        String str = bVar == null ? "" : bVar.f29699c;
        if (i10 == 2) {
            ALog.d("awcn.SessionRequest", null, session.f29555p, q.f48929z, session, "EventType", Integer.valueOf(i10), "Event", bVar);
            this.f29705c.a(session, i11, str);
            SessionRequest sessionRequest = this.f29705c;
            if (sessionRequest.f29579b.c(sessionRequest, session)) {
                this.f29703a.onDisConnect(session, this.f29704b, i10);
                return;
            } else {
                this.f29703a.onFailed(session, this.f29704b, i10, i11);
                return;
            }
        }
        if (i10 == 256) {
            ALog.d("awcn.SessionRequest", null, session.f29555p, q.f48929z, session, "EventType", Integer.valueOf(i10), "Event", bVar);
            this.f29703a.onFailed(session, this.f29704b, i10, i11);
        } else {
            if (i10 != 512) {
                return;
            }
            ALog.d("awcn.SessionRequest", null, session.f29555p, q.f48929z, session, "EventType", Integer.valueOf(i10), "Event", bVar);
            this.f29705c.a(session, 0, (String) null);
            this.f29703a.onSuccess(session, this.f29704b);
        }
    }
}
