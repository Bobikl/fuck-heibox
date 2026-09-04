package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f30038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h.a f30039c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h.a f30040d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b.a f30041e = new c(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f30038b = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkService", "onBind:" + intent.getAction(), null, new Object[0]);
        }
        this.f30039c = new u3.b(this.f30038b);
        this.f30040d = new anetwork.channel.http.b(this.f30038b);
        if (b.class.getName().equals(intent.getAction())) {
            return this.f30041e;
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }
}
