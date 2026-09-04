package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ParcelableRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequest> CREATOR = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s3.h f30045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BodyEntry f30046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f30052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f30053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map<String, String> f30058o;

    public ParcelableRequest() {
        this.f30052i = null;
        this.f30053j = null;
    }

    public ParcelableRequest(s3.h hVar) {
        this.f30052i = null;
        this.f30053j = null;
        this.f30045b = hVar;
        if (hVar != null) {
            this.f30048e = hVar.h();
            this.f30047d = hVar.f();
            this.f30049f = hVar.z();
            this.f30050g = hVar.e();
            this.f30051h = hVar.getMethod();
            List<s3.a> listB = hVar.b();
            if (listB != null) {
                this.f30052i = new HashMap();
                for (s3.a aVar : listB) {
                    this.f30052i.put(aVar.getName(), aVar.getValue());
                }
            }
            List<s3.g> params = hVar.getParams();
            if (params != null) {
                this.f30053j = new HashMap();
                for (s3.g gVar : params) {
                    this.f30053j.put(gVar.getKey(), gVar.getValue());
                }
            }
            this.f30046c = hVar.k();
            this.f30054k = hVar.getConnectTimeout();
            this.f30055l = hVar.getReadTimeout();
            this.f30056m = hVar.a();
            this.f30057n = hVar.l();
            this.f30058o = hVar.v();
        }
    }

    public static ParcelableRequest b(Parcel parcel) {
        ParcelableRequest parcelableRequest = new ParcelableRequest();
        try {
            parcelableRequest.f30047d = parcel.readInt();
            parcelableRequest.f30048e = parcel.readString();
            parcelableRequest.f30049f = parcel.readString();
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            parcelableRequest.f30050g = z10;
            parcelableRequest.f30051h = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.f30052i = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                parcelableRequest.f30053j = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            parcelableRequest.f30046c = (BodyEntry) parcel.readParcelable(ParcelableRequest.class.getClassLoader());
            parcelableRequest.f30054k = parcel.readInt();
            parcelableRequest.f30055l = parcel.readInt();
            parcelableRequest.f30056m = parcel.readString();
            parcelableRequest.f30057n = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.f30058o = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
        } catch (Throwable th2) {
            ALog.w("anet.ParcelableRequest", "[readFromParcel]", null, th2, new Object[0]);
        }
        return parcelableRequest;
    }

    public String a(String str) {
        Map<String, String> map = this.f30058o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        s3.h hVar = this.f30045b;
        if (hVar == null) {
            return;
        }
        try {
            parcel.writeInt(hVar.f());
            parcel.writeString(this.f30048e);
            parcel.writeString(this.f30045b.z());
            parcel.writeInt(this.f30045b.e() ? 1 : 0);
            parcel.writeString(this.f30045b.getMethod());
            parcel.writeInt(this.f30052i == null ? 0 : 1);
            Map<String, String> map = this.f30052i;
            if (map != null) {
                parcel.writeMap(map);
            }
            parcel.writeInt(this.f30053j == null ? 0 : 1);
            Map<String, String> map2 = this.f30053j;
            if (map2 != null) {
                parcel.writeMap(map2);
            }
            parcel.writeParcelable(this.f30046c, 0);
            parcel.writeInt(this.f30045b.getConnectTimeout());
            parcel.writeInt(this.f30045b.getReadTimeout());
            parcel.writeString(this.f30045b.a());
            parcel.writeString(this.f30045b.l());
            Map<String, String> mapV = this.f30045b.v();
            parcel.writeInt(mapV == null ? 0 : 1);
            if (mapV != null) {
                parcel.writeMap(mapV);
            }
        } catch (Throwable th2) {
            ALog.w("anet.ParcelableRequest", "[writeToParcel]", null, th2, new Object[0]);
        }
    }
}
