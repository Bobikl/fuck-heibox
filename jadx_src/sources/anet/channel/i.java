package anet.channel;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Session f29730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SessionRequest.a f29731b;

    i(SessionRequest.a aVar, Session session) {
        this.f29731b = aVar;
        this.f29730a = session;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            SessionRequest.a aVar = this.f29731b;
            SessionRequest.this.a(aVar.f29592c, this.f29730a.getConnType().getType(), anet.channel.util.i.a(SessionRequest.this.f29578a.f29569c), (SessionGetCallback) null, 0L);
        } catch (Exception unused) {
        }
    }
}
