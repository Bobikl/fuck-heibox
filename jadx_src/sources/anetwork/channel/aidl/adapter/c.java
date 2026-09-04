package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.NetworkResponse;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c extends anetwork.channel.aidl.e.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30078i = "anet.ParcelableFutureResponse";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Future<s3.i> f30079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    NetworkResponse f30080h;

    public c(Future<s3.i> future) {
        this.f30079g = future;
    }

    @Override // anetwork.channel.aidl.e
    public boolean cancel(boolean z10) throws RemoteException {
        Future<s3.i> future = this.f30079g;
        if (future == null) {
            return true;
        }
        return future.cancel(z10);
    }

    @Override // anetwork.channel.aidl.e
    public boolean isCancelled() throws RemoteException {
        Future<s3.i> future = this.f30079g;
        if (future == null) {
            return true;
        }
        return future.isCancelled();
    }

    @Override // anetwork.channel.aidl.e
    public boolean isDone() throws RemoteException {
        Future<s3.i> future = this.f30079g;
        if (future == null) {
            return true;
        }
        return future.isDone();
    }

    @Override // anetwork.channel.aidl.e
    public NetworkResponse n1(long j10) throws RemoteException {
        Future<s3.i> future = this.f30079g;
        if (future == null) {
            NetworkResponse networkResponse = this.f30080h;
            return networkResponse != null ? networkResponse : new NetworkResponse(-201);
        }
        try {
            return (NetworkResponse) future.get(j10, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            if ("NO SUPPORT".equalsIgnoreCase(e10.getMessage())) {
                ALog.e(f30078i, "[get]有listener将不支持future.get()方法，如有需要请listener传入null", null, e10, new Object[0]);
            }
            return new NetworkResponse(-201);
        }
    }
}
