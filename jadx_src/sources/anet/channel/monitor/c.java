package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f29753a;

    c(b bVar) {
        this.f29753a = bVar;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f29753a.f29751n.a();
        b.f29743f = 0L;
        this.f29753a.d();
    }
}
