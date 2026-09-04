package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultProgressEvent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f30231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ByteArray f30232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f30233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ anetwork.channel.aidl.g f30234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f30235f;

    i(g gVar, int i10, ByteArray byteArray, int i11, anetwork.channel.aidl.g gVar2) {
        this.f30235f = gVar;
        this.f30231b = i10;
        this.f30232c = byteArray;
        this.f30233d = i11;
        this.f30234e = gVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f30235f.f30225d) {
                try {
                    if (this.f30235f.f30224c == null) {
                        this.f30235f.f30224c = new anetwork.channel.aidl.adapter.d();
                        this.f30235f.f30224c.N(this.f30235f.f30226e, this.f30233d);
                        this.f30235f.f30224c.f1(this.f30232c);
                        this.f30234e.j(this.f30235f.f30224c);
                    } else {
                        this.f30235f.f30224c.f1(this.f30232c);
                    }
                } catch (Exception unused) {
                    if (this.f30235f.f30224c == null) {
                    } else {
                        this.f30235f.f30224c.close();
                    }
                }
            } else {
                this.f30234e.Q(new DefaultProgressEvent(this.f30231b, this.f30232c.getDataLength(), this.f30233d, this.f30232c.getBuffer()));
            }
        } catch (RemoteException unused2) {
        }
    }
}
