package r4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class b implements p4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f138783a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f138784b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f138785c = 2;

    /* JADX INFO: renamed from: r4.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC1260b implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f138786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f138787c;

        public ServiceConnectionC1260b() {
            this.f138786b = false;
            this.f138787c = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.f138786b) {
                throw new IllegalStateException();
            }
            this.f138786b = true;
            return this.f138787c.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f138787c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class c implements IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IBinder f138788b;

        public c(IBinder iBinder) {
            this.f138788b = iBinder;
        }

        public boolean N() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(b.f138783a);
                this.f138788b.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f138788b;
        }

        public String d() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(b.f138783a);
                this.f138788b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // p4.b
    public String a(Context context) {
        ServiceConnectionC1260b serviceConnectionC1260b = new ServiceConnectionC1260b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC1260b, 1)) {
            try {
                return new c(serviceConnectionC1260b.a()).d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC1260b);
            }
        }
        return null;
    }
}
