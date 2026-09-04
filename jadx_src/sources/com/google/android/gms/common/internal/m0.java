package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f52533g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    public m0(d dVar, @androidx.annotation.p0 int i10, Bundle bundle) {
        super(dVar, i10, null);
        this.f52533g = dVar;
    }

    @Override // com.google.android.gms.common.internal.w
    protected final void f(ConnectionResult connectionResult) {
        if (this.f52533g.h() && d.j0(this.f52533g)) {
            d.f0(this.f52533g, 16);
        } else {
            this.f52533g.f52490p.a(connectionResult);
            this.f52533g.J(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.w
    protected final boolean g() {
        this.f52533g.f52490p.a(ConnectionResult.E);
        return true;
    }
}
