package anetwork.channel.aidl.adapter;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte f30105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f30106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f30107d;

    h(e eVar, byte b10, Object obj) {
        this.f30107d = eVar;
        this.f30105b = b10;
        this.f30106c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30107d.f1(this.f30105b, this.f30106c);
    }
}
