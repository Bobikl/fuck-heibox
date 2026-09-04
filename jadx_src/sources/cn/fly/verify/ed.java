package cn.fly.verify;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public class ed extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f36240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f36241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f36242c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36243d;

    public ed() {
        String strA = bq.a("043dPelegem@i_ejKi(el.f7elekemBdhQelehedgjOgDekeeej[dgPemel!e4ejedemffhigeffgmfe1ehh*gk0ed(fi");
        this.f36243d = strA;
        attachInterface(this, strA);
    }

    public ed a(CountDownLatch countDownLatch) {
        this.f36240a = countDownLatch;
        return this;
    }

    public String a() {
        return this.f36241b;
    }

    public void a(int i10, long j10, boolean z10, float f10, double d10, String str) {
    }

    public void a(int i10, Bundle bundle) {
        try {
            if (bundle.containsKey(bq.a("010MelEeIeiejedeifgWhe<fk"))) {
                this.f36241b = bundle.getString(bq.a("0102el)e,eiejedeifg!heFfk"));
            } else if (bundle.containsKey(bq.a("017WelFeEeiejedeiXh<ejegejZj6eigj,jejg"))) {
                this.f36242c = bundle.getBoolean(bq.a("017;elLe3eiejedei]h%ejegej@jKeigj@jejg"));
            }
            CountDownLatch countDownLatch = this.f36240a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean b() {
        return this.f36242c;
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.f36243d;
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.enforceInterface(this.f36243d);
            a(parcel.readInt(), parcel.readLong(), parcel.readInt() > 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
        } else {
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(this.f36243d);
                return true;
            }
            parcel.enforceInterface(this.f36243d);
            a(parcel.readInt(), parcel.readInt() > 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        }
        parcel2.writeNoException();
        return true;
    }
}
