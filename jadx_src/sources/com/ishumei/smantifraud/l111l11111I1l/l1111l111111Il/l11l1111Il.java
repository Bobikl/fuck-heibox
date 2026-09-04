package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l1111Il extends l111l1111lI1l {
    private final Context l1111l111111Il;
    private final LinkedBlockingQueue<IBinder> l111l11111lIl = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Il.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l11l1111Il.this.l111l11111lIl.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    l11l1111Il(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", this.l1111l111111Il.getPackageName());
        if (!this.l1111l111111Il.bindService(intent, this.l111l11111I1l, 1)) {
            return "";
        }
        try {
            IBinder iBinderTake = this.l111l11111lIl.take();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                iBinderTake.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable unused) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                this.l1111l111111Il.unbindService(this.l111l11111I1l);
                return "";
            }
        } catch (Exception unused2) {
            return "";
        }
    }
}
