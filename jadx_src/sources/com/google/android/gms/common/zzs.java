package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.e1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    private final String f52666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final b0 f52667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 3)
    private final boolean f52668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean f52669e;

    @SafeParcelable.b
    zzs(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) @Nullable IBinder iBinder, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) boolean z11) {
        this.f52666b = str;
        c0 c0Var = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.c cVarE = e1.N(iBinder).E();
                byte[] bArr = cVarE == null ? null : (byte[]) com.google.android.gms.dynamic.e.r0(cVarE);
                if (bArr != null) {
                    c0Var = new c0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f52667c = c0Var;
        this.f52668d = z10;
        this.f52669e = z11;
    }

    zzs(String str, @Nullable b0 b0Var, boolean z10, boolean z11) {
        this.f52666b = str;
        this.f52667c = b0Var;
        this.f52668d = z10;
        this.f52669e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.Y(parcel, 1, this.f52666b, false);
        b0 b0Var = this.f52667c;
        if (b0Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            b0Var = null;
        }
        x8.a.B(parcel, 2, b0Var, false);
        x8.a.g(parcel, 3, this.f52668d);
        x8.a.g(parcel, 4, this.f52669e);
        x8.a.b(parcel, iA);
    }
}
