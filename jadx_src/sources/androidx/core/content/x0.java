package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.j1;

/* JADX INFO: compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public class x0 implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    androidx.concurrent.futures.b<Integer> f20626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f20627d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j1
    @androidx.annotation.p0
    androidx.core.app.unusedapprestrictions.b f20625b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20628e = false;

    /* JADX INFO: compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
    public class a extends androidx.core.app.unusedapprestrictions.a.b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void P0(boolean z10, boolean z11) throws RemoteException {
            if (!z10) {
                x0.this.f20626c.p(0);
                Log.e(s0.f20614a, "Unable to retrieve the permission revocation setting from the backport");
            } else if (z11) {
                x0.this.f20626c.p(3);
            } else {
                x0.this.f20626c.p(2);
            }
        }
    }

    x0(@androidx.annotation.n0 Context context) {
        this.f20627d = context;
    }

    private androidx.core.app.unusedapprestrictions.a c() {
        return new a();
    }

    public void a(@androidx.annotation.n0 androidx.concurrent.futures.b<Integer> bVar) {
        if (this.f20628e) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f20628e = true;
        this.f20626c = bVar;
        this.f20627d.bindService(new Intent(UnusedAppRestrictionsBackportService.f20431c).setPackage(s0.b(this.f20627d.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f20628e) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f20628e = false;
        this.f20627d.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b bVarG = androidx.core.app.unusedapprestrictions.b.AbstractBinderC0124b.g(iBinder);
        this.f20625b = bVarG;
        try {
            bVarG.W0(c());
        } catch (RemoteException unused) {
            this.f20626c.p(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f20625b = null;
    }
}
