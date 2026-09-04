package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements Parcelable.Creator<DefaultProgressEvent> {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultProgressEvent createFromParcel(Parcel parcel) {
        return DefaultProgressEvent.f(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultProgressEvent[] newArray(int i10) {
        return new DefaultProgressEvent[i10];
    }
}
