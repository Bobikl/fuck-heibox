package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f46878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f46879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f46880d;

    public class a implements Parcelable.Creator<IcyInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    IcyInfo(Parcel parcel) {
        this.f46878b = (byte[]) com.google.android.exoplayer2.util.a.g(parcel.createByteArray());
        this.f46879c = parcel.readString();
        this.f46880d = parcel.readString();
    }

    public IcyInfo(byte[] bArr, @p0 String str, @p0 String str2) {
        this.f46878b = bArr;
        this.f46879c = str;
        this.f46880d = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ a2 J0() {
        return com.google.android.exoplayer2.metadata.a.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46878b, ((IcyInfo) obj).f46878b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f46878b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void m(m2.b bVar) {
        String str = this.f46879c;
        if (str != null) {
            bVar.j0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f46879c, this.f46880d, Integer.valueOf(this.f46878b.length));
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f46878b);
        parcel.writeString(this.f46879c);
        parcel.writeString(this.f46880d);
    }
}
