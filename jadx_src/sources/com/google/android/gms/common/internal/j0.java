package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@z8.d0
public final class j0 extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private d f52525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52526c;

    public j0(@androidx.annotation.n0 d dVar, int i10) {
        this.f52525b = dVar;
        this.f52526c = i10;
    }

    @Override // com.google.android.gms.common.internal.k
    @androidx.annotation.g
    public final void F0(int i10, @androidx.annotation.n0 IBinder iBinder, @androidx.annotation.p0 Bundle bundle) {
        p.m(this.f52525b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f52525b.L(i10, iBinder, bundle, this.f52526c);
        this.f52525b = null;
    }

    @Override // com.google.android.gms.common.internal.k
    @androidx.annotation.g
    public final void b(int i10, @androidx.annotation.p0 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.k
    @androidx.annotation.g
    public final void f0(int i10, @androidx.annotation.n0 IBinder iBinder, @androidx.annotation.n0 zzj zzjVar) {
        d dVar = this.f52525b;
        p.m(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.l(zzjVar);
        d.e0(dVar, zzjVar);
        F0(i10, iBinder, zzjVar.f52579b);
    }
}
