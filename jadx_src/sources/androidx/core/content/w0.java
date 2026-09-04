package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: UnusedAppRestrictionsBackportCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.core.app.unusedapprestrictions.a f20624a;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public w0(@androidx.annotation.n0 androidx.core.app.unusedapprestrictions.a aVar) {
        this.f20624a = aVar;
    }

    public void a(boolean z10, boolean z11) throws RemoteException {
        this.f20624a.P0(z10, z11);
    }
}
