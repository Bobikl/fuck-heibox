package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class l1111l111111Il extends l111l1111lI1l {
    private Context l1111l111111Il;
    private final LinkedBlockingQueue<IBinder> l111l11111lIl = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l1111l111111Il.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l1111l111111Il.this.l111l11111lIl.put(iBinder);
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    l1111l111111Il(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        String string = "";
        if (this.l1111l111111Il.bindService(intent, this.l111l11111I1l, 1)) {
            try {
                IBinder iBinderTake = this.l111l11111lIl.take();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    iBinderTake.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    this.l1111l111111Il.unbindService(this.l111l11111I1l);
                } catch (Throwable unused) {
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Exception unused2) {
            }
        }
        return string;
    }
}
