package r4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class g implements p4.b {

    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f138795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f138796c;

        public b() {
            this.f138795b = false;
            this.f138796c = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.f138795b) {
                throw new IllegalStateException();
            }
            this.f138795b = true;
            return this.f138796c.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f138796c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // p4.b
    public String a(Context context) {
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return i5.a.AbstractBinderC1085a.g(bVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
