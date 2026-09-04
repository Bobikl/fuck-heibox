package cn.fly.verify;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class di implements ServiceConnection, dm<di> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private df f36101a;

    public void a(df dfVar) {
        this.f36101a = dfVar;
    }

    @Override // cn.fly.verify.dm
    public boolean a(di diVar, Class<di> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (!"setHandler".equals(str) || objArr.length != 1) {
            return false;
        }
        diVar.a((df) objArr[0]);
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f36101a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(componentName);
                arrayList.add(iBinder);
                this.f36101a.a("onServiceConnected", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f36101a != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(componentName);
            this.f36101a.a("onServiceDisconnected", arrayList);
        }
    }
}
