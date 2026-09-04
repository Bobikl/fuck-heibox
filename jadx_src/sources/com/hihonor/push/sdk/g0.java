package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f60034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f60035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f60036c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("MessengerSrvConnection", "onServiceConnected");
        this.f60034a = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.setData(this.f60035b);
        try {
            this.f60034a.send(messageObtain);
        } catch (Exception e10) {
            e10.getMessage();
        }
        Log.i("MessengerSrvConnection", "start unbind service.");
        try {
            this.f60036c.unbindService(this);
            Log.i("MessengerSrvConnection", "unbind service end.");
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("MessengerSrvConnection", "onServiceDisconnected");
        this.f60034a = null;
        this.f60035b = null;
        this.f60036c = null;
    }
}
