package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import i5.a;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l1111I11l extends l111l1111lI1l {
    public final LinkedBlockingQueue<IBinder> l1111l111111Il = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I11l.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l11l1111I11l.this.l1111l111111Il.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private Context l111l11111lIl;

    l11l1111I11l(Context context) {
        this.l111l11111lIl = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Context context;
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        String string = "";
        if (!this.l111l11111lIl.bindService(intent, this.l111l11111I1l, 1)) {
            return "";
        }
        try {
            IBinder iBinderTake = this.l1111l111111Il.take();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(a.AbstractBinderC1085a.f119222b);
                iBinderTake.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                context = this.l111l11111lIl;
            } catch (Throwable unused) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                context = this.l111l11111lIl;
            }
            context.unbindService(this.l111l11111I1l);
        } catch (InterruptedException unused2) {
        }
        return string;
    }
}
