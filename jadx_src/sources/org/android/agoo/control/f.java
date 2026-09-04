package org.android.agoo.control;

import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AgooFactory.a f132835a;

    f(AgooFactory.a aVar) {
        this.f132835a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ALog.d("AgooFactory", "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
            this.f132835a.f132816c.doSend(this.f132835a.f132814a);
            ALog.d("AgooFactory", "send finish. close this connection", new Object[0]);
            this.f132835a.f132816c = null;
            try {
                AgooFactory.mContext.unbindService(this.f132835a.f132817d);
            } catch (Throwable th2) {
                ALog.e("AgooFactory", "unbindService error", th2, new Object[0]);
            }
        } catch (Throwable th3) {
            try {
                ALog.e("AgooFactory", "send error", th3, new Object[0]);
                ALog.d("AgooFactory", "send finish. close this connection", new Object[0]);
                this.f132835a.f132816c = null;
                try {
                    AgooFactory.mContext.unbindService(this.f132835a.f132817d);
                } catch (Throwable th4) {
                    ALog.e("AgooFactory", "unbindService error", th4, new Object[0]);
                }
            } catch (Throwable th5) {
                ALog.d("AgooFactory", "send finish. close this connection", new Object[0]);
                this.f132835a.f132816c = null;
                try {
                    AgooFactory.mContext.unbindService(this.f132835a.f132817d);
                } catch (Throwable th6) {
                    ALog.e("AgooFactory", "unbindService error", th6, new Object[0]);
                }
                throw th5;
            }
        }
    }
}
