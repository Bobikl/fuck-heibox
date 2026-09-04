package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20431c = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.core.app.unusedapprestrictions.b.AbstractBinderC0124b f20432b = new a();

    public class a extends androidx.core.app.unusedapprestrictions.b.AbstractBinderC0124b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void W0(@androidx.annotation.p0 androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new w0(aVar));
        }
    }

    protected abstract void a(@androidx.annotation.n0 w0 w0Var);

    @Override // android.app.Service
    @androidx.annotation.p0
    public IBinder onBind(@androidx.annotation.p0 Intent intent) {
        return this.f20432b;
    }
}
