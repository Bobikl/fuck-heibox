package anet.channel;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements Runnable {
    j() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            anet.channel.b.a aVar = new anet.channel.b.a();
            aVar.a();
            anetwork.channel.cache.a.a(aVar, new k(this), 1);
        } catch (Exception unused) {
        }
    }
}
