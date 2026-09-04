package com.tencent.qmsp.sdk.g.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f101951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.tencent.qmsp.sdk.g.a.a f101952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f101953d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101950a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f101954e = new a();

    public class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.tencent.qmsp.sdk.base.c.a("HSDID did service binded");
            d.this.f101952c = com.tencent.qmsp.sdk.g.a.a.AbstractBinderC0996a.a(iBinder);
            d.this.a(true);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.this.a(false);
        }
    }

    public d(Context context) {
        this.f101951b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (!z10) {
            this.f101953d.g();
            return;
        }
        try {
            this.f101953d.a(this.f101952c);
        } catch (Exception e10) {
            com.tencent.qmsp.sdk.base.c.b("HSDID notify did bind status error :" + e10.getMessage());
        }
    }

    public void a() {
        try {
            if (!this.f101950a || this.f101954e == null || this.f101951b == null) {
                return;
            }
            com.tencent.qmsp.sdk.base.c.a("HSDID start to unbind did service");
            this.f101950a = false;
            this.f101951b.unbindService(this.f101954e);
        } catch (Exception e10) {
            com.tencent.qmsp.sdk.base.c.b("HSDID error:" + e10.getMessage());
        }
    }

    public void a(b bVar) {
        try {
            this.f101953d = bVar;
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            ComponentName componentName = new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            Intent intent2 = new Intent(intent);
            intent2.setComponent(componentName);
            com.tencent.qmsp.sdk.base.c.a("HSDID start to bind did service");
            boolean zBindService = this.f101951b.bindService(intent2, this.f101954e, 1);
            this.f101950a = zBindService;
            if (zBindService) {
                return;
            }
            this.f101953d.g();
        } catch (Exception unused) {
            a(false);
        }
    }
}
