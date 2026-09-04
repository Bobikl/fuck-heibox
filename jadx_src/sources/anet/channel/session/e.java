package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Request f29836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f29837b;

    e(d dVar, Request request) {
        this.f29837b = dVar;
        this.f29836a = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = b.a(this.f29836a, (RequestCb) null).f29829a;
        if (i10 > 0) {
            this.f29837b.notifyStatus(4, new anet.channel.entity.b(1));
        } else {
            this.f29837b.handleCallbacks(256, new anet.channel.entity.b(256, i10, "Http connect fail"));
        }
    }
}
