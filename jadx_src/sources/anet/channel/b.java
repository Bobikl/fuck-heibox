package anet.channel;

import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f29611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ anet.channel.entity.b f29612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Session f29613c;

    b(Session session, int i10, anet.channel.entity.b bVar) {
        this.f29613c = session;
        this.f29611a = i10;
        this.f29612b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Map<EventCb, Integer> map = this.f29613c.f29541b;
            if (map != null) {
                for (EventCb eventCb : map.keySet()) {
                    if (eventCb != null) {
                        int iIntValue = this.f29613c.f29541b.get(eventCb).intValue();
                        int i10 = this.f29611a;
                        if ((iIntValue & i10) != 0) {
                            try {
                                eventCb.onEvent(this.f29613c, i10, this.f29612b);
                            } catch (Exception e10) {
                                ALog.e("awcn.Session", e10.toString(), this.f29613c.f29555p, new Object[0]);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            ALog.e("awcn.Session", "handleCallbacks", this.f29613c.f29555p, e11, new Object[0]);
        }
    }
}
