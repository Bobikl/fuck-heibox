package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.customtabs.c.b f3149b = new a();

    public class a extends android.support.customtabs.c.b {
        a() {
        }

        @Override // android.support.customtabs.c
        public void b1(@n0 android.support.customtabs.a aVar, @n0 String str, @p0 Bundle bundle) throws RemoteException {
            aVar.a(str, bundle);
        }

        @Override // android.support.customtabs.c
        public void m(@n0 android.support.customtabs.a aVar, @p0 Bundle bundle) throws RemoteException {
            aVar.l1(bundle);
        }
    }

    @Override // android.app.Service
    @n0
    public IBinder onBind(@p0 Intent intent) {
        return this.f3149b;
    }
}
