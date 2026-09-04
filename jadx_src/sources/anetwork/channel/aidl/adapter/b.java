package anetwork.channel.aidl.adapter;

import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b extends anetwork.channel.aidl.d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30076f = "anet.ParcelableBodyHandlerWrapper";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s3.b f30077e;

    public b(s3.b bVar) {
        this.f30077e = bVar;
    }

    @Override // anetwork.channel.aidl.d
    public int read(byte[] bArr) throws RemoteException {
        s3.b bVar = this.f30077e;
        if (bVar != null) {
            return bVar.read(bArr);
        }
        return 0;
    }

    public String toString() {
        return super.toString() + " handle:" + this.f30077e;
    }

    @Override // anetwork.channel.aidl.d
    public boolean x() throws RemoteException {
        s3.b bVar = this.f30077e;
        if (bVar != null) {
            return bVar.x();
        }
        return true;
    }
}
