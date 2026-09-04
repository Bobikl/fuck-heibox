package anetwork.channel.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable.Creator<BodyHandlerEntry> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BodyHandlerEntry createFromParcel(Parcel parcel) {
        BodyHandlerEntry bodyHandlerEntry = new BodyHandlerEntry((b) null);
        bodyHandlerEntry.f30200b = anetwork.channel.aidl.d.a.g(parcel.readStrongBinder());
        return bodyHandlerEntry;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BodyHandlerEntry[] newArray(int i10) {
        return new BodyHandlerEntry[i10];
    }
}
