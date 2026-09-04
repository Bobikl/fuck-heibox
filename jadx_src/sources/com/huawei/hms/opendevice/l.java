package com.huawei.hms.opendevice;

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
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ServiceConnection f61155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Messenger f61156b = null;

    /* JADX INFO: compiled from: RemoteService.java */
    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f61157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f61158b;

        a(Bundle bundle, Context context) {
            this.f61157a = bundle;
            this.f61158b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HMSLog.i("RemoteService", "remote service onConnected");
            l.this.f61156b = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f61157a);
            try {
                l.this.f61156b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.i("RemoteService", "remote service message send failed");
            }
            HMSLog.i("RemoteService", "remote service unbindservice");
            this.f61158b.unbindService(l.this.f61155a);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.i("RemoteService", "remote service onDisconnected");
            l.this.f61156b = null;
        }
    }

    public boolean a(Context context, Bundle bundle, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.f61155a = new a(bundle, applicationContext);
        HMSLog.i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f61155a, 1);
    }
}
