package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import anet.channel.util.ALog;
import anetwork.channel.aidl.NetworkService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile anetwork.channel.aidl.b f30108a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile boolean f30109b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile boolean f30110c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile CountDownLatch f30111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static Handler f30112e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ServiceConnection f30113f = new j();

    public static anetwork.channel.aidl.b a() {
        return f30108a;
    }

    private static void b(Context context) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.RemoteGetter", "[asyncBindService] mContext:" + context + " bBindFailed:" + f30109b + " bBinding:" + f30110c, null, new Object[0]);
        }
        if (context == null || f30109b || f30110c) {
            return;
        }
        f30110c = true;
        Intent intent = new Intent(context, (Class<?>) NetworkService.class);
        intent.setAction(anetwork.channel.aidl.b.class.getName());
        intent.addCategory("android.intent.category.DEFAULT");
        f30109b = !context.bindService(intent, f30113f, 1);
        if (f30109b) {
            f30110c = false;
            ALog.e("anet.RemoteGetter", "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
        }
        f30112e.postDelayed(new k(), 10000L);
    }

    public static void c(Context context, boolean z10) {
        if (f30108a == null && !f30109b) {
            b(context);
            if (f30109b || !z10) {
                return;
            }
            try {
                synchronized (i.class) {
                    if (f30108a != null) {
                        return;
                    }
                    if (f30111d == null) {
                        f30111d = new CountDownLatch(1);
                    }
                    ALog.i("anet.RemoteGetter", "[initRemoteGetterAndWait]begin to wait", null, new Object[0]);
                    if (f30111d.await(t3.b.d(), TimeUnit.SECONDS)) {
                        ALog.i("anet.RemoteGetter", "mServiceBindLock count down to 0", null, new Object[0]);
                    } else {
                        ALog.i("anet.RemoteGetter", "mServiceBindLock wait timeout", null, new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                ALog.e("anet.RemoteGetter", "mServiceBindLock wait interrupt", null, new Object[0]);
            }
        }
    }
}
