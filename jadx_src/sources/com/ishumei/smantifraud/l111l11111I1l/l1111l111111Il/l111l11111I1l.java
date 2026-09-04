package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import u5.a;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111I1l extends l111l1111lI1l {
    private final Context l1111l111111Il;
    private final LinkedBlockingQueue<IBinder> l111l11111lIl = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111I1l.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l111l11111I1l.this.l111l11111lIl.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    l111l11111I1l(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.l1111l111111Il.bindService(intent, this.l111l11111I1l, 1)) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                IBinder iBinderTake = this.l111l11111lIl.take();
                parcelObtain.writeInterfaceToken(a.AbstractBinderC1271a.f140755b);
                iBinderTake.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Exception unused) {
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                this.l1111l111111Il.unbindService(this.l111l11111I1l);
            }
        }
        return "";
    }
}
