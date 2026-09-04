package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements ServiceConnection {
    j() {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.RemoteGetter", "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
        }
        synchronized (i.class) {
            i.f30108a = anetwork.channel.aidl.b.a.g(iBinder);
            if (i.f30111d != null) {
                i.f30111d.countDown();
            }
        }
        i.f30109b = false;
        i.f30110c = false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.RemoteGetter", "ANet_Service Disconnected", null, new Object[0]);
        }
        i.f30108a = null;
        i.f30110c = false;
        if (i.f30111d != null) {
            i.f30111d.countDown();
        }
    }
}
