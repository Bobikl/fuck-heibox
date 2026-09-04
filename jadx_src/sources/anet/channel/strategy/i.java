package anet.channel.strategy;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f29938a;

    i(g gVar) {
        this.f29938a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f29938a.a()) {
            return;
        }
        this.f29938a.f29933b.c();
    }
}
