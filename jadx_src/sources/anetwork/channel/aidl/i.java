package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements Parcelable.Creator<DefaultFinishEvent> {
    i() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultFinishEvent createFromParcel(Parcel parcel) {
        return DefaultFinishEvent.b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DefaultFinishEvent[] newArray(int i10) {
        return new DefaultFinishEvent[i10];
    }
}
