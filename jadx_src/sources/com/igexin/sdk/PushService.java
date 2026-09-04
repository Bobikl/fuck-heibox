package com.igexin.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.igexin.push.core.x;

/* JADX INFO: loaded from: classes6.dex */
public class PushService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64083a = getClass().getName();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String type = (intent == null || intent.getType() == null) ? "" : intent.getType();
        if (!type.startsWith("GB-") && !type.startsWith("PB-")) {
            return type.equals("SERVER_LOG") ? com.igexin.a.a.c.a.f.a().b() : x.a().a(intent);
        }
        onStartCommand(intent, 0, 0);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        x.a().a((Context) this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        x.a().c();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        x.a().b();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        return x.a().a(this, intent, i10, i11);
    }
}
