package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements s3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static String f30099d = "anet.NetworkProxy";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final int f30100e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final int f30101f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile anetwork.channel.aidl.h f30102a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f30104c;

    public g(Context context, int i10) {
        this.f30104c = context;
        this.f30103b = i10;
    }

    private void d(boolean z10) {
        if (this.f30102a != null) {
            return;
        }
        if (t3.b.p()) {
            boolean zIsTargetProcess = GlobalAppRuntimeInfo.isTargetProcess();
            if (t3.b.i() && zIsTargetProcess) {
                i.c(this.f30104c, false);
                if (i.f30110c && this.f30102a == null) {
                    this.f30102a = this.f30103b == 1 ? new u3.b(this.f30104c) : new anetwork.channel.http.b(this.f30104c);
                    ALog.i(f30099d, "[initDelegateInstance] getNetworkInstance when binding service", null, new Object[0]);
                    return;
                } else {
                    g(this.f30103b);
                    if (this.f30102a != null) {
                        return;
                    }
                }
            } else {
                i.c(this.f30104c, z10);
                g(this.f30103b);
                if (this.f30102a != null) {
                    return;
                }
            }
            if (t3.b.g() && zIsTargetProcess && i.f30109b) {
                synchronized (this) {
                    if (this.f30102a == null) {
                        this.f30102a = this.f30103b == 1 ? new u3.b(this.f30104c) : new anetwork.channel.http.b(this.f30104c);
                        ALog.e(f30099d, "[initDelegateInstance] getNetworkInstance when bindService failed.", null, new Object[0]);
                        return;
                    }
                }
            }
        }
        synchronized (this) {
            if (this.f30102a == null) {
                if (ALog.isPrintLog(2)) {
                    ALog.i(f30099d, "[getLocalNetworkInstance]", null, new Object[0]);
                }
                this.f30102a = new anetwork.channel.http.b(this.f30104c);
            }
        }
    }

    private void e(s3.h hVar) {
        if (hVar == null) {
            return;
        }
        hVar.r(w3.a.f140979o, String.valueOf(System.currentTimeMillis()));
        String strC = hVar.C(w3.a.f140980p);
        if (TextUtils.isEmpty(strC)) {
            strC = anet.channel.fulltrace.a.a().createRequest();
        }
        hVar.r(w3.a.f140980p, strC);
        hVar.r(w3.a.f140981q, GlobalAppRuntimeInfo.getCurrentProcess());
    }

    private void f(Throwable th2, String str) {
        ALog.e(f30099d, null, str, th2, new Object[0]);
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-103, null, "rt");
        exceptionStatistic.exceptionStack = th2.toString();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    private synchronized void g(int i10) {
        if (this.f30102a != null) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(f30099d, "[tryGetRemoteNetworkInstance] type=" + i10, null, new Object[0]);
        }
        anetwork.channel.aidl.b bVarA = i.a();
        if (bVarA != null) {
            try {
                this.f30102a = bVarA.get(i10);
            } catch (Throwable th2) {
                f(th2, "[tryGetRemoteNetworkInstance]get RemoteNetwork Delegate failed.");
            }
        }
    }

    @Override // s3.c
    public Future<s3.i> a(s3.h hVar, Object obj, Handler handler, s3.f fVar) {
        ALog.i(f30099d, "networkProxy asyncSend", hVar.l(), new Object[0]);
        e(hVar);
        d(Looper.myLooper() != Looper.getMainLooper());
        ParcelableRequest parcelableRequest = new ParcelableRequest(hVar);
        e eVar = (fVar == null && handler == null) ? null : new e(fVar, handler, obj);
        if (parcelableRequest.f30048e == null) {
            if (eVar != null) {
                try {
                    eVar.x0(new DefaultFinishEvent(-102));
                } catch (RemoteException unused) {
                }
            }
            return new f(new NetworkResponse(-102));
        }
        try {
            return new f(this.f30102a.o(parcelableRequest, eVar));
        } catch (Throwable th2) {
            if (eVar != null) {
                try {
                    eVar.x0(new DefaultFinishEvent(-102));
                } catch (RemoteException unused2) {
                }
            }
            f(th2, "[asyncSend]call asyncSend exception");
            return new f(new NetworkResponse(-103));
        }
    }

    @Override // s3.c
    public anetwork.channel.aidl.a b(s3.h hVar, Object obj) {
        ALog.i(f30099d, "networkProxy getConnection", hVar.l(), new Object[0]);
        e(hVar);
        d(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(hVar);
        if (parcelableRequest.f30048e == null) {
            return new a(-102);
        }
        try {
            return this.f30102a.u(parcelableRequest);
        } catch (Throwable th2) {
            f(th2, "[getConnection]call getConnection method failed.");
            return new a(-103);
        }
    }

    @Override // s3.c
    public s3.i c(s3.h hVar, Object obj) {
        ALog.i(f30099d, "networkProxy syncSend", hVar.l(), new Object[0]);
        e(hVar);
        d(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(hVar);
        if (parcelableRequest.f30048e == null) {
            return new NetworkResponse(-102);
        }
        try {
            return this.f30102a.Z0(parcelableRequest);
        } catch (Throwable th2) {
            f(th2, "[syncSend]call syncSend method failed.");
            return new NetworkResponse(-103);
        }
    }
}
