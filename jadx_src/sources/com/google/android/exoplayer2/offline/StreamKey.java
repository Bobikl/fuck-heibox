package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public final int f47149e;

    public class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f47146b = i10;
        this.f47147c = i11;
        this.f47148d = i12;
        this.f47149e = i12;
    }

    StreamKey(Parcel parcel) {
        this.f47146b = parcel.readInt();
        this.f47147c = parcel.readInt();
        int i10 = parcel.readInt();
        this.f47148d = i10;
        this.f47149e = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f47146b - streamKey.f47146b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f47147c - streamKey.f47147c;
        return i11 == 0 ? this.f47148d - streamKey.f47148d : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f47146b == streamKey.f47146b && this.f47147c == streamKey.f47147c && this.f47148d == streamKey.f47148d;
    }

    public int hashCode() {
        return (((this.f47146b * 31) + this.f47147c) * 31) + this.f47148d;
    }

    public String toString() {
        int i10 = this.f47146b;
        int i11 = this.f47147c;
        int i12 = this.f47148d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        sb2.append(".");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47146b);
        parcel.writeInt(this.f47147c);
        parcel.writeInt(this.f47148d);
    }
}
