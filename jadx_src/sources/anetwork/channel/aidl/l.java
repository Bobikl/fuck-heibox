package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements Parcelable.Creator<ParcelableHeader> {
    l() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableHeader createFromParcel(Parcel parcel) {
        return ParcelableHeader.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ParcelableHeader[] newArray(int i10) {
        return new ParcelableHeader[i10];
    }
}
