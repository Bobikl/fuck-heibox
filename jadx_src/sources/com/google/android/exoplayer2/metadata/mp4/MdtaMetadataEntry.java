package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46952f = "com.android.capture.fps";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46956e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f46953b = (String) u0.k(parcel.readString());
        this.f46954c = (byte[]) u0.k(parcel.createByteArray());
        this.f46955d = parcel.readInt();
        this.f46956e = parcel.readInt();
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f46953b = str;
        this.f46954c = bArr;
        this.f46955d = i10;
        this.f46956e = i11;
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f46953b.equals(mdtaMetadataEntry.f46953b) && Arrays.equals(this.f46954c, mdtaMetadataEntry.f46954c) && this.f46955d == mdtaMetadataEntry.f46955d && this.f46956e == mdtaMetadataEntry.f46956e;
    }

    public int hashCode() {
        return ((((((c.b.f30674h7 + this.f46953b.hashCode()) * 31) + Arrays.hashCode(this.f46954c)) * 31) + this.f46955d) * 31) + this.f46956e;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f46953b);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46953b);
        parcel.writeByteArray(this.f46954c);
        parcel.writeInt(this.f46955d);
        parcel.writeInt(this.f46956e);
    }
}
