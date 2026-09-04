package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@KeepName
public final class BinderWrapper implements Parcelable {

    @androidx.annotation.n0
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder f52439b;

    @v8.a
    public BinderWrapper(@androidx.annotation.n0 IBinder iBinder) {
        this.f52439b = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f52439b);
    }
}
