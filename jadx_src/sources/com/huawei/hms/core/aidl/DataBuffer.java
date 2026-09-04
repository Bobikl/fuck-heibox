package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f60598b;
    public Bundle header;

    public class a implements Parcelable.Creator<DataBuffer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i10) {
            return new DataBuffer[i10];
        }
    }

    public DataBuffer() {
        this.header = null;
        this.f60597a = 1;
        this.f60598b = null;
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f60597a = 1;
        this.f60598b = null;
        a(parcel);
    }

    /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f60597a = 1;
        this.f60598b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i10) {
        this.header = null;
        this.f60598b = null;
        this.URI = str;
        this.f60597a = i10;
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    private void a(Parcel parcel) {
        this.f60597a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.f60598b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer addBody(Bundle bundle) {
        this.f60598b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f60598b;
    }

    public int getBodySize() {
        return this.f60598b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f60597a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f60597a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.f60598b);
    }
}
