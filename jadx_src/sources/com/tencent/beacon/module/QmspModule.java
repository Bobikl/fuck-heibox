package com.tencent.beacon.module;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.base.util.c;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qmsp.sdk.u.U;

/* JADX INFO: loaded from: classes4.dex */
public class QmspModule implements BeaconModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f99223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f99225c = new Runnable() { // from class: com.tencent.beacon.module.QmspModule.1
        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (!QmspModule.this.f99224b) {
                QmspModule.this.a(j.c());
            }
            try {
                str = U.getSDKIsAlive() ? "Y" : "N";
            } catch (Throwable th2) {
                c.b("[qmsp] getSDKIsAlive error! exception msg", th2.getMessage());
                c.a(th2);
            }
            c.a("[qmsp] current qmsp is alive:%s", str);
            com.tencent.beacon.a.c.c.d().c(str);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        Throwable th2;
        int iStartQ;
        if (this.f99224b) {
            return;
        }
        c.a("[qmsp] init qmsp qimei: %s", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        String strL = com.tencent.beacon.a.c.c.d().l();
        String strF = com.tencent.beacon.a.c.c.d().f();
        try {
            c.a("[qmsp] startQ: userId: %s, qimei:%s, appKey:%s, sdkVersion: %s", strL, str, strF, cVarD.j());
            iStartQ = U.startQ(this.f99223a, strL, str, strF, cVarD.j(), c.b());
            try {
                a.a().a(114, 0L, 300000L, this.f99225c);
                this.f99224b = true;
            } catch (Throwable th3) {
                th2 = th3;
                c.b("[qmsp] qmspSDk start error! result:%d, exception msg: %s", Integer.valueOf(iStartQ), th2.getMessage());
                c.a(th2);
                U.stopQ();
                this.f99224b = false;
            }
        } catch (Throwable th4) {
            th2 = th4;
            iStartQ = 0;
        }
        c.a("[qmsp] qmspSDK start result:%d", Integer.valueOf(iStartQ));
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        if (!com.tencent.beacon.a.c.c.d().m()) {
            c.a("qmsp disable by user", new Object[0]);
        } else {
            this.f99223a = context;
            j.a(com.tencent.beacon.a.c.c.d().f(), context, new IAsyncQimeiListener() { // from class: com.tencent.beacon.module.QmspModule.2
                @Override // com.tencent.qimei.sdk.IAsyncQimeiListener
                public void onQimeiDispatch(Qimei qimei) {
                    QmspModule.this.a(qimei.getQimei16());
                }
            });
        }
    }
}
