package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class w extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    public final Bundle f52565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f52566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    protected w(d dVar, @androidx.annotation.p0 int i10, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        this.f52566f = dVar;
        this.f52564d = i10;
        this.f52565e = bundle;
    }

    @Override // com.google.android.gms.common.internal.i0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f52564d != 0) {
            this.f52566f.k0(1, null);
            Bundle bundle = this.f52565e;
            f(new ConnectionResult(this.f52564d, bundle != null ? (PendingIntent) bundle.getParcelable(d.G) : null));
        } else {
            if (g()) {
                return;
            }
            this.f52566f.k0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.i0
    protected final void b() {
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();
}
