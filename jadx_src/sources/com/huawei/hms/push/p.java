package com.huawei.hms.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: compiled from: RemoteService.java */
/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceConnection f61284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Messenger f61285b = null;

    /* JADX INFO: compiled from: RemoteService.java */
    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f61286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f61287b;

        a(Bundle bundle, Context context) {
            this.f61286a = bundle;
            this.f61287b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HMSLog.i("RemoteService", "remote service onConnected");
            p.this.f61285b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f61286a);
            try {
                p.this.f61285b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.i("RemoteService", "remote service message send failed");
            }
            HMSLog.i("RemoteService", "remote service unbindservice");
            this.f61287b.unbindService(p.this.f61284a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.i("RemoteService", "remote service onDisconnected");
            p.this.f61285b = null;
        }
    }

    public boolean a(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f61284a = new a(bundle, applicationContext);
        HMSLog.i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f61284a, 1);
    }
}
