package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class DefaultProgressEvent implements Parcelable, s3.e.b {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f30027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f30028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f30029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f30030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    byte[] f30031f;

    public DefaultProgressEvent() {
    }

    public DefaultProgressEvent(int i10, int i11, int i12, byte[] bArr) {
        this.f30027b = i10;
        this.f30028c = i11;
        this.f30029d = i12;
        this.f30031f = bArr;
    }

    public static DefaultProgressEvent f(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.f30027b = parcel.readInt();
            defaultProgressEvent.f30028c = parcel.readInt();
            defaultProgressEvent.f30029d = parcel.readInt();
            int i10 = parcel.readInt();
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                parcel.readByteArray(bArr);
                defaultProgressEvent.f30031f = bArr;
            }
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    @Override // s3.e.b
    public int a() {
        return this.f30028c;
    }

    @Override // s3.e.b
    public byte[] b() {
        return this.f30031f;
    }

    @Override // s3.e.b
    public int c() {
        return this.f30029d;
    }

    public Object d() {
        return this.f30030e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // s3.e.b
    public int getIndex() {
        return this.f30027b;
    }

    public void h(Object obj) {
        this.f30030e = obj;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.f30027b + ", size=" + this.f30028c + ", total=" + this.f30029d + "]";
    }

    @Override // s3.e.b
    public String w() {
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30027b);
        parcel.writeInt(this.f30028c);
        parcel.writeInt(this.f30029d);
        byte[] bArr = this.f30031f;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.f30031f);
    }
}
