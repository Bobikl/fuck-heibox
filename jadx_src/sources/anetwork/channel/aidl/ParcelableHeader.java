package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ParcelableHeader implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Parcelable.Creator<ParcelableHeader> f30042d = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<String>> f30044c;

    ParcelableHeader() {
    }

    public ParcelableHeader(int i10, Map<String, List<String>> map) {
        this.f30044c = map;
        this.f30043b = i10;
    }

    static ParcelableHeader a(Parcel parcel) {
        ParcelableHeader parcelableHeader = new ParcelableHeader();
        try {
            if (parcel.readInt() == 1) {
                parcelableHeader.f30044c = parcel.readHashMap(ParcelableHeader.class.getClassLoader());
            }
            parcelableHeader.f30043b = parcel.readInt();
        } catch (Throwable th2) {
            ALog.e("anet.ParcelableHeader", "[readFromParcel]", null, th2, new Object[0]);
        }
        return parcelableHeader;
    }

    public Map<String, List<String>> b() {
        return this.f30044c;
    }

    public int c() {
        return this.f30043b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ParcelableResponseHeader [responseCode=" + this.f30043b + ", header=" + this.f30044c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (this.f30044c != null) {
            parcel.writeInt(1);
            parcel.writeMap(this.f30044c);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f30043b);
    }
}
