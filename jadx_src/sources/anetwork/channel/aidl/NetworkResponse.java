package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkResponse implements Parcelable, s3.i {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f30032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f30034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f30035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Throwable f30036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StatisticData f30037g;

    public NetworkResponse() {
    }

    public NetworkResponse(int i10) {
        this.f30032b = i10;
        this.f30033c = ErrorConstant.getErrMsg(i10);
    }

    public static NetworkResponse a(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.f30032b = parcel.readInt();
            networkResponse.f30033c = parcel.readString();
            int i10 = parcel.readInt();
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                networkResponse.f30034d = bArr;
                parcel.readByteArray(bArr);
            }
            networkResponse.f30035e = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            try {
                networkResponse.f30037g = (StatisticData) parcel.readSerializable();
            } catch (Throwable unused) {
                ALog.i("anet.NetworkResponse", "[readFromParcel] source.readSerializable() error", null, new Object[0]);
            }
        } catch (Exception e10) {
            ALog.w("anet.NetworkResponse", "[readFromParcel]", null, e10, new Object[0]);
        }
        return networkResponse;
    }

    @Override // s3.i
    public Map<String, List<String>> C() {
        return this.f30035e;
    }

    @Override // s3.i
    public byte[] b() {
        return this.f30034d;
    }

    public void c(byte[] bArr) {
        this.f30034d = bArr;
    }

    public void d(Map<String, List<String>> map) {
        this.f30035e = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f(String str) {
        this.f30033c = str;
    }

    @Override // s3.i
    public int getStatusCode() {
        return this.f30032b;
    }

    public void h(Throwable th2) {
        this.f30036f = th2;
    }

    public void j(StatisticData statisticData) {
        this.f30037g = statisticData;
    }

    public void k(int i10) {
        this.f30032b = i10;
        this.f30033c = ErrorConstant.getErrMsg(i10);
    }

    @Override // s3.i
    public Throwable q() {
        return this.f30036f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkResponse [");
        sb2.append("statusCode=");
        sb2.append(this.f30032b);
        sb2.append(", desc=");
        sb2.append(this.f30033c);
        sb2.append(", connHeadFields=");
        sb2.append(this.f30035e);
        sb2.append(", bytedata=");
        byte[] bArr = this.f30034d;
        sb2.append(bArr != null ? new String(bArr) : "");
        sb2.append(", error=");
        sb2.append(this.f30036f);
        sb2.append(", statisticData=");
        sb2.append(this.f30037g);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // s3.i
    public String w() {
        return this.f30033c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30032b);
        parcel.writeString(this.f30033c);
        byte[] bArr = this.f30034d;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f30034d);
        }
        parcel.writeMap(this.f30035e);
        StatisticData statisticData = this.f30037g;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    @Override // s3.i
    public StatisticData z() {
        return this.f30037g;
    }
}
