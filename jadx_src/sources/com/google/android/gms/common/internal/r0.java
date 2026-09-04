package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements Parcelable.Creator {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, getServiceRequest.f52450b);
        x8.a.F(parcel, 2, getServiceRequest.f52451c);
        x8.a.F(parcel, 3, getServiceRequest.f52452d);
        x8.a.Y(parcel, 4, getServiceRequest.f52453e, false);
        x8.a.B(parcel, 5, getServiceRequest.f52454f, false);
        x8.a.c0(parcel, 6, getServiceRequest.f52455g, i10, false);
        x8.a.k(parcel, 7, getServiceRequest.f52456h, false);
        x8.a.S(parcel, 8, getServiceRequest.f52457i, i10, false);
        x8.a.c0(parcel, 10, getServiceRequest.f52458j, i10, false);
        x8.a.c0(parcel, 11, getServiceRequest.f52459k, i10, false);
        x8.a.g(parcel, 12, getServiceRequest.f52460l);
        x8.a.F(parcel, 13, getServiceRequest.f52461m);
        x8.a.g(parcel, 14, getServiceRequest.f52462n);
        x8.a.Y(parcel, 15, getServiceRequest.c(), false);
        x8.a.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = SafeParcelReader.i0(parcel);
        Scope[] scopeArr = GetServiceRequest.f52448p;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f52449q;
        Feature[] featureArr2 = featureArr;
        String strG = null;
        IBinder iBinderY = null;
        Account account = null;
        String strG2 = null;
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        boolean zP = false;
        int iZ4 = 0;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(iX)) {
                case 1:
                    iZ = SafeParcelReader.Z(parcel, iX);
                    break;
                case 2:
                    iZ2 = SafeParcelReader.Z(parcel, iX);
                    break;
                case 3:
                    iZ3 = SafeParcelReader.Z(parcel, iX);
                    break;
                case 4:
                    strG = SafeParcelReader.G(parcel, iX);
                    break;
                case 5:
                    iBinderY = SafeParcelReader.Y(parcel, iX);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.K(parcel, iX, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, iX);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.C(parcel, iX, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.h0(parcel, iX);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.K(parcel, iX, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.K(parcel, iX, Feature.CREATOR);
                    break;
                case 12:
                    zP = SafeParcelReader.P(parcel, iX);
                    break;
                case 13:
                    iZ4 = SafeParcelReader.Z(parcel, iX);
                    break;
                case 14:
                    zP2 = SafeParcelReader.P(parcel, iX);
                    break;
                case 15:
                    strG2 = SafeParcelReader.G(parcel, iX);
                    break;
            }
        }
        SafeParcelReader.N(parcel, iI0);
        return new GetServiceRequest(iZ, iZ2, iZ3, strG, iBinderY, scopeArr, bundle, account, featureArr, featureArr2, zP, iZ4, zP2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
