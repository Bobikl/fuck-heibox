package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f101604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f101605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f101606d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101603a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f101607e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.a("HSDID did service binded");
            i.this.f101605c = f.a.a(iBinder);
            i.this.a(true);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.this.a(false);
        }
    }

    public i(Context context) {
        this.f101604b = context;
    }

    public void a() {
        try {
            if (!this.f101603a || this.f101607e == null || this.f101604b == null) {
                return;
            }
            c.a("HSDID start to unbind did service");
            this.f101603a = false;
            this.f101604b.unbindService(this.f101607e);
        } catch (Exception e10) {
            c.b("HSDID error:" + e10.getMessage());
        }
    }

    public void a(g gVar) {
        try {
            this.f101606d = gVar;
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            ComponentName componentName = new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            Intent intent2 = new Intent(intent);
            intent2.setComponent(componentName);
            c.a("HSDID start to bind did service");
            boolean zBindService = this.f101604b.bindService(intent2, this.f101607e, 1);
            this.f101603a = zBindService;
            if (zBindService) {
                return;
            }
            this.f101606d.b();
        } catch (Exception unused) {
            a(false);
        }
    }

    public final void a(boolean z10) {
        if (!z10) {
            this.f101606d.b();
            return;
        }
        try {
            this.f101606d.a(this.f101605c);
        } catch (Exception e10) {
            c.b("HSDID notify did bind status error :" + e10.getMessage());
        }
    }
}
