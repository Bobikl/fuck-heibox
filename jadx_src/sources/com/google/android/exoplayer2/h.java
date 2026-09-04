package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: BundleListRetriever.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends Binder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f46238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f46239d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f46240e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f46241f = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList<Bundle> f46242b;

    static {
        f46238c = com.google.android.exoplayer2.util.u0.f51536a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public h(List<Bundle> list) {
        this.f46242b = ImmutableList.v(list);
    }

    public static ImmutableList<Bundle> a(IBinder iBinder) {
        int i10;
        ImmutableList.a aVarQ = ImmutableList.q();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarQ.a((Bundle) com.google.android.exoplayer2.util.a.g(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarQ.e();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, @androidx.annotation.p0 Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f46242b.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f46238c) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f46242b.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
