package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class as implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f106765a;

    as(ao aoVar) {
        this.f106765a = aoVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f106765a) {
            this.f106765a.f130a = new Messenger(iBinder);
            this.f106765a.f106760c = false;
            Iterator it = this.f106765a.f133a.iterator();
            while (it.hasNext()) {
                try {
                    this.f106765a.f130a.send((Message) it.next());
                } catch (RemoteException e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                }
            }
            this.f106765a.f133a.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f106765a.f130a = null;
        this.f106765a.f106760c = false;
    }
}
