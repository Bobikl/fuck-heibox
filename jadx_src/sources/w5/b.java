package w5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f140992e = "OpenDeviceId library";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f140993f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u5.a f140995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f140996c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f140994a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1274b f140997d = null;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f140995b = u5.a.AbstractBinderC1271a.g(iBinder);
            if (b.this.f140997d != null) {
                b.this.f140997d.a("Deviceid Service Connected", b.this);
            }
            b.this.i("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f140995b = null;
            b.this.i("Service onServiceDisconnected");
        }
    }

    /* JADX INFO: renamed from: w5.b$b, reason: collision with other inner class name */
    public interface InterfaceC1274b<T> {
        void a(T t10, b bVar);
    }

    private void e(String str) {
        if (f140993f) {
            Log.e(f140992e, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (f140993f) {
            Log.i(f140992e, str);
        }
    }

    public int a(Context context, InterfaceC1274b<String> interfaceC1274b) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f140994a = context;
        this.f140997d = interfaceC1274b;
        this.f140996c = new a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f140994a.bindService(intent, this.f140996c, 1)) {
            i("bindService Successful!");
            return 1;
        }
        i("bindService Failed!");
        return -1;
    }

    public String b() {
        Context context = this.f140994a;
        if (context == null) {
            i("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        i("liufeng, getAAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            i("input package is null!");
            return null;
        }
        try {
            u5.a aVar = this.f140995b;
            if (aVar == null) {
                return null;
            }
            String strA = aVar.a(packageName);
            return ((strA == null || "".equals(strA)) && this.f140995b.c(packageName)) ? this.f140995b.a(packageName) : strA;
        } catch (RemoteException unused) {
            e("getAAID error, RemoteException!");
            return null;
        }
    }

    public void g(boolean z10) {
        f140993f = z10;
    }

    public String h() {
        if (this.f140994a == null) {
            e("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            u5.a aVar = this.f140995b;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException e10) {
            e("getOAID error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (this.f140994a == null) {
            e("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            u5.a aVar = this.f140995b;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        } catch (RemoteException e10) {
            e("getUDID error, RemoteException!");
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e("getUDID error, Exception!");
            e11.printStackTrace();
            return null;
        }
    }

    public String k() {
        Context context = this.f140994a;
        if (context == null) {
            i("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        i("liufeng, getVAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            i("input package is null!");
            return null;
        }
        try {
            u5.a aVar = this.f140995b;
            if (aVar != null) {
                return aVar.b(packageName);
            }
            return null;
        } catch (RemoteException e10) {
            e("getVAID error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public boolean l() {
        try {
            if (this.f140995b == null) {
                return false;
            }
            i("Device support opendeviceid");
            return this.f140995b.c();
        } catch (RemoteException unused) {
            e("isSupport error, RemoteException!");
            return false;
        }
    }

    public void m() {
        try {
            this.f140994a.unbindService(this.f140996c);
            i("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            e("unBind Service exception");
        }
        this.f140995b = null;
    }
}
