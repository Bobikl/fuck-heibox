package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TrustedWebActivityCallbackRemote.java */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.trusted.a f3294a;

    private r(@n0 android.support.customtabs.trusted.a aVar) {
        this.f3294a = aVar;
    }

    @p0
    static r a(@p0 IBinder iBinder) {
        android.support.customtabs.trusted.a aVarG = iBinder == null ? null : android.support.customtabs.trusted.a.b.g(iBinder);
        if (aVarG == null) {
            return null;
        }
        return new r(aVarG);
    }

    public void b(@n0 String str, @n0 Bundle bundle) throws RemoteException {
        this.f3294a.k1(str, bundle);
    }
}
