package anetwork.channel.aidl;

import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c extends b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ NetworkService f30117d;

    c(NetworkService networkService) {
        this.f30117d = networkService;
    }

    @Override // anetwork.channel.aidl.b
    public h get(int i10) throws RemoteException {
        return i10 == 1 ? this.f30117d.f30039c : this.f30117d.f30040d;
    }
}
