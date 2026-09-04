package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends com.google.android.gms.internal.common.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f52521a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d dVar, Looper looper) {
        super(looper);
        this.f52521a = dVar;
    }

    private static final void a(Message message) {
        i0 i0Var = (i0) message.obj;
        i0Var.b();
        i0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f52521a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f52521a.h()) || message.what == 5)) && !this.f52521a.H()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f52521a.f52500z = new ConnectionResult(message.arg2);
            if (d.j0(this.f52521a)) {
                d dVar = this.f52521a;
                if (!dVar.A) {
                    dVar.k0(3, null);
                    return;
                }
            }
            d dVar2 = this.f52521a;
            ConnectionResult connectionResult = dVar2.f52500z != null ? dVar2.f52500z : new ConnectionResult(8);
            this.f52521a.f52490p.a(connectionResult);
            this.f52521a.J(connectionResult);
            return;
        }
        if (i11 == 5) {
            d dVar3 = this.f52521a;
            ConnectionResult connectionResult2 = dVar3.f52500z != null ? dVar3.f52500z : new ConnectionResult(8);
            this.f52521a.f52490p.a(connectionResult2);
            this.f52521a.J(connectionResult2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f52521a.f52490p.a(connectionResult3);
            this.f52521a.J(connectionResult3);
            return;
        }
        if (i11 == 6) {
            this.f52521a.k0(5, null);
            d dVar4 = this.f52521a;
            if (dVar4.f52495u != null) {
                dVar4.f52495u.onConnectionSuspended(message.arg2);
            }
            this.f52521a.K(message.arg2);
            d.i0(this.f52521a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f52521a.G()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((i0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
