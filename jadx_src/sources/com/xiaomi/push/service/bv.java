package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bv implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceClient f107977a;

    bv(ServiceClient serviceClient) {
        this.f107977a = serviceClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f107977a) {
            this.f107977a.f950b = new Messenger(iBinder);
            this.f107977a.f951b = false;
            Iterator it = this.f107977a.f948a.iterator();
            while (it.hasNext()) {
                try {
                    this.f107977a.f950b.send((Message) it.next());
                } catch (RemoteException e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                }
            }
            this.f107977a.f948a.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f107977a.f950b = null;
        this.f107977a.f951b = false;
    }
}
